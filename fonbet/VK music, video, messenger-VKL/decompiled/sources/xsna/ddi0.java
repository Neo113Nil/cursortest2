package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: SelectionGestures.kt */
@b6l(c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$touchSelectionSubsequentPress$downResolution$1", f = "SelectionGestures.kt", l = {195}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ddi0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super m7o>, Object> {
    final /* synthetic */ Ref$LongRef $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddi0(long j, Ref$LongRef ref$LongRef, spj<? super ddi0> spjVar) {
        super(2, spjVar);
        this.$pointerId = j;
        this.$overSlop = ref$LongRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ddi0 ddi0Var = new ddi0(this.$pointerId, this.$overSlop, spjVar);
        ddi0Var.L$0 = obj;
        return ddi0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super m7o> spjVar) {
        return ((ddi0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            eu5 eu5Var2 = (eu5) this.L$0;
            long j = this.$pointerId;
            oa5 oa5Var = new oa5(this.$overSlop, 10);
            this.L$0 = eu5Var2;
            this.label = 1;
            Object e = lgo.e(eu5Var2, j, oa5Var, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
            eu5Var = eu5Var2;
            obj = e;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eu5Var = (eu5) this.L$0;
            kotlin.a.a(obj);
        }
        if (((xlb0) obj) != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return m7o.Drag;
        }
        xlb0 xlb0Var = (xlb0) j5g.Y(eu5Var.z0().a);
        if (!fdi.o(xlb0Var)) {
            return m7o.Cancel;
        }
        xlb0Var.a();
        return m7o.Up;
    }
}
