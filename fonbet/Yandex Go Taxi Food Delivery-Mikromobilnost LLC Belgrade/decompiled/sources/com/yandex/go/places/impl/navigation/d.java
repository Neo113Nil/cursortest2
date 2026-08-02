package com.yandex.go.places.impl.navigation;

import com.yandex.go.address.models.PlaceType;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.experiments.map.pin_war_v2.o;
import com.yandex.go.places.impl.navigation.common.stack.PlacesNavigationEntry$Source;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import com.yandex.go.places.models.domain.entities.PlacesMapOwner;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.a5g;
import defpackage.acc0;
import defpackage.am80;
import defpackage.bbc0;
import defpackage.bcc0;
import defpackage.bm80;
import defpackage.c2x0;
import defpackage.ccc0;
import defpackage.cm80;
import defpackage.dl80;
import defpackage.dm80;
import defpackage.ftj;
import defpackage.ggc0;
import defpackage.h3y;
import defpackage.i3y;
import defpackage.i4b0;
import defpackage.i6r;
import defpackage.i75;
import defpackage.jj3;
import defpackage.jl40;
import defpackage.jyh;
import defpackage.k1j0;
import defpackage.kbc0;
import defpackage.kc50;
import defpackage.kcc0;
import defpackage.kn80;
import defpackage.l4c0;
import defpackage.l75;
import defpackage.lg80;
import defpackage.m75;
import defpackage.m9c0;
import defpackage.n3h;
import defpackage.ny61;
import defpackage.odc0;
import defpackage.ofc0;
import defpackage.p75;
import defpackage.rac0;
import defpackage.sls;
import defpackage.t1b0;
import defpackage.t9b0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uiq0;
import defpackage.ul80;
import defpackage.vgc0;
import defpackage.vl80;
import defpackage.w030;
import defpackage.w4g;
import defpackage.w511;
import defpackage.wg30;
import defpackage.wl80;
import defpackage.xl80;
import defpackage.y7c0;
import defpackage.yac0;
import defpackage.yl80;
import defpackage.z0j;
import defpackage.zl80;
import defpackage.zy11;
import defpackage.zzs;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class d extends com.yandex.go.places.impl.navigation.common.base.a {
    public final PlacesNavigationMode g0;
    public final PlacesMapMode h0;
    public final ru.yandex.taxi.deeplinks.b i0;
    public final dl80 j0;
    public final com.yandex.go.places.impl.navigation.deeplink.helpers.a k0;
    public final i6r l0;
    public final j m0;
    public final o n0;
    public final com.yandex.go.places.experiments.tabbar.b o0;
    public final kcc0 p0;
    public final com.yandex.go.places.experiments.map.social_pin.b q0;
    public final rac0 r0;
    public String s0;
    public com.yandex.go.places.map.ui.overlay.a t0;
    public final i3y u0;

    public d(PlacesNavigationMode placesNavigationMode, PlacesMapMode placesMapMode, w030 w030Var, ru.yandex.taxi.deeplinks.b bVar, dl80 dl80Var, com.yandex.go.places.impl.navigation.deeplink.helpers.a aVar, i6r i6rVar, j jVar, o oVar, com.yandex.go.places.experiments.tabbar.b bVar2, kcc0 kcc0Var, com.yandex.go.places.experiments.map.social_pin.b bVar3, rac0 rac0Var, l4c0 l4c0Var, c2x0 c2x0Var, final com.yandex.go.places.experiments.flex.b bVar4, kn80 kn80Var, vgc0 vgc0Var, n3h n3hVar, com.yandex.go.morphlex.router.b bVar5, z0j z0jVar, m9c0 m9c0Var, h3y h3yVar, com.yandex.go.places.complaint.impl.navigation.a aVar2, kc50 kc50Var, jj3 jj3Var, acc0 acc0Var, z0j z0jVar2) {
        super(placesNavigationMode, placesMapMode, l4c0Var, c2x0Var, z0jVar, w030Var, z0jVar2, bVar4, kn80Var, n3hVar, vgc0Var, bVar5, m9c0Var, (jyh) h3yVar.get(), aVar2, kc50Var, jj3Var, acc0Var);
        this.g0 = placesNavigationMode;
        this.h0 = placesMapMode;
        this.i0 = bVar;
        this.j0 = dl80Var;
        this.k0 = aVar;
        this.l0 = i6rVar;
        this.m0 = jVar;
        this.n0 = oVar;
        this.o0 = bVar2;
        this.p0 = kcc0Var;
        this.q0 = bVar3;
        this.r0 = rac0Var;
        this.u0 = kotlin.a.b(LazyThreadSafetyMode.NONE, new sls() { // from class: com.yandex.go.places.impl.navigation.b
            @Override // defpackage.sls
            public final Object invoke() {
                d dVar = d.this;
                return new e(dVar.a0(), dVar.V(), bVar4, new i4b0(20, dVar), new PlacesInternalRouter$replayer$2$2(0, dVar, d.class, "clearMapDataIfNeeded", "clearMapDataIfNeeded()V", 0), new PlacesInternalRouter$replayer$2$3(dVar, null), new wg30(29, dVar));
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object k0(d dVar, dm80 dm80Var, boolean z, ContinuationImpl continuationImpl) {
        PlacesInternalRouter$processPayload$1 placesInternalRouter$processPayload$1;
        int i;
        y7c0 y7c0Var;
        ccc0 ccc0Var = dVar.V;
        if (continuationImpl instanceof PlacesInternalRouter$processPayload$1) {
            placesInternalRouter$processPayload$1 = (PlacesInternalRouter$processPayload$1) continuationImpl;
            int i2 = placesInternalRouter$processPayload$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesInternalRouter$processPayload$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesInternalRouter$processPayload$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesInternalRouter$processPayload$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!z) {
                        bcc0 bcc0Var = (bcc0) kotlin.collections.a.R((List) dVar.V.a.getValue());
                        if (!jl40.l(bcc0Var != null ? bcc0Var.a : null, dm80Var)) {
                            ccc0Var.a();
                        }
                        ccc0Var.b(new bcc0(dm80Var, PlacesNavigationEntry$Source.STARTER));
                        dVar.n0(dm80Var);
                        dVar.l0();
                    }
                    if (dm80Var instanceof wl80) {
                        com.yandex.go.places.impl.navigation.common.base.c a0 = dVar.a0();
                        wl80 wl80Var = (wl80) dm80Var;
                        PlaceType placeType = wl80Var.c;
                        zzs zzsVar = wl80Var.d;
                        com.yandex.go.places.impl.navigation.common.base.d dVar2 = a0.a;
                        dVar2.T().f(placeType, zzsVar, new i75(dVar2, 4));
                    } else if (dm80Var instanceof xl80) {
                        dVar.a0().c((xl80) dm80Var, true, z, new t9b0(19, dVar));
                    } else if (dm80Var instanceof yl80) {
                        dVar.a0().d((yl80) dm80Var, z, null);
                    } else if (dm80Var instanceof cm80) {
                        dVar.a0().h((cm80) dm80Var, z);
                    } else if (dm80Var instanceof vl80) {
                        com.yandex.go.places.experiments.flex.b bVar = dVar.D;
                        placesInternalRouter$processPayload$1.L$0 = dm80Var;
                        placesInternalRouter$processPayload$1.Z$0 = z;
                        placesInternalRouter$processPayload$1.label = 1;
                        obj = bVar.a(placesInternalRouter$processPayload$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else if (dm80Var instanceof ul80) {
                        dVar.a0().a((ul80) dm80Var, z, null);
                    } else if (dm80Var instanceof zl80) {
                        dVar.a0().f((zl80) dm80Var);
                    } else if (dm80Var instanceof am80) {
                        dVar.a0().g((am80) dm80Var);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z = placesInternalRouter$processPayload$1.Z$0;
                dm80Var = (dm80) placesInternalRouter$processPayload$1.L$0;
                kotlin.b.b(obj);
                y7c0Var = (y7c0) obj;
                if (y7c0Var != null) {
                    dVar.a0().h(new cm80(dm80Var.a, dm80Var.b, ((vl80) dm80Var).c, null, null, false, false, 120), z);
                } else {
                    com.yandex.go.places.impl.navigation.common.base.d dVar3 = dVar.a0().a;
                    dVar3.T().d(new l75(3), y7c0Var, new m75(dVar3, i3), k1j0.a);
                }
                return zy11.a;
            }
        }
        placesInternalRouter$processPayload$1 = new PlacesInternalRouter$processPayload$1(dVar, continuationImpl);
        Object obj2 = placesInternalRouter$processPayload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesInternalRouter$processPayload$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        y7c0Var = (y7c0) obj2;
        if (y7c0Var != null) {
        }
        return zy11.a;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        dm80 dm80Var = (dm80) obj;
        super.i0(dm80Var);
        S(new PlacesInternalRouter$onAttach$1(this, dm80Var, null));
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        super.j0((dm80) obj);
        this.t0 = null;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.V.a();
        this.s0 = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        tje.N(o(), null, null, new PlacesInternalRouter$subscribeToDeeplinks$1(this, null), 3);
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.a, com.yandex.go.places.impl.navigation.common.base.d
    public final void R(a5g a5gVar) {
        uiq0 uiq0Var = (uiq0) ((ftj) a5gVar.s.get()).b.a.getValue();
        this.s0 = uiq0Var != null ? uiq0Var.b : null;
        super.R(a5gVar);
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.a, com.yandex.go.places.impl.navigation.common.base.d
    public final PlacesNavigationMode X() {
        return this.g0;
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.a
    public final void i0(dm80 dm80Var) {
        throw null;
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.a
    public final void j0(dm80 dm80Var) {
        throw null;
    }

    public final void l0() {
        if (kotlin.collections.a.J((Iterable) this.V.a.getValue(), 1).isEmpty()) {
            tje.N(o(), null, null, new PlacesInternalRouter$clearMapDataIfNeeded$1(this, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f9, code lost:
    
        if (r4 == r3) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.go.places.impl.navigation.common.base.d
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(dm80 dm80Var, ContinuationImpl continuationImpl) {
        PlacesInternalRouter$createComponent$1 placesInternalRouter$createComponent$1;
        int i;
        dm80 dm80Var2;
        Object c;
        yac0 yac0Var;
        dm80 dm80Var3;
        Object b;
        odc0 odc0Var;
        Object c2;
        dm80 dm80Var4;
        yac0 yac0Var2;
        boolean z;
        boolean booleanValue;
        Object a;
        odc0 odc0Var2;
        ofc0 ofc0Var;
        ggc0 ggc0Var;
        w4g w4gVar;
        Object d;
        i6r i6rVar;
        kbc0 kbc0Var;
        PlacesMapMode placesMapMode;
        boolean z2;
        PlacesNavigationMode placesNavigationMode;
        boolean z3;
        lg80 lg80Var;
        p75 p75Var;
        yac0 yac0Var3;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar;
        tse tseVar;
        if (continuationImpl instanceof PlacesInternalRouter$createComponent$1) {
            placesInternalRouter$createComponent$1 = (PlacesInternalRouter$createComponent$1) continuationImpl;
            int i2 = placesInternalRouter$createComponent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                placesInternalRouter$createComponent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = placesInternalRouter$createComponent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesInternalRouter$createComponent$1.label;
                j jVar = this.m0;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        dm80Var2 = dm80Var;
                        placesInternalRouter$createComponent$1.L$0 = dm80Var2;
                        placesInternalRouter$createComponent$1.label = 1;
                        c = jVar.c(placesInternalRouter$createComponent$1);
                        break;
                    case 1:
                        dm80 dm80Var5 = (dm80) placesInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        c = obj;
                        dm80Var2 = dm80Var5;
                        yac0Var = (yac0) c;
                        placesInternalRouter$createComponent$1.L$0 = dm80Var2;
                        placesInternalRouter$createComponent$1.L$1 = yac0Var;
                        placesInternalRouter$createComponent$1.label = 2;
                        Object a2 = this.n0.a(placesInternalRouter$createComponent$1);
                        if (a2 != coroutineSingletons) {
                            dm80Var3 = dm80Var2;
                            obj = a2;
                            odc0 odc0Var3 = (odc0) obj;
                            placesInternalRouter$createComponent$1.L$0 = dm80Var3;
                            placesInternalRouter$createComponent$1.L$1 = yac0Var;
                            placesInternalRouter$createComponent$1.L$2 = odc0Var3;
                            placesInternalRouter$createComponent$1.label = 3;
                            b = ((t1b0) this.p0.b.getValue()).b(placesInternalRouter$createComponent$1);
                            if (b != coroutineSingletons) {
                                odc0Var = odc0Var3;
                                obj = b;
                                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                                placesInternalRouter$createComponent$1.L$0 = dm80Var3;
                                placesInternalRouter$createComponent$1.L$1 = yac0Var;
                                placesInternalRouter$createComponent$1.L$2 = odc0Var;
                                placesInternalRouter$createComponent$1.Z$0 = booleanValue2;
                                placesInternalRouter$createComponent$1.label = 4;
                                c2 = this.o0.c(placesInternalRouter$createComponent$1);
                                if (c2 != coroutineSingletons) {
                                    dm80Var4 = dm80Var3;
                                    yac0Var2 = yac0Var;
                                    z = booleanValue2;
                                    obj = c2;
                                    booleanValue = ((Boolean) obj).booleanValue();
                                    placesInternalRouter$createComponent$1.L$0 = dm80Var4;
                                    placesInternalRouter$createComponent$1.L$1 = yac0Var2;
                                    placesInternalRouter$createComponent$1.L$2 = odc0Var;
                                    placesInternalRouter$createComponent$1.Z$0 = z;
                                    placesInternalRouter$createComponent$1.Z$1 = booleanValue;
                                    placesInternalRouter$createComponent$1.label = 5;
                                    a = this.q0.a(placesInternalRouter$createComponent$1);
                                    if (a != coroutineSingletons) {
                                        odc0Var2 = odc0Var;
                                        ofc0Var = (ofc0) a;
                                        boolean z4 = dm80Var4 instanceof vl80;
                                        ggc0Var = new ggc0(z4);
                                        w4gVar = new w4g();
                                        com.yandex.go.places.impl.navigation.common.navigator.internal.b V = V();
                                        tse o = o();
                                        lg80 lg80Var2 = dm80Var4.b;
                                        kbc0 kbc0Var2 = !(dm80Var4 instanceof cm80) ? ((cm80) dm80Var4).e : null;
                                        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                                        placesInternalRouter$createComponent$1.L$0 = null;
                                        placesInternalRouter$createComponent$1.L$1 = yac0Var2;
                                        placesInternalRouter$createComponent$1.L$2 = odc0Var2;
                                        placesInternalRouter$createComponent$1.L$3 = ofc0Var;
                                        placesInternalRouter$createComponent$1.L$4 = ggc0Var;
                                        placesInternalRouter$createComponent$1.L$5 = w4gVar;
                                        i6r i6rVar2 = this.l0;
                                        placesInternalRouter$createComponent$1.L$6 = i6rVar2;
                                        placesInternalRouter$createComponent$1.L$7 = V;
                                        p75 p75Var2 = this.W;
                                        placesInternalRouter$createComponent$1.L$8 = p75Var2;
                                        placesInternalRouter$createComponent$1.L$9 = o;
                                        placesInternalRouter$createComponent$1.L$10 = lg80Var2;
                                        placesInternalRouter$createComponent$1.L$11 = kbc0Var2;
                                        kbc0 kbc0Var3 = kbc0Var2;
                                        PlacesNavigationMode placesNavigationMode2 = this.g0;
                                        placesInternalRouter$createComponent$1.L$12 = placesNavigationMode2;
                                        PlacesMapMode placesMapMode2 = this.h0;
                                        placesInternalRouter$createComponent$1.L$13 = placesMapMode2;
                                        placesInternalRouter$createComponent$1.Z$0 = z;
                                        placesInternalRouter$createComponent$1.Z$1 = booleanValue;
                                        placesInternalRouter$createComponent$1.I$0 = z4 ? 1 : 0;
                                        placesInternalRouter$createComponent$1.label = 6;
                                        d = jVar.d(placesMapConfig$PlacesMapScreenName, placesInternalRouter$createComponent$1);
                                        if (d != coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        i6rVar = i6rVar2;
                                        kbc0Var = kbc0Var3;
                                        placesMapMode = placesMapMode2;
                                        z2 = booleanValue;
                                        obj = d;
                                        placesNavigationMode = placesNavigationMode2;
                                        z3 = z;
                                        lg80Var = lg80Var2;
                                        p75Var = p75Var2;
                                        yac0Var3 = yac0Var2;
                                        bVar = V;
                                        tseVar = o;
                                        ggc0 ggc0Var2 = ggc0Var;
                                        ofc0 ofc0Var2 = ofc0Var;
                                        odc0 odc0Var4 = odc0Var2;
                                        PlacesMapOwner placesMapOwner = PlacesMapOwner.PLACES_FEATURE;
                                        w4gVar.getClass();
                                        return w4g.a(i6rVar, bVar, p75Var, tseVar, yac0Var3, odc0Var4, kbc0Var, z2, ofc0Var2, z3, false, ggc0Var2, lg80Var, placesNavigationMode, placesMapMode, (Integer) obj, placesMapOwner);
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        yac0Var = (yac0) placesInternalRouter$createComponent$1.L$1;
                        dm80 dm80Var6 = (dm80) placesInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        dm80Var3 = dm80Var6;
                        odc0 odc0Var32 = (odc0) obj;
                        placesInternalRouter$createComponent$1.L$0 = dm80Var3;
                        placesInternalRouter$createComponent$1.L$1 = yac0Var;
                        placesInternalRouter$createComponent$1.L$2 = odc0Var32;
                        placesInternalRouter$createComponent$1.label = 3;
                        b = ((t1b0) this.p0.b.getValue()).b(placesInternalRouter$createComponent$1);
                        if (b != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        odc0 odc0Var5 = (odc0) placesInternalRouter$createComponent$1.L$2;
                        yac0 yac0Var4 = (yac0) placesInternalRouter$createComponent$1.L$1;
                        dm80Var3 = (dm80) placesInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        odc0Var = odc0Var5;
                        yac0Var = yac0Var4;
                        boolean booleanValue22 = ((Boolean) obj).booleanValue();
                        placesInternalRouter$createComponent$1.L$0 = dm80Var3;
                        placesInternalRouter$createComponent$1.L$1 = yac0Var;
                        placesInternalRouter$createComponent$1.L$2 = odc0Var;
                        placesInternalRouter$createComponent$1.Z$0 = booleanValue22;
                        placesInternalRouter$createComponent$1.label = 4;
                        c2 = this.o0.c(placesInternalRouter$createComponent$1);
                        if (c2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        z = placesInternalRouter$createComponent$1.Z$0;
                        odc0Var = (odc0) placesInternalRouter$createComponent$1.L$2;
                        yac0Var2 = (yac0) placesInternalRouter$createComponent$1.L$1;
                        dm80 dm80Var7 = (dm80) placesInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        dm80Var4 = dm80Var7;
                        booleanValue = ((Boolean) obj).booleanValue();
                        placesInternalRouter$createComponent$1.L$0 = dm80Var4;
                        placesInternalRouter$createComponent$1.L$1 = yac0Var2;
                        placesInternalRouter$createComponent$1.L$2 = odc0Var;
                        placesInternalRouter$createComponent$1.Z$0 = z;
                        placesInternalRouter$createComponent$1.Z$1 = booleanValue;
                        placesInternalRouter$createComponent$1.label = 5;
                        a = this.q0.a(placesInternalRouter$createComponent$1);
                        if (a != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        boolean z5 = placesInternalRouter$createComponent$1.Z$1;
                        boolean z6 = placesInternalRouter$createComponent$1.Z$0;
                        odc0 odc0Var6 = (odc0) placesInternalRouter$createComponent$1.L$2;
                        yac0 yac0Var5 = (yac0) placesInternalRouter$createComponent$1.L$1;
                        dm80Var4 = (dm80) placesInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        odc0Var2 = odc0Var6;
                        yac0Var2 = yac0Var5;
                        a = obj;
                        booleanValue = z5;
                        z = z6;
                        ofc0Var = (ofc0) a;
                        boolean z42 = dm80Var4 instanceof vl80;
                        ggc0Var = new ggc0(z42);
                        w4gVar = new w4g();
                        com.yandex.go.places.impl.navigation.common.navigator.internal.b V2 = V();
                        tse o2 = o();
                        lg80 lg80Var22 = dm80Var4.b;
                        if (!(dm80Var4 instanceof cm80)) {
                        }
                        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName2 = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                        placesInternalRouter$createComponent$1.L$0 = null;
                        placesInternalRouter$createComponent$1.L$1 = yac0Var2;
                        placesInternalRouter$createComponent$1.L$2 = odc0Var2;
                        placesInternalRouter$createComponent$1.L$3 = ofc0Var;
                        placesInternalRouter$createComponent$1.L$4 = ggc0Var;
                        placesInternalRouter$createComponent$1.L$5 = w4gVar;
                        i6r i6rVar22 = this.l0;
                        placesInternalRouter$createComponent$1.L$6 = i6rVar22;
                        placesInternalRouter$createComponent$1.L$7 = V2;
                        p75 p75Var22 = this.W;
                        placesInternalRouter$createComponent$1.L$8 = p75Var22;
                        placesInternalRouter$createComponent$1.L$9 = o2;
                        placesInternalRouter$createComponent$1.L$10 = lg80Var22;
                        placesInternalRouter$createComponent$1.L$11 = kbc0Var2;
                        kbc0 kbc0Var32 = kbc0Var2;
                        PlacesNavigationMode placesNavigationMode22 = this.g0;
                        placesInternalRouter$createComponent$1.L$12 = placesNavigationMode22;
                        PlacesMapMode placesMapMode22 = this.h0;
                        placesInternalRouter$createComponent$1.L$13 = placesMapMode22;
                        placesInternalRouter$createComponent$1.Z$0 = z;
                        placesInternalRouter$createComponent$1.Z$1 = booleanValue;
                        placesInternalRouter$createComponent$1.I$0 = z42 ? 1 : 0;
                        placesInternalRouter$createComponent$1.label = 6;
                        d = jVar.d(placesMapConfig$PlacesMapScreenName2, placesInternalRouter$createComponent$1);
                        if (d != coroutineSingletons) {
                        }
                        break;
                    case 6:
                        boolean z7 = placesInternalRouter$createComponent$1.Z$1;
                        boolean z8 = placesInternalRouter$createComponent$1.Z$0;
                        PlacesMapMode placesMapMode3 = (PlacesMapMode) placesInternalRouter$createComponent$1.L$13;
                        PlacesNavigationMode placesNavigationMode3 = (PlacesNavigationMode) placesInternalRouter$createComponent$1.L$12;
                        kbc0 kbc0Var4 = (kbc0) placesInternalRouter$createComponent$1.L$11;
                        lg80 lg80Var3 = (lg80) placesInternalRouter$createComponent$1.L$10;
                        tse tseVar2 = (tse) placesInternalRouter$createComponent$1.L$9;
                        p75 p75Var3 = (p75) placesInternalRouter$createComponent$1.L$8;
                        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2 = (com.yandex.go.places.impl.navigation.common.navigator.internal.b) placesInternalRouter$createComponent$1.L$7;
                        i6r i6rVar3 = (i6r) placesInternalRouter$createComponent$1.L$6;
                        w4gVar = (w4g) placesInternalRouter$createComponent$1.L$5;
                        ggc0Var = (ggc0) placesInternalRouter$createComponent$1.L$4;
                        ofc0Var = (ofc0) placesInternalRouter$createComponent$1.L$3;
                        odc0Var2 = (odc0) placesInternalRouter$createComponent$1.L$2;
                        yac0 yac0Var6 = (yac0) placesInternalRouter$createComponent$1.L$1;
                        kotlin.b.b(obj);
                        z2 = z7;
                        yac0Var3 = yac0Var6;
                        z3 = z8;
                        placesMapMode = placesMapMode3;
                        placesNavigationMode = placesNavigationMode3;
                        kbc0Var = kbc0Var4;
                        lg80Var = lg80Var3;
                        tseVar = tseVar2;
                        p75Var = p75Var3;
                        bVar = bVar2;
                        i6rVar = i6rVar3;
                        ggc0 ggc0Var22 = ggc0Var;
                        ofc0 ofc0Var22 = ofc0Var;
                        odc0 odc0Var42 = odc0Var2;
                        PlacesMapOwner placesMapOwner2 = PlacesMapOwner.PLACES_FEATURE;
                        w4gVar.getClass();
                        return w4g.a(i6rVar, bVar, p75Var, tseVar, yac0Var3, odc0Var42, kbc0Var, z2, ofc0Var22, z3, false, ggc0Var22, lg80Var, placesNavigationMode, placesMapMode, (Integer) obj, placesMapOwner2);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        placesInternalRouter$createComponent$1 = new PlacesInternalRouter$createComponent$1(this, continuationImpl);
        Object obj2 = placesInternalRouter$createComponent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesInternalRouter$createComponent$1.label;
        j jVar2 = this.m0;
        switch (i) {
        }
    }

    public final void n0(dm80 dm80Var) {
        com.yandex.go.places.map.ui.overlay.a aVar = this.t0;
        if (aVar == null) {
            return;
        }
        if (dm80Var instanceof vl80) {
            r0 r0Var = aVar.a;
            bbc0 bbc0Var = bbc0.b;
            r0Var.getClass();
            r0Var.m(null, bbc0Var);
            return;
        }
        if ((dm80Var instanceof cm80) || (dm80Var instanceof yl80) || (dm80Var instanceof xl80) || (dm80Var instanceof wl80) || (dm80Var instanceof ul80) || (dm80Var instanceof zl80) || (dm80Var instanceof bm80) || (dm80Var instanceof am80)) {
            aVar.b();
        } else {
            w511.b();
        }
    }
}
