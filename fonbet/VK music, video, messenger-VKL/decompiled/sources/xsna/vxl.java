package xsna;

import android.graphics.Bitmap;
import com.vk.ecomm.cart.impl.common.models.geo.Coordinates;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.kyl;

/* compiled from: DeliveryPointsMapReducer.kt */
/* loaded from: classes18.dex */
public final /* synthetic */ class vxl extends FunctionReferenceImpl implements izs<hyl, kyl.f> {
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final kyl.f invoke(hyl hylVar) {
        wyl wylVar = (wyl) this.receiver;
        wylVar.getClass();
        Coordinates coordinates = hylVar.d.b;
        if (coordinates != null) {
            return new kyl.f(coordinates, (Bitmap) wylVar.b.getValue());
        }
        return null;
    }
}
