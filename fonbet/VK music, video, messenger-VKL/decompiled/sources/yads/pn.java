package yads;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONObject;
import xsna.dli0;
import xsna.epx;
import xsna.j5g;
import xsna.jgp;
import xsna.t5j;
import xsna.uki0;

/* loaded from: classes10.dex */
public abstract class pn extends z83 {
    public final d4 C;
    public final String D;
    public final v12 E;
    public final iz2 F;
    public final ez2 G;
    public final b5 H;
    public final o9 I;
    public final Context J;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ pn(Context context, d4 d4Var, bu1 bu1Var, String str, String str2, v12 v12Var, vp2 vp2Var, oo ooVar, gq2 gq2Var, iz2 iz2Var, int i) {
        this(context, d4Var, bu1Var, str, str2, v12Var, vp2Var, ooVar, gq2Var, r11, new ez2(r11), new b5(), new o9());
        iz2 iz2Var2;
        if ((i & 512) != 0) {
            iz2.a.getClass();
            iz2Var2 = hz2.a(context);
        } else {
            iz2Var2 = iz2Var;
        }
    }

    @Override // yads.z83, yads.po, yads.qp2
    public final mn3 a(mn3 mn3Var) {
        int i = h4.d;
        return super.a((mn3) g4.a(mn3Var.b));
    }

    @Override // yads.qp2
    public final byte[] b() {
        if (1 != e()) {
            return null;
        }
        try {
            return this.D.getBytes(Charset.forName(C.UTF8_NAME));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // yads.z83, yads.qp2
    public Map d() {
        MapBuilder mapBuilder = new MapBuilder();
        String a = ((jz2) this.F).a();
        if (a != null) {
        }
        mapBuilder.put(w11.F.a(), this.H.b(this.J));
        mapBuilder.put(w11.G.a(), this.H.a(this.J));
        mapBuilder.putAll(this.C.c().a());
        return mapBuilder.h();
    }

    @Override // yads.qp2
    public final String g() {
        StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(this.D);
        }
        List list = this.C.b.a.b;
        if (sb.length() > 0 && !list.isEmpty()) {
            sb.append("&");
        }
        sb.append(j5g.g0(list, "&", null, null, 0, on.b, 30));
        return Uri.parse(this.d).buildUpon().encodedQuery(sb.toString()).build().toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0288 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0367  */
    /* JADX WARN: Type inference failed for: r15v1, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.util.LinkedHashMap, java.util.Map] */
    @Override // yads.z83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final wq2 a(g92 g92Var, int i) {
        ?? failure;
        Map map;
        Integer valueOf;
        String c;
        Integer valueOf2;
        int length;
        int i2;
        Locale locale;
        boolean b;
        Object obj;
        String c2;
        Integer valueOf3;
        String c3;
        String str;
        if (b(g92Var, i)) {
            Map map2 = g92Var.c;
            jgp jgpVar = jgp.b;
            Map map3 = map2 == null ? jgpVar : map2;
            String c4 = u01.c(map3, w11.R);
            if (c4 != null) {
                xy2 xy2Var = yy2.a;
                Context context = this.s;
                xy2Var.getClass();
                ((uh1) ((zy2) xy2.a(context)).b).a("ServerSideClientIP", c4);
            }
            if (204 != i) {
                String c5 = u01.c(map3, w11.e);
                if (c5 == null) {
                    c5 = "";
                }
                e00.c.getClass();
                e00 a = d00.a(c5);
                d4 d4Var = this.C;
                if (a == d4Var.a) {
                    k92 k92Var = new k92(d4Var, new zq2(this.E.a), new jr1(), new sr2(), new tz(), new h11(), new yh1(), new bf(), new w9());
                    this.G.a(map3);
                    int i3 = g92Var.a;
                    yq2 yq2Var = new yq2(g92Var.b);
                    Map map4 = g92Var.c;
                    if (map4 == null) {
                        map4 = jgpVar;
                    }
                    xq2 xq2Var = new xq2(i3, yq2Var, map4);
                    int d = u01.d(map3, w11.c);
                    int d2 = u01.d(map3, w11.d);
                    String c6 = u01.c(map3, w11.I);
                    String c7 = u01.c(map3, w11.J);
                    String c8 = u01.c(map3, w11.f);
                    String c9 = u01.c(map3, w11.L);
                    if (c9 != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(c9);
                            uki0 c10 = dli0.c(jSONObject.keys());
                            failure = new LinkedHashMap();
                            Iterator it = ((t5j) c10).iterator();
                            while (it.hasNext()) {
                                Object next = it.next();
                                Iterator it2 = it;
                                failure.put(next, jSONObject.get((String) next));
                                it = it2;
                            }
                        } catch (Throwable th) {
                            failure = new Result.Failure(th);
                        }
                        boolean z = failure instanceof Result.Failure;
                        Map map5 = failure;
                        if (z) {
                            map5 = null;
                        }
                        Map map6 = map5;
                        map = map6 == null ? jgpVar : map6;
                    } else {
                        map = null;
                    }
                    e13 e13Var = k92Var.a.d.a;
                    d13 b2 = e13Var != null ? e13Var.b() : null;
                    String c11 = u01.c(map3, w11.g);
                    int i4 = tb.b;
                    if (c11 != null) {
                        try {
                            valueOf = Integer.valueOf(c11);
                        } catch (NumberFormatException unused) {
                        }
                        Long valueOf4 = valueOf == null ? Long.valueOf(valueOf.intValue() * k92.i) : null;
                        c = u01.c(map3, w11.v);
                        int i5 = tb.b;
                        if (c != null) {
                            try {
                                valueOf2 = Integer.valueOf(c);
                            } catch (NumberFormatException unused2) {
                            }
                            Long valueOf5 = valueOf2 != null ? Long.valueOf(valueOf2.intValue() * k92.i) : null;
                            k92Var.g.getClass();
                            String c12 = u01.c(map3, w11.l);
                            Locale[] availableLocales = Locale.getAvailableLocales();
                            length = availableLocales.length;
                            i2 = 0;
                            while (true) {
                                if (i2 >= length) {
                                    locale = null;
                                    break;
                                }
                                if (epx.f(availableLocales[i2].getLanguage(), c12)) {
                                    locale = new Locale(c12);
                                    break;
                                }
                                i2++;
                            }
                            String c13 = u01.c(map3, w11.A);
                            boolean parseBoolean = c13 == null ? false : Boolean.parseBoolean(c13);
                            String c14 = u01.c(map3, w11.H);
                            boolean parseBoolean2 = c14 == null ? false : Boolean.parseBoolean(c14);
                            b = u01.b(map3, w11.o);
                            if (b) {
                                obj = null;
                            } else {
                                zq2 zq2Var = k92Var.b;
                                zq2Var.b.getClass();
                                int i6 = xq2Var.a;
                                byte[] bArr = xq2Var.b.a;
                                Map map7 = xq2Var.c;
                                obj = zq2Var.a.a(new g92(i6, bArr, map7, g92.a(map7), true));
                            }
                            ir1 a2 = b ? k92Var.c.a(xq2Var) : null;
                            String str2 = k92Var.a.c.a;
                            ArrayList e = u01.e(map3, w11.m);
                            k92Var.h.getClass();
                            c a3 = w9.a(map3);
                            String c15 = u01.c(map3, w11.k);
                            int d3 = u01.d(map3, w11.r);
                            int d4 = u01.d(map3, w11.s);
                            int d5 = u01.d(map3, w11.t);
                            int d6 = u01.d(map3, w11.y);
                            String c16 = u01.c(map3, w11.q);
                            boolean b3 = u01.b(map3, w11.i);
                            String c17 = u01.c(map3, w11.O);
                            String c18 = u01.c(map3, w11.P);
                            String c19 = u01.c(map3, w11.Q);
                            String c20 = u01.c(map3, w11.z);
                            k92Var.e.getClass();
                            sz szVar = (sz) tz.a.get(u01.c(map3, w11.p));
                            sr2 sr2Var = k92Var.d;
                            sr2Var.getClass();
                            Map map8 = xq2Var.c;
                            c2 = u01.c(map8, w11.u);
                            int i7 = tb.b;
                            if (c2 != null) {
                                try {
                                    valueOf3 = Integer.valueOf(c2);
                                } catch (NumberFormatException unused3) {
                                }
                                Locale locale2 = locale;
                                c3 = u01.c(map8, w11.w);
                                if (c3 == null) {
                                    sr2Var.a.getClass();
                                    str = hn.a(c3);
                                } else {
                                    str = null;
                                }
                                rv rvVar = (valueOf3 != null || str == null || str.length() <= 0) ? null : new rv(valueOf3.intValue(), str);
                                String str3 = (String) j5g.a0(u01.e(map8, w11.x));
                                rr2 rr2Var = new rr2(u01.b(map8, w11.C), rvVar, (str3 != null || str3.length() <= 0) ? null : new cz2(str3));
                                k92Var.f.getClass();
                                String c21 = u01.c(map3, w11.h);
                                j5 j5Var = (c21 != null || c21.length() <= 0) ? null : new j5(c21);
                                String c22 = u01.c(map3, w11.K);
                                boolean b4 = u01.b(map3, w11.M);
                                String c23 = u01.c(map3, w11.E);
                                xt0 xt0Var = c23 == null ? new xt0(c23) : null;
                                String c24 = u01.c(map3, w11.j);
                                boolean parseBoolean3 = c24 != null ? true : Boolean.parseBoolean(c24);
                                String c25 = u01.c(map3, w11.S);
                                boolean parseBoolean4 = c25 != null ? false : Boolean.parseBoolean(c25);
                                String c26 = u01.c(map3, w11.T);
                                boolean parseBoolean5 = c26 != null ? true : Boolean.parseBoolean(c26);
                                String c27 = u01.c(map3, w11.U);
                                boolean parseBoolean6 = c27 != null ? true : Boolean.parseBoolean(c27);
                                String c28 = u01.c(map3, w11.V);
                                boolean parseBoolean7 = c28 != null ? true : Boolean.parseBoolean(c28);
                                String c29 = u01.c(map3, w11.W);
                                boolean parseBoolean8 = c29 != null ? Boolean.parseBoolean(c29) : true;
                                String c30 = u01.c(map3, w11.X);
                                boolean parseBoolean9 = c30 != null ? false : Boolean.parseBoolean(c30);
                                String c31 = u01.c(map3, w11.Y);
                                boolean parseBoolean10 = c31 != null ? false : Boolean.parseBoolean(c31);
                                String c32 = u01.c(map3, w11.Z);
                                String c33 = u01.c(map3, w11.a0);
                                return new wq2(new v9(a, c6, c8, c7, str2, d, d2, e, a3, valueOf4, c15, locale2, j5Var, c22, c20, szVar, b2, c16, c17, a2, rr2Var, valueOf5, obj, map, c18, c19, b3, b, parseBoolean, parseBoolean2, d3, d4, d5, d6, b4, xt0Var, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8, parseBoolean9, parseBoolean10, c32, c33 != null ? false : Boolean.parseBoolean(c33), 4096, 0), x11.a(g92Var));
                            }
                            valueOf3 = null;
                            Locale locale22 = locale;
                            c3 = u01.c(map8, w11.w);
                            if (c3 == null) {
                            }
                            if (valueOf3 != null) {
                            }
                            String str32 = (String) j5g.a0(u01.e(map8, w11.x));
                            rr2 rr2Var2 = new rr2(u01.b(map8, w11.C), rvVar, (str32 != null || str32.length() <= 0) ? null : new cz2(str32));
                            k92Var.f.getClass();
                            String c212 = u01.c(map3, w11.h);
                            if (c212 != null) {
                            }
                            String c222 = u01.c(map3, w11.K);
                            boolean b42 = u01.b(map3, w11.M);
                            String c232 = u01.c(map3, w11.E);
                            if (c232 == null) {
                            }
                            String c242 = u01.c(map3, w11.j);
                            if (c242 != null) {
                            }
                            String c252 = u01.c(map3, w11.S);
                            if (c252 != null) {
                            }
                            String c262 = u01.c(map3, w11.T);
                            if (c262 != null) {
                            }
                            String c272 = u01.c(map3, w11.U);
                            if (c272 != null) {
                            }
                            String c282 = u01.c(map3, w11.V);
                            if (c282 != null) {
                            }
                            String c292 = u01.c(map3, w11.W);
                            boolean parseBoolean82 = c292 != null ? Boolean.parseBoolean(c292) : true;
                            String c302 = u01.c(map3, w11.X);
                            if (c302 != null) {
                            }
                            String c312 = u01.c(map3, w11.Y);
                            if (c312 != null) {
                            }
                            String c322 = u01.c(map3, w11.Z);
                            String c332 = u01.c(map3, w11.a0);
                            return new wq2(new v9(a, c6, c8, c7, str2, d, d2, e, a3, valueOf4, c15, locale22, j5Var, c222, c20, szVar, b2, c16, c17, a2, rr2Var2, valueOf5, obj, map, c18, c19, b3, b, parseBoolean, parseBoolean2, d3, d4, d5, d6, b42, xt0Var, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean82, parseBoolean9, parseBoolean10, c322, c332 != null ? false : Boolean.parseBoolean(c332), 4096, 0), x11.a(g92Var));
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        k92Var.g.getClass();
                        String c122 = u01.c(map3, w11.l);
                        Locale[] availableLocales2 = Locale.getAvailableLocales();
                        length = availableLocales2.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                            }
                            i2++;
                        }
                        String c132 = u01.c(map3, w11.A);
                        if (c132 == null) {
                        }
                        String c142 = u01.c(map3, w11.H);
                        if (c142 == null) {
                        }
                        b = u01.b(map3, w11.o);
                        if (b) {
                        }
                        if (b) {
                        }
                        String str22 = k92Var.a.c.a;
                        ArrayList e2 = u01.e(map3, w11.m);
                        k92Var.h.getClass();
                        c a32 = w9.a(map3);
                        String c152 = u01.c(map3, w11.k);
                        int d32 = u01.d(map3, w11.r);
                        int d42 = u01.d(map3, w11.s);
                        int d52 = u01.d(map3, w11.t);
                        int d62 = u01.d(map3, w11.y);
                        String c162 = u01.c(map3, w11.q);
                        boolean b32 = u01.b(map3, w11.i);
                        String c172 = u01.c(map3, w11.O);
                        String c182 = u01.c(map3, w11.P);
                        String c192 = u01.c(map3, w11.Q);
                        String c202 = u01.c(map3, w11.z);
                        k92Var.e.getClass();
                        sz szVar2 = (sz) tz.a.get(u01.c(map3, w11.p));
                        sr2 sr2Var2 = k92Var.d;
                        sr2Var2.getClass();
                        Map map82 = xq2Var.c;
                        c2 = u01.c(map82, w11.u);
                        int i72 = tb.b;
                        if (c2 != null) {
                        }
                        valueOf3 = null;
                        Locale locale222 = locale;
                        c3 = u01.c(map82, w11.w);
                        if (c3 == null) {
                        }
                        if (valueOf3 != null) {
                        }
                        String str322 = (String) j5g.a0(u01.e(map82, w11.x));
                        rr2 rr2Var22 = new rr2(u01.b(map82, w11.C), rvVar, (str322 != null || str322.length() <= 0) ? null : new cz2(str322));
                        k92Var.f.getClass();
                        String c2122 = u01.c(map3, w11.h);
                        if (c2122 != null) {
                        }
                        String c2222 = u01.c(map3, w11.K);
                        boolean b422 = u01.b(map3, w11.M);
                        String c2322 = u01.c(map3, w11.E);
                        if (c2322 == null) {
                        }
                        String c2422 = u01.c(map3, w11.j);
                        if (c2422 != null) {
                        }
                        String c2522 = u01.c(map3, w11.S);
                        if (c2522 != null) {
                        }
                        String c2622 = u01.c(map3, w11.T);
                        if (c2622 != null) {
                        }
                        String c2722 = u01.c(map3, w11.U);
                        if (c2722 != null) {
                        }
                        String c2822 = u01.c(map3, w11.V);
                        if (c2822 != null) {
                        }
                        String c2922 = u01.c(map3, w11.W);
                        boolean parseBoolean822 = c2922 != null ? Boolean.parseBoolean(c2922) : true;
                        String c3022 = u01.c(map3, w11.X);
                        if (c3022 != null) {
                        }
                        String c3122 = u01.c(map3, w11.Y);
                        if (c3122 != null) {
                        }
                        String c3222 = u01.c(map3, w11.Z);
                        String c3322 = u01.c(map3, w11.a0);
                        return new wq2(new v9(a, c6, c8, c7, str22, d, d2, e2, a32, valueOf4, c152, locale222, j5Var, c2222, c202, szVar2, b2, c162, c172, a2, rr2Var22, valueOf5, obj, map, c182, c192, b32, b, parseBoolean, parseBoolean2, d32, d42, d52, d62, b422, xt0Var, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean822, parseBoolean9, parseBoolean10, c3222, c3322 != null ? false : Boolean.parseBoolean(c3322), 4096, 0), x11.a(g92Var));
                    }
                    valueOf = null;
                    if (valueOf == null) {
                    }
                    c = u01.c(map3, w11.v);
                    int i52 = tb.b;
                    if (c != null) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    k92Var.g.getClass();
                    String c1222 = u01.c(map3, w11.l);
                    Locale[] availableLocales22 = Locale.getAvailableLocales();
                    length = availableLocales22.length;
                    i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                        }
                        i2++;
                    }
                    String c1322 = u01.c(map3, w11.A);
                    if (c1322 == null) {
                    }
                    String c1422 = u01.c(map3, w11.H);
                    if (c1422 == null) {
                    }
                    b = u01.b(map3, w11.o);
                    if (b) {
                    }
                    if (b) {
                    }
                    String str222 = k92Var.a.c.a;
                    ArrayList e22 = u01.e(map3, w11.m);
                    k92Var.h.getClass();
                    c a322 = w9.a(map3);
                    String c1522 = u01.c(map3, w11.k);
                    int d322 = u01.d(map3, w11.r);
                    int d422 = u01.d(map3, w11.s);
                    int d522 = u01.d(map3, w11.t);
                    int d622 = u01.d(map3, w11.y);
                    String c1622 = u01.c(map3, w11.q);
                    boolean b322 = u01.b(map3, w11.i);
                    String c1722 = u01.c(map3, w11.O);
                    String c1822 = u01.c(map3, w11.P);
                    String c1922 = u01.c(map3, w11.Q);
                    String c2022 = u01.c(map3, w11.z);
                    k92Var.e.getClass();
                    sz szVar22 = (sz) tz.a.get(u01.c(map3, w11.p));
                    sr2 sr2Var22 = k92Var.d;
                    sr2Var22.getClass();
                    Map map822 = xq2Var.c;
                    c2 = u01.c(map822, w11.u);
                    int i722 = tb.b;
                    if (c2 != null) {
                    }
                    valueOf3 = null;
                    Locale locale2222 = locale;
                    c3 = u01.c(map822, w11.w);
                    if (c3 == null) {
                    }
                    if (valueOf3 != null) {
                    }
                    String str3222 = (String) j5g.a0(u01.e(map822, w11.x));
                    rr2 rr2Var222 = new rr2(u01.b(map822, w11.C), rvVar, (str3222 != null || str3222.length() <= 0) ? null : new cz2(str3222));
                    k92Var.f.getClass();
                    String c21222 = u01.c(map3, w11.h);
                    if (c21222 != null) {
                    }
                    String c22222 = u01.c(map3, w11.K);
                    boolean b4222 = u01.b(map3, w11.M);
                    String c23222 = u01.c(map3, w11.E);
                    if (c23222 == null) {
                    }
                    String c24222 = u01.c(map3, w11.j);
                    if (c24222 != null) {
                    }
                    String c25222 = u01.c(map3, w11.S);
                    if (c25222 != null) {
                    }
                    String c26222 = u01.c(map3, w11.T);
                    if (c26222 != null) {
                    }
                    String c27222 = u01.c(map3, w11.U);
                    if (c27222 != null) {
                    }
                    String c28222 = u01.c(map3, w11.V);
                    if (c28222 != null) {
                    }
                    String c29222 = u01.c(map3, w11.W);
                    boolean parseBoolean8222 = c29222 != null ? Boolean.parseBoolean(c29222) : true;
                    String c30222 = u01.c(map3, w11.X);
                    if (c30222 != null) {
                    }
                    String c31222 = u01.c(map3, w11.Y);
                    if (c31222 != null) {
                    }
                    String c32222 = u01.c(map3, w11.Z);
                    String c33222 = u01.c(map3, w11.a0);
                    return new wq2(new v9(a, c6, c8, c7, str222, d, d2, e22, a322, valueOf4, c1522, locale2222, j5Var, c22222, c2022, szVar22, b2, c1622, c1722, a2, rr2Var222, valueOf5, obj, map, c1822, c1922, b322, b, parseBoolean, parseBoolean2, d322, d422, d522, d622, b4222, xt0Var, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8222, parseBoolean9, parseBoolean10, c32222, c33222 != null ? false : Boolean.parseBoolean(c33222), 4096, 0), x11.a(g92Var));
                }
                return new wq2(new h4(m4.k, g92Var));
            }
        }
        int i8 = h4.d;
        return new wq2(g4.a(g92Var));
    }

    public boolean b(g92 g92Var, int i) {
        byte[] bArr;
        if (200 == i && (bArr = g92Var.b) != null) {
            if (!(bArr.length == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void b(Context context) {
        int i;
        Integer num;
        Integer num2;
        qu2 a = gx2.a().a(context);
        if (a != null && (num2 = a.w0) != null) {
            i = num2.intValue();
        } else {
            i = this.C.o;
        }
        this.I.a.getClass();
        qu2 a2 = gx2.a().a(context);
        this.o = new qe0(1.0f, i, (a2 == null || (num = a2.M) == null) ? 0 : num.intValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn(Context context, d4 d4Var, bu1 bu1Var, String str, String str2, v12 v12Var, vp2 vp2Var, oo ooVar, gq2 gq2Var, iz2 iz2Var, ez2 ez2Var, b5 b5Var, o9 o9Var) {
        super(context, d4Var, 1, str, ooVar, d4Var, gq2Var, vp2Var, bu1Var, 1536);
        d4Var.c().getClass();
        this.C = d4Var;
        this.D = str2;
        this.E = v12Var;
        this.F = iz2Var;
        this.G = ez2Var;
        this.H = b5Var;
        this.I = o9Var;
        this.J = context.getApplicationContext();
        b(context);
    }
}
