package xsna;

import com.vk.dto.music.audiobook.AudioBookChapter;

/* compiled from: MusicPlayerDownloadEvent.kt */
/* loaded from: classes3.dex */
public final class ew40 implements iw40 {
    public final int a;
    public final AudioBookChapter b;

    public ew40(int i, AudioBookChapter audioBookChapter) {
        this.a = i;
        this.b = audioBookChapter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew40)) {
            return false;
        }
        ew40 ew40Var = (ew40) obj;
        return this.a == ew40Var.a && epx.f(this.b, ew40Var.b);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "Chapter(audioBookId=" + this.a + ", chapter=" + this.b + ", skipConfirm=true)";
    }
}
