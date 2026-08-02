package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.Status;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class km01 {
    public final d910 a;
    public final List b;
    public final c910 c;
    public final Status d;
    public final String e;

    public km01(d910 d910Var, List list, c910 c910Var, Status status, String str) {
        this.a = d910Var;
        this.b = list;
        this.c = c910Var;
        this.d = status;
        this.e = str;
    }

    public static km01 a(km01 km01Var, Status status, String str, int i) {
        d910 d910Var = km01Var.a;
        List list = km01Var.b;
        c910 c910Var = km01Var.c;
        if ((i & 16) != 0) {
            str = km01Var.e;
        }
        km01Var.getClass();
        return new km01(d910Var, list, c910Var, status, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km01)) {
            return false;
        }
        km01 km01Var = (km01) obj;
        return jl40.l(this.a, km01Var.a) && this.b.equals(km01Var.b) && jl40.l(this.c, km01Var.c) && this.d == km01Var.d && jl40.l(this.e, km01Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransferMe2MeConfirmSuccessState(me2MeDebitAutoPullEntity=");
        sb.append(this.a);
        sb.append(", agreements=");
        sb.append(this.b);
        sb.append(", currentAgreement=");
        sb.append(this.c);
        sb.append(", status=");
        sb.append(this.d);
        sb.append(", operationId=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
