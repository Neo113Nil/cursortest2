package com.yandex.go.service_catalog.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.puq0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.service_catalog.router.ServiceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1", f = "ServiceCatalogRootRouterImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ServiceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;
    final /* synthetic */ b this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1(a aVar, b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.this$1 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ServiceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1(this.this$0, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ServiceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1 serviceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1 = (ServiceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        serviceCatalogRootRouterImpl$InnerErrorNavigator$onReloadClicked$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        n0 n0Var = this.this$0.a;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        puq0 puq0Var = this.this$1.K;
        puq0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("endpoint", "bdui/v1/superapp/service-catalog");
        puq0Var.a.a("ServiceCatalog.LoadingStarted", hashMap, 1, new HashMap());
        return zy11Var;
    }
}
