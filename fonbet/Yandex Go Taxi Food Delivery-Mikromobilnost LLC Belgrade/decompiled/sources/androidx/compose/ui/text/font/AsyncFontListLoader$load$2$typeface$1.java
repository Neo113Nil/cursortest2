package androidx.compose.ui.text.font;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.yxr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AsyncFontListLoader$load$2$typeface$1 extends SuspendLambda implements tls {
    final /* synthetic */ yxr $font;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFontListLoader$load$2$typeface$1(b bVar, yxr yxrVar, Continuation continuation) {
        super(1, continuation);
        this.this$0 = bVar;
        this.$font = yxrVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new AsyncFontListLoader$load$2$typeface$1(this.this$0, this.$font, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((AsyncFontListLoader$load$2$typeface$1) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        yxr yxrVar = this.$font;
        this.label = 1;
        Object b = bVar.b(yxrVar, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
