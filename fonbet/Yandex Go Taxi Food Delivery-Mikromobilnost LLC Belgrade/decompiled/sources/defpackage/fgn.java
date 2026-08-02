package defpackage;

import android.view.Choreographer;
import com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.ErrorBodyLoggingRule$Type;
import com.yandex.go.eboks.objects.data.model.EboksObject$$serializer;
import com.yandex.go.eboks.objects.data.model.EboksObjectsDto;
import com.yandex.go.eboks.objects.data.model.EboksObjectsParams;
import com.yandex.go.eboks.objects.data.model.EboksObjectsSet;
import com.yandex.go.eboks.objects.data.model.EboksObjectsSet$$serializer;
import com.yandex.go.eboks.objects.data.model.EboksOption;
import com.yandex.go.eboks.objects.data.model.EboksOption$$serializer;
import com.yandex.go.eboks.objects.data.model.EboksRowanDto;
import com.yandex.go.eboks.objects.data.model.EboksRowanObjectsSet;
import com.yandex.go.eboks.objects.data.model.EboksRowanObjectsSet$$serializer;
import com.yandex.go.eboks.objects.data.model.EboksType;
import com.yandex.go.eboks.objects.data.model.EboksType$$serializer;
import com.yandex.go.eboks.objects.data.model.b;
import com.yandex.go.eboks.objects.data.model.c;
import com.yandex.go.eboks.objects.data.model.e;
import com.yandex.go.eboks.objects.data.model.f;
import com.yandex.go.eboks.objects.data.model.g;
import com.yandex.go.eboks.objects.data.model.h;
import com.yandex.go.eboks.objects.data.model.i;
import com.yandex.payment.common.result.ResultType;
import defpackage.b4o;
import java.lang.annotation.Annotation;
import javax.crypto.KeyGenerator;
import ru.CryptoPro.JCSP.JCSP;
import ru.yandex.taxi.common_models.net.map_object.Trigger;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.net.taxi.dto.request.EmailParam$Action;
import ru.yandex.taxi.plus.api.dto.state.plaque.ElementLevelDto;
import ru.yandex.taxi.preorder.suggested.menu.EntryPoint;
import ru.yandex.taxi.scooters.data.model.ScootersErrorCode;
import ru.yandex.taxi.scooters.data.model.SuperPassesDisplayVersionDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class fgn implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ fgn(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        switch (this.a) {
            case 0:
                return vez0.g("ru.yandex.taxi.eats_commons.EatsService", EatsService.values(), new String[]{"eats", "grocery", "pharmacy", "shop", "corp_food", "market", "market_viewer"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 1:
                b bVar = EboksObjectsDto.Companion;
                return new p53(EboksType$$serializer.INSTANCE, 0);
            case 2:
                b bVar2 = EboksObjectsDto.Companion;
                return new p53(EboksObjectsSet$$serializer.INSTANCE, 0);
            case 3:
                c cVar = EboksObjectsParams.Companion;
                return new p53(auu0.a, 0);
            case 4:
                c cVar2 = EboksObjectsParams.Companion;
                return new p53(gin.Companion.serializer(), 0);
            case 5:
                return Choreographer.getInstance();
            case 6:
                e eVar = EboksObjectsSet.Companion;
                return new p53(EboksObject$$serializer.INSTANCE, 0);
            case 7:
                f fVar = EboksOption.Companion;
                return Trigger.Companion.serializer();
            case 8:
                f fVar2 = EboksOption.Companion;
                return new p53(auu0.a, 0);
            case 9:
                g gVar = EboksRowanDto.Companion;
                return new p53(EboksType$$serializer.INSTANCE, 0);
            case 10:
                g gVar2 = EboksRowanDto.Companion;
                return new p53(EboksRowanObjectsSet$$serializer.INSTANCE, 0);
            case 11:
                h hVar = EboksRowanObjectsSet.Companion;
                return new p53(b0t.a, 0);
            case 12:
                i iVar = EboksType.Companion;
                return new p53(EboksOption$$serializer.INSTANCE, 0);
            case 13:
                oqn oqnVar = ElementLevelDto.Companion;
                return ElementLevelDto.Type.Companion.serializer();
            case 14:
                return vez0.g("ru.yandex.taxi.plus.api.dto.state.plaque.ElementLevelDto.Type", ElementLevelDto.Type.values(), new String[]{"widget", "widget_group", null}, new Annotation[][]{null, null, null});
            case 15:
                a7u0 a7u0Var = xqn.a;
                return vah.a;
            case 16:
                return new y7m(0.0f);
            case 17:
                return EmailParam$Action.Companion.serializer();
            case 18:
                return vez0.g("ru.yandex.taxi.net.taxi.dto.request.EmailParam.Action", EmailParam$Action.values(), new String[]{"set", "unset", "get"}, new Annotation[][]{null, null, null});
            case 19:
                zy11Var = zy11.a;
                return zy11Var;
            case 20:
                return new wvn(null);
            case 21:
                KeyGenerator keyGenerator = KeyGenerator.getInstance(JCSP.AES_NAME);
                keyGenerator.init(128);
                return keyGenerator.generateKey();
            case 22:
                return new p53(u0o.a, 0);
            case 23:
                return new p53(x0o.a, 0);
            case 24:
                w3o w3oVar = x3o.Companion;
                return new p53(h3o.a, 0);
            case 25:
                c4o c4oVar = b4o.Companion;
                return SuperPassesDisplayVersionDto.Companion.serializer();
            case 26:
                return vez0.g("ru.yandex.taxi.preorder.suggested.menu.EntryPoint", EntryPoint.values(), new String[]{"long_tap", "dots", "super_app_header"}, new Annotation[][]{null, null, null});
            case 27:
                f4o f4oVar = b4o.b.Companion;
                return new p53(g4o.a, 0);
            case 28:
                return new o4o("com.yandex.fintechsdk.features.bdui.internal.presentation.action.ftrequest.ErrorBodyLoggingRule.Type", (Enum[]) ErrorBodyLoggingRule$Type.values());
            default:
                g9o g9oVar = h9o.Companion;
                return vez0.g("ru.yandex.taxi.scooters.data.model.ScootersErrorCode", ScootersErrorCode.values(), new String[]{ResultType.RESULT_TYPE_FAILURE, "timeout", "connection_not_found", "internal_error", "success", "offer_expired", "card_not_allowed_by_restriction", "payment_required", "incorrect_car_position", "incorrect_scooter_position", "scooter_is_not_in_fix_finish_area", "user_have_rented_car", "car_is_busy", "deposit_fails", "required_deposit_is_not_held", "not_enough_charge", "too_close_destination", "too_far_destination", "bike_wheel_is_not_locked", "invalid_payment_method", "photo_verification_required", "photo_verification_with_passport_required", "check_verification_status", "pd_data_unfilled", "locked_resources_limit_enriched", "mos_ru_failed", "frauder", "no_funds", "resource_locked"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
        }
    }
}
