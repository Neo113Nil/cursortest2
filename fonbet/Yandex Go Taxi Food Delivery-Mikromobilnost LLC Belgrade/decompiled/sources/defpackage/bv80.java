package defpackage;

@gsq0
/* loaded from: classes2.dex */
public final class bv80 implements pw80 {
    public static final av80 Companion = new av80();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ bv80(int i, String str, String str2, String str3, String str4) {
        if (6 != (i & 6)) {
            qje.Z(i, 6, zu80.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bv80)) {
            return false;
        }
        bv80 bv80Var = (bv80) obj;
        return jl40.l(this.a, bv80Var.a) && jl40.l(this.b, bv80Var.b) && jl40.l(this.c, bv80Var.c) && jl40.l(this.d, bv80Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b(unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
        String str2 = this.d;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SendBroadcastEvent(trackId=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.c);
        sb.append(", params=");
        return b64.p(sb, this.d, ')');
    }
}
