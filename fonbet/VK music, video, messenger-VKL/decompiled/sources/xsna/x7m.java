package xsna;

import xsna.pwj0;

/* compiled from: DiScope.kt */
/* loaded from: classes.dex */
public abstract class x7m<CurrentK extends ParentK, ParentK extends pwj0> {
    /* JADX WARN: Incorrect return type in method signature: ()TCurrentK; */
    public abstract pwj0 a();

    public abstract x7m<ParentK, ?> b();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x7m) {
            return epx.f(a(), ((x7m) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return "DiScope(key=" + a() + ')';
    }

    public void c(oi6 oi6Var) {
    }
}
