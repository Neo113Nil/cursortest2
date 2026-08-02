package xsna;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class tp3 implements yp3 {
    public final int a;
    public final boolean b;

    public tp3(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp3)) {
            return false;
        }
        tp3 tp3Var = (tp3) obj;
        return this.a == tp3Var.a && this.b == tp3Var.b;
    }

    @Override // xsna.yp3
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleSpaceViewItem(id=");
        sb.append(this.a);
        sb.append(", doubleSpace=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
