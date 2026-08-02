package defpackage;

import kotlin.Result;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ph90 {
    public final String a;
    public final String b;
    public final Result c;

    public ph90(String str, String str2, Result result) {
        this.a = str;
        this.b = str2;
        this.c = result;
    }

    public static ph90 a(ph90 ph90Var, String str, String str2, Result result, int i) {
        if ((i & 1) != 0) {
            str = ph90Var.a;
        }
        if ((i & 2) != 0) {
            str2 = ph90Var.b;
        }
        if ((i & 4) != 0) {
            result = ph90Var.c;
        }
        ph90Var.getClass();
        return new ph90(str, str2, result);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ph90)) {
            return false;
        }
        ph90 ph90Var = (ph90) obj;
        return jl40.l(this.a, ph90Var.a) && jl40.l(this.b, ph90Var.b) && jl40.l(this.c, ph90Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Result result = this.c;
        return hashCode2 + (result != null ? Result.b(result.getValue()) : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PartnerSaveState(memberId=", this.a, ", requestId=", this.b, ", saveStatus=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
