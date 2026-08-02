package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class id11 {
    public static final hd11 Companion = new hd11();
    public final String a;
    public final String b;

    public /* synthetic */ id11(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, gd11.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id11)) {
            return false;
        }
        id11 id11Var = (id11) obj;
        return jl40.l(this.a, id11Var.a) && jl40.l(this.b, id11Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TreasuryExceptionDto(traceId=");
        sb.append(this.a);
        sb.append(", exception=");
        return b64.p(sb, this.b, ')');
    }

    public id11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
