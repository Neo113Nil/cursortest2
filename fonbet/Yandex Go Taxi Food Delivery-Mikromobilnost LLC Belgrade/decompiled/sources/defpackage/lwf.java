package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.adapters.flex.sdk.api.FlexAdapter;
import com.yandex.fintechsdk.core.navigation.impl.api.router.a;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.pay.payment.PaymentData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import okhttp3.OkHttpClient;

/* loaded from: classes12.dex */
public final class lwf implements z13 {
    public final PaymentData A;
    public final DefaultEnvironment B;
    public final b2w C;
    public final pm5 D;
    public final jp90 E;
    public final IntentArgs F;
    public final n3w G;
    public final n3w H;
    public final xvf0 I;
    public final xvf0 J = i5m.b(new br10(oo10.a, 0));
    public final xvf0 K = i5m.b(e180.a);
    public final n3w L;
    public final n3w M;
    public final n3w N;
    public final n3w O;
    public final n3w P;
    public final xvf0 Q;
    public final xvf0 R;
    public final xvf0 S;
    public final xvf0 T;
    public final tl3 U;
    public final n3w V;
    public final sb1 W;
    public final t160 Z;
    public final Context a;
    public final wif a0;
    public final PayEnvironment b;
    public final n3w b0;
    public final Set c;
    public final k0n c0;
    public final zi60 d0;
    public final vfg0 e0;
    public final wvq f0;
    public final xvf0 g0;
    public final c1 h0;
    public final xvf0 i0;
    public final xvf0 j0;
    public final xvf0 k0;
    public final xvf0 l0;
    public final f2b m0;
    public final xvf0 n0;
    public final jc50 o0;
    public final xvf0 p0;
    public final xvf0 q0;
    public final xvf0 r0;
    public final ko10 w;
    public final PayboxScenario x;
    public final Region y;
    public final rzq0 z;

    /* JADX WARN: Multi-variable type inference failed */
    public lwf(kh5 kh5Var, a8o a8oVar, rqt0 rqt0Var, zr41 zr41Var, pm5 pm5Var, Context context, DefaultEnvironment defaultEnvironment, b2w b2wVar, IntentArgs intentArgs, ko10 ko10Var, jp90 jp90Var, PayboxScenario payboxScenario, PayEnvironment payEnvironment, PaymentData paymentData, Region region, Set set, rzq0 rzq0Var) {
        this.a = context;
        this.b = payEnvironment;
        this.c = set;
        this.w = ko10Var;
        this.x = payboxScenario;
        this.y = region;
        this.z = rzq0Var;
        this.A = paymentData;
        this.B = defaultEnvironment;
        this.C = b2wVar;
        this.D = pm5Var;
        this.E = jp90Var;
        this.F = intentArgs;
        this.G = n3w.a(context);
        this.H = n3w.a(defaultEnvironment);
        int i = 14;
        this.I = i5m.b(new p4(i5m.b(oj3.a), (xvf0) new oto0(this.G, bqr.a, 22), i));
        this.L = n3w.a(payboxScenario);
        this.M = n3w.a(paymentData);
        this.N = n3w.a(region);
        n3w a = n3w.a(rzq0Var);
        this.O = a;
        n3w n3wVar = this.G;
        wj0 wj0Var = new wj0(n3wVar, this.I, this.J, this.K, this.L, this.M, this.N, a, 1);
        n3w n3wVar2 = mwf.a;
        this.P = n3wVar2;
        this.Q = i5m.b(new sb1(okl0.a, n3wVar, this.H, wj0Var, qv2.a, f6o.a, n3wVar2, 1));
        this.R = i5m.b(x13.a);
        int i2 = 17;
        int i3 = 20;
        this.S = i5m.b(new hbn(i3, new njp(this.O, i2)));
        this.T = i5m.b(vpe.a);
        int i4 = 1;
        this.U = new tl3(this.I, i4);
        this.V = n3w.a(set);
        n3w b = n3w.b(ko10Var);
        n3w n3wVar3 = this.G;
        this.W = new sb1(n3wVar3, this.V, b, this.J, this.L, this.N, this.O, 3);
        this.Z = new t160(zpe.a, 0 == true ? 1 : 0);
        this.a0 = new wif((Object) new kk(n3w.b, i2), (xvf0) new peb(n3wVar3, 26), (int) (0 == true ? 1 : 0));
        n3w a2 = n3w.a(payEnvironment);
        this.b0 = a2;
        wif wifVar = this.a0;
        int i5 = 16;
        k0n k0nVar = new k0n(wifVar, a2, i5);
        this.c0 = k0nVar;
        int i6 = 27;
        this.d0 = new zi60(wifVar, k0nVar, new ibz0(wifVar, this.H, i6), 19, false);
        n3w n3wVar4 = y2r0.c;
        ArrayList arrayList = new ArrayList(1);
        List list = Collections.EMPTY_LIST;
        arrayList.add(qfh.a);
        y2r0 y2r0Var = new y2r0(arrayList, list);
        xvf0 xvf0Var = this.Q;
        int i7 = 3;
        vfg0 vfg0Var = new vfg0(this.U, this.W, new ix50(new jx50(y2r0.c, this.Z, this.P, this.d0, new ssj(xvf0Var, y2r0Var, i7))), new nb11(this.G, i2), 6);
        this.e0 = vfg0Var;
        oti otiVar = new oti((Object) vfg0Var, xvf0Var, 5, (boolean) (0 == true ? 1 : 0));
        kt5 kt5Var = new kt5(otiVar, 0 == true ? 1 : 0);
        wvq wvqVar = new wvq((v7p) this.c0, (xvf0) vfg0Var, xvf0Var, (xvf0) this.b0, (xvf0) ogs.a, (xvf0) this.a0, 3);
        this.f0 = wvqVar;
        int i8 = 7;
        kj7 kj7Var = new kj7(kt5Var, new h1t(wvqVar, 13), new kt5(otiVar, i4), i8);
        int i9 = 2;
        this.g0 = i5m.b(new dx7(ub8.a, kj7Var, i9));
        c1 c1Var = new c1(this.Q, i8);
        this.h0 = c1Var;
        this.i0 = i5m.b(new hbn(i5, c1Var));
        this.j0 = i5m.b(new l180(this.h0, i2));
        this.k0 = i5m.b(new vqa0(this.h0, 23));
        this.l0 = i5m.b(new up41(this.h0, i7));
        wvq wvqVar2 = this.f0;
        this.m0 = new f2b(new njp(wvqVar2, i6), new xat((xvf0) wvqVar2, (int) (0 == true ? 1 : 0)), new xat(wvqVar2, i7), i);
        int i10 = 4;
        this.n0 = i5m.b(new fwc(this.m0, i5m.b(yzd.a), i10));
        jc50 jc50Var = new jc50(new vm80(this.a0, this.b0, i10), this.e0, this.Q, i3);
        this.o0 = jc50Var;
        this.p0 = i5m.b(new ys10(this.K, new zi60(new y7f(jc50Var, 0 == true ? 1 : 0), new y7f(jc50Var, i4), new jde0(this.f0, i6), 10), 29));
        n3w n3wVar5 = this.G;
        this.q0 = i5m.b(new e3u((xvf0) new njp(n3wVar5, 22), (xvf0) new q720(n3wVar5, i2), (xvf0) new q720(n3wVar5, 18), i7));
        jc50 jc50Var2 = this.o0;
        this.r0 = i5m.b(new zi60(j8b0.a, new g680((xvf0) new c7n(jc50Var2, 12), (xvf0) new xat(jc50Var2, i9), 15), new vqa0(this.G, i10), 29, false));
    }

    @Override // defpackage.x6o
    public final v7o A() {
        return new x7o();
    }

    @Override // defpackage.sg5
    public final void B() {
    }

    @Override // defpackage.nqt0
    public final jp90 C() {
        return this.E;
    }

    @Override // defpackage.sg5
    public final bvt D() {
        return new dvt();
    }

    @Override // defpackage.sg5
    public final ype E() {
        sif sifVar = new sif();
        peb.d(this.a);
        return new ype(new rgs(new vif(sifVar), this.b), 1);
    }

    @Override // defpackage.sg5
    public final gdr F() {
        return null;
    }

    @Override // defpackage.sg5
    public final azw G() {
        return new azw(true);
    }

    @Override // defpackage.sg5
    public final sl3 H() {
        return new sl3((hk3) this.I.get(), 1);
    }

    @Override // defpackage.sg5
    public final j011 I() {
        return new l011();
    }

    @Override // defpackage.sg5
    public final xb8 J() {
        return (xb8) this.g0.get();
    }

    @Override // defpackage.sg5
    public final pao K() {
        return null;
    }

    @Override // defpackage.sg5
    public final uyi0 L() {
        return null;
    }

    @Override // defpackage.sg5
    public final ryw M() {
        return new ryw(false);
    }

    @Override // defpackage.sg5
    public final fp51 N() {
        return (fp51) this.l0.get();
    }

    @Override // defpackage.sg5
    public final Region O() {
        return this.y;
    }

    @Override // defpackage.sg5
    public final d860 P() {
        return new t311();
    }

    @Override // defpackage.sg5
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final a getRouter() {
        return (a) this.T.get();
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final hk3 a() {
        return (hk3) this.I.get();
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final dn90 b() {
        return (dn90) this.j0.get();
    }

    @Override // defpackage.sg5
    public final OkHttpClient.a c() {
        Set set = Collections.EMPTY_SET;
        s160 s160Var = new s160(null);
        Optional empty = Optional.empty();
        Context context = this.a;
        peb.d(context);
        peb.d(context);
        peb.d(context);
        return jx50.a(set, s160Var, empty, new v1k0((z22) this.Q.get(), Collections.singleton(new pfh())));
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final pvr0 d() {
        return new qvr0();
    }

    @Override // defpackage.sg5
    public final lg5 e() {
        return new ng5((w13) this.R.get());
    }

    @Override // defpackage.sg5
    public final ug5 f() {
        return new ug5(7, "pay/v2/screens/payment", null, null);
    }

    @Override // defpackage.sg5
    public final com.yandex.fintechsdk.core.network.impl.internal.network.a g() {
        z22 z22Var = (z22) this.Q.get();
        sl3 sl3Var = new sl3((hk3) this.I.get(), 1);
        ar10 ar10Var = (ar10) this.J.get();
        Region region = this.y;
        rzq0 rzq0Var = this.z;
        Context context = this.a;
        return new com.yandex.fintechsdk.core.network.impl.internal.network.a(svn.a, z22Var, new h6j0(sl3Var, new h25(context, this.c, this.w, ar10Var, this.x, region, rzq0Var), new OkHttpClient(c()), new abe(context, false, false)));
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final z22 getAnalytics() {
        return (z22) this.Q.get();
    }

    @Override // defpackage.sg5
    public final Context getApplicationContext() {
        return this.a;
    }

    @Override // defpackage.sg5, defpackage.nqt0
    public final DefaultEnvironment getEnvironment() {
        return this.B;
    }

    @Override // defpackage.nqt0
    public final zn90 h() {
        return p03.j(this.B);
    }

    @Override // defpackage.sg5
    public final uva0 i() {
        return null;
    }

    @Override // defpackage.sg5
    public final void j() {
        if (this.k0.get() == null) {
            return;
        }
        ny61.u();
    }

    @Override // defpackage.sg5
    public final void k() {
        Map map = Collections.EMPTY_MAP;
    }

    @Override // defpackage.nqt0
    public final mqt0 l() {
        return new com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.splash.data.a((z22) this.Q.get(), (hk3) this.I.get(), (com.yandex.fintechsdk.data.config.impl.internal.a) this.n0.get(), (ar10) this.J.get(), (com.yandex.fintechsdk.data.payment.impl.internal.order.a) this.p0.get(), this.A, this.y);
    }

    @Override // defpackage.sg5
    public final FlexAdapter m() {
        return (FlexAdapter) this.i0.get();
    }

    @Override // defpackage.nqt0
    public final sqt0 n() {
        return new amp0((com.yandex.fintechsdk.data.config.impl.internal.a) this.n0.get(), (a) this.T.get(), this.c);
    }

    @Override // defpackage.sg5
    public final zyw o() {
        return new zyw(false);
    }

    @Override // defpackage.sg5
    public final dh5 p() {
        return new fh5(this.A);
    }

    @Override // defpackage.sg5
    public final oaj q() {
        return new qaj();
    }

    @Override // defpackage.sg5
    public final ah5 r() {
        hk3 hk3Var = (hk3) this.I.get();
        s4s s4sVar = (s4s) this.S.get();
        ngs ngsVar = new ngs();
        ar10 ar10Var = (ar10) this.J.get();
        Context context = this.a;
        return new ch5(context, hk3Var, this.b, this.c, s4sVar, ngsVar, this.w, ar10Var, this.x, this.y, this.z, new abe(context, false, false));
    }

    @Override // defpackage.nqt0
    public final cqt0 s() {
        return new com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.splash.auth.a(this.D, (com.yandex.fintechsdk.data.payment.impl.internal.order.a) this.p0.get(), this.x, this.A, this.y);
    }

    @Override // defpackage.x6o
    public final b8o t() {
        return new mh5((a) this.T.get(), 1);
    }

    @Override // defpackage.sg5
    public final b2w u() {
        return this.C;
    }

    @Override // defpackage.sg5
    public final lh5 v() {
        return new mh5((a) this.T.get(), 0);
    }

    @Override // defpackage.sg5
    public final abe w() {
        return new abe(this.a, false, false);
    }

    @Override // defpackage.sg5
    public final vh5 x() {
        return new xh5(this.a);
    }

    @Override // defpackage.sg5
    public final void y() {
    }

    @Override // defpackage.sg5
    public final qbj z() {
        return new rbj();
    }
}
