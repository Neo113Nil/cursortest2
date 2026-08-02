package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cp80 extends ip80 {
    public final ym80 a;

    public cp80(ym80 ym80Var) {
        this.a = ym80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cp80) && jl40.l(this.a, ((cp80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(state=" + this.a + Extension.C_BRAKE;
    }
}
