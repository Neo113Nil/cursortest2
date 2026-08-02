package com.yandex.go.delivery.deeplink;

import android.net.Uri;
import defpackage.cki;
import defpackage.dki;
import defpackage.fx60;
import defpackage.g8e;
import defpackage.h3y;
import defpackage.jst;
import defpackage.ny61;
import defpackage.oei;
import defpackage.oep0;
import defpackage.v770;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;
import ru.yandex.taxi.logistics.ndd_map.domain.c;

/* loaded from: classes.dex */
public final class b extends dki {
    public final fx60 b;
    public final h3y c;
    public final c d;

    public b(fx60 fx60Var, h3y h3yVar, c cVar) {
        this.b = fx60Var;
        this.c = h3yVar;
        this.d = cVar;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final boolean b() {
        return false;
    }

    @Override // com.yandex.go.deeplinks.typed.a
    public final /* bridge */ /* synthetic */ Object c(oep0 oep0Var, Object obj, v770 v770Var, DeeplinkSource deeplinkSource, Continuation continuation) {
        return d(oep0Var, (cki) obj, (ContinuationImpl) continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007b, code lost:
    
        if (r10 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(oep0 oep0Var, cki ckiVar, ContinuationImpl continuationImpl) {
        DeliveryPointDeeplinkHandler$handleDeeplink$1 deliveryPointDeeplinkHandler$handleDeeplink$1;
        Object obj;
        int i;
        Uri a;
        oep0 oep0Var2;
        Uri uri;
        DeliveryPvzExperiment deliveryPvzExperiment;
        if (continuationImpl instanceof DeliveryPointDeeplinkHandler$handleDeeplink$1) {
            deliveryPointDeeplinkHandler$handleDeeplink$1 = (DeliveryPointDeeplinkHandler$handleDeeplink$1) continuationImpl;
            int i2 = deliveryPointDeeplinkHandler$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deliveryPointDeeplinkHandler$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                obj = deliveryPointDeeplinkHandler$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deliveryPointDeeplinkHandler$handleDeeplink$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = ckiVar.a();
                    Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DEEPLINK;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.label = 1;
                    obj = this.b.c(events$Zalogin$LoginContext, deliveryPointDeeplinkHandler$handleDeeplink$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uri = (Uri) deliveryPointDeeplinkHandler$handleDeeplink$1.L$4;
                        oep0Var2 = (oep0) deliveryPointDeeplinkHandler$handleDeeplink$1.L$0;
                        kotlin.b.b(obj);
                        deliveryPvzExperiment = (DeliveryPvzExperiment) obj;
                        if (deliveryPvzExperiment != null) {
                            g8e.C("Cannot get Ndd pvz experiment", jst.e);
                        } else {
                            ((oei) this.c.get()).a(oep0Var2, uri, (String) kotlin.collections.a.R(deliveryPvzExperiment.d));
                        }
                        return zy11.a;
                    }
                    Uri uri2 = (Uri) deliveryPointDeeplinkHandler$handleDeeplink$1.L$4;
                    oep0 oep0Var3 = (oep0) deliveryPointDeeplinkHandler$handleDeeplink$1.L$0;
                    kotlin.b.b(obj);
                    a = uri2;
                    oep0Var = oep0Var3;
                }
                if (((Boolean) obj).booleanValue()) {
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$0 = oep0Var;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$1 = null;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$2 = null;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$3 = null;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.L$4 = a;
                    deliveryPointDeeplinkHandler$handleDeeplink$1.label = 2;
                    obj = this.d.a(deliveryPointDeeplinkHandler$handleDeeplink$1);
                    if (obj != coroutineSingletons) {
                        Uri uri3 = a;
                        oep0Var2 = oep0Var;
                        uri = uri3;
                        deliveryPvzExperiment = (DeliveryPvzExperiment) obj;
                        if (deliveryPvzExperiment != null) {
                        }
                    }
                    return coroutineSingletons;
                }
                return zy11.a;
            }
        }
        deliveryPointDeeplinkHandler$handleDeeplink$1 = new DeliveryPointDeeplinkHandler$handleDeeplink$1(this, continuationImpl);
        obj = deliveryPointDeeplinkHandler$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deliveryPointDeeplinkHandler$handleDeeplink$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }
}
