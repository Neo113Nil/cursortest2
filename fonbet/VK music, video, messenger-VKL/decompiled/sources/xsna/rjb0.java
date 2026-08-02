package xsna;

/* compiled from: PodcastToEpisodesEntity.kt */
/* loaded from: classes3.dex */
public final class rjb0 {
    public final String a;
    public final String b;
    public final String c;

    public rjb0(String str, String str2, String str3) {
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
        if (!(obj instanceof rjb0)) {
            return false;
        }
        rjb0 rjb0Var = (rjb0) obj;
        return epx.f(this.a, rjb0Var.a) && epx.f(this.b, rjb0Var.b) && epx.f(this.c, rjb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PodcastToEpisodesEntity(uid=");
        sb.append(this.a);
        sb.append(", mid=");
        sb.append(this.b);
        sb.append(", podcastOwnerId=");
        return ho8.a(sb, this.c, ')');
    }
}
