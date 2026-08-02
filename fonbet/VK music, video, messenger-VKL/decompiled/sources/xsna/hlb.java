package xsna;

import com.vk.dto.music.audiobook.AudioBookChapter;

/* compiled from: ChapterItem.kt */
/* loaded from: classes3.dex */
public final class hlb {
    public final AudioBookChapter a;

    public hlb(AudioBookChapter audioBookChapter) {
        this.a = audioBookChapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hlb) && epx.f(this.a, ((hlb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChapterItem(chapter=" + this.a + ')';
    }
}
