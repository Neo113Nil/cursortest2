package defpackage;

/* loaded from: classes2.dex */
public final class gjb {
    public final CharSequence a;
    public final boolean b;

    public gjb(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gjb)) {
            return false;
        }
        gjb gjbVar = (gjb) obj;
        return jl40.l(this.a, gjbVar.a) && this.b == gjbVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Agreement(agreementText=");
        sb.append((Object) this.a);
        sb.append(", isAgreementsChecked=");
        return unr0.u(sb, this.b, ')');
    }
}
