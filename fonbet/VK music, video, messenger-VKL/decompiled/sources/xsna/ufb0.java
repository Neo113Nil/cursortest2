package xsna;

/* compiled from: PlaylistsToTracksEntity.kt */
/* loaded from: classes3.dex */
public final class ufb0 {
    public final String a;
    public final String b;
    public final String c;

    public ufb0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ufb0)) {
            return false;
        }
        ufb0 ufb0Var = (ufb0) obj;
        return epx.f(this.a, ufb0Var.a) && epx.f(this.b, ufb0Var.b) && epx.f(this.c, ufb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaylistsToTracksEntity(uid=");
        sb.append(this.a);
        sb.append(", musicTrackId=");
        sb.append(this.b);
        sb.append(", playlistId=");
        return ho8.a(sb, this.c, ')');
    }
}
