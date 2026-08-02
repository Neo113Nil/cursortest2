package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StorefrontServicesActor.kt */
@b6l(c = "com.vk.ecomm.storefrontservices.impl.presentation.feature.StorefrontServicesActor$openFilters$2", f = "StorefrontServicesActor.kt", l = {258}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class fnl0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ bnl0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fnl0(bnl0 bnl0Var, spj<? super fnl0> spjVar) {
        super(2, spjVar);
        this.this$0 = bnl0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fnl0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fnl0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            if (((mol0) this.this$0.b.getCurrentState()).g.g == null) {
                dol0 dol0Var = this.this$0.d;
                this.label = 1;
                i = dol0Var.i(this);
                if (i == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        i = ((Result) obj).d();
        if (i instanceof Result.Failure) {
            i = null;
        }
        rdi.y(this.this$0, new b0e((String) i, 2));
        return s3q0.a;
    }
}
