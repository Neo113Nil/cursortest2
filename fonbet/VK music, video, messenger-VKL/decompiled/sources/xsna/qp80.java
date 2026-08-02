package xsna;

/* compiled from: OpaqueKey.kt */
/* loaded from: classes.dex */
public final class qp80 {
    public final String a;

    public qp80(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qp80) && epx.f(this.a, ((qp80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OpaqueKey(key="), this.a, ')');
    }
}
