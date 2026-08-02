package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.Keep;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleCSBData;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.a3;
import com.vungle.ads.internal.model.b3;
import com.vungle.ads.internal.model.c1;
import com.vungle.ads.internal.model.c3;
import com.vungle.ads.internal.model.g1;
import com.vungle.ads.internal.model.i0;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.model.j1;
import com.vungle.ads.internal.model.l0;
import com.vungle.ads.internal.model.m1;
import com.vungle.ads.internal.model.p1;
import com.vungle.ads.internal.model.s1;
import com.vungle.ads.internal.model.t0;
import com.vungle.ads.internal.model.t1;
import com.vungle.ads.internal.model.w0;
import com.vungle.ads.internal.model.z0;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.json.JsonObject;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.m;
import okhttp3.o;
import okhttp3.t;
import okhttp3.u;
import okhttp3.v;
import xsna.anj;
import xsna.brm0;
import xsna.c9y;
import xsna.e43;
import xsna.epx;
import xsna.fpf0;
import xsna.j5g;
import xsna.j8y;
import xsna.k9x;
import xsna.msy;
import xsna.n9y;
import xsna.s1v;
import xsna.vl8;
import xsna.y9y;

/* loaded from: classes7.dex */
public final class VungleApiClient {

    @Keep
    private static final String BASE_URL = "https://config.ads.vungle.com/";

    @Keep
    private static final boolean interceptorEnabled = false;
    public final Context a;
    public final com.vungle.ads.internal.platform.f b;
    public final FilePreferences c;
    public c0 d;
    public c0 e;
    public b3 f;
    public i0 g;
    public l0 h;
    public Boolean j;
    public final Lazy k;

    @Keep
    private static final Set<Interceptor> networkInterceptors = new HashSet();

    @Keep
    private static final Set<Interceptor> logInterceptors = new HashSet();
    public static final j8y n = n9y.a(s.a);
    public String i = System.getProperty("http.agent");
    public ConcurrentHashMap l = new ConcurrentHashMap();
    public Interceptor m = new Interceptor() { // from class: xsna.p7x0
        @Override // okhttp3.Interceptor
        public final okhttp3.u intercept(Interceptor.a aVar) {
            return VungleApiClient.a(VungleApiClient.this, aVar);
        }
    };

    public VungleApiClient(Context context, com.vungle.ads.internal.platform.f fVar, FilePreferences filePreferences) {
        this.a = context;
        this.b = fVar;
        this.c = filePreferences;
        this.k = msy.a(LazyThreadSafetyMode.SYNCHRONIZED, new a0(context));
        o.a aVar = new o.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.e(60L, timeUnit);
        aVar.c(60L, timeUnit);
        Interceptor interceptor = this.m;
        ArrayList arrayList = aVar.c;
        arrayList.add(interceptor);
        v vVar = new v();
        if (!vVar.equals(aVar.m)) {
            aVar.B = null;
        }
        aVar.m = vVar;
        if (interceptorEnabled) {
            Iterator<Interceptor> it = logInterceptors.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
            Iterator<Interceptor> it2 = networkInterceptors.iterator();
            while (it2.hasNext()) {
                aVar.b(it2.next());
            }
        }
        okhttp3.o oVar = new okhttp3.o(aVar);
        arrayList.add(new u());
        okhttp3.o oVar2 = new okhttp3.o(aVar);
        this.e = new c0(oVar);
        this.d = new c0(oVar2);
    }

    public static final okhttp3.u a(VungleApiClient vungleApiClient, Interceptor.a aVar) {
        okhttp3.p request = aVar.request();
        okhttp3.m mVar = null;
        try {
            try {
                okhttp3.u a = aVar.a(request);
                String a2 = a.g.a(CommonGatewayClient.HEADER_RETRY_AFTER);
                if (a2 == null || a2.length() == 0) {
                    return a;
                }
                try {
                    long parseLong = Long.parseLong(a2);
                    if (parseLong <= 0) {
                        return a;
                    }
                    String b = request.a.b();
                    long currentTimeMillis = (parseLong * 1000) + System.currentTimeMillis();
                    if (!brm0.v(b, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false)) {
                        return a;
                    }
                    String a3 = a(request.d);
                    if (a3.length() <= 0) {
                        return a;
                    }
                    vungleApiClient.l.put(a3, Long.valueOf(currentTimeMillis));
                    return a;
                } catch (Exception unused) {
                    boolean z = com.vungle.ads.internal.util.u.a;
                    com.vungle.ads.internal.util.t.a("VungleApiClient", "Retry-After value is not an valid value");
                    return a;
                }
            } catch (OutOfMemoryError unused2) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                StringBuilder a4 = com.iab.omid.library.vungle.internal.l.a("OOM for ");
                a4.append(request.a);
                com.vungle.ads.internal.util.t.b("VungleApiClient", a4.toString());
                okhttp3.v.Companion.getClass();
                okhttp3.w b2 = v.b.b(new byte[0], null);
                u.a aVar2 = new u.a();
                aVar2.a = request;
                aVar2.c = 500;
                aVar2.b = Protocol.HTTP_1_1;
                aVar2.d = "OOM";
                aVar2.g = b2;
                return aVar2.c();
            }
        } catch (Exception e) {
            boolean z3 = com.vungle.ads.internal.util.u.a;
            StringBuilder a5 = com.iab.omid.library.vungle.internal.l.a("Exception: ");
            a5.append(e.getMessage());
            a5.append(" for ");
            a5.append(request.a);
            com.vungle.ads.internal.util.t.b("VungleApiClient", a5.toString());
            u.a aVar3 = new u.a();
            aVar3.a = request;
            aVar3.c = 500;
            aVar3.b = Protocol.HTTP_1_1;
            aVar3.d = "Server is busy";
            v.b bVar = okhttp3.v.Companion;
            Pattern pattern = okhttp3.m.e;
            try {
                mVar = m.a.a("application/json");
            } catch (IllegalArgumentException unused3) {
            }
            bVar.getClass();
            aVar3.g = v.b.a("{\"Error\":\"Server is busy\"}", mVar);
            return aVar3.c();
        }
    }

    public final long b(String str) {
        Long l = (Long) this.l.get(str);
        if (l != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final synchronized void c(String str) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        try {
            d0.a(str);
            String str2 = "1.0";
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    PackageManager packageManager = this.a.getPackageManager();
                    String packageName = this.a.getPackageName();
                    of = PackageManager.PackageInfoFlags.of(0L);
                    packageInfo = packageManager.getPackageInfo(packageName, of);
                } else {
                    packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                }
                str2 = packageInfo.versionName;
            } catch (Exception unused) {
            }
            d0.b(str2);
            this.f = a(this.a);
            this.h = new l0(this.a.getPackageName(), str2, str);
            this.j = d();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Boolean d() {
        Boolean bool;
        boolean z;
        try {
            try {
                z = com.google.android.gms.common.a.b.isGooglePlayServicesAvailable(this.a) == 0;
                bool = Boolean.valueOf(z);
            } catch (Exception unused) {
                bool = null;
            }
        } catch (NoClassDefFoundError unused2) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleApiClient", "Play services Not available");
            bool = Boolean.FALSE;
            try {
                this.c.a(false, "isPlaySvcAvailable").b();
            } catch (Exception unused3) {
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.c("VungleApiClient", "Failure to write GPS availability to DB");
            }
            return bool;
        }
        try {
            this.c.a(z, "isPlaySvcAvailable").b();
            return bool;
        } catch (Exception unused4) {
            boolean z4 = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.c("VungleApiClient", "Unexpected exception from Play services lib.");
            return bool;
        }
    }

    public final m1 b(boolean z) {
        String a;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.c.getString("config_extension");
        }
        if (z) {
            try {
                a = ((com.vungle.ads.internal.signals.j) this.k.getValue()).a();
            } catch (Exception e) {
                boolean z2 = com.vungle.ads.internal.util.u.a;
                StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Couldn't convert signals for sending. Error: ");
                a2.append(e.getMessage());
                com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            }
            if ((configExtension != null || configExtension.length() == 0) && (a == null || a.length() == 0)) {
                return null;
            }
            ConfigManager.INSTANCE.getClass();
            return new m1(configExtension, a, Long.valueOf(ConfigManager.a()));
        }
        a = null;
        if (configExtension != null) {
        }
        return null;
    }

    public final void d(String str) {
        okhttp3.m mVar;
        c0 c0Var = this.e;
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a("application/json");
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        aVar.getClass();
        c0Var.a(t.a.a(str, mVar)).a(new z());
    }

    public final String b() {
        if (anj.a(this.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                return "MOBILE";
            }
            if (type == 1 || type == 6) {
                return "WIFI";
            }
            if (type == 7) {
                return "BLUETOOTH";
            }
            if (type != 9) {
                return GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            return "ETHERNET";
        }
        return "NONE";
    }

    public static s1 c(boolean z) {
        String value;
        s1 s1Var = new s1(null, null, null, null, null);
        PrivacyManager.INSTANCE.getClass();
        String b = PrivacyManager.b();
        String str = PrivacyManager.e;
        if (str == null) {
            str = "no_interaction";
        }
        String str2 = str;
        String str3 = PrivacyManager.f;
        String str4 = str3 == null ? "" : str3;
        Long l = PrivacyManager.g;
        s1Var.a = new g1(l != null ? l.longValue() : 0L, b, str2, str4);
        PrivacyConsent privacyConsent = PrivacyManager.h;
        if (privacyConsent == null || (value = privacyConsent.getValue()) == null) {
            value = PrivacyConsent.UNKNOWN.getValue();
        }
        s1Var.b = new w0(value);
        if (PrivacyManager.c() != COPPA.COPPA_NOTSET) {
            s1Var.c = new z0(PrivacyManager.c().getValue());
        }
        if (PrivacyManager.f()) {
            SharedPreferences sharedPreferences = PrivacyManager.j;
            String string = sharedPreferences != null ? sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "") : null;
            s1Var.e = new j1(string != null ? string : "");
        }
        if (z) {
            s1Var.d = VungleAds.firstPartyData;
        }
        return s1Var;
    }

    public final String c() {
        if (anj.a(this.a, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "unknown";
        }
        int subtype = activeNetworkInfo.getSubtype();
        if (subtype == 1) {
            return "gprs";
        }
        if (subtype == 2) {
            return "edge";
        }
        if (subtype == 20) {
            return "5g";
        }
        switch (subtype) {
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            default:
                switch (subtype) {
                }
        }
        return "unknown";
    }

    public static String a(okhttp3.t tVar) {
        String str;
        p1 c;
        List a;
        vl8 vl8Var;
        try {
            j8y j8yVar = n;
            try {
                vl8Var = new vl8();
            } catch (Exception unused) {
            }
            if (tVar != null) {
                tVar.writeTo(vl8Var);
                str = vl8Var.x();
                c = ((t1) j8yVar.a(s1v.p(j8yVar.b, fpf0.d(t1.class)), str)).c();
                if (c == null && (a = c.a()) != null) {
                    String str2 = (String) a.get(0);
                    return str2 == null ? "" : str2;
                }
            }
            str = "";
            c = ((t1) j8yVar.a(s1v.p(j8yVar.b, fpf0.d(t1.class)), str)).c();
            return c == null ? "" : "";
        } catch (Exception unused2) {
            return "";
        }
    }

    public final boolean a(String str) {
        Long l = (Long) this.l.get(str);
        if ((l != null ? l.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.l.remove(str);
        return false;
    }

    public final m a() {
        l0 l0Var = this.h;
        if (l0Var == null) {
            return null;
        }
        t1 t1Var = new t1(a(true), l0Var, c(false));
        m1 b = b(false);
        if (b != null) {
            t1Var.a(b);
        }
        com.vungle.ads.internal.util.m mVar = com.vungle.ads.internal.util.n.a;
        String str = BASE_URL;
        if (!com.vungle.ads.internal.util.n.a(str)) {
            str = BASE_URL;
        }
        if (!brm0.v(str, DomExceptionUtils.SEPARATOR, false)) {
            str = str.concat(DomExceptionUtils.SEPARATOR);
        }
        return this.e.b(d0.d(), str + "config", t1Var);
    }

    public final m a(String str, VungleAdSize vungleAdSize) {
        String adsEndpoint = ConfigManager.INSTANCE.getAdsEndpoint();
        t1 a = a(!ConfigManager.r(), ConfigManager.b());
        p1 p1Var = new p1(Collections.singletonList(str), (Long) null, (String) null, (String) null, (String) null, (c1) null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        if (vungleAdSize != null) {
            p1Var.a(new t0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a.a(p1Var);
        return this.d.a(d0.d(), adsEndpoint, a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(String str, VungleAdSize vungleAdSize, VungleCSBData vungleCSBData) {
        c1 c1Var;
        JsonObject jsonObject;
        ConfigManager.INSTANCE.getClass();
        String c = ConfigManager.c();
        t1 a = a(!ConfigManager.r(), ConfigManager.b());
        if (vungleCSBData != null) {
            Map<String, String> extras = vungleCSBData.getExtras();
            if (extras != null) {
                if (extras.isEmpty()) {
                    extras = null;
                }
                if (extras != null) {
                    y9y y9yVar = new y9y();
                    for (Map.Entry<String, String> entry : extras.entrySet()) {
                        y9yVar.b(entry.getKey(), c9y.b(entry.getValue()));
                    }
                    jsonObject = y9yVar.a();
                    c1Var = new c1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.isVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
                }
            }
            jsonObject = null;
            c1Var = new c1(vungleCSBData.getBidFloor(), vungleCSBData.getPhase(), vungleCSBData.isVXWinner(), vungleCSBData.getAuctionId(), vungleCSBData.getCreativeId(), vungleCSBData.getAdUnitId(), jsonObject != null ? jsonObject.toString() : null);
        } else {
            c1Var = null;
        }
        p1 p1Var = new p1(Collections.singletonList(str), (Long) null, (String) null, (String) null, (String) null, c1Var, 62);
        if (vungleAdSize != null) {
            p1Var.a(new t0(vungleAdSize.getWidth(), vungleAdSize.getHeight()));
        }
        a.a(p1Var);
        return this.d.a(d0.d(), c, a);
    }

    public final m a(p1 p1Var) {
        l0 l0Var;
        ConfigManager.INSTANCE.getClass();
        String m = ConfigManager.m();
        if (m == null || m.length() == 0 || (l0Var = this.h) == null) {
            return null;
        }
        t1 t1Var = new t1(a(false), l0Var, c(false));
        t1Var.a(p1Var);
        m1 b = b(false);
        if (b != null) {
            t1Var.a(b);
        }
        return this.e.c(d0.d(), m, t1Var);
    }

    public final c3 a(String str, Map map, String str2, g gVar, com.vungle.ads.internal.util.s sVar) {
        okhttp3.s sVar2;
        okhttp3.u e;
        okhttp3.m mVar;
        if (!com.vungle.ads.internal.util.n.a(str)) {
            return new c3("Invalid URL", true, false, 4);
        }
        try {
            if (!NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(str).getHost()) && URLUtil.isHttpUrl(str)) {
                return new c3("Clear Text Traffic is blocked", false, false, 6);
            }
            try {
                String str3 = this.i;
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3;
                if (str2 != null) {
                    t.a aVar = okhttp3.t.Companion;
                    Pattern pattern = okhttp3.m.e;
                    try {
                        mVar = m.a.a("application/json");
                    } catch (IllegalArgumentException unused) {
                        mVar = null;
                    }
                    aVar.getClass();
                    sVar2 = t.a.a(str2, mVar);
                } else {
                    sVar2 = null;
                }
                o a = this.e.a(str4, str, gVar, map, sVar2).a();
                if (a == null || !a.c()) {
                    Integer valueOf = (a == null || (e = a.e()) == null) ? null : Integer.valueOf(e.e);
                    if (j5g.P(e43.l(301, 302, 307, Integer.valueOf(Sdk.SDKError.Reason.AD_WIN_NOTIFICATION_ERROR_VALUE)), valueOf)) {
                        AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, sVar, str, 2);
                    } else {
                        boolean z = valueOf != null && new k9x(500, CommonGatewayClient.CODE_599, 1).e(valueOf.intValue());
                        StringBuilder sb = new StringBuilder("unsuccessful response, error code: ");
                        sb.append(valueOf);
                        sb.append(", message: ");
                        sb.append(a != null ? a.d() : null);
                        return new c3(sb.toString(), false, z, 2);
                    }
                }
                return null;
            } catch (Throwable th) {
                String localizedMessage = th.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new c3(localizedMessage, false, true, 2);
            }
        } catch (MalformedURLException e2) {
            String localizedMessage2 = e2.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new c3(localizedMessage2, true, false, 4);
        }
    }

    public final void a(LinkedBlockingQueue linkedBlockingQueue, com.vungle.ads.internal.y yVar) {
        okhttp3.m mVar;
        ConfigManager.INSTANCE.getClass();
        String l = ConfigManager.l();
        if (l.length() == 0) {
            yVar.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            Sdk.SDKMetric.Builder builder = (Sdk.SDKMetric.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 a = ConfigManager.a(placementReferenceId);
            if (a != null) {
                String c = a.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKMetric build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending Metric: ");
            a2.append(build.getType());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            linkedBlockingQueue2.add(build);
        }
        Sdk.MetricBatch build2 = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue2).build();
        t.a aVar = okhttp3.t.Companion;
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a(CommonGatewayClient.HEADER_PROTOBUF);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        this.e.b(d0.d(), l, t.a.c(aVar, mVar, build2.toByteArray(), 0, 12)).a(new y(yVar));
    }

    public final void a(LinkedBlockingQueue linkedBlockingQueue, com.vungle.ads.internal.x xVar) {
        okhttp3.m mVar;
        ConfigManager.INSTANCE.getClass();
        String f = ConfigManager.f();
        if (f.length() == 0) {
            xVar.a();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue2 = new LinkedBlockingQueue();
        Iterator it = linkedBlockingQueue.iterator();
        while (it.hasNext()) {
            Sdk.SDKError.Builder builder = (Sdk.SDKError.Builder) it.next();
            builder.setSessionId(((com.vungle.ads.internal.signals.j) this.k.getValue()).d());
            ConfigManager configManager = ConfigManager.INSTANCE;
            String placementReferenceId = builder.getPlacementReferenceId();
            configManager.getClass();
            i3 a = ConfigManager.a(placementReferenceId);
            if (a != null) {
                String c = a.c();
                if (c == null) {
                    c = "";
                }
                builder.setPlacementType(c);
            }
            String b = b();
            if (b != null) {
                builder.setConnectionType(b);
            }
            String c2 = c();
            if (c2 != null) {
                builder.setConnectionTypeDetail(c2);
            }
            Sdk.SDKError build = builder.build();
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("Sending Error: ");
            a2.append(build.getReason());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a2.toString());
            linkedBlockingQueue2.add(build);
        }
        Sdk.SDKErrorBatch build2 = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue2).build();
        t.a aVar = okhttp3.t.Companion;
        byte[] byteArray = build2.toByteArray();
        Pattern pattern = okhttp3.m.e;
        try {
            mVar = m.a.a(CommonGatewayClient.HEADER_PROTOBUF);
        } catch (IllegalArgumentException unused) {
            mVar = null;
        }
        int length = build2.toByteArray().length;
        aVar.getClass();
        this.e.a(d0.d(), f, t.a.b(mVar, byteArray, 0, length)).a(new x(xVar));
    }

    public final b3 a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String str = Build.MANUFACTURER;
        b3 b3Var = new b3(str, Build.MODEL, Build.VERSION.RELEASE, com.vungle.ads.internal.platform.a.a(context), "Amazon".equals(str) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.i);
        try {
            String j = ((com.vungle.ads.internal.platform.c) this.b).j();
            this.i = j;
            b3Var.b(j);
            n2 n2Var = new n2(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
            n2Var.e();
            ((com.vungle.ads.internal.platform.c) this.b).a(new w(this, n2Var));
            i0 i0Var = this.g;
            if (i0Var == null) {
                i0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
            }
            this.g = i0Var;
            return b3Var;
        } catch (Exception e) {
            boolean z = com.vungle.ads.internal.util.u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Cannot Get UserAgent. Setting Default Device UserAgent.");
            a.append(e.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("VungleApiClient", a.toString());
            return b3Var;
        }
    }

    public final t1 a(boolean z, boolean z2) {
        t1 t1Var = new t1(a(false), this.h, c(z2), null, null);
        m1 b = b(z);
        if (b != null) {
            t1Var.d = b;
        }
        return t1Var;
    }

    public final synchronized b3 a(boolean z) {
        b3 a;
        String str;
        try {
            b3 b3Var = this.f;
            if (b3Var == null) {
                b3Var = a(this.a);
                this.f = b3Var;
            }
            a = b3.a(b3Var);
            a3 a3Var = new a3();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            a.a(displayMetrics.heightPixels);
            a.b(displayMetrics.widthPixels);
            i0 i0Var = this.g;
            if (i0Var == null) {
                i0Var = ((com.vungle.ads.internal.platform.c) this.b).a();
            }
            this.g = i0Var;
            String a2 = i0Var.a();
            i0 i0Var2 = this.g;
            Boolean valueOf = i0Var2 != null ? Boolean.valueOf(i0Var2.b()) : null;
            PrivacyManager.INSTANCE.getClass();
            if (PrivacyManager.e()) {
                if (a2 != null) {
                    if ("Amazon".equals(Build.MANUFACTURER)) {
                        a3Var.a(a2);
                    } else {
                        a3Var.f(a2);
                    }
                    a.a(a2);
                } else {
                    a.a("");
                }
            }
            if (z || !PrivacyManager.e()) {
                a.a((String) null);
                a3Var.f(null);
                a3Var.a((String) null);
            }
            Boolean bool = Boolean.TRUE;
            boolean f = epx.f(valueOf, bool);
            boolean z2 = false;
            a.a(f ? 1 : 0);
            if (this.j == null) {
                this.j = this.c.a("isPlaySvcAvailable");
            }
            if (this.j == null) {
                this.j = d();
            }
            a3Var.a(bool.equals(this.j));
            if (PrivacyManager.a() != 2) {
                String b = ((com.vungle.ads.internal.platform.c) this.b).b();
                if (b != null) {
                    a3Var.b(b);
                }
                Integer c = ((com.vungle.ads.internal.platform.c) this.b).c();
                if (c != null) {
                    a3Var.a(Integer.valueOf(c.intValue()));
                }
            }
            Intent registerReceiver = this.a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra = registerReceiver.getIntExtra("level", -1);
                int intExtra2 = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    a3Var.a(intExtra / intExtra2);
                }
                int intExtra3 = registerReceiver.getIntExtra("status", -1);
                if (intExtra3 == -1) {
                    str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
                } else if (intExtra3 != 2 && intExtra3 != 5) {
                    str = "NOT_CHARGING";
                } else {
                    int intExtra4 = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra4 == 1) {
                        str = "BATTERY_PLUGGED_AC";
                    } else if (intExtra4 == 2) {
                        str = "BATTERY_PLUGGED_USB";
                    } else if (intExtra4 != 4) {
                        str = "BATTERY_PLUGGED_OTHERS";
                    } else {
                        str = "BATTERY_PLUGGED_WIRELESS";
                    }
                }
            } else {
                str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
            }
            a3Var.c(str);
            a3Var.a(((com.vungle.ads.internal.platform.c) this.b).l() ? 1 : 0);
            String b2 = b();
            if (b2 != null) {
                a3Var.d(b2);
            }
            String c2 = c();
            if (c2 != null) {
                a3Var.e(c2);
            }
            a3Var.i(Locale.getDefault().toString());
            a3Var.h(Locale.getDefault().getLanguage());
            a3Var.j(TimeZone.getDefault().getID());
            a3Var.b(((com.vungle.ads.internal.platform.c) this.b).k());
            a3Var.c(((com.vungle.ads.internal.platform.c) this.b).p() ? 1 : 0);
            if ("Amazon".equals(Build.MANUFACTURER)) {
                z2 = this.a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else if (((UiModeManager) this.a.getSystemService("uimode")).getCurrentModeType() == 4) {
                z2 = true;
            }
            a3Var.b(z2);
            this.b.getClass();
            a3Var.a();
            a3Var.b(((com.vungle.ads.internal.platform.c) this.b).n() ? 1 : 0);
            ConfigManager.INSTANCE.getClass();
            if (ConfigManager.p()) {
                a3Var.d(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).i()));
                a3Var.b(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).h()));
                a3Var.c(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).g()));
                a3Var.a(Long.valueOf(((com.vungle.ads.internal.platform.c) this.b).d()));
            }
            a3Var.g(((com.vungle.ads.internal.platform.c) this.b).f());
            a.b(this.i);
            a.a(a3Var);
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }
}
