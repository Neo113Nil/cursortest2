package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionSubtypeDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$OpenWebViewAuthActionDto;
import com.yandex.go.places.models.data.entities.network.ActionDto$WebAuthType;
import com.yandex.go.places.models.data.entities.network.d;
import com.yandex.go.places.models.data.entities.network.g;
import com.yandex.go.places.models.data.entities.network.h;
import com.yandex.go.places.models.data.entities.network.l;
import com.yandex.go.places.models.data.entities.network.n;
import com.yandex.go.places.models.data.entities.network.o;
import com.yandex.go.places.models.data.entities.network.r;
import com.yandex.go.taxi.order.models.api.status.ActionType;
import java.lang.annotation.Annotation;
import ru.yandex.taxi.common_models.net.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class du implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ du(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                fu fuVar = gu.Companion;
                return new p53(hh60.a, 0);
            case 1:
                iu iuVar = ju.Companion;
                return new p53(n9e0.a, 0);
            case 2:
                return new o4o("com.yandex.go.places.models.data.entities.network.ActionDto.DismissModalActionDto", d.INSTANCE, new Annotation[0]);
            case 3:
                g gVar = ActionDto$OpenNavigatorActionDto.Companion;
                return ActionDto$OpenNavigatorActionSubtypeDto.Companion.serializer();
            case 4:
                return vez0.g("com.yandex.go.places.models.data.entities.network.ActionDto.OpenNavigatorActionSubtypeDto", ActionDto$OpenNavigatorActionSubtypeDto.values(), new String[]{"go_via", "go_to"}, new Annotation[][]{null, null});
            case 5:
                return new o4o("com.yandex.go.places.models.data.entities.network.ActionDto.OpenPhotoViewerDto", h.INSTANCE, new Annotation[0]);
            case 6:
                l lVar = ActionDto$OpenWebViewAuthActionDto.Companion;
                return ActionDto$WebAuthType.Companion.serializer();
            case 7:
                return new o4o("com.yandex.go.places.models.data.entities.network.ActionDto.OrganizationListResetFiltersActionDto", n.INSTANCE, new Annotation[0]);
            case 8:
                return new o4o("com.yandex.go.places.models.data.entities.network.ActionDto.OrganizationListSearchActionDto", o.INSTANCE, new Annotation[0]);
            case 9:
                auu0 auu0Var = auu0.a;
                return new k8u(auu0Var, auu0Var, 1);
            case 10:
                auu0 auu0Var2 = auu0.a;
                return new k8u(auu0Var2, auu0Var2, 1);
            case 11:
                return new o4o("com.yandex.go.places.models.data.entities.network.ActionDto.Unknown", r.INSTANCE, new Annotation[0]);
            case 12:
                return vez0.g("com.yandex.go.places.models.data.entities.network.ActionDto.WebAuthType", ActionDto$WebAuthType.values(), new String[]{"oauth", "cookies", "no_auth"}, new Annotation[][]{null, null, null});
            case 13:
                return vez0.g("com.yandex.go.taxi.order.models.api.status.ActionType", ActionType.values(), new String[]{null, "go_to_screen", Constants.DEEPLINK, "repeat_order", "yandex_card_topup", "yango_pay_topup", "do_nothing"}, new Annotation[][]{null, null, null, null, null, null, null});
            case 14:
                return vez0.g("ru.yandex.taxi.persuggest.api.ActionType", ru.yandex.taxi.persuggest.api.ActionType.values(), new String[]{Constants.DEEPLINK, "search_in_google"}, new Annotation[][]{null, null});
            case 15:
                f00 f00Var = g00.Companion;
                return new p53(p.e, 0);
            case 16:
                f00 f00Var2 = g00.Companion;
                return new p53(z9q0.a, 0);
            case 17:
                return f970.Companion.serializer();
            case 18:
                return i6p.Companion.serializer();
            case 19:
                return i7s0.Companion.serializer();
            case 20:
                return uoq0.Companion.serializer();
            case 21:
                return tph.Companion.serializer();
            case 22:
                return q511.Companion.serializer();
            case 23:
                return aoq0.Companion.serializer();
            case 24:
                return o211.Companion.serializer();
            case 25:
                return e511.Companion.serializer();
            case 26:
                return sb11.Companion.serializer();
            case 27:
                return z9r.Companion.serializer();
            case 28:
                return "Taxi order was not found with the given id";
            default:
                return "ActiveOrderRemoteSettingsSender failed";
        }
    }
}
