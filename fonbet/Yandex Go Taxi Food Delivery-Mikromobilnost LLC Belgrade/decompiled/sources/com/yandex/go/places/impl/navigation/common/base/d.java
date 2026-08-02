package com.yandex.go.places.impl.navigation.common.base;

import com.yandex.go.places.api.navigation.CardRevealing;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import defpackage.a5g;
import defpackage.acc0;
import defpackage.bgc0;
import defpackage.ccc0;
import defpackage.cg80;
import defpackage.czo0;
import defpackage.dpb;
import defpackage.evu0;
import defpackage.fn80;
import defpackage.gn80;
import defpackage.h55;
import defpackage.hbp0;
import defpackage.i3y;
import defpackage.i75;
import defpackage.je80;
import defpackage.jj3;
import defpackage.jjo;
import defpackage.jst;
import defpackage.jyh;
import defpackage.kc50;
import defpackage.kn80;
import defpackage.kuj;
import defpackage.lg80;
import defpackage.m9c0;
import defpackage.n3h;
import defpackage.n75;
import defpackage.ny61;
import defpackage.o0;
import defpackage.o1j0;
import defpackage.o75;
import defpackage.p1j0;
import defpackage.p75;
import defpackage.qoh;
import defpackage.qoi0;
import defpackage.s7c0;
import defpackage.sn80;
import defpackage.svj;
import defpackage.ti80;
import defpackage.tje;
import defpackage.tls;
import defpackage.u3m;
import defpackage.u9c0;
import defpackage.vdc0;
import defpackage.vgc0;
import defpackage.xl80;
import defpackage.yl80;
import defpackage.z0j;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public abstract class d extends h55 {
    public final com.yandex.go.places.experiments.flex.b D;
    public final kn80 E;
    public final PlacesNavigationMode F;
    public final PlacesMapMode G;
    public final n3h H;
    public final vgc0 I;
    public final com.yandex.go.morphlex.router.b J;
    public final m9c0 K;
    public final jyh L;
    public final com.yandex.go.places.complaint.impl.navigation.a M;
    public final kc50 N;
    public final jj3 O;
    public final acc0 P;
    public final z0j Q;
    public final i3y R;
    public qoh S;
    public ti80 T;
    public final hbp0 U;
    public final ccc0 V;
    public final p75 W;
    public final i3y Z;
    public final i3y a0;
    public final i3y b0;

    public d(com.yandex.go.places.experiments.flex.b bVar, kn80 kn80Var, PlacesNavigationMode placesNavigationMode, PlacesMapMode placesMapMode, n3h n3hVar, vgc0 vgc0Var, com.yandex.go.morphlex.router.b bVar2, m9c0 m9c0Var, jyh jyhVar, com.yandex.go.places.complaint.impl.navigation.a aVar, kc50 kc50Var, jj3 jj3Var, acc0 acc0Var, z0j z0jVar) {
        super(null);
        this.D = bVar;
        this.E = kn80Var;
        this.F = placesNavigationMode;
        this.G = placesMapMode;
        this.H = n3hVar;
        this.I = vgc0Var;
        this.J = bVar2;
        this.K = m9c0Var;
        this.L = jyhVar;
        this.M = aVar;
        this.N = kc50Var;
        this.O = jj3Var;
        this.P = acc0Var;
        this.Q = z0jVar;
        i75 i75Var = new i75(this, 0);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.R = kotlin.a.b(lazyThreadSafetyMode, i75Var);
        String d = qoi0.a(getClass()).d();
        this.U = new hbp0(new czo0(14), d == null ? "" : d, null);
        this.V = new ccc0();
        this.W = new p75(this);
        this.Z = kotlin.a.b(lazyThreadSafetyMode, new i75(this, 1));
        this.a0 = kotlin.a.b(lazyThreadSafetyMode, new i75(this, 2));
        this.b0 = kotlin.a.b(lazyThreadSafetyMode, new i75(this, 3));
    }

    public static final void P(d dVar, Object obj, bgc0 bgc0Var, n75 n75Var, a5g a5gVar, boolean z) {
        boolean v = dVar.v(bgc0Var);
        if (v && z) {
            dVar.B(bgc0Var, obj, n75Var, new o1j0(bgc0Var));
        } else if (v) {
            bgc0Var.b(obj);
        } else {
            dVar.B(bgc0Var, obj, n75Var, p1j0.a);
        }
        boolean z2 = false;
        jjo.d(a5gVar, obj, v && !z);
        if (v && !z) {
            z2 = true;
        }
        jjo.c(a5gVar, obj, z2);
    }

    public abstract Object Q(vdc0 vdc0Var, Continuation continuation);

    public abstract void R(a5g a5gVar);

    public final void S(zls zlsVar) {
        tje.N(o(), null, null, new BasePlacesRouter$doOnComponentReady$1(this, zlsVar, null), 3);
    }

    public final b T() {
        return (b) this.R.getValue();
    }

    public o75 U() {
        return (o75) this.Z.getValue();
    }

    public final com.yandex.go.places.impl.navigation.common.navigator.internal.b V() {
        return (com.yandex.go.places.impl.navigation.common.navigator.internal.b) this.a0.getValue();
    }

    public gn80 W() {
        return fn80.a;
    }

    public PlacesNavigationMode X() {
        return this.F;
    }

    public final lg80 Y() {
        lg80 mode;
        vdc0 vdc0Var = (vdc0) this.x;
        return (vdc0Var == null || (mode = vdc0Var.getMode()) == null) ? cg80.b : mode;
    }

    public final svj Z() {
        svj source;
        vdc0 vdc0Var = (vdc0) this.x;
        return (vdc0Var == null || (source = vdc0Var.getSource()) == null) ? kuj.b : source;
    }

    public final c a0() {
        return (c) this.b0.getValue();
    }

    public final void b0(vdc0 vdc0Var) {
        this.U.a();
        if (this.S == null) {
            this.S = tje.h(o(), null, null, new BasePlacesRouter$onAttach$1(this, vdc0Var, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r3.T = null;
        r3.U.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x002f, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        j(dpb.a);
        try {
            try {
                qoh qohVar = this.S;
                if (qohVar != null && qohVar.k0()) {
                    R((a5g) qohVar.E());
                }
            } finally {
                qoh qohVar2 = this.S;
                if (qohVar2 != null) {
                    qohVar2.a(null);
                }
                this.S = null;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.j(th);
            qoh qohVar3 = this.S;
        }
    }

    public abstract void d0(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str);

    public final void e0(xl80 xl80Var, boolean z, tls tlsVar) {
        je80 je80Var = xl80Var.i;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b.c(V(), xl80Var.a, xl80Var.c, xl80Var.b, xl80Var.d, xl80Var.e, xl80Var.f, je80Var != null ? je80Var.b : true, null, je80Var != null ? je80Var.c : true, !(je80Var != null ? je80Var.a : false), (je80Var != null ? je80Var.l : null) == CardRevealing.EXPANDED, z, false, null, tlsVar, 12288);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f0(yl80 yl80Var, boolean z, tls tlsVar, ContinuationImpl continuationImpl) {
        BasePlacesRouter$openOrganizationsListThroughInternalNavigator$1 basePlacesRouter$openOrganizationsListThroughInternalNavigator$1;
        int i;
        sn80 sn80Var;
        if (continuationImpl instanceof BasePlacesRouter$openOrganizationsListThroughInternalNavigator$1) {
            basePlacesRouter$openOrganizationsListThroughInternalNavigator$1 = (BasePlacesRouter$openOrganizationsListThroughInternalNavigator$1) continuationImpl;
            int i2 = basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.L$0 = yl80Var;
                    basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.L$1 = tlsVar;
                    basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.Z$0 = z;
                    basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.label = 1;
                    obj = h0(yl80Var, basePlacesRouter$openOrganizationsListThroughInternalNavigator$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.Z$0;
                    tlsVar = (tls) basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.L$1;
                    yl80Var = (yl80) basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.L$0;
                    kotlin.b.b(obj);
                }
                sn80Var = (sn80) obj;
                if (sn80Var == null) {
                    V().f(sn80Var, z, new o0(24, tlsVar));
                } else {
                    V().d(yl80Var, z, new o0(25, tlsVar));
                }
                return zy11.a;
            }
        }
        basePlacesRouter$openOrganizationsListThroughInternalNavigator$1 = new BasePlacesRouter$openOrganizationsListThroughInternalNavigator$1(this, continuationImpl);
        Object obj3 = basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePlacesRouter$openOrganizationsListThroughInternalNavigator$1.label;
        if (i != 0) {
        }
        sn80Var = (sn80) obj3;
        if (sn80Var == null) {
        }
        return zy11.a;
    }

    public abstract void g0(String str);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h0(yl80 yl80Var, ContinuationImpl continuationImpl) {
        BasePlacesRouter$organizationsListV2PayloadOrNull$1 basePlacesRouter$organizationsListV2PayloadOrNull$1;
        int i;
        u3m u3mVar;
        if (continuationImpl instanceof BasePlacesRouter$organizationsListV2PayloadOrNull$1) {
            basePlacesRouter$organizationsListV2PayloadOrNull$1 = (BasePlacesRouter$organizationsListV2PayloadOrNull$1) continuationImpl;
            int i2 = basePlacesRouter$organizationsListV2PayloadOrNull$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                basePlacesRouter$organizationsListV2PayloadOrNull$1.label = i2 - Integer.MIN_VALUE;
                Object obj = basePlacesRouter$organizationsListV2PayloadOrNull$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = basePlacesRouter$organizationsListV2PayloadOrNull$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    basePlacesRouter$organizationsListV2PayloadOrNull$1.L$0 = yl80Var;
                    basePlacesRouter$organizationsListV2PayloadOrNull$1.label = 1;
                    obj = this.E.a.b(u9c0.b, basePlacesRouter$organizationsListV2PayloadOrNull$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    yl80Var = (yl80) basePlacesRouter$organizationsListV2PayloadOrNull$1.L$0;
                    kotlin.b.b(obj);
                }
                u3mVar = (u3m) obj;
                if (u3mVar != null) {
                    return null;
                }
                String str = u3mVar.b;
                String str2 = u3mVar.d;
                return new sn80(new s7c0(str, evu0.J(str2) ? null : str2, 2), yl80Var.c, yl80Var.e, yl80Var.g, yl80Var.d, yl80Var.a, yl80Var.b, yl80Var.h);
            }
        }
        basePlacesRouter$organizationsListV2PayloadOrNull$1 = new BasePlacesRouter$organizationsListV2PayloadOrNull$1(this, continuationImpl);
        Object obj2 = basePlacesRouter$organizationsListV2PayloadOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = basePlacesRouter$organizationsListV2PayloadOrNull$1.label;
        if (i != 0) {
        }
        u3mVar = (u3m) obj2;
        if (u3mVar != null) {
        }
    }
}
