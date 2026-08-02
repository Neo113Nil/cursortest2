package xsna;

import xsna.xzj;

/* compiled from: MusicPlaylistUiDto.kt */
/* loaded from: classes4.dex */
public final class c250 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final xzj f;

    public c250(String str, String str2, boolean z, String str3, boolean z2, xzj xzjVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = xzjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c250)) {
            return false;
        }
        c250 c250Var = (c250) obj;
        return epx.f(this.a, c250Var.a) && epx.f(this.b, c250Var.b) && this.c == c250Var.c && epx.f(this.d, c250Var.d) && this.e == c250Var.e && epx.f(this.f, c250Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + qoy.b(urd0.a(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "MusicPlaylistUiDto(title=" + this.a + ", artistName=" + this.b + ", isArtistNameVisible=" + this.c + ", year=" + this.d + ", isYearVisible=" + this.e + ", cover=" + this.f + ')';
    }

    public c250() {
        this("", "", false, "", false, xzj.b.a.a);
    }
}
