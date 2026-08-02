package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;

/* compiled from: AdsItemNavigationEvent.kt */
/* loaded from: classes17.dex */
public final class jy0 implements ky0 {
    public final SdkClipVideoFile a;

    public jy0(SdkClipVideoFile sdkClipVideoFile) {
        this.a = sdkClipVideoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jy0) && epx.f(this.a, ((jy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cq.d(new StringBuilder("OpenMoreMenu(clip="), this.a, ')');
    }
}
