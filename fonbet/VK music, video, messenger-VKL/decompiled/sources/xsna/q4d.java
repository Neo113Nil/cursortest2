package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.dto.common.id.UserId;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class q4d implements ClipItemViewEvent {
    public final UserId b;
    public final boolean c;

    public q4d(UserId userId, boolean z) {
        this.b = userId;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4d)) {
            return false;
        }
        q4d q4dVar = (q4d) obj;
        return epx.f(this.b, q4dVar.b) && this.c == q4dVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenGridScreenRequested(author=");
        sb.append(this.b);
        sb.append(", isOwnerGrid=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
