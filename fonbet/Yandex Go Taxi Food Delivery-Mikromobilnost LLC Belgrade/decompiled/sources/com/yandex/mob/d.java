package com.yandex.mob;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.yandex.mob.MobMainInitializer;
import com.yandex.mob.api.model.MobEnvironment;
import defpackage.bvf0;
import defpackage.cb2;
import defpackage.dl20;
import defpackage.fl20;
import defpackage.gl20;
import defpackage.gwk0;
import defpackage.hl20;
import defpackage.i3y;
import defpackage.ike;
import defpackage.il20;
import defpackage.in20;
import defpackage.jl20;
import defpackage.jpt;
import defpackage.jr20;
import defpackage.jse;
import defpackage.kl20;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.no20;
import defpackage.npt;
import defpackage.ol20;
import defpackage.qm20;
import defpackage.rol0;
import defpackage.tot;
import defpackage.tpr;
import defpackage.tr20;
import defpackage.vg10;
import defpackage.yn20;
import defpackage.zn20;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.LazyThreadSafetyMode;

/* loaded from: classes8.dex */
public final class d implements kl20 {
    public final i3y A;
    public final i3y B;
    public final i3y C;
    public final i3y D;
    public final i3y E;
    public final i3y F;
    public final i3y G;
    public final i3y H;
    public final i3y I;
    public final i3y J;
    public final i3y K;
    public final i3y L;
    public final i3y M;
    public final i3y N;
    public final i3y O;
    public final Context a;
    public final MobEnvironment b;
    public final qm20 c;
    public final List d;
    public final zn20 e;
    public final npt f;
    public final com.yandex.go.proxyprovision.mob.a g;
    public final yn20 h;
    public final tot i;
    public final com.yandex.go.proxyprovision.mob.d j;
    public final no20 k;
    public final X509TrustManager l;
    public final SSLSocketFactory m;
    public final jse n;
    public final vg10 o;
    public final jpt p;
    public final i3y q;
    public final i3y r;
    public final i3y s;
    public final i3y t;
    public final i3y u;
    public final i3y v;
    public final i3y w;
    public final i3y x;
    public final i3y y;
    public final i3y z;

    public d(Context context, MobEnvironment mobEnvironment, qm20 qm20Var, List list, zn20 zn20Var, npt nptVar, com.yandex.go.proxyprovision.mob.a aVar, yn20 yn20Var, tot totVar, com.yandex.go.proxyprovision.mob.d dVar, X509TrustManager x509TrustManager, SSLSocketFactory sSLSocketFactory, mdh mdhVar, jpt jptVar) {
        no20 no20Var = new no20();
        int i = 1;
        vg10 vg10Var = new vg10(i);
        this.a = context;
        this.b = mobEnvironment;
        this.c = qm20Var;
        this.d = list;
        this.e = zn20Var;
        this.f = nptVar;
        this.g = aVar;
        this.h = yn20Var;
        this.i = totVar;
        this.j = dVar;
        this.k = no20Var;
        this.l = x509TrustManager;
        this.m = sSLSocketFactory;
        this.n = mdhVar;
        this.o = vg10Var;
        this.p = jptVar;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        this.q = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 20));
        this.r = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 25));
        this.s = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 26));
        this.t = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 27));
        this.u = kotlin.a.b(lazyThreadSafetyMode, new il20());
        this.v = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 28));
        this.w = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 29));
        int i2 = 0;
        this.x = kotlin.a.b(lazyThreadSafetyMode, new jl20(this, i2));
        this.y = kotlin.a.b(lazyThreadSafetyMode, new jl20(this, i));
        this.z = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 12));
        this.A = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 13));
        this.B = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 14));
        this.C = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 15));
        this.D = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 16));
        this.E = kotlin.a.b(lazyThreadSafetyMode, new gl20());
        this.F = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 17));
        this.G = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 18));
        this.H = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 19));
        this.I = kotlin.a.b(lazyThreadSafetyMode, new c(this, i2));
        this.J = kotlin.a.b(lazyThreadSafetyMode, new c(this, i));
        this.K = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 21));
        this.L = kotlin.a.b(lazyThreadSafetyMode, new hl20());
        this.M = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 22));
        this.N = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 23));
        this.O = kotlin.a.b(lazyThreadSafetyMode, new dl20(this, 24));
    }

    public static final com.yandex.mob.domain.l f(d dVar) {
        return (com.yandex.mob.domain.l) dVar.x.getValue();
    }

    public static final com.yandex.mob.datastore.d g(d dVar) {
        return (com.yandex.mob.datastore.d) dVar.G.getValue();
    }

    public static final com.yandex.mob.datastore.f h(d dVar) {
        return (com.yandex.mob.datastore.f) dVar.N.getValue();
    }

    @Override // defpackage.kl20
    public final fl20 a() {
        return (fl20) this.F.getValue();
    }

    @Override // defpackage.ur20
    public final void b() {
        j().b();
    }

    @Override // defpackage.ur20
    public final void c() {
        cb2 k = k();
        ConnectivityManager connectivityManager = k.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            k.a(networkCapabilities);
        }
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(4).addTransportType(0).addTransportType(1).build(), k.c);
        j().c();
    }

    @Override // defpackage.ur20
    public final m d() {
        return j().d();
    }

    @Override // defpackage.ur20
    public final in20 e(String str, ol20... ol20VarArr) {
        return j().e(str, (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length));
    }

    public final void i() {
        ike ikeVar;
        cb2 k = k();
        k.getClass();
        try {
            k.a.unregisterNetworkCallback(k.c);
        } catch (Throwable unused) {
        }
        MobMainInitializer mobMainInitializer = (MobMainInitializer) j().c.getValue();
        jr20 jr20Var = (jr20) mobMainInitializer.c.get();
        if (jr20Var != null && (ikeVar = jr20Var.c) != null) {
            bvf0.i(ikeVar, "detach scope", null);
        }
        l8x l8xVar = (l8x) mobMainInitializer.e.get();
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        mobMainInitializer.a.set(gwk0.b());
        mobMainInitializer.b.set(MobMainInitializer.State.NOT_INITIALIZED);
        tr20.a.set(null);
    }

    public final j j() {
        return (j) this.O.getValue();
    }

    public final cb2 k() {
        return (cb2) this.s.getValue();
    }

    public final tpr l(String str, ol20... ol20VarArr) {
        j j = j();
        ol20[] ol20VarArr2 = (ol20[]) Arrays.copyOf(ol20VarArr, ol20VarArr.length);
        j.getClass();
        return kotlinx.coroutines.flow.e.C(new rol0(new MobMainProcess$selectedProxiesFlow$1(j, null)), new MobMainProcess$selectedProxiesFlow$2(j, str, ol20VarArr2, null));
    }
}
