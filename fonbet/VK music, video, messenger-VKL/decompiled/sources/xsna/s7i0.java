package xsna;

/* compiled from: SelectGroupVerificationEvent.kt */
/* loaded from: classes18.dex */
public final class s7i0 implements t7i0 {
    public final String a;

    public s7i0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s7i0) && epx.f(this.a, ((s7i0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("OpenVerificationType(typeId="), this.a, ')');
    }
}
