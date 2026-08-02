package xsna;

import com.vk.ecomm.market.api.labels.MarketModalContentItem;

/* compiled from: MarketItemModalApproveInfoModel.kt */
/* loaded from: classes18.dex */
public final class c210 {
    public final MarketModalContentItem a;
    public final String b;
    public final String c;
    public final dly d;

    public c210(MarketModalContentItem marketModalContentItem, String str, String str2, dly dlyVar) {
        this.a = marketModalContentItem;
        this.b = str;
        this.c = str2;
        this.d = dlyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c210)) {
            return false;
        }
        c210 c210Var = (c210) obj;
        return this.a == c210Var.a && epx.f(this.b, c210Var.b) && epx.f(this.c, c210Var.c) && epx.f(this.d, c210Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        dly dlyVar = this.d;
        return a + (dlyVar == null ? 0 : dlyVar.hashCode());
    }

    public final String toString() {
        return "MarketItemModalContentItem(type=" + this.a + ", text=" + this.b + ", subtitle=" + this.c + ", icon=" + this.d + ')';
    }
}
