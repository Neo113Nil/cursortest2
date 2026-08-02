package xsna;

/* compiled from: NotificationsCategory.kt */
/* loaded from: classes4.dex */
public final class zi70 {
    public final String a;
    public final String b;

    public zi70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi70)) {
            return false;
        }
        zi70 zi70Var = (zi70) obj;
        return epx.f(this.a, zi70Var.a) && epx.f(this.b, zi70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationsCategory(id=");
        sb.append(this.a);
        sb.append(", title=");
        return ho8.a(sb, this.b, ')');
    }
}
