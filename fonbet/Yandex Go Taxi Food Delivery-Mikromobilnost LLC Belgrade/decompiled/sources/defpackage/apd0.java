package defpackage;

/* loaded from: classes2.dex */
public final class apd0 implements bpd0 {
    public final boolean a;

    public apd0(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof apd0) && this.a == ((apd0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) * 31;
    }

    public final String toString() {
        return x4e.i(new StringBuilder("PaymentSuccess(successScreenSkipped="), this.a, ", payload=null)");
    }
}
