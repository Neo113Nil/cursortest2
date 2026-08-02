package defpackage;

import android.graphics.RuntimeShader;
import com.yandex.go.address.address_map_picker.experiment.AddressMapPickerExperiment;
import com.yandex.go.address.address_map_picker.experiment.a;
import com.yandex.go.address.models.AddressFinalizeTrigger;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationGeopointWrapper;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationItemDto;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationItemType;
import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.flex.common.analytics.models.AdjustEventPayload;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Coordinates;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.b;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.c;
import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton$$serializer;
import com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButtons;
import com.yandex.go.taxi.order.models.api.cancel.r;
import com.yandex.go.taxi.order.models.api.cancel.s;
import com.yandex.go.taxi.order.models.api.cancel.v;
import com.yandex.mapkit.search.SearchFactory;
import com.yandex.mapkit.search.SearchManagerType;
import java.lang.annotation.Annotation;
import kotlin.Pair;
import ru.yandex.taxi.common_models.net.Orientation;
import ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction;
import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationButton;
import ru.yandex.taxi.common_models.net.map_object.AddressConfirmationContent;
import ru.yandex.taxi.common_models.net.map_object.d;
import ru.yandex.taxi.common_models.net.map_object.k;

/* loaded from: classes5.dex */
public final /* synthetic */ class pn0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ pn0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                d dVar = AdditionalRequestAction.AdditionalRequestParams.Companion;
                return AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType.Companion.serializer();
            case 1:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType", AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType.values(), new String[]{"a", "b", null}, new Annotation[][]{null, null, null});
            case 2:
                return kq0.c;
            case 3:
                sr0 sr0Var = AddressConfirmationButton.Companion;
                return AddressConfirmationButton.ButtonStyle.Companion.serializer();
            case 4:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.AddressConfirmationButton.ButtonStyle", AddressConfirmationButton.ButtonStyle.values(), new String[]{"main", "minor"}, new Annotation[][]{null, null});
            case 5:
                tr0 tr0Var = AddressConfirmationContent.Companion;
                return AddressConfirmationContent.Type.Companion.serializer();
            case 6:
                return vez0.g("ru.yandex.taxi.common_models.net.map_object.AddressConfirmationContent.Type", AddressConfirmationContent.Type.values(), new String[]{"starting_address", null}, new Annotation[][]{null, null});
            case 7:
                b bVar = AddressDto$Coordinates.Companion;
                return new p53(e6m.a, 0);
            case 8:
                return new o4o("com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto.CurrentA", c.INSTANCE, new Annotation[0]);
            case 9:
                return new o4o("com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto.Unsupported", com.yandex.go.taxi.intercity.dashboard.api.data.entity.d.INSTANCE, new Annotation[0]);
            case 10:
                return vez0.g("com.yandex.go.address.models.AddressFinalizeTrigger", AddressFinalizeTrigger.values(), new String[]{"tariff_changed", "requirements_changed", null}, new Annotation[][]{null, null, null});
            case 11:
                return SearchFactory.getInstance().createSearchManager(SearchManagerType.COMBINED);
            case 12:
                a aVar = AddressMapPickerExperiment.Companion;
                return new p53(zz0.a, 0);
            case 13:
                return new z21();
            case 14:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 15:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 16:
                com.yandex.go.flex.common.analytics.models.a aVar2 = AdjustEventPayload.Companion;
                auu0 auu0Var3 = auu0.a;
                return new k8u(qke.n(auu0Var3), qke.n(auu0Var3), 1);
            case 17:
                com.yandex.go.flex.common.analytics.models.a aVar3 = AdjustEventPayload.Companion;
                auu0 auu0Var4 = auu0.a;
                return new k8u(qke.n(auu0Var4), qke.n(auu0Var4), 1);
            case 18:
                return new o4o("ru.yandex.taxi.common_models.net.map_object.AdjustmentScreen.Unknown", k.INSTANCE, new Annotation[0]);
            case 19:
                auu0 auu0Var5 = auu0.a;
                return new k8u(auu0Var5, auu0Var5, 1);
            case 20:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton.Action.ToSummary", r.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.AfterCancelPopupButton.Action.Unknown", s.INSTANCE, new Annotation[0]);
            case 22:
                v vVar = AfterCancelPopupButtons.Companion;
                return Orientation.Companion.serializer();
            case 23:
                v vVar2 = AfterCancelPopupButtons.Companion;
                return new p53(AfterCancelPopupButton$$serializer.INSTANCE, 0);
            case 24:
                sf.t();
                RuntimeShader h = sf.h((String) hkf0.a.getValue());
                sf.t();
                return new Pair(h, sf.h((String) hkf0.b.getValue()));
            case 25:
                com.yandex.go.ai_widget.data.model.b bVar2 = AiWidgetEvaluationGeopointWrapper.Companion;
                return new p53(e6m.a, 0);
            case 26:
                com.yandex.go.ai_widget.data.model.c cVar = AiWidgetEvaluationItemDto.Companion;
                return AiWidgetEvaluationItemType.Companion.serializer();
            case 27:
                com.yandex.go.ai_widget.data.model.c cVar2 = AiWidgetEvaluationItemDto.Companion;
                return AiWidgetEvaluationSwipeDirection.Companion.serializer();
            case 28:
                com.yandex.go.ai_widget.data.model.c cVar3 = AiWidgetEvaluationItemDto.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            default:
                return vez0.g("com.yandex.go.ai_widget.data.model.AiWidgetEvaluationItemType", AiWidgetEvaluationItemType.values(), new String[]{"onboarding", "evaluation"}, new Annotation[][]{null, null});
        }
    }
}
