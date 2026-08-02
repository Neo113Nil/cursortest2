package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class mzd implements ozd {
    public final String a;
    public final String b;
    public final boolean c;

    public mzd(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mzd)) {
            return false;
        }
        mzd mzdVar = (mzd) obj;
        return jl40.l(this.a, mzdVar.a) && jl40.l(this.b, mzdVar.b) && this.c == mzdVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.c) + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return x4e.i(b64.v("StaticGraphics(id=", this.a, ", backgroundColor=", this.b, ", isMaxScreenBrightness="), this.c, Extension.C_BRAKE);
    }
}
