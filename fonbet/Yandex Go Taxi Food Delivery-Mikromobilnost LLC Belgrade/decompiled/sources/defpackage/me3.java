package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class me3 {
    public final td3 a;
    public final ee3 b;
    public final wd3 c;
    public final he3 d;

    public me3(td3 td3Var, ee3 ee3Var, wd3 wd3Var, he3 he3Var) {
        this.a = td3Var;
        this.b = ee3Var;
        this.c = wd3Var;
        this.d = he3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me3)) {
            return false;
        }
        me3 me3Var = (me3) obj;
        return this.a.equals(me3Var.a) && this.b.equals(me3Var.b) && this.c.equals(me3Var.c) && this.d.equals(me3Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AuctionUiState(backgroundUiState=" + this.a + ", leadUiState=" + this.b + ", bodyUiState=" + this.c + ", trailUiState=" + this.d + Extension.C_BRAKE;
    }
}
