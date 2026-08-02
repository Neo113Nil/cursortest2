package defpackage;

/* loaded from: classes2.dex */
public final class fcp implements gcp {
    public final String a;

    public fcp(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fcp) && jl40.l(this.a, ((fcp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("Unknown(rawMessage="), this.a, ')');
    }
}
