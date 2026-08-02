package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class lbj {
    public final String a;

    public /* synthetic */ lbj(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lbj) {
            return jl40.l(this.a, ((lbj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("DevicePerformanceClass(name=", this.a, Extension.C_BRAKE);
    }
}
