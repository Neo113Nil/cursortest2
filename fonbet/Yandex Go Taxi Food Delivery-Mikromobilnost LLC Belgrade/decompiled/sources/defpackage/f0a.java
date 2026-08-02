package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class f0a implements o0a {
    public final yy9 a;

    public f0a(yy9 yy9Var) {
        this.a = yy9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0a) && jl40.l(this.a, ((f0a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnChipClick(chip=" + this.a + Extension.C_BRAKE;
    }
}
