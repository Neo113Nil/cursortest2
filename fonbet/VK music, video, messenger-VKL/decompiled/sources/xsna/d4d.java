package xsna;

import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;

/* compiled from: ClipItemViewEvent.kt */
/* loaded from: classes17.dex */
public final class d4d implements ClipItemViewEvent {
    public final String b;
    public final String c;

    public d4d(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4d)) {
            return false;
        }
        d4d d4dVar = (d4d) obj;
        return epx.f(this.b, d4dVar.b) && epx.f(this.c, d4dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsMonothemeClicked(monothemeObjectId=");
        sb.append(this.b);
        sb.append(", header=");
        return ho8.a(sb, this.c, ')');
    }
}
