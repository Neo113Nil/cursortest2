package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class au9 implements cu9 {
    public final String a;

    public au9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof au9) && jl40.l(this.a, ((au9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("ActivatePromocode(promocodeName=", this.a, Extension.C_BRAKE);
    }
}
