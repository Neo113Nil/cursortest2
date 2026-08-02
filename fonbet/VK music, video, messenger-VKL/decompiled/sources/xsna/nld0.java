package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProductCardMainInfoHolder.kt */
@b6l(c = "com.vk.ecomm.market.good.good2.presentation.maininfo.ProductCardMainInfoHolder$onBind$1$2$1", f = "ProductCardMainInfoHolder.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class nld0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ old0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nld0(old0 old0Var, spj<? super nld0> spjVar) {
        super(2, spjVar);
        this.this$0 = old0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nld0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((nld0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        old0 old0Var = this.this$0;
        mzp0 mzp0Var = (mzp0) old0Var.n;
        if (mzp0Var != null) {
            mzp0Var.d(old0Var.itemView);
        }
        yw90 yw90Var = (yw90) this.this$0.o;
        if (yw90Var != null) {
            yw90Var.a();
        }
        return s3q0.a;
    }
}
