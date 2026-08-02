package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a5w0 implements b5w0 {
    public final CharSequence a;

    public /* synthetic */ a5w0(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a5w0) {
            return jl40.l(this.a, ((a5w0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Static(text=", Extension.C_BRAKE);
    }
}
