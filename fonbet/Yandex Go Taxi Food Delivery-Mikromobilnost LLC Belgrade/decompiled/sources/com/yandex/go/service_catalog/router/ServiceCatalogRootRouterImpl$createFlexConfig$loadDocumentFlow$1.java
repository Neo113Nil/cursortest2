package com.yandex.go.service_catalog.router;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6s0;
import defpackage.vpr;
import defpackage.wls;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.service_catalog.router.ServiceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1", f = "ServiceCatalogRootRouterImpl.kt", l = {HProv.PP_HASHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ServiceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ ywl $document;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1(ywl ywlVar, Continuation continuation) {
        super(2, continuation);
        this.$document = ywlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1 serviceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1 = new ServiceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1(this.$document, continuation);
        serviceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1.L$0 = obj;
        return serviceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceCatalogRootRouterImpl$createFlexConfig$loadDocumentFlow$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o6s0 o6s0Var = new o6s0(new xzl(this.$document, null, null, 30));
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(o6s0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
