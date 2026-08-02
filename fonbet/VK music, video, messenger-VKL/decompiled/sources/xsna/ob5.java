package xsna;

/* compiled from: AuthorHorizontalListItemData.kt */
/* loaded from: classes16.dex */
public final class ob5 {
    public final String a;
    public final boolean b;
    public final String c;

    public ob5() {
        this((String) null, false, 7);
    }

    public static ob5 a(ob5 ob5Var, String str, String str2, int i) {
        if ((i & 1) != 0) {
            str = ob5Var.a;
        }
        boolean z = ob5Var.b;
        if ((i & 4) != 0) {
            str2 = ob5Var.c;
        }
        ob5Var.getClass();
        return new ob5(str, z, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob5)) {
            return false;
        }
        ob5 ob5Var = (ob5) obj;
        return epx.f(this.a, ob5Var.a) && this.b == ob5Var.b && epx.f(this.c, ob5Var.c);
    }

    public final int hashCode() {
        int b = qoy.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthorHorizontalListItemData(title=");
        sb.append(this.a);
        sb.append(", isVerified=");
        sb.append(this.b);
        sb.append(", subtitle=");
        return ho8.a(sb, this.c, ')');
    }

    public ob5(String str, boolean z, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public /* synthetic */ ob5(String str, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (String) null);
    }
}
