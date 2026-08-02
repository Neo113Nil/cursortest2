package xsna;

import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ConfigureItemListState.kt */
/* loaded from: classes18.dex */
public final class d0j implements km50 {
    public final int b;
    public final List<yzi> c;

    public d0j() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0j)) {
            return false;
        }
        d0j d0jVar = (d0j) obj;
        return this.b == d0jVar.b && epx.f(this.c, d0jVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConfigureItemListState(maxCount=");
        sb.append(this.b);
        sb.append(", items=");
        return ms9.a(')', sb, this.c);
    }

    public d0j(int i, List<yzi> list) {
        this.b = i;
        this.c = list;
    }

    public d0j(int i) {
        this(10, EmptyList.b);
    }
}
