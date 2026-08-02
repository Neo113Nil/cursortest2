package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ln31 extends abo {
    public final String a;

    public ln31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ln31) && this.a.equals(((ln31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("LoadPreInstructionEvent(preInstructionText=", this.a, Extension.C_BRAKE);
    }
}
