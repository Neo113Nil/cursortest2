package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kcg0 implements lcg0 {
    public final dtj0 a;

    public kcg0(dtj0 dtj0Var) {
        this.a = dtj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kcg0) && jl40.l(this.a, ((kcg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(data=" + this.a + Extension.C_BRAKE;
    }
}
