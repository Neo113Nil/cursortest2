package xsna;

import kotlin.LazyThreadSafetyMode;

/* compiled from: DeepLinkRoute.kt */
/* loaded from: classes4.dex */
public final class j9l {
    public static final Object b;
    public static final Object c;
    public final uq90 a;

    static {
        nd1 nd1Var = new nd1(11);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        b = msy.a(lazyThreadSafetyMode, nd1Var);
        c = msy.a(lazyThreadSafetyMode, new fn4(10));
    }

    public j9l(uq90 uq90Var) {
        this.a = uq90Var;
    }

    public static j9l a(j9l j9lVar, uq90 uq90Var) {
        j9lVar.getClass();
        j9lVar.getClass();
        j9lVar.getClass();
        return new j9l(uq90Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9l)) {
            return false;
        }
        j9l j9lVar = (j9l) obj;
        j9lVar.getClass();
        return this.a.equals(j9lVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeepLinkRoute(scheme=null, host=null, pathPattern=" + this.a + ')';
    }
}
