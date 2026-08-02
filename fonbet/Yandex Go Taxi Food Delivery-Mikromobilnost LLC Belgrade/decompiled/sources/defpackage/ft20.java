package defpackage;

import android.text.Editable;
import androidx.compose.ui.semantics.f;
import com.lightside.artists.MorphablePathArtistDrawable;
import com.yandex.go.compose.ComposeContentKt$ContentImpl$scope$1$1$action$1;
import com.yandex.go.masstransit.sdk.ble.impl.fullscreen.d;
import com.yandex.go.masstransit.sdk.ble.impl.modal.e;
import com.yandex.go.places.organization.card.impl.ui.card.flex.v2.extended_options.state.a;
import com.yandex.mapkit.transport.masstransit.Route;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListFragment;
import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactFragment;
import com.ybsdk.widgets.common.g;
import defpackage.ai30;
import defpackage.bgd;
import defpackage.bts;
import defpackage.cv30;
import defpackage.did;
import defpackage.f730;
import defpackage.fid;
import defpackage.l2l0;
import defpackage.ml30;
import defpackage.np30;
import defpackage.qf30;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.up30;
import defpackage.v040;
import defpackage.wh30;
import defpackage.wxo;
import defpackage.xfd;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.masstransit.geopayment.analytics.TransportPaymentAnalytics$RouteOptionsScreenOpenReason;
import ru.yandex.taxi.masstransit.geopayment.checkout.MtCheckoutModalView;
import ru.yandex.taxi.masstransit.main.ui.modal.MtMainFlexModalView;
import ru.yandex.taxi.masstransit.paymentcards.MtTransportCardSubscriber$TransportCardEventType;
import ru.yandex.taxi.masstransit.stop.router.b;
import ru.yandex.taxi.masstransit.ui.discovery.MtDiscoveryModalView;
import ru.yandex.taxi.masstransit.ui.route.modal.MtRoutesModalView;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ft20 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ft20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g render$lambda$16$lambda$14$lambda$13$lambda$12;
        g render$lambda$13$lambda$11$lambda$10$lambda$9;
        zy11 inputWatcher$lambda$1;
        zy11 animatePath$lambda$1$lambda$0;
        zy11 insetsType$lambda$0;
        zy11 insetsType$lambda$02;
        zy11 insetsType$lambda$03;
        Integer c;
        zy11 insetsType$lambda$04;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                render$lambda$16$lambda$14$lambda$13$lambda$12 = MobilePaymentSelectContactFragment.render$lambda$16$lambda$14$lambda$13$lambda$12((qt20) obj2, (g) obj);
                break;
            case 1:
                render$lambda$13$lambda$11$lambda$10$lambda$9 = MobileProvidersListFragment.render$lambda$13$lambda$11$lambda$10$lambda$9((mu20) obj2, (g) obj);
                break;
            case 2:
                inputWatcher$lambda$1 = MobileProvidersListFragment.inputWatcher$lambda$1((MobileProvidersListFragment) obj2, (Editable) obj);
                break;
            case 3:
                break;
            case 4:
                ((li6) obj).b(((Route) obj2).getGeometry());
                break;
            case 5:
                x4e.z((int) (((rzx) obj).e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), ((le6) ((w3i) obj2).B).a, null);
                break;
            case 6:
                ModalView modalView = (ModalView) obj2;
                modalView.setPadding(modalView.getPaddingLeft(), ((t1w) obj).b, modalView.getPaddingRight(), modalView.getPaddingBottom());
                break;
            case 7:
                final f730 f730Var = (f730) obj2;
                final yfd yfdVar = (yfd) obj;
                agd agdVar = (agd) yfdVar;
                agdVar.c = new a((oxo) f730Var.H.a.a.get(), ((e730) ((agd) yfdVar).a).a, ((e730) agdVar.a).b).d;
                agdVar.e = new tls() { // from class: com.yandex.go.places.organization.card.impl.navigation.more_actions_modal.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        f730 f730Var2 = f730.this;
                        tje.N(f730Var2.o(), null, null, new MoreActionsModalRouter$content$1$1$1(f730Var2, (wxo) obj3, yfdVar, null), 3);
                        return zy11.a;
                    }
                };
                r8d.a.getClass();
                agdVar.g = r8d.b;
                break;
            case 8:
                animatePath$lambda$1$lambda$0 = MorphablePathArtistDrawable.animatePath$lambda$1$lambda$0((MorphablePathArtistDrawable) obj2, (ur90[]) obj);
                break;
            case 9:
                mnq0 mnq0Var = (mnq0) obj;
                String str = ((da30) obj2).c;
                if (str == null) {
                    str = "";
                }
                f.l(mnq0Var, str);
                break;
            case 10:
                yfd yfdVar2 = (yfd) obj;
                ((agd) yfdVar2).c = new g92(2, zy11Var);
                agd agdVar2 = (agd) yfdVar2;
                agdVar2.e = new j01(i2);
                agdVar2.g = new androidx.compose.runtime.internal.a(1283640927, new alb0(13, (t) obj2), true);
                break;
            case 11:
                insetsType$lambda$0 = MtCheckoutModalView.insetsType$lambda$0((MtCheckoutModalView) obj2, (t1w) obj);
                break;
            case 12:
                break;
            case 13:
                final qf30 qf30Var = (qf30) obj2;
                yfd yfdVar3 = (yfd) obj;
                ((agd) yfdVar3).c = qf30Var.H.a();
                agd agdVar3 = (agd) yfdVar3;
                agdVar3.e = new tls() { // from class: ru.yandex.taxi.masstransit.detailedroute.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        qf30 qf30Var2 = qf30.this;
                        tje.N(qf30Var2.o(), null, null, new MtDetailedRouteComposeRouter$content$1$1$1(qf30Var2, (wh30) obj3, null), 3);
                        return zy11.a;
                    }
                };
                agdVar3.f = new le4(new ve30(i3, qf30Var, yfdVar3));
                agdVar3.g = new androidx.compose.runtime.internal.a(-1027952058, new bms() { // from class: ru.yandex.taxi.masstransit.detailedroute.router.b
                    @Override // defpackage.bms
                    public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                        int i4;
                        xfd xfdVar = (xfd) obj3;
                        ai30 ai30Var = (ai30) obj4;
                        fid fidVar = (fid) obj5;
                        int intValue = ((Integer) obj6).intValue();
                        if ((intValue & 6) == 0) {
                            i4 = ((intValue & 8) == 0 ? ((bts) fidVar).k(xfdVar) : fidVar.e(xfdVar) ? 4 : 2) | intValue;
                        } else {
                            i4 = intValue;
                        }
                        if ((intValue & 48) == 0) {
                            i4 |= (intValue & 64) == 0 ? ((bts) fidVar).k(ai30Var) : fidVar.e(ai30Var) ? 32 : 16;
                        }
                        bts btsVar = (bts) fidVar;
                        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
                            ComposeContentKt$ContentImpl$scope$1$1$action$1 composeContentKt$ContentImpl$scope$1$1$action$1 = ((bgd) xfdVar).a;
                            qf30 qf30Var2 = qf30.this;
                            boolean e = btsVar.e(qf30Var2);
                            Object Q = btsVar.Q();
                            if (e || Q == did.a) {
                                MtDetailedRouteComposeRouter$content$1$3$1$1 mtDetailedRouteComposeRouter$content$1$3$1$1 = new MtDetailedRouteComposeRouter$content$1$3$1$1(1, qf30Var2, qf30.class, "onAnchoredHeightChanged", "onAnchoredHeightChanged(I)V", 0);
                                btsVar.o0(mtDetailedRouteComposeRouter$content$1$3$1$1);
                                Q = mtDetailedRouteComposeRouter$content$1$3$1$1;
                            }
                            ru.yandex.taxi.masstransit.detailedroute.ui.v2.c.c(ai30Var, composeContentKt$ContentImpl$scope$1$1$action$1, (tls) ((tfx) Q), qf30Var2.V, btsVar, 8 | ((i4 >> 3) & 14));
                        } else {
                            btsVar.Y();
                        }
                        return zy11.a;
                    }
                }, true);
                break;
            case 14:
                insetsType$lambda$02 = MtDiscoveryModalView.insetsType$lambda$0((MtDiscoveryModalView) obj2, (t1w) obj);
                break;
            case 15:
                final d dVar = (d) obj2;
                final yfd yfdVar4 = (yfd) obj;
                ((agd) yfdVar4).c = ((e) dVar.L.getValue()).c;
                tls tlsVar = new tls() { // from class: com.yandex.go.masstransit.sdk.ble.impl.fullscreen.c
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        d dVar2 = d.this;
                        tje.N(dVar2.o(), null, null, new MtGeoPaymentFullscreenRouterImpl$content$1$1$1(dVar2, (ml30) obj3, yfdVar4, null), 3);
                        return zy11.a;
                    }
                };
                agd agdVar4 = (agd) yfdVar4;
                agdVar4.e = tlsVar;
                z8d.a.getClass();
                agdVar4.g = z8d.b;
                break;
            case 16:
                final ru.yandex.taxi.masstransit.geopayment.modal.e eVar = (ru.yandex.taxi.masstransit.geopayment.modal.e) obj2;
                final yfd yfdVar5 = (yfd) obj;
                ((agd) yfdVar5).c = ((ru.yandex.taxi.masstransit.geopayment.modal.g) eVar.K.getValue()).c;
                tls tlsVar2 = new tls() { // from class: ru.yandex.taxi.masstransit.geopayment.modal.d
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        e eVar2 = e.this;
                        tje.N(eVar2.o(), null, null, new MtGeoPaymentModalRouterImpl$content$1$1$1(eVar2, (ml30) obj3, yfdVar5, null), 3);
                        return zy11.a;
                    }
                };
                agd agdVar5 = (agd) yfdVar5;
                agdVar5.e = tlsVar2;
                agdVar5.g = new androidx.compose.runtime.internal.a(1386894277, new alb0(14, eVar), true);
                break;
            case 17:
                f.l((mnq0) obj, ((km30) obj2).c);
                break;
            case 18:
                insetsType$lambda$03 = MtMainFlexModalView.insetsType$lambda$0((MtMainFlexModalView) obj2, (t1w) obj);
                break;
            case 19:
                lo30 lo30Var = (lo30) obj2;
                MtTransportCardSubscriber$TransportCardEventType mtTransportCardSubscriber$TransportCardEventType = (MtTransportCardSubscriber$TransportCardEventType) obj;
                lo30Var.x.a(false);
                if (mtTransportCardSubscriber$TransportCardEventType != MtTransportCardSubscriber$TransportCardEventType.CARD_REMOVED && (c = ypb1.c(mtTransportCardSubscriber$TransportCardEventType)) != null) {
                    lo30Var.H.a(((avj0) lo30Var.C).h(c.intValue()));
                    break;
                }
                break;
            case 20:
                c010 c010Var = (c010) obj;
                cw30 cw30Var = (cw30) ((i3g) c010Var.a).M.get();
                cw30Var.getClass();
                cw30Var.a = TransportPaymentAnalytics$RouteOptionsScreenOpenReason.ButtonBuy;
                cw30Var.b = pj40.c;
                ru.yandex.taxi.masstransit.d.Z(c010Var.b, c010Var.a, (e210) obj2, null, 6);
                break;
            case 21:
                final np30 np30Var = (np30) obj2;
                yfd yfdVar6 = (yfd) obj;
                ((agd) yfdVar6).c = np30Var.I.b;
                agd agdVar6 = (agd) yfdVar6;
                agdVar6.e = new tls() { // from class: com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_auth_onboarding.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        np30 np30Var2 = np30.this;
                        tje.N(np30Var2.o(), null, null, new MtMosMetroAuthOnboardingModalRouter$content$1$1$1(np30Var2, (up30) obj3, null), 3);
                        return zy11.a;
                    }
                };
                d9d.a.getClass();
                agdVar6.g = d9d.b;
                break;
            case 22:
                final cv30 cv30Var = (cv30) obj2;
                yfd yfdVar7 = (yfd) obj;
                ((agd) yfdVar7).c = cv30Var.H.a;
                agd agdVar7 = (agd) yfdVar7;
                agdVar7.e = new tls() { // from class: ru.yandex.taxi.masstransit.trains.routedetails.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        cv30 cv30Var2 = cv30.this;
                        tje.N(cv30Var2.o(), null, null, new MtRouteDetailsModalRouter$content$1$1$1(cv30Var2, (l2l0) obj3, null), 3);
                        return zy11.a;
                    }
                };
                g9d.a.getClass();
                agdVar7.g = g9d.b;
                break;
            case 23:
                int intValue = ((Integer) obj).intValue();
                bx20 bx20Var = ((xv30) ((agd) ((yfd) obj2)).a).a;
                if (bx20Var != null) {
                    bx20Var.update(intValue);
                    break;
                }
                break;
            case 24:
                ((ru.yandex.taxi.masstransit.datasource.routing.a) obj2).getClass();
                break;
            case 25:
                insetsType$lambda$04 = MtRoutesModalView.insetsType$lambda$0((MtRoutesModalView) obj2, (t1w) obj);
                break;
            case 26:
                break;
            case 27:
                break;
            case 28:
                tdu tduVar = ((g140) obj2).a;
                f.l((mnq0) obj, tduVar.a + " " + tduVar.d);
                break;
            default:
                final b bVar = (b) obj2;
                final yfd yfdVar8 = (yfd) obj;
                final x140 x140Var = new x140(bVar);
                agd agdVar8 = (agd) yfdVar8;
                agdVar8.c = bVar.I.c(((y140) ((agd) yfdVar8).a).a);
                agdVar8.e = new tls() { // from class: ru.yandex.taxi.masstransit.stop.router.a
                    @Override // defpackage.tls
                    public final Object invoke(Object obj3) {
                        b bVar2 = b.this;
                        tje.N(bVar2.o(), null, null, new MtStopModalRouter$content$1$1$1(bVar2, (v040) obj3, x140Var, yfdVar8, null), 3);
                        return zy11.a;
                    }
                };
                j9d.a.getClass();
                agdVar8.g = j9d.b;
                break;
        }
        return zy11Var;
    }
}
