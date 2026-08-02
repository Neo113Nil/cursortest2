package xsna;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ProductListRepositoryImpl.kt */
@b6l(c = "com.vk.ecomm.product_list.data.ProductListRepositoryImpl", f = "ProductListRepositoryImpl.kt", l = {16}, m = "getProducts")
/* loaded from: classes18.dex */
public final class iqd0 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ jqd0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqd0(jqd0 jqd0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = jqd0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
