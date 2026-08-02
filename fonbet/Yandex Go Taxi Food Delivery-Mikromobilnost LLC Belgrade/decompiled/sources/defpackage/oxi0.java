package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class oxi0 implements sxi0 {
    public final zy11 a;

    public oxi0(int i) {
        this.a = zy11.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxi0) && jl40.l(this.a, ((oxi0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FullClear(unit=" + this.a + Extension.C_BRAKE;
    }

    public oxi0() {
        this(0);
    }
}
