package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ctj0 {
    public final List a;
    public final String b;
    public final String c;

    public ctj0(List list, String str, String str2) {
        this.a = list;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final List c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctj0)) {
            return false;
        }
        ctj0 ctj0Var = (ctj0) obj;
        return jl40.l(this.a, ctj0Var.a) && jl40.l(this.b, ctj0Var.b) && jl40.l(this.c, ctj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(xvz.s("ResolvingQrRuleEntity(regexes=", this.a, ", category=", this.b, ", deeplinkTemplate="), this.c, Extension.C_BRAKE);
    }
}
