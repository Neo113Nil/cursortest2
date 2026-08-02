package xsna;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.android.datatransport.cct.internal.b;
import com.google.android.datatransport.cct.internal.c;
import com.google.android.datatransport.cct.internal.d;
import com.google.android.datatransport.runtime.backends.BackendResponse;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import xsna.am5;
import xsna.bm5;
import xsna.cm5;
import xsna.fn5;
import xsna.hn5;
import xsna.ok5;
import xsna.yl5;

/* compiled from: CctTransportBackend.java */
/* loaded from: classes.dex */
public final class rla implements rop0 {
    public final u8y a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final zuf e;
    public final zuf f;
    public final int g;

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes12.dex */
    public static final class a {
        public final URL a;
        public final rk5 b;

        @Nullable
        public final String c;

        public a(URL url, rk5 rk5Var, @Nullable String str) {
            this.a = url;
            this.b = rk5Var;
            this.c = str;
        }
    }

    /* compiled from: CctTransportBackend.java */
    /* loaded from: classes12.dex */
    public static final class b {
        public final int a;

        @Nullable
        public final URL b;
        public final long c;

        public b(int i, @Nullable URL url, long j) {
            this.a = i;
            this.b = url;
            this.c = j;
        }
    }

    public rla(Context context, zuf zufVar, zuf zufVar2) {
        v8y v8yVar = new v8y();
        com.google.android.datatransport.cct.internal.a.a.configure(v8yVar);
        v8yVar.d = true;
        this.a = new u8y(v8yVar);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = c(vu8.c);
        this.e = zufVar2;
        this.f = zufVar;
        this.g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(go9.b("Invalid url: ", str), e);
        }
    }

    @Override // xsna.rop0
    public final com.google.android.datatransport.runtime.backends.a a(qk5 qk5Var) {
        fn5.a aVar;
        HashMap hashMap = new HashMap();
        for (a0q a0qVar : qk5Var.b()) {
            String k = a0qVar.k();
            if (hashMap.containsKey(k)) {
                ((List) hashMap.get(k)).add(a0qVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(a0qVar);
                hashMap.put(k, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            a0q a0qVar2 = (a0q) ((List) entry.getValue()).get(0);
            hn5.a aVar2 = new hn5.a();
            aVar2.f(QosTier.DEFAULT);
            aVar2.g(this.f.C());
            aVar2.h(this.e.C());
            b.a aVar3 = new b.a();
            aVar3.c(ClientInfo.ClientType.ANDROID_FIREBASE);
            ok5.a aVar4 = new ok5.a();
            aVar4.m(Integer.valueOf(a0qVar2.h("sdk-version")));
            aVar4.j(a0qVar2.a("model"));
            aVar4.f(a0qVar2.a("hardware"));
            aVar4.d(a0qVar2.a("device"));
            aVar4.l(a0qVar2.a("product"));
            aVar4.k(a0qVar2.a("os-uild"));
            aVar4.h(a0qVar2.a("manufacturer"));
            aVar4.e(a0qVar2.a(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT));
            aVar4.c(a0qVar2.a("country"));
            aVar4.g(a0qVar2.a("locale"));
            aVar4.i(a0qVar2.a("mcc_mnc"));
            aVar4.b(a0qVar2.a("application_build"));
            aVar3.b(aVar4.a());
            aVar2.d(aVar3.a());
            try {
                aVar2.a(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                aVar2.b((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (a0q a0qVar3 : (List) entry.getValue()) {
                uip d = a0qVar3.d();
                ijp ijpVar = d.a;
                byte[] bArr = d.b;
                if (ijpVar.equals(new ijp("proto"))) {
                    aVar = new fn5.a();
                    aVar.h(bArr);
                } else if (ijpVar.equals(new ijp("json"))) {
                    String str = new String(bArr, Charset.forName(C.UTF8_NAME));
                    fn5.a aVar5 = new fn5.a();
                    aVar5.i(str);
                    aVar = aVar5;
                } else if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 5)) {
                    new StringBuilder("Received event of unsupported encoding ").append(ijpVar);
                }
                aVar.d(a0qVar3.e());
                aVar.e(a0qVar3.l());
                String str2 = a0qVar3.b().get("tz-offset");
                aVar.j(str2 == null ? 0L : Long.valueOf(str2).longValue());
                d.a aVar6 = new d.a();
                aVar6.c(NetworkConnectionInfo.NetworkType.a(a0qVar3.h("net-type")));
                aVar6.b(NetworkConnectionInfo.MobileSubtype.a(a0qVar3.h("mobile-subtype")));
                aVar.g(aVar6.a());
                if (a0qVar3.c() != null) {
                    aVar.c(a0qVar3.c());
                }
                if (a0qVar3.i() != null) {
                    c.a aVar7 = new c.a();
                    cm5.a aVar8 = new cm5.a();
                    bm5.a aVar9 = new bm5.a();
                    aVar9.b(a0qVar3.i());
                    aVar8.b(aVar9.a());
                    aVar7.b(aVar8.a());
                    aVar7.c(ComplianceData.ProductIdOrigin.EVENT_OVERRIDE);
                    aVar.b(aVar7.a());
                }
                if (a0qVar3.f() != null || a0qVar3.g() != null) {
                    am5.a aVar10 = new am5.a();
                    if (a0qVar3.f() != null) {
                        aVar10.b(a0qVar3.f());
                    }
                    if (a0qVar3.g() != null) {
                        aVar10.c(a0qVar3.g());
                    }
                    aVar.f(aVar10.a());
                }
                arrayList3.add(aVar.a());
            }
            aVar2.e(arrayList3);
            arrayList2.add(aVar2.c());
        }
        rk5 rk5Var = new rk5(arrayList2);
        byte[] c = qk5Var.c();
        URL url = this.d;
        if (c != null) {
            try {
                vu8 b2 = vu8.b(qk5Var.c());
                String str3 = b2.b;
                r2 = str3 != null ? str3 : null;
                String str4 = b2.a;
                if (str4 != null) {
                    url = c(str4);
                }
            } catch (IllegalArgumentException unused2) {
                return BackendResponse.a();
            }
        }
        try {
            b D = m4s.D(new a(url, rk5Var, r2), new pi0(this, 5), new xq(9));
            int i = D.a;
            if (i == 200) {
                return BackendResponse.e(D.c);
            }
            if (i < 500 && i != 404) {
                return i == 400 ? BackendResponse.d() : BackendResponse.a();
            }
            return BackendResponse.f();
        } catch (IOException e) {
            b200.b("CctTransportBackend", "Could not make request to the backend", e);
            return BackendResponse.f();
        }
    }

    @Override // xsna.rop0
    public final yl5 b(yl5 yl5Var) {
        int subtype;
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        yl5.a m = yl5Var.m();
        int i = Build.VERSION.SDK_INT;
        HashMap hashMap = m.f;
        if (hashMap == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap.put("sdk-version", String.valueOf(i));
        m.a("model", Build.MODEL);
        m.a("hardware", Build.HARDWARE);
        m.a("device", Build.DEVICE);
        m.a("product", Build.PRODUCT);
        m.a("os-uild", Build.ID);
        m.a("manufacturer", Build.MANUFACTURER);
        m.a(HiAnalyticsConstant.HaKey.BI_KEY_FINGERPRINT, Build.FINGERPRINT);
        Calendar.getInstance();
        long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
        HashMap hashMap2 = m.f;
        if (hashMap2 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap2.put("tz-offset", String.valueOf(offset));
        int h = activeNetworkInfo == null ? NetworkConnectionInfo.NetworkType.NONE.h() : activeNetworkInfo.getType();
        HashMap hashMap3 = m.f;
        if (hashMap3 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap3.put("net-type", String.valueOf(h));
        int i2 = -1;
        if (activeNetworkInfo == null) {
            subtype = NetworkConnectionInfo.MobileSubtype.UNKNOWN_MOBILE_SUBTYPE.h();
        } else {
            subtype = activeNetworkInfo.getSubtype();
            if (subtype == -1) {
                subtype = NetworkConnectionInfo.MobileSubtype.COMBINED.h();
            } else if (NetworkConnectionInfo.MobileSubtype.a(subtype) == null) {
                subtype = 0;
            }
        }
        HashMap hashMap4 = m.f;
        if (hashMap4 == null) {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
        hashMap4.put("mobile-subtype", String.valueOf(subtype));
        m.a("country", Locale.getDefault().getCountry());
        m.a("locale", Locale.getDefault().getLanguage());
        Context context = this.c;
        String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
        if (simOperator == null) {
            simOperator = "";
        }
        m.a("mcc_mnc", simOperator);
        try {
            i2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            b200.b("CctTransportBackend", "Unable to find version code for package", e);
        }
        m.a("application_build", Integer.toString(i2));
        return m.b();
    }
}
