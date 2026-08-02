package defpackage;

import android.util.SparseBooleanArray;

/* loaded from: classes7.dex */
public final class o881 implements kq71 {
    public final hh71 a;

    static {
        new hh71(new SparseBooleanArray());
    }

    public o881(hh71 hh71Var) {
        this.a = hh71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o881) {
            return this.a.equals(((o881) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
