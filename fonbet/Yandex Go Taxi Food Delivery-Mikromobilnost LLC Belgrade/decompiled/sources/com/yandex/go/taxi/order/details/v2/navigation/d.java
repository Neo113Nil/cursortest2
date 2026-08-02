package com.yandex.go.taxi.order.details.v2.navigation;

import android.content.Context;
import android.os.SystemClock;
import android.view.accessibility.AccessibilityManager;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import defpackage.ahu;
import defpackage.ba9;
import defpackage.blk0;
import defpackage.bo2;
import defpackage.c1;
import defpackage.c4;
import defpackage.cg7;
import defpackage.cta0;
import defpackage.dhs0;
import defpackage.f0g;
import defpackage.f2b;
import defpackage.fy30;
import defpackage.gv8;
import defpackage.gx60;
import defpackage.i5m;
import defpackage.ifk0;
import defpackage.iic;
import defpackage.jfk0;
import defpackage.jpf0;
import defpackage.jpj0;
import defpackage.jzi0;
import defpackage.k030;
import defpackage.k4;
import defpackage.kj7;
import defpackage.kkk0;
import defpackage.kkm;
import defpackage.lok0;
import defpackage.mbk0;
import defpackage.mjg0;
import defpackage.mnk0;
import defpackage.n3w;
import defpackage.n7i0;
import defpackage.nbk0;
import defpackage.nck0;
import defpackage.nok0;
import defpackage.nt0;
import defpackage.ny61;
import defpackage.o230;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.p6f;
import defpackage.p8k0;
import defpackage.ph70;
import defpackage.q150;
import defpackage.q2p;
import defpackage.q9y0;
import defpackage.r6g;
import defpackage.r9y0;
import defpackage.s3f0;
import defpackage.s5w0;
import defpackage.s6g;
import defpackage.s90;
import defpackage.s9y0;
import defpackage.sb1;
import defpackage.sck0;
import defpackage.t6g;
import defpackage.tck0;
import defpackage.tse;
import defpackage.u680;
import defpackage.u6g;
import defpackage.v680;
import defpackage.v6g;
import defpackage.v9y0;
import defpackage.vfg0;
import defpackage.w030;
import defpackage.w6g;
import defpackage.x6g;
import defpackage.x8k0;
import defpackage.xkk0;
import defpackage.xvf0;
import defpackage.xyd0;
import defpackage.ze;
import defpackage.zni0;
import java.io.Serializable;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class d {
    public final tse a;
    public final f0g b;
    public final q2p c;
    public final oep0 d;
    public volatile ifk0 e;
    public volatile ifk0 f;
    public volatile o2y0 g;

    public d(tse tseVar, f0g f0gVar, q2p q2pVar, oep0 oep0Var) {
        this.a = tseVar;
        this.b = f0gVar;
        this.c = q2pVar;
        this.d = oep0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable a(o2y0 o2y0Var, OrderScreen orderScreen, k030 k030Var, o230 o230Var, gx60 gx60Var, ContinuationImpl continuationImpl) {
        TaxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1 taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1;
        int i;
        blk0 blk0Var;
        long j;
        gx60 gx60Var2;
        if (continuationImpl instanceof TaxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1) {
            taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1 = (TaxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1) continuationImpl;
            int i2 = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1.label = i2 - Integer.MIN_VALUE;
                TaxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1 taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12 = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1;
                Object obj = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    blk0 blk0Var2 = new blk0();
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$0 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$1 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$2 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$3 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$4 = gx60Var;
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$5 = blk0Var2;
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.J$0 = elapsedRealtime;
                    taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.label = 1;
                    obj = c(o2y0Var, blk0Var2, orderScreen, o230Var, k030Var, taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    blk0Var = blk0Var2;
                    j = elapsedRealtime;
                    gx60Var2 = gx60Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.J$0;
                    blk0Var = (blk0) taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$5;
                    gx60 gx60Var3 = (gx60) taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$12.L$4;
                    kotlin.b.b(obj);
                    gx60Var2 = gx60Var3;
                }
                x6g x6gVar = (x6g) obj;
                jfk0 jfk0Var = (jfk0) x6gVar.y.a;
                s5w0 s5w0Var = new s5w0(24, blk0Var);
                kkm kkmVar = jfk0Var.a;
                ifk0 ifk0Var = new ifk0((w030) ((u6g) kkmVar.q).get(), (xvf0) kkmVar.a, i5m.a((xvf0) kkmVar.b), (xvf0) kkmVar.c, (xvf0) kkmVar.d, i5m.a((xvf0) kkmVar.e), (xvf0) kkmVar.f, (xvf0) kkmVar.g, (xvf0) kkmVar.h, (f2b) kkmVar.r, (xvf0) kkmVar.i, i5m.a((xvf0) kkmVar.j), i5m.a((xvf0) kkmVar.k), i5m.a((xvf0) kkmVar.l), i5m.a((xvf0) kkmVar.m), i5m.a((xvf0) kkmVar.n), (xvf0) kkmVar.o, (p6f) kkmVar.s, i5m.a((xvf0) kkmVar.p), (com.yandex.go.taxi.order.details.v2.domain.a) ((ze) kkmVar.t).get(), this.c, gx60Var2, s5w0Var);
                ((com.yandex.go.taxi.order.details.v2.analytics.perf.a) x6gVar.a.t0.get()).b(j);
                return new Pair(ifk0Var, x6gVar);
            }
        }
        taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1 = new TaxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1(this, continuationImpl);
        TaxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1 taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$122 = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$1;
        Object obj2 = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiRideCardRouterFacadeImpl$createRideCardComponentRouter$122.label;
        if (i != 0) {
        }
        x6g x6gVar2 = (x6g) obj2;
        jfk0 jfk0Var2 = (jfk0) x6gVar2.y.a;
        s5w0 s5w0Var2 = new s5w0(24, blk0Var);
        kkm kkmVar2 = jfk0Var2.a;
        ifk0 ifk0Var2 = new ifk0((w030) ((u6g) kkmVar2.q).get(), (xvf0) kkmVar2.a, i5m.a((xvf0) kkmVar2.b), (xvf0) kkmVar2.c, (xvf0) kkmVar2.d, i5m.a((xvf0) kkmVar2.e), (xvf0) kkmVar2.f, (xvf0) kkmVar2.g, (xvf0) kkmVar2.h, (f2b) kkmVar2.r, (xvf0) kkmVar2.i, i5m.a((xvf0) kkmVar2.j), i5m.a((xvf0) kkmVar2.k), i5m.a((xvf0) kkmVar2.l), i5m.a((xvf0) kkmVar2.m), i5m.a((xvf0) kkmVar2.n), (xvf0) kkmVar2.o, (p6f) kkmVar2.s, i5m.a((xvf0) kkmVar2.p), (com.yandex.go.taxi.order.details.v2.domain.a) ((ze) kkmVar2.t).get(), this.c, gx60Var2, s5w0Var2);
        ((com.yandex.go.taxi.order.details.v2.analytics.perf.a) x6gVar2.a.t0.get()).b(j);
        return new Pair(ifk0Var2, x6gVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(o2y0 o2y0Var, blk0 blk0Var, OrderScreen orderScreen, o230 o230Var, k030 k030Var, ContinuationImpl continuationImpl) {
        TaxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1 taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1;
        int i;
        w6g w6gVar;
        k030 k030Var2;
        AccessibilityManager accessibilityManager;
        o230 o230Var2;
        OrderScreen orderScreen2;
        if (continuationImpl instanceof TaxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1) {
            taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1 = (TaxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1) continuationImpl;
            int i2 = taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    f0g f0gVar = this.b;
                    f0gVar.getClass();
                    o2y0Var.getClass();
                    blk0Var.getClass();
                    v6g v6gVar = new v6g();
                    int i3 = 8;
                    v6gVar.a = new u6g(f0gVar, i3);
                    int i4 = 26;
                    v6gVar.b = new t6g(f0gVar, i4);
                    v6gVar.c = new r6g(f0gVar, i4);
                    v6gVar.d = n3w.a(o2y0Var);
                    v6gVar.e = new s6g(f0gVar, 2);
                    v6gVar.f = new s6g(f0gVar, 18);
                    v6gVar.g = new u6g(f0gVar, 5);
                    v6gVar.h = new t6g(f0gVar, 10);
                    int i5 = 6;
                    u6g u6gVar = new u6g(f0gVar, i5);
                    v6gVar.i = u6gVar;
                    u6g u6gVar2 = new u6g(f0gVar, 17);
                    v6gVar.j = u6gVar2;
                    r6g r6gVar = new r6g(f0gVar, 28);
                    v6gVar.k = r6gVar;
                    r6g r6gVar2 = new r6g(f0gVar, 21);
                    v6gVar.l = r6gVar2;
                    nbk0 nbk0Var = mbk0.a;
                    v6gVar.m = new cta0(u6gVar, nbk0Var, u6gVar2, r6gVar, r6gVar2, 24);
                    r6g r6gVar3 = new r6g(f0gVar, 27);
                    v6gVar.n = r6gVar3;
                    int i6 = 22;
                    v6gVar.o = new n7i0(v6gVar.n, dhs0.a(new xyd0(r6gVar3, i6)), 9);
                    int i7 = 12;
                    v6gVar.p = new r6g(f0gVar, i7);
                    s6g s6gVar = new s6g(f0gVar, 10);
                    v6gVar.q = s6gVar;
                    r6g r6gVar4 = v6gVar.c;
                    v6gVar.r = new jpj0(r6gVar4, v6gVar.l, s6gVar, 7, false);
                    r6g r6gVar5 = new r6g(f0gVar, 3);
                    v6gVar.s = r6gVar5;
                    s6g s6gVar2 = new s6g(f0gVar, 15);
                    v6gVar.t = s6gVar2;
                    t6g t6gVar = new t6g(f0gVar, i6);
                    v6gVar.u = t6gVar;
                    jpj0 jpj0Var = new jpj0(r6gVar5, s6gVar2, t6gVar, i5);
                    u6g u6gVar3 = new u6g(f0gVar, 16);
                    v6gVar.v = u6gVar3;
                    s6g s6gVar3 = new s6g(f0gVar, 16);
                    v6gVar.w = s6gVar3;
                    v6gVar.x = new cta0(jpj0Var, t6gVar, u6gVar3, s6gVar3, r6gVar4, 22);
                    s6g s6gVar4 = new s6g(f0gVar, 20);
                    v6gVar.y = s6gVar4;
                    zni0 zni0Var = new zni0(i5m.b(new ph70(iic.a, s6gVar4, t6gVar, r6gVar5, new r6g(f0gVar, 13), r6gVar4, 19)), i6);
                    s6g s6gVar5 = v6gVar.y;
                    zni0 zni0Var2 = new zni0(s6gVar5, 23);
                    n3w n3wVar = v6gVar.d;
                    r6g r6gVar6 = v6gVar.p;
                    jpj0 jpj0Var2 = v6gVar.r;
                    s6g s6gVar6 = v6gVar.q;
                    cta0 cta0Var = v6gVar.x;
                    v6gVar.z = new q150((xvf0) n3wVar, (xvf0) r6gVar6, (xvf0) jpj0Var2, (xvf0) s6gVar6, (xvf0) cta0Var, (xvf0) zni0Var, (xvf0) zni0Var2, 14);
                    v6gVar.A = new jpj0(cta0Var, zni0Var, n3wVar, i3);
                    v6gVar.B = new jpf0((xvf0) n3wVar, (xvf0) new s6g(f0gVar, 8), i6);
                    s6g s6gVar7 = new s6g(f0gVar, 17);
                    v6gVar.C = s6gVar7;
                    nck0 nck0Var = new nck0(s6gVar7, 1);
                    r6g r6gVar7 = v6gVar.s;
                    n7i0 n7i0Var = new n7i0(r6gVar7, s6gVar5, i3);
                    r6g r6gVar8 = v6gVar.k;
                    u6g u6gVar4 = v6gVar.j;
                    v6gVar.D = new cta0(s6gVar6, nck0Var, n7i0Var, r6gVar8, u6gVar4);
                    v6gVar.E = new vfg0(v6gVar.i, r6gVar8, u6gVar4, new nck0(s6gVar7, 0), 15);
                    v6gVar.F = new s6g(f0gVar, 22);
                    int i8 = 29;
                    xvf0 b = i5m.b(new jpj0(new cg7(new u6g(f0gVar, i7), new u6g(f0gVar, 23), i8), n3wVar, r6gVar7, 4, false));
                    v6gVar.G = b;
                    v6gVar.H = new s90(v6gVar.y, b, v6gVar.u, 13);
                    xvf0 b2 = i5m.b(new jpj0(v6gVar.d, new r6g(f0gVar, 7), v6gVar.s, 3));
                    v6gVar.I = b2;
                    int i9 = 15;
                    nt0 nt0Var = new nt0((xvf0) v6gVar.d, (xvf0) v6gVar.F, (xvf0) v6gVar.y, (xvf0) v6gVar.H, (xvf0) v6gVar.i, (xvf0) nbk0Var, (xvf0) v6gVar.u, v6gVar.G, b2, (xvf0) new u6g(f0gVar, 0), 28, false);
                    v6gVar.J = nt0Var;
                    v6gVar.K = new jzi0(6, nt0Var);
                    int i10 = 11;
                    v6gVar.L = new t6g(f0gVar, i10);
                    xvf0 b3 = i5m.b(mnk0.a);
                    v6gVar.M = b3;
                    u6g u6gVar5 = v6gVar.i;
                    s6g s6gVar8 = v6gVar.w;
                    p8k0 p8k0Var = new p8k0(u6gVar5, nbk0Var, b3, s6gVar8, 3);
                    v6gVar.N = p8k0Var;
                    t6g t6gVar2 = new t6g(f0gVar, i7);
                    v6gVar.O = t6gVar2;
                    t6g t6gVar3 = v6gVar.L;
                    r6g r6gVar9 = v6gVar.l;
                    n3w n3wVar2 = v6gVar.d;
                    v6gVar.P = new fy30(t6gVar3, p8k0Var, u6gVar5, s6gVar8, r6gVar9, nbk0Var, n3wVar2, t6gVar2, 22);
                    s6g s6gVar9 = v6gVar.y;
                    v6gVar.Q = new p8k0(n3wVar2, nbk0Var, s6gVar9, v6gVar.u, 2);
                    v6gVar.R = new jpf0((Object) p8k0Var, (xvf0) r6gVar9, 23);
                    r6g r6gVar10 = v6gVar.c;
                    r6g r6gVar11 = v6gVar.s;
                    u6g u6gVar6 = v6gVar.v;
                    v6gVar.S = new q150(r6gVar10, n3wVar2, nbk0Var, s6gVar9, s6gVar8, r6gVar11, u6gVar6);
                    v6gVar.T = new fy30(r6gVar10, n3wVar2, nbk0Var, s6gVar9, s6gVar8, r6gVar11, u6gVar6, v6gVar.q, 21);
                    n3w a = n3w.a(blk0Var);
                    v6gVar.U = a;
                    u6g u6gVar7 = new u6g(f0gVar, 18);
                    v6gVar.V = u6gVar7;
                    u6g u6gVar8 = new u6g(f0gVar, 13);
                    v6gVar.W = u6gVar8;
                    t6g t6gVar4 = new t6g(f0gVar, 17);
                    u6g u6gVar9 = new u6g(f0gVar, 26);
                    t6g t6gVar5 = new t6g(f0gVar, 4);
                    n3w n3wVar3 = v6gVar.d;
                    bo2 bo2Var = new bo2(n3wVar3, v6gVar.f, a, u6gVar7, u6gVar8, t6gVar4, u6gVar9, t6gVar5);
                    v6gVar.X = bo2Var;
                    t6g t6gVar6 = v6gVar.u;
                    tck0 tck0Var = sck0.a;
                    jpj0 jpj0Var3 = new jpj0(t6gVar4, t6gVar6, tck0Var, 11, false);
                    r6g r6gVar12 = v6gVar.n;
                    s3f0 s3f0Var = new s3f0(r6gVar12, t6gVar6, tck0Var, i9);
                    zni0 zni0Var3 = new zni0(tck0Var, i8);
                    n7i0 n7i0Var2 = new n7i0(r6gVar12, tck0Var, 10);
                    u6g u6gVar10 = v6gVar.i;
                    v6gVar.Y = new fy30(n3wVar3, bo2Var, jpj0Var3, s3f0Var, zni0Var3, n7i0Var2, u6gVar10, nbk0Var, 23);
                    v6gVar.Z = new k4((xvf0) n3wVar3, (xvf0) bo2Var, (xvf0) new s3f0(v6gVar.s, v6gVar.y, v6gVar.C, 14), (xvf0) jpj0Var3, (xvf0) n7i0Var2, (xvf0) zni0Var3, (xvf0) s3f0Var, (xvf0) v6gVar.q, (xvf0) v6gVar.l, (xvf0) u6gVar10, (xvf0) nbk0Var, 23, false);
                    xvf0 b4 = i5m.b(new zni0(x8k0.a, i9));
                    v6gVar.a0 = b4;
                    v6gVar.b0 = new s3f0(v6gVar.R, v6gVar.N, b4, i10);
                    v6gVar.c0 = new zni0(v6gVar.l, 20);
                    v6gVar.d0 = i5m.b(kkk0.a);
                    r6g r6gVar13 = new r6g(f0gVar, 24);
                    v6gVar.e0 = r6gVar13;
                    t6g t6gVar7 = new t6g(f0gVar, 19);
                    v6gVar.f0 = t6gVar7;
                    xvf0 b5 = i5m.b(new jpf0((xvf0) r6gVar13, (xvf0) t6gVar7, 20));
                    vfg0 vfg0Var = new vfg0(b5, v6gVar.e0, new s6g(f0gVar, 9), v6gVar.f0, 16);
                    zni0 zni0Var4 = v6gVar.c0;
                    n3w n3wVar4 = v6gVar.d;
                    v6gVar.g0 = new vfg0(zni0Var4, v6gVar.d0, new jpj0(zni0Var4, vfg0Var, n3wVar4, i7), b5, 14);
                    v6gVar.h0 = new n7i0(n3wVar4, v6gVar.X, 16);
                    s6g s6gVar10 = new s6g(f0gVar, 11);
                    v6gVar.i0 = s6gVar10;
                    u6g u6gVar11 = v6gVar.i;
                    v6gVar.j0 = new vfg0(u6gVar11, nbk0Var, s6gVar10, v6gVar.u, 17);
                    v6gVar.k0 = new zni0(v6gVar.N, 21);
                    v6gVar.l0 = new sb1(u6gVar11, v6gVar.j, v6gVar.w, v6gVar.M, v6gVar.l, nbk0Var, v6gVar.k, 29);
                    v6gVar.m0 = new s3f0(n3wVar4, v6gVar.O, v6gVar.R, i7);
                    v6gVar.n0 = new u6g(f0gVar, 10);
                    xvf0 b6 = i5m.b(nok0.a);
                    v6gVar.o0 = b6;
                    s6g s6gVar11 = v6gVar.q;
                    r6g r6gVar14 = v6gVar.n;
                    u6g u6gVar12 = v6gVar.n0;
                    u6g u6gVar13 = v6gVar.j;
                    r6g r6gVar15 = v6gVar.k;
                    n3w n3wVar5 = v6gVar.d;
                    vfg0 vfg0Var2 = new vfg0(v6gVar.i, nbk0Var, u6gVar12, new lok0(s6gVar11, r6gVar14, u6gVar12, u6gVar13, r6gVar15, b6, n3wVar5, 0), 18);
                    s6g s6gVar12 = v6gVar.w;
                    s6g s6gVar13 = v6gVar.y;
                    p8k0 p8k0Var2 = new p8k0(s6gVar12, s6gVar13, s6gVar11, nbk0Var, 5);
                    r6g r6gVar16 = v6gVar.s;
                    p8k0 p8k0Var3 = new p8k0(r6gVar16, s6gVar13, s6gVar12, v6gVar.u, 4);
                    xvf0 xvf0Var = v6gVar.d0;
                    v6gVar.p0 = i5m.b(new q150(n3wVar5, new gv8(n3wVar5, v6gVar.m, v6gVar.o, v6gVar.z, v6gVar.A, v6gVar.B, v6gVar.D, v6gVar.E, v6gVar.K, v6gVar.P, v6gVar.Q, v6gVar.R, v6gVar.S, v6gVar.T, v6gVar.Y, v6gVar.Z, v6gVar.b0, v6gVar.g0, v6gVar.h0, v6gVar.j0, v6gVar.k0, v6gVar.l0, v6gVar.m0, vfg0Var2, p8k0Var2, p8k0Var3, new ahu(s6gVar12, xvf0Var, s6gVar13, s6gVar11, nbk0Var, 26), new zni0(v6gVar.J, 18), new n7i0(nbk0Var, s6gVar11, i9), new q150((xvf0) nbk0Var, (xvf0) v6gVar.l, (xvf0) s6gVar11, (xvf0) r6gVar15, (xvf0) u6gVar13, (xvf0) new jzi0(8, new t6g(f0gVar, 16)), (xvf0) new u6g(f0gVar, 3), 17), 3), xvf0Var, v6gVar.c0, new t6g(f0gVar, 27), v6gVar.v, r6gVar16));
                    v6gVar.q0 = new n7i0(v6gVar.G, v6gVar.I, 14);
                    r6g r6gVar17 = new r6g(f0gVar, 5);
                    u6g u6gVar14 = new u6g(f0gVar, 11);
                    v6gVar.r0 = u6gVar14;
                    int i11 = 25;
                    jpf0 jpf0Var = new jpf0((xvf0) r6gVar17, (xvf0) u6gVar14, i11);
                    v6gVar.s0 = jpf0Var;
                    xvf0 b7 = i5m.b(new jpf0((xvf0) v6gVar.s, (xvf0) jpf0Var, 24));
                    v6gVar.t0 = b7;
                    v6gVar.u0 = i5m.b(new ahu(v6gVar.d, v6gVar.p0, v6gVar.s, v6gVar.q0, b7, 27));
                    v6gVar.v0 = new r6g(f0gVar, 1);
                    v6gVar.w0 = new s6g(f0gVar, 4);
                    v6gVar.x0 = new t6g(f0gVar, 5);
                    v6gVar.y0 = new r6g(f0gVar, 10);
                    v6gVar.z0 = new s6g(f0gVar, 0);
                    v6gVar.A0 = new s6g(f0gVar, 23);
                    v6gVar.B0 = new t6g(f0gVar, 3);
                    v6gVar.C0 = new s6g(f0gVar, 24);
                    v6gVar.D0 = new r6g(f0gVar, 2);
                    v6gVar.E0 = new r6g(f0gVar, i11);
                    v6gVar.F0 = new r6g(f0gVar, 19);
                    v6gVar.G0 = new s6g(f0gVar, 27);
                    v6gVar.H0 = new r6g(f0gVar, 14);
                    v6gVar.I0 = new r6g(f0gVar, 6);
                    v6gVar.J0 = new s6g(f0gVar, 1);
                    v6gVar.K0 = new r6g(f0gVar, 16);
                    v6gVar.L0 = new r6g(f0gVar, 18);
                    v6gVar.M0 = new u6g(f0gVar, 14);
                    v6gVar.N0 = new u6g(f0gVar, 1);
                    v6gVar.O0 = new s6g(f0gVar, 26);
                    v6gVar.P0 = new s6g(f0gVar, 25);
                    v6gVar.Q0 = new u6g(f0gVar, 27);
                    v6gVar.R0 = new u6g(f0gVar, i11);
                    v6gVar.S0 = new s6g(f0gVar, 28);
                    v6gVar.T0 = new s6g(f0gVar, 19);
                    v6gVar.U0 = new u6g(f0gVar, 24);
                    v6gVar.V0 = new s6g(f0gVar, 12);
                    v6gVar.W0 = new u6g(f0gVar, 2);
                    v6gVar.X0 = new t6g(f0gVar, 20);
                    v6gVar.Y0 = new t6g(f0gVar, 9);
                    v6gVar.Z0 = new r6g(f0gVar, 8);
                    v6gVar.a1 = new r6g(f0gVar, 11);
                    v6gVar.b1 = new t6g(f0gVar, 6);
                    int i12 = 4;
                    v6gVar.c1 = new r6g(f0gVar, i12);
                    v6gVar.d1 = new r6g(f0gVar, 20);
                    s6g s6gVar14 = new s6g(f0gVar, 14);
                    v6gVar.e1 = s6gVar14;
                    ba9 ba9Var = new ba9(s6gVar14, i12);
                    t6g t6gVar8 = new t6g(f0gVar, 0);
                    v6gVar.f1 = t6gVar8;
                    int i13 = 16;
                    byte b8 = 0;
                    v6gVar.g1 = i5m.b(new kj7(v6gVar.s, ba9Var, t6gVar8, i13, b8));
                    v6gVar.h1 = i5m.b(new c4(v6gVar.s, new c1(v6gVar.e1, i11), v6gVar.f1, i13, b8));
                    v6gVar.i1 = new r6g(f0gVar, 17);
                    v6gVar.j1 = new t6g(f0gVar, 14);
                    v6gVar.k1 = new u6g(f0gVar, 28);
                    v6gVar.l1 = new t6g(f0gVar, 24);
                    v6gVar.m1 = new t6g(f0gVar, i11);
                    v6gVar.n1 = new s6g(f0gVar, 21);
                    v6gVar.o1 = new t6g(f0gVar, 18);
                    v6gVar.p1 = new t6g(f0gVar, 29);
                    v6gVar.q1 = new t6g(f0gVar, 8);
                    v6gVar.r1 = new t6g(f0gVar, 15);
                    v6gVar.s1 = new u6g(f0gVar, 4);
                    int i14 = 21;
                    v6gVar.t1 = new u6g(f0gVar, i14);
                    v6gVar.u1 = new t6g(f0gVar, i14);
                    v6gVar.v1 = new t6g(f0gVar, 28);
                    v6gVar.w1 = new t6g(f0gVar, 1);
                    v6gVar.x1 = new r6g(f0gVar, 23);
                    v6gVar.y1 = new s6g(f0gVar, 13);
                    v6gVar.z1 = new s6g(f0gVar, 5);
                    v6gVar.A1 = new u6g(f0gVar, 7);
                    v6gVar.B1 = new t6g(f0gVar, 23);
                    v6gVar.C1 = new u6g(f0gVar, 22);
                    v6gVar.D1 = new u6g(f0gVar, 15);
                    v6gVar.E1 = new t6g(f0gVar, 2);
                    v6gVar.F1 = new t6g(f0gVar, 7);
                    v6gVar.G1 = new s6g(f0gVar, 3);
                    v6gVar.H1 = new t6g(f0gVar, 13);
                    v6gVar.I1 = new s6g(f0gVar, 7);
                    v6gVar.J1 = new u6g(f0gVar, 20);
                    v6gVar.K1 = new u6g(f0gVar, 19);
                    v6gVar.L1 = new s6g(f0gVar, 6);
                    int i15 = 9;
                    v6gVar.M1 = new u6g(f0gVar, i15);
                    v6gVar.N1 = new r6g(f0gVar, 29);
                    v6gVar.O1 = new r6g(f0gVar, 15);
                    v6gVar.P1 = new r6g(f0gVar, i15);
                    v6gVar.Q1 = new s6g(f0gVar, 29);
                    v6gVar.R1 = new r6g(f0gVar, 22);
                    v6gVar.S1 = new r6g(f0gVar, 0);
                    AccessibilityManager accessibilityManager2 = (AccessibilityManager) ((Context) f0gVar.x.U.get()).getSystemService("accessibility");
                    w6gVar = new w6g(v6gVar);
                    mjg0 mjg0Var = (mjg0) f0gVar.p0.get();
                    TaxiOrder b9 = o2y0Var.b();
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$0 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$1 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$2 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$3 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$4 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$5 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$6 = null;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$7 = w6gVar;
                    k030Var2 = k030Var;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$8 = k030Var2;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$9 = o230Var;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$10 = accessibilityManager2;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$11 = orderScreen;
                    taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.queue.interactor.c) mjg0Var).b(b9, taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    accessibilityManager = accessibilityManager2;
                    o230Var2 = o230Var;
                    orderScreen2 = orderScreen;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    orderScreen2 = (OrderScreen) taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$11;
                    accessibilityManager = (AccessibilityManager) taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$10;
                    o230Var2 = (o230) taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$9;
                    k030Var2 = (k030) taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$8;
                    w6gVar = (w6g) taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.L$7;
                    kotlin.b.b(obj);
                }
                Boolean bool = (Boolean) obj;
                bool.getClass();
                w6gVar.getClass();
                accessibilityManager.getClass();
                orderScreen2.getClass();
                return new x6g(w6gVar.a, k030Var2, o230Var2, accessibilityManager, orderScreen2, bool);
            }
        }
        taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1 = new TaxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1(this, continuationImpl);
        Object obj2 = taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiRideCardRouterFacadeImpl$createRideCardSubcomponent$1.label;
        if (i != 0) {
        }
        Boolean bool2 = (Boolean) obj2;
        bool2.getClass();
        w6gVar.getClass();
        accessibilityManager.getClass();
        orderScreen2.getClass();
        return new x6g(w6gVar.a, k030Var2, o230Var2, accessibilityManager, orderScreen2, bool2);
    }

    public final v9y0 d(q9y0 q9y0Var) {
        v9y0 v9y0Var = new v9y0();
        com.yandex.go.coroutines.b.g(this.a, null, null, new TaxiRideCardRouterFacadeImpl$launchCompactViewOnOrderList$1(this, q9y0Var, v9y0Var, null), 3);
        return v9y0Var;
    }

    public final void e(q9y0 q9y0Var) {
        com.yandex.go.coroutines.b.g(this.a, null, null, new TaxiRideCardRouterFacadeImpl$launchCompactViewOnTracking$1(this, q9y0Var, null), 3);
    }

    public final void f(r9y0 r9y0Var, u680 u680Var, com.yandex.go.superapp.order.multi.old.view.b bVar, v680 v680Var) {
        com.yandex.go.coroutines.b.g(this.a, null, null, new TaxiRideCardRouterFacadeImpl$launchDetailsRouter$1(this, r9y0Var, u680Var, bVar, v680Var, null), 3);
    }

    public final void g(s9y0 s9y0Var) {
        com.yandex.go.coroutines.b.g(this.a, null, null, new TaxiRideCardRouterFacadeImpl$launchSharingView$1(this, s9y0Var, null), 3);
    }

    public final xkk0 h() {
        xkk0 xkk0Var;
        ifk0 ifk0Var = this.e;
        if (ifk0Var == null || (xkk0Var = ifk0Var.c0) == null || !ifk0Var.v(xkk0Var)) {
            return null;
        }
        return xkk0Var;
    }
}
