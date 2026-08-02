package xsna;

import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.clips.sdk.shared.item.clip.ClipItemPatch;

/* compiled from: ClipItemPatch.kt */
/* loaded from: classes17.dex */
public final class q2d implements ClipItemPatch {
    public final SdkClipVideoFile b;

    public q2d(SdkClipVideoFile sdkClipVideoFile) {
        this.b = sdkClipVideoFile;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q2d) && epx.f(this.b, ((q2d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return cq.d(new StringBuilder("UpdateShopsSimilarClip(clipVideoFile="), this.b, ')');
    }
}
