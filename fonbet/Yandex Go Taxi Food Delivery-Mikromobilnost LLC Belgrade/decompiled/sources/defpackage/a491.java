package defpackage;

import android.util.Log;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.e0;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.i;
import com.google.android.gms.internal.measurement.j;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.o0;
import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.n;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* loaded from: classes11.dex */
public final class a491 {
    public final String a;
    public final int b;
    public Boolean c;
    public Boolean d;
    public Long e;
    public Long f;
    public final /* synthetic */ int g;
    public final /* synthetic */ r491 h;
    public final a1 i;

    public a491(r491 r491Var, String str, int i, a1 a1Var, int i2) {
        this.g = i2;
        this.h = r491Var;
        this.a = str;
        this.b = i;
        this.i = a1Var;
    }

    public static Boolean c(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Boolean d(String str, k kVar, y1a1 y1a1Var) {
        List w;
        cvw.l(kVar);
        if (str != null && kVar.r() && kVar.z() != 1 && (kVar.z() != 7 ? kVar.s() : kVar.x() != 0)) {
            int z = kVar.z();
            boolean v = kVar.v();
            String t = (v || z == 2 || z == 7) ? kVar.t() : kVar.t().toUpperCase(Locale.ENGLISH);
            if (kVar.x() == 0) {
                w = null;
            } else {
                w = kVar.w();
                if (!v) {
                    ArrayList arrayList = new ArrayList(w.size());
                    Iterator it = w.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                    }
                    w = Collections.unmodifiableList(arrayList);
                }
            }
            String str2 = z == 2 ? t : null;
            if (z != 7 ? t != null : w != null && !w.isEmpty()) {
                if (!v && z != 2) {
                    str = str.toUpperCase(Locale.ENGLISH);
                }
                switch (z - 1) {
                    case 1:
                        if (str2 != null) {
                            try {
                                return Boolean.valueOf(Pattern.compile(str2, true != v ? 66 : 0).matcher(str).matches());
                            } catch (PatternSyntaxException unused) {
                                if (y1a1Var != null) {
                                    y1a1Var.C.b(str2, "Invalid regular expression in REGEXP audience filter. expression");
                                    break;
                                }
                            }
                        }
                        break;
                    case 2:
                        return Boolean.valueOf(str.startsWith(t));
                    case 3:
                        return Boolean.valueOf(str.endsWith(t));
                    case 4:
                        return Boolean.valueOf(str.contains(t));
                    case 5:
                        return Boolean.valueOf(str.equals(t));
                    case 6:
                        if (w != null) {
                            return Boolean.valueOf(w.contains(str));
                        }
                        break;
                }
            }
        }
        return null;
    }

    public static Boolean e(BigDecimal bigDecimal, i iVar, double d) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        cvw.l(iVar);
        if (iVar.r()) {
            if (iVar.B() != 1 && (iVar.B() != 5 ? iVar.u() : iVar.w() && iVar.y())) {
                int B = iVar.B();
                try {
                    if (iVar.B() == 5) {
                        if (f3a1.mh(iVar.x()) && f3a1.mh(iVar.z())) {
                            BigDecimal bigDecimal5 = new BigDecimal(iVar.x());
                            bigDecimal4 = new BigDecimal(iVar.z());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        }
                    } else if (f3a1.mh(iVar.v())) {
                        bigDecimal2 = new BigDecimal(iVar.v());
                        bigDecimal3 = null;
                        bigDecimal4 = null;
                    }
                    if (B != 5 ? bigDecimal2 != null : bigDecimal3 != null) {
                        int i = B - 1;
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    if (i == 4 && bigDecimal3 != null) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal3) >= 0 && bigDecimal.compareTo(bigDecimal4) <= 0);
                                    }
                                } else if (bigDecimal2 != null) {
                                    if (d != 0.0d) {
                                        return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d).multiply(new BigDecimal(2)))) > 0 && bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d).multiply(new BigDecimal(2)))) < 0);
                                    }
                                    return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) == 0);
                                }
                            } else if (bigDecimal2 != null) {
                                return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) > 0);
                            }
                        } else if (bigDecimal2 != null) {
                            return Boolean.valueOf(bigDecimal.compareTo(bigDecimal2) < 0);
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03c8 A[EDGE_INSN: B:160:0x03c8->B:52:0x03c8 BREAK  A[LOOP:3: B:132:0x0245->B:157:0x0245], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(Long l, Long l2, e0 e0Var, long j, w891 w891Var, boolean z) {
        boolean z2;
        y1a1 y1a1Var;
        Boolean bool;
        Boolean bool2;
        long j2;
        Boolean bool3;
        Boolean bool4;
        int i;
        cfb1.a();
        r491 r491Var = this.h;
        g gVar = (g) r491Var.b;
        j691 j691Var = gVar.w;
        y1a1 y1a1Var2 = gVar.y;
        i0a1 i0a1Var = gVar.C;
        gw91 gw91Var = nw91.F0;
        String str = this.a;
        boolean Qg = j691Var.Qg(str, gw91Var);
        com.google.android.gms.internal.measurement.g gVar2 = (com.google.android.gms.internal.measurement.g) this.i;
        long j3 = gVar2.C() ? w891Var.e : j;
        g.g(y1a1Var2);
        l1a1 l1a1Var = y1a1Var2.H;
        l1a1 l1a1Var2 = y1a1Var2.C;
        boolean isLoggable = Log.isLoggable(y1a1Var2.Qg(), 2);
        int i2 = this.b;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        r16 = null;
        Boolean bool5 = null;
        if (isLoggable) {
            g.g(y1a1Var2);
            l1a1Var.d("Evaluating filter. audience, filter, event", Integer.valueOf(i2), gVar2.r() ? Integer.valueOf(gVar2.s()) : null, i0a1Var.a(gVar2.t()));
            g.g(y1a1Var2);
            f3a1 f3a1Var = r491Var.c.z;
            n.O(f3a1Var);
            StringBuilder sb = new StringBuilder();
            sb.append("\nevent_filter {\n");
            if (gVar2.r()) {
                i = 0;
                f3a1.Yg(sb, 0, "filter_id", Integer.valueOf(gVar2.s()));
            } else {
                i = 0;
            }
            f3a1.Yg(sb, i, "event_name", ((g) f3a1Var.b).C.a(gVar2.t()));
            String Ug = f3a1.Ug(gVar2.z(), gVar2.A(), gVar2.C());
            if (!Ug.isEmpty()) {
                f3a1.Yg(sb, 0, "filter_type", Ug);
            }
            if (gVar2.x()) {
                f3a1.Zg(sb, 1, "event_count_filter", gVar2.y());
            }
            if (gVar2.v() > 0) {
                sb.append("  filters {\n");
                Iterator it = gVar2.u().iterator();
                while (it.hasNext()) {
                    f3a1Var.Rg(sb, 2, (h) it.next());
                }
            }
            f3a1.Sg(sb, 1);
            sb.append("}\n}\n");
            l1a1Var.b(sb.toString(), "Filter definition");
        }
        if (!gVar2.r() || gVar2.s() > 256) {
            g.g(y1a1Var2);
            l1a1Var2.c("Invalid event filter ID. appId, id", y1a1.Og(str), String.valueOf(gVar2.r() ? Integer.valueOf(gVar2.s()) : null));
            return false;
        }
        boolean z3 = gVar2.z() || gVar2.A() || gVar2.C();
        if (z && !z3) {
            g.g(y1a1Var2);
            l1a1Var.c("Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(i2), gVar2.r() ? Integer.valueOf(gVar2.s()) : null);
            return true;
        }
        String u = e0Var.u();
        if (gVar2.x()) {
            try {
                bool4 = e(new BigDecimal(j3), gVar2.y(), 0.0d);
            } catch (NumberFormatException unused) {
                bool4 = null;
            }
            if (bool4 != null) {
                if (!bool4.booleanValue()) {
                    bool5 = Boolean.FALSE;
                }
            }
            z2 = Qg;
            y1a1Var = y1a1Var2;
            g.g(y1a1Var);
            l1a1Var.b(bool5 == null ? "null" : bool5, "Event filter result");
            if (bool5 == null) {
                return false;
            }
            Boolean bool6 = Boolean.TRUE;
            this.c = bool6;
            if (!bool5.booleanValue()) {
                return true;
            }
            this.d = bool6;
            if (!z3 || !e0Var.v()) {
                return true;
            }
            Long valueOf = Long.valueOf(e0Var.w());
            if (gVar2.A()) {
                if (z2 && gVar2.x()) {
                    valueOf = l;
                }
                this.f = valueOf;
                return true;
            }
            if (z2 && gVar2.x()) {
                valueOf = l2;
            }
            this.e = valueOf;
            return true;
        }
        HashSet hashSet = new HashSet();
        Iterator it2 = gVar2.u().iterator();
        while (true) {
            if (!it2.hasNext()) {
                w53 w53Var = new w53();
                Iterator it3 = e0Var.r().iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        Iterator it4 = gVar2.u().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                z2 = Qg;
                                y1a1Var = y1a1Var2;
                                bool5 = Boolean.TRUE;
                                break;
                            }
                            h hVar = (h) it4.next();
                            boolean z4 = hVar.v() && hVar.w();
                            String y = hVar.y();
                            if (y.isEmpty()) {
                                g.g(y1a1Var2);
                                l1a1Var2.b(i0a1Var.a(u), "Event has empty param name. event");
                                break;
                            }
                            Object obj = w53Var.get(y);
                            if (obj instanceof Long) {
                                if (!hVar.t()) {
                                    g.g(y1a1Var2);
                                    l1a1Var2.c("No number filter for long param. event, param", i0a1Var.a(u), i0a1Var.b(y));
                                    break;
                                }
                                try {
                                    bool = e(new BigDecimal(((Long) obj).longValue()), hVar.u(), 0.0d);
                                } catch (NumberFormatException unused2) {
                                    bool = null;
                                }
                                if (bool == null) {
                                    break;
                                }
                                if (bool.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof Double) {
                                if (!hVar.t()) {
                                    g.g(y1a1Var2);
                                    l1a1Var2.c("No number filter for double param. event, param", i0a1Var.a(u), i0a1Var.b(y));
                                    break;
                                }
                                double doubleValue = ((Double) obj).doubleValue();
                                try {
                                    bool2 = e(new BigDecimal(doubleValue), hVar.u(), Math.ulp(doubleValue));
                                } catch (NumberFormatException unused3) {
                                    bool2 = null;
                                }
                                if (bool2 == null) {
                                    break;
                                }
                                if (bool2.booleanValue() == z4) {
                                    bool5 = Boolean.FALSE;
                                    break;
                                }
                            } else if (obj instanceof String) {
                                if (!hVar.r()) {
                                    if (!hVar.t()) {
                                        z2 = Qg;
                                        y1a1Var = y1a1Var2;
                                        g.g(y1a1Var);
                                        l1a1Var2.c("No filter for String param. event, param", i0a1Var.a(u), i0a1Var.b(y));
                                        break;
                                    }
                                    String str2 = (String) obj;
                                    if (!f3a1.mh(str2)) {
                                        z2 = Qg;
                                        y1a1Var = y1a1Var2;
                                        g.g(y1a1Var);
                                        l1a1Var2.c("Invalid param value for number filter. event, param", i0a1Var.a(u), i0a1Var.b(y));
                                        break;
                                    }
                                    i u2 = hVar.u();
                                    if (f3a1.mh(str2)) {
                                        try {
                                            z2 = Qg;
                                            y1a1Var = y1a1Var2;
                                            j2 = 0;
                                            try {
                                                bool3 = e(new BigDecimal(str2), u2, 0.0d);
                                            } catch (NumberFormatException unused4) {
                                                bool3 = null;
                                                if (bool3 == null) {
                                                }
                                                g.g(y1a1Var);
                                                l1a1Var.b(bool5 == null ? "null" : bool5, "Event filter result");
                                                if (bool5 == null) {
                                                }
                                            }
                                        } catch (NumberFormatException unused5) {
                                            z2 = Qg;
                                            y1a1Var = y1a1Var2;
                                            j2 = 0;
                                        }
                                        if (bool3 == null) {
                                            break;
                                        }
                                        if (bool3.booleanValue() == z4) {
                                            bool5 = Boolean.FALSE;
                                            break;
                                        }
                                        y1a1Var2 = y1a1Var;
                                        Qg = z2;
                                    } else {
                                        z2 = Qg;
                                        y1a1Var = y1a1Var2;
                                        bool3 = null;
                                    }
                                } else {
                                    k s = hVar.s();
                                    g.g(y1a1Var2);
                                    bool3 = d((String) obj, s, y1a1Var2);
                                    z2 = Qg;
                                    y1a1Var = y1a1Var2;
                                }
                                j2 = 0;
                                if (bool3 == null) {
                                }
                            } else {
                                z2 = Qg;
                                y1a1Var = y1a1Var2;
                                if (obj == null) {
                                    g.g(y1a1Var);
                                    l1a1Var.c("Missing param for filter. event, param", i0a1Var.a(u), i0a1Var.b(y));
                                    bool5 = Boolean.FALSE;
                                } else {
                                    g.g(y1a1Var);
                                    l1a1Var2.c("Unknown param type. event, param", i0a1Var.a(u), i0a1Var.b(y));
                                }
                            }
                        }
                    } else {
                        g0 g0Var = (g0) it3.next();
                        if (hashSet.contains(g0Var.s())) {
                            if (!g0Var.v()) {
                                if (!g0Var.z()) {
                                    if (!g0Var.t()) {
                                        g.g(y1a1Var2);
                                        l1a1Var2.c("Unknown value for param. event, param", i0a1Var.a(u), i0a1Var.b(g0Var.s()));
                                        break;
                                    }
                                    w53Var.put(g0Var.s(), g0Var.u());
                                } else {
                                    w53Var.put(g0Var.s(), g0Var.z() ? Double.valueOf(g0Var.A()) : null);
                                }
                            } else {
                                w53Var.put(g0Var.s(), g0Var.v() ? Long.valueOf(g0Var.w()) : null);
                            }
                        }
                    }
                }
            } else {
                h hVar2 = (h) it2.next();
                if (hVar2.y().isEmpty()) {
                    g.g(y1a1Var2);
                    l1a1Var2.b(i0a1Var.a(u), "null or empty param name in filter. event");
                    break;
                }
                hashSet.add(hVar2.y());
            }
        }
        g.g(y1a1Var);
        l1a1Var.b(bool5 == null ? "null" : bool5, "Event filter result");
        if (bool5 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean b(Long l, Long l2, o0 o0Var, boolean z) {
        boolean z2;
        Boolean c;
        Boolean e;
        Boolean bool;
        Boolean bool2;
        cfb1.a();
        g gVar = (g) this.h.b;
        j691 j691Var = gVar.w;
        i0a1 i0a1Var = gVar.C;
        y1a1 y1a1Var = gVar.y;
        boolean Qg = j691Var.Qg(this.a, nw91.D0);
        j jVar = (j) this.i;
        boolean v = jVar.v();
        boolean w = jVar.w();
        boolean y = jVar.y();
        boolean z3 = v || w || y;
        if (z && !z3) {
            g.g(y1a1Var);
            y1a1Var.H.c("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", Integer.valueOf(this.b), jVar.r() ? Integer.valueOf(jVar.s()) : null);
            return true;
        }
        h u = jVar.u();
        boolean w2 = u.w();
        if (!o0Var.w()) {
            z2 = y;
            if (!o0Var.A()) {
                if (o0Var.u()) {
                    if (u.r()) {
                        String v2 = o0Var.v();
                        k s = u.s();
                        g.g(y1a1Var);
                        c = c(d(v2, s, y1a1Var), w2);
                    } else if (!u.t()) {
                        g.g(y1a1Var);
                        y1a1Var.C.b(i0a1Var.c(o0Var.t()), "No string or number filter defined. property");
                    } else if (f3a1.mh(o0Var.v())) {
                        String v3 = o0Var.v();
                        i u2 = u.u();
                        if (f3a1.mh(v3)) {
                            try {
                                e = e(new BigDecimal(v3), u2, 0.0d);
                            } catch (NumberFormatException unused) {
                            }
                            c = c(e, w2);
                        }
                        e = null;
                        c = c(e, w2);
                    } else {
                        g.g(y1a1Var);
                        y1a1Var.C.c("Invalid user property value for Numeric number filter. property, value", i0a1Var.c(o0Var.t()), o0Var.v());
                    }
                    g.g(y1a1Var);
                    y1a1Var.H.b(c != null ? "null" : c, "Property filter result");
                    if (c != null) {
                    }
                } else {
                    g.g(y1a1Var);
                    y1a1Var.C.b(i0a1Var.c(o0Var.t()), "User property has no value, property");
                }
                c = null;
                g.g(y1a1Var);
                y1a1Var.H.b(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                }
            } else if (u.t()) {
                double B = o0Var.B();
                try {
                    bool = e(new BigDecimal(B), u.u(), Math.ulp(B));
                } catch (NumberFormatException unused2) {
                    bool = null;
                }
                c = c(bool, w2);
                g.g(y1a1Var);
                y1a1Var.H.b(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                }
            } else {
                g.g(y1a1Var);
                y1a1Var.C.b(i0a1Var.c(o0Var.t()), "No number filter for double property. property");
                c = null;
                g.g(y1a1Var);
                y1a1Var.H.b(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                }
            }
        } else {
            if (!u.t()) {
                g.g(y1a1Var);
                y1a1Var.C.b(i0a1Var.c(o0Var.t()), "No number filter for long property. property");
                z2 = y;
                c = null;
                g.g(y1a1Var);
                y1a1Var.H.b(c != null ? "null" : c, "Property filter result");
                if (c != null) {
                    return false;
                }
                this.c = Boolean.TRUE;
                if (!z2 || c.booleanValue()) {
                    if (!z || jVar.v()) {
                        this.d = c;
                    }
                    if (c.booleanValue() && z3 && o0Var.r()) {
                        long s2 = o0Var.s();
                        if (l != null) {
                            s2 = l.longValue();
                        }
                        if (Qg && jVar.v() && !jVar.w() && l2 != null) {
                            s2 = l2.longValue();
                        }
                        if (jVar.w()) {
                            this.f = Long.valueOf(s2);
                        } else {
                            this.e = Long.valueOf(s2);
                        }
                    }
                }
                return true;
            }
            z2 = y;
            try {
                bool2 = e(new BigDecimal(o0Var.x()), u.u(), 0.0d);
            } catch (NumberFormatException unused3) {
                bool2 = null;
            }
            c = c(bool2, w2);
            g.g(y1a1Var);
            y1a1Var.H.b(c != null ? "null" : c, "Property filter result");
            if (c != null) {
            }
        }
    }
}
