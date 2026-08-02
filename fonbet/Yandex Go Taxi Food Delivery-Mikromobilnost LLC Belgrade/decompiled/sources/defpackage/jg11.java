package defpackage;

import com.yandex.go.dto.response.UnavailabilityAction$OpenSummaryAddress;
import com.yandex.go.safety.center.api.TrustedContact$$serializer;
import com.yandex.go.safety.center.api.TrustedContacts;
import com.yandex.go.safety.center.api.o;
import com.yandex.go.shortcuts.dto.response.Overlay$$serializer;
import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import com.yandex.go.shortcuts.dto.response.TurboButton;
import com.yandex.go.shortcuts.dto.response.a3;
import com.yandex.go.shortcuts.dto.response.b3;
import com.yandex.go.shortcuts.dto.response.c3;
import com.yandex.go.shortcuts.dto.response.d3;
import com.yandex.go.shortcuts.dto.response.z2;
import com.yandex.go.shortcuts.impl.experiments.TurboButtonExperiment;
import com.yandex.go.shortcuts.impl.experiments.TurboButtonExperiment$ServiceConfig$$serializer;
import com.yandex.go.shortcuts.impl.experiments.g;
import com.yandex.go.taxi.order.models.api.response.CardType;
import com.yandex.go.taxi.order.models.api.response.UiConfig;
import com.yandex.go.taxi.order.models.api.response.y8;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto$$serializer;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsErrorActionButtonDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsErrorActionDto;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsResponse;
import com.yandex.go.trusted_contacts.data.entities.network.TrustingContactDto$$serializer;
import com.yandex.go.trusted_contacts.data.entities.network.m;
import com.yandex.go.trusted_contacts.data.entities.network.p;
import com.yandex.go.ugc.UgcWebViewTheme;
import com.yandex.go.ultima_mode.api.data.b;
import com.yandex.go.ultima_mode.api.data.d;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executors;
import ru.yandex.taxi.common_models.net.map_object.s0;
import ru.yandex.taxi.persuggest.api.finalsuggest.UnavailabilityReasonCode;

/* loaded from: classes13.dex */
public final /* synthetic */ class jg11 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ jg11(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                o oVar = TrustedContacts.Companion;
                return new p53(TrustedContact$$serializer.INSTANCE, 0);
            case 1:
                m mVar = TrustedContactsErrorActionButtonDto.Companion;
                return TrustedContactsErrorActionDto.Companion.serializer();
            case 2:
                return vez0.g("com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsErrorActionDto", TrustedContactsErrorActionDto.values(), new String[]{"back", "back_to_contact_selection"}, new Annotation[][]{null, null});
            case 3:
                p pVar = TrustedContactsResponse.Companion;
                return new p53(TrustedContactDto$$serializer.INSTANCE, 0);
            case 4:
                p pVar2 = TrustedContactsResponse.Companion;
                return new p53(TrustingContactDto$$serializer.INSTANCE, 0);
            case 5:
                z2 z2Var = TurboButton.Companion;
                return new p53(Overlay$$serializer.INSTANCE, 0);
            case 6:
                z2 z2Var2 = TurboButton.Companion;
                return ShortcutIconSize.Companion.serializer();
            case 7:
                g gVar = TurboButtonExperiment.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 8:
                g gVar2 = TurboButtonExperiment.Companion;
                return new p53(TurboButtonExperiment$ServiceConfig$$serializer.INSTANCE, 0);
            case 9:
                return new cq11();
            case 10:
                return vez0.g("com.yandex.go.ugc.UgcWebViewTheme", UgcWebViewTheme.values(), new String[]{"light", "dark", "default"}, new Annotation[][]{null, null, null});
            case 11:
                y8 y8Var = UiConfig.Companion;
                return CardType.Companion.serializer();
            case 12:
                return new o4o("com.yandex.go.ultima_mode.api.data.UltimaModeActionDto.None", b.INSTANCE, new Annotation[0]);
            case 13:
                return new o4o("com.yandex.go.ultima_mode.api.data.UltimaModeActionDto.ToggleUltimaMode", d.INSTANCE, new Annotation[0]);
            case 14:
                return vez0.g("com.yandex.go.dto.response.UnavailabilityAction.OpenSummaryAddress.FocusField", UnavailabilityAction$OpenSummaryAddress.FocusField.values(), new String[]{"source", "destination", null}, new Annotation[][]{null, null, null});
            case 15:
                jw11 jw11Var = kw11.Companion;
                return UnavailabilityReasonCode.Companion.serializer();
            case 16:
                return vez0.g("ru.yandex.taxi.persuggest.api.finalsuggest.UnavailabilityReasonCode", UnavailabilityReasonCode.values(), new String[]{"no_experiment", "not_portal", "bad_request", "no_drive_response", "not_registered", "no_service", "no_cars", "bad_dst", "other"}, new Annotation[][]{null, null, null, null, null, null, null, null, null});
            case 17:
                return Executors.newSingleThreadExecutor();
            case 18:
                return new o4o("ru.yandex.taxi.common_models.net.Unknown", n121.INSTANCE, new Annotation[0]);
            case 19:
                return new o4o("ru.yandex.taxi.common_models.net.map_object.Unknown", s0.INSTANCE, new Annotation[0]);
            case 20:
                return new o4o("ru.yandex.taxi.communications.model.widgets.Unknown", j121.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("ru.yandex.taxi.layers.api.Unknown", k121.INSTANCE, new Annotation[0]);
            case 22:
                return new o4o("ru.yandex.taxi.masstransit.trains.checkout.model.Unknown", m121.INSTANCE, new Annotation[0]);
            case 23:
                return new o4o("com.yandex.go.shortcuts.dto.response.Unknown", a3.INSTANCE, new Annotation[0]);
            case 24:
                return new o4o("com.yandex.go.shortcuts.dto.response.UnknownAnimation", b3.INSTANCE, new Annotation[0]);
            case 25:
                return new o4o("ru.yandex.taxi.common_models.net.map_object.UnknownComponent", r121.INSTANCE, new Annotation[0]);
            case 26:
                return new o4o("ru.yandex.taxi.persuggest.api.finalsuggest.UnknownCondition", s121.INSTANCE, new Annotation[0]);
            case 27:
                return new o4o("ru.yandex.taxi.tariffs.model.UnknownExtras", x121.INSTANCE, new Annotation[0]);
            case 28:
                return new o4o("com.yandex.go.shortcuts.dto.response.UnknownPosition", c3.INSTANCE, new Annotation[0]);
            default:
                return new o4o("com.yandex.go.shortcuts.dto.response.UnknownSource", d3.INSTANCE, new Annotation[0]);
        }
    }
}
