package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jj31 implements uni {
    public final o9z0 a;

    public jj31(o9z0 o9z0Var) {
        this.a = o9z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jj31) && jl40.l(this.a, ((jj31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VerticalTimelineArgs(action=" + this.a + Extension.C_BRAKE;
    }
}
