package xsna;

import java.util.ArrayList;

/* compiled from: FilteredSourcesPage.kt */
/* loaded from: classes18.dex */
public final class cfr<T> {
    public final int a;
    public final String b;
    public final ArrayList c;

    public cfr(String str, ArrayList arrayList, int i) {
        this.a = i;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cfr)) {
            return false;
        }
        cfr cfrVar = (cfr) obj;
        return this.a == cfrVar.a && epx.f(this.b, cfrVar.b) && this.c.equals(cfrVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilteredSourcesPage(total=");
        sb.append(this.a);
        sb.append(", nextFrom=");
        sb.append(this.b);
        sb.append(", items=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
    }
}
