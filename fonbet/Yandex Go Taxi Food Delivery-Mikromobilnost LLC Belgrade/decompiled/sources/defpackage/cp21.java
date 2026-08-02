package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cp21 implements ep21 {
    public final mo21 a;

    public cp21(mo21 mo21Var) {
        this.a = mo21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp21) && jl40.l(this.a, ((cp21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(location=" + this.a + Extension.C_BRAKE;
    }
}
