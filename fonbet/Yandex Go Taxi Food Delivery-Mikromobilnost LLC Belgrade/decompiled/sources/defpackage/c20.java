package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeRequest;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse$ActionButton$$serializer;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse$HomeActionButtonState$$serializer;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse$InputField$$serializer;
import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse$PhoneFormat$$serializer;
import com.yandex.go.payments.addmethod.data.model.a;
import com.yandex.go.payments.addmethod.data.model.b0;
import com.yandex.go.payments.addmethod.data.model.d;
import com.yandex.go.payments.addmethod.data.model.e;
import com.yandex.go.payments.addmethod.data.model.n;
import com.yandex.go.payments.addmethod.data.model.o;
import com.yandex.go.payments.data.model.response.AddPaymentMethodButton;
import com.yandex.go.payments.data.model.response.AddSbpTokenButtonDto;
import com.yandex.go.payments.data.model.response.f;
import com.yandex.go.places.models.data.entities.network.actions.AddVideoInQueueAction;
import com.yandex.messaging.core.net.entities.BackendConfig;
import com.yandex.messaging.ui.auth.ProxyPassportActivity;
import defpackage.cn0;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.collections.EmptySet;
import ru.yandex.taxi.object.DriveState;
import ru.yandex.taxi.persuggest.api.ActionButtonSize;
import ru.yandex.taxi.persuggest.api.ActionType;
import ru.yandex.taxi.persuggest.api.AdditionalButtonStyle;
import ru.yandex.taxi.scooters.data.model.PhotoType;

/* loaded from: classes13.dex */
public final /* synthetic */ class c20 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ c20(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                e20 e20Var = f20.Companion;
                return DriveState.Companion.serializer();
            case 1:
                u20 u20Var = v20.Companion;
                return new p53(q20.a, 0);
            case 2:
                return UUID.randomUUID().toString();
            case 3:
                return new p53(igb0.a, 0);
            case 4:
                return PhotoType.Companion.serializer();
            case 5:
                return EmptySet.a;
            case 6:
                a aVar = AddPaymentHomeRequest.Companion;
                return new p53(e6m.a, 0);
            case 7:
                d dVar = AddPaymentHomeResponse.ActionButton.Companion;
                return new p53(AddPaymentHomeResponse$HomeActionButtonState$$serializer.INSTANCE, 0);
            case 8:
                e eVar = AddPaymentHomeResponse.BindDialog.Companion;
                return new p53(AddPaymentHomeResponse$ActionButton$$serializer.INSTANCE, 0);
            case 9:
                e eVar2 = AddPaymentHomeResponse.BindDialog.Companion;
                return new p53(AddPaymentHomeResponse$InputField$$serializer.INSTANCE, 0);
            case 10:
                e eVar3 = AddPaymentHomeResponse.BindDialog.Companion;
                return AddPaymentHomeResponse.DisplayType.Companion.serializer();
            case 11:
                return vez0.g("com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse.ButtonState", AddPaymentHomeResponse.ButtonState.values(), new String[]{BackendConfig.Restrictions.ENABLED, BackendConfig.Restrictions.DISABLED, "busy"}, new Annotation[][]{null, null, null});
            case 12:
                return vez0.g("com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse.DisplayType", AddPaymentHomeResponse.DisplayType.values(), new String[]{"bottom", "fullscreen"}, new Annotation[][]{null, null});
            case 13:
                return vez0.g("com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse.FieldType", AddPaymentHomeResponse.FieldType.values(), new String[]{ProxyPassportActivity.KEY_PHONE_NUMBER}, new Annotation[][]{null});
            case 14:
                n nVar = AddPaymentHomeResponse.HomeActionButtonState.Companion;
                return AddPaymentHomeResponse.ButtonState.Companion.serializer();
            case 15:
                o oVar = AddPaymentHomeResponse.HomeInfoScreen.Companion;
                return new p53(AddPaymentHomeResponse$ActionButton$$serializer.INSTANCE, 0);
            case 16:
                o oVar2 = AddPaymentHomeResponse.HomeInfoScreen.Companion;
                return AddPaymentHomeResponse.DisplayType.Companion.serializer();
            case 17:
                b0 b0Var = AddPaymentHomeResponse.Validation.Companion;
                return AddPaymentHomeResponse.FieldType.Companion.serializer();
            case 18:
                b0 b0Var2 = AddPaymentHomeResponse.Validation.Companion;
                return new p53(AddPaymentHomeResponse$PhoneFormat$$serializer.INSTANCE, 0);
            case 19:
                f fVar = AddPaymentMethodButton.Companion;
                return AddPaymentMethodButton.AddButtonType.Companion.serializer();
            case 20:
                f fVar2 = AddPaymentMethodButton.Companion;
                return AddSbpTokenButtonDto.StateType.Companion.serializer();
            case 21:
                com.yandex.go.payments.data.model.response.d dVar2 = AddPaymentMethodButton.AddButtonFlow.Companion;
                return AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType.Companion.serializer();
            case 22:
                return vez0.g("com.yandex.go.payments.data.model.response.AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType", AddPaymentMethodButton.AddButtonFlow.AddButtonFlowType.values(), new String[]{Constants.DEEPLINK, "transport_external", null}, new Annotation[][]{null, null, null});
            case 23:
                com.yandex.go.places.models.data.entities.network.actions.a aVar2 = AddVideoInQueueAction.Companion;
                return vez0.g("com.yandex.go.places.models.data.entities.network.actions.AddVideoInQueueAction.Operation", AddVideoInQueueAction.Operation.values(), new String[]{"ADD", "REMOVE", "RE_ADD_TO_END"}, new Annotation[][]{null, null, null});
            case 24:
                tk0 tk0Var = uk0.Companion;
                return ActionType.Companion.serializer();
            case 25:
                cl0 cl0Var = dl0.Companion;
                return AdditionalButtonStyle.Companion.serializer();
            case 26:
                cl0 cl0Var2 = dl0.Companion;
                return ActionButtonSize.Companion.serializer();
            case 27:
                return vez0.g("ru.yandex.taxi.persuggest.api.AdditionalButtonStyle", AdditionalButtonStyle.values(), new String[]{"default", "action"}, new Annotation[][]{null, null});
            case 28:
                vl0 vl0Var = ul0.Companion;
                return new p53(sl0.a, 0);
            default:
                ln0 ln0Var = cn0.e.Companion;
                return new p53(auu0.a, 0);
        }
    }
}
