package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class o040 implements v040 {
    public final oyy0 a;

    public o040(lyy0 lyy0Var) {
        this.a = lyy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o040) && jl40.l(this.a, ((o040) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnItemClicked(state=" + this.a + Extension.C_BRAKE;
    }
}
