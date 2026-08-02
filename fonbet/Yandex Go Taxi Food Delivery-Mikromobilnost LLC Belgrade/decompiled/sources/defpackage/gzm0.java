package defpackage;

import android.content.Context;
import kotlin.a;

/* loaded from: classes13.dex */
public final class gzm0 extends h55 {
    public final /* synthetic */ int D;
    public final Object E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gzm0(ap30 ap30Var, zo30 zo30Var) {
        super(null);
        this.D = 2;
        this.E = a.a(new b700(7, ap30Var, zo30Var, this));
    }

    @Override // defpackage.h55
    public void G(Object obj) {
        switch (this.D) {
            case 2:
                ((ru.yandex.taxi.masstransit.main.ui.overlay.a) ((i3y) this.E).getValue()).b();
                break;
        }
    }

    @Override // defpackage.h55
    public void H(Object obj) {
        switch (this.D) {
            case 2:
                ru.yandex.taxi.masstransit.main.ui.overlay.a aVar = (ru.yandex.taxi.masstransit.main.ui.overlay.a) ((i3y) this.E).getValue();
                aVar.b.detach();
                aVar.a.Cg();
                f4c0 f4c0Var = aVar.e;
                if (f4c0Var != null) {
                    f4c0Var.d();
                }
                aVar.e = null;
                f4c0 f4c0Var2 = aVar.f;
                if (f4c0Var2 != null) {
                    f4c0Var2.d();
                }
                aVar.e = null;
                xm00 xm00Var = aVar.d;
                if (xm00Var != null) {
                    xm00Var.m();
                }
                xm00 xm00Var2 = aVar.d;
                if (xm00Var2 != null) {
                    xm00Var2.d();
                }
                aVar.d = null;
                l30 l30Var = aVar.g;
                if (l30Var != null) {
                    l30Var.cancel();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        int i = this.D;
        int i2 = 3;
        Object obj2 = this.E;
        int i3 = 0;
        switch (i) {
            case 0:
                czm0 czm0Var = (czm0) obj;
                if (czm0Var == null) {
                    w511.b();
                    break;
                } else {
                    A((m950) ((qx5) obj2).get(), czm0Var, new p4g0(this, i2));
                    break;
                }
            case 1:
                D((m950) ((s5i) obj2).get(), (p4i) obj, new bb0(this, 27));
                break;
            case 3:
                nkr0 nkr0Var = (nkr0) obj;
                Context context = (Context) obj2;
                nkr0Var.getClass();
                String str = nkr0Var.b;
                String str2 = nkr0Var.a;
                int i4 = 9;
                if (str == null) {
                    q5z.c0(str2, null, context, 0);
                    r(new qu(i4));
                    break;
                } else {
                    q5z.c0(str2, str, context, 0);
                    r(new qu(i4));
                    break;
                }
            case 4:
                oh11 oh11Var = (oh11) obj;
                rg11 rg11Var = (rg11) obj2;
                w030 w030Var = oh11Var.b;
                v770 v770Var = oh11Var.a;
                rg11Var.getClass();
                v770Var.getClass();
                tbg tbgVar = new tbg(rg11Var, i2);
                tbg tbgVar2 = new tbg(rg11Var, 6);
                int i5 = 1;
                xvf0 b = i5m.b(new jpn0(tbgVar, i5m.b(new gpx0(tbgVar2, i5m.b(hg11.a), i5m.b(si11.a))), jsh.a, new m430(tbgVar2, i5), yrh.a, new m430(tbgVar2, i3), new mg11(new tbg(rg11Var, 4), tbgVar2, i5), new tbg(rg11Var, i3)));
                int i6 = 2;
                xvf0 b2 = i5m.b(new nb11(b, i6));
                mg11 mg11Var = new mg11(n3w.a(v770Var), new y501(new tbg(rg11Var, i6), 29), i3);
                n3w a = n3w.a(new th11(new cjw0(b2, mg11Var, tbgVar2)));
                tbg tbgVar3 = new tbg(rg11Var, i5);
                n3w a2 = n3w.a(new gh11(new kcz0(tbgVar3, new tbg(rg11Var, 7))));
                int i7 = 5;
                xvf0 b3 = i5m.b(new f2i(n3w.b(w030Var), n3w.a(rg11Var), i7));
                n3w a3 = n3w.a(new clr0(new cln(tbgVar3)));
                n3w a4 = n3w.a(new rlr0(new fcj0(tbgVar3, i5m.b(new m7q0(b, 22)), zkr0.a, mg11Var, tbgVar2)));
                n3w a5 = n3w.a(new idj(new jdj(i3, tbgVar3, b3, n3w.a(new ldj(mdj.a)))));
                n3w a6 = n3w.a(new ug11(new kcz0(tbgVar3, b3)));
                n3w a7 = n3w.a(new hlr0(new vmn0(b3, a3, a4, a5, a6, new kln(b3, n3w.a(new bln(new cln(tbgVar3))), n3w.a(new gln(hln.a))))));
                n3w a8 = n3w.a(new qh11(new a201(10, new tbg(rg11Var, i7), b3)));
                th11 th11Var = (th11) a.a;
                gh11 gh11Var = (gh11) a2.a;
                hlr0 hlr0Var = (hlr0) a7.a;
                ug11 ug11Var = (ug11) a6.a;
                idj idjVar = (idj) a5.a;
                qh11 qh11Var = (qh11) a8.a;
                zuj0 zuj0Var = rg11Var.e;
                q5z.h(zuj0Var);
                z(new glr0(th11Var, gh11Var, hlr0Var, ug11Var, idjVar, qh11Var, zuj0Var, (w030) b3.get()), new wul0(i6, this));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gzm0(int i, Object obj) {
        super(null);
        this.D = i;
        this.E = obj;
    }
}
