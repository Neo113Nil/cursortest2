package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class r4d implements ClipItemViewEvent {
    public final UserId b;
    public final mre c;

    public r4d(UserId userId, mre mreVar) {
        this.b = userId;
        this.c = mreVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4d)) {
            return false;
        }
        r4d r4dVar = (r4d) obj;
        return this.b.equals(r4dVar.b) && this.c.equals(r4dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        return "SubscribeToAuthorRequested(author=" + this.b + ", onSuccess=" + this.c + ')';
    }
}
