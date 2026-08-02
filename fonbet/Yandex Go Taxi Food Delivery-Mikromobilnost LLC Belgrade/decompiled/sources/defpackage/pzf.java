package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import com.yandex.go.explorer.impl.experiments.g;
import com.yandex.go.explorer.impl.ui.map.m;
import kotlin.collections.a;
import yads.f5;
import yads.ve3;

/* loaded from: classes12.dex */
public final class pzf implements gto {
    public final Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;

    public pzf(final d820 d820Var) {
        this.b = d820Var;
        final int i = 0;
        yvf0 yvf0Var = new yvf0() { // from class: qhl
            @Override // defpackage.yvf0
            public final Object get() {
                int i2 = i;
                d820 d820Var2 = d820Var;
                switch (i2) {
                    case 0:
                        return d820Var2.getLight();
                    case 1:
                        Typeface b = wuj0.b(y4h0.ya_regular, d820Var2.c);
                        return b == null ? Typeface.DEFAULT : b;
                    default:
                        return d820Var2.b();
                }
            }
        };
        final int i2 = 1;
        yvf0 yvf0Var2 = new yvf0() { // from class: qhl
            @Override // defpackage.yvf0
            public final Object get() {
                int i22 = i2;
                d820 d820Var2 = d820Var;
                switch (i22) {
                    case 0:
                        return d820Var2.getLight();
                    case 1:
                        Typeface b = wuj0.b(y4h0.ya_regular, d820Var2.c);
                        return b == null ? Typeface.DEFAULT : b;
                    default:
                        return d820Var2.b();
                }
            }
        };
        final int i3 = 2;
        yvf0 yvf0Var3 = new yvf0() { // from class: qhl
            @Override // defpackage.yvf0
            public final Object get() {
                int i22 = i3;
                d820 d820Var2 = d820Var;
                switch (i22) {
                    case 0:
                        return d820Var2.getLight();
                    case 1:
                        Typeface b = wuj0.b(y4h0.ya_regular, d820Var2.c);
                        return b == null ? Typeface.DEFAULT : b;
                    default:
                        return d820Var2.b();
                }
            }
        };
        bty0 bty0Var = new bty0();
        bty0Var.a = yvf0Var2;
        bty0Var.b = arg0.div_text_dark_disabled_80;
        bty0Var.e = atg0.div_style_text_size_numbers_s;
        bty0Var.c = atg0.div_style_text_letter_spacing_numbers_s;
        bty0Var.d = atg0.div_style_text_line_space_extra_numbers_s;
        this.e = bty0Var.a();
        bty0 bty0Var2 = new bty0();
        bty0Var2.a = yvf0Var2;
        bty0Var2.b = arg0.div_text_dark_disabled_80;
        bty0Var2.e = atg0.div_style_text_size_numbers_m;
        bty0Var2.c = atg0.div_style_text_letter_spacing_numbers_m;
        bty0Var2.d = atg0.div_style_text_line_space_extra_numbers_m;
        this.f = bty0Var2.a();
        bty0 bty0Var3 = new bty0();
        bty0Var3.a = yvf0Var;
        bty0Var3.b = arg0.div_text_dark_disabled_80;
        bty0Var3.e = atg0.div_style_text_size_numbers_l;
        bty0Var3.c = atg0.div_style_text_letter_spacing_numbers_l;
        bty0Var3.d = atg0.div_style_text_line_space_extra_numbers_l;
        this.g = bty0Var3.a();
        bty0 bty0Var4 = new bty0();
        bty0Var4.a = yvf0Var3;
        bty0Var4.b = arg0.div_text_dark_disabled_80;
        bty0Var4.e = atg0.div_style_text_size_title_s;
        bty0Var4.c = atg0.div_style_text_letter_spacing_no;
        bty0Var4.d = atg0.div_style_text_line_space_extra_title_s;
        this.h = bty0Var4.a();
        bty0 bty0Var5 = new bty0();
        bty0Var5.a = yvf0Var3;
        bty0Var5.b = arg0.div_text_dark_disabled_80;
        bty0Var5.e = atg0.div_style_text_size_title_m;
        bty0Var5.c = atg0.div_style_text_letter_spacing_no;
        bty0Var5.d = atg0.div_style_text_line_space_extra_title_m;
        this.a = bty0Var5.a();
        bty0 bty0Var6 = new bty0();
        bty0Var6.a = yvf0Var3;
        bty0Var6.b = arg0.div_text_dark_disabled_80;
        bty0Var6.e = atg0.div_style_text_size_title_l;
        bty0Var6.c = atg0.div_style_text_letter_spacing_no;
        bty0Var6.d = atg0.div_style_text_line_space_extra_title_l;
        this.c = bty0Var6.a();
        bty0 bty0Var7 = new bty0();
        bty0Var7.a = yvf0Var2;
        bty0Var7.b = arg0.div_text_dark_disabled_80;
        bty0Var7.e = atg0.div_style_text_size_text_s;
        bty0Var7.c = atg0.div_style_text_letter_spacing_no;
        bty0Var7.d = atg0.div_style_text_line_space_extra_text_s;
        this.d = bty0Var7.a();
        bty0 bty0Var8 = new bty0();
        bty0Var8.a = yvf0Var2;
        bty0Var8.b = arg0.div_text_dark_disabled_80;
        bty0Var8.e = atg0.div_style_text_size_text_m;
        bty0Var8.c = atg0.div_style_text_letter_spacing_no;
        bty0Var8.d = atg0.div_style_text_line_space_extra_text_m;
        this.i = bty0Var8.a();
        bty0 bty0Var9 = new bty0();
        bty0Var9.a = yvf0Var2;
        bty0Var9.b = arg0.div_text_dark_disabled_80;
        bty0Var9.e = atg0.div_style_text_size_text_l;
        bty0Var9.c = atg0.div_style_text_letter_spacing_no;
        bty0Var9.d = atg0.div_style_text_line_space_extra_text_l;
        this.j = bty0Var9.a();
        bty0 bty0Var10 = new bty0();
        bty0Var10.a = yvf0Var3;
        bty0Var10.b = arg0.div_text_dark_disabled_50;
        bty0Var10.e = atg0.div_style_text_size_button;
        bty0Var10.c = atg0.div_style_text_letter_spacing_button;
        bty0Var10.d = atg0.div_style_text_line_space_extra_no;
        this.k = bty0Var10.a();
        bty0 bty0Var11 = new bty0();
        bty0Var11.a = yvf0Var3;
        bty0Var11.b = arg0.div_text_dark_disabled_40;
        bty0Var11.e = atg0.div_style_text_size_card_header;
        bty0Var11.c = atg0.div_style_text_letter_spacing_card_header;
        bty0Var11.d = atg0.div_style_text_line_space_extra_card_header;
        this.l = bty0Var11.a();
        bty0 bty0Var12 = new bty0();
        bty0Var12.a = yvf0Var3;
        bty0Var12.b = arg0.div_text_dark_disabled_80;
        bty0Var12.e = atg0.div_style_text_size_text_m;
        bty0Var12.c = atg0.div_style_text_letter_spacing_no;
        bty0Var12.d = atg0.div_style_text_line_space_extra_text_m;
        this.m = bty0Var12.a();
    }

    public void a(s421 s421Var) {
        this.b = s421Var;
        if (s421Var != null) {
            ((a441) s421Var.x).b = (ji41) this.m;
        }
        if (s421Var != null) {
            hlx0 hlx0Var = (hlx0) s421Var.c;
            a441 a441Var = (a441) s421Var.x;
            switch (hlx0Var.a) {
                case 15:
                    hlx0Var.y = a441Var;
                    break;
                default:
                    hlx0Var.y = a441Var;
                    break;
            }
            switch (hlx0Var.a) {
                case 15:
                    sbm0 sbm0Var = (sbm0) hlx0Var.x;
                    bc71 bc71Var = (bc71) sbm0Var.b;
                    pbj pbjVar = (pbj) sbm0Var.i;
                    eq71 eq71Var = bc71Var.a;
                    eq71Var.i = pbjVar;
                    eq71Var.b(((i581) sbm0Var.d).d);
                    ((e971) sbm0Var.g).b(f5.z, null);
                    View d = ((yp61) ((i971) sbm0Var.c).b).d();
                    if (d != null) {
                        ((hv81) sbm0Var.f).a(d);
                    }
                    h0j h0jVar = ((qv71) sbm0Var.a).g;
                    if (!h0jVar.b && !h0jVar.a) {
                        h0jVar.b = true;
                        ((Handler) h0jVar.e).post(new h3s0(16, h0jVar));
                    }
                    ((js81) sbm0Var.e).a(ve3.c);
                    break;
                default:
                    eq71 eq71Var2 = (eq71) hlx0Var.b;
                    eq71Var2.i = (aj31) hlx0Var.x;
                    eq71Var2.b(((i581) hlx0Var.c).d);
                    break;
            }
        }
    }

    public m b() {
        c0g c0gVar = (c0g) ((i6r) this.e);
        k7x0 s6 = c0gVar.s6();
        q5z.h(s6);
        rqo rqoVar = (rqo) c0gVar.z.C.get();
        q5z.h(rqoVar);
        return new m(s6, new g(rqoVar));
    }

    public cty0 c(Integer num, String str) {
        cty0 d = d(str);
        return num == null ? d : new cty0(d.a, d.b, d.g, d.c, d.d, d.e, num);
    }

    public cty0 d(String str) {
        cty0 cty0Var;
        cty0Var = (cty0) this.i;
        str.getClass();
        switch (str) {
            case "button":
                return (cty0) this.k;
            case "title_l":
                return (cty0) this.c;
            case "title_m":
                return (cty0) this.a;
            case "title_s":
                return (cty0) this.h;
            case "text_l":
                return (cty0) this.j;
            case "text_m":
                return cty0Var;
            case "text_s":
                return (cty0) this.d;
            case "card_header":
                return (cty0) this.l;
            case "text_m_medium":
                return (cty0) this.m;
            case "numbers_l":
                return (cty0) this.g;
            case "numbers_m":
                return (cty0) this.f;
            case "numbers_s":
                return (cty0) this.e;
            default:
                z83.j("Unknown text style: ".concat(str));
                return cty0Var;
        }
    }

    public pzf(Context context, d881 d881Var, v981 v981Var, eq71 eq71Var, il81 il81Var, i630 i630Var, yp61 yp61Var, ip71 ip71Var, hv81 hv81Var, bl61 bl61Var, fl61 fl61Var, v881 v881Var, ak81 ak81Var) {
        pp71 pp71Var = new pp71();
        this.e = i630Var;
        this.f = yp61Var;
        this.g = fl61Var;
        this.h = ak81Var;
        this.a = pp71Var;
        this.m = new ji41(20, this);
        i971 i971Var = new i971(15, yp61Var);
        this.c = new rr41(eq71Var);
        this.i = new bc71(eq71Var);
        xc71 xc71Var = new xc71();
        ycc.t(xc71Var.a, new z971[]{new hs71(fl61Var), new fv81(yp61Var), new o281(new bc71(eq71Var), i971Var)});
        hlx0 hlx0Var = new hlx0(context, d881Var, v981Var, eq71Var, (i581) a.P(il81Var.a), i971Var, ip71Var, hv81Var, xc71Var, bl61Var);
        hlx0 hlx0Var2 = new hlx0(eq71Var, (i581) a.P(il81Var.a), xc71Var);
        vk81 vk81Var = new vk81(eq71Var, i630Var);
        this.d = new hn71(5, il81Var, new no6(context, new w7o(d881Var), v881Var));
        this.k = new s421(yp61Var, hlx0Var, vk81Var);
        this.j = new s421(yp61Var, hlx0Var2, vk81Var);
        this.l = new cr71(yp61Var, new c971(this));
    }

    public /* synthetic */ pzf(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object obj13) {
        this.e = obj;
        this.f = obj2;
        this.g = obj3;
        this.h = obj4;
        this.a = obj5;
        this.c = obj6;
        this.d = obj7;
        this.i = obj8;
        this.j = obj9;
        this.k = obj10;
        this.l = obj11;
        this.m = obj12;
        this.b = obj13;
    }

    public pzf(owf owfVar, yc8 yc8Var, owf owfVar2, owf owfVar3, owf owfVar4, owf owfVar5, owf owfVar6, gaq0 gaq0Var, dx7 dx7Var, owf owfVar7, kd8 kd8Var, xvf0 xvf0Var, owf owfVar8) {
        this.e = owfVar;
        this.f = yc8Var;
        this.g = owfVar2;
        this.h = owfVar3;
        this.c = owfVar4;
        this.d = owfVar5;
        this.i = owfVar6;
        this.j = gaq0Var;
        this.k = dx7Var;
        this.l = owfVar7;
        this.m = kd8Var;
        this.a = xvf0Var;
        this.b = owfVar8;
    }

    public pzf(w1g w1gVar, n3w n3wVar, c4p c4pVar, xvf0 xvf0Var, xvf0 xvf0Var2, e840 e840Var, rs0 rs0Var, w1g w1gVar2, x1g x1gVar, v1g v1gVar, w1g w1gVar3, v1g v1gVar2, xvf0 xvf0Var3) {
        this.a = w1gVar;
        this.c = n3wVar;
        this.d = c4pVar;
        this.i = xvf0Var;
        this.e = xvf0Var2;
        this.f = e840Var;
        this.g = rs0Var;
        this.h = w1gVar2;
        this.j = x1gVar;
        this.k = v1gVar;
        this.l = w1gVar3;
        this.m = v1gVar2;
        this.b = xvf0Var3;
    }

    public pzf(g3g g3gVar, g3g g3gVar2, xvf0 xvf0Var, b3g b3gVar, b3g b3gVar2, fy30 fy30Var, y501 y501Var, f3g f3gVar, g3g g3gVar3, qcz0 qcz0Var, f3g f3gVar2, ibz0 ibz0Var, g3g g3gVar4) {
        this.a = g3gVar;
        this.c = g3gVar2;
        this.d = xvf0Var;
        this.e = b3gVar;
        this.f = b3gVar2;
        this.g = fy30Var;
        this.i = y501Var;
        this.h = f3gVar;
        this.j = g3gVar3;
        this.k = qcz0Var;
        this.l = f3gVar2;
        this.m = ibz0Var;
        this.b = g3gVar4;
    }

    public pzf(n3w n3wVar, n3w n3wVar2, j7g j7gVar, k7g k7gVar, e7g e7gVar, n7g n7gVar, l7g l7gVar, n7g n7gVar2, l7g l7gVar2, lwl0 lwl0Var, xvf0 xvf0Var, j7g j7gVar2, xvf0 xvf0Var2) {
        this.b = n3wVar;
        this.e = n3wVar2;
        this.a = j7gVar;
        this.c = k7gVar;
        this.d = e7gVar;
        this.i = n7gVar;
        this.f = l7gVar;
        this.g = n7gVar2;
        this.h = l7gVar2;
        this.j = lwl0Var;
        this.k = xvf0Var;
        this.l = j7gVar2;
        this.m = xvf0Var2;
    }

    public pzf(i6r i6rVar) {
        this.e = i6rVar;
        int i = 13;
        this.f = new jzf(i6rVar, i);
        this.g = new jzf(i6rVar, 14);
        this.h = new cto(new hro(new jzf(i6rVar, 11), i), new jzf(i6rVar, 12), quo.a, 1);
        xvf0 b = i5m.b(sto.a);
        this.a = b;
        k0n k0nVar = new k0n((cto) this.h, b, 6);
        jzf jzfVar = new jzf(i6rVar, 17);
        this.j = jzfVar;
        int i2 = 18;
        hro hroVar = new hro(new jzf(i6rVar, 20), i2);
        this.k = hroVar;
        xvf0 b2 = i5m.b(new z9n((jzf) this.g, k0nVar, jzfVar, hroVar, 8));
        this.c = b2;
        this.d = i5m.b(new z9n((xvf0) this.f, b2, (xvf0) new jzf(i6rVar, i2), (xvf0) this.j, 7, (byte) 0));
        this.l = new jzf(i6rVar, 19);
        this.m = new jzf(i6rVar, 21);
        xvf0 b3 = i5m.b(new cto((jzf) this.f, new jzf(i6rVar, 10), new jzf(i6rVar, 9), 0));
        int i3 = 16;
        this.b = n3w.a(new kb60(new dt20((hro) this.k, (jzf) this.m, b3, new jzf(i6rVar, i3), 10)));
        this.i = i5m.b(new vu((xvf0) this.l, (xvf0) this.b, n3w.a(new hb60(new at20((jzf) this.f, new jzf(i6rVar, 15)))), i3));
    }

    public pzf(z8g z8gVar, p8g p8gVar, d8g d8gVar, h8g h8gVar, lh20 lh20Var, nh20 nh20Var, oh20 oh20Var) {
        this.i = this;
        this.e = z8gVar;
        this.f = p8gVar;
        this.g = d8gVar;
        this.h = h8gVar;
        this.a = i5m.b(new h0z(z8gVar.y, z8gVar.g, 19));
        n3w a = n3w.a(lh20Var);
        this.b = a;
        xvf0 b = i5m.b(new aos(a, 13));
        this.c = b;
        this.d = i5m.b(new h0z(i5m.b(new e3u((xvf0) this.b, b, (v7p) new q720(d8gVar.e, 20), 29)), (xvf0) this.c, 18));
        this.j = n3w.a(nh20Var);
        this.k = new ywf(14, this);
        n3w a2 = n3w.a(oh20Var);
        this.l = a2;
        this.m = new nt0((xvf0) d8gVar.e, (xvf0) this.a, (xvf0) this.d, (xvf0) this.j, (xvf0) this.k, (xvf0) this.c, (xvf0) this.b, z8gVar.y, p8gVar.n0, (xvf0) a2, 18, false);
    }
}
