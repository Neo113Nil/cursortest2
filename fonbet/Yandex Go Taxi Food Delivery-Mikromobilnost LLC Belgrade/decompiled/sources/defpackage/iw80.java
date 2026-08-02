package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class iw80 implements pw80 {
    public static final hw80 Companion = new hw80();
    public final String a;
    public final String b;

    public /* synthetic */ iw80(int i, String str, String str2) {
        if (2 != (i & 2)) {
            qje.Z(i, 2, gw80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iw80)) {
            return false;
        }
        iw80 iw80Var = (iw80) obj;
        return jl40.l(this.a, iw80Var.a) && jl40.l(this.b, iw80Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserBoughtSubscription(trackId=");
        sb.append(this.a);
        sb.append(", productId=");
        return b64.p(sb, this.b, ')');
    }
}
