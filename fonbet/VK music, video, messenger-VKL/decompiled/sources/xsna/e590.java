package xsna;

import com.vk.clips.sdk.models.SdkImages;

/* compiled from: OwnerMappingData.kt */
/* loaded from: classes17.dex */
public final class e590 {
    public final SdkImages a;

    public e590(SdkImages sdkImages) {
        this.a = sdkImages;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e590) && epx.f(this.a, ((e590) obj).a);
    }

    public final int hashCode() {
        SdkImages sdkImages = this.a;
        if (sdkImages == null) {
            return 0;
        }
        return sdkImages.hashCode();
    }

    public final String toString() {
        return "Img(image=" + this.a + ')';
    }
}
