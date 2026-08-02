package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nlj implements olj {
    public final glj a;

    public nlj(glj gljVar) {
        this.a = gljVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nlj) && this.a.equals(((nlj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnDirectionSelected(direction=" + this.a + Extension.C_BRAKE;
    }
}
