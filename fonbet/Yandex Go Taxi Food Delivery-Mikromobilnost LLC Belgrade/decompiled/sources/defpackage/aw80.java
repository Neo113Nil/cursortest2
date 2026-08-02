package defpackage;

import androidx.recyclerview.widget.h;
import com.yandex.go.chargers.offer.passes.data.model.b;
import com.yandex.go.scooters.passes.model.PassPayment;
import com.yandex.go.scooters.passes.model.PassPaymentType;
import com.yandex.go.scooters.passes.model.a;
import com.yandex.go.shortcuts.dto.response.Overlay;
import com.yandex.go.shortcuts.dto.response.OverlayType;
import com.yandex.go.shortcuts.dto.response.Shape;
import com.yandex.go.shortcuts.dto.response.ShortcutInfoListItem$$serializer;
import com.yandex.go.shortcuts.dto.response.g0;
import com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment;
import com.yandex.go.taxi.order.models.api.experiments.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$UpdateTargetsState$Target;
import com.ybsdk.feature.partnerselection.internal.screens.partners.presentation.PartnersFragment;
import defpackage.z190;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.PassItemType;
import ru.yandex.taxi.scooters.data.model.PurchaseStatus;

/* loaded from: classes13.dex */
public final /* synthetic */ class aw80 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ aw80(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        h itemAnimator_delegate$lambda$1;
        switch (this.a) {
            case 0:
                return new o4o("BANK_STATE_RECEIVED", bw80.INSTANCE, new Annotation[0]);
            case 1:
                return new p53(OutMessage$UpdateTargetsState$Target.Companion.serializer(), 1);
            case 2:
                return vez0.g("com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage.UpdateTargetsState.Target", OutMessage$UpdateTargetsState$Target.values(), new String[]{"ALL", "PLUS_POINTS", "BANK_STATE", "FAMILY", "PAYMENT_CONFIGURATION", "PLAQUE", "DAILY", "APPWIDGET_DAILY"}, new Annotation[][]{null, null, null, null, null, null, null, null});
            case 3:
                r090 r090Var = s090.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 4:
                g0 g0Var = Overlay.Companion;
                return OverlayType.Companion.serializer();
            case 5:
                r090 r090Var2 = s090.Companion;
                return new eni0(qoi0.a(Float.class), nor.a);
            case 6:
                g0 g0Var2 = Overlay.Companion;
                return Shape.Companion.serializer();
            case 7:
                r090 r090Var3 = s090.Companion;
                return new p53(auu0.a, 0);
            case 8:
                g0 g0Var3 = Overlay.Companion;
                return new p53(ShortcutInfoListItem$$serializer.INSTANCE, 0);
            case 9:
                return new oke(qoi0.a(u1m.class), null, new KSerializer[0]);
            case 10:
                return new oke(qoi0.a(ywl.class), null, new KSerializer[0]);
            case 11:
                return vez0.g("com.yandex.go.shortcuts.dto.response.OverlayType", OverlayType.values(), new String[]{"static_text"}, new Annotation[][]{null});
            case 12:
                a290 a290Var = z190.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 13:
                a290 a290Var2 = z190.Companion;
                return new p53(x190.a, 0);
            case 14:
                c290 c290Var = z190.b.Companion;
                return new p53(auu0.a, 0);
            case 15:
                return new k290();
            case 16:
                f590 f590Var = g590.Companion;
                return new p53(h590.a, 0);
            case 17:
                i590 i590Var = j590.Companion;
                return new p53(ak90.a, 0);
            case 18:
                c cVar = PaidWaitingTimerInCardExperiment.FreeWaitingInTitle.Companion;
                return PaidWaitingTimerInCardExperiment.FreeWaitingInTitle.TimeFormat.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.taxi.order.models.api.experiments.PaidWaitingTimerInCardExperiment.FreeWaitingInTitle.TimeFormat", PaidWaitingTimerInCardExperiment.FreeWaitingInTitle.TimeFormat.values(), new String[]{"positional", "abbreviated"}, new Annotation[][]{null, null});
            case 20:
                return new db90(-1, -1, -1, -1);
            case 21:
                itemAnimator_delegate$lambda$1 = PartnersFragment.itemAnimator_delegate$lambda$1();
                return itemAnimator_delegate$lambda$1;
            case 22:
                bk90 bk90Var = ck90.Companion;
                return PassItemType.Companion.serializer();
            case 23:
                bk90 bk90Var2 = ck90.Companion;
                return new p53(l8j.a, 0);
            case 24:
                return vez0.g("ru.yandex.taxi.scooters.data.model.PassItemType", PassItemType.values(), new String[]{PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "free_pass", "super_pass"}, new Annotation[][]{null, null, null});
            case 25:
                a aVar = PassPayment.Companion;
                return PassPaymentType.Companion.serializer();
            case 26:
                b bVar = com.yandex.go.chargers.offer.passes.data.model.PassPayment.Companion;
                return com.yandex.go.chargers.offer.passes.data.model.PassPaymentType.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.scooters.passes.model.PassPaymentType", PassPaymentType.values(), new String[]{"card", "googlepay", "corp", "nequi_token"}, new Annotation[][]{null, null, null, null});
            case 28:
                return vez0.g("com.yandex.go.chargers.offer.passes.data.model.PassPaymentType", com.yandex.go.chargers.offer.passes.data.model.PassPaymentType.values(), new String[]{"card", "googlepay", "corp"}, new Annotation[][]{null, null, null});
            default:
                pk90 pk90Var = qk90.Companion;
                return PurchaseStatus.Companion.serializer();
        }
    }
}
