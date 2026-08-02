package defpackage;

import android.graphics.Bitmap;
import com.yandex.div.core.images.BitmapSource;
import com.yandex.go.image.api.domain.models.ImageSource;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class ltk implements f16 {
    public final AtomicReference a;

    public ltk(btk btkVar) {
        this.a = new AtomicReference(btkVar);
    }

    @Override // defpackage.f16
    public final void b(Bitmap bitmap, ebv ebvVar, ImageSource imageSource) {
        BitmapSource bitmapSource;
        btk btkVar = (btk) this.a.getAndSet(null);
        if (btkVar != null) {
            int i = jtk.a[imageSource.ordinal()];
            if (i == 1) {
                bitmapSource = BitmapSource.NETWORK;
            } else if (i == 2) {
                bitmapSource = BitmapSource.MEMORY;
            } else {
                if (i != 3) {
                    w511.b();
                    return;
                }
                bitmapSource = BitmapSource.DISK;
            }
            btkVar.f(new thk(bitmap, bitmapSource));
        }
    }

    @Override // defpackage.f16
    public final void onError(Throwable th) {
        btk btkVar = (btk) this.a.getAndSet(null);
        if (btkVar != null) {
            btkVar.d(th);
        }
    }
}
