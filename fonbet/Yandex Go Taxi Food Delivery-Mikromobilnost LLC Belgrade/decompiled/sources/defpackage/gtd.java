package defpackage;

/* loaded from: classes2.dex */
public final class gtd {
    public final etd a;
    public final btd b;
    public final ftd c;

    public gtd(etd etdVar, btd btdVar, ftd ftdVar) {
        this.a = etdVar;
        this.b = btdVar;
        this.c = ftdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtd)) {
            return false;
        }
        gtd gtdVar = (gtd) obj;
        return this.a.equals(gtdVar.a) && this.b.equals(gtdVar.b) && jl40.l(this.c, gtdVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ftd ftdVar = this.c;
        return hashCode + (ftdVar == null ? 0 : ftdVar.hashCode());
    }

    public final String toString() {
        return "Upsale(offer=" + this.a + ", asset=" + this.b + ", storePurchaseInfo=" + this.c + ')';
    }
}
