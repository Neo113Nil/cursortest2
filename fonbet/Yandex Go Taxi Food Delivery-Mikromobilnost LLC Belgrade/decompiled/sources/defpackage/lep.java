package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class lep implements tep {
    public final tu21 a;

    public lep(tu21 tu21Var) {
        this.a = tu21Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lep) && jl40.l(this.a, ((lep) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "EmojiChanged(emoji=" + this.a + Extension.C_BRAKE;
    }
}
