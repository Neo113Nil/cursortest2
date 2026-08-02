package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gd40 implements td40 {
    public final gb40 a;

    static {
        gb40 gb40Var = gb40.f;
    }

    public gd40(gb40 gb40Var) {
        this.a = gb40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gd40) && jl40.l(this.a, ((gd40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadInitData(mtTrainCheckoutPayload=" + this.a + Extension.C_BRAKE;
    }
}
