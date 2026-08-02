package yads;

import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import xsna.epx;

/* loaded from: classes10.dex */
public final class iu3 implements NativeAdAssets {
    public final y00 a;

    public iu3(y00 y00Var) {
        this.a = y00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iu3) && epx.f(this.a, ((iu3) obj).a);
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getAge() {
        return this.a.f;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getBody() {
        return this.a.g;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getCallToAction() {
        return this.a.h;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getDomain() {
        return this.a.i;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final NativeAdImage getImage() {
        a10 a10Var = this.a.d;
        if (a10Var != null) {
            return new ou3(a10Var);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdAssets
    public final String getWarning() {
        return this.a.o;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YandexNativeAdAssetsAdapter(assets=" + this.a + ")";
    }
}
