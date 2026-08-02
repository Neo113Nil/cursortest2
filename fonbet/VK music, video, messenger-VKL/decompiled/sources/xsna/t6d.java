package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class t6d implements ClipItemViewEvent {
    public final long b;
    public final long c;

    public t6d(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6d)) {
            return false;
        }
        t6d t6dVar = (t6d) obj;
        return this.b == t6dVar.b && this.c == t6dVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WatchCoverage(startMs=");
        sb.append(this.b);
        sb.append(", endMs=");
        return vu5.a(')', this.c, sb);
    }
}
