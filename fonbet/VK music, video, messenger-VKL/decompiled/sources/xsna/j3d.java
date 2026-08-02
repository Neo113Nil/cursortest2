package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class j3d implements ClipItemViewEvent {
    public final boolean b;

    public j3d(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3d) && this.b == ((j3d) obj).b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b);
    }

    public final String toString() {
        return defpackage.q0.a(new StringBuilder("OnPrimaryButtonVisibilityChanged(isVisible="), this.b, ')');
    }
}
