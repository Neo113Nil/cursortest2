package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.cy2;
import yads.d4;
import yads.gv;
import yads.gz;
import yads.h01;
import yads.hw2;
import yads.im;
import yads.jk3;
import yads.jm;
import yads.po2;
import yads.qp1;
import yads.x3;
import yads.xz;
import yads.zp1;

/* loaded from: classes7.dex */
public abstract class in71 extends ax81 {
    public final fe81 A;
    public final ge71 B;
    public final String C;
    public final sl81 D;
    public final y381 E;
    public final ji41 F;
    public final s481 G;
    public final Context H;
    public final i3y I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public in71(Context context, fe81 fe81Var, ge71 ge71Var, String str, String str2, sl81 sl81Var, i971 i971Var, dj81 dj81Var, i871 i871Var, y381 y381Var, int i) {
        super(context, fe81Var, 1, str, dj81Var, fe81Var, i871Var, i971Var, ge71Var);
        Integer num;
        a081 a081Var;
        y381 a = (i & 512) != 0 ? wt71.a(context) : y381Var;
        ji41 ji41Var = new ji41(29, a);
        s481 s481Var = new s481();
        new ni71();
        ((c171) fe81Var.b.b).getClass();
        this.A = fe81Var;
        this.B = ge71Var;
        this.C = str2;
        this.D = sl81Var;
        this.E = a;
        this.F = ji41Var;
        this.G = s481Var;
        this.H = context.getApplicationContext();
        this.I = a.a(new jm(context, this));
        a081 a081Var2 = a081.g;
        if (a081Var2 == null) {
            synchronized (a081.f) {
                a081Var = a081.g;
                if (a081Var == null) {
                    a081Var = new a081();
                    a081.g = a081Var;
                }
            }
            a081Var2 = a081Var;
        }
        gg81 a2 = a081Var2.a(context);
        setRetryPolicy(ni71.a((a2 == null || (num = a2.w0) == null) ? fe81Var.o : num.intValue(), context));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x02df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0138 A[EDGE_INSN: B:187:0x0138->B:39:0x0138 BREAK  A[LOOP:0: B:33:0x011f->B:36:0x0135], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b1  */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v9, types: [int] */
    @Override // defpackage.ax81
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final km81 c(gb81 gb81Var, int i) {
        Integer valueOf;
        String str;
        String str2;
        Long l;
        String b;
        Integer valueOf2;
        Long l2;
        Long l3;
        int length;
        int i2;
        String b2;
        String b3;
        boolean parseBoolean;
        ?? r21;
        qp1 qp1Var;
        qb71 qb71Var;
        String b4;
        Integer valueOf3;
        String b5;
        String str3;
        ArrayList arrayList;
        String str4;
        boolean z;
        String str5;
        String b6;
        String b7;
        String b8;
        String str6;
        JSONObject jSONObject;
        MapBuilder j;
        Map map = gb81Var.c;
        if (e(gb81Var, i)) {
            Map f = map == null ? b.f() : map;
            b(f);
            if (204 != i) {
                String b9 = ob71.b(f, h01.e);
                if (b9 == null) {
                    b9 = "";
                }
                xz.c.getClass();
                xz a = tq81.a(b9);
                fe81 fe81Var = this.A;
                if (a != fe81Var.a) {
                    return new km81(new x3(d4.k, gb81Var));
                }
                pl61 pl61Var = (pl61) this.D.a;
                new ez71();
                o981 o981Var = new o981();
                new d681();
                new ve71();
                new vg81();
                new mi81();
                new km71();
                new lb81();
                ji41 ji41Var = this.F;
                ji41Var.getClass();
                h01 h01Var = h01.D;
                String b10 = ob71.b(f, h01Var);
                String str7 = h01Var.b;
                ((y381) ji41Var.b).a.a("SessionData", b10);
                int i3 = gb81Var.a;
                byte[] bArr = gb81Var.b;
                if (map == null) {
                    map = b.f();
                }
                int c = ob71.c(f, h01.c);
                int c2 = ob71.c(f, h01.d);
                String b11 = ob71.b(f, h01.I);
                String b12 = ob71.b(f, h01.J);
                String b13 = ob71.b(f, h01.f);
                String b14 = ob71.b(f, h01.L);
                Map a2 = b14 != null ? km71.a(b14) : null;
                a271 a271Var = fe81Var.d.a;
                cy2 cy2Var = a271Var != null ? ((jd81) a271Var).a : null;
                String b15 = ob71.b(f, h01.g);
                int i4 = cs71.b;
                if (b15 != null) {
                    try {
                        valueOf = Integer.valueOf(b15);
                    } catch (NumberFormatException unused) {
                    }
                    if (valueOf == null) {
                        str = b11;
                        str2 = b12;
                        l = Long.valueOf(valueOf.intValue() * 1000);
                    } else {
                        str = b11;
                        str2 = b12;
                        l = null;
                    }
                    b = ob71.b(f, h01.v);
                    int i5 = cs71.b;
                    if (b != null) {
                        try {
                            valueOf2 = Integer.valueOf(b);
                        } catch (NumberFormatException unused2) {
                        }
                        if (valueOf2 != null) {
                            l2 = l;
                            l3 = Long.valueOf(valueOf2.intValue() * 1000);
                        } else {
                            l2 = l;
                            l3 = null;
                        }
                        String b16 = ob71.b(f, h01.l);
                        Locale[] availableLocales = Locale.getAvailableLocales();
                        length = availableLocales.length;
                        i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            r21 = i2;
                            if (jl40.l(availableLocales[i2].getLanguage(), b16)) {
                                new Locale(b16);
                                break;
                            }
                            i2 = r21 + 1;
                        }
                        b2 = ob71.b(f, h01.A);
                        if (b2 != null) {
                            Boolean.parseBoolean(b2);
                        }
                        b3 = ob71.b(f, h01.H);
                        if (b3 != null) {
                            Boolean.parseBoolean(b3);
                        }
                        String b17 = ob71.b(f, h01.o);
                        parseBoolean = b17 == null ? false : Boolean.parseBoolean(b17);
                        Object a3 = !parseBoolean ? pl61Var.a(new gb81(i3, bArr, map, true)) : null;
                        if (parseBoolean) {
                            o981Var.a.getClass();
                            if (bArr != null) {
                                String b18 = ob71.b(map, h01.T);
                                if (b18 == null ? true : Boolean.parseBoolean(b18)) {
                                    try {
                                        str6 = new String(Base64.decode(bArr, 0), uza.a);
                                    } catch (Exception unused3) {
                                        str6 = new String(bArr, uza.a);
                                    }
                                } else {
                                    str6 = new String(bArr, uza.a);
                                }
                            } else {
                                str6 = null;
                            }
                            if (str6 != null && str6.length() > 0) {
                                try {
                                    jSONObject = new JSONObject(str6);
                                    try {
                                        try {
                                            zcx zcxVar = xf71.a;
                                            JSONObject jSONObject2 = jSONObject.getJSONObject("passback_parameters");
                                            MapBuilder mapBuilder = new MapBuilder();
                                            Iterator<String> keys = jSONObject2.keys();
                                            while (keys.hasNext()) {
                                                String next = keys.next();
                                                mapBuilder.put(next, jSONObject2.getString(next));
                                            }
                                            j = mapBuilder.j();
                                        } catch (JSONException e) {
                                            throw new JSONException(e.getMessage());
                                        }
                                    } catch (JSONException unused4) {
                                    }
                                } catch (JSONException unused5) {
                                }
                                if (!j.isEmpty()) {
                                    JSONArray jSONArray = jSONObject.getJSONArray("networks");
                                    ArrayList arrayList2 = new ArrayList();
                                    int length2 = jSONArray.length();
                                    int i6 = 0;
                                    while (i6 < length2) {
                                        JSONObject jSONObject3 = jSONArray.getJSONObject(i6);
                                        Object obj = a3;
                                        o981Var.b.getClass();
                                        zp1 b19 = dd81.b(jSONObject3);
                                        if (b19 != null) {
                                            arrayList2.add(b19);
                                        }
                                        i6++;
                                        a3 = obj;
                                    }
                                    r21 = a3;
                                    if (!arrayList2.isEmpty()) {
                                        qp1Var = new qp1(arrayList2, j);
                                        qb71Var = r21;
                                        String str8 = fe81Var.c.a;
                                        ArrayList d = ob71.d(f, h01.m);
                                        no61 a4 = lb81.a(f);
                                        String b20 = ob71.b(f, h01.k);
                                        ob71.c(f, h01.r);
                                        int c3 = ob71.c(f, h01.s);
                                        int c4 = ob71.c(f, h01.t);
                                        ob71.c(f, h01.y);
                                        String b21 = ob71.b(f, h01.q);
                                        String b22 = ob71.b(f, h01.i);
                                        boolean parseBoolean2 = b22 == null ? false : Boolean.parseBoolean(b22);
                                        String b23 = ob71.b(f, h01.O);
                                        String b24 = ob71.b(f, h01.P);
                                        String b25 = ob71.b(f, h01.Q);
                                        ob71.b(f, h01.z);
                                        gz gzVar = (gz) ve71.a.get(ob71.b(f, h01.p));
                                        b4 = ob71.b(map, h01.u);
                                        int i7 = cs71.b;
                                        if (b4 != null) {
                                            try {
                                                valueOf3 = Integer.valueOf(b4);
                                            } catch (NumberFormatException unused6) {
                                            }
                                            b5 = ob71.b(map, h01.w);
                                            if (b5 == null) {
                                                Charset charset = uza.a;
                                                byte[] bytes = b5.getBytes(charset);
                                                str3 = str8;
                                                try {
                                                    arrayList = d;
                                                    str4 = b20;
                                                    z = false;
                                                    try {
                                                        str5 = new String(Base64.decode(bytes, 0), charset);
                                                    } catch (Exception unused7) {
                                                        str5 = new String(bytes, uza.a);
                                                        if (valueOf3 != null) {
                                                        }
                                                        String str9 = (String) kotlin.collections.a.R(ob71.d(map, h01.x));
                                                        if (str9 != null) {
                                                        }
                                                        String b26 = ob71.b(map, h01.C);
                                                        po2 po2Var = new po2(b26 == null ? z : Boolean.parseBoolean(b26), r5, r8);
                                                        ob71.b(f, h01.h);
                                                        String b27 = ob71.b(f, h01.K);
                                                        String b28 = ob71.b(f, h01.M);
                                                        if (b28 == null) {
                                                        }
                                                        ob71.b(f, h01.E);
                                                        String b29 = ob71.b(f, h01.j);
                                                        if (b29 == null) {
                                                        }
                                                        String b30 = ob71.b(f, h01.S);
                                                        if (b30 == null) {
                                                        }
                                                        b6 = ob71.b(f, h01.T);
                                                        if (b6 != null) {
                                                        }
                                                        b7 = ob71.b(f, h01.U);
                                                        if (b7 != null) {
                                                        }
                                                        b8 = ob71.b(f, h01.V);
                                                        if (b8 != null) {
                                                        }
                                                        String b31 = ob71.b(f, h01.W);
                                                        if (b31 == null) {
                                                        }
                                                        String b32 = ob71.b(f, h01.X);
                                                        if (b32 == null) {
                                                        }
                                                        String b33 = ob71.b(f, h01.Y);
                                                        if (b33 == null) {
                                                        }
                                                        String b34 = ob71.b(f, h01.Z);
                                                        String b35 = ob71.b(f, h01.a0);
                                                        return new km81(new d881(a, str, b13, str2, str3, c, c2, arrayList, a4, l2, str4, b27, gzVar, cy2Var, b21, b23, qp1Var, po2Var, l3, qb71Var, a2, b24, b25, parseBoolean2, parseBoolean, c3, c4, r34, r35, r36, r37, r38, r39, b34, b35 == null ? z : Boolean.parseBoolean(b35)), hba1.d(gb81Var));
                                                    }
                                                } catch (Exception unused8) {
                                                    arrayList = d;
                                                    str4 = b20;
                                                    z = false;
                                                }
                                            } else {
                                                str3 = str8;
                                                arrayList = d;
                                                str4 = b20;
                                                z = false;
                                                str5 = null;
                                            }
                                            gv gvVar = (valueOf3 != null || str5 == null || str5.length() <= 0) ? null : new gv(valueOf3.intValue(), str5);
                                            String str92 = (String) kotlin.collections.a.R(ob71.d(map, h01.x));
                                            hw2 hw2Var = (str92 != null || str92.length() <= 0) ? null : new hw2(str92);
                                            String b262 = ob71.b(map, h01.C);
                                            po2 po2Var2 = new po2(b262 == null ? z : Boolean.parseBoolean(b262), gvVar, hw2Var);
                                            ob71.b(f, h01.h);
                                            String b272 = ob71.b(f, h01.K);
                                            String b282 = ob71.b(f, h01.M);
                                            boolean parseBoolean3 = b282 == null ? z : Boolean.parseBoolean(b282);
                                            ob71.b(f, h01.E);
                                            String b292 = ob71.b(f, h01.j);
                                            boolean parseBoolean4 = b292 == null ? true : Boolean.parseBoolean(b292);
                                            String b302 = ob71.b(f, h01.S);
                                            boolean parseBoolean5 = b302 == null ? z : Boolean.parseBoolean(b302);
                                            b6 = ob71.b(f, h01.T);
                                            if (b6 != null) {
                                                Boolean.parseBoolean(b6);
                                            }
                                            b7 = ob71.b(f, h01.U);
                                            if (b7 != null) {
                                                Boolean.parseBoolean(b7);
                                            }
                                            b8 = ob71.b(f, h01.V);
                                            if (b8 != null) {
                                                Boolean.parseBoolean(b8);
                                            }
                                            String b312 = ob71.b(f, h01.W);
                                            boolean parseBoolean6 = b312 == null ? true : Boolean.parseBoolean(b312);
                                            String b322 = ob71.b(f, h01.X);
                                            boolean parseBoolean7 = b322 == null ? z : Boolean.parseBoolean(b322);
                                            String b332 = ob71.b(f, h01.Y);
                                            boolean parseBoolean8 = b332 == null ? z : Boolean.parseBoolean(b332);
                                            String b342 = ob71.b(f, h01.Z);
                                            String b352 = ob71.b(f, h01.a0);
                                            return new km81(new d881(a, str, b13, str2, str3, c, c2, arrayList, a4, l2, str4, b272, gzVar, cy2Var, b21, b23, qp1Var, po2Var2, l3, qb71Var, a2, b24, b25, parseBoolean2, parseBoolean, c3, c4, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8, b342, b352 == null ? z : Boolean.parseBoolean(b352)), hba1.d(gb81Var));
                                        }
                                        valueOf3 = null;
                                        b5 = ob71.b(map, h01.w);
                                        if (b5 == null) {
                                        }
                                        if (valueOf3 != null) {
                                        }
                                        String str922 = (String) kotlin.collections.a.R(ob71.d(map, h01.x));
                                        if (str922 != null) {
                                        }
                                        String b2622 = ob71.b(map, h01.C);
                                        po2 po2Var22 = new po2(b2622 == null ? z : Boolean.parseBoolean(b2622), gvVar, hw2Var);
                                        ob71.b(f, h01.h);
                                        String b2722 = ob71.b(f, h01.K);
                                        String b2822 = ob71.b(f, h01.M);
                                        if (b2822 == null) {
                                        }
                                        ob71.b(f, h01.E);
                                        String b2922 = ob71.b(f, h01.j);
                                        if (b2922 == null) {
                                        }
                                        String b3022 = ob71.b(f, h01.S);
                                        if (b3022 == null) {
                                        }
                                        b6 = ob71.b(f, h01.T);
                                        if (b6 != null) {
                                        }
                                        b7 = ob71.b(f, h01.U);
                                        if (b7 != null) {
                                        }
                                        b8 = ob71.b(f, h01.V);
                                        if (b8 != null) {
                                        }
                                        String b3122 = ob71.b(f, h01.W);
                                        if (b3122 == null) {
                                        }
                                        String b3222 = ob71.b(f, h01.X);
                                        if (b3222 == null) {
                                        }
                                        String b3322 = ob71.b(f, h01.Y);
                                        if (b3322 == null) {
                                        }
                                        String b3422 = ob71.b(f, h01.Z);
                                        String b3522 = ob71.b(f, h01.a0);
                                        return new km81(new d881(a, str, b13, str2, str3, c, c2, arrayList, a4, l2, str4, b2722, gzVar, cy2Var, b21, b23, qp1Var, po2Var22, l3, qb71Var, a2, b24, b25, parseBoolean2, parseBoolean, c3, c4, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8, b3422, b3522 == null ? z : Boolean.parseBoolean(b3522)), hba1.d(gb81Var));
                                    }
                                    qp1Var = null;
                                    qb71Var = r21;
                                    String str82 = fe81Var.c.a;
                                    ArrayList d2 = ob71.d(f, h01.m);
                                    no61 a42 = lb81.a(f);
                                    String b202 = ob71.b(f, h01.k);
                                    ob71.c(f, h01.r);
                                    int c32 = ob71.c(f, h01.s);
                                    int c42 = ob71.c(f, h01.t);
                                    ob71.c(f, h01.y);
                                    String b212 = ob71.b(f, h01.q);
                                    String b222 = ob71.b(f, h01.i);
                                    if (b222 == null) {
                                    }
                                    String b232 = ob71.b(f, h01.O);
                                    String b242 = ob71.b(f, h01.P);
                                    String b252 = ob71.b(f, h01.Q);
                                    ob71.b(f, h01.z);
                                    gz gzVar2 = (gz) ve71.a.get(ob71.b(f, h01.p));
                                    b4 = ob71.b(map, h01.u);
                                    int i72 = cs71.b;
                                    if (b4 != null) {
                                    }
                                    valueOf3 = null;
                                    b5 = ob71.b(map, h01.w);
                                    if (b5 == null) {
                                    }
                                    if (valueOf3 != null) {
                                    }
                                    String str9222 = (String) kotlin.collections.a.R(ob71.d(map, h01.x));
                                    if (str9222 != null) {
                                    }
                                    String b26222 = ob71.b(map, h01.C);
                                    po2 po2Var222 = new po2(b26222 == null ? z : Boolean.parseBoolean(b26222), gvVar, hw2Var);
                                    ob71.b(f, h01.h);
                                    String b27222 = ob71.b(f, h01.K);
                                    String b28222 = ob71.b(f, h01.M);
                                    if (b28222 == null) {
                                    }
                                    ob71.b(f, h01.E);
                                    String b29222 = ob71.b(f, h01.j);
                                    if (b29222 == null) {
                                    }
                                    String b30222 = ob71.b(f, h01.S);
                                    if (b30222 == null) {
                                    }
                                    b6 = ob71.b(f, h01.T);
                                    if (b6 != null) {
                                    }
                                    b7 = ob71.b(f, h01.U);
                                    if (b7 != null) {
                                    }
                                    b8 = ob71.b(f, h01.V);
                                    if (b8 != null) {
                                    }
                                    String b31222 = ob71.b(f, h01.W);
                                    if (b31222 == null) {
                                    }
                                    String b32222 = ob71.b(f, h01.X);
                                    if (b32222 == null) {
                                    }
                                    String b33222 = ob71.b(f, h01.Y);
                                    if (b33222 == null) {
                                    }
                                    String b34222 = ob71.b(f, h01.Z);
                                    String b35222 = ob71.b(f, h01.a0);
                                    return new km81(new d881(a, str, b13, str2, str3, c, c2, arrayList, a42, l2, str4, b27222, gzVar2, cy2Var, b212, b232, qp1Var, po2Var222, l3, qb71Var, a2, b242, b252, parseBoolean2, parseBoolean, c32, c42, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8, b34222, b35222 == null ? z : Boolean.parseBoolean(b35222)), hba1.d(gb81Var));
                                }
                            }
                        }
                        r21 = a3;
                        qp1Var = null;
                        qb71Var = r21;
                        String str822 = fe81Var.c.a;
                        ArrayList d22 = ob71.d(f, h01.m);
                        no61 a422 = lb81.a(f);
                        String b2022 = ob71.b(f, h01.k);
                        ob71.c(f, h01.r);
                        int c322 = ob71.c(f, h01.s);
                        int c422 = ob71.c(f, h01.t);
                        ob71.c(f, h01.y);
                        String b2122 = ob71.b(f, h01.q);
                        String b2222 = ob71.b(f, h01.i);
                        if (b2222 == null) {
                        }
                        String b2322 = ob71.b(f, h01.O);
                        String b2422 = ob71.b(f, h01.P);
                        String b2522 = ob71.b(f, h01.Q);
                        ob71.b(f, h01.z);
                        gz gzVar22 = (gz) ve71.a.get(ob71.b(f, h01.p));
                        b4 = ob71.b(map, h01.u);
                        int i722 = cs71.b;
                        if (b4 != null) {
                        }
                        valueOf3 = null;
                        b5 = ob71.b(map, h01.w);
                        if (b5 == null) {
                        }
                        if (valueOf3 != null) {
                        }
                        String str92222 = (String) kotlin.collections.a.R(ob71.d(map, h01.x));
                        if (str92222 != null) {
                        }
                        String b262222 = ob71.b(map, h01.C);
                        po2 po2Var2222 = new po2(b262222 == null ? z : Boolean.parseBoolean(b262222), gvVar, hw2Var);
                        ob71.b(f, h01.h);
                        String b272222 = ob71.b(f, h01.K);
                        String b282222 = ob71.b(f, h01.M);
                        if (b282222 == null) {
                        }
                        ob71.b(f, h01.E);
                        String b292222 = ob71.b(f, h01.j);
                        if (b292222 == null) {
                        }
                        String b302222 = ob71.b(f, h01.S);
                        if (b302222 == null) {
                        }
                        b6 = ob71.b(f, h01.T);
                        if (b6 != null) {
                        }
                        b7 = ob71.b(f, h01.U);
                        if (b7 != null) {
                        }
                        b8 = ob71.b(f, h01.V);
                        if (b8 != null) {
                        }
                        String b312222 = ob71.b(f, h01.W);
                        if (b312222 == null) {
                        }
                        String b322222 = ob71.b(f, h01.X);
                        if (b322222 == null) {
                        }
                        String b332222 = ob71.b(f, h01.Y);
                        if (b332222 == null) {
                        }
                        String b342222 = ob71.b(f, h01.Z);
                        String b352222 = ob71.b(f, h01.a0);
                        return new km81(new d881(a, str, b13, str2, str3, c, c2, arrayList, a422, l2, str4, b272222, gzVar22, cy2Var, b2122, b2322, qp1Var, po2Var2222, l3, qb71Var, a2, b2422, b2522, parseBoolean2, parseBoolean, c322, c422, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8, b342222, b352222 == null ? z : Boolean.parseBoolean(b352222)), hba1.d(gb81Var));
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    String b162 = ob71.b(f, h01.l);
                    Locale[] availableLocales2 = Locale.getAvailableLocales();
                    length = availableLocales2.length;
                    i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                        }
                        i2 = r21 + 1;
                    }
                    b2 = ob71.b(f, h01.A);
                    if (b2 != null) {
                    }
                    b3 = ob71.b(f, h01.H);
                    if (b3 != null) {
                    }
                    String b172 = ob71.b(f, h01.o);
                    if (b172 == null) {
                    }
                    if (!parseBoolean) {
                    }
                    if (parseBoolean) {
                    }
                    r21 = a3;
                    qp1Var = null;
                    qb71Var = r21;
                    String str8222 = fe81Var.c.a;
                    ArrayList d222 = ob71.d(f, h01.m);
                    no61 a4222 = lb81.a(f);
                    String b20222 = ob71.b(f, h01.k);
                    ob71.c(f, h01.r);
                    int c3222 = ob71.c(f, h01.s);
                    int c4222 = ob71.c(f, h01.t);
                    ob71.c(f, h01.y);
                    String b21222 = ob71.b(f, h01.q);
                    String b22222 = ob71.b(f, h01.i);
                    if (b22222 == null) {
                    }
                    String b23222 = ob71.b(f, h01.O);
                    String b24222 = ob71.b(f, h01.P);
                    String b25222 = ob71.b(f, h01.Q);
                    ob71.b(f, h01.z);
                    gz gzVar222 = (gz) ve71.a.get(ob71.b(f, h01.p));
                    b4 = ob71.b(map, h01.u);
                    int i7222 = cs71.b;
                    if (b4 != null) {
                    }
                    valueOf3 = null;
                    b5 = ob71.b(map, h01.w);
                    if (b5 == null) {
                    }
                    if (valueOf3 != null) {
                    }
                    String str922222 = (String) kotlin.collections.a.R(ob71.d(map, h01.x));
                    if (str922222 != null) {
                    }
                    String b2622222 = ob71.b(map, h01.C);
                    po2 po2Var22222 = new po2(b2622222 == null ? z : Boolean.parseBoolean(b2622222), gvVar, hw2Var);
                    ob71.b(f, h01.h);
                    String b2722222 = ob71.b(f, h01.K);
                    String b2822222 = ob71.b(f, h01.M);
                    if (b2822222 == null) {
                    }
                    ob71.b(f, h01.E);
                    String b2922222 = ob71.b(f, h01.j);
                    if (b2922222 == null) {
                    }
                    String b3022222 = ob71.b(f, h01.S);
                    if (b3022222 == null) {
                    }
                    b6 = ob71.b(f, h01.T);
                    if (b6 != null) {
                    }
                    b7 = ob71.b(f, h01.U);
                    if (b7 != null) {
                    }
                    b8 = ob71.b(f, h01.V);
                    if (b8 != null) {
                    }
                    String b3122222 = ob71.b(f, h01.W);
                    if (b3122222 == null) {
                    }
                    String b3222222 = ob71.b(f, h01.X);
                    if (b3222222 == null) {
                    }
                    String b3322222 = ob71.b(f, h01.Y);
                    if (b3322222 == null) {
                    }
                    String b3422222 = ob71.b(f, h01.Z);
                    String b3522222 = ob71.b(f, h01.a0);
                    return new km81(new d881(a, str, b13, str2, str3, c, c2, arrayList, a4222, l2, str4, b2722222, gzVar222, cy2Var, b21222, b23222, qp1Var, po2Var22222, l3, qb71Var, a2, b24222, b25222, parseBoolean2, parseBoolean, c3222, c4222, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8, b3422222, b3522222 == null ? z : Boolean.parseBoolean(b3522222)), hba1.d(gb81Var));
                }
                valueOf = null;
                if (valueOf == null) {
                }
                b = ob71.b(f, h01.v);
                int i52 = cs71.b;
                if (b != null) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                String b1622 = ob71.b(f, h01.l);
                Locale[] availableLocales22 = Locale.getAvailableLocales();
                length = availableLocales22.length;
                i2 = 0;
                while (true) {
                    if (i2 >= length) {
                    }
                    i2 = r21 + 1;
                }
                b2 = ob71.b(f, h01.A);
                if (b2 != null) {
                }
                b3 = ob71.b(f, h01.H);
                if (b3 != null) {
                }
                String b1722 = ob71.b(f, h01.o);
                if (b1722 == null) {
                }
                if (!parseBoolean) {
                }
                if (parseBoolean) {
                }
                r21 = a3;
                qp1Var = null;
                qb71Var = r21;
                String str82222 = fe81Var.c.a;
                ArrayList d2222 = ob71.d(f, h01.m);
                no61 a42222 = lb81.a(f);
                String b202222 = ob71.b(f, h01.k);
                ob71.c(f, h01.r);
                int c32222 = ob71.c(f, h01.s);
                int c42222 = ob71.c(f, h01.t);
                ob71.c(f, h01.y);
                String b212222 = ob71.b(f, h01.q);
                String b222222 = ob71.b(f, h01.i);
                if (b222222 == null) {
                }
                String b232222 = ob71.b(f, h01.O);
                String b242222 = ob71.b(f, h01.P);
                String b252222 = ob71.b(f, h01.Q);
                ob71.b(f, h01.z);
                gz gzVar2222 = (gz) ve71.a.get(ob71.b(f, h01.p));
                b4 = ob71.b(map, h01.u);
                int i72222 = cs71.b;
                if (b4 != null) {
                }
                valueOf3 = null;
                b5 = ob71.b(map, h01.w);
                if (b5 == null) {
                }
                if (valueOf3 != null) {
                }
                String str9222222 = (String) kotlin.collections.a.R(ob71.d(map, h01.x));
                if (str9222222 != null) {
                }
                String b26222222 = ob71.b(map, h01.C);
                po2 po2Var222222 = new po2(b26222222 == null ? z : Boolean.parseBoolean(b26222222), gvVar, hw2Var);
                ob71.b(f, h01.h);
                String b27222222 = ob71.b(f, h01.K);
                String b28222222 = ob71.b(f, h01.M);
                if (b28222222 == null) {
                }
                ob71.b(f, h01.E);
                String b29222222 = ob71.b(f, h01.j);
                if (b29222222 == null) {
                }
                String b30222222 = ob71.b(f, h01.S);
                if (b30222222 == null) {
                }
                b6 = ob71.b(f, h01.T);
                if (b6 != null) {
                }
                b7 = ob71.b(f, h01.U);
                if (b7 != null) {
                }
                b8 = ob71.b(f, h01.V);
                if (b8 != null) {
                }
                String b31222222 = ob71.b(f, h01.W);
                if (b31222222 == null) {
                }
                String b32222222 = ob71.b(f, h01.X);
                if (b32222222 == null) {
                }
                String b33222222 = ob71.b(f, h01.Y);
                if (b33222222 == null) {
                }
                String b34222222 = ob71.b(f, h01.Z);
                String b35222222 = ob71.b(f, h01.a0);
                return new km81(new d881(a, str, b13, str2, str3, c, c2, arrayList, a42222, l2, str4, b27222222, gzVar2222, cy2Var, b212222, b232222, qp1Var, po2Var222222, l3, qb71Var, a2, b242222, b252222, parseBoolean2, parseBoolean, c32222, c42222, parseBoolean3, parseBoolean4, parseBoolean5, parseBoolean6, parseBoolean7, parseBoolean8, b34222222, b35222222 == null ? z : Boolean.parseBoolean(b35222222)), hba1.d(gb81Var));
            }
        }
        int i8 = x3.a;
        return new km81(bka1.c(gb81Var));
    }

    public boolean e(gb81 gb81Var, int i) {
        byte[] bArr;
        if (200 == i && (bArr = gb81Var.b) != null) {
            if (!(bArr.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.monetization.ads.network.core.Request
    public final byte[] getBody() {
        byte[] body = super.getBody();
        if (1 == getMethod()) {
            try {
                return this.C.getBytes(Charset.forName("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return body;
    }

    @Override // defpackage.ax81, com.monetization.ads.network.core.Request
    public final Map getHeaders() {
        List J0;
        List J02;
        MapBuilder mapBuilder = new MapBuilder();
        String c = this.E.a.c("SessionData");
        if (c != null) {
        }
        String str = h01.F.b;
        s481 s481Var = this.G;
        Context context = this.H;
        db81 db81Var = s481Var.a;
        db81Var.getClass();
        Object obj = db81.c;
        synchronized (obj) {
            J0 = kotlin.collections.a.J0(db81Var.a);
        }
        mapBuilder.put(str, s481Var.a(context, J0));
        String str2 = h01.G.b;
        s481 s481Var2 = this.G;
        Context context2 = this.H;
        db81 db81Var2 = s481Var2.a;
        db81Var2.getClass();
        synchronized (obj) {
            J02 = kotlin.collections.a.J0(db81Var2.b);
        }
        mapBuilder.put(str2, s481Var2.a(context2, J02));
        mapBuilder.putAll(((c171) this.A.b.b).b);
        return mapBuilder.j();
    }

    @Override // com.monetization.ads.network.core.Request
    public final String getUrl() {
        StringBuilder sb = new StringBuilder();
        if (getMethod() == 0) {
            sb.append(this.C);
        }
        ((c171) this.A.b.b).getClass();
        sb.append(kotlin.collections.a.X(EmptyList.a, "&", null, null, im.w, 30));
        return Uri.parse(super.getUrl()).buildUpon().encodedQuery(sb.toString()).build().toString();
    }

    @Override // defpackage.ax81, com.monetization.ads.network.core.Request
    public final jk3 parseNetworkError(jk3 jk3Var) {
        int length;
        jk3Var.getClass();
        gb81 gb81Var = jk3Var.b;
        int i = gb81Var != null ? gb81Var.a : -1;
        qq71 qq71Var = (qq71) this.I.getValue();
        Map headers = getHeaders();
        byte[] body = getBody();
        fe81 fe81Var = this.A;
        qq71Var.getClass();
        if (i == -1 || i == 413 || i == 408) {
            boolean z = false;
            if (body != null) {
                try {
                    length = body.length;
                } catch (Exception unused) {
                }
            } else {
                length = 0;
            }
            if (length > 20971520) {
                gg81 a = qq71Var.c.a(qq71Var.a);
                if (a != null) {
                    z = a.O0;
                }
                if (z) {
                    qq71Var.b.c(new zj71("sdk_network_debug", new LinkedHashMap(qq71Var.a((MapBuilder) headers, length, fe81Var, i)), (no61) null));
                }
            }
        }
        int i2 = x3.a;
        return super.parseNetworkError(bka1.c(jk3Var.b));
    }
}
