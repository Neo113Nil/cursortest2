package xsna;

/* compiled from: FaveResponseEntries.kt */
/* loaded from: classes18.dex */
public final class wsq {
    public final iqq a;
    public final ad90 b;
    public final int c;
    public final String d;

    public wsq(iqq iqqVar, ad90 ad90Var) {
        int i = iqqVar.c;
        String str = iqqVar.d;
        this.a = iqqVar;
        this.b = ad90Var;
        this.c = i;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsq)) {
            return false;
        }
        wsq wsqVar = (wsq) obj;
        return epx.f(this.a, wsqVar.a) && epx.f(this.b, wsqVar.b) && this.c == wsqVar.c && epx.f(this.d, wsqVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ad90 ad90Var = this.b;
        int a = shy.a(this.c, (hashCode + (ad90Var == null ? 0 : ad90Var.hashCode())) * 31, 31);
        String str = this.d;
        return a + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavesWithPages(faves=");
        sb.append(this.a);
        sb.append(", pages=");
        sb.append(this.b);
        sb.append(", count=");
        sb.append(this.c);
        sb.append(", nextFrom=");
        return ho8.a(sb, this.d, ')');
    }
}
