package defpackage;

import com.ybsdk.feature.transfer.version2.internal.entities.ResultStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nh01 {
    public final ResultStatus a;
    public final String b;
    public final String c;
    public final String d;

    public nh01(ResultStatus resultStatus, String str, String str2, String str3) {
        this.a = resultStatus;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nh01)) {
            return false;
        }
        nh01 nh01Var = (nh01) obj;
        return this.a == nh01Var.a && jl40.l(this.b, nh01Var.b) && jl40.l(this.c, nh01Var.c) && jl40.l(this.d, nh01Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferConfirmEntity(status=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        return g8e.r(sb, this.c, ", requestId=", this.d, Extension.C_BRAKE);
    }
}
