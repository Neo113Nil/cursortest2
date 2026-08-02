package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ea11 implements ga11 {
    public final bzy0 a;

    public ea11(bzy0 bzy0Var) {
        this.a = bzy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea11) && jl40.l(this.a, ((ea11) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenThreadVariants(state=" + this.a + Extension.C_BRAKE;
    }
}
