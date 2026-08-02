package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.dzr0;

/* compiled from: SubscriptionProposalHolder.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder$2", f = "SubscriptionProposalHolder.kt", l = {TsExtractor.TS_STREAM_TYPE_DVBSUBS}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class ozm0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ szm0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ozm0(szm0 szm0Var, spj<? super ozm0> spjVar) {
        super(2, spjVar);
        this.this$0 = szm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ozm0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ozm0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.this$0.d.b()) {
                vyr0 vyr0Var = this.this$0.b;
                this.label = 1;
                b = vyr0Var.b(this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        b = ((Result) obj).d();
        szm0 szm0Var = this.this$0;
        if (!(b instanceof Result.Failure)) {
            dzr0 dzr0Var = (dzr0) b;
            if (epx.f(dzr0Var, dzr0.a.a)) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{"SUBSCRIPTION_PROPOSAL_HOLDER", "Subscription state is: VideoAdFreeSubscriptionState.NotAvailable"});
                }
            } else if (dzr0Var instanceof dzr0.c) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.d, new Object[]{"SUBSCRIPTION_PROPOSAL_HOLDER", "Subscription state is: VideoAdFreeSubscriptionState.Subscribed"});
                }
            } else {
                if (!(dzr0Var instanceof dzr0.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.d, new Object[]{"SUBSCRIPTION_PROPOSAL_HOLDER", "Subscription state is: VideoAdFreeSubscriptionState.NotSubscribed"});
                }
                szm0Var.j = ((dzr0.b) dzr0Var).c;
            }
        }
        Throwable a = Result.a(b);
        if (a != null) {
            L l4 = L.a;
            l4.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l4, L.LogType.d, new Object[]{"SUBSCRIPTION_PROPOSAL_HOLDER", ms9.b("Failure getting subscription state: ", a)});
            }
        }
        return s3q0.a;
    }
}
