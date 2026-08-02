package xsna;

/* compiled from: StyleConfig.kt */
/* loaded from: classes18.dex */
public final class atm0 {
    public final dtm0 a;
    public final String b;

    public atm0(dtm0 dtm0Var, String str) {
        this.a = dtm0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof atm0)) {
            return false;
        }
        atm0 atm0Var = (atm0) obj;
        return this.a.equals(atm0Var.a) && this.b.equals(atm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StyleConfig(style=");
        sb.append(this.a);
        sb.append(", title=");
        return ho8.a(sb, this.b, ')');
    }
}
