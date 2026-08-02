package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d630 {
    public static final d630 b;
    public final Map a;

    static {
        c630 c630Var = new c630();
        HashMap hashMap = c630Var.a;
        if (hashMap == null) {
            ny61.r("cannot call build() twice");
            return;
        }
        d630 d630Var = new d630(Collections.unmodifiableMap(hashMap));
        c630Var.a = null;
        b = d630Var;
    }

    public d630(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d630) {
            return this.a.equals(((d630) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
