package com.yandex.go.delivery.deeplink;

import android.net.Uri;
import defpackage.cxq0;
import defpackage.fx60;
import defpackage.g8e;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jst;
import defpackage.m5u;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.oei;
import defpackage.oep0;
import defpackage.vu2;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;
import ru.yandex.taxi.logistics.ndd_map.domain.c;

/* loaded from: classes.dex */
public final class a implements vu2 {
    public final cxq0 a;
    public final h3y b;
    public final fx60 c;
    public final c d;

    public a(cxq0 cxq0Var, h3y h3yVar, fx60 fx60Var, c cVar) {
        this.a = cxq0Var;
        this.b = h3yVar;
        this.c = fx60Var;
        this.d = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Uri uri, ContinuationImpl continuationImpl) {
        DeliveryNddMapAppLinkHandler$openNddMapFragment$1 deliveryNddMapAppLinkHandler$openNddMapFragment$1;
        Object obj;
        int i;
        oep0 oep0Var2;
        Uri uri2;
        DeliveryPvzExperiment deliveryPvzExperiment;
        if (continuationImpl instanceof DeliveryNddMapAppLinkHandler$openNddMapFragment$1) {
            deliveryNddMapAppLinkHandler$openNddMapFragment$1 = (DeliveryNddMapAppLinkHandler$openNddMapFragment$1) continuationImpl;
            int i2 = deliveryNddMapAppLinkHandler$openNddMapFragment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryNddMapAppLinkHandler$openNddMapFragment$1.label = i2 - Integer.MIN_VALUE;
                obj = deliveryNddMapAppLinkHandler$openNddMapFragment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryNddMapAppLinkHandler$openNddMapFragment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$0 = oep0Var;
                    deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$1 = uri;
                    deliveryNddMapAppLinkHandler$openNddMapFragment$1.label = 1;
                    obj = this.c.c(events$Zalogin$LoginContext, deliveryNddMapAppLinkHandler$openNddMapFragment$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uri2 = (Uri) deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$1;
                        oep0Var2 = (oep0) deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$0;
                        kotlin.b.b(obj);
                        deliveryPvzExperiment = (DeliveryPvzExperiment) obj;
                        if (deliveryPvzExperiment != null) {
                            g8e.C("Cannot get Ndd pvz experiment", jst.e);
                        } else {
                            ((oei) this.b.get()).a(oep0Var2, uri2, (String) kotlin.collections.a.R(deliveryPvzExperiment.d));
                        }
                        return zy11.a;
                    }
                    uri = (Uri) deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$1;
                    oep0Var = (oep0) deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$0 = oep0Var;
                    deliveryNddMapAppLinkHandler$openNddMapFragment$1.L$1 = uri;
                    deliveryNddMapAppLinkHandler$openNddMapFragment$1.label = 2;
                    obj = this.d.a(deliveryNddMapAppLinkHandler$openNddMapFragment$1);
                    if (obj != coroutineSingletons) {
                        Uri uri3 = uri;
                        oep0Var2 = oep0Var;
                        uri2 = uri3;
                        deliveryPvzExperiment = (DeliveryPvzExperiment) obj;
                        if (deliveryPvzExperiment != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
        }
        deliveryNddMapAppLinkHandler$openNddMapFragment$1 = new DeliveryNddMapAppLinkHandler$openNddMapFragment$1(this, continuationImpl);
        obj = deliveryNddMapAppLinkHandler$openNddMapFragment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryNddMapAppLinkHandler$openNddMapFragment$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vu2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(oep0 oep0Var, Uri uri, Continuation continuation) {
        DeliveryNddMapAppLinkHandler$process$1 deliveryNddMapAppLinkHandler$process$1;
        int i;
        if (continuation instanceof DeliveryNddMapAppLinkHandler$process$1) {
            deliveryNddMapAppLinkHandler$process$1 = (DeliveryNddMapAppLinkHandler$process$1) continuation;
            int i2 = deliveryNddMapAppLinkHandler$process$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryNddMapAppLinkHandler$process$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deliveryNddMapAppLinkHandler$process$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryNddMapAppLinkHandler$process$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cxq0 cxq0Var = this.a;
                    cxq0Var.getClass();
                    if (!jl40.l(uri.getScheme(), (String) ((i3y) cxq0Var.c).getValue()) || !jl40.l(uri.getHost(), (String) ((i3y) cxq0Var.w).getValue()) || !jl40.l(uri.getPath(), (String) ((i3y) cxq0Var.x).getValue())) {
                        return n5u.a;
                    }
                    deliveryNddMapAppLinkHandler$process$1.L$0 = null;
                    deliveryNddMapAppLinkHandler$process$1.L$1 = null;
                    deliveryNddMapAppLinkHandler$process$1.label = 1;
                    if (a(oep0Var, uri, deliveryNddMapAppLinkHandler$process$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return new m5u(false, false);
            }
        }
        deliveryNddMapAppLinkHandler$process$1 = new DeliveryNddMapAppLinkHandler$process$1(this, (ContinuationImpl) continuation);
        Object obj3 = deliveryNddMapAppLinkHandler$process$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryNddMapAppLinkHandler$process$1.label;
        if (i != 0) {
        }
        return new m5u(false, false);
    }
}
