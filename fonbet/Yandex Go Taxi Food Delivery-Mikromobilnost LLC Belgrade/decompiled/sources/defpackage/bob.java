package defpackage;

/* loaded from: classes2.dex */
public final class bob {
    public final String a;
    public final boolean b;

    public bob(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bob)) {
            return false;
        }
        bob bobVar = (bob) obj;
        return jl40.l(this.a, bobVar.a) && this.b == bobVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PaymentProcessInfo(confirmationUrl=");
        sb.append(this.a);
        sb.append(", isConfirmationReady=");
        return unr0.u(sb, this.b, ')');
    }
}
