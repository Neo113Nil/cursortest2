package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class et01 {
    public final TransferStatus a;
    public final String b;
    public final String c;
    public final String d;
    public final mw3 e;

    public /* synthetic */ et01(TransferStatus transferStatus, String str, String str2, mw3 mw3Var, int i) {
        this(transferStatus, (String) null, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : mw3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et01)) {
            return false;
        }
        et01 et01Var = (et01) obj;
        return this.a == et01Var.a && jl40.l(this.b, et01Var.b) && jl40.l(this.c, et01Var.c) && jl40.l(this.d, et01Var.d) && jl40.l(this.e, et01Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = unr0.b(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        mw3 mw3Var = this.e;
        return b + (mw3Var != null ? mw3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferStatusEntity(status=");
        sb.append(this.a);
        sb.append(", transferId=");
        sb.append(this.b);
        sb.append(", message=");
        g8e.D(sb, this.c, ", description=", this.d, ", autoTopupOffer=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public et01(TransferStatus transferStatus, String str, String str2, String str3, mw3 mw3Var) {
        this.a = transferStatus;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = mw3Var;
    }
}
