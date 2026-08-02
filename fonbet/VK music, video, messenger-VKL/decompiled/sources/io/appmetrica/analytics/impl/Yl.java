package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.appmetrica.analytics.AdvIdentifiersResult;
import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class Yl implements Zl {
    public static final Map k = Collections.unmodifiableMap(new Vl());
    public final List a;
    public final Gi b;
    public final C4867gm c;
    public final Handler d;
    public PublicLogger e;
    public final Wl f;
    public final Object g;
    public final WeakHashMap h;
    public HashMap i;
    public boolean j;

    public Yl(@NonNull Context context, Gi gi, C4834ff c4834ff, @NonNull Handler handler) {
        this(gi, new C4867gm(context, c4834ff), handler);
    }

    public final void a(@NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list, @Nullable Map<String, String> map) {
        synchronized (this.g) {
            try {
                C4867gm c4867gm = this.c;
                c4867gm.getClass();
                if (!vo.a((Map) map) && !vo.a(map, c4867gm.e)) {
                    c4867gm.e = new HashMap(map);
                    c4867gm.g = true;
                    c4867gm.c();
                }
                a(startupParamsCallback, list);
                if (this.c.a((List) list)) {
                    a(list, new Xl(this, startupParamsCallback), map, true);
                } else {
                    a(new Bundle(), startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b4 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00c1 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dd A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e8 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e2 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:4:0x0063, B:6:0x0071, B:9:0x0085, B:11:0x00b4, B:12:0x00bb, B:14:0x00c1, B:15:0x00c8, B:17:0x00dd, B:19:0x00e8, B:20:0x00f4, B:26:0x00e2, B:27:0x0082), top: B:3:0x0063 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Bundle bundle) {
        HashMap hashMap;
        HashMap a;
        IdentifiersResult a2 = C4797e4.a(bundle, "Uuid");
        IdentifiersResult a3 = C4797e4.a(bundle, "DeviceId");
        IdentifiersResult a4 = C4797e4.a(bundle, "DeviceIdHash");
        IdentifiersResult a5 = C4797e4.a(bundle, "AdUrlReport");
        IdentifiersResult a6 = C4797e4.a(bundle, "AdUrlGet");
        IdentifiersResult a7 = C4797e4.a(bundle, "Clids");
        IdentifiersResult a8 = C4797e4.a(bundle, "RequestClids");
        IdentifiersResult a9 = C4797e4.a(bundle, IronSourceConstants.TYPE_GAID);
        IdentifiersResult a10 = C4797e4.a(bundle, "HOAID");
        IdentifiersResult a11 = C4797e4.a(bundle, "YANDEX_ADV_ID");
        IdentifiersResult a12 = C4797e4.a(bundle, "CUSTOM_SDK_HOSTS");
        long j = bundle.getLong("ServerTimeOffset");
        long j2 = bundle.getLong("NextStartupTime");
        C4881ha a13 = C4797e4.a(bundle);
        Bundle bundle2 = bundle.getBundle("module_configs");
        C4867gm c4867gm = this.c;
        synchronized (c4867gm) {
            try {
                IdentifiersResult identifiersResult = (IdentifiersResult) c4867gm.b.get(StartupParamsCallback.APPMETRICA_UUID);
                if (identifiersResult != null) {
                    zo zoVar = c4867gm.o;
                    String str = identifiersResult.id;
                    zoVar.getClass();
                    if (zo.a(str)) {
                        c4867gm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a3);
                        c4867gm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a4);
                        c4867gm.b.put("appmetrica_google_adv_id", a9);
                        c4867gm.b.put("appmetrica_huawei_oaid", a10);
                        c4867gm.b.put("appmetrica_yandex_adv_id", a11);
                        c4867gm.l.a(a12);
                        c4867gm.m.a(a13);
                        if (!C4867gm.a(a6)) {
                            c4867gm.b.put("appmetrica_get_ad_url", a6);
                        }
                        if (!C4867gm.a(a5)) {
                            c4867gm.b.put("appmetrica_report_ad_url", a5);
                        }
                        c4867gm.f = j;
                        O3 o3 = c4867gm.k;
                        hashMap = c4867gm.e;
                        a = AbstractC5166sb.a(a8.id);
                        o3.getClass();
                        if (!vo.a((Map) hashMap) ? vo.a((Map) a) : hashMap.equals(a)) {
                            c4867gm.b.put("appmetrica_clids", a7);
                            c4867gm.g = false;
                        }
                        c4867gm.h = j2;
                        c4867gm.c();
                    }
                }
                c4867gm.c(a2);
                c4867gm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID, a3);
                c4867gm.a(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, a4);
                c4867gm.b.put("appmetrica_google_adv_id", a9);
                c4867gm.b.put("appmetrica_huawei_oaid", a10);
                c4867gm.b.put("appmetrica_yandex_adv_id", a11);
                c4867gm.l.a(a12);
                c4867gm.m.a(a13);
                if (!C4867gm.a(a6)) {
                }
                if (!C4867gm.a(a5)) {
                }
                c4867gm.f = j;
                O3 o32 = c4867gm.k;
                hashMap = c4867gm.e;
                a = AbstractC5166sb.a(a8.id);
                o32.getClass();
                if (!vo.a((Map) hashMap) ? vo.a((Map) a) : hashMap.equals(a)) {
                }
                c4867gm.h = j2;
                c4867gm.c();
            } catch (Throwable th) {
                throw th;
            }
        }
        C5030n4.l().m().a(bundle2, new SdkIdentifiers(a2.id, a3.id, a4.id));
        h();
    }

    @NonNull
    public final M6 c() {
        return this.f;
    }

    public final String d() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get(StartupParamsCallback.APPMETRICA_DEVICE_ID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    @NonNull
    public final C4932ja e() {
        C4881ha c4881ha;
        C4867gm c4867gm = this.c;
        C4803ea c4803ea = c4867gm.n;
        C4829fa c4829fa = c4867gm.m;
        synchronized (c4829fa) {
            c4881ha = c4829fa.b;
        }
        c4803ea.getClass();
        Boolean bool = c4881ha.a;
        return new C4932ja();
    }

    public final long f() {
        return this.c.f;
    }

    public final String g() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get(StartupParamsCallback.APPMETRICA_UUID);
        if (identifiersResult == null) {
            return null;
        }
        return identifiersResult.id;
    }

    public final void h() {
        WeakHashMap weakHashMap = new WeakHashMap();
        for (Map.Entry entry : this.h.entrySet()) {
            List list = (List) entry.getValue();
            if (this.c.a((Collection) list)) {
                weakHashMap.put((StartupParamsCallback) entry.getKey(), list);
            }
        }
        Iterator it = weakHashMap.entrySet().iterator();
        while (it.hasNext()) {
            StartupParamsCallback startupParamsCallback = (StartupParamsCallback) ((Map.Entry) it.next()).getKey();
            if (startupParamsCallback != null) {
                a(new Bundle(), startupParamsCallback);
            }
        }
        weakHashMap.clear();
    }

    public final void i() {
        synchronized (this.g) {
            try {
                if (this.j) {
                    if (this.c.b()) {
                    }
                }
                this.j = true;
                a(this.a, this.f, this.i, false);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Yl(Gi gi, C4867gm c4867gm, Handler handler) {
        this.a = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, "appmetrica_get_ad_url", "appmetrica_report_ad_url", "appmetrica_clids");
        this.g = new Object();
        this.h = new WeakHashMap();
        this.j = false;
        this.b = gi;
        this.c = c4867gm;
        this.d = handler;
        this.f = new Wl(this);
    }

    public final void a(@NonNull Bundle bundle) {
        b(bundle, null);
    }

    public final void a(@NonNull PublicLogger publicLogger) {
        this.e = publicLogger;
    }

    public final void a(List list, M6 m6, Map map, boolean z) {
        N6 n6 = new N6(this.d, m6);
        Gi gi = this.b;
        gi.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.impl.IdentifiersData", new C4933jb(n6, list, map, z));
        EnumC5037nb enumC5037nb = EnumC5037nb.EVENT_TYPE_UNDEFINED;
        PublicLogger anonymousInstance = PublicLogger.getAnonymousInstance();
        Set set = I9.a;
        Y3 y3 = new Y3("", "", 1536, 0, anonymousInstance);
        y3.m = bundle;
        R4 r4 = gi.a;
        gi.a(Gi.a(y3, r4), r4, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (vo.a((Map) map)) {
            return;
        }
        synchronized (this.g) {
            try {
                HashMap b = Pm.b(map);
                this.i = b;
                this.b.a(b);
                C4867gm c4867gm = this.c;
                c4867gm.getClass();
                if (!vo.a((Map) b) && !vo.a(b, c4867gm.e)) {
                    c4867gm.e = new HashMap(b);
                    c4867gm.g = true;
                    c4867gm.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str) {
        synchronized (this.g) {
            this.b.a(str);
        }
    }

    public final void a(Bundle bundle, StartupParamsCallback startupParamsCallback) {
        Tl tl;
        if (this.h.containsKey(startupParamsCallback)) {
            List list = (List) this.h.get(startupParamsCallback);
            if (this.c.a((Collection) list)) {
                startupParamsCallback.onReceive(a(list));
            } else {
                StartupParamsCallback.Reason reason = null;
                if (bundle.containsKey("startup_error_key_code")) {
                    int i = bundle.getInt("startup_error_key_code");
                    tl = Tl.UNKNOWN;
                    if (i == 1) {
                        tl = Tl.NETWORK;
                    } else if (i == 2) {
                        tl = Tl.PARSE;
                    }
                } else {
                    tl = null;
                }
                if (tl == null) {
                    if (!this.c.a()) {
                        PublicLogger publicLogger = this.e;
                        if (publicLogger != null) {
                            publicLogger.warning("Clids error. Passed clids: %s, and clids from server are empty.", this.i);
                        }
                        reason = new StartupParamsCallback.Reason("INCONSISTENT_CLIDS");
                    } else {
                        tl = Tl.UNKNOWN;
                    }
                }
                if (reason == null) {
                    reason = (StartupParamsCallback.Reason) CollectionUtils.getOrDefault(k, tl, StartupParamsCallback.Reason.UNKNOWN);
                }
                startupParamsCallback.onRequestError(reason, a(list));
            }
            this.h.remove(startupParamsCallback);
            if (this.h.isEmpty()) {
                C5078p0 c5078p0 = this.b.d;
                synchronized (c5078p0.f) {
                    c5078p0.c = false;
                    c5078p0.c();
                }
            }
        }
    }

    public final void b(@NonNull Bundle bundle, @Nullable StartupParamsCallback startupParamsCallback) {
        synchronized (this.g) {
            try {
                b(bundle);
                h();
                if (startupParamsCallback != null) {
                    a(bundle, startupParamsCallback);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(List<String> list) {
        synchronized (this.g) {
            try {
                List list2 = this.c.d;
                if (vo.a((Collection) list)) {
                    if (!vo.a((Collection) list2)) {
                        C4867gm c4867gm = this.c;
                        c4867gm.d = null;
                        c4867gm.i.a((List<String>) null);
                        this.b.a((List) null);
                    }
                } else if (!vo.a(list, list2)) {
                    C4867gm c4867gm2 = this.c;
                    c4867gm2.d = list;
                    c4867gm2.i.a(list);
                    this.b.a(list);
                } else {
                    this.b.a(list2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final StartupParamsCallback.Result a(List list) {
        HashMap hashMap = new HashMap();
        C4867gm c4867gm = this.c;
        synchronized (c4867gm) {
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    IdentifiersResult identifiersResult = (IdentifiersResult) c4867gm.b.get(str);
                    if (identifiersResult != null) {
                        hashMap.put(str, c4867gm.c.a(identifiersResult));
                    }
                }
                c4867gm.l.a(list, hashMap);
                c4867gm.m.a(list, hashMap);
            } catch (Throwable th) {
                throw th;
            }
        }
        return new StartupParamsCallback.Result(hashMap);
    }

    public final void b(@Nullable String str) {
        synchronized (this.g) {
            this.b.b(str);
        }
    }

    public final Map<String, String> b() {
        IdentifiersResult identifiersResult = (IdentifiersResult) this.c.b.get("appmetrica_clids");
        String str = identifiersResult == null ? null : identifiersResult.id;
        if (!TextUtils.isEmpty(str)) {
            return AbstractC5166sb.a(str);
        }
        return this.i;
    }

    public final void a(StartupParamsCallback startupParamsCallback, List list) {
        if (this.h.isEmpty()) {
            C5078p0 c5078p0 = this.b.d;
            synchronized (c5078p0.f) {
                c5078p0.c = true;
                c5078p0.b();
            }
        }
        this.h.put(startupParamsCallback, list);
    }

    @NonNull
    public final AdvIdentifiersResult a() {
        C4867gm c4867gm = this.c;
        P p = c4867gm.j;
        IdentifiersResult identifiersResult = (IdentifiersResult) c4867gm.b.get("appmetrica_google_adv_id");
        IdentifiersResult identifiersResult2 = (IdentifiersResult) c4867gm.b.get("appmetrica_huawei_oaid");
        IdentifiersResult identifiersResult3 = (IdentifiersResult) c4867gm.b.get("appmetrica_yandex_adv_id");
        p.getClass();
        return new AdvIdentifiersResult(P.a(identifiersResult), P.a(identifiersResult2), P.a(identifiersResult3));
    }
}
