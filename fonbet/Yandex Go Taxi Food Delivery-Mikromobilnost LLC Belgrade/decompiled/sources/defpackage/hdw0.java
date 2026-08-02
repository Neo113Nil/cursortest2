package defpackage;

import com.yandex.go.dto.response.q1;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hdw0 {
    public final String a;
    public final String b;
    public final q1 c;
    public final fdw0 d;
    public final gdw0 e;

    public hdw0(String str, String str2, q1 q1Var, fdw0 fdw0Var, gdw0 gdw0Var) {
        this.a = str;
        this.b = str2;
        this.c = q1Var;
        this.d = fdw0Var;
        this.e = gdw0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdw0)) {
            return false;
        }
        hdw0 hdw0Var = (hdw0) obj;
        return jl40.l(this.a, hdw0Var.a) && jl40.l(this.b, hdw0Var.b) && jl40.l(this.c, hdw0Var.c) && jl40.l(this.d, hdw0Var.d) && jl40.l(this.e, hdw0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        q1 q1Var = this.c;
        int hashCode3 = (hashCode2 + (q1Var == null ? 0 : q1Var.hashCode())) * 31;
        fdw0 fdw0Var = this.d;
        int hashCode4 = (hashCode3 + (fdw0Var == null ? 0 : fdw0Var.hashCode())) * 31;
        gdw0 gdw0Var = this.e;
        return hashCode4 + (gdw0Var != null ? gdw0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(imageTag=", this.a, ", contentDescription=", this.b, ", action=");
        v.append(this.c);
        v.append(", lottieAnimation=");
        v.append(this.d);
        v.append(", rotatableIcon=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
