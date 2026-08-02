package defpackage;

import android.app.Application;
import com.yandex.payment.divkit.api.DivKitApi;
import com.yandex.payment.sdk.core.data.Merchant;
import com.yandex.payment.sdk.core.data.Payer;

/* loaded from: classes2.dex */
public final class dzf implements mxk {
    public final xvf0 A;
    public final Application a;
    public final ao2 b;
    public final Merchant c;
    public final Payer d;
    public final pcy e;
    public final u870 f;
    public final rwo g;
    public final Boolean h;
    public final kk i;
    public final n3w j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final n3w q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;
    public final xvf0 u;
    public final xvf0 v;
    public final m7q0 w;
    public final n3w x;
    public final n3w y;
    public final n3w z;

    public dzf(rxk rxkVar, ao2 ao2Var, nuj0 nuj0Var, ncq0 ncq0Var, Application application, Merchant merchant, Payer payer, rwo rwoVar, pcy pcyVar, u870 u870Var, Boolean bool) {
        this.a = application;
        this.b = ao2Var;
        this.c = merchant;
        this.d = payer;
        this.e = pcyVar;
        this.f = u870Var;
        this.g = rwoVar;
        this.h = bool;
        this.i = new kk(rxkVar, n3w.a(application), 24);
        this.j = n3w.a(bool);
        xvf0 b = i5m.b(new b55(15, rxkVar));
        this.k = b;
        this.l = i5m.b(new faj(rxkVar, i5m.b(new faj(rxkVar, b, 14)), 12));
        xvf0 b2 = i5m.b(new b55(16, rxkVar));
        this.m = b2;
        this.n = i5m.b(new faj(rxkVar, b2, 16));
        xvf0 b3 = i5m.b(new b55(17, rxkVar));
        this.o = b3;
        this.p = i5m.b(new faj(rxkVar, b3, 19));
        n3w a = n3w.a(rwoVar);
        this.q = a;
        this.r = i5m.b(new k4a(rxkVar, this.i, this.j, this.l, this.n, this.p, a));
        this.s = i5m.b(new b55(14, rxkVar));
        this.t = i5m.b(new faj(rxkVar, this.k, 13));
        this.u = i5m.b(new faj(rxkVar, this.m, 15));
        this.v = i5m.b(new faj(rxkVar, this.o, 18));
        this.w = new m7q0(ncq0Var, this.i, 2);
        this.x = n3w.a(merchant);
        this.y = n3w.a(payer);
        this.z = n3w.a(pcyVar);
        n3w a2 = n3w.a(u870Var);
        n3w n3wVar = this.x;
        n3w n3wVar2 = this.y;
        kk kkVar = this.i;
        n3w n3wVar3 = this.z;
        n3w n3wVar4 = this.q;
        this.A = i5m.b(new faj(rxkVar, i5m.b(new pgi(rxkVar, this.w, new elo0(ncq0Var, new elo0(ncq0Var, new bo2(ao2Var, n3wVar, n3wVar2, kkVar, n3wVar3, a2, n3wVar4, this.j), n3wVar4, 16), n3wVar4, 17), this.s)), 17));
    }

    public final nx a() {
        return (nx) this.t.get();
    }

    public final ujk b() {
        return (ujk) this.r.get();
    }

    public final u2l c() {
        return (u2l) this.s.get();
    }

    public final DivKitApi d() {
        return bo2.a(this.b, this.c, this.d, this.a.getApplicationContext(), this.e, this.f, this.g, this.h.booleanValue());
    }

    public final abe e() {
        return new abe(this.a.getApplicationContext(), false, false);
    }
}
