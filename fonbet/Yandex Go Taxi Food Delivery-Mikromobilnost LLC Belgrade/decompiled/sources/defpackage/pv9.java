package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pv9 implements uv9 {
    public final uj9 a;

    public pv9(uj9 uj9Var) {
        this.a = uj9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv9) && jl40.l(this.a, ((pv9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "HandleAction(action=" + this.a + Extension.C_BRAKE;
    }
}
