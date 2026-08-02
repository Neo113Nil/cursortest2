package xsna;

import android.graphics.Bitmap;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kyl;

/* compiled from: DeliveryPointsMapReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class uxl extends FunctionReferenceImpl implements izs<hyl, kyl.d> {
    @Override // xsna.izs
    public final kyl.d invoke(hyl hylVar) {
        Bitmap bitmap;
        String str;
        wyl wylVar = (wyl) this.receiver;
        wylVar.getClass();
        DeliveryPoint deliveryPoint = hylVar.f;
        boolean z = deliveryPoint != null;
        if (deliveryPoint != null) {
            fwl fwlVar = wylVar.a;
            DeliveryPoint.Service service = deliveryPoint.e;
            if (service == DeliveryPoint.Service.SELF) {
                str = deliveryPoint.i.b.concat("_selected=true");
            } else {
                str = service.name() + "_selected=true";
            }
            bitmap = fwlVar.a(deliveryPoint, true, str, new com.vk.movika.tools.controls.seekbar.w(fwlVar, deliveryPoint));
        } else {
            bitmap = null;
        }
        return new kyl.d(z, bitmap, deliveryPoint != null ? iwl.a(deliveryPoint) : Coordinates.d);
    }
}
