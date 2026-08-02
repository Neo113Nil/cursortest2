package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pt30 implements vt30 {
    public final fu30 a;

    public pt30(fu30 fu30Var) {
        this.a = fu30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pt30) && jl40.l(this.a, ((pt30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OptionTapped(option=" + this.a + Extension.C_BRAKE;
    }
}
