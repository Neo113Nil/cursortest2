package xsna;

import com.vk.dto.music.audiobook.AudioBookChapter;

/* compiled from: MusicPlayerDownloadEvent.kt */
/* loaded from: classes3.dex */
public final class cw40 implements iw40 {
    public final int a;
    public final AudioBookChapter b;

    public cw40(int i, AudioBookChapter audioBookChapter) {
        this.a = i;
        this.b = audioBookChapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw40)) {
            return false;
        }
        cw40 cw40Var = (cw40) obj;
        return this.a == cw40Var.a && epx.f(this.b, cw40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Chapter(audioBookId=" + this.a + ", chapter=" + this.b + ')';
    }
}
