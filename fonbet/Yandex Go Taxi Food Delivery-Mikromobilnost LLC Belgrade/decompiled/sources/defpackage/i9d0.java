package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class i9d0 {
    public static final h9d0 Companion = new h9d0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ i9d0(int i, String str, String str2, String str3) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, g9d0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9d0)) {
            return false;
        }
        i9d0 i9d0Var = (i9d0) obj;
        return jl40.l(this.a, i9d0Var.a) && jl40.l(this.b, i9d0Var.b) && jl40.l(this.c, i9d0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Analytics(batchId=");
        sb.append(this.a);
        sb.append(", positionId=");
        sb.append(this.b);
        sb.append(", placeId=");
        return b64.p(sb, this.c, ')');
    }
}
