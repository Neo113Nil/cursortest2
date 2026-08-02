package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class o4b0 extends t4b0 {
    public final w7b0 a;

    public o4b0(w7b0 w7b0Var) {
        this.a = w7b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o4b0) && jl40.l(this.a, ((o4b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AcceptGoalAction(goal=" + this.a + Extension.C_BRAKE;
    }
}
