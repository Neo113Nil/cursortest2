package xsna;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class qo3 implements yp3 {
    public final int a;
    public final String b;
    public final int c;

    public qo3(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo3)) {
            return false;
        }
        qo3 qo3Var = (qo3) obj;
        return this.a == qo3Var.a && epx.f(this.b, qo3Var.b) && this.c == qo3Var.c;
    }

    @Override // xsna.yp3
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleInnerTitleViewItem(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", header=");
        return vu5.b(sb, this.c, ')');
    }
}
