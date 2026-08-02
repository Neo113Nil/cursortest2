package xsna;

import com.ironsource.X3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Playlist.kt */
/* loaded from: classes8.dex */
public class y6b0 {
    public final ArrayList a;

    public y6b0(Iterable<? extends sht0> iterable) {
        ArrayList arrayList = new ArrayList();
        g5g.y(iterable, arrayList);
        this.a = arrayList;
    }

    public final sht0 a(int i) {
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            return (sht0) arrayList.get(i);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y6b0) {
            ArrayList arrayList = this.a;
            y6b0 y6b0Var = (y6b0) obj;
            if (arrayList.size() == y6b0Var.a.size()) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (epx.f(arrayList.get(i), y6b0Var.a.get(i))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (i * 31) + ((sht0) it.next()).hashCode();
        }
        return i;
    }

    public final String toString() {
        ArrayList arrayList = this.a;
        return tgw.b(arrayList.size(), "Playlist size: ", j5g.g0(arrayList, ", ", " [", X3.j.e, 0, new ev60(3), 24));
    }
}
