package xsna;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class xn3 implements yp3 {
    public final int a;
    public final g06 b;

    public xn3(int i, g06 g06Var) {
        this.a = i;
        this.b = g06Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn3)) {
            return false;
        }
        xn3 xn3Var = (xn3) obj;
        return this.a == xn3Var.a && this.b.equals(xn3Var.b);
    }

    @Override // xsna.yp3
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ArticleEmbedViewItem(id=" + this.a + ", buildText=" + this.b + ')';
    }
}
