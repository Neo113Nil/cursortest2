package xsna;

import com.vk.dto.music.Thumb;

/* compiled from: RelatedAudioPlaylist.kt */
/* loaded from: classes6.dex */
public final class csf0 {
    public final String a;
    public final Thumb b;
    public final boolean c;
    public final int d;
    public final long e;

    public csf0(String str, Thumb thumb, boolean z, int i, long j) {
        this.a = str;
        this.b = thumb;
        this.c = z;
        this.d = i;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csf0)) {
            return false;
        }
        csf0 csf0Var = (csf0) obj;
        return epx.f(this.a, csf0Var.a) && epx.f(this.b, csf0Var.b) && this.c == csf0Var.c && this.d == csf0Var.d && this.e == csf0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Thumb thumb = this.b;
        return Long.hashCode(this.e) + shy.a(this.d, qoy.b((hashCode + (thumb == null ? 0 : thumb.hashCode())) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelatedAudioPlaylist(title=");
        sb.append(this.a);
        sb.append(", thumb=");
        sb.append(this.b);
        sb.append(", shouldShowOnboarding=");
        sb.append(this.c);
        sb.append(", playlistId=");
        sb.append(this.d);
        sb.append(", ownerId=");
        return vu5.a(')', this.e, sb);
    }
}
