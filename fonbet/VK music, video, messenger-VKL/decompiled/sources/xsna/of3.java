package xsna;

import java.util.ArrayList;
import java.util.List;

/* compiled from: AppsSearchResponse.kt */
/* loaded from: classes6.dex */
public final class of3 {
    public final ArrayList a;
    public final List<jzh0> b;
    public final int c;

    public of3(int i, ArrayList arrayList, List list) {
        this.a = arrayList;
        this.b = list;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of3)) {
            return false;
        }
        of3 of3Var = (of3) obj;
        return this.a.equals(of3Var.a) && epx.f(this.b, of3Var.b) && this.c == of3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + fw3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsSearchResponse(apps=");
        sb.append(this.a);
        sb.append(", tags=");
        sb.append(this.b);
        sb.append(", total=");
        return vu5.b(sb, this.c, ')');
    }
}
