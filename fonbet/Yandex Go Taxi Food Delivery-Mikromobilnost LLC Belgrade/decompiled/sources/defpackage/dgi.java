package defpackage;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import java.util.ArrayList;
import java.util.List;
import kotlin.a;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.DeliveryIconStrategyDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries.DeliveryTrackingItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries.DeliveryTrackingMapInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries.DeliveryTrackingPaidWaitingInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries.DeliveryTrackingPerformerInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliveries.DeliveryTrackingPerformerSearchInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.deliverystate.DynamicSearchStatusDto;

/* loaded from: classes9.dex */
public final class dgi implements bgi {
    public final Moshi a;
    public final xwa0 b;
    public final ow c;
    public final ovd0 d;
    public final s701 e;
    public final j5v f;
    public final hxb0 g;
    public final ga90 h;
    public final gp50 i;
    public final i3y j = a.a(new sbc(9, this));

    public dgi(Moshi moshi, xwa0 xwa0Var, ow owVar, ovd0 ovd0Var, s701 s701Var, j5v j5vVar, hxb0 hxb0Var, ga90 ga90Var, gp50 gp50Var) {
        this.a = moshi;
        this.b = xwa0Var;
        this.c = owVar;
        this.d = ovd0Var;
        this.e = s701Var;
        this.f = j5vVar;
        this.g = hxb0Var;
        this.h = ga90Var;
        this.i = gp50Var;
    }

    public final hfi a(String str) {
        try {
            DeliveryTrackingItemDto deliveryTrackingItemDto = (DeliveryTrackingItemDto) ((JsonAdapter) this.j.getValue()).fromJson(str);
            if (deliveryTrackingItemDto != null) {
                return b(deliveryTrackingItemDto);
            }
            return null;
        } catch (Exception e) {
            jgz jgzVar = jgz.a;
            jgz.d(e, "DeliveryTrackingOrder parse failure", new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    public final hfi b(DeliveryTrackingItemDto deliveryTrackingItemDto) {
        Long l;
        oxa0 oxa0Var;
        i5v i5vVar;
        vwa0 vwa0Var;
        fa90 fa90Var;
        Boolean shouldTrackGeo;
        ?? r9;
        String deliveryId = deliveryTrackingItemDto.getDeliveryId();
        int commitRevision = deliveryTrackingItemDto.getCommitRevision();
        boolean isCompleted = deliveryTrackingItemDto.isCompleted();
        DeliveryTrackingPerformerSearchInfoDto performerSearch = deliveryTrackingItemDto.getPerformerSearch();
        String deliveryId2 = deliveryTrackingItemDto.getDeliveryId();
        s701 s701Var = this.e;
        if (performerSearch != null) {
            l = Long.valueOf(s701Var.a(deliveryId2));
        } else {
            s701Var.b(deliveryId2);
            l = null;
        }
        EmptyList emptyList = EmptyList.a;
        if (performerSearch != null) {
            Long estimate = performerSearch.getEstimate();
            Long valueOf = estimate != null ? Long.valueOf(estimate.longValue() * 1000) : null;
            List<DynamicSearchStatusDto> dynamicSearchStatuses = performerSearch.getDynamicSearchStatuses();
            if (dynamicSearchStatuses != null) {
                List<DynamicSearchStatusDto> list = dynamicSearchStatuses;
                r9 = new ArrayList(tcc.n(list, 10));
                for (DynamicSearchStatusDto dynamicSearchStatusDto : list) {
                    r9.add(new y8n((int) dynamicSearchStatusDto.getStatusDisplayTime(), dynamicSearchStatusDto.getDynamicSummary(), dynamicSearchStatusDto.getDynamicDescription()));
                }
            } else {
                r9 = emptyList;
            }
            oxa0Var = new oxa0(l, valueOf, r9);
        } else {
            oxa0Var = null;
        }
        DeliveryTrackingMapInfoDto mapInfo = deliveryTrackingItemDto.getMapInfo();
        gfi gfiVar = new gfi(false, isCompleted, oxa0Var, false, emptyList, (mapInfo == null || (shouldTrackGeo = mapInfo.getShouldTrackGeo()) == null) ? false : shouldTrackGeo.booleanValue());
        String summary = deliveryTrackingItemDto.getSummary();
        String description = deliveryTrackingItemDto.getDescription();
        DeliveryIconStrategyDto icon = deliveryTrackingItemDto.getIcon();
        if (icon != null) {
            this.f.getClass();
            i5vVar = j5v.a(icon);
        } else {
            i5vVar = null;
        }
        DeliveryTrackingPerformerInfoDto performer = deliveryTrackingItemDto.getPerformer();
        if (performer != null) {
            this.b.getClass();
            vwa0Var = new vwa0("", "", null, performer.getVehicleNumber(), null, null, performer.getImageTagDefault(), "");
        } else {
            vwa0Var = null;
        }
        DeliveryTrackingPaidWaitingInfoDto paidWaitingInfo = deliveryTrackingItemDto.getPaidWaitingInfo();
        if (paidWaitingInfo != null) {
            this.h.getClass();
            fa90Var = new fa90(paidWaitingInfo.getFreeWaitingUntil(), paidWaitingInfo.getPaidWaitingTitle(), paidWaitingInfo.getWaitingPrice());
        } else {
            fa90Var = null;
        }
        Object meta = deliveryTrackingItemDto.getMeta();
        DeliveryTrackingMapInfoDto mapInfo2 = deliveryTrackingItemDto.getMapInfo();
        return new hfi(deliveryId, commitRevision, null, gfiVar, summary, description, i5vVar, vwa0Var, emptyList, emptyList, fa90Var, meta, mapInfo2 != null ? mapInfo2.getAdsOnMapMeta() : null, emptyList, null, null);
    }
}
