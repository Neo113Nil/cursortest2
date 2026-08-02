package kotlinx.coroutines.flow;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import xsna.b6l;
import xsna.iyx;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;
import xsna.yzs;

/* compiled from: Limit.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class FlowKt__LimitKt$transformWhile$1 extends SuspendLambda implements wzs<lsr<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr<Object> $this_transformWhile;
    final /* synthetic */ yzs<lsr<Object>, Object, spj<? super Boolean>, Object> $transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$transformWhile$1(ksr<Object> ksrVar, yzs<? super lsr<Object>, Object, ? super spj<? super Boolean>, ? extends Object> yzsVar, spj<? super FlowKt__LimitKt$transformWhile$1> spjVar) {
        super(2, spjVar);
        this.$this_transformWhile = ksrVar;
        this.$transform = yzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        FlowKt__LimitKt$transformWhile$1 flowKt__LimitKt$transformWhile$1 = new FlowKt__LimitKt$transformWhile$1(this.$this_transformWhile, this.$transform, spjVar);
        flowKt__LimitKt$transformWhile$1.L$0 = obj;
        return flowKt__LimitKt$transformWhile$1;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<Object> lsrVar, spj<? super s3q0> spjVar) {
        return ((FlowKt__LimitKt$transformWhile$1) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            a.a(obj);
            lsr lsrVar = (lsr) this.L$0;
            ksr<Object> ksrVar = this.$this_transformWhile;
            FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12 = new FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(this.$transform, lsrVar);
            try {
                this.L$0 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                this.label = 1;
                if (ksrVar.collect(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$12;
                if (e.b == flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) {
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) this.L$0;
            try {
                a.a(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                if (e.b == flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) {
                    throw e;
                }
                iyx.e(getContext());
                return s3q0.a;
            }
        }
        return s3q0.a;
    }
}
