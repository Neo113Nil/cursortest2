package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.interactor.i0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import defpackage.a2v;
import defpackage.ah00;
import defpackage.ck31;
import defpackage.d2a0;
import defpackage.dib1;
import defpackage.dxu;
import defpackage.fcj0;
import defpackage.fvr;
import defpackage.fyu;
import defpackage.g92;
import defpackage.gxu;
import defpackage.hwc;
import defpackage.hxu;
import defpackage.ixu;
import defpackage.jqr;
import defpackage.jxu;
import defpackage.jym;
import defpackage.khq0;
import defpackage.l141;
import defpackage.lhq0;
import defpackage.mdh;
import defpackage.me31;
import defpackage.mth;
import defpackage.o7r0;
import defpackage.pwy0;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.w511;
import defpackage.w6l0;
import defpackage.x6l0;
import defpackage.z0v;
import defpackage.z6l0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes14.dex */
public final class q {
    public final ck31 a;
    public final o7r0 b;
    public final fyu c;
    public final fvr d;
    public final com.yandex.go.taxi.summary.mobilityhub.mapper.e e;
    public final me31 f;
    public final i0 g;
    public final com.yandex.go.taxi.summary.mobilityhub.interactor.h h;
    public final com.yandex.go.taxi.summary.mobilityhub.interactor.a i;
    public final com.yandex.go.taxi.summary.mobilityhub.interactor.m j;
    public final fcj0 k;
    public final lhq0 l;
    public final d2a0 m;
    public final ru.yandex.taxi.masstransit.paymentcards.d n;
    public final com.yandex.go.route.interactor.b o;
    public final com.yandex.go.payments.data.p p;
    public final jym q;
    public final dxu r;
    public final pwy0 s;
    public final ah00 t;
    public final l141 u;
    public final a2v v;

    public q(tt2 tt2Var, ck31 ck31Var, o7r0 o7r0Var, fyu fyuVar, fvr fvrVar, com.yandex.go.taxi.summary.mobilityhub.mapper.e eVar, me31 me31Var, i0 i0Var, com.yandex.go.taxi.summary.mobilityhub.interactor.h hVar, com.yandex.go.taxi.summary.mobilityhub.interactor.a aVar, com.yandex.go.taxi.summary.mobilityhub.interactor.m mVar, fcj0 fcj0Var, lhq0 lhq0Var, d2a0 d2a0Var, ru.yandex.taxi.masstransit.paymentcards.d dVar, com.yandex.go.route.interactor.b bVar, com.yandex.go.payments.data.p pVar, jym jymVar, dxu dxuVar, pwy0 pwy0Var, ah00 ah00Var, l141 l141Var, a2v a2vVar) {
        this.a = ck31Var;
        this.b = o7r0Var;
        this.c = fyuVar;
        this.d = fvrVar;
        this.e = eVar;
        this.f = me31Var;
        this.g = i0Var;
        this.h = hVar;
        this.i = aVar;
        this.j = mVar;
        this.k = fcj0Var;
        this.l = lhq0Var;
        this.m = d2a0Var;
        this.n = dVar;
        this.o = bVar;
        this.p = pVar;
        this.q = jymVar;
        this.r = dxuVar;
        this.s = pwy0Var;
        this.t = ah00Var;
        this.u = l141Var;
        this.v = a2vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final jxu a(q qVar, khq0 khq0Var) {
        HubOfferType hubOfferType;
        qVar.getClass();
        HubOfferType hubOfferType2 = khq0Var.c;
        List list = khq0Var.k;
        if (hubOfferType2 != HubOfferType.TAXI && hubOfferType2 != HubOfferType.MULTIMODAL_TAXI_TRANSPORT) {
            if (hubOfferType2 == HubOfferType.MULTIMODAL) {
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((z6l0) it.next()) instanceof x6l0) {
                        }
                    }
                }
            }
            hubOfferType = khq0Var.c;
            if (hubOfferType != HubOfferType.SCOOTERS && hubOfferType != HubOfferType.SCOOTER_MULTIMODAL) {
                if (hubOfferType == HubOfferType.MULTIMODAL) {
                    List list3 = list;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            if (((z6l0) it2.next()) instanceof w6l0) {
                            }
                        }
                    }
                }
                return gxu.a;
            }
            return hxu.a;
        }
        if (khq0Var.b != null) {
            return ixu.a;
        }
        hubOfferType = khq0Var.c;
        if (hubOfferType != HubOfferType.SCOOTERS) {
            if (hubOfferType == HubOfferType.MULTIMODAL) {
            }
            return gxu.a;
        }
        return hxu.a;
    }

    public static final tpr b(q qVar, boolean z, HubOfferType hubOfferType, HubLeadingItemKind hubLeadingItemKind) {
        VerticalHubV2UiStateInteractor$PaymentCardKind verticalHubV2UiStateInteractor$PaymentCardKind;
        qVar.getClass();
        int i = hubLeadingItemKind == null ? -1 : a.b[hubLeadingItemKind.ordinal()];
        int i2 = 2;
        if (i == -1) {
            int i3 = hubOfferType != null ? a.a[hubOfferType.ordinal()] : -1;
            verticalHubV2UiStateInteractor$PaymentCardKind = i3 != 1 ? i3 != 2 ? VerticalHubV2UiStateInteractor$PaymentCardKind.NONE : VerticalHubV2UiStateInteractor$PaymentCardKind.TRANSPORT_CARD : VerticalHubV2UiStateInteractor$PaymentCardKind.MONEY;
        } else if (i == 1) {
            verticalHubV2UiStateInteractor$PaymentCardKind = VerticalHubV2UiStateInteractor$PaymentCardKind.MONEY;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            verticalHubV2UiStateInteractor$PaymentCardKind = VerticalHubV2UiStateInteractor$PaymentCardKind.TRANSPORT_CARD;
        }
        int i4 = a.c[verticalHubV2UiStateInteractor$PaymentCardKind.ordinal()];
        if (i4 == 1) {
            return new k(qVar.p.b(), z, qVar);
        }
        if (i4 == 2) {
            return kotlinx.coroutines.flow.e.X(qVar.o.k(), new VerticalHubV2UiStateInteractor$paymentCardFlow$$inlined$flatMapLatest$1(null, qVar, z));
        }
        if (i4 == 3) {
            return new g92(i2, z0v.a);
        }
        w511.b();
        return null;
    }

    public final jqr c() {
        int i = 3;
        m0 m0Var = new m0(this.i.b(), this.k.o(), new VerticalHubV2UiStateInteractor$addressesUiStateFlow$1(3, null));
        tpr a = this.j.a();
        me31 me31Var = this.f;
        tpr t = kotlinx.coroutines.flow.e.t(new m0(me31Var.e, kotlinx.coroutines.flow.e.d(this.d.a), new VerticalHubV2UiStateInteractor$actionButtonsStateFlow$1(3, null)));
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new m0(this.g.f(), this.s.a(), new VerticalHubV2UiStateInteractor$hubOffersStateFlow$1(3, null)), new VerticalHubV2UiStateInteractor$hubOffersStateFlow$$inlined$flatMapLatest$1(this, null));
        sjh sjhVar = uyj.a;
        return new jqr(new p(new mth(new j0(null, new n(new tpr[]{m0Var, a, t, kotlinx.coroutines.flow.e.F(X, mdh.b), me31Var.e, !this.u.a() ? new g92(2, new hwc(0)) : kotlinx.coroutines.flow.e.t(new m0(com.yandex.go.coroutines.b.d(new c(dib1.c(this.t)), new VerticalHubV2UiStateInteractor$compassButtonStateFlow$$inlined$start$1(this, null)), me31Var.e, new VerticalHubV2UiStateInteractor$compassButtonStateFlow$3(3, null)))}), new VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$withPreviousEmit$1(3, null)), 6), this), new VerticalHubV2UiStateInteractor$uiStateFlow$3(this, null), i);
    }
}
