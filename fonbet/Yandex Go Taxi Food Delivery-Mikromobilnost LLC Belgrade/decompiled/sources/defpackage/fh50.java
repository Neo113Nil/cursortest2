package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class fh50 extends gh50 {
    public final ji50 a;

    public fh50(ji50 ji50Var) {
        this.a = ji50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fh50) && jl40.l(this.a, ((fh50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Drop(origin=" + this.a + Extension.C_BRAKE;
    }
}
