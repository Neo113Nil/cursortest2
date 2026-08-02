package xsna;

import com.vk.clips.sdk.models.SdkCompilation;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class s3d implements ClipItemViewEvent {
    public final SdkCompilation b;

    public s3d(SdkCompilation sdkCompilation) {
        this.b = sdkCompilation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s3d) && epx.f(this.b, ((s3d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CompilationClicked(compilation=" + this.b + ')';
    }
}
