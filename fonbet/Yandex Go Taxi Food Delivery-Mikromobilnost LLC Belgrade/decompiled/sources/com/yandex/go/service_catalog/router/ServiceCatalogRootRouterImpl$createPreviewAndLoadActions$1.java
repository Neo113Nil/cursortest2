package com.yandex.go.service_catalog.router;

import defpackage.aks0;
import defpackage.cnr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o6s0;
import defpackage.uwl;
import defpackage.vpr;
import defpackage.wls;
import defpackage.wuq0;
import defpackage.xzl;
import defpackage.ywl;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lkr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.service_catalog.router.ServiceCatalogRootRouterImpl$createPreviewAndLoadActions$1", f = "ServiceCatalogRootRouterImpl.kt", l = {HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY, HProv.PP_LCD_QUERY}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ServiceCatalogRootRouterImpl$createPreviewAndLoadActions$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServiceCatalogRootRouterImpl$createPreviewAndLoadActions$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ServiceCatalogRootRouterImpl$createPreviewAndLoadActions$1 serviceCatalogRootRouterImpl$createPreviewAndLoadActions$1 = new ServiceCatalogRootRouterImpl$createPreviewAndLoadActions$1(this.this$0, continuation);
        serviceCatalogRootRouterImpl$createPreviewAndLoadActions$1.L$0 = obj;
        return serviceCatalogRootRouterImpl$createPreviewAndLoadActions$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ServiceCatalogRootRouterImpl$createPreviewAndLoadActions$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
    
        if (r3 == r2) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r1.emit(r3, r20) == r2) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object Q;
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            o6s0 o6s0Var = new o6s0(new xzl(new ywl(new aks0("(theme bgMinor 0.0p (padded 120p 38p (col 100% (repeat 2 (col (row 100% sb (repeat 4 (bone 48p 48p 16p))) (space 36p))) (space 52p) (col 100% (row 100% sb (repeat 4 (bone 48p 48p 16p))) (space 36p) (row 100% sb (repeat 2 (bone 48p 48p 16p)) (space 48p) (space 48p)) (space 36p)) (space 52p) (row 100% sb (repeat 2 (bone 48p 48p 16p)) (space 48p) (space 48p)))))", null), wuq0.INSTANCE, cnr0.b, new uwl(null, null, null, null, null, null), null, null), null, null, 30));
            this.L$0 = vprVar;
            this.label = 1;
        } else if (i == 1) {
            kotlin.b.b(obj);
        } else {
            if (i != 2) {
                if (i == 3) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vprVar = (vpr) this.L$1;
            kotlin.b.b(obj);
            Q = obj;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 3;
        }
        b bVar = this.this$0;
        this.L$0 = null;
        this.L$1 = vprVar;
        this.label = 2;
        Q = b.Q(bVar, this);
    }
}
