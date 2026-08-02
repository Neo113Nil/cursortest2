package xsna;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdImage;

/* compiled from: YandexNativeAdImpl.kt */
/* loaded from: classes14.dex */
public final class d5y0 implements z4y0 {
    public final NativeAd a;

    public d5y0(NativeAd nativeAd) {
        this.a = nativeAd;
    }

    @Override // xsna.z4y0
    public final String a() {
        return this.a.getAdAssets().getCallToAction();
    }

    @Override // xsna.z4y0
    public final String b() {
        return this.a.getAdAssets().getBody();
    }

    @Override // xsna.z4y0
    public final String getAge() {
        return this.a.getAdAssets().getAge();
    }

    @Override // xsna.z4y0
    public final String getDomain() {
        return this.a.getAdAssets().getDomain();
    }

    @Override // xsna.z4y0
    public final Bitmap getImage() {
        NativeAdImage image = this.a.getAdAssets().getImage();
        if (image != null) {
            return image.getBitmap();
        }
        return null;
    }

    @Override // xsna.z4y0
    public final String getWarning() {
        return this.a.getAdAssets().getWarning();
    }
}
