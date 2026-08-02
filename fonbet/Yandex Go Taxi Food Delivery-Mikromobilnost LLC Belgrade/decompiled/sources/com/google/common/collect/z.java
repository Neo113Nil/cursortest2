package com.google.common.collect;

import defpackage.vls;
import defpackage.y60;
import java.util.Comparator;

/* loaded from: classes11.dex */
public abstract class z implements Comparator {
    public static z b(y60 y60Var) {
        return new ComparatorOrdering(y60Var);
    }

    public static z c() {
        return NaturalOrdering.a;
    }

    public final z a(Comparator comparator) {
        return new CompoundOrdering(this, comparator);
    }

    public final z f(vls vlsVar) {
        return new ByFunctionOrdering(vlsVar, this);
    }

    public z g() {
        return new ReverseOrdering(this);
    }
}
