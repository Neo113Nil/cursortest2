package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.points_map.ui.fragment.DeliveryPointsMapFragment;

/* compiled from: DeliveryPointsMapRouterImpl.kt */
/* loaded from: classes18.dex */
public final class zxl implements yxl {
    @Override // xsna.yxl
    public final void a(Context context, UserId userId, DeliveryPoint deliveryPoint) {
        DeliveryPointsMapFragment.a aVar = new DeliveryPointsMapFragment.a();
        Bundle bundle = aVar.j;
        bundle.putBoolean("need_to_pick_delivery_point", false);
        bundle.putParcelable("picked_delivery_point", deliveryPoint);
        bundle.putParcelable("group_id", userId);
        aVar.k(context);
    }
}
