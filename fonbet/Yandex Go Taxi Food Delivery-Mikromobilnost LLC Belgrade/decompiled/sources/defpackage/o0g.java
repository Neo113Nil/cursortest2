package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.TaxiApplication;

/* loaded from: classes14.dex */
public final class o0g {
    public final TaxiApplication a;
    public final xvf0 b = dhs0.a(e60.a);
    public final n3w c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final y2r0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final m7q0 n;
    public final xvf0 o;
    public final xvf0 p;
    public final xvf0 q;
    public final xvf0 r;
    public final xvf0 s;
    public final xvf0 t;

    public o0g(TaxiApplication taxiApplication) {
        this.a = taxiApplication;
        n3w a = n3w.a(taxiApplication);
        this.c = a;
        int i = 4;
        int i2 = 2;
        this.d = i5m.b(new zof0(new eqf0(a, i), i2));
        xvf0 b = i5m.b(new m7q0(this.c, 25));
        this.e = b;
        int i3 = 0;
        xvf0 b2 = i5m.b(new mt2(b, i3));
        n3w n3wVar = this.c;
        this.f = i5m.b(new g6((xvf0) n3wVar, this.d, b2, (xvf0) new o0t(n3wVar, 14), (xvf0) new o0t(s8h.a, 22), 29));
        n3w n3wVar2 = y2r0.c;
        ArrayList arrayList = new ArrayList(1);
        this.g = g8e.g(arrayList, this.f, arrayList, Collections.EMPTY_LIST);
        this.h = i5m.b(opb.a);
        ArrayList arrayList2 = new ArrayList(1);
        xvf0 b3 = i5m.b(new peb(i5m.b(new qpb(this.b, this.g, g8e.g(arrayList2, this.h, arrayList2, Collections.EMPTY_LIST), i3)), i2));
        this.i = b3;
        this.j = i5m.b(new zof0(new o0t(b3, 12), i));
        this.k = i5m.b(new jqz0(this.c, 28));
        this.l = i5m.b(new mt2(this.e, i));
        this.m = i5m.b(mnr0.a);
        n3w n3wVar3 = this.c;
        int i4 = 26;
        this.n = new m7q0(n3wVar3, i4);
        xvf0 b4 = i5m.b(new xyd0(n3wVar3, 10));
        this.o = b4;
        xvf0 b5 = i5m.b(new p350(b4, 20));
        this.p = b5;
        this.q = i5m.b(new zof0(new r2i(this.d, this.i, this.m, this.n, b5, 23), 1));
        xvf0 b6 = i5m.b(new l180(this.c, 19));
        this.r = b6;
        this.s = i5m.b(new oe(this.e, this.q, b6, 23));
        this.t = i5m.b(new zof0(new a4t(this.i, this.p, i4), 9));
    }

    public final jo90 a() {
        h3y a = i5m.a(this.j);
        ei11 ei11Var = (ei11) this.k.get();
        TaxiApplication taxiApplication = this.a;
        bjf bjfVar = new bjf(taxiApplication, ei11Var);
        pw60 pw60Var = new pw60(bjfVar);
        new oua0();
        OkHttpClient.a aVar = new OkHttpClient.a();
        aVar.c(new t6f0(2, a));
        ow60 ow60Var = (ow60) pw60Var.b.getValue();
        if (!bjfVar.b.a().a) {
            ow60Var = null;
        }
        if (ow60Var != null) {
            aVar.h(ow60Var.b, ow60Var.a);
        }
        xvf0 xvf0Var = this.l;
        im51 im51Var = (im51) xvf0Var.get();
        xl51 xl51Var = (xl51) this.s.get();
        v0p externalProcessCredentials = taxiApplication.externalProcessCredentials();
        q5z.i(externalProcessCredentials);
        return new jo90(taxiApplication, aVar, im51Var, xl51Var, externalProcessCredentials, (vot) this.t.get(), (ko21) this.r.get(), new yvi0((Object) new am2(taxiApplication, 17)), new rms(new hrq0()), new hqe(new zpq(1, new say0((dne0) this.o.get())), (im51) xvf0Var.get()));
    }
}
