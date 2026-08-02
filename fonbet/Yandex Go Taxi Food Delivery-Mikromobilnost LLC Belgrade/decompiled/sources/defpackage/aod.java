package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class aod {
    public static final znd Companion = new znd();
    public final ipd a;
    public final long b;

    public /* synthetic */ aod(int i, ipd ipdVar, long j) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ynd.a.getDescriptor());
            throw null;
        }
        this.a = ipdVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aod)) {
            return false;
        }
        aod aodVar = (aod) obj;
        return jl40.l(this.a, aodVar.a) && this.b == aodVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Invoice(totalPrice=");
        sb.append(this.a);
        sb.append(", timestamp=");
        return b64.o(sb, this.b, ')');
    }
}
