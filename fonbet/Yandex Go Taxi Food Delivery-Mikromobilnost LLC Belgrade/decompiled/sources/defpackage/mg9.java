package defpackage;

import com.yandex.go.order.tariffs_suggest.mapper.ChangeStatusUiState$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mg9 {
    public final ChangeStatusUiState$Status a;
    public final String b;
    public final String c;
    public final lg9 d;
    public final String e;

    public mg9(ChangeStatusUiState$Status changeStatusUiState$Status, String str, String str2, lg9 lg9Var, String str3) {
        this.a = changeStatusUiState$Status;
        this.b = str;
        this.c = str2;
        this.d = lg9Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mg9)) {
            return false;
        }
        mg9 mg9Var = (mg9) obj;
        return this.a == mg9Var.a && jl40.l(this.b, mg9Var.b) && jl40.l(this.c, mg9Var.c) && this.d.equals(mg9Var.d) && jl40.l(this.e, mg9Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChangeStatusUiState(status=");
        sb.append(this.a);
        sb.append(", changeId=");
        sb.append(this.b);
        sb.append(", reason=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", orderId=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
