package defpackage;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyDto$$serializer;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyPropertiesDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLineDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLineDto$$serializer;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemSizeDto;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.i;
import com.yandex.go.masstransit.sdk.core.design.slot.dto.l;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitTicketDto$$serializer;
import com.yandex.go.masstransit.sdk.order.impl.orders.f;
import com.yandex.go.shortcuts.dto.request.MarkNotifyParam;
import com.yandex.go.shortcuts.dto.request.MarkNotifyParam$AdditionalProperty$$serializer;
import com.yandex.go.shortcuts.dto.request.MarkNotifyParam$MarkNotifyItem$$serializer;
import com.yandex.go.shortcuts.dto.request.d;
import com.yandex.go.shortcuts.dto.request.e;
import com.yandex.go.shortcuts.models.ShortcutClickAction;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto;
import com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierControlPoint$$serializer;
import com.yandex.go.taxi.order.models.api.objects.c0;
import com.yandex.go.taxi.order.models.api.objects.e0;
import com.yandex.go.taxi.order.models.api.objects.h0;
import com.yandex.go.taxi.order.models.api.objects.j0;
import com.yandex.go.taxi.order.models.api.objects.l0;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$ShimmeringAnimation;
import com.yandex.go.taxi.order.models.api.route.c;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitDataParam;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitLine;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitRouteData;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitRouteDataParam$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitSectionData$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitSectionMetadataData;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MapkitTransports$$serializer;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.i0;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.q0;
import java.lang.annotation.Annotation;

/* loaded from: classes14.dex */
public final /* synthetic */ class kr00 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ kr00(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                c cVar = MapRouteAppearance$ShimmeringAnimation.Companion;
                return MapRouteAppearance$AnimationType.Companion.serializer();
            case 1:
                c0 c0Var = MapRouteParametersDto.Companion;
                return jsq0.Companion.serializer(MapRouteParametersDto.DisplayableObjectType.Companion.serializer());
            case 2:
                c0 c0Var2 = MapRouteParametersDto.Companion;
                return jsq0.Companion.serializer(MapRouteParametersDto.ZoomableObjectType.Companion.serializer());
            case 3:
                return vez0.g("com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto.DisplayableObjectType", MapRouteParametersDto.DisplayableObjectType.values(), new String[]{"starting_location", "destination_location", "pois", "transit_points", "current_location"}, new Annotation[][]{null, null, null, null, null});
            case 4:
                j0 j0Var = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.Companion;
                return new p53(MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto$BezierControlPoint$$serializer.INSTANCE, 0);
            case 5:
                e0 e0Var = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimation.Companion;
                return MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.Companion.serializer();
            case 6:
                return vez0.g("com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto.MapRouteTypeDto.BezierRouteDto.BezierAnimationType", MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.values(), new String[]{"ease_both", null}, new Annotation[][]{null, null});
            case 7:
                h0 h0Var = MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierShimmeringAnimation.Companion;
                return MapRouteParametersDto$MapRouteTypeDto$BezierRouteDto.BezierAnimationType.Companion.serializer();
            case 8:
                return new o4o("com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto.MapRouteTypeDto.UnknownType", l0.INSTANCE, new Annotation[0]);
            case 9:
                return vez0.g("com.yandex.go.taxi.order.models.api.objects.MapRouteParametersDto.ZoomableObjectType", MapRouteParametersDto.ZoomableObjectType.values(), new String[]{"starting_location", "destination_location", "current_location"}, new Annotation[][]{null, null, null});
            case 10:
                i0 i0Var = MapkitDataParam.Companion;
                return new p53(MapkitRouteDataParam$$serializer.INSTANCE, 0);
            case 11:
                com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.j0 j0Var2 = MapkitLine.Companion;
                return new p53(auu0.a, 0);
            case 12:
                com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.l0 l0Var = MapkitRouteData.Companion;
                return new p53(MapkitSectionData$$serializer.INSTANCE, 0);
            case 13:
                q0 q0Var = MapkitSectionMetadataData.Companion;
                return new p53(MapkitTransports$$serializer.INSTANCE, 0);
            case 14:
                d dVar = MarkNotifyParam.Companion;
                return new p53(MarkNotifyParam$MarkNotifyItem$$serializer.INSTANCE, 0);
            case 15:
                e eVar = MarkNotifyParam.MarkNotifyItem.Companion;
                return ShortcutClickAction.Companion.serializer();
            case 16:
                e eVar2 = MarkNotifyParam.MarkNotifyItem.Companion;
                return new p53(MarkNotifyParam$AdditionalProperty$$serializer.INSTANCE, 0);
            case 17:
                f fVar = MasstransitOrderDto.Companion;
                return new p53(MasstransitTicketDto$$serializer.INSTANCE, 0);
            case 18:
                return z310.Companion.serializer();
            case 19:
                return bw30.Companion.serializer();
            case 20:
                return new o4o("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemActionDto.ActivationWithOnboarding", k410.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemActionDto.None", m410.INSTANCE, new Annotation[0]);
            case 22:
                com.yandex.go.masstransit.sdk.core.design.slot.dto.c cVar2 = MasstransitSlotItemBodyDto.Companion;
                return new p53(MasstransitSlotItemLineDto$$serializer.INSTANCE, 0);
            case 23:
                com.yandex.go.masstransit.sdk.core.design.slot.dto.e eVar3 = MasstransitSlotItemBodyPropertiesDto.Companion;
                return MasstransitSlotItemBodyPropertiesDto.Align.Companion.serializer();
            case 24:
                return vez0.g("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemBodyPropertiesDto.Align", MasstransitSlotItemBodyPropertiesDto.Align.values(), new String[]{"start", "center", "end"}, new Annotation[][]{null, null, null});
            case 25:
                com.yandex.go.masstransit.sdk.core.design.slot.dto.f fVar2 = MasstransitSlotItemDto.Companion;
                return MasstransitSlotItemSizeDto.Companion.serializer();
            case 26:
                com.yandex.go.masstransit.sdk.core.design.slot.dto.f fVar3 = MasstransitSlotItemDto.Companion;
                return new p53(MasstransitSlotItemBodyDto$$serializer.INSTANCE, 0);
            case 27:
                com.yandex.go.masstransit.sdk.core.design.slot.dto.f fVar4 = MasstransitSlotItemDto.Companion;
                return new p53(b510.e, 0);
            case 28:
                return new o4o("com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemLeadDto.None", i.INSTANCE, new Annotation[0]);
            default:
                l lVar = MasstransitSlotItemLineDto.Companion;
                return MasstransitSlotItemLineDto.Ellipsis.Companion.serializer();
        }
    }
}
