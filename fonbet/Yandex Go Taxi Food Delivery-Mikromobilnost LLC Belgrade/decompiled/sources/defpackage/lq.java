package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.chargers.data.model.d;
import com.yandex.go.dto.response.Action$Payload;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.dto.response.Action$SdcRouteSelection;
import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.Action$WebApp;
import com.yandex.go.dto.response.a1;
import com.yandex.go.dto.response.j0;
import com.yandex.go.dto.response.n0;
import com.yandex.go.overdraft.data.model.ActionButtonPrerequisite;
import com.yandex.go.overdraft.data.model.ConditionType;
import com.yandex.go.overdraft.data.model.DebtUiOpenSource;
import com.yandex.go.payments.data.model.response.ActionButton;
import com.yandex.go.payments.data.model.response.b;
import com.yandex.go.taxi.order.models.api.cancel.m;
import com.yandex.go.taxi.order.models.api.response.c;
import com.yandex.go.vault.data.ActionButtonTypeResponse;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.communications.model.widgets.e0;
import ru.yandex.taxi.communications.model.widgets.j;
import ru.yandex.taxi.communications.model.widgets.l0;
import ru.yandex.taxi.communications.model.widgets.m0;
import ru.yandex.taxi.communications.model.widgets.q;
import ru.yandex.taxi.communications.model.widgets.x;
import ru.yandex.taxi.personalstate.api.network.objects.DataType;
import ru.yandex.taxi.persuggest.api.ActionButtonSize;
import ru.yandex.taxi.plus.api.dto.Action;

/* loaded from: classes12.dex */
public final /* synthetic */ class lq implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ lq(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                j0 j0Var = Action$Payload.Companion;
                return Action$Payload.Mode.Companion.serializer();
            case 1:
                j0 j0Var2 = Action$Payload.Companion;
                return jsq0.Companion.serializer(Action$Payload.ObjectType.Companion.serializer());
            case 2:
                n0 n0Var = Action$RouteInput.AdditionalAction.Companion;
                return Action$RouteInput.AdditionalActionType.Companion.serializer();
            case 3:
                return vez0.g("com.yandex.go.dto.response.Action.RouteInput.AdditionalActionType", Action$RouteInput.AdditionalActionType.values(), new String[]{"preorder", "order_to_another", null}, new Annotation[][]{null, null, null});
            case 4:
                a1 a1Var = Action$SdcRouteSelection.Screen.Companion;
                return Action$SdcRouteSelection.ScreenType.Companion.serializer();
            case 5:
                return vez0.g("com.yandex.go.dto.response.Action.SdcRouteSelection.ScreenType", Action$SdcRouteSelection.ScreenType.values(), new String[]{"a", "b"}, new Annotation[][]{null, null});
            case 6:
                return vez0.g("com.yandex.go.dto.response.Action.SummaryRedirect.State", Action$SummaryRedirect.State.values(), new String[]{"collapsed", "expanded", "anchored"}, new Annotation[][]{null, null, null});
            case 7:
                return vez0.g("ru.yandex.taxi.plus.api.dto.Action.Type", Action.Type.values(), new String[]{"DEEPLINK", "URL", "SETTING", "PLUS_SDK_HOOK", "OPEN_TYPED_SCREEN", null}, new Annotation[][]{null, null, null, null, null, null});
            case 8:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.Unknown", m.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("com.yandex.go.taxi.order.models.api.response.Action.Unsupported", c.INSTANCE, new Annotation[0]);
            case 10:
                return new o4o("com.yandex.go.chargers.data.model.Action.Unsupported", d.INSTANCE, new Annotation[0]);
            case 11:
                return vez0.g("com.yandex.go.dto.response.Action.WebApp.WebAppType", Action$WebApp.WebAppType.values(), new String[]{"UNKNOWN"}, new Annotation[][]{null});
            case 12:
                as asVar = ActionButton.Companion;
                return ActionButton.ButtonTextStyle.Companion.serializer();
            case 13:
                b bVar = com.yandex.go.payments.data.model.response.ActionButton.Companion;
                return ActionButton.ActionType.Companion.serializer();
            case 14:
                return vez0.g("com.yandex.go.payments.data.model.response.ActionButton.ActionType", ActionButton.ActionType.values(), new String[]{"close", "start_binding", null}, new Annotation[][]{null, null, null});
            case 15:
                return new o4o("ru.yandex.taxi.communications.model.widgets.ActionButton.AddPromoCode", ru.yandex.taxi.communications.model.widgets.d.INSTANCE, new Annotation[0]);
            case 16:
                return vez0.g("ru.yandex.taxi.communications.model.widgets.ActionButton.ButtonTextStyle", ActionButton.ButtonTextStyle.values(), new String[]{"default", "accent"}, new Annotation[][]{null, null});
            case 17:
                j jVar = ActionButton.b.Companion;
                return new p53(auu0.a, 0);
            case 18:
                return new o4o("ru.yandex.taxi.communications.model.widgets.ActionButton.CloseModalViewAndDeclineRoboOrder", q.INSTANCE, new Annotation[0]);
            case 19:
                return new o4o("ru.yandex.taxi.communications.model.widgets.ActionButton.DoNothing", x.INSTANCE, new Annotation[0]);
            case 20:
                return new o4o("ru.yandex.taxi.communications.model.widgets.ActionButton.Order", e0.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("ru.yandex.taxi.communications.model.widgets.ActionButton.ShareRoute", l0.INSTANCE, new Annotation[0]);
            case 22:
                return new o4o("ru.yandex.taxi.communications.model.widgets.ActionButton.Unknown", m0.INSTANCE, new Annotation[0]);
            case 23:
                return new o4o("ru.yandex.taxi.communications.model.widgets.ActionButton.WebView", ru.yandex.taxi.communications.model.widgets.n0.INSTANCE, new Annotation[0]);
            case 24:
                com.yandex.go.overdraft.data.model.b bVar2 = ActionButtonPrerequisite.Companion;
                return ConditionType.Companion.serializer();
            case 25:
                com.yandex.go.overdraft.data.model.b bVar3 = ActionButtonPrerequisite.Companion;
                return jsq0.Companion.serializer(DebtUiOpenSource.Companion.serializer());
            case 26:
                return vez0.g("ru.yandex.taxi.persuggest.api.ActionButtonSize", ActionButtonSize.values(), new String[]{"xs", "s", "m", "l"}, new Annotation[][]{null, null, null, null});
            case 27:
                return vez0.g("com.yandex.go.vault.data.ActionButtonTypeResponse", ActionButtonTypeResponse.values(), new String[]{"clipboard_copy", Constants.DEEPLINK, "close"}, new Annotation[][]{null, null, null});
            case 28:
                bu buVar = cu.Companion;
                return DataType.Companion.serializer();
            default:
                fu fuVar = gu.Companion;
                return new p53(ni60.a, 0);
        }
    }
}
