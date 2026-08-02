package androidx.compose.foundation.lazy.grid;

import androidx.compose.ui.node.LayoutNode;
import defpackage.iip0;
import defpackage.l4y;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tdh;
import defpackage.wls;
import defpackage.xti0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liip0;", "Lzy11;", "<anonymous>", "(Liip0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.lazy.grid.LazyGridState$scrollToItem$2", f = "LazyGridState.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class LazyGridState$scrollToItem$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $index;
    final /* synthetic */ int $scrollOffset;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyGridState$scrollToItem$2(b bVar, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$index = i;
        this.$scrollOffset = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LazyGridState$scrollToItem$2(this.this$0, this.$index, this.$scrollOffset, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LazyGridState$scrollToItem$2 lazyGridState$scrollToItem$2 = (LazyGridState$scrollToItem$2) create((iip0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        lazyGridState$scrollToItem$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        b bVar = this.this$0;
        int i = this.$index;
        int i2 = this.$scrollOffset;
        l4y l4yVar = bVar.d;
        if (l4yVar.a.getIntValue() != i || l4yVar.b.getIntValue() != i2) {
            androidx.compose.foundation.lazy.layout.c cVar = bVar.m;
            cVar.e();
            cVar.b = null;
            cVar.c = -1;
            tdh tdhVar = bVar.a;
        }
        l4yVar.a(i, i2);
        l4yVar.d = null;
        xti0 xti0Var = bVar.j;
        if (xti0Var != null) {
            ((LayoutNode) xti0Var).h();
        }
        return zy11.a;
    }
}
