package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.c10;

/* loaded from: classes7.dex */
public final class ez61 {
    public final c10 a;
    public final String b;

    public ez61(c10 c10Var, String str) {
        this.a = c10Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ez61)) {
            return false;
        }
        ez61 ez61Var = (ez61) obj;
        return this.a == ez61Var.a && jl40.l(this.b, ez61Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CoreNativeCloseButton(type=" + this.a + ", text=" + this.b + Extension.C_BRAKE;
    }
}
