package defpackage;

import com.yandex.go.delivery.rental_duration_selector.experiment.RentalDurationExperiment;
import com.yandex.go.lottery.experiment.LotteryMenuItemExperiment;
import com.yandex.go.loyalty.impl.common.experiments.LoyaltyProgramsStateExperiment;
import com.yandex.go.messenger_native.experiment.NativeMessengerOverloadedFlagsExperiment;
import com.yandex.go.morphlex.experiments.MorphlexConfigurationsExperiment;
import com.yandex.go.multimodal_route.experiement.MultimodalRoutesExperiment;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.experiment.DeliveryTariffsCommentRedirectionsExperiment;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;
import ru.yandex.taxi.masstransit.experiment.MtMainRedirectExperiment;
import ru.yandex.taxi.masstransit.experiment.TransportOnSummaryExperiment;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.TransportQrScannerExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class ezp implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ezp(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return DeliveryTariffsCommentRedirectionsExperiment.Companion.serializer();
            case 1:
                return vgi.Companion.serializer();
            case 2:
                return nli.Companion.serializer();
            case 3:
                return RentalDurationExperiment.Companion.serializer();
            case 4:
                return LotteryMenuItemExperiment.Companion.serializer();
            case 5:
                return LoyaltyProgramsStateExperiment.Companion.serializer();
            case 6:
                return i800.Companion.serializer();
            case 7:
                return AutoUpdateUserLocationStrategyExperiment.Companion.serializer();
            case 8:
                return ufv0.Companion.serializer();
            case 9:
                return os00.Companion.serializer();
            case 10:
                return jk00.Companion.serializer();
            case 11:
                return uk00.Companion.serializer();
            case 12:
                return ayn.Companion.serializer();
            case 13:
                return zk00.Companion.serializer();
            case 14:
                return k110.Companion.serializer();
            case 15:
                return MtMainRedirectExperiment.Companion.serializer();
            case 16:
                return gi30.Companion.serializer();
            case 17:
                return as30.Companion.serializer();
            case 18:
                return d610.Companion.serializer();
            case 19:
                return r311.Companion.serializer();
            case 20:
                return TransportQrScannerExperiment.Companion.serializer();
            case 21:
                return ac11.Companion.serializer();
            case 22:
                return z2l0.Companion.serializer();
            case 23:
                return TransportOnSummaryExperiment.Companion.serializer();
            case 24:
                return u220.Companion.serializer();
            case 25:
                return e420.Companion.serializer();
            case 26:
                return h120.Companion.serializer();
            case 27:
                return NativeMessengerOverloadedFlagsExperiment.Companion.serializer();
            case 28:
                return MorphlexConfigurationsExperiment.Companion.serializer();
            default:
                return MultimodalRoutesExperiment.Companion.serializer();
        }
    }
}
