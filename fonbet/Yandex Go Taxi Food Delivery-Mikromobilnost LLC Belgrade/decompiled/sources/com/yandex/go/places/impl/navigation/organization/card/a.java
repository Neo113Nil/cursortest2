package com.yandex.go.places.impl.navigation.organization.card;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import com.yandex.go.places.common.navigation.deeplink.PlacesNavigationMode;
import com.yandex.go.places.experiments.map.j;
import com.yandex.go.places.experiments.map.pin_war_v2.o;
import com.yandex.go.places.impl.navigation.map.PlacesMapMode;
import com.yandex.go.places.models.domain.entities.PlacesMapOwner;
import com.yandex.go.places.models.domain.entities.map.PlacesMapConfig$PlacesMapScreenName;
import defpackage.acc0;
import defpackage.b75;
import defpackage.bcc0;
import defpackage.c2x0;
import defpackage.dcc0;
import defpackage.dl80;
import defpackage.dm80;
import defpackage.fgc0;
import defpackage.ggc0;
import defpackage.hgc0;
import defpackage.i6r;
import defpackage.je80;
import defpackage.jj3;
import defpackage.jyh;
import defpackage.kbc0;
import defpackage.kc50;
import defpackage.kcc0;
import defpackage.kn80;
import defpackage.l4c0;
import defpackage.lg80;
import defpackage.m9c0;
import defpackage.n3h;
import defpackage.ny61;
import defpackage.odc0;
import defpackage.ofc0;
import defpackage.p75;
import defpackage.sls;
import defpackage.t1b0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vgc0;
import defpackage.w030;
import defpackage.w4g;
import defpackage.xl80;
import defpackage.yac0;
import defpackage.z0j;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes13.dex */
public final class a extends com.yandex.go.places.impl.navigation.common.base.a {
    public final PlacesNavigationMode g0;
    public final PlacesMapMode h0;
    public final b i0;
    public final dl80 j0;
    public final i6r k0;
    public final j l0;
    public final o m0;
    public final com.yandex.go.places.experiments.tabbar.b n0;
    public final kcc0 o0;
    public final com.yandex.go.places.experiments.map.social_pin.b p0;

    public a(PlacesNavigationMode placesNavigationMode, PlacesMapMode placesMapMode, b bVar, dl80 dl80Var, i6r i6rVar, j jVar, o oVar, com.yandex.go.places.experiments.tabbar.b bVar2, kcc0 kcc0Var, com.yandex.go.places.experiments.map.social_pin.b bVar3, c2x0 c2x0Var, w030 w030Var, n3h n3hVar, vgc0 vgc0Var, com.yandex.go.morphlex.router.b bVar4, z0j z0jVar, com.yandex.go.places.experiments.flex.b bVar5, kn80 kn80Var, m9c0 m9c0Var, jyh jyhVar, com.yandex.go.places.complaint.impl.navigation.a aVar, kc50 kc50Var, jj3 jj3Var, acc0 acc0Var, z0j z0jVar2, l4c0 l4c0Var) {
        super(placesNavigationMode, placesMapMode, l4c0Var, c2x0Var, z0jVar, w030Var, z0jVar2, bVar5, kn80Var, n3hVar, vgc0Var, bVar4, m9c0Var, jyhVar, aVar, kc50Var, jj3Var, acc0Var);
        this.g0 = placesNavigationMode;
        this.h0 = placesMapMode;
        this.i0 = bVar;
        this.j0 = dl80Var;
        this.k0 = i6rVar;
        this.l0 = jVar;
        this.m0 = oVar;
        this.n0 = bVar2;
        this.o0 = kcc0Var;
        this.p0 = bVar3;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        xl80 xl80Var = (xl80) obj;
        xl80 l0 = l0();
        if (l0 != null) {
            xl80Var = l0;
        }
        i0(xl80Var);
        sls slsVar = xl80Var.k;
        if (slsVar != null) {
            slsVar.invoke();
        }
        S(new PlacesOrganizationCardInternalRouter$onAttach$1(this, xl80Var, null));
        tje.N(o(), null, null, new PlacesOrganizationCardInternalRouter$subscribeToDeeplinks$1(this, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        sls slsVar;
        xl80 xl80Var = (xl80) obj;
        j0(xl80Var);
        xl80 l0 = l0();
        if (l0 == null || (slsVar = l0.l) == null) {
            slsVar = xl80Var.l;
        }
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        sls slsVar;
        xl80 xl80Var = (xl80) obj;
        xl80 l0 = l0();
        if (l0 == null || (slsVar = l0.m) == null) {
            slsVar = xl80Var.m;
        }
        if (slsVar != null) {
            slsVar.invoke();
        }
        this.V.a();
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.a, com.yandex.go.places.impl.navigation.common.base.d
    public final PlacesNavigationMode X() {
        return this.g0;
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.a, com.yandex.go.places.impl.navigation.common.base.d
    public final void d0(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
        r(new b75(openNavigatorActionSubtype, str, 4));
    }

    @Override // com.yandex.go.places.impl.navigation.common.base.a, com.yandex.go.places.impl.navigation.common.base.d
    public final void g0(String str) {
        r(new dcc0(str, 0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0100, code lost:
    
        if (r4 == r3) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.yandex.go.places.impl.navigation.common.base.d
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Q(xl80 xl80Var, ContinuationImpl continuationImpl) {
        PlacesOrganizationCardInternalRouter$createComponent$1 placesOrganizationCardInternalRouter$createComponent$1;
        int i;
        xl80 xl80Var2;
        Object c;
        yac0 yac0Var;
        xl80 xl80Var3;
        Object b;
        odc0 odc0Var;
        Object c2;
        xl80 xl80Var4;
        yac0 yac0Var2;
        boolean z;
        Object a;
        boolean z2;
        boolean z3;
        je80 je80Var;
        int i2;
        int i3;
        hgc0 hgc0Var;
        int i4;
        lg80 lg80Var;
        Object d;
        PlacesMapMode placesMapMode;
        PlacesNavigationMode placesNavigationMode;
        i6r i6rVar;
        boolean z4;
        tse tseVar;
        odc0 odc0Var2;
        yac0 yac0Var3;
        boolean z5;
        int i5;
        hgc0 hgc0Var2;
        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar;
        ofc0 ofc0Var;
        p75 p75Var;
        kbc0 kbc0Var;
        w4g w4gVar;
        if (continuationImpl instanceof PlacesOrganizationCardInternalRouter$createComponent$1) {
            placesOrganizationCardInternalRouter$createComponent$1 = (PlacesOrganizationCardInternalRouter$createComponent$1) continuationImpl;
            int i6 = placesOrganizationCardInternalRouter$createComponent$1.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                placesOrganizationCardInternalRouter$createComponent$1.label = i6 - Integer.MIN_VALUE;
                Object obj = placesOrganizationCardInternalRouter$createComponent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = placesOrganizationCardInternalRouter$createComponent$1.label;
                j jVar = this.l0;
                switch (i) {
                    case 0:
                        kotlin.b.b(obj);
                        xl80Var2 = xl80Var;
                        placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var2;
                        placesOrganizationCardInternalRouter$createComponent$1.label = 1;
                        c = jVar.c(placesOrganizationCardInternalRouter$createComponent$1);
                        break;
                    case 1:
                        xl80 xl80Var5 = (xl80) placesOrganizationCardInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        c = obj;
                        xl80Var2 = xl80Var5;
                        yac0Var = (yac0) c;
                        placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var2;
                        placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var;
                        placesOrganizationCardInternalRouter$createComponent$1.label = 2;
                        Object a2 = this.m0.a(placesOrganizationCardInternalRouter$createComponent$1);
                        if (a2 != coroutineSingletons) {
                            xl80Var3 = xl80Var2;
                            obj = a2;
                            odc0 odc0Var3 = (odc0) obj;
                            placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var3;
                            placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var;
                            placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var3;
                            placesOrganizationCardInternalRouter$createComponent$1.label = 3;
                            b = ((t1b0) this.o0.b.getValue()).b(placesOrganizationCardInternalRouter$createComponent$1);
                            if (b != coroutineSingletons) {
                                odc0Var = odc0Var3;
                                obj = b;
                                boolean booleanValue = ((Boolean) obj).booleanValue();
                                placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var3;
                                placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var;
                                placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                                placesOrganizationCardInternalRouter$createComponent$1.Z$0 = booleanValue;
                                placesOrganizationCardInternalRouter$createComponent$1.label = 4;
                                c2 = this.n0.c(placesOrganizationCardInternalRouter$createComponent$1);
                                if (c2 != coroutineSingletons) {
                                    xl80Var4 = xl80Var3;
                                    yac0Var2 = yac0Var;
                                    z = booleanValue;
                                    obj = c2;
                                    boolean booleanValue2 = ((Boolean) obj).booleanValue();
                                    placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var4;
                                    placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var2;
                                    placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                                    placesOrganizationCardInternalRouter$createComponent$1.Z$0 = z;
                                    placesOrganizationCardInternalRouter$createComponent$1.Z$1 = booleanValue2;
                                    placesOrganizationCardInternalRouter$createComponent$1.label = 5;
                                    a = this.p0.a(placesOrganizationCardInternalRouter$createComponent$1);
                                    if (a != coroutineSingletons) {
                                        boolean z6 = z;
                                        z2 = booleanValue2;
                                        obj = a;
                                        z3 = z6;
                                        ofc0 ofc0Var2 = (ofc0) obj;
                                        je80Var = xl80Var4.i;
                                        i2 = je80Var == null ? je80Var.k : 1;
                                        if (i2 == 0) {
                                            i3 = 0;
                                            hgc0Var = new ggc0(false);
                                        } else {
                                            i3 = 0;
                                            hgc0Var = fgc0.a;
                                        }
                                        if (je80Var != null && je80Var.o) {
                                            i4 = 1;
                                            w4g w4gVar2 = new w4g();
                                            com.yandex.go.places.impl.navigation.common.navigator.internal.b V = V();
                                            tse o = o();
                                            lg80Var = xl80Var4.b;
                                            PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$0 = null;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var2;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$3 = ofc0Var2;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$4 = hgc0Var;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$5 = w4gVar2;
                                            i6r i6rVar2 = this.k0;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$6 = i6rVar2;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$7 = V;
                                            p75 p75Var2 = this.W;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$8 = p75Var2;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$9 = o;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$10 = lg80Var;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$11 = null;
                                            PlacesNavigationMode placesNavigationMode2 = this.g0;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$12 = placesNavigationMode2;
                                            PlacesMapMode placesMapMode2 = this.h0;
                                            placesOrganizationCardInternalRouter$createComponent$1.L$13 = placesMapMode2;
                                            placesOrganizationCardInternalRouter$createComponent$1.Z$0 = z3;
                                            placesOrganizationCardInternalRouter$createComponent$1.Z$1 = z2;
                                            placesOrganizationCardInternalRouter$createComponent$1.I$0 = i2;
                                            placesOrganizationCardInternalRouter$createComponent$1.I$1 = i4;
                                            placesOrganizationCardInternalRouter$createComponent$1.label = 6;
                                            d = jVar.d(placesMapConfig$PlacesMapScreenName, placesOrganizationCardInternalRouter$createComponent$1);
                                            if (d != coroutineSingletons) {
                                                return coroutineSingletons;
                                            }
                                            placesMapMode = placesMapMode2;
                                            placesNavigationMode = placesNavigationMode2;
                                            obj = d;
                                            i6rVar = i6rVar2;
                                            z4 = z2;
                                            tseVar = o;
                                            odc0Var2 = odc0Var;
                                            yac0Var3 = yac0Var2;
                                            z5 = z3;
                                            i5 = i4;
                                            hgc0Var2 = hgc0Var;
                                            bVar = V;
                                            ofc0Var = ofc0Var2;
                                            p75Var = p75Var2;
                                            kbc0Var = null;
                                            w4gVar = w4gVar2;
                                            lg80 lg80Var2 = lg80Var;
                                            Integer num = (Integer) obj;
                                            PlacesMapOwner placesMapOwner = PlacesMapOwner.PLACES_FEATURE;
                                            boolean z7 = i5 == 0;
                                            w4gVar.getClass();
                                            return w4g.a(i6rVar, bVar, p75Var, tseVar, yac0Var3, odc0Var2, kbc0Var, z4, ofc0Var, z5, z7, hgc0Var2, lg80Var2, placesNavigationMode, placesMapMode, num, placesMapOwner);
                                        }
                                        i4 = i3;
                                        w4g w4gVar22 = new w4g();
                                        com.yandex.go.places.impl.navigation.common.navigator.internal.b V2 = V();
                                        tse o2 = o();
                                        lg80Var = xl80Var4.b;
                                        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName2 = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$0 = null;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var2;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$3 = ofc0Var2;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$4 = hgc0Var;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$5 = w4gVar22;
                                        i6r i6rVar22 = this.k0;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$6 = i6rVar22;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$7 = V2;
                                        p75 p75Var22 = this.W;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$8 = p75Var22;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$9 = o2;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$10 = lg80Var;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$11 = null;
                                        PlacesNavigationMode placesNavigationMode22 = this.g0;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$12 = placesNavigationMode22;
                                        PlacesMapMode placesMapMode22 = this.h0;
                                        placesOrganizationCardInternalRouter$createComponent$1.L$13 = placesMapMode22;
                                        placesOrganizationCardInternalRouter$createComponent$1.Z$0 = z3;
                                        placesOrganizationCardInternalRouter$createComponent$1.Z$1 = z2;
                                        placesOrganizationCardInternalRouter$createComponent$1.I$0 = i2;
                                        placesOrganizationCardInternalRouter$createComponent$1.I$1 = i4;
                                        placesOrganizationCardInternalRouter$createComponent$1.label = 6;
                                        d = jVar.d(placesMapConfig$PlacesMapScreenName2, placesOrganizationCardInternalRouter$createComponent$1);
                                        if (d != coroutineSingletons) {
                                        }
                                    }
                                }
                            }
                        }
                        return coroutineSingletons;
                    case 2:
                        yac0Var = (yac0) placesOrganizationCardInternalRouter$createComponent$1.L$1;
                        xl80 xl80Var6 = (xl80) placesOrganizationCardInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        xl80Var3 = xl80Var6;
                        odc0 odc0Var32 = (odc0) obj;
                        placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var3;
                        placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var;
                        placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var32;
                        placesOrganizationCardInternalRouter$createComponent$1.label = 3;
                        b = ((t1b0) this.o0.b.getValue()).b(placesOrganizationCardInternalRouter$createComponent$1);
                        if (b != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 3:
                        odc0 odc0Var4 = (odc0) placesOrganizationCardInternalRouter$createComponent$1.L$2;
                        yac0 yac0Var4 = (yac0) placesOrganizationCardInternalRouter$createComponent$1.L$1;
                        xl80Var3 = (xl80) placesOrganizationCardInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        odc0Var = odc0Var4;
                        yac0Var = yac0Var4;
                        boolean booleanValue3 = ((Boolean) obj).booleanValue();
                        placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var3;
                        placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var;
                        placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                        placesOrganizationCardInternalRouter$createComponent$1.Z$0 = booleanValue3;
                        placesOrganizationCardInternalRouter$createComponent$1.label = 4;
                        c2 = this.n0.c(placesOrganizationCardInternalRouter$createComponent$1);
                        if (c2 != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 4:
                        z = placesOrganizationCardInternalRouter$createComponent$1.Z$0;
                        odc0Var = (odc0) placesOrganizationCardInternalRouter$createComponent$1.L$2;
                        yac0Var2 = (yac0) placesOrganizationCardInternalRouter$createComponent$1.L$1;
                        xl80 xl80Var7 = (xl80) placesOrganizationCardInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        xl80Var4 = xl80Var7;
                        boolean booleanValue22 = ((Boolean) obj).booleanValue();
                        placesOrganizationCardInternalRouter$createComponent$1.L$0 = xl80Var4;
                        placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var2;
                        placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                        placesOrganizationCardInternalRouter$createComponent$1.Z$0 = z;
                        placesOrganizationCardInternalRouter$createComponent$1.Z$1 = booleanValue22;
                        placesOrganizationCardInternalRouter$createComponent$1.label = 5;
                        a = this.p0.a(placesOrganizationCardInternalRouter$createComponent$1);
                        if (a != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    case 5:
                        z2 = placesOrganizationCardInternalRouter$createComponent$1.Z$1;
                        boolean z8 = placesOrganizationCardInternalRouter$createComponent$1.Z$0;
                        odc0 odc0Var5 = (odc0) placesOrganizationCardInternalRouter$createComponent$1.L$2;
                        yac0 yac0Var5 = (yac0) placesOrganizationCardInternalRouter$createComponent$1.L$1;
                        xl80Var4 = (xl80) placesOrganizationCardInternalRouter$createComponent$1.L$0;
                        kotlin.b.b(obj);
                        z3 = z8;
                        odc0Var = odc0Var5;
                        yac0Var2 = yac0Var5;
                        ofc0 ofc0Var22 = (ofc0) obj;
                        je80Var = xl80Var4.i;
                        if (je80Var == null) {
                        }
                        if (i2 == 0) {
                        }
                        if (je80Var != null) {
                            i4 = 1;
                            w4g w4gVar222 = new w4g();
                            com.yandex.go.places.impl.navigation.common.navigator.internal.b V22 = V();
                            tse o22 = o();
                            lg80Var = xl80Var4.b;
                            PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName22 = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                            placesOrganizationCardInternalRouter$createComponent$1.L$0 = null;
                            placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var2;
                            placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                            placesOrganizationCardInternalRouter$createComponent$1.L$3 = ofc0Var22;
                            placesOrganizationCardInternalRouter$createComponent$1.L$4 = hgc0Var;
                            placesOrganizationCardInternalRouter$createComponent$1.L$5 = w4gVar222;
                            i6r i6rVar222 = this.k0;
                            placesOrganizationCardInternalRouter$createComponent$1.L$6 = i6rVar222;
                            placesOrganizationCardInternalRouter$createComponent$1.L$7 = V22;
                            p75 p75Var222 = this.W;
                            placesOrganizationCardInternalRouter$createComponent$1.L$8 = p75Var222;
                            placesOrganizationCardInternalRouter$createComponent$1.L$9 = o22;
                            placesOrganizationCardInternalRouter$createComponent$1.L$10 = lg80Var;
                            placesOrganizationCardInternalRouter$createComponent$1.L$11 = null;
                            PlacesNavigationMode placesNavigationMode222 = this.g0;
                            placesOrganizationCardInternalRouter$createComponent$1.L$12 = placesNavigationMode222;
                            PlacesMapMode placesMapMode222 = this.h0;
                            placesOrganizationCardInternalRouter$createComponent$1.L$13 = placesMapMode222;
                            placesOrganizationCardInternalRouter$createComponent$1.Z$0 = z3;
                            placesOrganizationCardInternalRouter$createComponent$1.Z$1 = z2;
                            placesOrganizationCardInternalRouter$createComponent$1.I$0 = i2;
                            placesOrganizationCardInternalRouter$createComponent$1.I$1 = i4;
                            placesOrganizationCardInternalRouter$createComponent$1.label = 6;
                            d = jVar.d(placesMapConfig$PlacesMapScreenName22, placesOrganizationCardInternalRouter$createComponent$1);
                            if (d != coroutineSingletons) {
                            }
                            break;
                        }
                        i4 = i3;
                        w4g w4gVar2222 = new w4g();
                        com.yandex.go.places.impl.navigation.common.navigator.internal.b V222 = V();
                        tse o222 = o();
                        lg80Var = xl80Var4.b;
                        PlacesMapConfig$PlacesMapScreenName placesMapConfig$PlacesMapScreenName222 = PlacesMapConfig$PlacesMapScreenName.PLACES_MAIN;
                        placesOrganizationCardInternalRouter$createComponent$1.L$0 = null;
                        placesOrganizationCardInternalRouter$createComponent$1.L$1 = yac0Var2;
                        placesOrganizationCardInternalRouter$createComponent$1.L$2 = odc0Var;
                        placesOrganizationCardInternalRouter$createComponent$1.L$3 = ofc0Var22;
                        placesOrganizationCardInternalRouter$createComponent$1.L$4 = hgc0Var;
                        placesOrganizationCardInternalRouter$createComponent$1.L$5 = w4gVar2222;
                        i6r i6rVar2222 = this.k0;
                        placesOrganizationCardInternalRouter$createComponent$1.L$6 = i6rVar2222;
                        placesOrganizationCardInternalRouter$createComponent$1.L$7 = V222;
                        p75 p75Var2222 = this.W;
                        placesOrganizationCardInternalRouter$createComponent$1.L$8 = p75Var2222;
                        placesOrganizationCardInternalRouter$createComponent$1.L$9 = o222;
                        placesOrganizationCardInternalRouter$createComponent$1.L$10 = lg80Var;
                        placesOrganizationCardInternalRouter$createComponent$1.L$11 = null;
                        PlacesNavigationMode placesNavigationMode2222 = this.g0;
                        placesOrganizationCardInternalRouter$createComponent$1.L$12 = placesNavigationMode2222;
                        PlacesMapMode placesMapMode2222 = this.h0;
                        placesOrganizationCardInternalRouter$createComponent$1.L$13 = placesMapMode2222;
                        placesOrganizationCardInternalRouter$createComponent$1.Z$0 = z3;
                        placesOrganizationCardInternalRouter$createComponent$1.Z$1 = z2;
                        placesOrganizationCardInternalRouter$createComponent$1.I$0 = i2;
                        placesOrganizationCardInternalRouter$createComponent$1.I$1 = i4;
                        placesOrganizationCardInternalRouter$createComponent$1.label = 6;
                        d = jVar.d(placesMapConfig$PlacesMapScreenName222, placesOrganizationCardInternalRouter$createComponent$1);
                        if (d != coroutineSingletons) {
                        }
                        break;
                    case 6:
                        int i7 = placesOrganizationCardInternalRouter$createComponent$1.I$1;
                        boolean z9 = placesOrganizationCardInternalRouter$createComponent$1.Z$1;
                        boolean z10 = placesOrganizationCardInternalRouter$createComponent$1.Z$0;
                        PlacesMapMode placesMapMode3 = (PlacesMapMode) placesOrganizationCardInternalRouter$createComponent$1.L$13;
                        PlacesNavigationMode placesNavigationMode3 = (PlacesNavigationMode) placesOrganizationCardInternalRouter$createComponent$1.L$12;
                        kbc0 kbc0Var2 = (kbc0) placesOrganizationCardInternalRouter$createComponent$1.L$11;
                        lg80Var = (lg80) placesOrganizationCardInternalRouter$createComponent$1.L$10;
                        tse tseVar2 = (tse) placesOrganizationCardInternalRouter$createComponent$1.L$9;
                        p75 p75Var3 = (p75) placesOrganizationCardInternalRouter$createComponent$1.L$8;
                        com.yandex.go.places.impl.navigation.common.navigator.internal.b bVar2 = (com.yandex.go.places.impl.navigation.common.navigator.internal.b) placesOrganizationCardInternalRouter$createComponent$1.L$7;
                        i6r i6rVar3 = (i6r) placesOrganizationCardInternalRouter$createComponent$1.L$6;
                        w4gVar = (w4g) placesOrganizationCardInternalRouter$createComponent$1.L$5;
                        hgc0 hgc0Var3 = (hgc0) placesOrganizationCardInternalRouter$createComponent$1.L$4;
                        ofc0 ofc0Var3 = (ofc0) placesOrganizationCardInternalRouter$createComponent$1.L$3;
                        odc0 odc0Var6 = (odc0) placesOrganizationCardInternalRouter$createComponent$1.L$2;
                        yac0 yac0Var6 = (yac0) placesOrganizationCardInternalRouter$createComponent$1.L$1;
                        kotlin.b.b(obj);
                        odc0Var2 = odc0Var6;
                        yac0Var3 = yac0Var6;
                        z4 = z9;
                        z5 = z10;
                        placesMapMode = placesMapMode3;
                        placesNavigationMode = placesNavigationMode3;
                        hgc0Var2 = hgc0Var3;
                        ofc0Var = ofc0Var3;
                        kbc0Var = kbc0Var2;
                        tseVar = tseVar2;
                        p75Var = p75Var3;
                        bVar = bVar2;
                        i6rVar = i6rVar3;
                        i5 = i7;
                        lg80 lg80Var22 = lg80Var;
                        Integer num2 = (Integer) obj;
                        PlacesMapOwner placesMapOwner2 = PlacesMapOwner.PLACES_FEATURE;
                        if (i5 == 0) {
                        }
                        w4gVar.getClass();
                        return w4g.a(i6rVar, bVar, p75Var, tseVar, yac0Var3, odc0Var2, kbc0Var, z4, ofc0Var, z5, z7, hgc0Var2, lg80Var22, placesNavigationMode, placesMapMode, num2, placesMapOwner2);
                    default:
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        placesOrganizationCardInternalRouter$createComponent$1 = new PlacesOrganizationCardInternalRouter$createComponent$1(this, continuationImpl);
        Object obj2 = placesOrganizationCardInternalRouter$createComponent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = placesOrganizationCardInternalRouter$createComponent$1.label;
        j jVar2 = this.l0;
        switch (i) {
        }
    }

    public final xl80 l0() {
        bcc0 bcc0Var = (bcc0) kotlin.collections.a.R((List) this.V.a.getValue());
        dm80 dm80Var = bcc0Var != null ? bcc0Var.a : null;
        if (dm80Var instanceof xl80) {
            return (xl80) dm80Var;
        }
        return null;
    }
}
