package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class dq30 implements eq30 {
    public final CharSequence a;

    public dq30(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dq30) && jl40.l(this.a, ((dq30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Text(text=", Extension.C_BRAKE);
    }
}
