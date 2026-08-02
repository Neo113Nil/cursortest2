package xsna;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class eq3 implements yp3 {
    public final int a;
    public final String b;
    public final Float c;

    public eq3(int i, String str, Float f) {
        this.a = i;
        this.b = str;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq3)) {
            return false;
        }
        eq3 eq3Var = (eq3) obj;
        return this.a == eq3Var.a && epx.f(this.b, eq3Var.b) && epx.f(this.c, eq3Var.c);
    }

    @Override // xsna.yp3
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        Float f = this.c;
        return a + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleWebviewViewItem(id=");
        sb.append(this.a);
        sb.append(", url=");
        sb.append(this.b);
        sb.append(", ratio=");
        return so.b(sb, this.c, ')');
    }
}
