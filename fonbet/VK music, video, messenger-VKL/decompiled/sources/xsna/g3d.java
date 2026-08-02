package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;

/* compiled from: ClipItemViewCallback.kt */
/* loaded from: classes17.dex */
public final class g3d {
    public final SdkClipVideoFile a;

    public g3d(SdkClipVideoFile sdkClipVideoFile) {
        this.a = sdkClipVideoFile;
    }

    public final SdkClipVideoFile a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3d) && epx.f(this.a, ((g3d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return cq.d(new StringBuilder("Reaction(video="), this.a, ')');
    }
}
