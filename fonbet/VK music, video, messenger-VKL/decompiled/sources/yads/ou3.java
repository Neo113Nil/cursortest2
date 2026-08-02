package yads;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import xsna.epx;

/* loaded from: classes10.dex */
public final class ou3 implements NativeAdImage {
    public final a10 a;

    public ou3(a10 a10Var) {
        this.a = a10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ou3) && epx.f(this.a, ((ou3) obj).a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdImage
    public final Bitmap getBitmap() {
        return (Bitmap) this.a.a.invoke();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdImageAdapter(image=" + this.a + ")";
    }
}
