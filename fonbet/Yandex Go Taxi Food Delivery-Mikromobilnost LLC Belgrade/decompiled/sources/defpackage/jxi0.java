package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class jxi0 implements sxi0 {
    public final zy11 a;

    public jxi0(int i) {
        this.a = zy11.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jxi0) && jl40.l(this.a, ((jxi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ClearUnselected(unit=" + this.a + Extension.C_BRAKE;
    }

    public jxi0() {
        this(0);
    }
}
