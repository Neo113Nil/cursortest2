package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.a0;
import com.google.android.gms.internal.measurement.b0;
import com.google.android.gms.internal.measurement.c0;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.i0;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.j0;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l0;
import com.google.android.gms.internal.measurement.m0;
import com.google.android.gms.internal.measurement.n0;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.internal.measurement.x;
import com.google.android.gms.internal.measurement.z;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import com.google.android.gms.measurement.internal.zzbe;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzoh;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.common.startup.StartupRequest;

/* loaded from: classes.dex */
public final class f3a1 extends sab1 {
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3a1(n nVar, int i) {
        super(nVar);
        this.x = i;
    }

    public static zzbg Kg(y391 y391Var) {
        Object obj;
        Bundle Lg = Lg(y391Var.c(), true);
        String obj2 = (!Lg.containsKey("_o") || (obj = Lg.get("_o")) == null) ? "app" : obj.toString();
        String Z = udq0.Z(y391Var.b(), cma1.c, cma1.e);
        if (Z == null) {
            Z = y391Var.b();
        }
        return new zzbg(Z, new zzbe(Lg), obj2, y391Var.a());
    }

    public static Bundle Lg(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(Lg((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void Mg(y7a1 y7a1Var, String str, Long l) {
        List i = y7a1Var.i();
        int i2 = 0;
        while (true) {
            if (i2 >= i.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((g0) i.get(i2)).s())) {
                break;
            } else {
                i2++;
            }
        }
        a9a1 D = g0.D();
        D.i(str);
        D.l(l.longValue());
        if (i2 < 0) {
            y7a1Var.o(D);
        } else {
            y7a1Var.d();
            ((e0) y7a1Var.b).C(i2, (g0) D.f());
        }
    }

    public static final Bundle Ng(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            String s = g0Var.s();
            if (g0Var.z()) {
                bundle.putDouble(s, g0Var.A());
            } else if (g0Var.x()) {
                bundle.putFloat(s, g0Var.y());
            } else if (g0Var.t()) {
                bundle.putString(s, g0Var.u());
            } else if (g0Var.v()) {
                bundle.putLong(s, g0Var.w());
            }
        }
        return bundle;
    }

    public static final g0 Og(e0 e0Var, String str) {
        for (g0 g0Var : e0Var.r()) {
            if (g0Var.s().equals(str)) {
                return g0Var;
            }
        }
        return null;
    }

    public static final Serializable Pg(e0 e0Var, String str) {
        g0 Og = Og(e0Var, str);
        if (Og == null) {
            return null;
        }
        return Vg(Og);
    }

    public static final void Sg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void Tg(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String Ug(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable Vg(g0 g0Var) {
        if (g0Var.t()) {
            return g0Var.u();
        }
        if (g0Var.v()) {
            return Long.valueOf(g0Var.w());
        }
        if (g0Var.z()) {
            return Double.valueOf(g0Var.A());
        }
        if (g0Var.C() > 0) {
            return vh((z0b1) g0Var.B());
        }
        return null;
    }

    public static final void Wg(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                Tg(builder, str3, string, set);
            }
        }
    }

    public static final void Xg(StringBuilder sb, String str, l0 l0Var) {
        if (l0Var == null) {
            return;
        }
        Sg(sb, 3);
        sb.append(str);
        sb.append(" {\n");
        if (l0Var.u() != 0) {
            Sg(sb, 4);
            sb.append("results: ");
            int i = 0;
            for (Long l : l0Var.t()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(Extension.FIX_SPACE);
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (l0Var.s() != 0) {
            Sg(sb, 4);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : l0Var.r()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(Extension.FIX_SPACE);
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (l0Var.w() != 0) {
            Sg(sb, 4);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (d0 d0Var : l0Var.v()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(Extension.FIX_SPACE);
                }
                sb.append(d0Var.r() ? Integer.valueOf(d0Var.s()) : null);
                sb.append(":");
                sb.append(d0Var.t() ? Long.valueOf(d0Var.u()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (l0Var.y() != 0) {
            Sg(sb, 4);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (m0 m0Var : l0Var.x()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(Extension.FIX_SPACE);
                }
                sb.append(m0Var.r() ? Integer.valueOf(m0Var.s()) : null);
                sb.append(": [");
                Iterator it = m0Var.t().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(Extension.FIX_SPACE);
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        Sg(sb, 3);
        sb.append("}\n");
    }

    public static final void Yg(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        Sg(sb, i + 1);
        sb.append(str);
        sb.append(Extension.COLON_SPACE);
        sb.append(obj);
        sb.append('\n');
    }

    public static final void Zg(StringBuilder sb, int i, String str, i iVar) {
        if (iVar == null) {
            return;
        }
        Sg(sb, i);
        sb.append(str);
        sb.append(" {\n");
        if (iVar.r()) {
            int B = iVar.B();
            Yg(sb, i, "comparison_type", B != 1 ? B != 2 ? B != 3 ? B != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (iVar.s()) {
            Yg(sb, i, "match_as_float", Boolean.valueOf(iVar.t()));
        }
        if (iVar.u()) {
            Yg(sb, i, "comparison_value", iVar.v());
        }
        if (iVar.w()) {
            Yg(sb, i, "min_comparison_value", iVar.x());
        }
        if (iVar.y()) {
            Yg(sb, i, "max_comparison_value", iVar.z());
        }
        Sg(sb, i);
        sb.append("}\n");
    }

    private final void bh() {
    }

    private final void ch() {
    }

    private final void dh() {
    }

    public static boolean mh(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean nh(t0b1 t0b1Var, int i) {
        if (i < t0b1Var.size() * 64) {
            return ((1 << (i % 64)) & ((Long) t0b1Var.get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList oh(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static eqa1 th(kya1 kya1Var, byte[] bArr) {
        awa1 awa1Var;
        awa1 awa1Var2 = awa1.b;
        if (awa1Var2 == null) {
            synchronized (awa1.class) {
                try {
                    awa1Var = awa1.b;
                    if (awa1Var == null) {
                        a7b1 a7b1Var = a7b1.c;
                        awa1Var = sxa1.b();
                        awa1.b = awa1Var;
                    }
                } finally {
                }
            }
            awa1Var2 = awa1Var;
        }
        if (awa1Var2 != null) {
            kya1Var.getClass();
            kya1Var.h(bArr, bArr.length, awa1Var2);
            return kya1Var;
        }
        kya1Var.getClass();
        int length = bArr.length;
        awa1 awa1Var3 = awa1.b;
        a7b1 a7b1Var2 = a7b1.c;
        kya1Var.h(bArr, length, awa1.c);
        return kya1Var;
    }

    public static int uh(String str, zaa1 zaa1Var) {
        for (int i = 0; i < ((j0) zaa1Var.b).X1(); i++) {
            if (str.equals(((j0) zaa1Var.b).Y1(i).t())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] vh(z0b1 z0b1Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = z0b1Var.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (g0Var != null) {
                Bundle bundle = new Bundle();
                for (g0 g0Var2 : g0Var.B()) {
                    if (g0Var2.t()) {
                        bundle.putString(g0Var2.s(), g0Var2.u());
                    } else if (g0Var2.v()) {
                        bundle.putLong(g0Var2.s(), g0Var2.w());
                    } else if (g0Var2.z()) {
                        bundle.putDouble(g0Var2.s(), g0Var2.A());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(wh(false, (android.os.Bundle) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(wh(false, (android.os.Bundle) r8));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(wh(false, (android.os.Bundle) r3));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap wh(boolean z, Bundle bundle) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    @Override // defpackage.sab1
    public final void Jg() {
        int i = this.x;
    }

    public void Qg(StringBuilder sb, int i, z0b1 z0b1Var) {
        if (z0b1Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = z0b1Var.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (g0Var != null) {
                Sg(sb, i2);
                sb.append("param {\n");
                Yg(sb, i2, "name", g0Var.r() ? ((g) this.b).C.b(g0Var.s()) : null);
                Yg(sb, i2, "string_value", g0Var.t() ? g0Var.u() : null);
                Yg(sb, i2, "int_value", g0Var.v() ? Long.valueOf(g0Var.w()) : null);
                Yg(sb, i2, "double_value", g0Var.z() ? Double.valueOf(g0Var.A()) : null);
                if (g0Var.C() > 0) {
                    Qg(sb, i2, (z0b1) g0Var.B());
                }
                Sg(sb, i2);
                sb.append("}\n");
            }
        }
    }

    public void Rg(StringBuilder sb, int i, h hVar) {
        String str;
        if (hVar == null) {
            return;
        }
        Sg(sb, i);
        sb.append("filter {\n");
        if (hVar.v()) {
            Yg(sb, i, "complement", Boolean.valueOf(hVar.w()));
        }
        if (hVar.x()) {
            Yg(sb, i, "param_name", ((g) this.b).C.b(hVar.y()));
        }
        if (hVar.r()) {
            int i2 = i + 1;
            k s = hVar.s();
            if (s != null) {
                Sg(sb, i2);
                sb.append("string_filter {\n");
                if (s.r()) {
                    switch (s.z()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    Yg(sb, i2, "match_type", str);
                }
                if (s.s()) {
                    Yg(sb, i2, BduiExpressionResolverImpl.EXPRESSION_KEY, s.t());
                }
                if (s.u()) {
                    Yg(sb, i2, "case_sensitive", Boolean.valueOf(s.v()));
                }
                if (s.x() > 0) {
                    Sg(sb, i + 2);
                    sb.append("expression_list {\n");
                    for (String str2 : s.w()) {
                        Sg(sb, i + 3);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                Sg(sb, i2);
                sb.append("}\n");
            }
        }
        if (hVar.t()) {
            Zg(sb, i + 1, "number_filter", hVar.u());
        }
        Sg(sb, i);
        sb.append("}\n");
    }

    public boolean ah() {
        Hg();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((g) this.b).a.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void eh(String str, vab1 vab1Var, i0 i0Var, l2a1 l2a1Var) {
        String str2;
        URL url;
        byte[] d;
        aaa1 aaa1Var;
        Map map;
        String str3 = vab1Var.a;
        g gVar = (g) this.b;
        Gg();
        Hg();
        try {
            url = new URI(str3).toURL();
            this.c.d0();
            d = i0Var.d();
            aaa1Var = gVar.z;
            g.g(aaa1Var);
            map = vab1Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            aaa1Var.Sg(new x2a1(this, str2, url, d, map, l2a1Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            y1a1 y1a1Var = gVar.y;
            g.g(y1a1Var);
            y1a1Var.z.c("Failed to parse URL. Not uploading MeasurementBatch. appId", y1a1.Og(str2), str3);
        }
    }

    public void fh(sea1 sea1Var, Object obj) {
        cvw.l(obj);
        sea1Var.d();
        ((o0) sea1Var.b).G();
        sea1Var.d();
        ((o0) sea1Var.b).I();
        sea1Var.d();
        ((o0) sea1Var.b).K();
        if (obj instanceof String) {
            sea1Var.d();
            ((o0) sea1Var.b).F((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            sea1Var.d();
            ((o0) sea1Var.b).H(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            sea1Var.d();
            ((o0) sea1Var.b).J(doubleValue);
        } else {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.z.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void gh(a9a1 a9a1Var, Object obj) {
        a9a1Var.d();
        ((g0) a9a1Var.b).G();
        a9a1Var.d();
        ((g0) a9a1Var.b).I();
        a9a1Var.d();
        ((g0) a9a1Var.b).K();
        a9a1Var.d();
        ((g0) a9a1Var.b).N();
        if (obj instanceof String) {
            a9a1Var.j((String) obj);
            return;
        }
        if (obj instanceof Long) {
            a9a1Var.l(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            a9a1Var.d();
            ((g0) a9a1Var.b).J(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.z.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                a9a1 D = g0.D();
                for (String str : bundle.keySet()) {
                    a9a1 D2 = g0.D();
                    D2.i(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        D2.l(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        D2.j((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        D2.d();
                        ((g0) D2.b).J(doubleValue2);
                    }
                    D.d();
                    ((g0) D.b).L((g0) D2.f());
                }
                if (((g0) D.b).C() > 0) {
                    arrayList.add((g0) D.f());
                }
            }
        }
        a9a1Var.d();
        ((g0) a9a1Var.b).M(arrayList);
    }

    public zzoh hh(String str, zaa1 zaa1Var, y7a1 y7a1Var, String str2) {
        int indexOf;
        eib1.a();
        g gVar = (g) this.b;
        j691 j691Var = gVar.w;
        if (!j691Var.Qg(str, nw91.P0)) {
            return null;
        }
        gVar.D.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Set b = xra1.b(j691Var.Mg(str, nw91.u0).split(","));
        n nVar = this.c;
        yab1 yab1Var = nVar.C;
        p8a1 p8a1Var = nVar.a;
        p8a1 p8a1Var2 = yab1Var.c.a;
        n.O(p8a1Var2);
        String Tg = p8a1Var2.Tg(str);
        Uri.Builder builder = new Uri.Builder();
        j691 j691Var2 = ((g) yab1Var.b).w;
        builder.scheme(j691Var2.Mg(str, nw91.n0));
        if (TextUtils.isEmpty(Tg)) {
            builder.authority(j691Var2.Mg(str, nw91.o0));
        } else {
            String Mg = j691Var2.Mg(str, nw91.o0);
            StringBuilder sb = new StringBuilder(String.valueOf(Tg).length() + 1 + String.valueOf(Mg).length());
            sb.append(Tg);
            sb.append(Extension.DOT_CHAR);
            sb.append(Mg);
            builder.authority(sb.toString());
        }
        builder.path(j691Var2.Mg(str, nw91.p0));
        Tg(builder, "gmp_app_id", ((j0) zaa1Var.b).G(), b);
        j691Var.Lg();
        Tg(builder, "gmp_version", String.valueOf(133005L), b);
        String A = ((j0) zaa1Var.b).A();
        gw91 gw91Var = nw91.S0;
        if (j691Var.Qg(str, gw91Var)) {
            n.O(p8a1Var);
            if (p8a1Var.Zg(str)) {
                A = "";
            }
        }
        Tg(builder, "app_instance_id", A, b);
        Tg(builder, "rdid", ((j0) zaa1Var.b).x(), b);
        Tg(builder, "bundle_id", zaa1Var.r(), b);
        String q = y7a1Var.q();
        String Z = udq0.Z(q, cma1.e, cma1.c);
        if (true != TextUtils.isEmpty(Z)) {
            q = Z;
        }
        Tg(builder, "app_event_name", q, b);
        Tg(builder, StartupRequest.PARAM_APP_VERSION, String.valueOf(((j0) zaa1Var.b).M()), b);
        String k2 = ((j0) zaa1Var.b).k2();
        if (j691Var.Qg(str, gw91Var)) {
            n.O(p8a1Var);
            if (p8a1Var.Yg(str) && !TextUtils.isEmpty(k2) && (indexOf = k2.indexOf(Extension.DOT_CHAR)) != -1) {
                k2 = k2.substring(0, indexOf);
            }
        }
        Tg(builder, "os_version", k2, b);
        Tg(builder, ClidProvider.TIMESTAMP, String.valueOf(y7a1Var.r()), b);
        if (((j0) zaa1Var.b).z()) {
            Tg(builder, "lat", "1", b);
        }
        Tg(builder, "privacy_sandbox_version", String.valueOf(((j0) zaa1Var.b).I0()), b);
        Tg(builder, "trigger_uri_source", "1", b);
        Tg(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), b);
        Tg(builder, "request_uuid", str2, b);
        List<g0> i = y7a1Var.i();
        Bundle bundle = new Bundle();
        for (g0 g0Var : i) {
            String s = g0Var.s();
            if (g0Var.z()) {
                bundle.putString(s, String.valueOf(g0Var.A()));
            } else if (g0Var.x()) {
                bundle.putString(s, String.valueOf(g0Var.y()));
            } else if (g0Var.t()) {
                bundle.putString(s, g0Var.u());
            } else if (g0Var.v()) {
                bundle.putString(s, String.valueOf(g0Var.w()));
            }
        }
        Wg(builder, j691Var.Mg(str, nw91.t0).split("\\|"), bundle, b);
        List<o0> unmodifiableList = Collections.unmodifiableList(((j0) zaa1Var.b).W1());
        Bundle bundle2 = new Bundle();
        for (o0 o0Var : unmodifiableList) {
            String t = o0Var.t();
            if (o0Var.A()) {
                bundle2.putString(t, String.valueOf(o0Var.B()));
            } else if (o0Var.y()) {
                bundle2.putString(t, String.valueOf(o0Var.z()));
            } else if (o0Var.u()) {
                bundle2.putString(t, o0Var.v());
            } else if (o0Var.w()) {
                bundle2.putString(t, String.valueOf(o0Var.x()));
            }
        }
        Wg(builder, j691Var.Mg(str, nw91.s0).split("\\|"), bundle2, b);
        Tg(builder, "dma", true != ((j0) zaa1Var.b).F0() ? "0" : "1", b);
        if (!((j0) zaa1Var.b).H0().isEmpty()) {
            Tg(builder, "dma_cps", ((j0) zaa1Var.b).H0(), b);
        }
        if (((j0) zaa1Var.b).N0()) {
            x O0 = ((j0) zaa1Var.b).O0();
            if (!O0.B().isEmpty()) {
                Tg(builder, "dl_gclid", O0.B(), b);
            }
            if (!O0.D().isEmpty()) {
                Tg(builder, "dl_gbraid", O0.D(), b);
            }
            if (!O0.F().isEmpty()) {
                Tg(builder, "dl_gs", O0.F(), b);
            }
            if (O0.H() > 0) {
                Tg(builder, "dl_ss_ts", String.valueOf(O0.H()), b);
            }
            if (!O0.J().isEmpty()) {
                Tg(builder, "mr_gclid", O0.J(), b);
            }
            if (!O0.L().isEmpty()) {
                Tg(builder, "mr_gbraid", O0.L(), b);
            }
            if (!O0.N().isEmpty()) {
                Tg(builder, "mr_gs", O0.N(), b);
            }
            if (O0.P() > 0) {
                Tg(builder, "mr_click_ts", String.valueOf(O0.P()), b);
            }
        }
        return new zzoh(builder.build().toString(), currentTimeMillis, 1);
    }

    public e0 ih(s891 s891Var) {
        y7a1 B = e0.B();
        long j = s891Var.e;
        B.d();
        ((e0) B.b).J(j);
        zzbe zzbeVar = s891Var.f;
        Objects.requireNonNull(zzbeVar);
        for (String str : zzbeVar.zzg().keySet()) {
            a9a1 D = g0.D();
            D.i(str);
            Object zza = zzbeVar.zza(str);
            cvw.l(zza);
            gh(D, zza);
            B.o(D);
        }
        String str2 = s891Var.c;
        if (!TextUtils.isEmpty(str2) && zzbeVar.zza("_o") == null) {
            a9a1 D2 = g0.D();
            D2.i("_o");
            D2.j(str2);
            B.m((g0) D2.f());
        }
        return (e0) B.f();
    }

    public String jh(i0 i0Var) {
        z K0;
        StringBuilder t = qv10.t("\nbatch {\n");
        if (i0Var.w()) {
            Yg(t, 0, "upload_subdomain", i0Var.x());
        }
        if (i0Var.u()) {
            Yg(t, 0, "sgtm_join_id", i0Var.v());
        }
        for (j0 j0Var : i0Var.r()) {
            if (j0Var != null) {
                Sg(t, 1);
                t.append("bundle {\n");
                if (j0Var.R()) {
                    Yg(t, 1, CommonUrlParts.PROTOCOL_VERSION, Integer.valueOf(j0Var.R0()));
                }
                ((hkb1) bkb1.b.a.get()).getClass();
                g gVar = (g) this.b;
                j691 j691Var = gVar.w;
                i0a1 i0a1Var = gVar.C;
                if (j691Var.Qg(j0Var.r(), nw91.M0) && j0Var.x0()) {
                    Yg(t, 1, "session_stitching_token", j0Var.y0());
                }
                Yg(t, 1, "platform", j0Var.j2());
                if (j0Var.t()) {
                    Yg(t, 1, "gmp_version", Long.valueOf(j0Var.u()));
                }
                if (j0Var.v()) {
                    Yg(t, 1, "uploading_gmp_version", Long.valueOf(j0Var.w()));
                }
                if (j0Var.t0()) {
                    Yg(t, 1, "dynamite_version", Long.valueOf(j0Var.u0()));
                }
                if (j0Var.N()) {
                    Yg(t, 1, "config_version", Long.valueOf(j0Var.O()));
                }
                Yg(t, 1, "gmp_app_id", j0Var.G());
                Yg(t, 1, CommonUrlParts.APP_ID, j0Var.r());
                Yg(t, 1, StartupRequest.PARAM_APP_VERSION, j0Var.s());
                if (j0Var.L()) {
                    Yg(t, 1, "app_version_major", Integer.valueOf(j0Var.M()));
                }
                Yg(t, 1, "firebase_instance_id", j0Var.K());
                if (j0Var.B()) {
                    Yg(t, 1, "dev_cert_hash", Long.valueOf(j0Var.C()));
                }
                Yg(t, 1, "app_store", j0Var.p2());
                if (j0Var.Z1()) {
                    Yg(t, 1, "upload_timestamp_millis", Long.valueOf(j0Var.a2()));
                }
                if (j0Var.b2()) {
                    Yg(t, 1, "start_timestamp_millis", Long.valueOf(j0Var.c2()));
                }
                if (j0Var.d2()) {
                    Yg(t, 1, "end_timestamp_millis", Long.valueOf(j0Var.e2()));
                }
                if (j0Var.f2()) {
                    Yg(t, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(j0Var.g2()));
                }
                if (j0Var.h2()) {
                    Yg(t, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(j0Var.i2()));
                }
                Yg(t, 1, "app_instance_id", j0Var.A());
                Yg(t, 1, "resettable_device_id", j0Var.x());
                Yg(t, 1, "ds_id", j0Var.Q());
                if (j0Var.y()) {
                    Yg(t, 1, "limited_ad_tracking", Boolean.valueOf(j0Var.z()));
                }
                Yg(t, 1, "os_version", j0Var.k2());
                Yg(t, 1, MetaDataField.DEVICE_MODEL_FIELD, j0Var.l2());
                Yg(t, 1, "user_default_language", j0Var.m2());
                if (j0Var.n2()) {
                    Yg(t, 1, "time_zone_offset_minutes", Integer.valueOf(j0Var.o2()));
                }
                if (j0Var.D()) {
                    Yg(t, 1, "bundle_sequential_index", Integer.valueOf(j0Var.E()));
                }
                if (j0Var.L0()) {
                    Yg(t, 1, "delivery_index", Integer.valueOf(j0Var.M0()));
                }
                if (j0Var.H()) {
                    Yg(t, 1, "service_upload", Boolean.valueOf(j0Var.I()));
                }
                Yg(t, 1, "health_monitor", j0Var.F());
                if (j0Var.r0()) {
                    Yg(t, 1, "retry_counter", Integer.valueOf(j0Var.s0()));
                }
                if (j0Var.v0()) {
                    Yg(t, 1, "consent_signals", j0Var.w0());
                }
                if (j0Var.E0()) {
                    Yg(t, 1, "is_dma_region", Boolean.valueOf(j0Var.F0()));
                }
                if (j0Var.G0()) {
                    Yg(t, 1, "core_platform_services", j0Var.H0());
                }
                if (j0Var.C0()) {
                    Yg(t, 1, "consent_diagnostics", j0Var.D0());
                }
                if (j0Var.z0()) {
                    Yg(t, 1, "target_os_version", Long.valueOf(j0Var.A0()));
                }
                eib1.a();
                if (gVar.w.Qg(j0Var.r(), nw91.P0)) {
                    Yg(t, 1, "ad_services_version", Integer.valueOf(j0Var.I0()));
                    if (j0Var.J0() && (K0 = j0Var.K0()) != null) {
                        Sg(t, 2);
                        t.append("attribution_eligibility_status {\n");
                        Yg(t, 2, "eligible", Boolean.valueOf(K0.r()));
                        Yg(t, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(K0.s()));
                        Yg(t, 2, "pre_r", Boolean.valueOf(K0.t()));
                        Yg(t, 2, "r_extensions_too_old", Boolean.valueOf(K0.u()));
                        Yg(t, 2, "adservices_extension_too_old", Boolean.valueOf(K0.v()));
                        Yg(t, 2, "ad_storage_not_allowed", Boolean.valueOf(K0.w()));
                        Yg(t, 2, "measurement_manager_disabled", Boolean.valueOf(K0.x()));
                        Sg(t, 2);
                        t.append("}\n");
                    }
                }
                if (j0Var.N0()) {
                    x O0 = j0Var.O0();
                    Sg(t, 2);
                    t.append("ad_campaign_info {\n");
                    if (O0.A()) {
                        Yg(t, 2, "deep_link_gclid", O0.B());
                    }
                    if (O0.C()) {
                        Yg(t, 2, "deep_link_gbraid", O0.D());
                    }
                    if (O0.E()) {
                        Yg(t, 2, "deep_link_gad_source", O0.F());
                    }
                    if (O0.G()) {
                        Yg(t, 2, "deep_link_session_millis", Long.valueOf(O0.H()));
                    }
                    if (O0.I()) {
                        Yg(t, 2, "market_referrer_gclid", O0.J());
                    }
                    if (O0.K()) {
                        Yg(t, 2, "market_referrer_gbraid", O0.L());
                    }
                    if (O0.M()) {
                        Yg(t, 2, "market_referrer_gad_source", O0.N());
                    }
                    if (O0.O()) {
                        Yg(t, 2, "market_referrer_click_millis", Long.valueOf(O0.P()));
                    }
                    Sg(t, 2);
                    t.append("}\n");
                }
                if (j0Var.S()) {
                    Yg(t, 1, "batching_timestamp_millis", Long.valueOf(j0Var.T()));
                }
                if (j0Var.P0()) {
                    n0 Q0 = j0Var.Q0();
                    Sg(t, 2);
                    t.append("sgtm_diagnostics {\n");
                    int w = Q0.w();
                    Yg(t, 2, "upload_type", w != 1 ? w != 2 ? w != 3 ? w != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    Yg(t, 2, "client_upload_eligibility", Q0.r().name());
                    int x = Q0.x();
                    Yg(t, 2, "service_upload_eligibility", x != 1 ? x != 2 ? x != 3 ? x != 4 ? x != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    Sg(t, 2);
                    t.append("}\n");
                }
                if (j0Var.U()) {
                    c0 V = j0Var.V();
                    Sg(t, 2);
                    t.append("consent_info_extra {\n");
                    for (b0 b0Var : V.r()) {
                        Sg(t, 3);
                        t.append("limited_data_modes {\n");
                        int s = b0Var.s();
                        Yg(t, 3, "type", s != 1 ? s != 2 ? s != 3 ? s != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int t2 = b0Var.t();
                        Yg(t, 3, "mode", t2 != 1 ? t2 != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        Sg(t, 3);
                        t.append("}\n");
                    }
                    Sg(t, 2);
                    t.append("}\n");
                }
                z0b1<o0> W1 = j0Var.W1();
                if (W1 != null) {
                    for (o0 o0Var : W1) {
                        if (o0Var != null) {
                            Sg(t, 2);
                            t.append("user_property {\n");
                            Yg(t, 2, "set_timestamp_millis", o0Var.r() ? Long.valueOf(o0Var.s()) : null);
                            Yg(t, 2, "name", i0a1Var.c(o0Var.t()));
                            Yg(t, 2, "string_value", o0Var.v());
                            Yg(t, 2, "int_value", o0Var.w() ? Long.valueOf(o0Var.x()) : null);
                            Yg(t, 2, "double_value", o0Var.A() ? Double.valueOf(o0Var.B()) : null);
                            Sg(t, 2);
                            t.append("}\n");
                        }
                    }
                }
                z0b1<a0> J = j0Var.J();
                if (J != null) {
                    for (a0 a0Var : J) {
                        if (a0Var != null) {
                            Sg(t, 2);
                            t.append("audience_membership {\n");
                            if (a0Var.r()) {
                                Yg(t, 2, "audience_id", Integer.valueOf(a0Var.s()));
                            }
                            if (a0Var.w()) {
                                Yg(t, 2, "new_audience", Boolean.valueOf(a0Var.x()));
                            }
                            Xg(t, "current_data", a0Var.t());
                            if (a0Var.u()) {
                                Xg(t, "previous_data", a0Var.v());
                            }
                            Sg(t, 2);
                            t.append("}\n");
                        }
                    }
                }
                List<e0> R1 = j0Var.R1();
                if (R1 != null) {
                    for (e0 e0Var : R1) {
                        if (e0Var != null) {
                            Sg(t, 2);
                            t.append("event {\n");
                            Yg(t, 2, "name", i0a1Var.a(e0Var.u()));
                            if (e0Var.v()) {
                                Yg(t, 2, "timestamp_millis", Long.valueOf(e0Var.w()));
                            }
                            if (e0Var.x()) {
                                Yg(t, 2, "previous_timestamp_millis", Long.valueOf(e0Var.y()));
                            }
                            if (e0Var.z()) {
                                Yg(t, 2, "count", Integer.valueOf(e0Var.A()));
                            }
                            if (e0Var.s() != 0) {
                                Qg(t, 2, (z0b1) e0Var.r());
                            }
                            Sg(t, 2);
                            t.append("}\n");
                        }
                    }
                }
                Sg(t, 1);
                t.append("}\n");
            }
        }
        t.append("} // End-of-batch\n");
        return t.toString();
    }

    public String kh(j jVar) {
        StringBuilder t = qv10.t("\nproperty_filter {\n");
        if (jVar.r()) {
            Yg(t, 0, "filter_id", Integer.valueOf(jVar.s()));
        }
        Yg(t, 0, "property_name", ((g) this.b).C.c(jVar.t()));
        String Ug = Ug(jVar.v(), jVar.w(), jVar.y());
        if (!Ug.isEmpty()) {
            Yg(t, 0, "filter_type", Ug);
        }
        Rg(t, 1, jVar.u());
        t.append("}\n");
        return t.toString();
    }

    public Parcelable lh(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (SafeParcelReader$ParseException unused) {
                y1a1 y1a1Var = ((g) this.b).y;
                g.g(y1a1Var);
                y1a1Var.z.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public List ph(t0b1 t0b1Var, List list) {
        int i;
        g gVar = (g) this.b;
        ArrayList arrayList = new ArrayList(t0b1Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                y1a1 y1a1Var = gVar.y;
                g.g(y1a1Var);
                y1a1Var.C.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    y1a1 y1a1Var2 = gVar.y;
                    g.g(y1a1Var2);
                    y1a1Var2.C.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public boolean qh(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((g) this.b).D.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public long rh(byte[] bArr) {
        cvw.l(bArr);
        g gVar = (g) this.b;
        ieb1 ieb1Var = gVar.B;
        g.e(ieb1Var);
        ieb1Var.Gg();
        MessageDigest Xg = ieb1.Xg();
        if (Xg != null) {
            return ieb1.Yg(Xg.digest(bArr));
        }
        y1a1 y1a1Var = gVar.y;
        g.g(y1a1Var);
        y1a1Var.z.a("Failed to get MD5");
        return 0L;
    }

    public byte[] sh(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            y1a1 y1a1Var = ((g) this.b).y;
            g.g(y1a1Var);
            y1a1Var.z.b(e, "Failed to gzip content");
            throw e;
        }
    }
}
