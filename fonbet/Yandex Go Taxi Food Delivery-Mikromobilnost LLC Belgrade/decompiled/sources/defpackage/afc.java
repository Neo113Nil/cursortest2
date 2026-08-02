package defpackage;

/* loaded from: classes2.dex */
public final class afc {
    public final String a;
    public final yec b;
    public final zec c;

    public afc(String str, yec yecVar, zec zecVar) {
        this.a = str;
        this.b = yecVar;
        this.c = zecVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afc)) {
            return false;
        }
        afc afcVar = (afc) obj;
        return jl40.l(this.a, afcVar.a) && jl40.l(this.b, afcVar.b) && jl40.l(this.c, afcVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yec yecVar = this.b;
        int hashCode2 = (hashCode + (yecVar == null ? 0 : yecVar.a.hashCode())) * 31;
        zec zecVar = this.c;
        return hashCode2 + (zecVar != null ? zecVar.hashCode() : 0);
    }

    public final String toString() {
        return "Value(__typename=" + this.a + ", onGradientColor=" + this.b + ", onHexColor=" + this.c + ')';
    }
}
