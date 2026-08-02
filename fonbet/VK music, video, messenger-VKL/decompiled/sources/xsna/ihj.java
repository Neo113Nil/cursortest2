package xsna;

import com.vk.ecomm.market.good.good2.presentation.label.ContentItemType;

/* compiled from: ProductLabel.kt */
/* loaded from: classes18.dex */
public final class ihj {
    public final ContentItemType a;
    public final String b;
    public final String c;
    public final dly d;

    public ihj(ContentItemType contentItemType, String str, String str2, dly dlyVar) {
        this.a = contentItemType;
        this.b = str;
        this.c = str2;
        this.d = dlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ihj)) {
            return false;
        }
        ihj ihjVar = (ihj) obj;
        return this.a == ihjVar.a && epx.f(this.b, ihjVar.b) && epx.f(this.c, ihjVar.c) && epx.f(this.d, ihjVar.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        dly dlyVar = this.d;
        return a + (dlyVar == null ? 0 : dlyVar.hashCode());
    }

    public final String toString() {
        return "ContentItem(type=" + this.a + ", title=" + this.b + ", text=" + this.c + ", labelIcon=" + this.d + ')';
    }
}
