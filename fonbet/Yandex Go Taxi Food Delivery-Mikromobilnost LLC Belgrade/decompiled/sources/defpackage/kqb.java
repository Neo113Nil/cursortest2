package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class kqb extends lqb {
    public final CharSequence a;

    public kqb(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override // defpackage.lqb
    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kqb) && jl40.l(this.a, ((kqb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.h(this.a, "Unselectable(text=", Extension.C_BRAKE);
    }
}
