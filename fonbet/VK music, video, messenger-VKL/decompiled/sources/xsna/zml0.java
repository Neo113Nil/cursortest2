package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.lnl0;

/* compiled from: StorefrontServicesActor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$executeSearch$1", f = "StorefrontServicesActor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class zml0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ bnl0 this$0;

    /* compiled from: StorefrontServicesActor.kt */
    @b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$executeSearch$1$1", f = "StorefrontServicesActor.kt", l = {176}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ bnl0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(bnl0 bnl0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.this$0 = bnl0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ggr ggrVar = ((mol0) this.this$0.b.getCurrentState()).g;
                if (!ggrVar.b()) {
                    rdi.y(this.this$0, new tdk0(1));
                    return s3q0.a;
                }
                bnl0 bnl0Var = this.this$0;
                this.L$0 = null;
                this.label = 1;
                obj = bnl0.q(bnl0Var, ggrVar, 0, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            wyh0 wyh0Var = (wyh0) obj;
            if (wyh0Var != null) {
                rdi.y(this.this$0, new u2k0(wyh0Var, 4));
                this.this$0.c(lnl0.b.a.C3279a.a);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zml0(bnl0 bnl0Var, spj<? super zml0> spjVar) {
        super(2, spjVar);
        this.this$0 = bnl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        zml0 zml0Var = new zml0(this.this$0, spjVar);
        zml0Var.L$0 = obj;
        return zml0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zml0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        myc0.h(yvjVar, null, null, new a(this.this$0, null), 3);
        return s3q0.a;
    }
}
