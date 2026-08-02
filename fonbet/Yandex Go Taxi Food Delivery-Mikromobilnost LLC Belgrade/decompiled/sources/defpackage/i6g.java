package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.core.navigation.impl.api.router.a;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes12.dex */
public final class i6g implements fli0 {
    public final n3w A;
    public final wif B;
    public final n3w C;
    public final vm80 D;
    public final xvf0 E;
    public final tl3 F;
    public final b55 G;
    public final n3w H;
    public final xvf0 I;
    public final b55 J;
    public final n3w K;
    public final n3w L;
    public final sb1 M;
    public final t160 N;
    public final n3w O;
    public final k0n P;
    public final n3w Q;
    public final zi60 R;
    public final xvf0 S;
    public final xvf0 T;
    public final xvf0 U;
    public final xvf0 V;
    public final xvf0 W;
    public final xvf0 Z;
    public final String a;
    public final jp90 b;
    public final DefaultEnvironment c;
    public final Context w;
    public final xvf0 x = i5m.b(vpe.a);
    public final xvf0 y = i5m.b(e180.a);
    public final kk z;

    public i6g(a8o a8oVar, rqt0 rqt0Var, pr41 pr41Var, eli0 eli0Var, String str, Context context, DefaultEnvironment defaultEnvironment, jp90 jp90Var, PayEnvironment payEnvironment, Region region, rzq0 rzq0Var) {
        this.a = str;
        this.b = jp90Var;
        this.c = defaultEnvironment;
        this.w = context;
        n3w n3wVar = n3w.b;
        int i = 17;
        this.z = new kk(n3wVar, i);
        n3w a = n3w.a(context);
        this.A = a;
        int i2 = 26;
        int i3 = 0;
        this.B = new wif((Object) this.z, (xvf0) new peb(a, i2), i3);
        n3w a2 = n3w.a(payEnvironment);
        this.C = a2;
        this.D = new vm80(this.B, a2, 4);
        xvf0 b = i5m.b(new p4((xvf0) new b55(23, eli0Var), (xvf0) new oto0(this.A, new b55(24, eli0Var), 22), 14));
        this.E = b;
        int i4 = 1;
        this.F = new tl3(b, i4);
        this.G = new b55(25, eli0Var);
        this.H = n3wVar;
        this.I = i5m.b(new br10(oo10.a, i3));
        this.J = new b55(i2, eli0Var);
        this.K = n3w.a(region);
        n3w a3 = n3w.a(rzq0Var);
        this.L = a3;
        this.M = new sb1(this.A, this.G, this.H, this.I, this.J, this.K, a3, 3);
        this.N = new t160(zpe.a, i3);
        this.O = j6g.a;
        this.P = new k0n(this.B, this.C, 16);
        n3w a4 = n3w.a(defaultEnvironment);
        this.Q = a4;
        wif wifVar = this.B;
        int i5 = 27;
        this.R = new zi60(wifVar, this.P, new ibz0(wifVar, a4, i5), 19, false);
        b55 b55Var = new b55(i5, eli0Var);
        n3w n3wVar2 = this.A;
        this.S = i5m.b(new sb1(okl0.a, n3wVar2, a4, new wj0(n3wVar2, this.E, this.I, this.y, this.J, b55Var, this.K, this.L, 1), qv2.a, f6o.a, this.O, 1));
        n3w n3wVar3 = y2r0.c;
        ArrayList arrayList = new ArrayList(1);
        List list = Collections.EMPTY_LIST;
        arrayList.add(qfh.a);
        y2r0 y2r0Var = new y2r0(arrayList, list);
        xvf0 xvf0Var = this.S;
        vfg0 vfg0Var = new vfg0(this.F, this.M, new ix50(new jx50(y2r0.c, this.N, this.O, this.R, new ssj(xvf0Var, y2r0Var, 3))), new nb11(this.A, i), 6);
        jc50 jc50Var = new jc50(this.D, vfg0Var, xvf0Var, 20);
        this.T = i5m.b(new ys10(this.y, new zi60(new y7f(jc50Var, i3), new y7f(jc50Var, i4), new jde0(new wvq((v7p) this.P, (xvf0) vfg0Var, xvf0Var, (xvf0) this.C, (xvf0) ogs.a, (xvf0) this.B, 3), i5), 10), 29));
        xvf0 b2 = i5m.b(new l180(new c1(this.S, 7), i));
        this.U = b2;
        this.V = i5m.b(new zy31(this.E, this.A, this.Q, b2, this.K, 1));
        this.W = i5m.b(xn41.a);
        this.Z = i5m.b(x13.a);
    }

    @Override // defpackage.x6o
    public final v7o A() {
        return new x7o();
    }

    @Override // defpackage.nqt0
    public final jp90 C() {
        return this.b;
    }

    public final a Q() {
        return (a) this.x.get();
    }

    @Override // defpackage.nqt0
    public final hk3 a() {
        return (hk3) this.E.get();
    }

    @Override // defpackage.nqt0
    public final dn90 b() {
        return (dn90) this.U.get();
    }

    @Override // defpackage.nqt0
    public final pvr0 d() {
        return new qvr0();
    }

    @Override // defpackage.nqt0
    public final z22 getAnalytics() {
        return (z22) this.S.get();
    }

    @Override // defpackage.nqt0
    public final DefaultEnvironment getEnvironment() {
        return this.c;
    }

    @Override // defpackage.nqt0
    public final zn90 h() {
        return p03.j(this.c);
    }

    @Override // defpackage.nqt0
    public final mqt0 l() {
        return new com.yandex.fintechsdk.flows.applink.payment.internal.di.redirecthost.features.splash.a(this.a, (com.yandex.fintechsdk.data.payment.impl.internal.order.a) this.T.get(), (zu41) this.V.get());
    }

    @Override // defpackage.nqt0
    public final sqt0 n() {
        return new c8o((a) this.x.get(), 1);
    }

    @Override // defpackage.nqt0
    public final cqt0 s() {
        return new kli0();
    }

    @Override // defpackage.x6o
    public final b8o t() {
        return new aye0(12, (a) this.x.get());
    }
}
