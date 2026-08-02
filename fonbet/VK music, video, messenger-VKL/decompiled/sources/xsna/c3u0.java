package xsna;

import com.vk.attachpicker.ImageSizeLimits;
import com.vk.mediastore.system.MediaStoreEntry;
import xsna.q3u0;

/* compiled from: ViewerImageSizeValidator.kt */
/* loaded from: classes15.dex */
public final class c3u0 implements r3u0 {
    public final ImageSizeLimits a;

    public c3u0(ImageSizeLimits imageSizeLimits) {
        this.a = imageSizeLimits;
    }

    @Override // xsna.r3u0
    public final q3u0 a(MediaStoreEntry mediaStoreEntry) {
        ImageSizeLimits imageSizeLimits = this.a;
        Integer num = imageSizeLimits.b;
        Integer num2 = imageSizeLimits.c;
        Integer num3 = imageSizeLimits.d;
        Integer num4 = imageSizeLimits.e;
        return (num == null || mediaStoreEntry.getWidth() >= num.intValue()) ? (num2 == null || mediaStoreEntry.getHeight() >= num2.intValue()) ? (num3 == null || mediaStoreEntry.getWidth() <= num3.intValue()) ? (num4 == null || mediaStoreEntry.getHeight() <= num4.intValue()) ? q3u0.b.a : a3u0.b : a3u0.b : b3u0.b : b3u0.b;
    }
}
