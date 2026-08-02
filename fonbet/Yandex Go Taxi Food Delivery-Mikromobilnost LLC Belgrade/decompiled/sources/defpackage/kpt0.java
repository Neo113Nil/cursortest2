package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class kpt0 implements zwz0 {
    public final lpt0 a;

    public kpt0(lpt0 lpt0Var) {
        this.a = lpt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kpt0) && jl40.l(this.a, ((kpt0) obj).a);
    }

    public final int hashCode() {
        lpt0 lpt0Var = this.a;
        if (lpt0Var == null) {
            return 0;
        }
        return lpt0Var.hashCode();
    }

    public final String toString() {
        return "SpeedGroupContent(state=" + this.a + Extension.C_BRAKE;
    }
}
