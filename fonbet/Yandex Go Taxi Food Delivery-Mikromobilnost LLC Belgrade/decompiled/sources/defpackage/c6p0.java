package defpackage;

import com.yandex.go.flex.main_screen.actions.SdcRouteSelectionAction;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.scooters.data_form.data.model.ScootersUpdatePdDataErrorResponse;
import com.yandex.go.scooters.data_form.data.model.a;
import com.yandex.go.scooters.passes.data.model.actions.ScootersUnfreezePassAction;
import com.yandex.go.scooters.passes.data.model.actions.j;
import com.yandex.go.scooters.qr.data.model.f;
import com.yandex.go.shortcuts.dto.response.ProductsCommon$Section$$serializer;
import com.yandex.go.shortcuts.dto.response.Screen;
import com.yandex.go.shortcuts.dto.response.e1;
import com.yandex.go.shortcuts.dto.response.f2;
import com.yandex.go.taxi.order.models.api.status.ScreenType;
import flex.feature.sections.action.ScrollPositionSurrogate;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.SdkErrorCode;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.c;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.d;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.e;

/* loaded from: classes6.dex */
public final /* synthetic */ class c6p0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ c6p0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                j jVar = ScootersUnfreezePassAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 1:
                a aVar = ScootersUpdatePdDataErrorResponse.Companion;
                auu0 auu0Var = auu0.a;
                return new p53(new k8u(auu0Var, qke.n(auu0Var), 1), 0);
            case 2:
                return new o4o("com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse.AvailabilityResult.Unknown", f.INSTANCE, new Annotation[0]);
            case 3:
                c cVar = ScootersVehicleDetectionOnPhotoExperiment.a.Companion;
                return new p53(d.a, 0);
            case 4:
                e eVar = ScootersVehicleDetectionOnPhotoExperiment.b.Companion;
                return new p53(auu0.a, 0);
            case 5:
                e eVar2 = ScootersVehicleDetectionOnPhotoExperiment.b.Companion;
                return new p53(ScootersVehicleDetectionOnPhotoExperiment.VehicleType.Companion.serializer(), 0);
            case 6:
                e eVar3 = ScootersVehicleDetectionOnPhotoExperiment.b.Companion;
                return ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.Companion.serializer();
            case 7:
                return vez0.g("ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment.ResizeMode", ScootersVehicleDetectionOnPhotoExperiment.ResizeMode.values(), new String[]{"resize", "fit_center", "center_crop"}, new Annotation[][]{null, null, null});
            case 8:
                return vez0.g("ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment.VehicleType", ScootersVehicleDetectionOnPhotoExperiment.VehicleType.values(), new String[]{"scooter", "bike"}, new Annotation[][]{null, null});
            case 9:
                sjh sjhVar = uyj.a;
                return o400.a;
            case 10:
                sjh sjhVar2 = uyj.a;
                return o400.a.x;
            case 11:
                f2 f2Var = Screen.Companion;
                return new p53(ProductsCommon$Section$$serializer.INSTANCE, 0);
            case 12:
                f2 f2Var2 = Screen.Companion;
                return new p53(e1.e, 0);
            case 13:
                return new qs31();
            case 14:
                return vez0.g("com.yandex.go.taxi.order.models.api.status.ScreenType", ScreenType.values(), new String[]{null, "summary", "payment_methods", "current_order_payment_methods"}, new Annotation[][]{null, null, null, null});
            case 15:
                return new oke(qoi0.a(x5x.class), null, new KSerializer[0]);
            case 16:
                return new k8u(auu0.a, new oke(qoi0.a(kr.class), null, new KSerializer[0]), 1);
            case 17:
                return new oip0(0);
            case 18:
                return vez0.g("flex.feature.sections.action.ScrollPositionSurrogate", ScrollPositionSurrogate.values(), new String[]{"top", "center", "bottom"}, new Annotation[][]{null, null, null});
            case 19:
                return ScrollPositionSurrogate.Companion.serializer();
            case 20:
                return ScrollPositionSurrogate.Companion.serializer();
            case 21:
                ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.f fVar = ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.f.e;
                return Float.valueOf(0.0f);
            case 22:
                return new tmx(Mode.Companion.serializer());
            case 23:
                dmp0 dmp0Var = emp0.Companion;
                return new p53(b0t.a, 0);
            case 24:
                gmp0 gmp0Var = hmp0.Companion;
                return new p53(b0t.a, 0);
            case 25:
                jmp0 jmp0Var = kmp0.Companion;
                return new p53(fmp0.a, 0);
            case 26:
                com.yandex.go.flex.main_screen.actions.c cVar2 = SdcRouteSelectionAction.Screen.Companion;
                return SdcRouteSelectionAction.ScreenType.Companion.serializer();
            case 27:
                return vez0.g("com.yandex.go.flex.main_screen.actions.SdcRouteSelectionAction.ScreenType", SdcRouteSelectionAction.ScreenType.values(), new String[]{"a", "b"}, new Annotation[][]{null, null});
            case 28:
                return vez0.g("ru.yandex.taxi.eatskit.dto.SdkErrorCode", SdkErrorCode.values(), new String[]{"cancel", "invalidMasterToken", "unknownError"}, new Annotation[][]{null, null, null});
            default:
                return new h33();
        }
    }
}
