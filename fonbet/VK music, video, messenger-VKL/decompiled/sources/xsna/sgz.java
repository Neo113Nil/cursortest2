package xsna;

import androidx.recyclerview.widget.m;
import java.util.List;

/* compiled from: ListWithDiff.kt */
/* loaded from: classes2.dex */
public final class sgz {
    public final List<hfz> a;
    public final m.d b;

    /* JADX WARN: Multi-variable type inference failed */
    public sgz(List<? extends hfz> list, m.d dVar) {
        this.a = list;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgz)) {
            return false;
        }
        sgz sgzVar = (sgz) obj;
        return epx.f(this.a, sgzVar.a) && epx.f(this.b, sgzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ListWithDiff(list=" + this.a + ", diff=" + this.b + ')';
    }
}
