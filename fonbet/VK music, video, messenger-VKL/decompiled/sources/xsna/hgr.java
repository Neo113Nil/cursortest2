package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: Filter.kt */
/* loaded from: classes18.dex */
public final class hgr {
    public final boolean a;
    public final List<dcr> b;

    public hgr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hgr)) {
            return false;
        }
        hgr hgrVar = (hgr) obj;
        return this.a == hgrVar.a && epx.f(this.b, hgrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FiltersState(isSelected=");
        sb.append(this.a);
        sb.append(", filters=");
        return ms9.a(')', sb, this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hgr(boolean z, List<? extends dcr> list) {
        this.a = z;
        this.b = list;
    }

    public hgr(int i) {
        this(false, EmptyList.b);
    }
}
