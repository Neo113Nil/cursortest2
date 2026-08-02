package com.yandex.go.places.impl.navigation.discovery.map;

import android.content.Context;
import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.places.api.navigation.OrganizationCardSliderPinDisplayStrategy;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.experiments.map.pin_war_v2.o;
import com.yandex.go.places.experiments.map.social_pin.b;
import com.yandex.go.places.impl.domain.interactors.map.e;
import com.yandex.go.places.impl.domain.interactors.map.f;
import com.yandex.go.places.impl.navigation.common.base.d;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.places.map.data.repositories.i;
import com.yandex.go.places.models.domain.entities.PlacesMapOwner;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.a3v;
import defpackage.a5g;
import defpackage.acc0;
import defpackage.ah00;
import defpackage.aq80;
import defpackage.avv0;
import defpackage.c0g;
import defpackage.d30;
import defpackage.d7c0;
import defpackage.dl80;
import defpackage.e6g;
import defpackage.el00;
import defpackage.fgc0;
import defpackage.g0c;
import defpackage.gaz;
import defpackage.gh00;
import defpackage.gn80;
import defpackage.go80;
import defpackage.h3y;
import defpackage.hfc0;
import defpackage.i3y;
import defpackage.i4b0;
import defpackage.i6r;
import defpackage.i7c0;
import defpackage.j7c0;
import defpackage.je80;
import defpackage.jj3;
import defpackage.jyh;
import defpackage.k7c0;
import defpackage.kc50;
import defpackage.kcc0;
import defpackage.kn80;
import defpackage.l2c0;
import defpackage.lg80;
import defpackage.m950;
import defpackage.m9c0;
import defpackage.n3h;
import defpackage.ny61;
import defpackage.o75;
import defpackage.o7c0;
import defpackage.o950;
import defpackage.odc0;
import defpackage.ofc0;
import defpackage.ohh;
import defpackage.p75;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qdc0;
import defpackage.qfc0;
import defpackage.qvv;
import defpackage.s6c0;
import defpackage.sg80;
import defpackage.svj;
import defpackage.t1b0;
import defpackage.tdc0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vdc0;
import defpackage.vgc0;
import defpackage.w4g;
import defpackage.wbc0;
import defpackage.x4g;
import defpackage.xl80;
import defpackage.xvf0;
import defpackage.y6c0;
import defpackage.yac0;
import defpackage.yl80;
import defpackage.yvf0;
import defpackage.yz4;
import defpackage.z0j;
import defpackage.zbc0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a extends d implements m950 {
    public final i6r c0;
    public final j d0;
    public final o e0;
    public final kcc0 f0;
    public final b g0;
    public final yz4 h0;
    public final avv0 i0;
    public final ru.yandex.taxi.deeplinks.b j0;
    public final dl80 k0;
    public final com.yandex.go.places.impl.navigation.deeplink.helpers.a l0;
    public final sg80 m0;
    public final com.yandex.go.places.impl.data.repositories.map.a n0;
    public final hfc0 o0;
    public final zbc0 p0;
    public i7c0 q0;
    public tdc0 r0;
    public pzt0 s0;
    public pzt0 t0;
    public yac0 u0;
    public boolean v0;
    public final y6c0 w0;
    public final o75 x0;
    public final aq80 y0;

    public a(i6r i6rVar, j jVar, o oVar, kcc0 kcc0Var, b bVar, yz4 yz4Var, avv0 avv0Var, ru.yandex.taxi.deeplinks.b bVar2, dl80 dl80Var, com.yandex.go.places.impl.navigation.deeplink.helpers.a aVar, sg80 sg80Var, com.yandex.go.places.impl.data.repositories.map.a aVar2, hfc0 hfc0Var, kn80 kn80Var, z0j z0jVar, com.yandex.go.places.experiments.flex.b bVar3, yvf0 yvf0Var, n3h n3hVar, yvf0 yvf0Var2, m9c0 m9c0Var, h3y h3yVar, yvf0 yvf0Var3, kc50 kc50Var, jj3 jj3Var, acc0 acc0Var) {
        super(bVar3, kn80Var, PlacesNavigationMode.NATIVE_NAVIGATION, PlacesMapMode.WITH_MAP, n3hVar, (vgc0) yvf0Var.get(), (com.yandex.go.morphlex.router.b) yvf0Var2.get(), m9c0Var, (jyh) h3yVar.get(), (com.yandex.go.places.complaint.impl.navigation.a) yvf0Var3.get(), kc50Var, jj3Var, acc0Var, z0jVar);
        this.c0 = i6rVar;
        this.d0 = jVar;
        this.e0 = oVar;
        this.f0 = kcc0Var;
        this.g0 = bVar;
        this.h0 = yz4Var;
        this.i0 = avv0Var;
        this.j0 = bVar2;
        this.k0 = dl80Var;
        this.l0 = aVar;
        this.m0 = sg80Var;
        this.n0 = aVar2;
        this.o0 = hfc0Var;
        this.p0 = new zbc0();
        this.w0 = new y6c0(this);
        this.x0 = new o75(this, 1);
        this.y0 = new aq80(this);
    }

    public static final void i0(a aVar, g0c g0cVar) {
        aVar.i0.b(g0cVar);
        if (aVar.t()) {
            return;
        }
        aVar.h0.c();
        o0(aVar, false);
    }

    public static final void j0(a aVar, g0c g0cVar) {
        aVar.h0.d();
        aVar.i0.a(g0cVar);
    }

    public static final pzt0 k0(a aVar, xl80 xl80Var, boolean z, PlacesNavigationEntry$Source placesNavigationEntry$Source) {
        return tje.N(aVar.o(), null, null, new PlacesDiscoveryMapOverlayRouterImpl$openOrganizationCard$1(aVar, xl80Var, placesNavigationEntry$Source, z, null), 3);
    }

    public static final pzt0 l0(a aVar, yl80 yl80Var, PlacesNavigationEntry$Source placesNavigationEntry$Source) {
        return tje.N(aVar.o(), null, null, new PlacesDiscoveryMapOverlayRouterImpl$openOrganizationsList$1(placesNavigationEntry$Source, aVar, yl80Var, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0059, code lost:
    
        if (r2 == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006f, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x006d, code lost:
    
        if (r2 == r4) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.lifecycle.Lifecycle] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m0(a aVar, boolean z, ContinuationImpl continuationImpl) {
        PlacesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1 placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1;
        int i;
        i7c0 i7c0Var;
        k7c0 k7c0Var;
        aVar.getClass();
        if (continuationImpl instanceof PlacesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1) {
            placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1 = (PlacesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1) continuationImpl;
            int i2 = placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (z) {
                        i7c0 i7c0Var2 = aVar.q0;
                        if (i7c0Var2 == null || !i7c0Var2.d) {
                            tdc0 tdc0Var = aVar.r0;
                            if (tdc0Var != null) {
                                placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.Z$0 = z;
                                placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.label = 2;
                                obj = tdc0Var.b.B(placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1);
                            }
                        } else {
                            tdc0 tdc0Var2 = aVar.r0;
                            if (tdc0Var2 != null) {
                                placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.Z$0 = z;
                                placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.label = 1;
                                obj = tdc0Var2.b.C(placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1);
                            }
                        }
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                i7c0Var = aVar.q0;
                if (i7c0Var != null) {
                    o950 lifecycle = aVar.getLifecycle();
                    lg80 Y = aVar.Y();
                    d7c0 d7c0Var = (d7c0) aVar.x;
                    String str = d7c0Var != null ? d7c0Var.b : null;
                    if (!i7c0Var.d) {
                        i7c0Var.d = true;
                        k7c0 k7c0Var2 = i7c0Var.e;
                        if (k7c0Var2 == null) {
                            ?? r0 = i7c0Var.a.a.a;
                            o950 o950Var = r0 == 0 ? lifecycle : r0;
                            e6g e6gVar = i7c0Var.c.a;
                            com.yandex.go.places.impl.ui.discovery.map.d dVar = new com.yandex.go.places.impl.ui.discovery.map.d(o950Var, str, Y, (Context) ((x4g) e6gVar.e).get(), (odc0) ((xvf0) e6gVar.a).get(), (h) ((xvf0) e6gVar.b).get(), (i) ((xvf0) e6gVar.c).get(), (f) ((xvf0) e6gVar.d).get(), (com.yandex.go.places.map.ui.pinwar.a) ((xvf0) e6gVar.f).get(), (o7c0) ((xvf0) e6gVar.g).get(), (go80) ((xvf0) e6gVar.h).get(), (yac0) ((xvf0) e6gVar.i).get(), (s6c0) ((xvf0) e6gVar.j).get(), (e) ((xvf0) e6gVar.k).get(), (com.yandex.go.places.impl.domain.interactors.common.a) ((xvf0) e6gVar.l).get(), (yz4) ((xvf0) e6gVar.m).get(), (com.yandex.go.places.impl.domain.interactors.discovery.map.a) ((xvf0) e6gVar.n).get(), (ah00) ((xvf0) e6gVar.o).get(), (pwy0) ((xvf0) e6gVar.p).get(), (ohh) ((xvf0) e6gVar.q).get(), (qvv) ((xvf0) e6gVar.r).get(), (d30) ((xvf0) e6gVar.s).get(), (com.yandex.go.places.map.ui.configs.cluster.a) ((xvf0) e6gVar.t).get(), (l2c0) ((xvf0) e6gVar.u).get(), (qdc0) ((xvf0) e6gVar.v).get(), (qfc0) ((xvf0) e6gVar.w).get());
                            gaz gazVar = i7c0Var.b.a;
                            k7c0 k7c0Var3 = new k7c0(dVar, (a3v) gazVar.b.get(), (Context) gazVar.a.get(), (ah00) gazVar.c.get());
                            i7c0Var.e = k7c0Var3;
                            k7c0Var = k7c0Var3;
                        } else {
                            k7c0Var = k7c0Var2;
                        }
                        i3y i3yVar = k7c0Var.x;
                        k7c0Var.w.q3(k7c0Var, ((Number) i3yVar.getValue()).intValue(), ((Number) k7c0Var.y.getValue()).intValue(), ((Number) i3yVar.getValue()).intValue(), ((Number) k7c0Var.z.getValue()).intValue());
                        ((gh00) ((ah00) k7c0Var.b)).q(new i4b0(18, k7c0Var));
                        k7c0Var.c.Bg(new j7c0());
                    }
                }
                return zy11.a;
            }
        }
        placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1 = new PlacesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1(aVar, continuationImpl);
        Object obj2 = placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesDiscoveryMapOverlayRouterImpl$restoreAndAttachSocialPins$1.label;
        if (i != 0) {
        }
        i7c0Var = aVar.q0;
        if (i7c0Var != null) {
        }
        return zy11.a;
    }

    public static void o0(a aVar, boolean z) {
        if (!z) {
            tje.N(aVar.o(), null, null, new PlacesDiscoveryMapOverlayRouterImpl$setOrganizationsOverlayVisibility$1(aVar, true, null), 3);
            return;
        }
        i7c0 i7c0Var = aVar.q0;
        if (i7c0Var != null) {
            i7c0Var.a();
        }
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        b0((d7c0) obj);
        boolean z = this.v0;
        this.v0 = false;
        S(new PlacesDiscoveryMapOverlayRouterImpl$onAttach$1(this, z, null));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        c0();
        i7c0 i7c0Var = this.q0;
        if (i7c0Var != null) {
            i7c0Var.a();
        }
        this.q0 = null;
        tdc0 tdc0Var = this.r0;
        if (tdc0Var != null) {
            if (tdc0Var.c) {
                tdc0Var.a.detach();
            }
            tdc0Var.c = false;
        }
        this.r0 = null;
        pzt0 pzt0Var = this.s0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.s0 = null;
        pzt0 pzt0Var2 = this.t0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.t0 = null;
        this.o0.a = null;
        this.v0 = true;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.n0.a();
        this.V.a();
        this.v0 = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PlacesDiscoveryMapOverlayRouterImpl$subscribeToDeeplinks$1(this, null), 3);
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public final /* bridge */ /* synthetic */ Object Q(vdc0 vdc0Var, Continuation continuation) {
        return n0((ContinuationImpl) continuation);
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public final void R(a5g a5gVar) {
        a5gVar.e().b();
        ((wbc0) a5gVar.m.get()).b();
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public final o75 U() {
        return this.x0;
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public final gn80 W() {
        return this.y0;
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public final void d0(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.d
    public final void g0(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0117, code lost:
    
        if (r1 != r5) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e4, code lost:
    
        if (r1 == r5) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d6, code lost:
    
        if (r1.a(r4) == r5) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n0(ContinuationImpl continuationImpl) {
        PlacesDiscoveryMapOverlayRouterImpl$createComponent$1 placesDiscoveryMapOverlayRouterImpl$createComponent$1;
        yac0 yac0Var;
        odc0 odc0Var;
        odc0 odc0Var2;
        yac0 yac0Var2;
        boolean z;
        w4g w4gVar;
        Object d;
        i6r i6rVar;
        PlacesMapMode placesMapMode;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar;
        ofc0 ofc0Var;
        fgc0 fgc0Var;
        boolean z2;
        yac0 yac0Var3;
        PlacesNavigationMode placesNavigationMode;
        odc0 odc0Var3;
        lg80 lg80Var;
        tse tseVar;
        p75 p75Var;
        wbc0 wbc0Var;
        j jVar = this.d0;
        i6r i6rVar2 = this.c0;
        if (continuationImpl instanceof PlacesDiscoveryMapOverlayRouterImpl$createComponent$1) {
            placesDiscoveryMapOverlayRouterImpl$createComponent$1 = (PlacesDiscoveryMapOverlayRouterImpl$createComponent$1) continuationImpl;
            int i = placesDiscoveryMapOverlayRouterImpl$createComponent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = i - Integer.MIN_VALUE;
                Object obj = placesDiscoveryMapOverlayRouterImpl$createComponent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                switch (placesDiscoveryMapOverlayRouterImpl$createComponent$1.label) {
                    case 0:
                        kotlin.b.b(obj);
                        el00 el00Var = (el00) ((c0g) i6rVar2).z.Dc.get();
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 1;
                        break;
                    case 1:
                        kotlin.b.b(obj);
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 2;
                        obj = jVar.c(placesDiscoveryMapOverlayRouterImpl$createComponent$1);
                        break;
                    case 2:
                        kotlin.b.b(obj);
                        yac0 yac0Var4 = (yac0) obj;
                        this.u0 = yac0Var4;
                        o oVar = this.e0;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1 = yac0Var4;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 3;
                        Object a = oVar.a(placesDiscoveryMapOverlayRouterImpl$createComponent$1);
                        if (a != coroutineSingletons) {
                            yac0Var = yac0Var4;
                            obj = a;
                            odc0Var = (odc0) obj;
                            kcc0 kcc0Var = this.f0;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1 = yac0Var;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2 = odc0Var;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 4;
                            obj = ((t1b0) kcc0Var.b.getValue()).b(placesDiscoveryMapOverlayRouterImpl$createComponent$1);
                            break;
                        }
                        return coroutineSingletons;
                    case 3:
                        yac0 yac0Var5 = (yac0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1;
                        kotlin.b.b(obj);
                        yac0Var = yac0Var5;
                        odc0Var = (odc0) obj;
                        kcc0 kcc0Var2 = this.f0;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1 = yac0Var;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2 = odc0Var;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 4;
                        obj = ((t1b0) kcc0Var2.b.getValue()).b(placesDiscoveryMapOverlayRouterImpl$createComponent$1);
                        break;
                    case 4:
                        odc0Var = (odc0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2;
                        yac0Var = (yac0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1;
                        kotlin.b.b(obj);
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        b bVar2 = this.g0;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1 = yac0Var;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2 = odc0Var;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.Z$0 = booleanValue;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 5;
                        Object a2 = bVar2.a(placesDiscoveryMapOverlayRouterImpl$createComponent$1);
                        if (a2 != coroutineSingletons) {
                            odc0Var2 = odc0Var;
                            yac0Var2 = yac0Var;
                            z = booleanValue;
                            obj = a2;
                            ofc0 ofc0Var2 = (ofc0) obj;
                            w4gVar = new w4g();
                            com.yandex.go.places.impl.navigation.common.navigator.internal.b V = V();
                            p75 p75Var2 = this.W;
                            tse o = o();
                            lg80 Y = Y();
                            fgc0 fgc0Var2 = fgc0.a;
                            PlacesNavigationMode placesNavigationMode2 = this.F;
                            PlacesMapMode placesMapMode2 = this.G;
                            PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1 = yac0Var2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2 = odc0Var2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$3 = ofc0Var2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$4 = w4gVar;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$5 = i6rVar2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$6 = V;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$7 = p75Var2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$8 = o;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$9 = Y;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$10 = fgc0Var2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$11 = placesNavigationMode2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$12 = placesMapMode2;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.Z$0 = z;
                            placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 6;
                            d = jVar.d(placesMapConfig$PlacesMapScreenName, placesDiscoveryMapOverlayRouterImpl$createComponent$1);
                            if (d != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            i6rVar = i6rVar2;
                            placesMapMode = placesMapMode2;
                            bVar = V;
                            ofc0Var = ofc0Var2;
                            fgc0Var = fgc0Var2;
                            z2 = z;
                            yac0Var3 = yac0Var2;
                            placesNavigationMode = placesNavigationMode2;
                            odc0Var3 = odc0Var2;
                            lg80Var = Y;
                            obj = d;
                            tseVar = o;
                            p75Var = p75Var2;
                            PlacesMapOwner placesMapOwner = PlacesMapOwner.SUPER_APP_DISCOVERY_MAP_FEATURE;
                            w4gVar.getClass();
                            a5g a3 = w4g.a(i6rVar, bVar, p75Var, tseVar, yac0Var3, odc0Var3, null, false, ofc0Var, z2, false, fgc0Var, lg80Var, placesNavigationMode, placesMapMode, (Integer) obj, placesMapOwner);
                            wbc0Var = (wbc0) a3.m.get();
                            svj Z = Z();
                            synchronized (wbc0Var.a) {
                                wbc0Var.b.addLast(Z);
                            }
                            ((com.yandex.go.places.map.ui.overlay.a) a3.b1.get()).b();
                            return a3;
                        }
                        return coroutineSingletons;
                    case 5:
                        z = placesDiscoveryMapOverlayRouterImpl$createComponent$1.Z$0;
                        odc0 odc0Var4 = (odc0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2;
                        yac0 yac0Var6 = (yac0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1;
                        kotlin.b.b(obj);
                        odc0Var2 = odc0Var4;
                        yac0Var2 = yac0Var6;
                        ofc0 ofc0Var22 = (ofc0) obj;
                        w4gVar = new w4g();
                        com.yandex.go.places.impl.navigation.common.navigator.internal.b V2 = V();
                        p75 p75Var22 = this.W;
                        tse o2 = o();
                        lg80 Y2 = Y();
                        fgc0 fgc0Var22 = fgc0.a;
                        PlacesNavigationMode placesNavigationMode22 = this.F;
                        PlacesMapMode placesMapMode22 = this.G;
                        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName2 = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$0 = null;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1 = yac0Var2;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2 = odc0Var2;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$3 = ofc0Var22;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$4 = w4gVar;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$5 = i6rVar2;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$6 = V2;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$7 = p75Var22;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$8 = o2;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$9 = Y2;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$10 = fgc0Var22;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$11 = placesNavigationMode22;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$12 = placesMapMode22;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.Z$0 = z;
                        placesDiscoveryMapOverlayRouterImpl$createComponent$1.label = 6;
                        d = jVar.d(placesMapConfig$PlacesMapScreenName2, placesDiscoveryMapOverlayRouterImpl$createComponent$1);
                        if (d != coroutineSingletons) {
                        }
                        break;
                    case 6:
                        boolean z3 = placesDiscoveryMapOverlayRouterImpl$createComponent$1.Z$0;
                        PlacesMapMode placesMapMode3 = (PlacesMapMode) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$12;
                        PlacesNavigationMode placesNavigationMode3 = (PlacesNavigationMode) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$11;
                        fgc0 fgc0Var3 = (fgc0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$10;
                        lg80 lg80Var2 = (lg80) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$9;
                        tse tseVar2 = (tse) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$8;
                        p75 p75Var3 = (p75) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$7;
                        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar3 = (com.yandex.go.places.impl.navigation.common.navigator.internal.b) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$6;
                        i6r i6rVar3 = (i6r) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$5;
                        w4gVar = (w4g) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$4;
                        ofc0 ofc0Var3 = (ofc0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$3;
                        odc0 odc0Var5 = (odc0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$2;
                        yac0 yac0Var7 = (yac0) placesDiscoveryMapOverlayRouterImpl$createComponent$1.L$1;
                        kotlin.b.b(obj);
                        z2 = z3;
                        i6rVar = i6rVar3;
                        lg80Var = lg80Var2;
                        odc0Var3 = odc0Var5;
                        placesMapMode = placesMapMode3;
                        bVar = bVar3;
                        ofc0Var = ofc0Var3;
                        fgc0Var = fgc0Var3;
                        yac0Var3 = yac0Var7;
                        placesNavigationMode = placesNavigationMode3;
                        p75Var = p75Var3;
                        tseVar = tseVar2;
                        PlacesMapOwner placesMapOwner2 = PlacesMapOwner.SUPER_APP_DISCOVERY_MAP_FEATURE;
                        w4gVar.getClass();
                        a5g a32 = w4g.a(i6rVar, bVar, p75Var, tseVar, yac0Var3, odc0Var3, null, false, ofc0Var, z2, false, fgc0Var, lg80Var, placesNavigationMode, placesMapMode, (Integer) obj, placesMapOwner2);
                        wbc0Var = (wbc0) a32.m.get();
                        svj Z2 = Z();
                        synchronized (wbc0Var.a) {
                        }
                        break;
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        placesDiscoveryMapOverlayRouterImpl$createComponent$1 = new PlacesDiscoveryMapOverlayRouterImpl$createComponent$1(this, continuationImpl);
        Object obj2 = placesDiscoveryMapOverlayRouterImpl$createComponent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        switch (placesDiscoveryMapOverlayRouterImpl$createComponent$1.label) {
        }
    }

    public final boolean p0(xl80 xl80Var) {
        je80 je80Var = xl80Var.i;
        OrganizationCardSliderPinDisplayStrategy organizationCardSliderPinDisplayStrategy = je80Var != null ? je80Var.q : null;
        yac0 yac0Var = this.u0;
        return organizationCardSliderPinDisplayStrategy == OrganizationCardSliderPinDisplayStrategy.SELECTED_PIN_ONLY && (yac0Var != null && yac0Var.b(PlacesMapConfig$PlacesMapScreenName.PLACES_ORGANIZATION_CARD));
    }
}
