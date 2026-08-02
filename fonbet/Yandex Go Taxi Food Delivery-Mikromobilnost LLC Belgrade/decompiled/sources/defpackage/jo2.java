package defpackage;

import kotlin.Result;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jo2 {
    public final Object a;
    public final String b;

    public jo2(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo2)) {
            return false;
        }
        jo2 jo2Var = (jo2) obj;
        return jl40.l(this.a, jo2Var.a) && jl40.l(this.b, jo2Var.b);
    }

    public final int hashCode() {
        int b = Result.b(this.a) * 31;
        String str = this.b;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("ApiResult(result=", Result.c(this.a), ", requestId=", this.b, Extension.C_BRAKE);
    }
}
