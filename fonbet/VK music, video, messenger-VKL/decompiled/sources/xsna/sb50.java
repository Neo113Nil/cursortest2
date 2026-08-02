package xsna;

import com.vk.dto.music.Thumb;

/* compiled from: TrackMenuViewState.kt */
/* loaded from: classes3.dex */
public final class sb50 {
    public final Thumb a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public sb50(Thumb thumb, String str, String str2, boolean z, boolean z2) {
        this.a = thumb;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb50)) {
            return false;
        }
        sb50 sb50Var = (sb50) obj;
        return epx.f(this.a, sb50Var.a) && epx.f(this.b, sb50Var.b) && epx.f(this.c, sb50Var.c) && this.d == sb50Var.d && this.e == sb50Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicTrackHeaderData(cover=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", artist=");
        sb.append(this.c);
        sb.append(", hasIllegalNoticeType=");
        sb.append(this.d);
        sb.append(", isForeignAgent=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
