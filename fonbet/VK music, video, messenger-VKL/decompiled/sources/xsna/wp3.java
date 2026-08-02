package xsna;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class wp3 implements yp3 {
    public final String a;

    public wp3(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp3)) {
            return false;
        }
        wp3 wp3Var = (wp3) obj;
        wp3Var.getClass();
        return this.a.equals(wp3Var.a);
    }

    @Override // xsna.yp3
    public final int getId() {
        return -2;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(-2) * 31);
    }

    public final String toString() {
        return ho8.a(new StringBuilder("ArticleTitleViewItem(id=-2, title="), this.a, ')');
    }
}
