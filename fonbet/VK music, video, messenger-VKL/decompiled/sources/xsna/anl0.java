package xsna;

import com.vk.dto.fave.MarketFavable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.wml0;

/* compiled from: StorefrontServicesActor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$handleFaveClick$1", f = "StorefrontServicesActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class anl0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ wml0.a.f $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bnl0 this$0;

    /* compiled from: StorefrontServicesActor.kt */
    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$handleFaveClick$1$1", f = "StorefrontServicesActor.kt", l = {290}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ wml0.a.f $action;
        Object L$0;
        int label;
        final /* synthetic */ bnl0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bnl0 bnl0Var, wml0.a.f fVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = bnl0Var;
            this.$action = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, this.$action, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object n;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                uoi0 c = ((mol0) this.this$0.b.getCurrentState()).c(this.$action.b);
                if (c == null) {
                    return s3q0.a;
                }
                bnl0 bnl0Var = this.this$0;
                long j = this.$action.b;
                bnl0Var.getClass();
                rdi.y(bnl0Var, new vib(j, (Boolean) null));
                pnl0 pnl0Var = (pnl0) this.this$0.e.f.getValue();
                this.L$0 = null;
                this.label = 1;
                pnl0Var.getClass();
                lq9 lq9Var = new lq9(1, s7s0.c(this));
                lq9Var.o();
                isq.b(pnl0Var.b, pnl0Var.a, new MarketFavable(c.i, c.p, null, true, c.o), new nnl0(lq9Var), null, new onl0(lq9Var, 0), false, null, null, 488);
                n = lq9Var.n();
                if (n == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                n = obj;
            }
            if (!((Boolean) n).booleanValue()) {
                bnl0 bnl0Var2 = this.this$0;
                long j2 = this.$action.b;
                bnl0Var2.getClass();
                rdi.y(bnl0Var2, new vib(j2, (Boolean) null));
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anl0(bnl0 bnl0Var, wml0.a.f fVar, spj<? super anl0> spjVar) {
        super(2, spjVar);
        this.this$0 = bnl0Var;
        this.$action = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        anl0 anl0Var = new anl0(this.this$0, this.$action, spjVar);
        anl0Var.L$0 = obj;
        return anl0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((anl0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(yvjVar, null, null, new a(this.this$0, this.$action, null), 3);
        return s3q0.a;
    }
}
