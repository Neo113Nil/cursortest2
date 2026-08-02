package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: Artists.kt */
/* loaded from: classes3.dex */
public final class lt3 {
    public final ArrayList a;
    public final List<String> b;

    public lt3(ArrayList arrayList, ArrayList arrayList2) {
        this.a = arrayList;
        this.b = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt3)) {
            return false;
        }
        lt3 lt3Var = (lt3) obj;
        return this.a.equals(lt3Var.a) && epx.f(this.b, lt3Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List<String> list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Artists(mainArtists=");
        sb.append(this.a);
        sb.append(", featuredArtists=");
        return ms9.a(')', sb, this.b);
    }
}
