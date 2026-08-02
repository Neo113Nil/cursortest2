package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class es9 implements gs9 {
    public final uj9 a;

    public es9(uj9 uj9Var) {
        this.a = uj9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof es9) && this.a.equals(((es9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PerformAction(action=" + this.a + Extension.C_BRAKE;
    }
}
