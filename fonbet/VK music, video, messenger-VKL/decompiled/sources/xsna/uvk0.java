package xsna;

import xsna.wih0;

/* compiled from: StaticAdsItemNavigationEvent.kt */
/* loaded from: classes17.dex */
public final class uvk0 implements vvk0 {
    public final String a;
    public final wih0.d.a b;
    public final String c;

    public uvk0(String str, wih0.d.a aVar, String str2) {
        this.a = str;
        this.b = aVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvk0)) {
            return false;
        }
        uvk0 uvk0Var = (uvk0) obj;
        return epx.f(this.a, uvk0Var.a) && epx.f(this.b, uvk0Var.b) && epx.f(this.c, uvk0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenStaticAdsMoreMenu(adUniqueKey=");
        sb.append(this.a);
        sb.append(", adInfo=");
        sb.append(this.b);
        sb.append(", trackCode=");
        return ho8.a(sb, this.c, ')');
    }
}
