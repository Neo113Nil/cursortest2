package defpackage;

import android.content.Context;
import com.yandex.delivery.utils.dialogmanager.impl.b;
import kotlin.a;
import ru.yandex.taxi.masstransit.domain.f;
import ru.yandex.taxi.masstransit.experiment.d0;
import ru.yandex.taxi.masstransit.mapper.g;
import ru.yandex.taxi.masstransit.overlay.onmap.h;
import ru.yandex.taxi.masstransit.overlay.onmap.i;
import ru.yandex.taxi.masstransit.threads.ThreadsCardMode;

/* loaded from: classes6.dex */
public final class m640 extends h55 {
    public final /* synthetic */ int D = 0;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;
    public Object J;

    public m640(yvf0 yvf0Var, n3h n3hVar, zch zchVar, Context context) {
        super(null);
        this.E = yvf0Var;
        this.F = n3hVar;
        this.G = zchVar;
        this.H = context;
        this.I = a.a(new aei(this, 0));
        this.J = new aei(this, 1);
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.D) {
            case 0:
                ((a3v) this.H).a0(this);
                break;
            case 2:
                su30 su30Var = ((m190) obj).a;
                ru.yandex.taxi.masstransit.overlay.onmap.a aVar = (ru.yandex.taxi.masstransit.overlay.onmap.a) this.J;
                if (aVar != null) {
                    aVar.f.c.b();
                    gh00 gh00Var = (gh00) aVar.b;
                    gh00Var.u(aVar.j);
                    aVar.e.Cg();
                    aVar.d.detach();
                    gh00Var.I(false);
                    gh00Var.v();
                    ((z9x0) aVar.g).b();
                    aVar.a.Cg();
                    fw30 fw30Var = aVar.i;
                    if (fw30Var != null) {
                        fw30Var.a();
                    }
                    aVar.i = null;
                    xm00 xm00Var = aVar.h;
                    if (xm00Var != null) {
                        xm00Var.m();
                    }
                    xm00 xm00Var2 = aVar.h;
                    if (xm00Var2 != null) {
                        xm00Var2.d();
                    }
                    aVar.h = null;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        int i = this.D;
        Object obj2 = this.E;
        Object obj3 = this.G;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                ((a3v) obj4).b8(this);
                o640 o640Var = new o640(((k640) obj).a, ThreadsCardMode.COLLAPSED, (pg30) this.J, (String) null);
                D((m950) ((c8w) obj2).get(), o640Var, new l640(this, o640Var));
                break;
            case 1:
                wj20 wj20Var = new wj20(((mj20) obj).a);
                zch zchVar = (zch) obj3;
                y8g u = bvf0.u();
                u.getClass();
                qcp0 qcp0Var = new qcp0();
                gjz gjzVar = u.a;
                hwy0 c = gjzVar.c();
                t0k0 t0k0Var = (t0k0) u.m.get();
                hjz h = u.h();
                dci b = gjzVar.b();
                q5z.h(b);
                yuj0 yuj0Var = (yuj0) u.l0.get();
                b bVar = (b) u.a0.get();
                jwh a = gjzVar.a();
                q5z.h(a);
                wrr wrrVar = new wrr(qcp0Var, c, t0k0Var, h, b, yuj0Var, bVar, a, (qdc) u.V0.get());
                aei aeiVar = (aei) this.J;
                q5z.h(zchVar);
                bhh bhhVar = new bhh(16, this);
                Context context = (Context) obj4;
                czh czhVar = (czh) aeiVar.invoke();
                xl10 xl10Var = new xl10(zchVar);
                jl00 jl00Var = new jl00(new k3g(wrrVar, 0), 10);
                n3w a2 = n3w.a(context);
                dx9 dx9Var = new dx9(a2, new kk(a2, 14), 21);
                xvf0 b2 = i5m.b(new jl00(new k3g(wrrVar, 4), 11));
                xdc xdcVar = wdc.a;
                int i2 = 3;
                int i3 = 2;
                xvf0 b3 = i5m.b(new ys10(b2, new di20(new xat(xdcVar, 20), xdcVar, new tl3(xdcVar, 6), i2), i3));
                k3g k3gVar = new k3g(wrrVar, i2);
                k3g k3gVar2 = new k3g(wrrVar, i3);
                int i4 = 5;
                can canVar = new can(k3gVar, k3gVar2, i4);
                ywf ywfVar = new ywf(7, xl10Var);
                xvf0 b4 = i5m.b(rj20.a);
                int i5 = 6;
                xvf0 b5 = i5m.b(new prq(b3, (xvf0) jl00Var, (v7p) canVar, (xvf0) ywfVar, b4, 1));
                k3g k3gVar3 = new k3g(wrrVar, i4);
                peb pebVar = new peb(new k3g(wrrVar, 1), i5);
                czh.a(czhVar, new izh(new cxm(new aoi(new wjm(context, c, (bk20) n3w.a(new bk20(new wjm(jl00Var, dx9Var, b5, new di20(new di20(new qh4(k3gVar3, pebVar), pebVar, new qh4(pebVar, k3gVar3)), new k3g(wrrVar, i5), b4, 4), 29))).a, b, 28), wj20Var, new uj20(czhVar, bhhVar))), null, null, null, null, null, 8190));
                break;
            default:
                su30 su30Var = ((m190) obj).a;
                tk40 tk40Var = (tk40) this.F;
                mz30 mz30Var = (mz30) this.I;
                st0 st0Var = ((lk40) obj4).a;
                h hVar = new h((uj30) obj2, tk40Var, su30Var, mz30Var, (g) ((x0z) st0Var.y).get(), (tt2) ((u3g) st0Var.z).get(), (a3v) ((xvf0) st0Var.a).get(), (zj30) ((ret) st0Var.A).get(), (dz00) ((xvf0) st0Var.b).get(), (bt00) ((u3g) st0Var.B).get(), (d0) ((d701) st0Var.C).get(), (ah00) ((xvf0) st0Var.c).get(), (xj30) ((xvf0) st0Var.w).get(), (f) ((xvf0) st0Var.x).get(), (i) ((zw30) st0Var.D).get());
                v920 v920Var = ((ok40) obj3).a;
                ru.yandex.taxi.masstransit.overlay.onmap.a aVar = new ru.yandex.taxi.masstransit.overlay.onmap.a(hVar, (ah00) ((xvf0) v920Var.a).get(), (gw30) ((xvf0) v920Var.b).get(), (gzx) ((w7u) v920Var.c).get(), (ru.yandex.taxi.masstransit.userlocation.b) ((y101) v920Var.w).get(), (m010) ((xvf0) v920Var.x).get(), (y9x0) ((xvf0) v920Var.y).get());
                this.J = aVar;
                aVar.a();
                break;
        }
    }

    public m640(uj30 uj30Var, tk40 tk40Var, mz30 mz30Var, ok40 ok40Var, lk40 lk40Var) {
        super(null);
        this.E = uj30Var;
        this.F = tk40Var;
        this.I = mz30Var;
        this.G = ok40Var;
        this.H = lk40Var;
    }

    public m640(c8w c8wVar, gb0 gb0Var, zuj0 zuj0Var, a3v a3vVar) {
        super(null);
        this.E = c8wVar;
        this.F = gb0Var;
        this.G = zuj0Var;
        this.H = a3vVar;
        this.I = new mz30();
        this.J = new pg30(this, 1);
    }
}
