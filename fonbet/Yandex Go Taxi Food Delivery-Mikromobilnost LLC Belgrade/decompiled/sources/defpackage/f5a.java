package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class f5a implements g5a {
    public final String a;

    public f5a(String str) {
        this.a = str;
    }

    @Override // defpackage.g5a
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5a) && jl40.l(this.a, ((f5a) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("Orders(modeId=", this.a, Extension.C_BRAKE);
    }
}
