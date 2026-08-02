package xsna;

import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookChapter;

/* compiled from: MusicPlayerDownloadEvent.kt */
/* loaded from: classes3.dex */
public final class gw40 implements iw40 {
    public final AudioBook a;
    public final AudioBookChapter b;

    public gw40(AudioBook audioBook, AudioBookChapter audioBookChapter) {
        this.a = audioBook;
        this.b = audioBookChapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw40)) {
            return false;
        }
        gw40 gw40Var = (gw40) obj;
        return epx.f(this.a, gw40Var.a) && epx.f(this.b, gw40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Chapter(audioBook=" + this.a + ", chapter=" + this.b + ')';
    }
}
