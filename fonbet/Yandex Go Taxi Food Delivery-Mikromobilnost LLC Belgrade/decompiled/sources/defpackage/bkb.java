package defpackage;

/* loaded from: classes12.dex */
public final class bkb implements snb {
    public final String a;
    public final String b;

    public bkb(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.snb
    public final String a() {
        return "first_loaded";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkb)) {
            return false;
        }
        bkb bkbVar = (bkb) obj;
        return jl40.l(this.a, bkbVar.a) && jl40.l(this.b, bkbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        return ((hashCode + (this.b == null ? 0 : r1.hashCode())) * 31) - 132844428;
    }

    public final String toString() {
        return unr0.p("CheckoutFirstLoadedAnalytics(tripId=", this.a, ", requestId=", this.b, ", eventKey=first_loaded)");
    }
}
