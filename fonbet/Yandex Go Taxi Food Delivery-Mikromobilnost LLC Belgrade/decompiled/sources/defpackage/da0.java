package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import com.yandex.go.agreement.trackable.mvp.TrackableAcceptanceModalView;
import com.yandex.go.chargers.misc.popup.ChargersPopupModalView;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.inapp_calls.repository.defaultoutgoingcall.g;
import com.yandex.go.inapp_calls.ui.select.CallTypeSelectModalView;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigator.gas_stations.filters.GasStationsFiltersModalView;
import com.yandex.go.parks.nearest.presentation.ui.TaxiNearestZoneErrorModalView;
import com.yandex.go.payments.api.card.CardScrollMode;
import com.yandex.go.payments.cards.nfc.navigation.a;
import com.yandex.go.payments.cards.ui.add.AddCardModalView;
import com.yandex.go.payments.cards.verification.confirm.ConfirmCardModalView;
import com.yandex.go.payments.cards.verification.d3s.Card3dsModalView;
import com.yandex.go.places.address.loader.impl.modal.PlacesAddressLoaderModalView;
import com.yandex.go.places.impl.ui.filters.OrganizationsFiltersModalView;
import com.yandex.go.places.impl.ui.payments.info.PaymentsInfoModalView;
import com.yandex.go.places.impl.ui.sorting.OrganizationsSortingModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.DiscountsAddPromoCodeModalView;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.add.b;
import com.yandex.go.promocodes.base.impl.discounts.presentation.ui.details.DiscountsPromoCodeDetailsModalView;
import com.yandex.go.promocodes.base.impl.ui.share.PromoCodeSharingModalView;
import com.yandex.go.scooters.background.ScootersBackgroundModalView;
import com.yandex.go.settings.email.EmailModalView;
import com.yandex.go.settings.email.c;
import com.yandex.go.superapp.web.modal.WebModalViewContent;
import com.yandex.go.taxi.order.cancel.reasons.view.v2.CancelReasonsV2View;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.altpins.source.modal.AlternativeSourceModalView;
import ru.yandex.taxi.altpins.source.modal.e;
import ru.yandex.taxi.eatskit.dto.ServiceHeaderMode;
import ru.yandex.taxi.eatskit.widget.splash.EatsKitSplash$ShimmeringSplash;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.scooters.presentation.ontheway.cancel.ScootersCancelRidingModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.themes.dto.WebViewThemeChangeMode;
import ru.yandex.taxi.utils.d;
import ru.yandex.taxi.widget.dialog.Toggleable;

/* loaded from: classes13.dex */
public final class da0 extends m230 {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;
    public final Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(Context context, d dVar, w030 w030Var, zuj0 zuj0Var) {
        super(null);
        this.E = 21;
        this.F = w030Var;
        this.G = zuj0Var;
        this.H = new ymu(9, context, dVar);
    }

    @Override // defpackage.h55
    public void I(Object obj) {
        switch (this.E) {
            case 7:
                zf zfVar = ((yy80) this.G).e;
                zfVar.getClass();
                zfVar.a.a("DebtsOrderHistory.Closed", new HashMap(), 1, new HashMap());
                break;
            case 19:
                xzm0 xzm0Var = (xzm0) this.H;
                xzm0Var.getClass();
                xzm0Var.a = vzm0.a;
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
            case 0:
                return (w030) this.F;
            case 1:
                return (w030) this.F;
            case 2:
                return (w030) this.F;
            case 3:
                return (w030) this.F;
            case 4:
                return (w030) this.F;
            case 5:
                return (w030) this.F;
            case 6:
                return (w030) this.F;
            case 7:
                return (w030) this.F;
            case 8:
                return (w030) this.F;
            case 9:
                return (w030) this.F;
            case 10:
                return (w030) this.F;
            case 11:
                return (w030) this.F;
            case 12:
                return (w030) this.F;
            case 13:
                return ((i130) this.F).a();
            case 14:
                return (w030) this.F;
            case 15:
                return (w030) this.F;
            case 16:
                return (w030) this.F;
            case 17:
                return (w030) this.F;
            case 18:
                return (w030) this.F;
            case 19:
                return (w030) this.F;
            case 20:
                return (w030) this.F;
            case 21:
                return (w030) this.F;
            case 22:
                return (w030) this.F;
            default:
                return ((i130) this.F).a();
        }
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v153, types: [T, android.view.View$OnAttachStateChangeListener, ru.yandex.taxi.scooters.presentation.ontheway.cancel.ScootersCancelRidingRouter$provideModalView$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        String str = null;
        int i = 23;
        int i2 = 4;
        int i3 = 13;
        int i4 = 9;
        int i5 = 7;
        int i6 = 10;
        int i7 = 25;
        int i8 = 20;
        int i9 = 8;
        final int i10 = 1;
        final int i11 = 0;
        switch (this.E) {
            case 0:
                ma0 ma0Var = (ma0) obj;
                fva0 fva0Var = (fva0) this.G;
                PerformanceAnalytics$Type performanceAnalytics$Type = PerformanceAnalytics$Type.Inflate;
                fva0.f(fva0Var, "AddCardModalView", performanceAnalytics$Type, 0L, 4);
                z90 z90Var = (z90) this.H;
                xqw xqwVar = ma0Var.a;
                g191 g191Var = new g191(this);
                CardScrollMode cardScrollMode = ma0Var.b;
                aa0 aa0Var = z90Var.a;
                AddCardModalView addCardModalView = new AddCardModalView((Context) aa0Var.a.get(), (lb0) aa0Var.b.get(), (ney) aa0Var.c.get(), (lx4) aa0Var.d.get(), (s760) aa0Var.e.get(), (dcp0) aa0Var.f.get(), (x80) aa0Var.g.get(), (a) aa0Var.h.get(), (hp51) aa0Var.i.get(), (b7r0) aa0Var.j.get(), g191Var, xqwVar, cardScrollMode);
                fva0.c(fva0Var, addCardModalView, "AddCardModalView", performanceAnalytics$Type, 8);
                return addCardModalView;
            case 1:
                xx1 xx1Var = (xx1) obj;
                wx1 wx1Var = (wx1) this.G;
                v920 v920Var = (v920) this.H;
                ru.yandex.taxi.altpins.source.modal.d dVar = new ru.yandex.taxi.altpins.source.modal.d(new g191(this), (ru.yandex.taxi.altpins.source.modal.a) v920Var.a, xx1Var, (pwy0) v920Var.b, (e) v920Var.c, (kr0) v920Var.w, (tg9) v920Var.x, (yfa) v920Var.y);
                sz1 sz1Var = xx1Var.b;
                yx1 yx1Var = wx1Var.a;
                return new AlternativeSourceModalView((Context) ((xvf0) yx1Var.a).get(), (bts0) ((xvf0) yx1Var.b).get(), (a3v) ((xvf0) yx1Var.c).get(), (ars0) ((i5s0) yx1Var.g).get(), (ru.yandex.taxi.layers.presentation.walkroute.simple.a) ((xvf0) yx1Var.d).get(), (z541) ((xvf0) yx1Var.e).get(), (ru.yandex.taxi.altpins.source.overlay.a) ((aj0) yx1Var.h).get(), dVar, sz1Var, (gcc0) ((xvf0) yx1Var.f).get());
            case 2:
                hkv hkvVar = (hkv) obj;
                ok7 ok7Var = (ok7) this.G;
                rk7 rk7Var = (rk7) this.H;
                hh5 hh5Var = new hh5(i4, this);
                gkv gkvVar = hkvVar.b;
                if (gkvVar == null) {
                    gkvVar = new gkv(null, null, null);
                }
                gkv gkvVar2 = gkvVar;
                mf1 mf1Var = hkvVar.d;
                oo2 oo2Var = rk7Var.a;
                qk7 qk7Var = new qk7(gkvVar2, hh5Var, mf1Var, (q) ((xvf0) oo2Var.a).get(), (g) ((swo0) oo2Var.b).get(), (tk7) ((of7) oo2Var.c).get(), (pwy0) ((xvf0) oo2Var.w).get(), (njv) ((xvf0) oo2Var.x).get());
                mc mcVar = ok7Var.a;
                return new CallTypeSelectModalView((Context) mcVar.a.get(), (ip11) mcVar.b.get(), qk7Var);
            case 3:
                iy7 iy7Var = (iy7) this.H;
                by7 by7Var = (by7) this.G;
                sr4 sr4Var = new sr4(i, this);
                m2v m2vVar = by7Var.a;
                com.yandex.go.taxi.order.cancel.reasons.view.v2.d dVar2 = new com.yandex.go.taxi.order.cancel.reasons.view.v2.d((com.yandex.go.taxi.order.cancel.reasons.interactor.a) ((kj7) m2vVar.a).get(), (yx7) ((yc) m2vVar.b).get(), (bx7) ((dx7) m2vVar.c).get(), (oxu0) ((xwf) m2vVar.w).get(), sr4Var);
                m2v m2vVar2 = iy7Var.a;
                return new CancelReasonsV2View((pav) ((xwf) m2vVar2.a).get(), (Context) ((n3w) m2vVar2.b).a, (exu0) ((xwf) m2vVar2.c).get(), (pwy0) ((xwf) m2vVar2.w).get(), dVar2);
            case 4:
                j88 j88Var = (j88) obj;
                fva0 fva0Var2 = (fva0) this.G;
                PerformanceAnalytics$Type performanceAnalytics$Type2 = PerformanceAnalytics$Type.Inflate;
                fva0.f(fva0Var2, "Card3dsModalView", performanceAnalytics$Type2, 0L, 4);
                h88 h88Var = (h88) this.H;
                u88 u88Var = j88Var.a;
                hh5 hh5Var2 = new hh5(17, this);
                CardScrollMode cardScrollMode2 = j88Var.b;
                oo2 oo2Var2 = h88Var.a;
                Card3dsModalView card3dsModalView = new Card3dsModalView((Context) ((xvf0) oo2Var2.a).get(), (v32) ((lf) oo2Var2.b).get(), (ney) ((xvf0) oo2Var2.c).get(), (dcp0) ((xvf0) oo2Var2.w).get(), (b7r0) ((xvf0) oo2Var2.x).get(), hh5Var2, u88Var, cardScrollMode2);
                fva0.c(fva0Var2, card3dsModalView, "Card3dsModalView", performanceAnalytics$Type2, 8);
                return card3dsModalView;
            case 5:
                sma smaVar = (sma) this.H;
                vma vmaVar = new vma((ana) ((kj7) ((wma) this.G).a.a).get(), (uma) obj, new c29(14, this));
                zz7 zz7Var = smaVar.a;
                return new ChargersPopupModalView((pav) zz7Var.a.get(), (Context) zz7Var.b.get(), vmaVar);
            case 6:
                h3e h3eVar = (h3e) obj;
                fva0 fva0Var3 = (fva0) this.G;
                PerformanceAnalytics$Type performanceAnalytics$Type3 = PerformanceAnalytics$Type.Inflate;
                fva0.f(fva0Var3, "ConfirmCardModalView", performanceAnalytics$Type3, 0L, 4);
                e3e e3eVar = (e3e) this.H;
                erw erwVar = h3eVar.a;
                boolean z = h3eVar.b;
                io9 io9Var = new io9(this);
                CardScrollMode cardScrollMode3 = h3eVar.c;
                yuf0 yuf0Var = e3eVar.a;
                ConfirmCardModalView confirmCardModalView = new ConfirmCardModalView((Context) ((xvf0) yuf0Var.a).get(), (ney) ((xvf0) yuf0Var.b).get(), (dcp0) ((xvf0) yuf0Var.c).get(), (k3e) ((l3e) yuf0Var.d).get(), (b3e) ((xvf0) yuf0Var.e).get(), (b7r0) ((xvf0) yuf0Var.f).get(), z, io9Var, erwVar, cardScrollMode3);
                fva0.c(fva0Var3, confirmCardModalView, "ConfirmCardModalView", performanceAnalytics$Type3, 8);
                return confirmCardModalView;
            case 7:
                lug lugVar = (lug) obj;
                wwf wwfVar = (wwf) this.H;
                rvx0 rvx0Var = (rvx0) wwfVar.b;
                Object c = rvx0Var.a.a.c();
                if (evu0.J(((b660) c).b)) {
                    c = null;
                }
                b660 b660Var = (b660) c;
                String str2 = b660Var != null ? b660Var.b : null;
                if (str2 != null) {
                    Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
                    rvx0Var.a(buildUpon);
                    str = buildUpon.build().toString();
                }
                if (str == null) {
                    str = rvx0Var.b();
                }
                String str3 = str;
                j0g j0gVar = new j0g(wwfVar, lugVar);
                zxs0 zxs0Var = (zxs0) wwfVar.a;
                ServiceHeaderMode serviceHeaderMode = ServiceHeaderMode.HEADER_WITH_LOGO;
                i7w0 i7w0Var = i7w0.b;
                r400 r400Var = ma41.C4;
                EmptyList emptyList = EmptyList.a;
                h3y h3yVar = (h3y) zxs0Var.a;
                WebModalViewContent webModalViewContent = new WebModalViewContent(((c0g) ((i6r) h3yVar.get())).w, com.yandex.go.superapp.web.view.a.a((com.yandex.go.superapp.web.view.a) zxs0Var.b, WebViewThemeChangeMode.PREFERS_COLOR_SCHEME, null, null, null, 30));
                i6r i6rVar = (i6r) h3yVar.get();
                uh41 uh41Var = new uh41(webModalViewContent, str3, true, false, j0gVar, 3, false, null, EatsKitSplash$ShimmeringSplash.WebStyle, null, "", emptyList, serviceHeaderMode);
                i6rVar.getClass();
                i7w0Var.getClass();
                return new apf(i6rVar, uh41Var, i7w0Var, r400Var).B();
            case 8:
                epj epjVar = (epj) obj;
                String str4 = epjVar.a;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = str4;
                bpj bpjVar = (bpj) this.G;
                ipj ipjVar = (ipj) this.H;
                List list = epjVar.b;
                qnh qnhVar = new qnh(this);
                oo2 oo2Var3 = ipjVar.a;
                return new DiscountsAddPromoCodeModalView((Context) bpjVar.a.a.get(), str5, new b((tse) ((xvf0) oo2Var3.a).get(), (xjg) ((nma) oo2Var3.b).get(), (com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d) ((npe0) oo2Var3.c).get(), (com.yandex.go.promocodes.base.impl.discounts.domain.interactors.a) ((ove) oo2Var3.w).get(), (rpj) ((xsi) oo2Var3.x).get(), str5, list, qnhVar));
            case 9:
                brj brjVar = (brj) obj;
                yqj yqjVar = (yqj) this.G;
                erj erjVar = (erj) this.H;
                wlf0 wlf0Var = brjVar.a;
                cmf0 cmf0Var = brjVar.b;
                List list2 = brjVar.c;
                qnh qnhVar2 = new qnh(this);
                aq0 aq0Var = erjVar.a;
                drj drjVar = new drj((Context) ((xvf0) aq0Var.a).get(), (tse) ((xvf0) aq0Var.b).get(), (k3c) ((qzb) aq0Var.g).get(), (j0g) ((nma) aq0Var.h).get(), (vpj) ((xvf0) aq0Var.c).get(), (com.yandex.go.promocodes.base.impl.promo_codes.domain.interactors.d) ((xvf0) aq0Var.d).get(), (c4r0) ((xvf0) aq0Var.e).get(), (oy80) ((zlf0) aq0Var.i).get(), (sno0) ((sxn0) aq0Var.j).get(), (com.yandex.go.mainscreen.superapp.impl.foundation.domain.g) ((xvf0) aq0Var.f).get(), (krj) ((xsi) aq0Var.k).get(), wlf0Var, list2, cmf0Var, qnhVar2);
                zqj zqjVar = yqjVar.a;
                return new DiscountsPromoCodeDetailsModalView((Context) zqjVar.a.get(), (tse) zqjVar.b.get(), (ru.yandex.taxi.widget.utils.e) zqjVar.c.get(), drjVar);
            case 10:
                wrn wrnVar = (wrn) this.G;
                esn esnVar = (esn) this.H;
                mum mumVar = new mum(this);
                hzk hzkVar = esnVar.a;
                return new EmailModalView((Context) wrnVar.a.a.get(), new com.yandex.go.settings.email.a(mumVar, (c) ((can) hzkVar.a).get(), (jt4) ((xvf0) hzkVar.b).get()));
            case 11:
                ous ousVar = (ous) this.H;
                sus susVar = (sus) this.G;
                jln jlnVar = new jln(i7, this);
                wrr wrrVar = susVar.a;
                rus rusVar = new rus((tus) ((xvf0) wrrVar.b).get(), (ru.yandex.taxi.design.utils.b) ((xvf0) wrrVar.c).get(), (pwy0) ((xvf0) wrrVar.w).get(), jlnVar, (ux6) ((xvf0) wrrVar.x).get(), (rx6) ((xvf0) wrrVar.y).get(), (qb60) ((xvf0) wrrVar.z).get(), (com.yandex.go.navigator.gas_stations.analytics.a) ((w1g) wrrVar.A).get());
                zz7 zz7Var2 = ousVar.a;
                return new GasStationsFiltersModalView((Context) zz7Var2.a.get(), rusVar, (ip11) zz7Var2.b.get());
            case 12:
                c61 c61Var = AddressSearchView.Companion;
                at20 at20Var = (at20) this.H;
                at20Var.getClass();
                wyf a = ((g0j) at20Var.a).a(new h0j(tyi.a, "discovery_masstransit", false), new ddf(RoutePointType.TRANSPORT_A), new r51(SourcePicker.B_FROM_SUMMARY), m3o.b, (wu30) at20Var.b);
                c61Var.getClass();
                b61 b61Var = new b61(a);
                b61Var.n = ((avj0) ((zuj0) this.G)).h(kyh0.search_source_address_hint);
                b61Var.u = PointType.SOURCE;
                b61Var.q = new uhx(18, this);
                AddressSearchModalView.Companion.getClass();
                AddressSearchModalView a2 = p51.a(b61Var);
                a2.setOnAddressPickedListener(new x71(i5, this));
                return a2;
            case 13:
                final hl50 hl50Var = (hl50) obj;
                zwx0 zwx0Var = (zwx0) this.G;
                String str6 = hl50Var.a;
                String str7 = hl50Var.b;
                String str8 = hl50Var.c;
                Runnable runnable = new Runnable() { // from class: il50
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i11;
                        hl50 hl50Var2 = hl50Var;
                        switch (i12) {
                            case 0:
                                hl50Var2.f.run();
                                break;
                            default:
                                hl50Var2.e.run();
                                break;
                        }
                    }
                };
                Runnable runnable2 = new Runnable() { // from class: il50
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12 = i10;
                        hl50 hl50Var2 = hl50Var;
                        switch (i12) {
                            case 0:
                                hl50Var2.f.run();
                                break;
                            default:
                                hl50Var2.e.run();
                                break;
                        }
                    }
                };
                sd30 sd30Var = new sd30(i2, this, hl50Var);
                me0 me0Var = (me0) zwx0Var;
                me0Var.getClass();
                return new TaxiNearestZoneErrorModalView(me0Var.a, runnable, sd30Var, str6, str7, str8, runnable2);
            case 14:
                om80 om80Var = (om80) this.G;
                sm80 sm80Var = (sm80) this.H;
                xx20 xx20Var = ((qm80) obj).a;
                fl10 fl10Var = new fl10(this);
                dt20 dt20Var = sm80Var.a;
                rm80 rm80Var = new rm80((jio) ((xvf0) dt20Var.b).get(), (hit) ((xvf0) dt20Var.c).get(), (um80) ((vm80) dt20Var.w).get(), (com.yandex.go.places.impl.domain.interactors.a) ((xvf0) dt20Var.x).get(), xx20Var, fl10Var);
                gaz gazVar = om80Var.a;
                return new OrganizationsFiltersModalView((Context) gazVar.a.get(), (tt2) gazVar.b.get(), (ru.yandex.taxi.widget.utils.e) gazVar.c.get(), rm80Var);
            case 15:
                vp80 vp80Var = (vp80) this.G;
                zp80 zp80Var = (zp80) this.H;
                aq80 aq80Var = new aq80(this);
                yx20 yx20Var = ((xp80) obj).a;
                zz7 zz7Var3 = zp80Var.a;
                return new OrganizationsSortingModalView((Context) ((x4g) vp80Var.a.a).get(), new yp80((jio) zz7Var3.a.get(), (com.yandex.go.places.impl.domain.interactors.organizations.g) zz7Var3.b.get(), yx20Var, aq80Var));
            case 16:
                ena0 ena0Var = (ena0) obj;
                return new PaymentsInfoModalView((Context) ((x4g) ((cna0) this.G).a.a).get(), new fna0(new hna0(ena0Var.a, ena0Var.b, ena0Var.c), new yj70(this), (lcc0) ((gna0) this.H).a.a.get()));
            case 17:
                v4c0 v4c0Var = (v4c0) obj;
                x4c0 x4c0Var = (x4c0) this.H;
                zzs zzsVar = v4c0Var.a;
                RoutePointType routePointType = v4c0Var.b;
                String str9 = v4c0Var.c;
                aq80 aq80Var2 = new aq80(this);
                y4a0 y4a0Var = x4c0Var.a;
                return new PlacesAddressLoaderModalView((Context) ((q5g) ((t4c0) this.G).a.b).get(), new w4c0(zzsVar, routePointType, str9, aq80Var2, (com.yandex.go.places.address.loader.impl.domain.interactors.a) ((kxb0) y4a0Var.b).get(), (tt2) ((q5g) y4a0Var.c).get()));
            case 18:
                gnf0 gnf0Var = (gnf0) this.H;
                v770 v770Var = ((vmf0) obj).a;
                v5c0 v5c0Var = new v5c0(i3, this);
                ofa0 ofa0Var = gnf0Var.a;
                return new PromoCodeSharingModalView((Context) ((xvf0) ofa0Var.a).get(), v770Var, v5c0Var, (nni0) ((xvf0) ofa0Var.b).get(), (zmf0) ((zlf0) ofa0Var.c).get(), (dnf0) ((xvf0) ofa0Var.w).get());
            case 19:
                ScootersBackgroundModalView scootersBackgroundModalView = (ScootersBackgroundModalView) this.G;
                ((xzm0) this.H).a = scootersBackgroundModalView;
                return scootersBackgroundModalView;
            case 20:
                e4n0 e4n0Var = (e4n0) obj;
                final String str10 = "ScootersCancelRidingView";
                fva0.f((fva0) this.G, "ScootersCancelRidingView", PerformanceAnalytics$Type.Inflate, 0L, 4);
                d4n0 d4n0Var = (d4n0) this.H;
                a4n0 a4n0Var = e4n0Var.c;
                sls slsVar = new sls(this) { // from class: f4n0
                    public final /* synthetic */ da0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i12 = i11;
                        zy11 zy11Var = zy11.a;
                        da0 da0Var = this.b;
                        switch (i12) {
                            case 0:
                                da0Var.r(new qu(9));
                                break;
                            default:
                                da0Var.r(new v1n0(3));
                                break;
                        }
                        return zy11Var;
                    }
                };
                sls slsVar2 = new sls(this) { // from class: f4n0
                    public final /* synthetic */ da0 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i12 = i10;
                        zy11 zy11Var = zy11.a;
                        da0 da0Var = this.b;
                        switch (i12) {
                            case 0:
                                da0Var.r(new qu(9));
                                break;
                            default:
                                da0Var.r(new v1n0(3));
                                break;
                        }
                        return zy11Var;
                    }
                };
                r7p0 r7p0Var = e4n0Var.b;
                String str11 = e4n0Var.a;
                krl0 krl0Var = d4n0Var.a;
                final ScootersCancelRidingModalView scootersCancelRidingModalView = new ScootersCancelRidingModalView((Context) ((xvf0) krl0Var.a).get(), (z3n0) ((qzm0) krl0Var.b).get(), str11, r7p0Var, a4n0Var, slsVar, slsVar2);
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: ru.yandex.taxi.scooters.presentation.ontheway.cancel.ScootersCancelRidingRouter$provideModalView$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersCancelRidingModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var2 = ((xva0) tag).a;
                        if (yuf0Var2 != null) {
                            yuf0Var2.I(str10);
                        }
                        View view = scootersCancelRidingModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r1;
                scootersCancelRidingModalView.addOnAttachStateChangeListener(r1);
                return scootersCancelRidingModalView;
            case 21:
                ymu ymuVar = (ymu) this.H;
                Toggleable toggleable = Toggleable.ON;
                Toggleable toggleable2 = Toggleable.OFF;
                avj0 avj0Var = (avj0) ((zuj0) this.G);
                return ymuVar.m(new hr1(toggleable, toggleable2, null, avj0Var.h(kyh0.mt_stop_loading_error), null, null, new q1c(avj0Var.h(kyh0.mt_try_refresh), new m8t0(i, this)), new x8t0(i8), null, 308));
            case 22:
                tt ttVar = (tt) this.G;
                ttVar.getClass();
                n3w a3 = n3w.a(new q101(new kcz0(new fbg(ttVar, 3), new fbg(ttVar, i9))));
                n3w a4 = n3w.a(new s101(new w040(new fbg(ttVar, i11), new fbg(ttVar, i6), new rct0(new fbg(ttVar, i10), new fbg(ttVar, i5), new fbg(ttVar, 6), new fbg(ttVar, i4), new fbg(ttVar, 11), 20), new fbg(ttVar, 12), new fbg(ttVar, i3), new fbg(ttVar, 2), new fbg(ttVar, i2), new fbg(ttVar, 5))));
                q101 q101Var = (q101) a3.a;
                s101 s101Var = (s101) a4.a;
                t101 t101Var = new t101(this);
                w040 w040Var = s101Var.a;
                com.yandex.go.agreement.trackable.mvp.b bVar = new com.yandex.go.agreement.trackable.mvp.b((u101) obj, t101Var, (bk1) ((fbg) w040Var.a).get(), (pwy0) ((fbg) w040Var.b).get(), (com.yandex.go.agreement.trackable.mapper.a) ((rct0) w040Var.c).get(), (com.yandex.go.agreement.trackable.repository.a) ((fbg) w040Var.d).get(), (com.yandex.go.agreement.trackable.repository.b) ((fbg) w040Var.e).get(), (jtq0) ((fbg) w040Var.f).get(), (yqg) ((fbg) w040Var.g).get(), (tan) ((fbg) w040Var.h).get());
                kcz0 kcz0Var = q101Var.a;
                return new TrackableAcceptanceModalView((Context) ((fbg) kcz0Var.a).get(), bVar, (ars0) ((fbg) kcz0Var.b).get());
            default:
                SourcePicker sourcePicker = ((sy41) obj).a == Screen.TAXI_MAIN ? SourcePicker.A_FROM_HOME : SourcePicker.A_FROM_SUMMARY;
                c61 c61Var2 = AddressSearchView.Companion;
                tjt0 tjt0Var = (tjt0) this.G;
                cag c2 = fh4.c(new r51(sourcePicker), new ddf(RoutePointType.POINT_A, true), m3o.b, tjt0Var.a, new aye0(i8, (y9y0) this.H), new ujt0(false));
                c61Var2.getClass();
                b61 b61Var2 = new b61(c2);
                b61Var2.p = true;
                b61Var2.q = new el11(i7, this);
                AddressSearchModalView.Companion.getClass();
                AddressSearchModalView a5 = p51.a(b61Var2);
                a5.setOnAddressPickedListener(new x71(i6, this));
                return a5;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(sus susVar, ous ousVar, w030 w030Var) {
        super(null);
        this.E = 11;
        this.G = susVar;
        this.H = ousVar;
        this.F = w030Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ da0(int i, Object obj, Object obj2, Object obj3) {
        super(null);
        this.E = i;
        this.F = obj;
        this.G = obj2;
        this.H = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da0(by7 by7Var, iy7 iy7Var, w030 w030Var) {
        super(null);
        this.E = 3;
        this.E = 3;
        this.F = w030Var;
        this.G = by7Var;
        this.H = iy7Var;
    }
}
