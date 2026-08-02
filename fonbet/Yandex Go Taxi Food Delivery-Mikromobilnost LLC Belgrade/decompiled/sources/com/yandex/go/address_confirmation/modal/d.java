package com.yandex.go.address_confirmation.modal;

import com.yandex.go.address.models.Address;
import com.yandex.go.address_confirmation.analytics.AddressConfirmationAnalytics$ButtonName;
import com.yandex.go.address_confirmation.analytics.AddressConfirmationAnalytics$DismissType;
import defpackage.a821;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.bvf0;
import defpackage.cbt0;
import defpackage.h85;
import defpackage.hhs0;
import defpackage.jl40;
import defpackage.kat0;
import defpackage.kbt0;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.lat0;
import defpackage.lbt0;
import defpackage.m950;
import defpackage.mat0;
import defpackage.mbe0;
import defpackage.mob0;
import defpackage.nat0;
import defpackage.ny61;
import defpackage.oat0;
import defpackage.pat0;
import defpackage.pav;
import defpackage.pv0;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.qat0;
import defpackage.rat0;
import defpackage.s71;
import defpackage.sat0;
import defpackage.t71;
import defpackage.tat0;
import defpackage.tdp;
import defpackage.tje;
import defpackage.vbt0;
import defpackage.w511;
import defpackage.w6r;
import defpackage.wat0;
import defpackage.wd0;
import defpackage.wor0;
import defpackage.x8t0;
import defpackage.yat0;
import defpackage.ydp;
import defpackage.z81;
import defpackage.zat0;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes12.dex */
public final class d extends ad5 {
    public final wor0 A;
    public final i B;
    public final hhs0 C;
    public final cbt0 D;
    public final wat0 E;
    public final ru.yandex.taxi.preorder.source.sourcepointzone.a F;
    public final a821 G;
    public final kr0 H;
    public final com.yandex.go.address_confirmation.analytics.a I;
    public final w6r J;
    public final mob0 K;
    public final pav L;
    public final ru.yandex.taxi.favorites.address.api.experiment.a M;
    public final ru.yandex.taxi.favorites.address.impl.data.a N;
    public pzt0 O;
    public pzt0 P;
    public final r0 Q;
    public final ah00 x;
    public final a y;
    public final pwy0 z;

    public d(ah00 ah00Var, a aVar, pwy0 pwy0Var, wor0 wor0Var, i iVar, hhs0 hhs0Var, cbt0 cbt0Var, wat0 wat0Var, ru.yandex.taxi.preorder.source.sourcepointzone.a aVar2, a821 a821Var, kr0 kr0Var, com.yandex.go.address_confirmation.analytics.a aVar3, w6r w6rVar, mob0 mob0Var, pav pavVar, ru.yandex.taxi.favorites.address.api.experiment.a aVar4, ru.yandex.taxi.favorites.address.impl.data.a aVar5) {
        super(vbt0.class);
        this.x = ah00Var;
        this.y = aVar;
        this.z = pwy0Var;
        this.A = wor0Var;
        this.B = iVar;
        this.C = hhs0Var;
        this.D = cbt0Var;
        this.E = wat0Var;
        this.F = aVar2;
        this.G = a821Var;
        this.H = kr0Var;
        this.I = aVar3;
        this.J = w6rVar;
        this.K = mob0Var;
        this.L = pavVar;
        this.M = aVar4;
        this.N = aVar5;
        this.Q = bvf0.c(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(d dVar, pv0 pv0Var, ContinuationImpl continuationImpl) {
        SourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1 sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof SourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1) {
            sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1 = (SourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1) continuationImpl;
            int i2 = sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.favorites.address.api.experiment.a aVar = dVar.M;
                    sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.L$0 = pv0Var;
                    sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.label = 1;
                    obj = aVar.a.b(sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.L$0;
                    kotlin.b.b(obj);
                }
                return Boolean.valueOf((((tdp) obj).b || pv0Var.a.getIsFavorite()) ? false : true);
            }
        }
        sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1 = new SourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1(dVar, continuationImpl);
        Object obj2 = sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressConfirmationModalViewPresenter$isSaveAddressEnabled$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf((((tdp) obj2).b || pv0Var.a.getIsFavorite()) ? false : true);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Lg(d dVar, pv0 pv0Var, ContinuationImpl continuationImpl) {
        SourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1 sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1;
        int i;
        dVar.getClass();
        if (continuationImpl instanceof SourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1) {
            sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1 = (SourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1) continuationImpl;
            int i2 = sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.favorites.address.impl.data.a aVar = dVar.N;
                    Address address = pv0Var.a;
                    sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.L$0 = null;
                    sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.L$1 = pv0Var;
                    sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.label = 1;
                    obj = aVar.c(address, sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.L$1;
                    kotlin.b.b(obj);
                }
                return pv0Var.c((Address) obj);
            }
        }
        sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1 = new SourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1(dVar, continuationImpl);
        Object obj3 = sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sourceAddressConfirmationModalViewPresenter$mergeWithNearbyFavorite$1.label;
        if (i != 0) {
        }
        return pv0Var.c((Address) obj3);
    }

    public static final Object Mg(d dVar, AddressConfirmationAnalytics$ButtonName addressConfirmationAnalytics$ButtonName, SuspendLambda suspendLambda) {
        if (!jl40.l((lbt0) dVar.D.a.getValue(), kbt0.a)) {
            return zy11.a;
        }
        com.yandex.go.address_confirmation.analytics.a aVar = dVar.I;
        wat0 wat0Var = dVar.E;
        return aVar.c(addressConfirmationAnalytics$ButtonName, wat0Var.a, wat0Var.b.c, suspendLambda);
    }

    public final void Ng(tat0 tat0Var) {
        if (tat0Var.equals(mat0.a)) {
            pzt0 pzt0Var = this.O;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            pzt0 pzt0Var2 = this.P;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
            }
            tje.N(Jg(), null, null, new SourceAddressConfirmationModalViewPresenter$onConfirmAddressClicked$1(this, null), 3);
            return;
        }
        boolean equals = tat0Var.equals(lat0.a);
        int i = 1;
        wor0 wor0Var = this.A;
        if (equals) {
            tje.N(Jg(), null, null, new SourceAddressConfirmationModalViewPresenter$onChangeAddressClicked$1(this, null), 3);
            boolean z = !jl40.l((lbt0) this.D.a.getValue(), kbt0.a);
            zat0 zat0Var = (zat0) wor0Var.a;
            zat0Var.A((m950) zat0Var.H.get(), new s71(((avj0) ((zuj0) zat0Var.F.get())).h(kyh0.search_source_address_hint), PointType.SOURCE, false, false, false), new yat0(z, zat0Var));
            return;
        }
        if (tat0Var.equals(oat0.a)) {
            ((zat0) wor0Var.a).K.onMyLocationClick();
            return;
        }
        if (tat0Var.equals(qat0.a)) {
            zat0 zat0Var2 = (zat0) wor0Var.a;
            zat0Var2.A((m950) zat0Var2.G.get(), new mbe0(null, true), new h85(4, zat0Var2));
            return;
        }
        boolean equals2 = tat0Var.equals(kat0.a);
        wat0 wat0Var = this.E;
        i iVar = this.B;
        if (equals2) {
            pzt0 pzt0Var3 = this.O;
            if (pzt0Var3 != null) {
                pzt0Var3.a(null);
            }
            pzt0 pzt0Var4 = this.P;
            if (pzt0Var4 != null) {
                pzt0Var4.a(null);
            }
            pv0 pv0Var = (pv0) iVar.i().orElse(null);
            if (pv0Var == null) {
                pv0Var = wat0Var.b.a;
            }
            ((zat0) wor0Var.a).r(new t71(pv0Var, 18));
            return;
        }
        if (tat0Var.equals(nat0.a)) {
            Og(AddressConfirmationAnalytics$DismissType.BackButton);
            return;
        }
        if (tat0Var.equals(sat0.a)) {
            Og(AddressConfirmationAnalytics$DismissType.SystemBack);
            return;
        }
        if (tat0Var.equals(pat0.a)) {
            ((zat0) wor0Var.a).r(new x8t0(i));
            return;
        }
        if (!tat0Var.equals(rat0.a)) {
            w511.b();
            return;
        }
        pv0 pv0Var2 = (pv0) iVar.i().orElse(null);
        if (pv0Var2 == null) {
            pv0Var2 = wat0Var.b.a;
        }
        zat0 zat0Var3 = (zat0) wor0Var.a;
        zat0Var3.A((m950) zat0Var3.P.get(), new ydp(z81.h(pv0Var2.a, null), true, "search", null, 20), new wd0(i, zat0Var3, pv0Var2));
    }

    public final void Og(AddressConfirmationAnalytics$DismissType addressConfirmationAnalytics$DismissType) {
        if (jl40.l((lbt0) this.D.a.getValue(), kbt0.a)) {
            this.I.a(addressConfirmationAnalytics$DismissType);
        }
    }
}
