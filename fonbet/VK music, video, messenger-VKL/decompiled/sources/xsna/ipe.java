package xsna;

import java.util.ArrayList;

/* compiled from: ClipsPageDo.kt */
/* loaded from: classes7.dex */
public final class ipe {
    public final ArrayList a;
    public final String b;

    public ipe(String str, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipe)) {
            return false;
        }
        ipe ipeVar = (ipe) obj;
        return this.a.equals(ipeVar.a) && epx.f(this.b, ipeVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsPageDo(clips=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.b, ')');
    }
}
