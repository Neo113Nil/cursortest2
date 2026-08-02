package xsna;

import android.graphics.Rect;
import android.view.MotionEvent;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class a5d implements ClipItemViewEvent {
    public final MotionEvent b;
    public final Rect c;

    public a5d(MotionEvent motionEvent, Rect rect) {
        this.b = motionEvent;
        this.c = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5d)) {
            return false;
        }
        a5d a5dVar = (a5d) obj;
        return epx.f(this.b, a5dVar.b) && epx.f(this.c, a5dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongPress(motionEvent=");
        sb.append(this.b);
        sb.append(", gestureViewRect=");
        return yq.c(sb, this.c, ')');
    }
}
