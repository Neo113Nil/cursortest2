package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class j8o0 implements k8o0 {
    public final CharSequence a;

    public final boolean equals(Object obj) {
        if (obj instanceof j8o0) {
            return jl40.l(this.a, ((j8o0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Text(text=", Extension.C_BRAKE);
    }
}
