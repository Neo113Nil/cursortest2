package xsna;

import java.util.List;

/* compiled from: MusicData.kt */
/* loaded from: classes17.dex */
public final class ag40 {
    public final List<String> a;
    public final List<String> b;
    public final String c;

    public ag40(List<String> list, List<String> list2, String str) {
        this.a = list;
        this.b = list2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag40)) {
            return false;
        }
        ag40 ag40Var = (ag40) obj;
        return epx.f(this.a, ag40Var.a) && epx.f(this.b, ag40Var.b) && epx.f(this.c, ag40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicData(mainArtists=");
        sb.append(this.a);
        sb.append(", featuredArtists=");
        sb.append(this.b);
        sb.append(", artistNameFallback=");
        return ho8.a(sb, this.c, ')');
    }
}
