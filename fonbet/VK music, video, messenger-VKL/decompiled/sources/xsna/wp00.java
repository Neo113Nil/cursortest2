package xsna;

import xsna.wih0;

/* compiled from: MarketAdsItemNavigationEvent.kt */
/* loaded from: classes17.dex */
public final class wp00 implements xp00 {
    public final String a;
    public final wih0.b.a b;
    public final String c;

    public wp00(String str, wih0.b.a aVar, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wp00)) {
            return false;
        }
        wp00 wp00Var = (wp00) obj;
        return epx.f(this.a, wp00Var.a) && epx.f(this.b, wp00Var.b) && epx.f(this.c, wp00Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenMarketAdsMoreMenu(adUniqueKey=");
        sb.append(this.a);
        sb.append(", adInfo=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return ho8.a(sb, this.c, ')');
    }
}
