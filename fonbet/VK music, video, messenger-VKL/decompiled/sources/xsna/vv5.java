package xsna;

/* compiled from: ProfileAction.kt */
/* loaded from: classes5.dex */
public final class vv5 {
    public final String a;
    public final String b;

    public vv5(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv5)) {
            return false;
        }
        vv5 vv5Var = (vv5) obj;
        return epx.f(this.a, vv5Var.a) && epx.f(this.b, vv5Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendRes(text=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        return ho8.a(sb, this.b, ')');
    }
}
