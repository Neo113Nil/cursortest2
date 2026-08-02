package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class k420 {
    public final String a;

    public k420(int i) {
        this.a = "250.2.190";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k420) && jl40.l(this.a, ((k420) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() + unr0.e(unr0.e(unr0.e(Boolean.hashCode(false) * 31, 31, false), 31, false), 31, false);
    }

    public final String toString() {
        return oyr.p("MessengerSettingsScreenConfiguration(chooseTheme=false, debugPanel=false, about=false, logout=false, appVersion=", this.a, Extension.C_BRAKE);
    }

    public k420() {
        this(0);
    }
}
