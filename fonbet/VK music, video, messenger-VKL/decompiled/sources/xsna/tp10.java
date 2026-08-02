package xsna;

import java.util.List;

/* compiled from: MediaAlbums.kt */
/* loaded from: classes3.dex */
public final class tp10 {
    public final List<String> a;
    public final int b;

    public tp10(List<String> list, int i) {
        this.a = list;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp10)) {
            return false;
        }
        tp10 tp10Var = (tp10) obj;
        return epx.f(this.a, tp10Var.a) && this.b == tp10Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaAlbums(titles=");
        sb.append(this.a);
        sb.append(", selectedIndex=");
        return vu5.b(sb, this.b, ')');
    }
}
