package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ggb0 {
    public final Boolean a;

    public ggb0(Boolean bool) {
        this.a = bool;
    }

    public final Boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ggb0) && jl40.l(this.a, ((ggb0) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "PhonishUpgradeDeeplink(required=" + this.a + Extension.C_BRAKE;
    }

    public ggb0() {
        this(null);
    }
}
