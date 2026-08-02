package defpackage;

/* loaded from: classes3.dex */
public final class l1a0 implements n1a0 {
    public final String a;

    public l1a0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l1a0) && jl40.l(this.a, ((l1a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return oyr.p("Sbp(memberId=", this.a, ", phoneNumber=null)");
    }
}
