package com.yandex.go.chargers.dvizh_subscription.data;

import com.yandex.go.chargers.data.f;
import com.yandex.go.chargers.dvizh_subscription.data.models.DvizhSubscriptionUrlResponse;
import defpackage.cmt;
import defpackage.evu0;
import defpackage.ny61;
import java.io.Serializable;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class a {
    public final f a;
    public final ChargersDvizhSubscriptionUrlApi b;

    public a(f fVar, ChargersDvizhSubscriptionUrlApi chargersDvizhSubscriptionUrlApi) {
        this.a = fVar;
        this.b = chargersDvizhSubscriptionUrlApi;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x009c, code lost:
    
        if (r1 != r3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        ChargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1 chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1;
        int i;
        String str4;
        String str5;
        String str6;
        ChargersDvizhSubscriptionUrlApi chargersDvizhSubscriptionUrlApi;
        if (continuationImpl instanceof ChargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1) {
            chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1 = (ChargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1) continuationImpl;
            int i2 = chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.label;
                if (i != 0) {
                    b.b(obj);
                    chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$0 = str;
                    str4 = str2;
                    chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$1 = str4;
                    chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$2 = str3;
                    ChargersDvizhSubscriptionUrlApi chargersDvizhSubscriptionUrlApi2 = this.b;
                    chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$3 = chargersDvizhSubscriptionUrlApi2;
                    chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.label = 1;
                    Serializable b = this.a.b(chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1);
                    if (b != coroutineSingletons) {
                        str5 = str;
                        str6 = str3;
                        chargersDvizhSubscriptionUrlApi = chargersDvizhSubscriptionUrlApi2;
                        obj = b;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return ((DvizhSubscriptionUrlResponse) obj).a;
                }
                ChargersDvizhSubscriptionUrlApi chargersDvizhSubscriptionUrlApi3 = (ChargersDvizhSubscriptionUrlApi) chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$3;
                String str7 = (String) chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$2;
                String str8 = (String) chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$1;
                String str9 = (String) chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$0;
                b.b(obj);
                chargersDvizhSubscriptionUrlApi = chargersDvizhSubscriptionUrlApi3;
                str6 = str7;
                str4 = str8;
                str5 = str9;
                cmt<DvizhSubscriptionUrlResponse> a = chargersDvizhSubscriptionUrlApi.a((Map) obj, "chargers", str5, evu0.J(str4) ? str4 : null, str6);
                chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$0 = null;
                chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$1 = null;
                chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$2 = null;
                chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$3 = null;
                chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.a(a, null, chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1);
            }
        }
        chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1 = new ChargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1(this, continuationImpl);
        Object obj2 = chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.label;
        if (i != 0) {
        }
        cmt<DvizhSubscriptionUrlResponse> a2 = chargersDvizhSubscriptionUrlApi.a((Map) obj2, "chargers", str5, evu0.J(str4) ? str4 : null, str6);
        chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$0 = null;
        chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$1 = null;
        chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$2 = null;
        chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.L$3 = null;
        chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1.label = 2;
        obj2 = ru.yandex.taxi.network.api.a.a(a2, null, chargersDvizhSubscriptionUrlRepository$getSubscriptionUrl$1);
    }
}
