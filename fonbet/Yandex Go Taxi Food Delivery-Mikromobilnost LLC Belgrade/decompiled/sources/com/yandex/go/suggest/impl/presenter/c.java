package com.yandex.go.suggest.impl.presenter;

import android.content.Context;
import com.yandex.go.address.models.Address;
import com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain.v;
import com.yandex.go.suggest.impl.analytics.FindInGoSearchAnalytics$AddressChangedReason;
import com.yandex.go.suggest.impl.analytics.FindInGoSearchAnalytics$ScreenState;
import com.yandex.go.suggest.impl.data.experiments.SuperappSuggestExperiment;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import defpackage.ad5;
import defpackage.afw0;
import defpackage.c1x0;
import defpackage.ca01;
import defpackage.da01;
import defpackage.dxp0;
import defpackage.ea01;
import defpackage.egz;
import defpackage.exu0;
import defpackage.f8v0;
import defpackage.gfw0;
import defpackage.gls;
import defpackage.j83;
import defpackage.jl40;
import defpackage.k7x0;
import defpackage.lag;
import defpackage.m950;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.o430;
import defpackage.ogw0;
import defpackage.pgw0;
import defpackage.po21;
import defpackage.pse;
import defpackage.pv0;
import defpackage.pwy0;
import defpackage.r7r;
import defpackage.rfw0;
import defpackage.s7r;
import defpackage.s9w0;
import defpackage.swp0;
import defpackage.szi;
import defpackage.tje;
import defpackage.u7r;
import defpackage.uzi;
import defpackage.w4l0;
import defpackage.w511;
import defpackage.wa90;
import defpackage.wpy0;
import defpackage.x4e;
import defpackage.y9y0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;
import ru.yandex.taxi.address.experiment.d;
import ru.yandex.taxi.preorder.source.userposition.e;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;

/* loaded from: classes8.dex */
public final class c extends ad5 {
    public final w4l0 A;
    public final pgw0 B;
    public final d C;
    public final com.yandex.go.suggest.impl.data.a D;
    public final gfw0 E;
    public final com.yandex.go.suggest.impl.data.flex.variables.b F;
    public final u7r G;
    public final s9w0 H;
    public final zuj0 I;
    public final po21 J;
    public final ogw0 K;
    public final v L;
    public final pwy0 M;
    public final f8v0 N;
    public final wa90 O;
    public final k7x0 P;
    public final exu0 Q;
    public final afw0 R;
    public final String S;
    public Address T;
    public final ea01 U;
    public final com.yandex.go.suggest.impl.router.c x;
    public final rfw0 y;
    public final Context z;

    public c(swp0 swp0Var, com.yandex.go.suggest.impl.router.c cVar, rfw0 rfw0Var, Context context, w4l0 w4l0Var, pgw0 pgw0Var, d dVar, com.yandex.go.suggest.impl.data.a aVar, gfw0 gfw0Var, com.yandex.go.suggest.impl.data.flex.variables.b bVar, u7r u7rVar, s9w0 s9w0Var, zuj0 zuj0Var, po21 po21Var, ogw0 ogw0Var, v vVar, pwy0 pwy0Var, f8v0 f8v0Var, wa90 wa90Var, k7x0 k7x0Var, exu0 exu0Var, afw0 afw0Var) {
        super(gls.class);
        this.x = cVar;
        this.y = rfw0Var;
        this.z = context;
        this.A = w4l0Var;
        this.B = pgw0Var;
        this.C = dVar;
        this.D = aVar;
        this.E = gfw0Var;
        this.F = bVar;
        this.G = u7rVar;
        this.H = s9w0Var;
        this.I = zuj0Var;
        this.J = po21Var;
        this.K = ogw0Var;
        this.L = vVar;
        this.M = pwy0Var;
        this.N = f8v0Var;
        this.O = wa90Var;
        this.P = k7x0Var;
        this.Q = exu0Var;
        this.R = afw0Var;
        this.S = swp0Var.a();
        dxp0 dxp0Var = f8v0Var.f;
        this.U = new ea01(dxp0Var != null ? dxp0Var.f() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(c cVar, Address address, String str, ContinuationImpl continuationImpl) {
        FullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1 fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1;
        int i;
        u7r u7rVar;
        Map map;
        FindInGoSearchAnalytics$AddressChangedReason findInGoSearchAnalytics$AddressChangedReason;
        r7r r7rVar;
        String str2;
        cVar.getClass();
        if (continuationImpl instanceof FullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1) {
            fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1 = (FullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1) continuationImpl;
            int i2 = fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.label = i2 - Integer.MIN_VALUE;
                Object obj = fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(address, cVar.T)) {
                        return zy11Var;
                    }
                    u7r u7rVar2 = cVar.G;
                    FindInGoSearchAnalytics$AddressChangedReason findInGoSearchAnalytics$AddressChangedReason2 = cVar.T == null ? FindInGoSearchAnalytics$AddressChangedReason.Initial : FindInGoSearchAnalytics$AddressChangedReason.AddressChanged;
                    r7r r7rVar2 = new r7r(str, address.d(), new s7r(address.B().a, address.B().b));
                    LinkedHashMap linkedHashMap = cVar.E.e;
                    po21 po21Var = cVar.J;
                    fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$0 = null;
                    fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$1 = null;
                    fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$2 = u7rVar2;
                    fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$3 = findInGoSearchAnalytics$AddressChangedReason2;
                    fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$4 = r7rVar2;
                    fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$5 = linkedHashMap;
                    fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.label = 1;
                    Object h = ((e) po21Var).h(fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1);
                    if (h == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    u7rVar = u7rVar2;
                    obj = h;
                    map = linkedHashMap;
                    findInGoSearchAnalytics$AddressChangedReason = findInGoSearchAnalytics$AddressChangedReason2;
                    r7rVar = r7rVar2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    map = (Map) fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$5;
                    r7rVar = (r7r) fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$4;
                    findInGoSearchAnalytics$AddressChangedReason = (FindInGoSearchAnalytics$AddressChangedReason) fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$3;
                    u7rVar = (u7r) fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.L$2;
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                double d = mo21Var.a;
                double d2 = mo21Var.b;
                MapBuilder mapBuilder = new MapBuilder();
                mapBuilder.put("lat", Double.valueOf(d));
                MapBuilder w = x4e.w(d2, mapBuilder, "lon");
                str2 = cVar.S;
                u7rVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(CRLReasonCodeExtension.REASON, findInGoSearchAnalytics$AddressChangedReason.getEventValue());
                hashMap.put("address", r7rVar.d);
                hashMap.put("current_location", w);
                hashMap.put("trace_ids", map);
                if (str2 != null) {
                    hashMap.put("search_session_id", str2);
                }
                u7rVar.a.a("FindInGoSearch.Address.Changed", hashMap, 2, new HashMap());
                return zy11Var;
            }
        }
        fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1 = new FullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1(cVar, continuationImpl);
        Object obj2 = fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullscreenSuperappSuggestPresenter$sendAddressChangedAnalytics$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj2;
        double d3 = mo21Var2.a;
        double d22 = mo21Var2.b;
        MapBuilder mapBuilder2 = new MapBuilder();
        mapBuilder2.put("lat", Double.valueOf(d3));
        MapBuilder w2 = x4e.w(d22, mapBuilder2, "lon");
        str2 = cVar.S;
        u7rVar.getClass();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(CRLReasonCodeExtension.REASON, findInGoSearchAnalytics$AddressChangedReason.getEventValue());
        hashMap2.put("address", r7rVar.d);
        hashMap2.put("current_location", w2);
        hashMap2.put("trace_ids", map);
        if (str2 != null) {
        }
        u7rVar.a.a("FindInGoSearch.Address.Changed", hashMap2, 2, new HashMap());
        return zy11Var2;
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.U.b = null;
    }

    public final void Lg(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        ca01 ca01Var;
        Bg(fullscreenSuperappSuggestModalView);
        com.yandex.go.suggest.impl.data.a aVar = this.D;
        fullscreenSuperappSuggestModalView.setDestinationInput(aVar.b().a);
        ea01 ea01Var = this.U;
        SuperappSuggestExperiment.SearchTrailButton.TextChangeBehaviour textChangeBehaviour = ea01Var.a;
        int i = textChangeBehaviour == null ? -1 : da01.a[textChangeBehaviour.ordinal()];
        if (i == -1) {
            ca01Var = o430.H;
        } else if (i == 1) {
            ca01Var = new egz(fullscreenSuperappSuggestModalView);
        } else if (i == 2) {
            ca01Var = new c1x0(fullscreenSuperappSuggestModalView);
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            ca01Var = new wpy0(fullscreenSuperappSuggestModalView);
        }
        ea01Var.b = ca01Var;
        String str = aVar.b().a;
        ca01 ca01Var2 = ea01Var.b;
        if (ca01Var2 != null) {
            ca01Var2.h(str);
        }
        tje.N(Jg(), new pse("FullscreenSuperappSuggestPresenter.uiState"), null, new FullscreenSuperappSuggestPresenter$attachView$1(this, fullscreenSuperappSuggestModalView, null), 2);
    }

    public final void Mg() {
        String str = this.D.b().a;
        LinkedHashMap linkedHashMap = this.E.e;
        u7r u7rVar = this.G;
        u7rVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("user_input", str);
        hashMap.put("trace_ids", linkedHashMap);
        u7rVar.a.a("FindInGoSearch.SuggestSearch.ClearInput.Tapped", hashMap, 1, new HashMap());
    }

    public final void Ng() {
        pv0 pv0Var;
        Object sziVar;
        gfw0 gfw0Var = this.E;
        LinkedHashMap linkedHashMap = gfw0Var.e;
        FindInGoSearchAnalytics$ScreenState findInGoSearchAnalytics$ScreenState = gfw0Var.d ? FindInGoSearchAnalytics$ScreenState.Failed : gfw0Var.c ? FindInGoSearchAnalytics$ScreenState.Loading : FindInGoSearchAnalytics$ScreenState.Loaded;
        List list = this.F.f;
        u7r u7rVar = this.G;
        u7rVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("trace_ids", linkedHashMap);
        hashMap.put("screen_state", findInGoSearchAnalytics$ScreenState.getEventValue());
        String str = this.S;
        if (str != null) {
            hashMap.put("search_session_id", str);
        }
        if (list != null) {
            hashMap.put("loading_sections", list);
        }
        u7rVar.a.a("FindInGoSearch.MapButton.Tapped", hashMap, 2, new HashMap());
        com.yandex.go.suggest.impl.router.d dVar = this.x.a;
        lag lagVar = dVar.L;
        y9y0 y9y0Var = dVar.K;
        m950 m950Var = (m950) lagVar.get();
        Address k = y9y0Var.k();
        if (k != null) {
            pv0Var = new pv0(k, null, null, null, null, null, null, null, 1022);
        } else {
            Address h = y9y0Var.h();
            pv0Var = h != null ? new pv0(h, null, null, null, null, null, null, null, 1022) : null;
        }
        if (pv0Var != null) {
            Address address = pv0Var.a;
            sziVar = new uzi(pv0Var, RouteSelectorOpenReason.ADDRESS);
        } else {
            sziVar = new szi(null, null, 3);
        }
        dVar.A(m950Var, sziVar, new j83(7, dVar));
    }
}
