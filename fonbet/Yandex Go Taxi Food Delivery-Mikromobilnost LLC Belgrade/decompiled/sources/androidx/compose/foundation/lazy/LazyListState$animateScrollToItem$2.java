package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.f;
import defpackage.fwi;
import defpackage.iip0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s6y;
import defpackage.wls;
import defpackage.y6y;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liip0;", "Lzy11;", "<anonymous>", "(Liip0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.lazy.LazyListState$animateScrollToItem$2", f = "LazyListState.kt", l = {587}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class LazyListState$animateScrollToItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$animateScrollToItem$2(b bVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LazyListState$animateScrollToItem$2 lazyListState$animateScrollToItem$2 = new LazyListState$animateScrollToItem$2(this.this$0, this.$index, this.$scrollOffset, continuation);
        lazyListState$animateScrollToItem$2.L$0 = obj;
        return lazyListState$animateScrollToItem$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LazyListState$animateScrollToItem$2) create((iip0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            iip0 iip0Var = (iip0) this.L$0;
            b bVar = this.this$0;
            y6y y6yVar = new y6y(iip0Var, bVar, 0);
            int i2 = this.$index;
            int i3 = this.$scrollOffset;
            fwi fwiVar = ((s6y) bVar.f.getValue()).i;
            this.label = 1;
            if (f.a(y6yVar, i2, i3, 100, fwiVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
