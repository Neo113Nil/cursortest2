package xsna;

import java.util.ArrayList;

/* compiled from: VoipWatchPlaylistPage.kt */
/* loaded from: classes7.dex */
public final class s6x0 {
    public final ArrayList a;
    public final int b;

    public s6x0(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6x0)) {
            return false;
        }
        s6x0 s6x0Var = (s6x0) obj;
        return this.a.equals(s6x0Var.a) && this.b == s6x0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VoipWatchPlaylistPage(items=");
        sb.append(this.a);
        sb.append(", count=");
        return vu5.b(sb, this.b, ')');
    }
}
