package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p000 {
    public final m000 a;

    public p000(m000 m000Var) {
        this.a = m000Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p000) && jl40.l(this.a, ((p000) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Payload(deeplinkData=" + this.a + Extension.C_BRAKE;
    }
}
