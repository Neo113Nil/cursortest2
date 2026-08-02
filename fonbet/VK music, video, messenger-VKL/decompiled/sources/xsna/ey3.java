package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@b6l(c = "androidx.compose.ui.text.font.AsyncFontListLoader$load$2$typeface$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {282}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ey3 extends SuspendLambda implements izs<spj<? super Object>, Object> {
    final /* synthetic */ n4s $font;
    int label;
    final /* synthetic */ hy3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey3(hy3 hy3Var, n4s n4sVar, spj<? super ey3> spjVar) {
        super(1, spjVar);
        this.this$0 = hy3Var;
        this.$font = n4sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(spj<?> spjVar) {
        return new ey3(this.this$0, this.$font, spjVar);
    }

    @Override // xsna.izs
    public final Object invoke(spj<? super Object> spjVar) {
        return ((ey3) create(spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        hy3 hy3Var = this.this$0;
        n4s n4sVar = this.$font;
        this.label = 1;
        Object h = hy3Var.h(n4sVar, this);
        return h == coroutineSingletons ? coroutineSingletons : h;
    }
}
