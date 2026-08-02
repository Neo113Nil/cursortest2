package xsna;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class vp3 implements yp3 {
    public final int a;
    public final bto b;

    public vp3(int i, bto btoVar) {
        this.a = i;
        this.b = btoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp3)) {
            return false;
        }
        vp3 vp3Var = (vp3) obj;
        return this.a == vp3Var.a && this.b.equals(vp3Var.b);
    }

    @Override // xsna.yp3
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ArticleTextViewItem(id=" + this.a + ", buildText=" + this.b + ')';
    }
}
