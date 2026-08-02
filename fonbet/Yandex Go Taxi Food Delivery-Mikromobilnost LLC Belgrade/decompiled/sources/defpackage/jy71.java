package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes7.dex */
public final class jy71 extends wj81 {
    public final Map a;

    public jy71(Map map) {
        this.a = map;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && this.a.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        x871 x871Var;
        x871 x871Var2;
        Iterator it = ((q681) entrySet()).iterator();
        if (obj == null) {
            do {
                x871Var2 = (x871) it;
                if (!x871Var2.hasNext()) {
                    return false;
                }
            } while (((Map.Entry) x871Var2.next()).getValue() != null);
            return true;
        }
        do {
            x871Var = (x871) it;
            if (!x871Var.hasNext()) {
                return false;
            }
        } while (!obj.equals(((Map.Entry) x871Var.next()).getValue()));
        return true;
    }

    @Override // defpackage.wj81, java.util.Map
    public final Set entrySet() {
        return mja1.d(super.entrySet(), new iy71(1));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        boolean z;
        if (obj != null) {
            if (this == obj) {
                z = true;
            } else if (obj instanceof Map) {
                z = mja1.e((q681) entrySet(), ((Map) obj).entrySet());
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.a.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return mja1.c(entrySet());
    }

    @Override // defpackage.wj81, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && this.a.containsKey(null));
    }

    @Override // defpackage.wj81, java.util.Map
    public final Set keySet() {
        return mja1.d(super.keySet(), new iy71(0));
    }

    @Override // defpackage.wj81, java.util.Map
    public final int size() {
        return super.size() - (this.a.containsKey(null) ? 1 : 0);
    }
}
