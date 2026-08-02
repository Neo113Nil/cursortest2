package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hp80 extends ip80 {
    public final ym80 a;

    public hp80(ym80 ym80Var) {
        this.a = ym80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hp80) && jl40.l(this.a, ((hp80) obj).a);
    }

    public final int hashCode() {
        ym80 ym80Var = this.a;
        if (ym80Var == null) {
            return 0;
        }
        return ym80Var.hashCode();
    }

    public final String toString() {
        return "StartPageApplyingOptionsLoading(state=" + this.a + Extension.C_BRAKE;
    }
}
