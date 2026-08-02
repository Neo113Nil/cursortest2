package defpackage;

import com.adjust.sdk.Constants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import com.yandex.go.scooters.data.model.w;
import com.yandex.go.scooters.passes.data.model.ScootersPackagesLegalTermsExperiment;
import com.yandex.go.scooters.passes.data.model.ScootersPassesAutoRenewExperiment;
import com.yandex.go.scooters.passes.data.model.actions.ScootersUnfreezePassAction;
import com.yandex.go.scooters.passes.data.model.actions.j;
import com.yandex.go.scooters.passes.data.model.b;
import com.yandex.go.scooters.passes.data.model.c;
import com.yandex.go.scooters.passes.data.model.d;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolStatusResponse;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolStatusResponse$Exam$$serializer;
import com.yandex.go.scooters.photocontrol.data.model.g;
import com.yandex.go.scooters.photocontrol.data.model.h;
import com.yandex.go.scooters.promocodes.data.model.ScootersPromocodesUseResponse;
import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockParams;
import com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse;
import com.yandex.go.scooters.subscription.data.model.i;
import com.yandex.go.scooters.subscription.data.model.k;
import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfo;
import com.yandex.go.scooters.zones.data.model.ScootersPolygonInfo$PolygonInfoItem$$serializer;
import com.yandex.go.scooters.zones.data.model.ScootersPolygonLegend;
import com.yandex.go.scooters.zones.data.model.ScootersPolygonLegend$PolygonLegendInfoItem$$serializer;
import com.yandex.go.scooters.zones.data.model.a;
import com.yandex.go.scooters.zones.data.model.e;
import defpackage.f9o0;
import defpackage.jfo0;
import java.lang.annotation.Annotation;
import java.util.Collections;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

/* loaded from: classes13.dex */
public final /* synthetic */ class h5o0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ h5o0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                w wVar = ScootersOnboardingExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 1:
                b bVar = ScootersPackagesLegalTermsExperiment.Companion;
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 2:
                g9o0 g9o0Var = f9o0.Companion;
                return new p53(n9o0.a, 0);
            case 3:
                k9o0 k9o0Var = f9o0.c.Companion;
                return new p53(l9o0.a, 0);
            case 4:
                c cVar = ScootersPassesAutoRenewExperiment.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(auu0Var3, auu0Var3, 1);
            case 5:
                d dVar = ScootersPassesAutoRenewExperiment.Keys.Companion;
                return new p53(auu0.a, 0);
            case 6:
                return vez0.g("ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto", ScootersPassesListServiceDto.values(), new String[]{"chargers"}, new Annotation[][]{null});
            case 7:
                gfo0 gfo0Var = jfo0.Companion;
                return new p53(hfo0.a, 0);
            case 8:
                lfo0 lfo0Var = jfo0.b.Companion;
                return new p53(mfo0.a, 0);
            case 9:
                g gVar = ScootersPhotocontrolStatusResponse.Companion;
                return new p53(ScootersPhotocontrolStatusResponse$Exam$$serializer.INSTANCE, 0);
            case 10:
                h hVar = ScootersPhotocontrolStatusResponse.Exam.Companion;
                return ScootersPhotocontrolStatusResponse.PhotocontrolStatus.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolStatusResponse.PhotocontrolStatus", ScootersPhotocontrolStatusResponse.PhotocontrolStatus.values(), new String[]{"success", "failed", "in_progress", "impossible"}, new Annotation[][]{null, null, null, null});
            case 12:
                mko0 mko0Var = pko0.Companion;
                return new p53(nko0.a, 0);
            case 13:
                a aVar = ScootersPolygonInfo.Companion;
                return new p53(ScootersPolygonInfo$PolygonInfoItem$$serializer.INSTANCE, 0);
            case 14:
                e eVar = ScootersPolygonLegend.Companion;
                return new p53(ScootersPolygonLegend$PolygonLegendInfoItem$$serializer.INSTANCE, 0);
            case 15:
                com.yandex.go.scooters.promotions.data.model.a aVar2 = ScootersPromoblockParams.Companion;
                return ScootersPromotionsScreen.Companion.serializer();
            case 16:
                com.yandex.go.scooters.promotions.data.model.e eVar2 = ScootersPromoblockResponse.ScootersPromo.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 17:
                com.yandex.go.scooters.promotions.data.model.g gVar2 = ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.Companion;
                return ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.Companion.serializer();
            case 18:
                com.yandex.go.scooters.promotions.data.model.g gVar3 = ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.Companion;
                return ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority", ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationPriority.values(), new String[]{Constants.LOW, "default", Constants.HIGH}, new Annotation[][]{null, null, null});
            case 20:
                return vez0.g("com.yandex.go.scooters.promotions.data.model.ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle", ScootersPromoblockResponse.ScootersTopBanner.TopBannerCommunication.TopBannerCommunicationStyle.values(), new String[]{"info", "warning", "error"}, new Annotation[][]{null, null, null});
            case 21:
                com.yandex.go.scooters.promocodes.data.model.c cVar2 = ScootersPromocodesUseResponse.Companion;
                return new p53(w7s.a, 0);
            case 22:
                return vez0.g("com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen", ScootersPromotionsScreen.values(), new String[]{"scooters_order_reservation", "scooters_order_riding", "scooters_order_parking", "scooters_feedback_finish", "scooters_feedback_cancel", "scooters_discovery", "scooters_offer"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 23:
                return new r5g0();
            case 24:
                return kotlin.collections.b.i(new Pair(DecodeHintType.TRY_HARDER, Boolean.TRUE), new Pair(DecodeHintType.POSSIBLE_FORMATS, Collections.singletonList(BarcodeFormat.QR_CODE)));
            case 25:
                return new p53(auu0.a, 0);
            case 26:
                return new p53(lvo0.a, 0);
            case 27:
                return new o4o("com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseWindowButtonActionDto.Close", i.INSTANCE, new Annotation[0]);
            case 28:
                return new o4o("com.yandex.go.scooters.subscription.data.model.ScootersSubscriptionPurchaseWindowButtonActionDto.Unknown", k.INSTANCE, new Annotation[0]);
            default:
                j jVar = ScootersUnfreezePassAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
        }
    }
}
