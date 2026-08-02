package xsna;

import com.vk.ecomm.product_list.router.ProductListInternalParams;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProductListMviTaskExecutor.kt */
@b6l(c = "com.vk.ecomm.product_list.presentation.ProductListMviTaskExecutor$trackProductView$1", f = "ProductListMviTaskExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes18.dex */
public final class hqd0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $fullId;
    int label;
    final /* synthetic */ com.vk.ecomm.product_list.presentation.o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hqd0(com.vk.ecomm.product_list.presentation.o oVar, String str, spj<? super hqd0> spjVar) {
        super(2, spjVar);
        this.this$0 = oVar;
        this.$fullId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new hqd0(this.this$0, this.$fullId, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((hqd0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        List<vpd0> list = ((aqd0) this.this$0.b.getCurrentState()).e;
        String str = this.$fullId;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (epx.f(((vpd0) obj2).s, str)) {
                break;
            }
        }
        vpd0 vpd0Var = (vpd0) obj2;
        if (vpd0Var != null) {
            com.vk.ecomm.product_list.presentation.o oVar = this.this$0;
            rpd0 rpd0Var = oVar.j;
            ProductListInternalParams productListInternalParams = ((aqd0) oVar.b.getCurrentState()).b;
            rpd0Var.getClass();
            mt00.d(Long.valueOf(vpd0Var.a), Long.valueOf(vpd0Var.b.b), null, productListInternalParams.e, null, null, null, vpd0Var.q, productListInternalParams.g, productListInternalParams.h, productListInternalParams.f, null, null, null, 28916);
        }
        return s3q0.a;
    }
}
