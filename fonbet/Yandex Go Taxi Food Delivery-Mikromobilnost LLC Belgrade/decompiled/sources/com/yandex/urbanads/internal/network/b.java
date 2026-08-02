package com.yandex.urbanads.internal.network;

import android.content.Context;
import android.os.Build;
import defpackage.i3y;
import defpackage.j7z;
import defpackage.jf21;
import defpackage.me0;
import defpackage.ny61;
import defpackage.pv01;
import defpackage.qe21;
import defpackage.re21;
import defpackage.se21;
import defpackage.z121;
import io.appmetrica.analytics.AppMetricaYandex;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.list_player_manager.impl.image.GlideBitmapDownloader;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;

/* loaded from: classes2.dex */
public final class b {
    public final Context a;
    public final se21 b;
    public final re21 c;
    public final qe21 d;
    public final me0 e;
    public final jf21 f;
    public final i3y g = kotlin.a.a(new pv01(17, this));
    public final i3y h = kotlin.a.a(new z121(18));
    public final i3y i = kotlin.a.a(new z121(19));

    public b(Context context, se21 se21Var, re21 re21Var, qe21 qe21Var, me0 me0Var, jf21 jf21Var) {
        this.a = context;
        this.b = se21Var;
        this.c = re21Var;
        this.d = qe21Var;
        this.e = me0Var;
        this.f = jf21Var;
    }

    public static void b(String str, String str2, Map map) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        UrbanAdsMapiHeaders$buildHeaders$1 urbanAdsMapiHeaders$buildHeaders$1;
        int i;
        LinkedHashMap linkedHashMap;
        String str;
        j7z j7zVar;
        Map map;
        LinkedHashMap linkedHashMap2;
        Map map2;
        if (continuationImpl instanceof UrbanAdsMapiHeaders$buildHeaders$1) {
            urbanAdsMapiHeaders$buildHeaders$1 = (UrbanAdsMapiHeaders$buildHeaders$1) continuationImpl;
            int i2 = urbanAdsMapiHeaders$buildHeaders$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                urbanAdsMapiHeaders$buildHeaders$1.label = i2 - Integer.MIN_VALUE;
                Object obj = urbanAdsMapiHeaders$buildHeaders$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = urbanAdsMapiHeaders$buildHeaders$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put(GlideBitmapDownloader.ACCEPT_HEADER, "application/json");
                    linkedHashMap.put(ExtFunctionsKt.HEADER_USER_AGENT, this.c.a.a());
                    b("x-sdk-user-agent", (String) this.i.getValue(), linkedHashMap);
                    b("x-webview-user-agent", (String) this.g.getValue(), linkedHashMap);
                    linkedHashMap.put("x-platform", "ANDROID");
                    this.b.a.getClass();
                    linkedHashMap.put("x-app-version", "5.89.0");
                    linkedHashMap.put("x-urbansdk-version", "18.7.3");
                    String str2 = "";
                    qe21 qe21Var = this.d;
                    if (qe21Var != null) {
                        str = AppMetricaYandex.getUuid(qe21Var.a);
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = null;
                    }
                    b("x-device-uuid", str, linkedHashMap);
                    if (qe21Var != null) {
                        String deviceId = AppMetricaYandex.getDeviceId(qe21Var.a);
                        if (deviceId != null) {
                            str2 = deviceId;
                        }
                    } else {
                        str2 = null;
                    }
                    b("x-device-id", str2, linkedHashMap);
                    b("x-os-version", String.valueOf(Build.VERSION.SDK_INT), linkedHashMap);
                    b("x-tz", (String) this.h.getValue(), linkedHashMap);
                    try {
                        j7zVar = this.e.d();
                    } catch (Exception unused) {
                        j7zVar = null;
                    }
                    b("x-location", j7zVar != null ? String.format(Locale.US, "%.7f,%.7f", Arrays.copyOf(new Object[]{Double.valueOf(j7zVar.a), Double.valueOf(j7zVar.b)}, 2)) : null, linkedHashMap);
                    b("x-client-timestamp", String.valueOf(System.currentTimeMillis()), linkedHashMap);
                    String language = Locale.getDefault().getLanguage();
                    b("Localization", language.length() > 0 ? language : null, linkedHashMap);
                    jf21 jf21Var = this.f;
                    if (jf21Var != null) {
                        urbanAdsMapiHeaders$buildHeaders$1.L$0 = linkedHashMap;
                        urbanAdsMapiHeaders$buildHeaders$1.L$1 = linkedHashMap;
                        urbanAdsMapiHeaders$buildHeaders$1.I$0 = 0;
                        urbanAdsMapiHeaders$buildHeaders$1.label = 1;
                        Serializable c = ((com.yandex.go.urbanads.a) jf21Var).c(urbanAdsMapiHeaders$buildHeaders$1);
                        if (c == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        LinkedHashMap linkedHashMap3 = linkedHashMap;
                        obj = c;
                        map = linkedHashMap3;
                        linkedHashMap2 = linkedHashMap3;
                    }
                    return linkedHashMap;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                map = (Map) urbanAdsMapiHeaders$buildHeaders$1.L$1;
                ?? r0 = (Map) urbanAdsMapiHeaders$buildHeaders$1.L$0;
                kotlin.b.b(obj);
                linkedHashMap2 = r0;
                map2 = (Map) obj;
                if (map2 != null) {
                    linkedHashMap = linkedHashMap2;
                    return linkedHashMap;
                }
                for (Map.Entry entry : map2.entrySet()) {
                    b((String) entry.getKey(), (String) entry.getValue(), map);
                }
                return linkedHashMap2;
            }
        }
        urbanAdsMapiHeaders$buildHeaders$1 = new UrbanAdsMapiHeaders$buildHeaders$1(this, continuationImpl);
        Object obj2 = urbanAdsMapiHeaders$buildHeaders$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = urbanAdsMapiHeaders$buildHeaders$1.label;
        if (i != 0) {
        }
        map2 = (Map) obj2;
        if (map2 != null) {
        }
    }
}
