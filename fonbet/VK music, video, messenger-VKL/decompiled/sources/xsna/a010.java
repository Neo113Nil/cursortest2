package xsna;

/* compiled from: MarketInfoBlockViewModel.kt */
/* loaded from: classes18.dex */
public final class a010 {
    public final ely a;
    public final String b;

    public a010(ely elyVar, String str) {
        this.a = elyVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a010)) {
            return false;
        }
        a010 a010Var = (a010) obj;
        return epx.f(this.a, a010Var.a) && epx.f(this.b, a010Var.b);
    }

    public final int hashCode() {
        ely elyVar = this.a;
        return this.b.hashCode() + ((elyVar == null ? 0 : elyVar.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketInfoBlockViewModel(labelIcon=");
        sb.append(this.a);
        sb.append(", text=");
        return ho8.a(sb, this.b, ')');
    }
}
