package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.address.models.PlaceType;
import com.yandex.go.drive.unifiedpolling.dto.DriveOrderDto;
import com.yandex.go.drive.unifiedpolling.dto.DriveOrderStatusDto;
import com.yandex.go.drive.unifiedpolling.dto.a;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.objects.Driver$FeedbackBadges$$serializer;
import com.yandex.go.taxi.order.models.api.objects.Driver$ProfileFact$$serializer;
import com.yandex.go.taxi.order.models.api.objects.i;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo$ExtraItem$$serializer;
import com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock;
import com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock$Badge$$serializer;
import com.yandex.go.taxi.order.models.api.response.driver.h;
import com.yandex.go.taxi.order.models.api.response.driver.k;
import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.search.polling.model.DriverPosition$$serializer;
import com.yandex.go.taxi.order.view.driver.DriverCircleButton;
import com.yandex.go.zone.dto.objects.DriveExtra;
import com.yandex.go.zone.dto.objects.DriveExtra$Offer$$serializer;
import com.yandex.go.zone.dto.objects.a2;
import com.yx360.design.compose.atoms.carousel.DsCarousel$Variant;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.common_models.net.p;

/* loaded from: classes10.dex */
public final /* synthetic */ class jbm implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jbm(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        String show$lambda$0;
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return new Handler(Looper.getMainLooper());
            case 1:
                mcm mcmVar = ocm.Companion;
                return new p53(p.e, 0);
            case 2:
                ddm ddmVar = ddm.b;
                return new tmx(PlaceType.Companion.serializer());
            case 3:
                a2 a2Var = DriveExtra.Companion;
                return new p53(DriveExtra$Offer$$serializer.INSTANCE, 0);
            case 4:
                a aVar = DriveOrderDto.Companion;
                return DriveOrderStatusDto.Companion.serializer();
            case 5:
                return vez0.g("com.yandex.go.drive.unifiedpolling.dto.DriveOrderStatusDto", DriveOrderStatusDto.values(), new String[]{"old_state_reservation", "old_state_reservation_paid", "old_state_acceptance", "old_state_acceptance_paid", "old_state_riding", "old_state_parking", "unrecognized"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 6:
                i iVar = Driver.Companion;
                return new p53(Driver$ProfileFact$$serializer.INSTANCE, 0);
            case 7:
                i iVar2 = Driver.Companion;
                return new p53(Driver$FeedbackBadges$$serializer.INSTANCE, 0);
            case 8:
                i iVar3 = Driver.Companion;
                return new p53(OrderStatusInfo$ExtraItem$$serializer.INSTANCE, 0);
            case 9:
                com.yandex.go.taxi.order.search.polling.model.a aVar2 = DriverCandidate.Companion;
                return new p53(DriverPosition$$serializer.INSTANCE, 0);
            case 10:
                show$lambda$0 = DriverCircleButton.show$lambda$0();
                return show$lambda$0;
            case 11:
                return "Error while download driver photo";
            case 12:
                k kVar = DriverInfoBadgesBlock.Companion;
                return new p53(DriverInfoBadgesBlock$Badge$$serializer.INSTANCE, 0);
            case 13:
                return new o4o("com.yandex.go.taxi.order.models.api.response.driver.DriverInfoBadgesBlock.Badge.Background.Unknown", h.INSTANCE, new Annotation[0]);
            case 14:
                return "Error while loading pictures for driver";
            case 15:
                return wim.a;
            case 16:
                zy11Var = zy11.a;
                return zy11Var;
            case 17:
                return new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "DrivingStateViewPresenter");
            case 18:
                qnm.d.getClass();
                return new y7m(8.0f);
            case 19:
                qwd qwdVar = oom.a;
                return Float.valueOf(1.0f);
            case 20:
                qwd qwdVar2 = oom.a;
                return 99;
            case 21:
                int i = qpm.a;
                return Boolean.FALSE;
            case 22:
                return DsCarousel$Variant.Neutral;
            case 23:
                a7u0 a7u0Var = mrm.a;
                return Boolean.TRUE;
            case 24:
                a7u0 a7u0Var2 = mrm.a;
                return Boolean.FALSE;
            case 25:
                qwd qwdVar3 = yrm.a;
                return Boolean.FALSE;
            case 26:
                return Float.valueOf(Float.POSITIVE_INFINITY);
            case 27:
                float f = com.yx360.design.compose.atoms.snackbar.a.a;
                return null;
            case 28:
                return Float.valueOf(0.75f);
            default:
                throw new IllegalArgumentException("Brand color is not set. Use in Ds.BrandTheme context");
        }
    }
}
