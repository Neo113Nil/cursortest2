package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bsj {
    public final srj a;
    public final lqj b;
    public final aqj c;
    public final bqj d;

    public bsj(srj srjVar, lqj lqjVar, aqj aqjVar, bqj bqjVar) {
        this.a = srjVar;
        this.b = lqjVar;
        this.c = aqjVar;
        this.d = bqjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsj)) {
            return false;
        }
        bsj bsjVar = (bsj) obj;
        return this.a.equals(bsjVar.a) && this.b.equals(bsjVar.b) && jl40.l(this.c, bsjVar.c) && jl40.l(this.d, bsjVar.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.a.hashCode() * 31, 31, this.b.a);
        aqj aqjVar = this.c;
        int hashCode = (c + (aqjVar == null ? 0 : aqjVar.hashCode())) * 31;
        bqj bqjVar = this.d;
        return hashCode + (bqjVar != null ? bqjVar.a.hashCode() : 0);
    }

    public final String toString() {
        return "DiscountsViewState(toolbar=" + this.a + ", list=" + this.b + ", footer=" + this.c + ", inviteButton=" + this.d + Extension.C_BRAKE;
    }
}
