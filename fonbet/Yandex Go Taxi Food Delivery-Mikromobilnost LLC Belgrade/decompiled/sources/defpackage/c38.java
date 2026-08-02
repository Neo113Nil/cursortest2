package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class c38 implements e38 {
    public final u28 a;

    public c38(u28 u28Var) {
        this.a = u28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c38) && jl40.l(this.a, ((c38) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Registered(capability=" + this.a + Extension.C_BRAKE;
    }
}
