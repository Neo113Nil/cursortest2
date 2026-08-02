package xsna;

import android.view.MotionEvent;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class z4d implements ClipItemViewEvent {
    public final MotionEvent b;

    public z4d(MotionEvent motionEvent) {
        this.b = motionEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4d) && epx.f(this.b, ((z4d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DoubleTap(motionEvent=" + this.b + ')';
    }
}
