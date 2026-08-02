package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class l4w {
    public final String a;
    public final String b;

    public l4w(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4w)) {
            return false;
        }
        l4w l4wVar = (l4w) obj;
        return jl40.l(this.a, l4wVar.a) && jl40.l(this.b, l4wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("InstructionsConfig(instructionsFolderName=", this.a, ", instructionsFileName=", this.b, Extension.C_BRAKE);
    }

    public l4w() {
        this("", "");
    }
}
