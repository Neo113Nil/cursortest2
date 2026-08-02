package xsna;

import xsna.tlo0;

/* compiled from: DzenArticleViewItem.kt */
/* loaded from: classes18.dex */
public final class up3 implements yp3 {
    public final String a;
    public final tlo0 b;

    public up3(String str, tlo0.e eVar) {
        this.a = str;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up3)) {
            return false;
        }
        up3 up3Var = (up3) obj;
        up3Var.getClass();
        return this.a.equals(up3Var.a) && epx.f(this.b, up3Var.b);
    }

    @Override // xsna.yp3
    public final int getId() {
        return -1;
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(-1) * 31, 31, this.a);
        tlo0 tlo0Var = this.b;
        return a + (tlo0Var == null ? 0 : tlo0Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ArticleSubtitleViewItem(id=-1, dateText=");
        sb.append(this.a);
        sb.append(", subtitleViewsCount=");
        return bt.a(sb, this.b, ')');
    }
}
