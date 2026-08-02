package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DrawingState.kt */
/* loaded from: classes4.dex */
public final class vlo {
    public final List<uap> a;
    public final kif0 b;

    public vlo() {
        this((kif0) null, 3);
    }

    public static vlo a(vlo vloVar, ArrayList arrayList) {
        kif0 kif0Var = vloVar.b;
        vloVar.getClass();
        return new vlo(arrayList, kif0Var);
    }

    public static vlo b(vlo vloVar, kif0 kif0Var, int i) {
        if ((i & 1) != 0) {
            kif0Var = vloVar.b;
        }
        List<uap> list = vloVar.a;
        if (kif0Var.equals(vloVar.b)) {
            kif0Var = kif0.a(kif0Var);
        }
        if (list.equals(vloVar.a)) {
            List<uap> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((uap) it.next()).copy());
            }
            list = arrayList;
        }
        return new vlo(list, kif0Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vlo) {
            return epx.f(this.a, ((vlo) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public vlo(List<? extends uap> list, kif0 kif0Var) {
        this.a = list;
        this.b = kif0Var;
    }

    public vlo(kif0 kif0Var, int i) {
        this(EmptyList.b, (i & 2) != 0 ? kif0.c : kif0Var);
    }
}
