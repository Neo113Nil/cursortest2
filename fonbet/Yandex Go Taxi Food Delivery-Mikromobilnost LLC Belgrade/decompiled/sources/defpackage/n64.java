package defpackage;

/* loaded from: classes.dex */
public final class n64 extends s0p {
    public final Integer a;

    public n64(Integer num) {
        this.a = num;
    }

    @Override // defpackage.s0p
    public final Integer a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0p)) {
            return false;
        }
        s0p s0pVar = (s0p) obj;
        Integer num = this.a;
        return num == null ? s0pVar.a() == null : num.equals(s0pVar.a());
    }

    public final int hashCode() {
        Integer num = this.a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return oo31.j(new StringBuilder("ExternalPRequestContext{originAssociatedProductId="), this.a, "}");
    }
}
