package xsna;

import com.vk.dto.shortvideo.ClipsAuthor;

/* compiled from: ClipsProfileToolbarButton.kt */
/* loaded from: classes17.dex */
public final class xxe implements yxe {
    public final ClipsAuthor b;

    public xxe(ClipsAuthor clipsAuthor) {
        this.b = clipsAuthor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xxe) && epx.f(this.b, ((xxe) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Subscribe(toUser=" + this.b + ')';
    }
}
