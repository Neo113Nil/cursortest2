package com.yandex.go.scooters.subscription.pci_dss.data;

import com.yandex.go.scooters.subscription.api.ScootersSubscriptionEntryPoint;
import com.yandex.go.scooters.subscription.pci_dss.data.model.SubscriptionUrlResponse;
import defpackage.cmt;
import defpackage.ny61;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a {
    public final ScootersSubscriptionUrlApi a;
    public final ru.yandex.taxi.scooters.data.a b;

    public a(ScootersSubscriptionUrlApi scootersSubscriptionUrlApi, ru.yandex.taxi.scooters.data.a aVar) {
        this.a = scootersSubscriptionUrlApi;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a5, code lost:
    
        if (r1 != r3) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, boolean z, ScootersSubscriptionEntryPoint scootersSubscriptionEntryPoint, ContinuationImpl continuationImpl) {
        ScootersSubscriptionUrlRepository$getSubscriptionUrl$1 scootersSubscriptionUrlRepository$getSubscriptionUrl$1;
        int i;
        String str3;
        String str4;
        ScootersSubscriptionEntryPoint scootersSubscriptionEntryPoint2;
        boolean z2;
        ScootersSubscriptionUrlApi scootersSubscriptionUrlApi;
        if (continuationImpl instanceof ScootersSubscriptionUrlRepository$getSubscriptionUrl$1) {
            scootersSubscriptionUrlRepository$getSubscriptionUrl$1 = (ScootersSubscriptionUrlRepository$getSubscriptionUrl$1) continuationImpl;
            int i2 = scootersSubscriptionUrlRepository$getSubscriptionUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersSubscriptionUrlRepository$getSubscriptionUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersSubscriptionUrlRepository$getSubscriptionUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersSubscriptionUrlRepository$getSubscriptionUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$0 = str;
                    scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$1 = str2;
                    scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$2 = scootersSubscriptionEntryPoint;
                    ScootersSubscriptionUrlApi scootersSubscriptionUrlApi2 = this.a;
                    scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$3 = scootersSubscriptionUrlApi2;
                    scootersSubscriptionUrlRepository$getSubscriptionUrl$1.Z$0 = z;
                    scootersSubscriptionUrlRepository$getSubscriptionUrl$1.label = 1;
                    Object a = this.b.a(false, scootersSubscriptionUrlRepository$getSubscriptionUrl$1);
                    if (a != coroutineSingletons) {
                        str3 = str;
                        str4 = str2;
                        scootersSubscriptionEntryPoint2 = scootersSubscriptionEntryPoint;
                        obj = a;
                        z2 = z;
                        scootersSubscriptionUrlApi = scootersSubscriptionUrlApi2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return ((SubscriptionUrlResponse) obj).a;
                }
                z2 = scootersSubscriptionUrlRepository$getSubscriptionUrl$1.Z$0;
                ScootersSubscriptionUrlApi scootersSubscriptionUrlApi3 = (ScootersSubscriptionUrlApi) scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$3;
                scootersSubscriptionEntryPoint2 = (ScootersSubscriptionEntryPoint) scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$2;
                String str5 = (String) scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$1;
                String str6 = (String) scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$0;
                b.b(obj);
                scootersSubscriptionUrlApi = scootersSubscriptionUrlApi3;
                str4 = str5;
                str3 = str6;
                cmt<SubscriptionUrlResponse> a2 = scootersSubscriptionUrlApi.a((Map) obj, str3, str4, Boolean.valueOf(z2), scootersSubscriptionEntryPoint2.getValue(), "scooters");
                scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$0 = null;
                scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$1 = null;
                scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$2 = null;
                scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$3 = null;
                scootersSubscriptionUrlRepository$getSubscriptionUrl$1.Z$0 = z2;
                scootersSubscriptionUrlRepository$getSubscriptionUrl$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(a2, null, scootersSubscriptionUrlRepository$getSubscriptionUrl$1);
            }
        }
        scootersSubscriptionUrlRepository$getSubscriptionUrl$1 = new ScootersSubscriptionUrlRepository$getSubscriptionUrl$1(this, continuationImpl);
        Object obj2 = scootersSubscriptionUrlRepository$getSubscriptionUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersSubscriptionUrlRepository$getSubscriptionUrl$1.label;
        if (i != 0) {
        }
        cmt<SubscriptionUrlResponse> a22 = scootersSubscriptionUrlApi.a((Map) obj2, str3, str4, Boolean.valueOf(z2), scootersSubscriptionEntryPoint2.getValue(), "scooters");
        scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$0 = null;
        scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$1 = null;
        scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$2 = null;
        scootersSubscriptionUrlRepository$getSubscriptionUrl$1.L$3 = null;
        scootersSubscriptionUrlRepository$getSubscriptionUrl$1.Z$0 = z2;
        scootersSubscriptionUrlRepository$getSubscriptionUrl$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.a(a22, null, scootersSubscriptionUrlRepository$getSubscriptionUrl$1);
    }
}
