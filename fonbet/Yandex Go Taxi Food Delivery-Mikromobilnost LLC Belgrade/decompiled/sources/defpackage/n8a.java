package defpackage;

import com.yandex.go.chargers.design.components.ChargersOrderTabsView;
import com.yandex.go.chargers.offer.ui.mvp.ChargersOfferModalView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersStationAboutLocationView;
import com.yandex.go.chargers.station.presentation.details.components.ChargersTermsPlateView;
import com.yandex.go.chargers.tariff_item_info.api.ChargersTariffsView;
import com.yandex.go.location.provider.CompassProviderImpl$declinationFlow$2$1$listener$1;
import com.yandex.go.location.provider.CompassProviderImpl$sensorValuesFlow$1$listener$1;
import com.ybsdk.di.modules.features.pin.a;
import com.ybsdk.feature.pin.internal.screens.checkpin.CheckPinFragment;

/* loaded from: classes12.dex */
public final /* synthetic */ class n8a implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n8a(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 renderSuccess$lambda$2$0;
        zy11 renderTabs$lambda$0$0;
        zy11 bindPhoto$lambda$0$0;
        zy11 updateItem$lambda$0;
        zy11 updateItem$lambda$1$0;
        zy11 success$lambda$0;
        boolean z;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                renderSuccess$lambda$2$0 = ChargersOfferModalView.renderSuccess$lambda$2$0((ChargersOfferModalView) obj2, (w7a) obj);
                break;
            case 1:
                ((f9a) obj2).R((b9a) obj);
                break;
            case 2:
                ((tls) obj2).invoke(((vr60) obj).e);
                break;
            case 3:
                renderTabs$lambda$0$0 = ChargersOrderTabsView.renderTabs$lambda$0$0((ChargersOrderTabsView) obj2, (uda) obj);
                break;
            case 4:
                ((tls) obj2).invoke(new lea(((uea) obj).b));
                break;
            case 5:
                ((tls) obj2).invoke(((sea) obj).b);
                break;
            case 6:
                ((tls) obj2).invoke(((nga) obj).a);
                break;
            case 7:
                bindPhoto$lambda$0$0 = ChargersStationAboutLocationView.bindPhoto$lambda$0$0((dqa) obj2, (ChargersStationAboutLocationView) obj);
                break;
            case 8:
                ((tls) obj2).invoke(new sta(((fta) obj).b));
                break;
            case 9:
                ((tls) obj2).invoke((nwa) obj);
                break;
            case 10:
                updateItem$lambda$0 = ChargersTariffsView.updateItem$lambda$0((ChargersTariffsView) obj2, (vwa) obj);
                break;
            case 11:
                updateItem$lambda$1$0 = ChargersTariffsView.updateItem$lambda$1$0((ChargersTariffsView) obj2, (fxa) obj);
                break;
            case 12:
                success$lambda$0 = ChargersTermsPlateView.success$lambda$0((nya) obj2, (ChargersTermsPlateView) obj);
                break;
            case 13:
                upq0 upq0Var = (upq0) obj;
                break;
            case 14:
                break;
            case 15:
                CheckPinFragment.CheckPinScreenParams checkPinScreenParams = (CheckPinFragment.CheckPinScreenParams) obj2;
                boolean z2 = checkPinScreenParams.getCheckType().isEnterOrValidateOnReturn$feature_pin_release() && ((a) obj).a;
                int i2 = shb.a[checkPinScreenParams.getCheckType().ordinal()];
                if (i2 != 1 && i2 != 2 && i2 != 3) {
                    if (i2 != 4 && i2 != 5) {
                        w511.b();
                        break;
                    } else {
                        z = false;
                    }
                } else {
                    z = true;
                }
                break;
            case 16:
                hob hobVar = (hob) obj;
                nvo nvoVar = hobVar.g;
                ((tls) obj2).invoke(new sob(true ^ hobVar.d, nvoVar.a, nvoVar.b));
                break;
            case 17:
                ((tls) obj2).invoke(new vob((apb) obj));
                break;
            case 18:
                ((com.yandex.go.places.impl.ui.organizations.chips.viewholders.a) obj2).U.invoke((di80) obj);
                break;
            case 19:
                ((tls) obj2).invoke(((mtb) obj).k);
                break;
            case 20:
                ((tls) obj2).invoke(Double.valueOf(((px40) obj).getDoubleValue() / 360.0d));
                break;
            case 21:
                ((tls) obj2).invoke(new bxb(((dxb) obj).a));
                break;
            case 22:
                k6c k6cVar = (k6c) obj2;
                break;
            case 23:
                nac nacVar = (nac) obj2;
                nacVar.a();
                nacVar.d((obv) obj);
                break;
            case 24:
                try {
                    ((qwc) obj2).c.removeUpdates((CompassProviderImpl$declinationFlow$2$1$listener$1) obj);
                    break;
                } catch (Exception unused) {
                    jst.e.getClass();
                    break;
                }
            case 25:
                ((qwc) obj2).a.unregisterListener((CompassProviderImpl$sensorValuesFlow$1$listener$1) obj);
                break;
            case 26:
                ((com.yandex.go.places.complaint.impl.ui.modal.recycler.a) obj2).T.invoke((axc) obj);
                break;
            case 27:
                ((tls) obj2).invoke(((myc) obj).b);
                break;
            case 28:
                qyc qycVar = (qyc) obj2;
                qycVar.c.x("PhoneChallengeCard.Passed", null);
                qycVar.f.c(qycVar.a, "safe_flow_passed");
                qycVar.g.b(((xy6) obj).b.a);
                qycVar.d.a();
                break;
            default:
                ((le4) ((oe4) obj2)).a.invoke();
                ((lyc) obj).invoke();
                break;
        }
        return zy11Var;
        return zy11Var;
    }
}
