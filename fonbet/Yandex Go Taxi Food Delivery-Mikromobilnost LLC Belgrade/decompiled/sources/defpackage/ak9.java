package defpackage;

import com.yandex.go.chargers.data.model.ChargersDebt;
import com.yandex.go.chargers.debt.data.model.ChargersDebtStatusResponse;
import com.yandex.go.chargers.debt.data.model.b;
import com.yandex.go.chargers.discounts.ChargersDiscountsAnalyticsProxy$TaskState;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountDto;
import com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto;
import com.yandex.go.chargers.discounts.api.data.model.a;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsResponseDto;
import com.yandex.go.chargers.discounts.data.models.ChargersDiscountStationsResponseDto$ChargersDiscountStationItem$$serializer;
import com.yandex.go.chargers.discounts.data.models.e;
import com.yandex.go.chargers.discounts.data.models.h;
import com.yandex.go.chargers.discounts.data.models.p;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderDto;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$Button$$serializer;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto$ButtonsGroup;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemMetadataDto$Promo;
import com.yandex.go.chargers.order.data.model.ChargersActiveOrderStatusDto;
import com.yandex.go.chargers.order.data.model.ChargersOrdersTabModeDto$$serializer;
import com.yandex.go.chargers.order.data.model.Notification$$serializer;
import com.yandex.go.chargers.order.data.model.PopupDto$$serializer;
import com.yandex.go.chargers.order.data.model.b0;
import com.yandex.go.chargers.order.data.model.d0;
import com.yandex.go.chargers.order.data.model.f0;
import com.yandex.go.chargers.order.data.model.g0;
import com.yandex.go.chargers.order.data.model.l;
import com.yandex.go.chargers.order.data.model.m;
import com.yandex.go.chargers.order.data.model.n;
import com.yandex.go.chargers.order.data.model.r;
import com.yandex.go.chargers.order.data.model.v;
import com.yandex.go.chargers.order.data.model.x;
import com.yandex.go.chargers.order.data.model.y;
import java.lang.annotation.Annotation;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* loaded from: classes12.dex */
public final /* synthetic */ class ak9 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ ak9(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.Support", l.INSTANCE, new Annotation[0]);
            case 1:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.TakeCharger", m.INSTANCE, new Annotation[0]);
            case 2:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderActionDto.Unknown", n.INSTANCE, new Annotation[0]);
            case 3:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderBannerDecorationDto.Unknown", r.INSTANCE, new Annotation[0]);
            case 4:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderDetailsItemDto.Unknown", v.INSTANCE, new Annotation[0]);
            case 5:
                y yVar = ChargersActiveOrderDto.Companion;
                return ChargersActiveOrderStatusDto.Companion.serializer();
            case 6:
                y yVar2 = ChargersActiveOrderDto.Companion;
                return new p53(ik9.e, 0);
            case 7:
                y yVar3 = ChargersActiveOrderDto.Companion;
                return new p53(gk9.e, 0);
            case 8:
                y yVar4 = ChargersActiveOrderDto.Companion;
                return new p53(PopupDto$$serializer.INSTANCE, 0);
            case 9:
                y yVar5 = ChargersActiveOrderDto.Companion;
                return new p53(Notification$$serializer.INSTANCE, 0);
            case 10:
                x xVar = ChargersActiveOrderDto.ActiveCardModes.Companion;
                return new p53(ChargersOrdersTabModeDto$$serializer.INSTANCE, 0);
            case 11:
                b0 b0Var = ChargersActiveOrderItemDto$ButtonsGroup.Companion;
                return new p53(ChargersActiveOrderItemDto$Button$$serializer.INSTANCE, 0);
            case 12:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemDto.Unknown", d0.INSTANCE, new Annotation[0]);
            case 13:
                f0 f0Var = ChargersActiveOrderItemMetadataDto$Promo.Companion;
                return new k8u(auu0.a, cm2.a, 1);
            case 14:
                return new o4o("com.yandex.go.chargers.order.data.model.ChargersActiveOrderItemMetadataDto.Unknown", g0.INSTANCE, new Annotation[0]);
            case 15:
                return vez0.g("com.yandex.go.chargers.order.data.model.ChargersActiveOrderStatusDto", ChargersActiveOrderStatusDto.values(), new String[]{"created", "reservation", "execution", "leasing", "canceled", UgcLiveVideoData.UgcLiveStatus.FINISHED}, new Annotation[][]{null, null, null, null, null, null});
            case 16:
                com.yandex.go.chargers.data.model.n nVar = ChargersDebt.Companion;
                return ChargersDebt.OrderStatus.Companion.serializer();
            case 17:
                return vez0.g("com.yandex.go.chargers.data.model.ChargersDebt.OrderStatus", ChargersDebt.OrderStatus.values(), new String[]{"leasing", UgcLiveVideoData.UgcLiveStatus.FINISHED}, new Annotation[][]{null, null});
            case 18:
                b bVar = ChargersDebtStatusResponse.Companion;
                return ChargersDebtStatusResponse.Status.Companion.serializer();
            case 19:
                return vez0.g("com.yandex.go.chargers.debt.data.model.ChargersDebtStatusResponse.Status", ChargersDebtStatusResponse.Status.values(), new String[]{"success", "pending", "failed"}, new Annotation[][]{null, null, null});
            case 20:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersDiscountDetailsButtonDto.ChargersDiscountDetailsButtonAction.Close", tr9.INSTANCE, new Annotation[0]);
            case 21:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersDiscountDetailsButtonDto.ChargersDiscountDetailsButtonAction.SelectDiscountAction", vr9.INSTANCE, new Annotation[0]);
            case 22:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersDiscountDetailsButtonDto.ChargersDiscountDetailsButtonAction.Unknown", xr9.INSTANCE, new Annotation[0]);
            case 23:
                a aVar = ChargersDiscountDto.Companion;
                return ChargersDiscountTypeDto.Companion.serializer();
            case 24:
                e eVar = ChargersDiscountStationsResponseDto.Companion;
                return new p53(ChargersDiscountStationsResponseDto$ChargersDiscountStationItem$$serializer.INSTANCE, 0);
            case 25:
                return vez0.g("com.yandex.go.chargers.discounts.api.data.model.ChargersDiscountTypeDto", ChargersDiscountTypeDto.values(), new String[]{"none", "promocode", "discount", ""}, new Annotation[][]{null, null, null, null});
            case 26:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersDiscountsActivateDiscountItemDto.Unknown", h.INSTANCE, new Annotation[0]);
            case 27:
                return vez0.g("com.yandex.go.chargers.discounts.ChargersDiscountsAnalyticsProxy.TaskState", ChargersDiscountsAnalyticsProxy$TaskState.values(), new String[]{"new", "in_progress", "success"}, new Annotation[][]{null, null, null});
            case 28:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersDiscountsButtonDto.ChargersPromocodesAction.PromocodeInputAction", com.yandex.go.chargers.discounts.data.models.n.INSTANCE, new Annotation[0]);
            default:
                return new o4o("com.yandex.go.chargers.discounts.data.models.ChargersDiscountsButtonDto.ChargersPromocodesAction.Unknown", p.INSTANCE, new Annotation[0]);
        }
    }
}
