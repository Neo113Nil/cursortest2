package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class s4d implements ClipItemViewEvent {
    public final UserId b;
    public final k7f c;

    public s4d(UserId userId, k7f k7fVar) {
        this.b = userId;
        this.c = k7fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s4d)) {
            return false;
        }
        s4d s4dVar = (s4d) obj;
        return this.b.equals(s4dVar.b) && this.c.equals(s4dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        return "UnsubscribeFromAuthorRequested(author=" + this.b + ", onSuccess=" + this.c + ')';
    }
}
