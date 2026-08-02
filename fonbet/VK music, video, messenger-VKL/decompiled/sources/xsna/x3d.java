package xsna;

import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class x3d implements ClipItemViewEvent {
    public final SdkMask b;

    public x3d(SdkMask sdkMask) {
        this.b = sdkMask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x3d) && epx.f(this.b, ((x3d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MaskClicked(mask=" + this.b + ')';
    }
}
