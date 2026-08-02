package defpackage;

/* loaded from: classes2.dex */
public final class mxw {
    public final String a;
    public final String b;
    public final String c;

    public mxw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxw)) {
            return false;
        }
        mxw mxwVar = (mxw) obj;
        return jl40.l(this.a, mxwVar.a) && jl40.l(this.b, mxwVar.b) && jl40.l(this.c, mxwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Offer(offerName=");
        sb.append(this.a);
        sb.append(", offersBatchId=");
        sb.append(this.b);
        sb.append(", positionId=");
        return b64.p(sb, this.c, ')');
    }
}
