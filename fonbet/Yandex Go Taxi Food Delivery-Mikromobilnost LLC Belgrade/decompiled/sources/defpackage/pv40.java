package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pv40 implements rv40 {
    public final tsq a;

    public pv40(tsq tsqVar) {
        this.a = tsqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pv40) && jl40.l(this.a, ((pv40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RatingTagSelected(tag=" + this.a + Extension.C_BRAKE;
    }
}
