package defpackage;

import com.yandex.go.dto.response.Action$ChargersDiscounts;
import com.yandex.go.dto.response.Action$Marketplace;
import com.yandex.go.dto.response.Action$Media;
import com.yandex.go.dto.response.n;
import com.yandex.go.dto.response.z;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentActionButton$$serializer;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonAction;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonActionType;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentFullscreen;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatus;
import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatusResponse;
import com.yandex.go.payments.acceptance.data.model.b;
import com.yandex.go.payments.acceptance.data.model.d;
import com.yandex.go.payments.acceptance.data.model.g;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.data.model.Account$ReportOption$$serializer;
import com.yandex.go.payments.shared.data.model.Member$$serializer;
import com.yandex.go.payments.shared.data.model.a;
import com.yandex.go.safety.center.api.AccidentsResponse;
import com.yandex.go.safety.center.api.AccidentsResponse$Accident$$serializer;
import com.yandex.go.safety.center.api.c;
import com.yandex.go.taxi.order.models.api.cancel.e;
import com.yandex.go.taxi.order.models.api.cancel.h;
import com.yandex.go.taxi.order.models.api.cancel.j;
import com.yandex.quark.alice.AliceSessionType;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.persuggest.api.suggest.Action;
import ru.yandex.taxi.plus.api.dto.Action;

/* loaded from: classes13.dex */
public final /* synthetic */ class pd implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ pd(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                b bVar = AcceptancePaymentButtonAction.Companion;
                return AcceptancePaymentButtonActionType.Companion.serializer();
            case 1:
                return vez0.g("com.yandex.go.payments.acceptance.data.model.AcceptancePaymentButtonActionType", AcceptancePaymentButtonActionType.values(), new String[]{"open_payment_url", "cancel_payment", null}, new Annotation[][]{null, null, null});
            case 2:
                d dVar = AcceptancePaymentFullscreen.Companion;
                return new p53(AcceptancePaymentActionButton$$serializer.INSTANCE, 0);
            case 3:
                return vez0.g("com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatus", AcceptancePaymentStatus.values(), new String[]{"processing", "success", "fail", "cancelled", "not_created", null}, new Annotation[][]{null, null, null, null, null, null});
            case 4:
                g gVar = AcceptancePaymentStatusResponse.Companion;
                return AcceptancePaymentStatus.Companion.serializer();
            case 5:
                c cVar = AccidentsResponse.Companion;
                return new p53(AccidentsResponse$Accident$$serializer.INSTANCE, 0);
            case 6:
                com.yandex.go.safety.center.api.b bVar2 = AccidentsResponse.Accident.Companion;
                return AccidentsResponse.Status.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.safety.center.api.AccidentsResponse.Status", AccidentsResponse.Status.values(), new String[]{"questionable", "unconfirmed", "confirmed"}, new Annotation[][]{null, null, null});
            case 8:
                a aVar = Account.Companion;
                return new p53(Member$$serializer.INSTANCE, 0);
            case 9:
                com.yandex.go.payments.shared.data.model.c cVar2 = Account.Settings.Companion;
                return new p53(Account$ReportOption$$serializer.INSTANCE, 0);
            case 10:
                return new pk(null, null);
            case 11:
                return bvf0.b();
            case 12:
                return vez0.g("ru.yandex.taxi.persuggest.api.suggest.Action", Action.values(), new String[]{"search", "user_input", "user_select"}, new Annotation[][]{null, null, null});
            case 13:
                gp gpVar = ru.yandex.taxi.plus.api.dto.Action.Companion;
                return Action.Type.Companion.serializer();
            case 14:
                gp gpVar2 = ru.yandex.taxi.plus.api.dto.Action.Companion;
                return new p53(auu0.a, 0);
            case 15:
                return new o4o("com.yandex.quark.alice.AliceSessionType", (Enum[]) AliceSessionType.values());
            case 16:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.Cancel", com.yandex.go.taxi.order.models.api.cancel.a.INSTANCE, new Annotation[0]);
            case 17:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.ChangeDriver", com.yandex.go.taxi.order.models.api.cancel.b.INSTANCE, new Annotation[0]);
            case 18:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.ChangePointA", com.yandex.go.taxi.order.models.api.cancel.c.INSTANCE, new Annotation[0]);
            case 19:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.ChangePointB", com.yandex.go.taxi.order.models.api.cancel.d.INSTANCE, new Annotation[0]);
            case 20:
                com.yandex.go.dto.response.b bVar3 = Action$ChargersDiscounts.ChargersDiscountIdentifierDto.Companion;
                return Action$ChargersDiscounts.ChargersDiscountType.Companion.serializer();
            case 21:
                return vez0.g("com.yandex.go.dto.response.Action.ChargersDiscounts.ChargersDiscountType", Action$ChargersDiscounts.ChargersDiscountType.values(), new String[]{"promocode", "discount", ""}, new Annotation[][]{null, null, null});
            case 22:
                return new o4o("com.yandex.go.dto.response.Action.CityMode.ContinuationAction.None", n.INSTANCE, new Annotation[0]);
            case 23:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.Close", e.INSTANCE, new Annotation[0]);
            case 24:
                return new o4o("ru.yandex.taxi.scooters.data.model.Action.Deposit", lp.INSTANCE, new Annotation[0]);
            case 25:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.DoNothing", h.INSTANCE, new Annotation[0]);
            case 26:
                return new o4o("com.yandex.go.taxi.order.models.api.cancel.Action.DriverChat", j.INSTANCE, new Annotation[0]);
            case 27:
                return vez0.g("com.yandex.go.dto.response.Action.Marketplace.MarketplaceTargetScreenDto", Action$Marketplace.MarketplaceTargetScreenDto.values(), new String[]{"buy", "sell"}, new Annotation[][]{null, null});
            case 28:
                z zVar = Action$Media.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            default:
                return new o4o("ru.yandex.taxi.scooters.data.model.Action.None", bq.INSTANCE, new Annotation[0]);
        }
    }
}
