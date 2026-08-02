package xsna;

/* compiled from: GroupMarketInfo.kt */
/* loaded from: classes18.dex */
public final class nlu {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public nlu(String str, boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlu)) {
            return false;
        }
        nlu nluVar = (nlu) obj;
        return this.a == nluVar.a && this.b == nluVar.b && this.c == nluVar.c && epx.f(this.d, nluVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupMarketInfo(isMarketEnabled=");
        sb.append(this.a);
        sb.append(", hasProducts=");
        sb.append(this.b);
        sb.append(", canEnableMarket=");
        sb.append(this.c);
        sb.append(", miniAppUrl=");
        return ho8.a(sb, this.d, ')');
    }
}
