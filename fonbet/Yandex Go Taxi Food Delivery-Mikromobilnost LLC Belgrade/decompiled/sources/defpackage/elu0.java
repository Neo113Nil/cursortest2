package defpackage;

/* loaded from: classes11.dex */
public final class elu0 extends vgb1 {
    public final String a;
    public final String b;

    public elu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.vgb1
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elu0)) {
            return false;
        }
        elu0 elu0Var = (elu0) obj;
        return jl40.l(this.a, elu0Var.a) && jl40.l(this.b, elu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StringStoredValue(name=");
        sb.append(this.a);
        sb.append(", value=");
        return b64.p(sb, this.b, ')');
    }
}
