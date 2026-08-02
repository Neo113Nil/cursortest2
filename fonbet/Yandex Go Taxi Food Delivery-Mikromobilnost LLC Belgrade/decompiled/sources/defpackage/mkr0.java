package defpackage;

import com.yandex.go.payments.data.model.SharedAccountDto;
import com.yandex.go.payments.data.model.k0;
import com.yandex.go.payments.data.model.response.SharedAccount;
import com.yandex.go.payments.data.model.response.u1;
import com.yandex.go.payments.shared.data.model.SharedPayment;
import com.yandex.go.payments.shared.data.model.t;
import com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.p;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.api.ShareResponse;
import com.yandex.go.safety.center.api.Sharing;
import com.yandex.go.safety.center.api.SharingType;
import com.yandex.go.safety.center.api.TrustedContact$$serializer;
import com.yandex.go.safety.center.api.i;
import com.yandex.go.safety.center.api.l;
import com.yandex.go.safety.center.api.m;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto$$serializer;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDisplayContextDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDto;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsParams;
import com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockParams;
import com.yandex.go.sharing_personal_goals.data.model.SharingServiceNameDto;
import com.yandex.go.sharing_personal_goals.data.model.a0;
import com.yandex.go.sharing_personal_goals.data.model.g;
import com.yandex.go.sharing_personal_goals.data.model.k;
import com.yandex.go.sharing_personal_goals.data.model.y;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsDto;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsOption$$serializer;
import com.yandex.go.trusted_contacts.data.entities.network.ShareSettingsSwitches$$serializer;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.gopayments.dto.MemberRole;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ShimmeringStyle;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final /* synthetic */ class mkr0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ mkr0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                i iVar = ShareRequestParam.Companion;
                return ShareRequestParam.NotificationType.Companion.serializer();
            case 1:
                i iVar2 = ShareRequestParam.Companion;
                return new p53(auu0.a, 0);
            case 2:
                return vez0.g("com.yandex.go.safety.center.api.ShareRequestParam.NotificationType", ShareRequestParam.NotificationType.values(), new String[]{"share_location", "emergency", "instruction", "contact_request", "crash_detection"}, new Annotation[][]{null, null, null, null, null});
            case 3:
                l lVar = ShareResponse.Message.Companion;
                return new p53(auu0.a, 0);
            case 4:
                com.yandex.go.trusted_contacts.data.entities.network.i iVar3 = ShareSettingsDto.Companion;
                return new p53(ShareSettingsOption$$serializer.INSTANCE, 0);
            case 5:
                com.yandex.go.trusted_contacts.data.entities.network.i iVar4 = ShareSettingsDto.Companion;
                return new p53(ShareSettingsSwitches$$serializer.INSTANCE, 0);
            case 6:
                u1 u1Var = SharedAccount.Companion;
                return MemberRole.Companion.serializer();
            case 7:
                k0 k0Var = SharedAccountDto.Companion;
                return ListPaymentMethodDtoType.Companion.serializer();
            case 8:
                k0 k0Var2 = SharedAccountDto.Companion;
                return SharedAccountDto.MemberRole.Companion.serializer();
            case 9:
                return vez0.g("com.yandex.go.payments.data.model.SharedAccountDto.MemberRole", SharedAccountDto.MemberRole.values(), new String[]{"owner", "user", null}, new Annotation[][]{null, null, null});
            case 10:
                t tVar = SharedPayment.Companion;
                return new p53(pfa0.a, 0);
            case 11:
                return new xx10();
            case 12:
                m mVar = Sharing.Companion;
                return new p53(TrustedContact$$serializer.INSTANCE, 0);
            case 13:
                m mVar2 = Sharing.Companion;
                return SharingType.Companion.serializer();
            case 14:
                return new o4o("com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalButtonDto.Action.Close", drr0.INSTANCE, new Annotation[0]);
            case 15:
                return new o4o("com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalDto.None", g.INSTANCE, new Annotation[0]);
            case 16:
                return vez0.g("com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsDisplayContextDto", SharingPersonalGoalsDisplayContextDto.values(), new String[]{"offer_card", "ride_finish", ""}, new Annotation[][]{null, null, null});
            case 17:
                k kVar = SharingPersonalGoalsDto.Companion;
                return new p53(irr0.e, 0);
            case 18:
                k kVar2 = SharingPersonalGoalsDto.Companion;
                return new p53(SharingPersonalGoalButtonDto$$serializer.INSTANCE, 0);
            case 19:
                com.yandex.go.sharing_personal_goals.data.model.l lVar2 = SharingPersonalGoalsParams.Companion;
                return SharingServiceNameDto.Companion.serializer();
            case 20:
                return new o4o("com.yandex.go.sharing_personal_goals.data.model.SharingPersonalGoalsPromoblockDto.PromoblockDto.None", y.INSTANCE, new Annotation[0]);
            case 21:
                a0 a0Var = SharingPersonalGoalsPromoblockParams.Companion;
                return SharingServiceNameDto.Companion.serializer();
            case 22:
                a0 a0Var2 = SharingPersonalGoalsPromoblockParams.Companion;
                return SharingPersonalGoalsDisplayContextDto.Companion.serializer();
            case 23:
                tsr0 tsr0Var = usr0.Companion;
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 24:
                tsr0 tsr0Var2 = usr0.Companion;
                return new p53(auu0.a, 0);
            case 25:
                return vez0.g("com.yandex.go.sharing_personal_goals.data.model.SharingServiceNameDto", SharingServiceNameDto.values(), new String[]{"scooters", "chargers", TariffOrderFlow.ORDER_FLOW_DRIVE_KEY, ""}, new Annotation[][]{null, null, null, null});
            case 26:
                return vez0.g("com.yandex.go.safety.center.api.SharingType", SharingType.values(), new String[]{"enabled_checkbox", "disabled_checkbox", "button", null}, new Annotation[][]{null, null, null, null});
            case 27:
                cvr0 cvr0Var = dvr0.Companion;
                return ShimmeringStyle.Companion.serializer();
            case 28:
                return vez0.g("ru.yandex.taxi.shortcuts.dto.response.superapp.ShimmeringStyle", ShimmeringStyle.values(), new String[]{"market_like", "grocery_like", "eats_like", "web_like", null}, new Annotation[][]{null, null, null, null, null});
            default:
                return new o4o("com.yandex.go.places.impl.data.entities.network.organizations.filters_and_sorts.response.ShortcutChipDto.Unknown", p.INSTANCE, new Annotation[0]);
        }
    }
}
