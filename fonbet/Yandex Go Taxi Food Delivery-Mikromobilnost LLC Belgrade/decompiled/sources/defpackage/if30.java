package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class if30 implements jf30 {
    public final bzy0 a;

    public if30(bzy0 bzy0Var) {
        this.a = bzy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof if30) && jl40.l(this.a, ((if30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ThreadVariants(state=" + this.a + Extension.C_BRAKE;
    }
}
