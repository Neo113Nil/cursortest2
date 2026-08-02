package com.yandex.go.superapp.impl.interactor;

import defpackage.f0t;
import defpackage.gvq0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.p6j0;
import defpackage.po21;
import defpackage.xzs;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes14.dex */
public final class c {
    public final po21 a;
    public final ru.yandex.taxi.superapp.orders.a b;
    public final p6j0 c;

    public c(po21 po21Var, ru.yandex.taxi.superapp.orders.a aVar, p6j0 p6j0Var) {
        this.a = po21Var;
        this.b = aVar;
        this.c = p6j0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ServiceContextInteractorImpl$getServiceContext$1 serviceContextInteractorImpl$getServiceContext$1;
        int i;
        f0t f0tVar;
        if (continuationImpl instanceof ServiceContextInteractorImpl$getServiceContext$1) {
            serviceContextInteractorImpl$getServiceContext$1 = (ServiceContextInteractorImpl$getServiceContext$1) continuationImpl;
            int i2 = serviceContextInteractorImpl$getServiceContext$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serviceContextInteractorImpl$getServiceContext$1.label = i2 - Integer.MIN_VALUE;
                Object obj = serviceContextInteractorImpl$getServiceContext$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serviceContextInteractorImpl$getServiceContext$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    serviceContextInteractorImpl$getServiceContext$1.label = 1;
                    obj = this.c.a();
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    kotlin.b.b(obj);
                }
                f0tVar = (f0t) obj;
                if (f0tVar == null) {
                    f0tVar = new f0t(0.0d, 0.0d, "", "", "", "", "", "", "", "", null, null, null);
                }
                serviceContextInteractorImpl$getServiceContext$1.L$0 = null;
                serviceContextInteractorImpl$getServiceContext$1.label = 2;
                Object b = b(f0tVar, serviceContextInteractorImpl$getServiceContext$1);
                return b != obj2 ? obj2 : b;
            }
        }
        serviceContextInteractorImpl$getServiceContext$1 = new ServiceContextInteractorImpl$getServiceContext$1(this, continuationImpl);
        Object obj3 = serviceContextInteractorImpl$getServiceContext$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serviceContextInteractorImpl$getServiceContext$1.label;
        if (i != 0) {
        }
        f0tVar = (f0t) obj3;
        if (f0tVar == null) {
        }
        serviceContextInteractorImpl$getServiceContext$1.L$0 = null;
        serviceContextInteractorImpl$getServiceContext$1.label = 2;
        Object b2 = b(f0tVar, serviceContextInteractorImpl$getServiceContext$1);
        if (b2 != obj22) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(f0t f0tVar, ContinuationImpl continuationImpl) {
        ServiceContextInteractorImpl$getServiceContextInternal$1 serviceContextInteractorImpl$getServiceContextInternal$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        xzs xzsVar;
        if (continuationImpl instanceof ServiceContextInteractorImpl$getServiceContextInternal$1) {
            serviceContextInteractorImpl$getServiceContextInternal$1 = (ServiceContextInteractorImpl$getServiceContextInternal$1) continuationImpl;
            int i2 = serviceContextInteractorImpl$getServiceContextInternal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                serviceContextInteractorImpl$getServiceContextInternal$1.label = i2 - Integer.MIN_VALUE;
                obj = serviceContextInteractorImpl$getServiceContextInternal$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = serviceContextInteractorImpl$getServiceContextInternal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    serviceContextInteractorImpl$getServiceContextInternal$1.L$0 = f0tVar;
                    serviceContextInteractorImpl$getServiceContextInternal$1.label = 1;
                    obj = ((e) this.a).h(serviceContextInteractorImpl$getServiceContextInternal$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        xzsVar = (xzs) serviceContextInteractorImpl$getServiceContextInternal$1.L$2;
                        f0tVar = (f0t) serviceContextInteractorImpl$getServiceContextInternal$1.L$0;
                        kotlin.b.b(obj);
                        return new gvq0(f0tVar, xzsVar, (List) obj);
                    }
                    f0tVar = (f0t) serviceContextInteractorImpl$getServiceContextInternal$1.L$0;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                xzs xzsVar2 = new xzs(new Double(mo21Var.a), new Double(mo21Var.b), null, null, null);
                serviceContextInteractorImpl$getServiceContextInternal$1.L$0 = f0tVar;
                serviceContextInteractorImpl$getServiceContextInternal$1.L$1 = null;
                serviceContextInteractorImpl$getServiceContextInternal$1.L$2 = xzsVar2;
                serviceContextInteractorImpl$getServiceContextInternal$1.label = 2;
                obj = this.b.a(serviceContextInteractorImpl$getServiceContextInternal$1);
                if (obj != coroutineSingletons) {
                    xzsVar = xzsVar2;
                    return new gvq0(f0tVar, xzsVar, (List) obj);
                }
                return coroutineSingletons;
            }
        }
        serviceContextInteractorImpl$getServiceContextInternal$1 = new ServiceContextInteractorImpl$getServiceContextInternal$1(this, continuationImpl);
        obj = serviceContextInteractorImpl$getServiceContextInternal$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = serviceContextInteractorImpl$getServiceContextInternal$1.label;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj;
        xzs xzsVar22 = new xzs(new Double(mo21Var2.a), new Double(mo21Var2.b), null, null, null);
        serviceContextInteractorImpl$getServiceContextInternal$1.L$0 = f0tVar;
        serviceContextInteractorImpl$getServiceContextInternal$1.L$1 = null;
        serviceContextInteractorImpl$getServiceContextInternal$1.L$2 = xzsVar22;
        serviceContextInteractorImpl$getServiceContextInternal$1.label = 2;
        obj = this.b.a(serviceContextInteractorImpl$getServiceContextInternal$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
