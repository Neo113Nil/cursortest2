package xsna;

import android.graphics.Bitmap;
import android.net.Uri;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.cart.api.model.DeliveryPoint;
import com.vk.log.L;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: DeliveryPointBitmapCache.kt */
/* loaded from: classes18.dex */
public final class fwl {
    public final s3q0 a = s3q0.a;
    public final LinkedHashMap b = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static Bitmap b(Image image, float f) {
        if (image != null) {
            kwl.a.getClass();
            ImageSize Cb = image.Cb(kwl.b * ((int) f), true, false);
            if (Cb != null) {
                com.vk.dto.common.im.Image image2 = Cb.d;
                int i = image2.b;
                int i2 = image2.c;
                int i3 = i > i2 ? i2 : i;
                try {
                    return (Bitmap) mcr0.i(Uri.parse(image2.d), i3, i3, 94848, null, null).y0(500L, TimeUnit.MILLISECONDS).U(new ju1(new x4(27), 20)).a();
                } catch (Throwable th) {
                    L.i(th);
                }
            }
        }
        return null;
    }

    public final Bitmap a(DeliveryPoint deliveryPoint, boolean z, String str, wzs<? super DeliveryPoint.PlaceMark, ? super Float, Bitmap> wzsVar) {
        Bitmap bitmap;
        synchronized (this.a) {
            bitmap = (Bitmap) this.b.get(str);
        }
        if (bitmap == null || bitmap.isRecycled()) {
            bitmap = wzsVar.invoke(deliveryPoint.i, Float.valueOf(z ? 2.0f : 1.0f));
            synchronized (this.a) {
                this.b.put(str, bitmap);
                s3q0 s3q0Var = s3q0.a;
            }
        }
        return bitmap;
    }
}
