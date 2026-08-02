package defpackage;

import com.yandex.go.data.entities.network.UserPhotoActionTypeDto;
import com.yandex.go.data.entities.network.UserPhotoButtonDto;
import com.yandex.go.data.entities.network.UserPhotoButtonDto$$serializer;
import com.yandex.go.data.entities.network.UserPhotoStateResponse;
import com.yandex.go.data.entities.network.a;
import com.yandex.go.data.entities.network.b;
import com.yandex.go.explorer.impl.data.models.LocationEntryDto$$serializer;
import com.yandex.go.explorer.impl.data.models.UserLocationsRequestDto;
import com.yandex.go.explorer.impl.data.models.i;
import com.yandex.go.payments.cards.data.model.Verification;
import com.yandex.go.payments.cards.data.model.VerificationRequest;
import com.yandex.go.payments.cards.data.model.m;
import com.yandex.go.payments.cards.data.model.o;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.ValidateCommentRequestDto;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.request.c;
import com.yandex.go.taxi.summary.experiments.UserLocationToSourcePointWalkRouteExperiment;
import com.yandex.go.taxi.summary.experiments.UserLocationToSourcePointWalkRouteExperiment$AvailableTariffClasses$$serializer;
import com.yandex.go.taxi.summary.experiments.d;
import com.yandex.go.vault.data.ActionButtonTypeResponse;
import com.yandex.go.vault.data.VaultActionButtonResponse;
import com.yandex.go.vault.data.VaultActionButtonResponse$$serializer;
import com.yandex.go.vault.data.VaultPrizeResponse;
import com.yandex.go.vault.flexsdk.descriptors.widget.Vault;
import com.yandex.go.vault.flexsdk.descriptors.widget.Vault$$serializer;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultsPagerWidgetData;
import java.lang.annotation.Annotation;
import kotlinx.serialization.KSerializer;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.eatskit.dto.BleErrorCode;
import ru.yandex.taxi.eatskit.dto.SdkErrorCode;
import ru.yandex.taxi.masstransit.trains.checkout.model.VehicleTypeType;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;
import ru.yandex.taxi.scooters.data.model.VehicleType;

/* loaded from: classes14.dex */
public final /* synthetic */ class gp21 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ gp21(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d dVar = UserLocationToSourcePointWalkRouteExperiment.Companion;
                return new p53(UserLocationToSourcePointWalkRouteExperiment$AvailableTariffClasses$$serializer.INSTANCE, 0);
            case 1:
                i iVar = UserLocationsRequestDto.Companion;
                return new p53(LocationEntryDto$$serializer.INSTANCE, 0);
            case 2:
                return new bdc(xng0.controlMinor);
            case 3:
                return new bdc(xng0.textOnControlMinor);
            case 4:
                return new bdc(xng0.controlMain);
            case 5:
                return new bdc(xng0.textOnControl);
            case 6:
                return vez0.g("com.yandex.go.data.entities.network.UserPhotoActionTypeDto", UserPhotoActionTypeDto.values(), new String[]{"delete_photo", "take_selfie", "select_photo"}, new Annotation[][]{null, null, null});
            case 7:
                a aVar = UserPhotoButtonDto.Companion;
                return UserPhotoActionTypeDto.Companion.serializer();
            case 8:
                b bVar = UserPhotoStateResponse.Companion;
                return new p53(UserPhotoButtonDto$$serializer.INSTANCE, 0);
            case 9:
                zwj zwjVar = new zwj();
                zwjVar.a = r1r.b.e("coil3_disk_cache");
                return zwjVar.a();
            case 10:
                return new OkHttpClient(new OkHttpClient.a());
            case 11:
                c cVar = ValidateCommentRequestDto.Companion;
                return new p53(b0t.a, 0);
            case 12:
                c cVar2 = ValidateCommentRequestDto.Companion;
                return new p53(imx0.a, 0);
            case 13:
                return new p53(auu0.a, 0);
            case 14:
                com.yandex.go.vault.flexsdk.descriptors.widget.a aVar2 = Vault.Companion;
                return VaultRarity.Companion.serializer();
            case 15:
                com.yandex.go.vault.data.a aVar3 = VaultActionButtonResponse.Companion;
                return ActionButtonTypeResponse.Companion.serializer();
            case 16:
                com.yandex.go.vault.data.d dVar2 = VaultPrizeResponse.Companion;
                return new p53(VaultActionButtonResponse$$serializer.INSTANCE, 0);
            case 17:
                return vez0.g("com.yandex.go.vault.flexsdk.descriptors.widget.VaultRarity", VaultRarity.values(), new String[]{"common", "rare", "legendary"}, new Annotation[][]{null, null, null});
            case 18:
                com.yandex.go.vault.flexsdk.descriptors.widget.b bVar2 = VaultsPagerWidgetData.Companion;
                return new p53(Vault$$serializer.INSTANCE, 0);
            case 19:
                p531 p531Var = q531.Companion;
                return VehicleType.Companion.serializer();
            case 20:
                return vez0.g("ru.yandex.taxi.scooters.data.model.VehicleType", VehicleType.values(), new String[]{"scooter", "bike"}, new Annotation[][]{null, null});
            case 21:
                return vez0.g("ru.yandex.taxi.masstransit.trains.checkout.model.VehicleTypeType", VehicleTypeType.values(), new String[]{"bus", "aeroexpress", "suburban"}, new Annotation[][]{null, null, null});
            case 22:
                m mVar = Verification.Companion;
                return VerificationStatus.Companion.serializer();
            case 23:
                return new ssp0("ru.yandex.taxi.eatskit.dto.VerificationError", qoi0.a(a831.class), new lfx[]{qoi0.a(s731.class), qoi0.a(w731.class), qoi0.a(x731.class), qoi0.a(y731.class), qoi0.a(z731.class)}, new KSerializer[]{q731.a, u731.a, new o4o("timeout", x731.INSTANCE, new Annotation[0]), new o4o("unknown", y731.INSTANCE, new Annotation[0]), new o4o("userTooFar", z731.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 24:
                return BleErrorCode.Companion.serializer();
            case 25:
                return SdkErrorCode.Companion.serializer();
            case 26:
                return new o4o("timeout", x731.INSTANCE, new Annotation[0]);
            case 27:
                return new o4o("unknown", y731.INSTANCE, new Annotation[0]);
            case 28:
                return new o4o("userTooFar", z731.INSTANCE, new Annotation[0]);
            default:
                o oVar = VerificationRequest.Companion;
                return new p53(auu0.a, 1);
        }
    }
}
