package yads;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xsna.wcl0;

/* loaded from: classes10.dex */
public final class s83 implements xq {
    public static final wq d = new wcl0(7);
    public final l83 b;
    public final s51 c;

    public s83(l83 l83Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= l83Var.b)) {
            throw new IndexOutOfBoundsException();
        }
        this.b = l83Var;
        this.c = s51.a((Collection) list);
    }

    public static s83 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        l83 l83Var = (l83) l83.g.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new s83(l83Var, intArray.length == 0 ? Collections.EMPTY_LIST : new vd1(0, intArray.length, intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s83.class == obj.getClass()) {
            s83 s83Var = (s83) obj;
            if (this.b.equals(s83Var.b) && this.c.equals(s83Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }
}
