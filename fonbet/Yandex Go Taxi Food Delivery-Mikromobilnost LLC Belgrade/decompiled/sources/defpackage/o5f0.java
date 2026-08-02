package defpackage;

@gsq0
/* loaded from: classes.dex */
public final class o5f0 {
    public static final n5f0 Companion = new n5f0();
    public final int a;
    public final String b;

    public /* synthetic */ o5f0(int i, int i2, String str) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, m5f0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5f0)) {
            return false;
        }
        o5f0 o5f0Var = (o5f0) obj;
        return this.a == o5f0Var.a && jl40.l(this.b, o5f0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessData(pid=");
        sb.append(this.a);
        sb.append(", uuid=");
        return b64.p(sb, this.b, ')');
    }

    public o5f0(int i, String str) {
        this.a = i;
        this.b = str;
    }
}
