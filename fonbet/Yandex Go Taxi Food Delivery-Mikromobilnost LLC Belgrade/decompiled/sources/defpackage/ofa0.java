package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.internal.g;
import com.google.android.play.core.splitinstall.internal.d;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import core.flex.ui.OrientationAwareRecyclerView;
import flex.engine.section.ui.StickyHostLayout;
import flex.loader.DocumentFetchOrigin;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import just.adapter.sticky.StickyGravity;
import just.adapter.sticky.b;
import kotlin.a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.yaplus.YaPlusStatusRepository;
import ru.yandex.taxi.yaplus.e;

/* loaded from: classes8.dex */
public final class ofa0 implements n86, wyi0, mhs0, i531 {
    public final Object a;
    public Object b;
    public Object c;
    public Object w;

    public ofa0(String str) {
        this.a = b64.j(str, ".SuggestCard.Appeared");
        this.b = b64.j(str, ".SuggestCard.ShortcutShown");
        this.c = b64.j(str, ".SuggestCard.ButtonClicked");
        this.w = b64.j(str, ".SuggestCard.Scrolled");
    }

    public b A(StickyGravity stickyGravity, sls slsVar) {
        e6q0 e6q0Var = (e6q0) this.c;
        h6q0 h6q0Var = (h6q0) this.w;
        OrientationAwareRecyclerView orientationAwareRecyclerView = (OrientationAwareRecyclerView) this.b;
        StickyHostLayout stickyHostLayout = (StickyHostLayout) this.a;
        int i = eeu0.a[stickyGravity.ordinal()];
        final int i2 = 2;
        final int i3 = 1;
        if (i == 1) {
            final ydu0 ydu0Var = new ydu0(new tls(this) { // from class: beu0
                public final /* synthetic */ ofa0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    aeu0 f;
                    aeu0 f2;
                    aeu0 f3;
                    aeu0 f4;
                    int i4 = i2;
                    ofa0 ofa0Var = this.b;
                    Integer num = (Integer) obj;
                    num.getClass();
                    switch (i4) {
                        case 0:
                            xdu0 xdu0Var = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var == null || (f = xdu0Var.f()) == null || !f.b) ? false : true);
                        case 1:
                            xdu0 xdu0Var2 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var2 == null || (f2 = xdu0Var2.f()) == null || !((Boolean) f2.e.invoke(StickyGravity.END)).booleanValue()) ? false : true);
                        case 2:
                            xdu0 xdu0Var3 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var3 == null || (f3 = xdu0Var3.f()) == null || !f3.a) ? false : true);
                        default:
                            xdu0 xdu0Var4 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var4 == null || (f4 = xdu0Var4.f()) == null || !((Boolean) f4.e.invoke(StickyGravity.START)).booleanValue()) ? false : true);
                    }
                }
            });
            final int i4 = 3;
            return new b(stickyHostLayout, orientationAwareRecyclerView, ydu0Var, new g2u0(new f2u0()), StickyGravity.START, new ceu0(i3), slsVar, new tls() { // from class: deu0
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i5 = i3;
                    int i6 = -1;
                    int i7 = 0;
                    ydu0 ydu0Var2 = ydu0Var;
                    int intValue = ((Integer) obj).intValue();
                    switch (i5) {
                        case 0:
                            ArrayList arrayList = ydu0Var2.b;
                            int f = scc.f(arrayList);
                            while (i7 <= f) {
                                int i8 = (i7 + f) >>> 1;
                                if (((Number) arrayList.get(i8)).intValue() >= intValue) {
                                    if (i8 > 0) {
                                        f = i8 - 1;
                                        if (((Number) arrayList.get(f)).intValue() >= intValue) {
                                        }
                                    }
                                    i6 = i8;
                                    return Integer.valueOf(i6);
                                }
                                i7 = i8 + 1;
                            }
                            return Integer.valueOf(i6);
                        default:
                            ArrayList arrayList2 = ydu0Var2.b;
                            int f2 = scc.f(arrayList2);
                            while (i7 <= f2) {
                                int i9 = (i7 + f2) >>> 1;
                                if (((Number) arrayList2.get(i9)).intValue() <= intValue) {
                                    if (i9 < scc.f(arrayList2)) {
                                        i7 = i9 + 1;
                                        if (((Number) arrayList2.get(i7)).intValue() <= intValue) {
                                        }
                                    }
                                    i6 = i9;
                                    return Integer.valueOf(i6);
                                }
                                f2 = i9 - 1;
                            }
                            return Integer.valueOf(i6);
                    }
                }
            }, h6q0Var, new vdu0(new tls(this) { // from class: beu0
                public final /* synthetic */ ofa0 b;

                {
                    this.b = this;
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    aeu0 f;
                    aeu0 f2;
                    aeu0 f3;
                    aeu0 f4;
                    int i42 = i4;
                    ofa0 ofa0Var = this.b;
                    Integer num = (Integer) obj;
                    num.getClass();
                    switch (i42) {
                        case 0:
                            xdu0 xdu0Var = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var == null || (f = xdu0Var.f()) == null || !f.b) ? false : true);
                        case 1:
                            xdu0 xdu0Var2 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var2 == null || (f2 = xdu0Var2.f()) == null || !((Boolean) f2.e.invoke(StickyGravity.END)).booleanValue()) ? false : true);
                        case 2:
                            xdu0 xdu0Var3 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var3 == null || (f3 = xdu0Var3.f()) == null || !f3.a) ? false : true);
                        default:
                            xdu0 xdu0Var4 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                            return Boolean.valueOf((xdu0Var4 == null || (f4 = xdu0Var4.f()) == null || !((Boolean) f4.e.invoke(StickyGravity.START)).booleanValue()) ? false : true);
                    }
                }
            }), e6q0Var);
        }
        if (i != 2) {
            w511.b();
            return null;
        }
        final int i5 = 0;
        final ydu0 ydu0Var2 = new ydu0(new tls(this) { // from class: beu0
            public final /* synthetic */ ofa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                aeu0 f;
                aeu0 f2;
                aeu0 f3;
                aeu0 f4;
                int i42 = i5;
                ofa0 ofa0Var = this.b;
                Integer num = (Integer) obj;
                num.getClass();
                switch (i42) {
                    case 0:
                        xdu0 xdu0Var = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var == null || (f = xdu0Var.f()) == null || !f.b) ? false : true);
                    case 1:
                        xdu0 xdu0Var2 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var2 == null || (f2 = xdu0Var2.f()) == null || !((Boolean) f2.e.invoke(StickyGravity.END)).booleanValue()) ? false : true);
                    case 2:
                        xdu0 xdu0Var3 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var3 == null || (f3 = xdu0Var3.f()) == null || !f3.a) ? false : true);
                    default:
                        xdu0 xdu0Var4 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var4 == null || (f4 = xdu0Var4.f()) == null || !((Boolean) f4.e.invoke(StickyGravity.START)).booleanValue()) ? false : true);
                }
            }
        });
        return new b(stickyHostLayout, orientationAwareRecyclerView, ydu0Var2, new h0o(new g0o()), StickyGravity.END, new ceu0(i5), slsVar, new tls() { // from class: deu0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                int i52 = i5;
                int i6 = -1;
                int i7 = 0;
                ydu0 ydu0Var22 = ydu0Var2;
                int intValue = ((Integer) obj).intValue();
                switch (i52) {
                    case 0:
                        ArrayList arrayList = ydu0Var22.b;
                        int f = scc.f(arrayList);
                        while (i7 <= f) {
                            int i8 = (i7 + f) >>> 1;
                            if (((Number) arrayList.get(i8)).intValue() >= intValue) {
                                if (i8 > 0) {
                                    f = i8 - 1;
                                    if (((Number) arrayList.get(f)).intValue() >= intValue) {
                                    }
                                }
                                i6 = i8;
                                return Integer.valueOf(i6);
                            }
                            i7 = i8 + 1;
                        }
                        return Integer.valueOf(i6);
                    default:
                        ArrayList arrayList2 = ydu0Var22.b;
                        int f2 = scc.f(arrayList2);
                        while (i7 <= f2) {
                            int i9 = (i7 + f2) >>> 1;
                            if (((Number) arrayList2.get(i9)).intValue() <= intValue) {
                                if (i9 < scc.f(arrayList2)) {
                                    i7 = i9 + 1;
                                    if (((Number) arrayList2.get(i7)).intValue() <= intValue) {
                                    }
                                }
                                i6 = i9;
                                return Integer.valueOf(i6);
                            }
                            f2 = i9 - 1;
                        }
                        return Integer.valueOf(i6);
                }
            }
        }, h6q0Var, new vdu0(new tls(this) { // from class: beu0
            public final /* synthetic */ ofa0 b;

            {
                this.b = this;
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                aeu0 f;
                aeu0 f2;
                aeu0 f3;
                aeu0 f4;
                int i42 = i3;
                ofa0 ofa0Var = this.b;
                Integer num = (Integer) obj;
                num.getClass();
                switch (i42) {
                    case 0:
                        xdu0 xdu0Var = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var == null || (f = xdu0Var.f()) == null || !f.b) ? false : true);
                    case 1:
                        xdu0 xdu0Var2 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var2 == null || (f2 = xdu0Var2.f()) == null || !((Boolean) f2.e.invoke(StickyGravity.END)).booleanValue()) ? false : true);
                    case 2:
                        xdu0 xdu0Var3 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var3 == null || (f3 = xdu0Var3.f()) == null || !f3.a) ? false : true);
                    default:
                        xdu0 xdu0Var4 = (xdu0) ((e6q0) ofa0Var.c).invoke(num);
                        return Boolean.valueOf((xdu0Var4 == null || (f4 = xdu0Var4.f()) == null || !((Boolean) f4.e.invoke(StickyGravity.START)).booleanValue()) ? false : true);
                }
            }
        }), e6q0Var);
    }

    public yr31 B(g0c g0cVar, String str) {
        yr31 yr31Var;
        yr31 create;
        synchronized (((g1x0) this.w)) {
            try {
                yr31Var = (yr31) ((qs31) this.a).a.get(str);
                if (g0cVar.e(yr31Var)) {
                    Object obj = (hs31) this.b;
                    if (obj instanceof js31) {
                        ((js31) obj).a(yr31Var);
                    }
                } else {
                    nx40 nx40Var = new nx40((y8f) this.c);
                    nx40Var.b(ls31.b, str);
                    hs31 hs31Var = (hs31) this.b;
                    try {
                        try {
                            create = hs31Var.create(g0cVar, nx40Var);
                        } catch (AbstractMethodError unused) {
                            create = hs31Var.create(g0cVar.a());
                        }
                    } catch (AbstractMethodError unused2) {
                        create = hs31Var.create(g0cVar.a(), nx40Var);
                    }
                    yr31Var = create;
                    yr31 yr31Var2 = (yr31) ((qs31) this.a).a.put(str, yr31Var);
                    if (yr31Var2 != null) {
                        yr31Var2.T();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return yr31Var;
    }

    public void C(h2u0 h2u0Var) {
        bsq0 bsq0Var = new bsq0(4, this, h2u0Var);
        synchronized (this.c) {
        }
        ((jjh) this.a).a.postDelayed(bsq0Var, 5400000L);
    }

    public Bundle D() {
        JSONObject jSONObject;
        String string;
        String string2;
        int hashCode;
        o5a1 o5a1Var = (o5a1) this.w;
        if (((Bundle) this.c) == null) {
            String str = (String) this.a;
            SharedPreferences Kg = o5a1Var.Kg();
            g gVar = (g) o5a1Var.b;
            String string3 = Kg.getString(str, null);
            if (string3 != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string3);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        try {
                            jSONObject = jSONArray.getJSONObject(i);
                            string = jSONObject.getString("n");
                            string2 = jSONObject.getString("t");
                            hashCode = string2.hashCode();
                        } catch (NumberFormatException | JSONException unused) {
                            y1a1 y1a1Var = gVar.y;
                            g.g(y1a1Var);
                            y1a1Var.z.a("Error reading value from SharedPreferences. Value dropped");
                        }
                        if (hashCode != 100) {
                            if (hashCode != 108) {
                                if (hashCode != 115) {
                                    if (hashCode != 3352) {
                                        if (hashCode == 3445 && string2.equals("la")) {
                                            eib1.a();
                                            if (gVar.w.Qg(null, nw91.Q0)) {
                                                JSONArray jSONArray2 = new JSONArray(jSONObject.getString("v"));
                                                int length = jSONArray2.length();
                                                long[] jArr = new long[length];
                                                for (int i2 = 0; i2 < length; i2++) {
                                                    jArr[i2] = jSONArray2.optLong(i2);
                                                }
                                                bundle.putLongArray(string, jArr);
                                            }
                                        }
                                    } else if (string2.equals("ia")) {
                                        eib1.a();
                                        if (gVar.w.Qg(null, nw91.Q0)) {
                                            JSONArray jSONArray3 = new JSONArray(jSONObject.getString("v"));
                                            int length2 = jSONArray3.length();
                                            int[] iArr = new int[length2];
                                            for (int i3 = 0; i3 < length2; i3++) {
                                                iArr[i3] = jSONArray3.optInt(i3);
                                            }
                                            bundle.putIntArray(string, iArr);
                                        }
                                    }
                                } else if (string2.equals("s")) {
                                    bundle.putString(string, jSONObject.getString("v"));
                                }
                            } else if (string2.equals("l")) {
                                bundle.putLong(string, Long.parseLong(jSONObject.getString("v")));
                            }
                        } else if (string2.equals("d")) {
                            bundle.putDouble(string, Double.parseDouble(jSONObject.getString("v")));
                        }
                        y1a1 y1a1Var2 = gVar.y;
                        g.g(y1a1Var2);
                        y1a1Var2.z.b(string2, "Unrecognized persisted bundle type. Type");
                    }
                    this.c = bundle;
                } catch (JSONException unused2) {
                    y1a1 y1a1Var3 = gVar.y;
                    g.g(y1a1Var3);
                    y1a1Var3.z.a("Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (((Bundle) this.c) == null) {
                this.c = (Bundle) this.b;
            }
        }
        Bundle bundle2 = (Bundle) this.c;
        cvw.l(bundle2);
        return new Bundle(bundle2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00dc, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Couldn't find manifest entry at top-level.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
    
        if (((android.content.res.XmlResourceParser) r0.a).getName().equals("manifest") == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0073, code lost:
    
        r4 = ((android.content.res.XmlResourceParser) r0.a).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCode");
        r5 = ((android.content.res.XmlResourceParser) r0.a).getAttributeValue("http://schemas.android.com/apk/res/android", "versionCodeMajor");
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r4 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        r4 = java.lang.Integer.parseInt(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r5 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0097, code lost:
    
        r4 = (java.lang.Integer.parseInt(r5) << 32) | (r4 & ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues.maxDWORD);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00bb, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(defpackage.g8e.o("Couldn't parse versionCodeMajor to int: ", r11.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00bc, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cc, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(defpackage.g8e.o("Couldn't parse versionCode to int: ", r11.getMessage()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d4, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("Manifest entry doesn't contain 'versionCode' attribute.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E(File[] fileArr) {
        PackageInfo packageInfo;
        long parseInt;
        qc20 qc20Var = (qc20) this.c;
        Context context = (Context) this.b;
        if (((PackageInfo) this.w) == null) {
            try {
                this.w = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        packageInfo = (PackageInfo) this.w;
        long longVersionCode = packageInfo.getLongVersionCode();
        AssetManager assetManager = (AssetManager) ora1.g();
        int length = fileArr.length;
        loop0: do {
            length--;
            if (length < 0) {
                return true;
            }
            XmlResourceParser openXmlResourceParser = assetManager.openXmlResourceParser(((Integer) ora1.h(assetManager, "addAssetPath", Integer.class, String.class, fileArr[length].getPath())).intValue(), "AndroidManifest.xml");
            qc20Var.a = openXmlResourceParser;
            if (openXmlResourceParser == null) {
                throw new XmlPullParserException("Manifest file needs to be loaded before parsing.");
            }
            while (true) {
                int next = ((XmlResourceParser) qc20Var.a).next();
                if (next == 2) {
                    break;
                }
                if (next == 1) {
                    break loop0;
                }
            }
        } while (longVersionCode == parseInt);
        return false;
    }

    public void F(Bundle bundle) {
        o5a1 o5a1Var = (o5a1) this.w;
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        SharedPreferences Kg = o5a1Var.Kg();
        g gVar = (g) o5a1Var.b;
        SharedPreferences.Editor edit = Kg.edit();
        int size = bundle2.size();
        String str = (String) this.a;
        if (size == 0) {
            edit.remove(str);
        } else {
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle2.keySet()) {
                Object obj = bundle2.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        eib1.a();
                        if (!gVar.w.Qg(null, nw91.Q0)) {
                            jSONObject.put("v", obj.toString());
                            if (obj instanceof String) {
                                jSONObject.put("t", "s");
                            } else if (obj instanceof Long) {
                                jSONObject.put("t", "l");
                            } else if (obj instanceof Double) {
                                jSONObject.put("t", "d");
                            } else {
                                y1a1 y1a1Var = gVar.y;
                                g.g(y1a1Var);
                                y1a1Var.z.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                            }
                        } else if (obj instanceof String) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "l");
                        } else if (obj instanceof int[]) {
                            jSONObject.put("v", Arrays.toString((int[]) obj));
                            jSONObject.put("t", "ia");
                        } else if (obj instanceof long[]) {
                            jSONObject.put("v", Arrays.toString((long[]) obj));
                            jSONObject.put("t", "la");
                        } else if (obj instanceof Double) {
                            jSONObject.put("v", obj.toString());
                            jSONObject.put("t", "d");
                        } else {
                            y1a1 y1a1Var2 = gVar.y;
                            g.g(y1a1Var2);
                            y1a1Var2.z.b(obj.getClass(), "Cannot serialize bundle value to SharedPreferences. Type");
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e) {
                        y1a1 y1a1Var3 = gVar.y;
                        g.g(y1a1Var3);
                        y1a1Var3.z.b(e, "Cannot serialize bundle value to SharedPreferences");
                    }
                }
            }
            edit.putString(str, jSONArray.toString());
        }
        edit.apply();
        this.c = bundle2;
    }

    public boolean G(File[] fileArr) {
        PackageInfo packageInfo;
        String absolutePath;
        X509Certificate x509Certificate;
        Context context = (Context) this.b;
        ArrayList<X509Certificate> arrayList = null;
        if (((PackageInfo) this.w) == null) {
            try {
                this.w = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
        }
        packageInfo = (PackageInfo) this.w;
        if (packageInfo != null && packageInfo.signatures != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Signature signature : packageInfo.signatures) {
                try {
                    x509Certificate = (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                } catch (CertificateException e) {
                    Log.e("SplitCompat", "Cannot decode certificate.", e);
                    x509Certificate = null;
                }
                if (x509Certificate != null) {
                    arrayList2.add(x509Certificate);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            Log.e("SplitCompat", "No app certificates found.");
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                absolutePath = fileArr[length].getAbsolutePath();
                try {
                    X509Certificate[][] a = d.a(absolutePath);
                    if (a == null || a.length == 0 || a[0].length == 0) {
                        break;
                    }
                    if (arrayList.isEmpty()) {
                        Log.e("SplitCompat", "No certificates found for app.");
                        break;
                    }
                    for (X509Certificate x509Certificate2 : arrayList) {
                        for (X509Certificate[] x509CertificateArr : a) {
                            int i = x509CertificateArr[0].equals(x509Certificate2) ? 0 : i + 1;
                        }
                        Log.i("SplitCompat", "There's an app certificate that doesn't sign the split.");
                    }
                } catch (Exception e2) {
                    Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.", e2);
                }
            } catch (Exception e3) {
                Log.e("SplitCompat", "Split verification error.", e3);
                return false;
            }
        }
        Log.e("SplitCompat", "Downloaded split " + absolutePath + " is not signed.");
        Log.e("SplitCompat", "Split verification failure.");
        return false;
    }

    @Override // defpackage.wyi0
    public void c(long j, String str, String str2) {
        ((o631) this.a).e(j, String.format("FlexSectionRenderTime.%s.%s", Arrays.copyOf(new Object[]{str, str2}, 2)));
    }

    @Override // defpackage.f531
    public long e(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        int b = sj2Var.b();
        long j = 0;
        for (int i = 0; i < b; i++) {
            j = Math.max(j, ((wj2) this.a).get(i).c(sj2Var.a(i), sj2Var2.a(i), sj2Var3.a(i)));
        }
        return j;
    }

    @Override // defpackage.mhs0
    public void h(Canvas canvas, RectF rectF) {
        Paint paint = (Paint) this.c;
        sb2 sb2Var = ((zrv) this.a).b;
        yrv yrvVar = (yrv) sb2Var;
        float f = yrvVar.z;
        wrv wrvVar = yrvVar.y;
        Paint paint2 = (Paint) this.b;
        paint2.setColor(sb2Var.r());
        float f2 = wrvVar.h;
        canvas.drawRoundRect(rectF, f2, f2, paint2);
        int i = yrvVar.A;
        if (i == 0 || f == 0.0f) {
            return;
        }
        paint.setColor(i);
        paint.setStrokeWidth(f);
        canvas.drawRoundRect(rectF, f2, f2, paint);
    }

    @Override // defpackage.f531
    public sj2 i(sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        sj2 sj2Var4;
        if (((sj2) this.w) == null) {
            this.w = sj2Var3.c();
        }
        sj2 sj2Var5 = (sj2) this.w;
        if (sj2Var5 == null) {
            sj2Var5 = null;
        }
        int b = sj2Var5.b();
        int i = 0;
        while (true) {
            sj2Var4 = (sj2) this.w;
            if (i >= b) {
                break;
            }
            if (sj2Var4 == null) {
                sj2Var4 = null;
            }
            sj2Var4.e(((wj2) this.a).get(i).d(sj2Var.a(i), sj2Var2.a(i), sj2Var3.a(i)), i);
            i++;
        }
        if (sj2Var4 == null) {
            return null;
        }
        return sj2Var4;
    }

    @Override // defpackage.f531
    public sj2 k(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        sj2 sj2Var4;
        if (((sj2) this.c) == null) {
            this.c = sj2Var3.c();
        }
        sj2 sj2Var5 = (sj2) this.c;
        if (sj2Var5 == null) {
            sj2Var5 = null;
        }
        int b = sj2Var5.b();
        int i = 0;
        while (true) {
            sj2Var4 = (sj2) this.c;
            if (i >= b) {
                break;
            }
            if (sj2Var4 == null) {
                sj2Var4 = null;
            }
            sj2Var4.e(((wj2) this.a).get(i).b(j, sj2Var.a(i), sj2Var2.a(i), sj2Var3.a(i)), i);
            i++;
        }
        if (sj2Var4 == null) {
            return null;
        }
        return sj2Var4;
    }

    @Override // defpackage.wyi0
    public void l(String str, String str2, i3y i3yVar) {
        y(str, str2, (Map) i3yVar.getValue());
    }

    @Override // defpackage.wyi0
    public void m(String str, String str2, i3y i3yVar) {
        z(str, str2, (Map) i3yVar.getValue());
    }

    @Override // defpackage.f531
    public sj2 n(long j, sj2 sj2Var, sj2 sj2Var2, sj2 sj2Var3) {
        sj2 sj2Var4;
        if (((sj2) this.b) == null) {
            this.b = sj2Var.c();
        }
        sj2 sj2Var5 = (sj2) this.b;
        if (sj2Var5 == null) {
            sj2Var5 = null;
        }
        int b = sj2Var5.b();
        int i = 0;
        while (true) {
            sj2Var4 = (sj2) this.b;
            if (i >= b) {
                break;
            }
            if (sj2Var4 == null) {
                sj2Var4 = null;
            }
            sj2Var4.e(((wj2) this.a).get(i).e(j, sj2Var.a(i), sj2Var2.a(i), sj2Var3.a(i)), i);
            i++;
        }
        if (sj2Var4 == null) {
            return null;
        }
        return sj2Var4;
    }

    @Override // defpackage.n86
    public void o(Context context, int i, int i2, int i3, int i4, int i5, Integer num, String str, boolean z) {
        int intValue = num != null ? num.intValue() : sb2.A((bjs0) this.b, context, -1);
        String str2 = str == null ? (String) this.a : str;
        n86 n86Var = (n86) this.w;
        if (n86Var != null) {
            n86Var.o(context, i, i2, i3, i4, i5, Integer.valueOf(intValue), str2, ((Boolean) this.c).booleanValue());
        }
    }

    @Override // defpackage.wyi0
    public void p(String str, String str2) {
        ((ConcurrentHashMap) this.c).put(str2, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // defpackage.wyi0
    public void q(long j, String str, String str2) {
        ((o631) this.a).j(j, String.format("FlexCellRenderTime.%s.%s", Arrays.copyOf(new Object[]{str, str2}, 2)));
    }

    @Override // defpackage.mhs0
    public void s(Canvas canvas, float f, float f2, bb1 bb1Var, int i, float f3, int i2) {
        Paint paint = (Paint) this.c;
        wrv wrvVar = (wrv) bb1Var;
        float f4 = wrvVar.h;
        Paint paint2 = (Paint) this.b;
        paint2.setColor(i);
        RectF rectF = (RectF) this.w;
        float f5 = wrvVar.f / 2.0f;
        float f6 = f - f5;
        rectF.left = f6;
        float f7 = wrvVar.g / 2.0f;
        float f8 = f2 - f7;
        rectF.top = f8;
        float f9 = f5 + f;
        rectF.right = f9;
        float f10 = f7 + f2;
        rectF.bottom = f10;
        if (f3 > 0.0f) {
            float f11 = f3 / 2.0f;
            rectF.left = f6 + f11;
            rectF.top = f8 + f11;
            rectF.right = f9 - f11;
            rectF.bottom = f10 - f11;
        }
        canvas.drawRoundRect(rectF, f4, f4, paint2);
        if (i2 == 0 || f3 == 0.0f) {
            return;
        }
        paint.setColor(i2);
        paint.setStrokeWidth(f3);
        canvas.drawRoundRect(rectF, f4, f4, paint);
    }

    @Override // defpackage.wyi0
    public void u(String str, String str2) {
        ((ConcurrentHashMap) this.b).put(str2, Long.valueOf(System.currentTimeMillis()));
    }

    public void v(h2u0 h2u0Var) {
        Runnable runnable;
        synchronized (this.c) {
            runnable = (Runnable) ((LinkedHashMap) this.w).remove(h2u0Var);
        }
        if (runnable != null) {
            ((jjh) this.a).a.removeCallbacks(runnable);
        }
    }

    public kaa0 w() {
        f3a0 f3a0Var = (f3a0) ((i3y) this.w).getValue();
        hca0 hca0Var = (hca0) ((i3y) this.c).getValue();
        ((wyj) ((xyj) this.b)).getClass();
        return new kaa0(f3a0Var, hca0Var, wyj.e);
    }

    public void x() {
        ((c) this.a).b("openBuyPlusWebView", true);
        ((com.yandex.go.payments.paymentlist.data.c) ((cda0) this.c)).p();
        ((e) this.b).g.a = YaPlusStatusRepository.JoinPlusStatus.PROCESSING;
        ((qyz) this.w).a.a();
    }

    public void y(String str, String str2, Map map) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((ConcurrentHashMap) this.c).remove(str2);
        if (l != null) {
            ((o631) this.a).i(currentTimeMillis - l.longValue(), String.format("FlexContentRenderTime.%s.PaginationViewShowTime", Arrays.copyOf(new Object[]{str}, 1)));
        }
    }

    public void z(String str, String str2, Map map) {
        Integer o;
        o631 o631Var = (o631) this.a;
        Long l = (Long) ((ConcurrentHashMap) this.b).remove(str2);
        if (l != null) {
            long currentTimeMillis = System.currentTimeMillis() - l.longValue();
            o631Var.g(currentTimeMillis, String.format("FlexContentRenderTime.%s", Arrays.copyOf(new Object[]{str}, 1)));
            String str3 = (String) map.get("sourceType");
            if (jl40.l(str3, DocumentFetchOrigin.Cache.getValue())) {
                o631Var.g(currentTimeMillis, String.format("FlexContentRenderTime.%s", Arrays.copyOf(new Object[]{str}, 1)).concat(".cached"));
            } else {
                if (jl40.l(str3, DocumentFetchOrigin.Preview.getValue()) || (o = qke.o((ConcurrentHashMap) this.w, str, (String) map.get("pageToken"))) == null) {
                    return;
                }
                o631Var.g(currentTimeMillis, qv10.h(o.intValue(), String.format("FlexContentRenderTime.%s", Arrays.copyOf(new Object[]{str}, 1)), ".page_"));
            }
        }
    }

    public ofa0(Context context, ndi0 ndi0Var) {
        qc20 qc20Var = new qc20();
        this.a = ndi0Var;
        this.b = context;
        this.c = qc20Var;
    }

    public ofa0(o5a1 o5a1Var, String str) {
        this.w = o5a1Var;
        cvw.i(str);
        this.a = str;
        this.b = new Bundle();
    }

    public ofa0(zrv zrvVar) {
        this.a = zrvVar;
        this.b = new Paint(1);
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        this.c = paint;
        this.w = new RectF();
    }

    public ofa0(o631 o631Var) {
        this.a = o631Var;
        this.b = new ConcurrentHashMap();
        this.c = new ConcurrentHashMap();
        this.w = new ConcurrentHashMap();
    }

    public ofa0(au50 au50Var, gp50 gp50Var, sls slsVar) {
        this.a = au50Var;
        this.b = gp50Var;
        this.c = slsVar;
        this.w = new x43();
    }

    public ofa0(com.ybsdk.rconfig.b bVar, qpi0 qpi0Var, AppAnalyticsReporter appAnalyticsReporter, String str, String str2, w42 w42Var) {
        this.a = bVar;
        this.b = qpi0Var;
        this.c = appAnalyticsReporter;
        this.w = w42Var;
    }

    public ofa0(mhd0 mhd0Var, e5o e5oVar, n4u0 n4u0Var, xyj xyjVar) {
        this.a = n4u0Var;
        this.b = xyjVar;
        this.c = a.a(new f9a0(19));
        this.w = a.a(new in2(16, mhd0Var, e5oVar, this));
    }

    public ofa0(zqd0 zqd0Var, kld0 kld0Var, com.yandex.div.core.expression.variables.a aVar, wqd0 wqd0Var, tt2 tt2Var) {
        this.a = zqd0Var;
        this.b = kld0Var;
        this.c = aVar;
        this.w = tt2Var;
    }

    public ofa0(v7d0 v7d0Var, qgd0 qgd0Var, jse jseVar) {
        this.a = v7d0Var;
        this.b = qgd0Var;
        this.c = jseVar;
        this.w = a.a(new t9a0(15, this));
    }

    public ofa0(jjh jjhVar, r951 r951Var) {
        this.a = jjhVar;
        this.b = r951Var;
        this.c = new Object();
        this.w = new LinkedHashMap();
    }

    public ofa0(String str, bjs0 bjs0Var, Boolean bool) {
        this.a = str;
        this.b = bjs0Var;
        this.c = bool;
    }

    public ofa0(qs31 qs31Var, hs31 hs31Var, y8f y8fVar) {
        this.a = qs31Var;
        this.b = hs31Var;
        this.c = y8fVar;
        this.w = new g1x0();
    }

    public ofa0(u5g u5gVar, edf0 edf0Var, i5g i5gVar, xvf0 xvf0Var) {
        this.b = u5gVar;
        this.a = edf0Var;
        this.c = i5gVar;
        this.w = xvf0Var;
    }

    public /* synthetic */ ofa0(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.w = obj4;
    }

    public ofa0(wj2 wj2Var) {
        this.a = wj2Var;
    }

    public ofa0(ynr ynrVar) {
        this(new va90(ynrVar));
    }
}
