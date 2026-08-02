package xsna;

import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.DeliveryPointId;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kyl;

/* compiled from: DeliveryPointsMapReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class txl extends FunctionReferenceImpl implements izs<hyl, kyl.a> {
    @Override // xsna.izs
    public final kyl.a invoke(hyl hylVar) {
        wyl wylVar = (wyl) this.receiver;
        wylVar.getClass();
        Collection<DeliveryPoint> values = hylVar.d.c.values();
        ArrayList arrayList = new ArrayList(c5g.u(values, 10));
        for (DeliveryPoint deliveryPoint : values) {
            String str = deliveryPoint.f;
            Coordinates a = iwl.a(deliveryPoint);
            DeliveryPointId b = iwl.b(deliveryPoint);
            fwl fwlVar = wylVar.a;
            arrayList.add(new lwl(str, a, b, fwlVar.a(deliveryPoint, false, deliveryPoint.i.b.concat("_selected=false"), new com.vk.movika.tools.controls.seekbar.v(fwlVar, deliveryPoint))));
        }
        return new kyl.a(arrayList);
    }
}
