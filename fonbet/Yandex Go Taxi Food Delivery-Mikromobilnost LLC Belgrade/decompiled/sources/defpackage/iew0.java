package defpackage;

import com.yandex.go.dto.response.q1;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class iew0 {
    public final String a;
    public final CharSequence b;
    public final q1 c;
    public final cew0 d;
    public final hew0 e;

    public iew0(String str, CharSequence charSequence, q1 q1Var, cew0 cew0Var, hew0 hew0Var) {
        this.a = str;
        this.b = charSequence;
        this.c = q1Var;
        this.d = cew0Var;
        this.e = hew0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iew0)) {
            return false;
        }
        iew0 iew0Var = (iew0) obj;
        return jl40.l(this.a, iew0Var.a) && jl40.l(this.b, iew0Var.b) && jl40.l(this.c, iew0Var.c) && jl40.l(this.d, iew0Var.d) && jl40.l(this.e, iew0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        q1 q1Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (q1Var == null ? 0 : q1Var.hashCode())) * 31)) * 31;
        hew0 hew0Var = this.e;
        return hashCode3 + (hew0Var != null ? hew0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Button(imageTag=", this.a, ", contentDescription=", ", action=");
        t.append(this.c);
        t.append(", icon=");
        t.append(this.d);
        t.append(", lottieAnimation=");
        t.append(this.e);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
