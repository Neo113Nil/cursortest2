package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ciq0 implements fiq0 {
    public final String a;

    public /* synthetic */ ciq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ciq0) {
            return jl40.l(this.a, ((ciq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("PreselectedProgram(programName=", this.a, Extension.C_BRAKE);
    }
}
