package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;

/* compiled from: ClipMoreMenuParams.kt */
/* loaded from: classes17.dex */
public final class e930 implements z830 {
    public final SdkVideoFile a;

    public e930(SdkVideoFile sdkVideoFile) {
        this.a = sdkVideoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e930) && epx.f(this.a, ((e930) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DoNotShowAuthorClips(clip=" + this.a + ')';
    }
}
