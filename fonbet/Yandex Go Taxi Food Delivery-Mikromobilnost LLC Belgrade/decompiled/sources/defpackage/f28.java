package defpackage;

import android.content.Context;
import android.view.View;
import com.yandex.go.agreement.simple.ui.AgreementModalView;
import com.yandex.go.chargers.analytics.ChargersPerfEvent;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.error.data.a;
import com.yandex.go.chargers.order.details.ChargersOrderDetailsModalView;
import com.yandex.go.chargers.order.preparing.ChargersOrderPreparingModalView;
import com.yandex.go.overdraft.ui.DebtsModalView;
import com.yandex.go.places.complaint.impl.ui.modal.ComplaintModalView;
import com.yandex.go.places.impl.ui.bookings.PlacesBookingsModalView;
import com.yandex.go.scooters.passes.active.ScootersActivePassesModalView;
import com.yandex.go.scooters.passes.active.domain.c;
import com.yandex.go.scooters.passes.details.ScootersPassesDetailsModalView;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import com.yandex.go.scooters.promocodes.status.ScootersPromocodesStatusModalView;
import com.yandex.go.settings.email.EmailRequireExperiment;
import com.yandex.go.settings.email.EmailRequiredModalView;
import com.yandex.go.taxi.order.cancel.paid.ui.CancelledOrderCostModalView;
import com.yandex.go.taxi.order.change.source.interactor.b0;
import com.yandex.go.taxi.order.change.source.mvp.UpdateSourcePointConfirmationModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.TaxiOrderLocalData;
import com.yandex.go.taxi.order.tariff_upgrade.ui.TariffUpgradeModalView;
import defpackage.t9h0;
import defpackage.xva0;
import defpackage.yuf0;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.Events$ShareScreen$Screen;
import ru.yandex.taxi.common_models.net.map_object.k0;
import ru.yandex.taxi.perf.PerformanceAnalytics$Type;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.scooters.presentation.detailed_order.show_navigation.ScootersShowNavigationBubbleModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.search.view.AddressSearchView;
import ru.yandex.taxi.settings.profile.rating.PassengerNameEditorModalView;
import ru.yandex.taxi.share_favorites.view.ShareFavoritesModalView;
import ru.yandex.taxi.systemrequeirements.location.f;

/* loaded from: classes13.dex */
public final class f28 extends m230 {
    public final /* synthetic */ int E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f28(Context context, tse tseVar, w030 w030Var, h3y h3yVar) {
        super(null);
        this.E = 7;
        this.G = context;
        this.H = tseVar;
        this.F = w030Var;
        this.I = h3yVar;
    }

    @Override // defpackage.m230, defpackage.h55
    public void G(Object obj) {
        switch (this.E) {
            case 15:
                cqx0 cqx0Var = (cqx0) obj;
                super.G(cqx0Var);
                TaxiOrder taxiOrder = cqx0Var.b;
                taxiOrder.getClass();
                synchronized (taxiOrder) {
                    TaxiOrderLocalData taxiOrderLocalData = taxiOrder.l;
                    taxiOrderLocalData.getClass();
                    taxiOrder.l = TaxiOrderLocalData.b(taxiOrderLocalData, false, 0, false, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, null, -8193, 16777215);
                }
                return;
            default:
                super.G(obj);
                return;
        }
    }

    @Override // defpackage.m230, defpackage.h55
    public void H(Object obj) {
        switch (this.E) {
            case 15:
                super.H((cqx0) obj);
                j(dpb.a);
                break;
            default:
                super.H(obj);
                break;
        }
    }

    @Override // defpackage.m230
    public final w030 P() {
        switch (this.E) {
        }
        return (w030) this.F;
    }

    @Override // defpackage.m230
    public final boolean Q() {
        switch (this.E) {
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v54, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.passes.details.ScootersPassesDetailsRouter$provideModalView-OmVZJVI$$inlined$wrapJankStats$1] */
    /* JADX WARN: Type inference failed for: r2v19, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.order.preparing.ChargersOrderPreparingRouter$provideModalView-Rao9bWQ$$inlined$wrapJankStats$1] */
    /* JADX WARN: Type inference failed for: r2v42, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.scooters.promocodes.status.ScootersPromocodesStatusRouterImpl$provideModalView--UOZj8M$$inlined$wrapJankStats$1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, android.view.View$OnAttachStateChangeListener, com.yandex.go.chargers.order.details.ChargersOrderDetailsRouter$provideModalView--XZ7xgI$$inlined$wrapJankStats$1] */
    @Override // defpackage.m230
    public final u45 S(Object obj) {
        int i = this.E;
        int i2 = 29;
        int i3 = 11;
        int i4 = 5;
        int i5 = 2;
        int i6 = 4;
        int i7 = 8;
        final int i8 = 0;
        Object obj2 = this.I;
        Object obj3 = this.G;
        Object obj4 = this.H;
        switch (i) {
            case 0:
                rk6 rk6Var = new rk6(15, this);
                cx7 cx7Var = new cx7(i6, this);
                c06 c06Var = ((e28) obj3).a;
                return new CancelledOrderCostModalView((Context) ((n3w) c06Var.a).a, (TaxiOrder) obj, rk6Var, cx7Var, (xdf) ((ywf) c06Var.b).get());
            case 1:
                String str = ((yba) obj).a;
                final String key = ChargersPerfEvent.ORDER_DETAILS.getKey();
                fva0.f((fva0) obj3, key, PerformanceAnalytics$Type.Inflate, 0L, 4);
                c29 c29Var = new c29(i3, this);
                sk7 sk7Var = ((aca) obj2).a;
                final ChargersOrderDetailsModalView chargersOrderDetailsModalView = new ChargersOrderDetailsModalView((Context) ((wba) obj4).a.a.get(), new zba((em9) ((xvf0) sk7Var.b).get(), (e) ((xvf0) sk7Var.c).get(), (eca) ((t4) sk7Var.w).get(), str, c29Var));
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? r3 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.order.details.ChargersOrderDetailsRouter$provideModalView--XZ7xgI$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = chargersOrderDetailsModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key);
                        }
                        View view = chargersOrderDetailsModalView;
                        T t = ref$ObjectRef.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef.element = r3;
                chargersOrderDetailsModalView.addOnAttachStateChangeListener(r3);
                return chargersOrderDetailsModalView;
            case 2:
                String str2 = ((gda) obj).a;
                final String key2 = ChargersPerfEvent.ORDER_PREPARING.getKey();
                fva0.f((fva0) obj3, key2, PerformanceAnalytics$Type.Inflate, 0L, 4);
                hh5 hh5Var = new hh5(i2, this);
                bc bcVar = ((ida) obj2).a;
                final ChargersOrderPreparingModalView chargersOrderPreparingModalView = new ChargersOrderPreparingModalView((Context) ((eda) obj4).a.a.get(), new hda((em9) ((xvf0) bcVar.a).get(), (a) ((xvf0) bcVar.b).get(), (e) ((xvf0) bcVar.c).get(), (kda) ((b1a) bcVar.w).get(), (saa) ((xvf0) bcVar.x).get(), str2, hh5Var));
                final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                ?? r2 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.chargers.order.preparing.ChargersOrderPreparingRouter$provideModalView-Rao9bWQ$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = chargersOrderPreparingModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(key2);
                        }
                        View view = chargersOrderPreparingModalView;
                        T t = ref$ObjectRef2.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef2.element = r2;
                chargersOrderPreparingModalView.addOnAttachStateChangeListener(r2);
                return chargersOrderPreparingModalView;
            case 3:
                c29 c29Var2 = new c29(i2, this);
                an8 an8Var = ((oxc) obj4).a;
                nxc nxcVar = new nxc(c29Var2, (yfa) ((srb) an8Var.c).get(), (com.yandex.go.places.complaint.impl.domain.interactors.a) ((f2b) an8Var.w).get(), (hit) ((yxf) an8Var.x).get(), (tt2) ((yxf) an8Var.b).get());
                sk7 sk7Var2 = ((jxc) obj3).a;
                return new ComplaintModalView((Context) ((yxf) sk7Var2.b).get(), nxcVar, (mxc) obj, (zuj0) ((yxf) sk7Var2.c).get(), (pav) ((yxf) sk7Var2.w).get());
            case 4:
                return new DebtsModalView((Context) obj3, (dug) obj4, (z0a0) obj2);
            case 5:
                return new EmailRequiredModalView((Context) obj4, (EmailRequireExperiment) obj, new jln(i5, this));
            case 6:
                c61 c61Var = AddressSearchView.Companion;
                xn30 xn30Var = (xn30) obj4;
                xn30Var.getClass();
                wyf a = xn30Var.a.a(new h0j(tyi.a, "transport_vertical", false), new ddf(RoutePointType.POINT_B), new r51(SourcePicker.B_FROM_SUMMARY), m3o.b, xn30Var.b);
                c61Var.getClass();
                b61 b61Var = new b61(a);
                b61Var.n = ((avj0) ((zuj0) obj3)).h(kyh0.search_destination_address_hint);
                b61Var.u = PointType.DESTINATION;
                b61Var.q = new uhx(20, this);
                AddressSearchModalView.Companion.getClass();
                AddressSearchModalView a2 = p51.a(b61Var);
                a2.setOnAddressPickedListener(new x71(i7, this));
                return a2;
            case 7:
                return new PassengerNameEditorModalView((Context) obj3, (dl90) ((h3y) obj2).get(), (tse) obj4);
            case 8:
                c6c0 c6c0Var = new c6c0(((x5c0) obj).a);
                v5c0 v5c0Var = new v5c0(i8, this);
                ((z5c0) obj4).a.getClass();
                y5c0 y5c0Var = new y5c0(c6c0Var, v5c0Var);
                gaz gazVar = ((u5c0) obj3).a;
                return new PlacesBookingsModalView((Context) gazVar.a.get(), y5c0Var, (pav) gazVar.b.get(), (tt2) gazVar.c.get());
            case 9:
                frm0 frm0Var = (frm0) obj;
                ScootersPassesFromScreen scootersPassesFromScreen = frm0Var.a;
                j6m0 j6m0Var = new j6m0(12, this);
                return new ScootersActivePassesModalView((Context) ((drm0) obj3).a.a.get(), new grm0((qxm0) ((hrm0) obj4).a.a.get(), j6m0Var, frm0Var.b, scootersPassesFromScreen, (c) obj2));
            case 10:
                c3o c3oVar = ((hdo0) obj).a;
                final String str3 = "Scooters.PassesDetails";
                fva0.f((fva0) obj3, "Scooters.PassesDetails", PerformanceAnalytics$Type.Inflate, 0L, 4);
                ido0 ido0Var = new ido0((kdd0) ((mdo0) ((jdo0) obj2).a.b).get(), c3oVar, new qgn0(i6, this));
                gus gusVar = ((fdo0) obj4).a;
                final ScootersPassesDetailsModalView scootersPassesDetailsModalView = new ScootersPassesDetailsModalView((Context) gusVar.a.get(), (pav) gusVar.b.get(), ido0Var);
                final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.passes.details.ScootersPassesDetailsRouter$provideModalView-OmVZJVI$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersPassesDetailsModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str3);
                        }
                        View view = scootersPassesDetailsModalView;
                        T t = ref$ObjectRef3.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef3.element = r1;
                scootersPassesDetailsModalView.addOnAttachStateChangeListener(r1);
                return scootersPassesDetailsModalView;
            case 11:
                vno0 vno0Var = ((mno0) obj).a;
                final String str4 = "ScootersPromocodesStatus";
                fva0.f((fva0) obj3, "ScootersPromocodesStatus", PerformanceAnalytics$Type.Inflate, 0L, 4);
                qgn0 qgn0Var = new qgn0(i4, this);
                tig0 tig0Var = ((ono0) obj2).a;
                final ScootersPromocodesStatusModalView scootersPromocodesStatusModalView = new ScootersPromocodesStatusModalView((Context) ((kno0) obj4).a.a.get(), new nno0((ndl0) ((sxn0) tig0Var.a).get(), (cjm0) ((lwl0) tig0Var.b).get(), vno0Var, qgn0Var));
                final Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                ?? r22 = new View.OnAttachStateChangeListener() { // from class: com.yandex.go.scooters.promocodes.status.ScootersPromocodesStatusRouterImpl$provideModalView--UOZj8M$$inlined$wrapJankStats$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View v) {
                        View rootView = scootersPromocodesStatusModalView.getRootView();
                        Object tag = rootView.getTag(t9h0.metricsStateHolder);
                        if (tag == null) {
                            tag = new xva0();
                            rootView.setTag(t9h0.metricsStateHolder, tag);
                        }
                        yuf0 yuf0Var = ((xva0) tag).a;
                        if (yuf0Var != null) {
                            yuf0Var.I(str4);
                        }
                        View view = scootersPromocodesStatusModalView;
                        T t = ref$ObjectRef4.element;
                        view.removeOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View v) {
                    }
                };
                ref$ObjectRef4.element = r22;
                scootersPromocodesStatusModalView.addOnAttachStateChangeListener(r22);
                return scootersPromocodesStatusModalView;
            case 12:
                r0o0 r0o0Var = (r0o0) obj;
                awo0 awo0Var = new awo0((x770) ((qzm0) ((bwo0) obj2).a.b).get(), r0o0Var.b, r0o0Var.a);
                zzs zzsVar = r0o0Var.c;
                k0 k0Var = r0o0Var.d;
                uio0 uio0Var = ((gwo0) obj3).a;
                fwo0 fwo0Var = new fwo0((Context) ((xvf0) uio0Var.a).get(), (ah00) ((xvf0) uio0Var.b).get(), (tt2) ((e7g) uio0Var.c).get(), (ru.yandex.taxi.design.utils.a) ((xvf0) uio0Var.d).get(), (ru.yandex.taxi.widget.c) ((xvf0) uio0Var.e).get(), (f) ((k7g) uio0Var.f).get(), zzsVar, k0Var);
                return new ScootersShowNavigationBubbleModalView((Context) ((dwo0) obj4).a.a.get(), awo0Var, new nao0(i7, this, r0o0Var), fwo0Var);
            case 13:
                ojr0 ojr0Var = (ojr0) obj;
                hwo0 hwo0Var = (hwo0) obj4;
                Events$ShareScreen$Screen events$ShareScreen$Screen = ojr0Var.b;
                zzs zzsVar2 = ojr0Var.a;
                ljr0 ljr0Var = ojr0Var.c;
                ykn0 ykn0Var = new ykn0(9, this);
                hwo0Var.getClass();
                events$ShareScreen$Screen.getClass();
                ljr0Var.getClass();
                Context context = (Context) hwo0Var.b;
                q5z.h(context);
                pkr0 pkr0Var = (pkr0) hwo0Var.c;
                q5z.h(pkr0Var);
                zuj0 zuj0Var = (zuj0) hwo0Var.x;
                q5z.h(zuj0Var);
                ru.yandex.taxi.favorites.data.repo.a aVar = (ru.yandex.taxi.favorites.data.repo.a) hwo0Var.w;
                q5z.h(aVar);
                return new ShareFavoritesModalView(context, new ru.yandex.taxi.share_favorites.presenter.a(ljr0Var, zzsVar2, events$ShareScreen$Screen, ykn0Var, pkr0Var, zuj0Var, aVar));
            case 14:
                bd bdVar = (bd) obj;
                uio0 uio0Var2 = (uio0) obj2;
                uio0Var2.getClass();
                n3w a3 = n3w.a(new lk1(new h0w(i7, new x9g(uio0Var2, 3), new x9g(uio0Var2, i5))));
                final int i9 = 1;
                zk1 zk1Var = (zk1) n3w.a(new zk1(new m2v(new x9g(uio0Var2, i8), new x9g(uio0Var2, i4), new x9g(uio0Var2, i9), new x9g(uio0Var2, i6)))).a;
                xcs0 xcs0Var = new xcs0(this);
                m2v m2vVar = zk1Var.a;
                yk1 yk1Var = new yk1(bdVar, xcs0Var, (ed) ((x9g) m2vVar.a).get(), (k7x0) ((x9g) m2vVar.b).get(), (bk1) ((x9g) m2vVar.c).get(), (zuj0) ((x9g) m2vVar.w).get());
                h0w h0wVar = ((lk1) a3.a).a;
                AgreementModalView agreementModalView = new AgreementModalView(yk1Var, (pav) ((x9g) h0wVar.b).get(), (Context) ((x9g) h0wVar.c).get());
                final ppr0 ppr0Var = new ppr0(10, this, bdVar);
                agreementModalView.setOnTouchOutsideListener(new Runnable() { // from class: wcs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i8;
                        ppr0 ppr0Var2 = ppr0Var;
                        switch (i10) {
                            case 0:
                                ppr0Var2.invoke();
                                break;
                            default:
                                ppr0Var2.invoke();
                                break;
                        }
                    }
                });
                agreementModalView.setOnBackPressedListener(new Runnable() { // from class: wcs0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10 = i9;
                        ppr0 ppr0Var2 = ppr0Var;
                        switch (i10) {
                            case 0:
                                ppr0Var2.invoke();
                                break;
                            default:
                                ppr0Var2.invoke();
                                break;
                        }
                    }
                });
                agreementModalView.setOnAppearingListener(new sc(i3, this));
                return agreementModalView;
            case 15:
                jhu0 jhu0Var = new jhu0(this);
                lpx0 lpx0Var = ((cqx0) obj).a;
                rfw0 rfw0Var = ((vpx0) obj4).a;
                upx0 upx0Var = new upx0(lpx0Var, jhu0Var, (hqx0) ((awp0) rfw0Var.a).get(), (npx0) ((e6v0) rfw0Var.b).get());
                mc mcVar = ((spx0) obj3).a;
                return new TariffUpgradeModalView(upx0Var, (Context) mcVar.a.get(), (pav) mcVar.b.get());
            default:
                eg01 eg01Var = new eg01(this);
                rfw0 rfw0Var2 = ((l821) obj4).a;
                return new UpdateSourcePointConfirmationModalView((Context) ((i821) obj3).a.a.get(), new k821((b0) ((ci3) rfw0Var2.a).get(), (d821) ((xvf0) rfw0Var2.b).get(), (cc9) obj, eg01Var));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f28(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        super(null);
        this.E = i;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
        this.F = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f28(Object obj, Object obj2, w030 w030Var, Object obj3, int i) {
        super(null);
        this.E = i;
        this.F = w030Var;
        this.G = obj;
        this.H = obj2;
        this.I = obj3;
    }
}
