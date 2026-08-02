package xsna;

import com.vk.dto.music.Thumb;

/* compiled from: PlaylistMenuViewState.kt */
/* loaded from: classes3.dex */
public final class i9b0 {
    public final Thumb a;
    public final String b;
    public final int c;
    public final boolean d;

    public i9b0(Thumb thumb, String str, int i, boolean z) {
        this.a = thumb;
        this.b = str;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9b0)) {
            return false;
        }
        i9b0 i9b0Var = (i9b0) obj;
        return epx.f(this.a, i9b0Var.a) && epx.f(this.b, i9b0Var.b) && this.c == i9b0Var.c && this.d == i9b0Var.d;
    }

    public final int hashCode() {
        Thumb thumb = this.a;
        return Boolean.hashCode(this.d) + shy.a(this.c, urd0.a((thumb == null ? 0 : thumb.hashCode()) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistHeaderData(cover=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitleRes=");
        sb.append(this.c);
        sb.append(", hasExplicitLyrics=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
