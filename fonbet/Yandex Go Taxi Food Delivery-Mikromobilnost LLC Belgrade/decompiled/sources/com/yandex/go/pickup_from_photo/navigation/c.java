package com.yandex.go.pickup_from_photo.navigation;

import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSource;
import com.yandex.go.pickup_from_photo.analytics.PhotoPickUpAnalytics$PhotoPickUpSourceScreen;
import com.yandex.go.pickup_from_photo.api.PickupFromPhotoPayload$Origin;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.search.router.Origin;
import defpackage.bob0;
import defpackage.cnb0;
import defpackage.cob0;
import defpackage.cyh;
import defpackage.ddf;
import defpackage.dnb0;
import defpackage.epb0;
import defpackage.f2t;
import defpackage.h55;
import defpackage.hxx;
import defpackage.i3y;
import defpackage.i4b0;
import defpackage.i6r;
import defpackage.jqr;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.lnb0;
import defpackage.m41;
import defpackage.m950;
import defpackage.mdh;
import defpackage.nnb0;
import defpackage.nob0;
import defpackage.ny0;
import defpackage.ny61;
import defpackage.o5g;
import defpackage.oob0;
import defpackage.pob0;
import defpackage.pv0;
import defpackage.pwf0;
import defpackage.pzt0;
import defpackage.qnb0;
import defpackage.rob0;
import defpackage.s26;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tb;
import defpackage.thi0;
import defpackage.tje;
import defpackage.tnb0;
import defpackage.tt2;
import defpackage.umb0;
import defpackage.uyj;
import defpackage.vmb0;
import defpackage.w511;
import defpackage.wob0;
import defpackage.ww90;
import defpackage.xw90;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes13.dex */
public final class c extends h55 implements m950 {
    public final tt2 D;
    public final ru.yandex.taxi.banners.c E;
    public final i F;
    public final umb0 G;
    public final ru.yandex.taxi.address.clarification.impl.repo.a H;
    public final i6r I;
    public final bob0 J;
    public final kr0 K;
    public final p L;
    public final nnb0 M;
    public final yvf0 N;
    public final vmb0 O;
    public final qnb0 P;
    public final ddf Q;
    public final i3y R;
    public final i3y S;
    public final i3y T;
    public final i3y U;
    public final i3y V;
    public final i3y W;
    public sls Z;
    public pzt0 a0;
    public boolean b0;
    public boolean c0;
    public boolean d0;

    public c(tt2 tt2Var, ru.yandex.taxi.banners.c cVar, i iVar, umb0 umb0Var, ru.yandex.taxi.address.clarification.impl.repo.a aVar, i6r i6rVar, bob0 bob0Var, kr0 kr0Var, p pVar, nnb0 nnb0Var, yvf0 yvf0Var, vmb0 vmb0Var, qnb0 qnb0Var, ddf ddfVar) {
        super(null);
        this.D = tt2Var;
        this.E = cVar;
        this.F = iVar;
        this.G = umb0Var;
        this.H = aVar;
        this.I = i6rVar;
        this.J = bob0Var;
        this.K = kr0Var;
        this.L = pVar;
        this.M = nnb0Var;
        this.N = yvf0Var;
        this.O = vmb0Var;
        this.P = qnb0Var;
        this.Q = ddfVar;
        this.R = kotlin.a.a(new nob0(this, 0));
        this.S = kotlin.a.a(new nob0(this, 2));
        this.T = kotlin.a.a(new nob0(this, 3));
        this.U = kotlin.a.a(new nob0(this, 4));
        this.V = kotlin.a.a(new nob0(this, 5));
        this.W = kotlin.a.a(new nob0(this, 6));
        this.b0 = true;
        this.c0 = true;
    }

    public static final void P(c cVar, pv0 pv0Var, boolean z) {
        cVar.b0 = !z;
        cVar.H.m = z;
        ((ny0) cVar.Q.b).a = false;
        epb0 epb0Var = (epb0) cVar.S().i.get();
        m950 m950Var = (m950) cVar.N.get();
        m41 m41Var = new m41(kyh0.new_point_selection_screen_starting_point_title_statement, null, PointType.SOURCE, Origin.SUGGEST, pv0Var, pv0Var != null ? pv0Var.a.B() : null, true, false, null, new ww90(21, epb0Var, cVar), new i4b0(13, cVar), 2816);
        cyh cyhVar = new cyh(2, cVar);
        hxx hxxVar = hxx.a;
        cVar.E(m950Var, m41Var, cyhVar, hxxVar);
        if (z) {
            cVar.E(cVar.R(), new dnb0(new nob0(cVar, 7)), new pob0(cVar), hxxVar);
        } else {
            cVar.M.a(lnb0.a);
            cVar.E(cVar.T(), new thi0(new nob0(cVar, 1)), new rob0(cVar), hxxVar);
        }
        cVar.b0 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v3, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Q(c cVar, xw90 xw90Var, ContinuationImpl continuationImpl) {
        PickupFromPhotoRouterImpl$showOnboardingIfNeeded$1 pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1;
        int i;
        xw90 xw90Var2;
        String str;
        cVar.getClass();
        if (continuationImpl instanceof PickupFromPhotoRouterImpl$showOnboardingIfNeeded$1) {
            pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1 = (PickupFromPhotoRouterImpl$showOnboardingIfNeeded$1) continuationImpl;
            int i2 = pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    cVar.D.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    PickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1 pickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1 = new PickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1(cVar, null);
                    pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.L$0 = xw90Var;
                    pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.label = 1;
                    obj = tje.k0(mdhVar, pickupFromPhotoRouterImpl$showOnboardingIfNeeded$fullscreenId$1, pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1);
                    xw90Var2 = xw90Var;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r8 = (sls) pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.L$0;
                    kotlin.b.b(obj);
                    xw90Var2 = r8;
                }
                str = (String) obj;
                zy11 zy11Var = zy11.a;
                if (str != null) {
                    xw90Var2.invoke();
                    return zy11Var;
                }
                cVar.E.g(str, new s26(2, xw90Var2), null, new tb(7, cVar, xw90Var2), pwf0.c, false);
                return zy11Var;
            }
        }
        pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1 = new PickupFromPhotoRouterImpl$showOnboardingIfNeeded$1(cVar, continuationImpl);
        Object obj2 = pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pickupFromPhotoRouterImpl$showOnboardingIfNeeded$1.label;
        if (i != 0) {
        }
        str = (String) obj2;
        zy11 zy11Var2 = zy11.a;
        if (str != null) {
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        tnb0 tnb0Var = (tnb0) this.W.getValue();
        tnb0Var.a.Td(0, tnb0Var);
        this.P.a = false;
        this.H.m = true;
        ((ny0) this.Q.b).a = true;
        ((epb0) S().i.get()).a(wob0.a);
        com.yandex.go.pickup_from_photo.data.b bVar = (com.yandex.go.pickup_from_photo.data.b) this.S.getValue();
        bVar.k = null;
        bVar.j = null;
        bVar.h = null;
        bVar.i = null;
        vmb0 vmb0Var = this.O;
        vmb0Var.a = null;
        vmb0Var.b = null;
        pzt0 pzt0Var = this.a0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.a0 = null;
        this.d0 = false;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        PhotoPickUpAnalytics$PhotoPickUpSource photoPickUpAnalytics$PhotoPickUpSource;
        PhotoPickUpAnalytics$PhotoPickUpSourceScreen photoPickUpAnalytics$PhotoPickUpSourceScreen;
        cob0 cob0Var = (cob0) obj;
        this.J.a.u("pickup_from_photo_tooltip_should_be_shown", false);
        this.P.a = true;
        epb0 epb0Var = (epb0) S().i.get();
        PickupFromPhotoPayload$Origin pickupFromPhotoPayload$Origin = cob0Var.a;
        int[] iArr = oob0.a;
        int i = iArr[pickupFromPhotoPayload$Origin.ordinal()];
        if (i == 1) {
            photoPickUpAnalytics$PhotoPickUpSource = PhotoPickUpAnalytics$PhotoPickUpSource.Zerosuggest;
        } else {
            if (i != 2) {
                w511.b();
                return;
            }
            photoPickUpAnalytics$PhotoPickUpSource = PhotoPickUpAnalytics$PhotoPickUpSource.Clarify;
        }
        epb0Var.e = photoPickUpAnalytics$PhotoPickUpSource;
        ru.yandex.taxi.address.clarification.impl.repo.a aVar = this.H;
        e.H(o(), new jqr(e.c(aVar.i), new PickupFromPhotoRouterImpl$onLaunch$1(this, null), 3));
        this.a0 = e.H(o(), new jqr(e.d(aVar.f), new PickupFromPhotoRouterImpl$onLaunch$2(this, null), 3));
        com.yandex.go.pickup_from_photo.data.b bVar = (com.yandex.go.pickup_from_photo.data.b) S().w.get();
        bVar.j = (pv0) bVar.e.i().orElse(null);
        bVar.k = ((f2t) bVar.d).a();
        int i2 = iArr[cob0Var.a.ordinal()];
        if (i2 == 1) {
            photoPickUpAnalytics$PhotoPickUpSourceScreen = PhotoPickUpAnalytics$PhotoPickUpSourceScreen.Zerosuggest;
        } else {
            if (i2 != 2) {
                w511.b();
                return;
            }
            photoPickUpAnalytics$PhotoPickUpSourceScreen = PhotoPickUpAnalytics$PhotoPickUpSourceScreen.Clarify;
        }
        this.G.h(photoPickUpAnalytics$PhotoPickUpSourceScreen);
        tje.N(o(), null, null, new PickupFromPhotoRouterImpl$onLaunch$3(this, cob0Var, null), 3);
    }

    public final b R() {
        return (b) this.V.getValue();
    }

    public final o5g S() {
        return (o5g) this.R.getValue();
    }

    public final d T() {
        return (d) this.U.getValue();
    }

    public final void U() {
        if (((cnb0) this.T.getValue()).u() || ((Boolean) e.d(this.H.f).a.getValue()).booleanValue() || this.b0 || R().u() || T().u()) {
            return;
        }
        E(R(), new dnb0(new nob0(this, 7)), new pob0(this), hxx.a);
    }
}
