package xsna;

import com.vk.clips.sdk.models.SdkMask;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class r3d implements ClipItemViewEvent {
    public final SdkMask b;

    public r3d(SdkMask sdkMask) {
        this.b = sdkMask;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3d) && epx.f(this.b, ((r3d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CameraMaskGridClicked(mask=" + this.b + ')';
    }
}
