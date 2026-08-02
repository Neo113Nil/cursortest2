package xsna;

/* compiled from: AnonymNameChangedPublisher.kt */
/* loaded from: classes7.dex */
public final class xt2 {
    public final String a;
    public final String b;

    public xt2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt2)) {
            return false;
        }
        xt2 xt2Var = (xt2) obj;
        return epx.f(this.a, xt2Var.a) && epx.f(this.b, xt2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnonymNameChangedEvent(changedName=");
        sb.append(this.a);
        sb.append(", secretHash=");
        return ho8.a(sb, this.b, ')');
    }
}
