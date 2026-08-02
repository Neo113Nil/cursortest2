package defpackage;

import com.yandex.go.shortcuts.dto.request.RouteEtaParam;
import com.yandex.go.shortcuts.dto.request.o;
import com.yandex.go.shortcuts.dto.request.p;
import com.yandex.go.shortcuts.dto.response.RouteEtaResponse;
import com.yandex.go.shortcuts.dto.response.c2;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.objects.d1;
import com.yandex.go.taxi.order.models.api.objects.g1;
import com.yandex.go.taxi.order.models.api.objects.h1;
import com.yandex.go.taxi.order.models.api.objects.i1;
import com.yandex.go.taxi.order.models.api.objects.k1;
import com.yandex.go.taxi.order.models.api.preorder.delivery.RouteDeliveryInfo;
import com.yandex.go.taxi.order.models.api.preorder.delivery.b;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ValueTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.RideCardTipsChoiceDto$ZeroTipsChoiceDto;
import com.yandex.go.taxi.order.models.api.response.tips.c;
import com.yandex.go.taxi.order.models.api.response.tips.d;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.RouteParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.w0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.PinStateDto$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RouteParamV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalElectroBikeRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalPedestrianRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalScooterRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.RoutePartItemDto$MultimodalTaxiTransportRoutePart;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.u1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.v1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.w1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.x1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.y1;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.z1;

/* loaded from: classes14.dex */
public final /* synthetic */ class apk0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ apk0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        int i = 0;
        switch (this.a) {
            case 0:
                c cVar = RideCardTipsChoiceDto$ValueTipsChoiceDto.Companion;
                break;
            case 1:
                d dVar = RideCardTipsChoiceDto$ZeroTipsChoiceDto.Companion;
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                zy11Var = zy11.a;
                break;
            case 5:
                zy11Var2 = zy11.a;
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                b bVar = RouteDeliveryInfo.Companion;
                break;
            case 10:
                o oVar = RouteEtaParam.Companion;
                break;
            case 11:
                o oVar2 = RouteEtaParam.Companion;
                break;
            case 12:
                p pVar = RouteEtaParam.Route.Companion;
                break;
            case 13:
                p pVar2 = RouteEtaParam.Route.Companion;
                break;
            case 14:
                c2 c2Var = RouteEtaResponse.Companion;
                break;
            case 15:
                d1 d1Var = RouteInfo.Companion;
                break;
            case 16:
                g1 g1Var = RouteInfo.ImageIcon.Companion;
                break;
            case 17:
                g1 g1Var2 = RouteInfo.ImageIcon.Companion;
                break;
            case 18:
                h1 h1Var = RouteInfo.PinIcon.Companion;
                break;
            case 19:
                i1 i1Var = RouteInfo.Position.Companion;
                break;
            case 20:
                break;
            case 21:
                k1 k1Var = RouteInfo.Style.Companion;
                break;
            case 22:
                break;
            case 23:
                w0 w0Var = RouteParam.Companion;
                break;
            case 24:
                u1 u1Var = RouteParamV2.Companion;
                break;
            case 25:
                v1 v1Var = RoutePartItemDto$MultimodalBikeRoutePart.Companion;
                break;
            case 26:
                w1 w1Var = RoutePartItemDto$MultimodalElectroBikeRoutePart.Companion;
                break;
            case 27:
                x1 x1Var = RoutePartItemDto$MultimodalPedestrianRoutePart.Companion;
                break;
            case 28:
                y1 y1Var = RoutePartItemDto$MultimodalScooterRoutePart.Companion;
                break;
            default:
                z1 z1Var = RoutePartItemDto$MultimodalTaxiTransportRoutePart.Companion;
                break;
        }
        return new p53(PinStateDto$$serializer.INSTANCE, 0);
    }
}
