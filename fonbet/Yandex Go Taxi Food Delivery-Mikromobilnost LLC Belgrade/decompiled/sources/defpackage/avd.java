package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class avd implements dvd {
    public final String a;
    public final boolean b;

    public avd(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avd)) {
            return false;
        }
        avd avdVar = (avd) obj;
        return jl40.l(this.a, avdVar.a) && this.b == avdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("OptionChecked(optionName=", this.a, ", checked=", this.b, Extension.C_BRAKE);
    }
}
