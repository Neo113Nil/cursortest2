package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ee3 {
    public final xd3 a;

    public ee3(xd3 xd3Var) {
        this.a = xd3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee3) && this.a.equals(((ee3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AuctionLeadUiState(buttonUiState=" + this.a + Extension.C_BRAKE;
    }
}
