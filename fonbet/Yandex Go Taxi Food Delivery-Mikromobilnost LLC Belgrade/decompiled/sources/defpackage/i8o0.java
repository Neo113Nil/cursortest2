package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class i8o0 implements k8o0 {
    public final d8o0 a;

    public final boolean equals(Object obj) {
        if (obj instanceof i8o0) {
            return jl40.l(this.a, ((i8o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Badge(badge=" + this.a + Extension.C_BRAKE;
    }
}
