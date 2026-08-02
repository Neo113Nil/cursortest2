package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class eiq0 implements fiq0 {
    public final String a;

    public /* synthetic */ eiq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eiq0) {
            return jl40.l(this.a, ((eiq0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("SelectedByUserProgram(programName=", this.a, Extension.C_BRAKE);
    }
}
