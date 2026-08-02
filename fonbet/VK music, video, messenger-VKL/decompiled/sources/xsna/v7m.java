package xsna;

/* compiled from: DiFactoryKey.kt */
/* loaded from: classes.dex */
public final class v7m extends q5q0 {
    public final String a;

    public v7m(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        boolean z = obj instanceof v7m;
        String str = this.a;
        if (z) {
            return epx.f(str, ((v7m) obj).a);
        }
        if (obj instanceof u7m) {
            return epx.f(str, ((u7m) obj).a.h());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
