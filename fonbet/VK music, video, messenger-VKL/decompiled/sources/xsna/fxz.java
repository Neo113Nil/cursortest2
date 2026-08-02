package xsna;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: LocalizedText.kt */
/* loaded from: classes5.dex */
public final class fxz implements wwz {
    public final int a;
    public final List<Object> b;

    public fxz(int i, List<? extends Object> list) {
        this.a = i;
        this.b = list;
    }

    @Override // xsna.wwz
    public final String a(Context context) {
        int i = this.a;
        List<Object> list = this.b;
        if (list == null) {
            return context.getString(i);
        }
        List<Object> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next() instanceof wwz) {
                    List<Object> list3 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                    for (Object obj : list3) {
                        if (obj instanceof wwz) {
                            obj = ((wwz) obj).a(context);
                        }
                        arrayList.add(obj);
                    }
                    list = arrayList;
                }
            }
        }
        Object[] array = list.toArray(new Object[0]);
        return context.getString(i, Arrays.copyOf(array, array.length));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxz)) {
            return false;
        }
        fxz fxzVar = (fxz) obj;
        return this.a == fxzVar.a && epx.f(this.b, fxzVar.b);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        List<Object> list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("res(");
        sb.append(this.a);
        List<Object> list = this.b;
        return ho8.a(sb, list != null ? go9.c(", ", list) : "", ')');
    }
}
