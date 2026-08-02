package com.yandex.go.geosharing.controller;

import com.yandex.go.geosharing.net.LocationDataParam;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.a1t;
import defpackage.bg5;
import defpackage.ck;
import defpackage.cmt;
import defpackage.cne0;
import defpackage.d1t;
import defpackage.e1t;
import defpackage.e3n;
import defpackage.g6u;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jtq0;
import defpackage.k0b0;
import defpackage.kp50;
import defpackage.ky2;
import defpackage.mo21;
import defpackage.mth;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o400;
import defpackage.o430;
import defpackage.on2;
import defpackage.po21;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.vpk0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.battery.BatteryStateProvider$State;
import ru.yandex.taxi.geosharing.GeoSharingApi;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes.dex */
public final class e implements d1t {
    public final tt2 a;
    public final ru.yandex.taxi.utils.b b;
    public final po21 c;
    public final h d;
    public final l e;
    public final jtq0 f;
    public final bg5 g;
    public final k0b0 h;
    public final vpk0 i;
    public final ky2 j;
    public final n20 k;
    public final tse l;
    public final i3y m;
    public volatile boolean n = e();
    public pzt0 o;
    public pzt0 p;
    public pzt0 q;
    public DriveState r;
    public mo21 s;

    public e(tse tseVar, tt2 tt2Var, ru.yandex.taxi.utils.b bVar, po21 po21Var, h hVar, l lVar, jtq0 jtq0Var, bg5 bg5Var, k0b0 k0b0Var, vpk0 vpk0Var, ky2 ky2Var, n20 n20Var, on2 on2Var) {
        this.a = tt2Var;
        this.b = bVar;
        this.c = po21Var;
        this.d = hVar;
        this.e = lVar;
        this.f = jtq0Var;
        this.g = bg5Var;
        this.h = k0b0Var;
        this.i = vpk0Var;
        this.j = ky2Var;
        this.k = n20Var;
        this.l = tseVar;
        this.m = kotlin.a.a(new ck(on2Var, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(e eVar, a1t a1tVar, ContinuationImpl continuationImpl) {
        GeoSharingControllerImpl$checkConfigChanges$1 geoSharingControllerImpl$checkConfigChanges$1;
        int i;
        a1t a1tVar2;
        boolean z;
        pzt0 pzt0Var;
        ru.yandex.taxi.utils.b bVar = eVar.b;
        if (continuationImpl instanceof GeoSharingControllerImpl$checkConfigChanges$1) {
            geoSharingControllerImpl$checkConfigChanges$1 = (GeoSharingControllerImpl$checkConfigChanges$1) continuationImpl;
            int i2 = geoSharingControllerImpl$checkConfigChanges$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingControllerImpl$checkConfigChanges$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSharingControllerImpl$checkConfigChanges$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingControllerImpl$checkConfigChanges$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    boolean z2 = !jl40.l(bVar.c().d, a1tVar.d);
                    geoSharingControllerImpl$checkConfigChanges$1.L$0 = a1tVar;
                    geoSharingControllerImpl$checkConfigChanges$1.Z$0 = z2;
                    geoSharingControllerImpl$checkConfigChanges$1.label = 1;
                    if (bVar.f(a1tVar, geoSharingControllerImpl$checkConfigChanges$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    a1tVar2 = a1tVar;
                    z = z2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = geoSharingControllerImpl$checkConfigChanges$1.Z$0;
                    a1tVar2 = (a1t) geoSharingControllerImpl$checkConfigChanges$1.L$0;
                    kotlin.b.b(obj);
                }
                if (z && a1tVar2.a) {
                    pzt0Var = eVar.o;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    eVar.i();
                }
                return zy11.a;
            }
        }
        geoSharingControllerImpl$checkConfigChanges$1 = new GeoSharingControllerImpl$checkConfigChanges$1(eVar, continuationImpl);
        Object obj2 = geoSharingControllerImpl$checkConfigChanges$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingControllerImpl$checkConfigChanges$1.label;
        if (i != 0) {
        }
        if (z) {
            pzt0Var = eVar.o;
            if (pzt0Var != null) {
            }
            eVar.i();
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        if (defpackage.tje.k0(r2, r5, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0066, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(e eVar, ContinuationImpl continuationImpl) {
        GeoSharingControllerImpl$performUpdateLocationAction$1 geoSharingControllerImpl$performUpdateLocationAction$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof GeoSharingControllerImpl$performUpdateLocationAction$1) {
            geoSharingControllerImpl$performUpdateLocationAction$1 = (GeoSharingControllerImpl$performUpdateLocationAction$1) continuationImpl;
            int i2 = geoSharingControllerImpl$performUpdateLocationAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingControllerImpl$performUpdateLocationAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSharingControllerImpl$performUpdateLocationAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingControllerImpl$performUpdateLocationAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    po21 po21Var = eVar.c;
                    geoSharingControllerImpl$performUpdateLocationAction$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).o(geoSharingControllerImpl$performUpdateLocationAction$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                eVar.a.getClass();
                sjh sjhVar = uyj.a;
                g6u g6uVar = o400.a;
                GeoSharingControllerImpl$performUpdateLocationAction$2 geoSharingControllerImpl$performUpdateLocationAction$2 = new GeoSharingControllerImpl$performUpdateLocationAction$2(eVar, (mo21) obj, null);
                geoSharingControllerImpl$performUpdateLocationAction$1.L$0 = null;
                geoSharingControllerImpl$performUpdateLocationAction$1.label = 2;
            }
        }
        geoSharingControllerImpl$performUpdateLocationAction$1 = new GeoSharingControllerImpl$performUpdateLocationAction$1(eVar, continuationImpl);
        Object obj2 = geoSharingControllerImpl$performUpdateLocationAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingControllerImpl$performUpdateLocationAction$1.label;
        if (i != 0) {
        }
        eVar.a.getClass();
        sjh sjhVar2 = uyj.a;
        g6u g6uVar2 = o400.a;
        GeoSharingControllerImpl$performUpdateLocationAction$2 geoSharingControllerImpl$performUpdateLocationAction$22 = new GeoSharingControllerImpl$performUpdateLocationAction$2(eVar, (mo21) obj2, null);
        geoSharingControllerImpl$performUpdateLocationAction$1.L$0 = null;
        geoSharingControllerImpl$performUpdateLocationAction$1.label = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(2:11|12)(3:14|15|16))(2:17|18))(3:22|23|(2:25|26))|19|20))|36|6|7|(0)(0)|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0048, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
    
        if ((r7 instanceof retrofit2.HttpException) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        r8 = r6.b;
        r0.L$0 = null;
        r0.L$1 = r7;
        r0.L$2 = null;
        r0.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r8.a(r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(e eVar, LocationDataParam locationDataParam, ContinuationImpl continuationImpl) {
        GeoSharingControllerImpl$shareLocation$1 geoSharingControllerImpl$shareLocation$1;
        int i;
        eVar.getClass();
        if (continuationImpl instanceof GeoSharingControllerImpl$shareLocation$1) {
            geoSharingControllerImpl$shareLocation$1 = (GeoSharingControllerImpl$shareLocation$1) continuationImpl;
            int i2 = geoSharingControllerImpl$shareLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                geoSharingControllerImpl$shareLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = geoSharingControllerImpl$shareLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = geoSharingControllerImpl$shareLocation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cmt<a1t> a = ((GeoSharingApi) eVar.m.getValue()).a(locationDataParam);
                    geoSharingControllerImpl$shareLocation$1.L$0 = null;
                    geoSharingControllerImpl$shareLocation$1.label = 1;
                    obj = ru.yandex.taxi.network.api.a.a(a, null, geoSharingControllerImpl$shareLocation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) geoSharingControllerImpl$shareLocation$1.L$1;
                        kotlin.b.b(obj);
                        eVar.j();
                        throw th;
                    }
                    kotlin.b.b(obj);
                }
                return (a1t) obj;
            }
        }
        geoSharingControllerImpl$shareLocation$1 = new GeoSharingControllerImpl$shareLocation$1(eVar, continuationImpl);
        Object obj2 = geoSharingControllerImpl$shareLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = geoSharingControllerImpl$shareLocation$1.label;
        if (i != 0) {
        }
        return (a1t) obj2;
    }

    public final boolean d() {
        if (!this.b.c().a || !this.n) {
            return false;
        }
        if (this.e.b(false)) {
            return true;
        }
        return this.b.c().b && this.j.j();
    }

    public final boolean e() {
        com.yandex.go.taxi.order.provider.a aVar = (com.yandex.go.taxi.order.provider.a) this.k;
        if (!((e0) aVar.o()).u()) {
            List l = aVar.l();
            if (l.size() <= 1) {
                return l.isEmpty() ? f(EmptyList.a) : f(Collections.singletonList(((o2y0) l.get(0)).b().a));
            }
        }
        return false;
    }

    public final boolean f(List list) {
        if (list.size() > 1) {
            return false;
        }
        boolean isEmpty = list.isEmpty();
        ru.yandex.taxi.utils.b bVar = this.b;
        if (isEmpty) {
            return bVar.e();
        }
        String str = (String) list.get(0);
        String d = bVar.d();
        cne0 cne0Var = bVar.m;
        if (jl40.l(str, d) && cne0Var.g(bVar.l, false) && cne0Var.g(bVar.i, true)) {
            return true;
        }
        String l = cne0Var.l(bVar.j, null);
        if (l == null) {
            l = "";
        }
        return l.equals(str) ? cne0Var.f(bVar.h) : bVar.e();
    }

    public final void g(boolean z) {
        this.n = z;
        vpk0 vpk0Var = this.i;
        List l = ((com.yandex.go.taxi.order.provider.a) ((n20) vpk0Var.a.get())).l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : l) {
            if (((o2y0) obj).e()) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o2y0 o2y0Var = (o2y0) it.next();
            vpk0Var.b.a(Boolean.valueOf(z), o2y0Var.b().a);
        }
        if (this.n) {
            i();
        } else {
            j();
        }
    }

    public final void h() {
        if (this.b.c().a) {
            pzt0 pzt0Var = this.o;
            if (pzt0Var == null || !pzt0Var.isActive()) {
                pzt0 pzt0Var2 = this.q;
                if (pzt0Var2 != null) {
                    pzt0Var2.a(null);
                }
                this.q = tje.N(this.l, null, null, new GeoSharingControllerImpl$singleLocationRequest$1(this, null), 3);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0031, code lost:
    
        k();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void i() {
        try {
            pzt0 pzt0Var = this.o;
            boolean z = true;
            if ((pzt0Var == null || !pzt0Var.isActive()) && this.h.b()) {
                if (d()) {
                    DriveState driveState = this.r;
                    if (driveState != DriveState.SEARCH && driveState != DriveState.DRIVING && driveState != DriveState.WAITING) {
                        z = false;
                    }
                }
            }
        } finally {
        }
    }

    public final synchronized void j() {
        try {
            pzt0 pzt0Var = this.o;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            pzt0 pzt0Var2 = this.p;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void k() {
        int a = this.g.a();
        BatteryStateProvider$State batteryStateProvider$State = a > 50 ? BatteryStateProvider$State.FULL : a > 20 ? BatteryStateProvider$State.HALF : BatteryStateProvider$State.LOW;
        ru.yandex.taxi.utils.b bVar = this.b;
        a1t.a aVar = bVar.c().d;
        int i = e1t.b[batteryStateProvider$State.ordinal()];
        int i2 = i != 1 ? i != 2 ? aVar.c : aVar.b : aVar.a;
        if (i2 < 5) {
            i2 = 5;
        }
        o430 o430Var = e3n.b;
        int i3 = 3;
        o oVar = new o(new jqr(new b(com.yandex.go.coroutines.b.m(kp50.U(i2, DurationUnit.SECONDS), 0L), this), new GeoSharingControllerImpl$subscribeForLocationUpdates$2(this, null), i3), new GeoSharingControllerImpl$subscribeForLocationUpdates$3());
        tse tseVar = this.l;
        this.o = com.yandex.go.coroutines.b.h(tseVar, oVar);
        this.p = com.yandex.go.coroutines.b.h(tseVar, new jqr(new d(new mth(bVar.o, 6)), new GeoSharingControllerImpl$subscribeForLocationUpdates$5(this, null), i3));
    }
}
