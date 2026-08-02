package xsna;

/* compiled from: DiFactoryKey.kt */
/* loaded from: classes.dex */
public final class u7m extends q5q0 {
    public final dcy<? extends Object> a;

    public u7m(rfc rfcVar) {
        this.a = rfcVar;
    }

    public final boolean equals(Object obj) {
        boolean z = obj instanceof v7m;
        dcy<? extends Object> dcyVar = this.a;
        if (z) {
            return epx.f(dcyVar.h(), ((v7m) obj).a);
        }
        if (obj instanceof u7m) {
            return epx.f(dcyVar, ((u7m) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        dcy<? extends Object> dcyVar = this.a;
        String h = dcyVar.h();
        return h != null ? h.hashCode() : dcyVar.hashCode();
    }

    public final String toString() {
        String h = this.a.h();
        return h == null ? "" : h;
    }
}
