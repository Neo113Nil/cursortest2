package defpackage;

import com.yandex.go.taxi.order.details.v1.elements.live_location.DetailsCardLiveLocationUiState;
import com.yandex.go.taxi.order.models.api.objects.FreightageRideItem;
import java.util.List;
import kotlin.Metadata;

@jxi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lgqu;", "Ll050;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface gqu extends l050 {
    void hideFreightageRideBlock();

    void renderDestinationState(n5j n5jVar);

    void renderInfoState(t6j t6jVar);

    void renderPaymentState(v6j v6jVar);

    void renderRideSupportState(oqk0 oqk0Var);

    void renderRoutePointsState(g7j g7jVar);

    void renderSourceState(o7j o7jVar);

    void renderUserRequirementState(ws21 ws21Var);

    void setCostCenterState(n470 n470Var);

    void setLiveLocationState(DetailsCardLiveLocationUiState detailsCardLiveLocationUiState);

    void showFreightageRideBlock(FreightageRideItem freightageRideItem);

    void showTravelCompanionPoints(List list);
}
