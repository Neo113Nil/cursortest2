package xsna;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class po3 implements yp3 {
    public final int a;
    public final String b;
    public final String c;

    public po3(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof po3)) {
            return false;
        }
        po3 po3Var = (po3) obj;
        return this.a == po3Var.a && epx.f(this.b, po3Var.b) && epx.f(this.c, po3Var.c);
    }

    @Override // xsna.yp3
    public final int getId() {
        return this.a;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleImageViewItem(id=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.b);
        sb.append(", captionText=");
        return ho8.a(sb, this.c, ')');
    }
}
