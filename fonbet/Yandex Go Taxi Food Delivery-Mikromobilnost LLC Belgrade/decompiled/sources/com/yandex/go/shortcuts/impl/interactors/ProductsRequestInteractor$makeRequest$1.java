package com.yandex.go.shortcuts.impl.interactors;

import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.request.ProductsParamsState;
import defpackage.kaf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pf10;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "T", ClidProvider.STATE, "Lcom/yandex/go/shortcuts/dto/request/ProductsParamsState;"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.shortcuts.impl.interactors.ProductsRequestInteractor$makeRequest$1", f = "ProductsRequestInteractor.kt", l = {48}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ProductsRequestInteractor$makeRequest$1 extends SuspendLambda implements wls {
    final /* synthetic */ kaf0 $dataSource;
    final /* synthetic */ pf10 $mediaSizeInfo;
    final /* synthetic */ ProductsParam.Shortcuts $shortcuts;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductsRequestInteractor$makeRequest$1(kaf0 kaf0Var, ProductsParam.Shortcuts shortcuts, pf10 pf10Var, Continuation continuation) {
        super(2, continuation);
        this.$dataSource = kaf0Var;
        this.$shortcuts = shortcuts;
        this.$mediaSizeInfo = pf10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ProductsRequestInteractor$makeRequest$1 productsRequestInteractor$makeRequest$1 = new ProductsRequestInteractor$makeRequest$1(this.$dataSource, this.$shortcuts, this.$mediaSizeInfo, continuation);
        productsRequestInteractor$makeRequest$1.L$0 = obj;
        return productsRequestInteractor$makeRequest$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductsRequestInteractor$makeRequest$1) create((ProductsParamsState) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProductsParamsState productsParamsState = (ProductsParamsState) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        kaf0 kaf0Var = this.$dataSource;
        ProductsParam.Shortcuts shortcuts = this.$shortcuts;
        pf10 pf10Var = this.$mediaSizeInfo;
        this.L$0 = null;
        this.label = 1;
        Object a = kaf0Var.a(shortcuts, pf10Var, productsParamsState, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
