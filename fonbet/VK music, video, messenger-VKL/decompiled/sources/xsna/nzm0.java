package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SubscriptionProposalHolder.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.player.views.SubscriptionProposalHolder$1", f = "SubscriptionProposalHolder.kt", l = {82}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class nzm0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ szm0 this$0;

    /* compiled from: SubscriptionProposalHolder.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ szm0 b;

        public a(szm0 szm0Var) {
            this.b = szm0Var;
        }

        @Override // xsna.lsr
        public final Object emit(Object obj, spj spjVar) {
            tlg0 tlg0Var = (tlg0) obj;
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.d, new Object[]{"SUBSCRIPTION_PROPOSAL_HOLDER", "New current room: " + tlg0Var});
            }
            if (tlg0Var != null) {
                szm0 szm0Var = this.b;
                szm0Var.getClass();
                myc0.h(szm0Var.i, null, null, new qzm0(tlg0Var, szm0Var, null), 3);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nzm0(szm0 szm0Var, spj<? super nzm0> spjVar) {
        super(2, spjVar);
        this.this$0 = szm0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nzm0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nzm0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            utk0 a2 = this.this$0.e.a();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (a2.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        throw new KotlinNothingValueException();
    }
}
