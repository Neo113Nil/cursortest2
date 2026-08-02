package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class eof extends hof {
    public final int a;
    public final Integer b;

    public eof(int i, Integer num) {
        this.a = i;
        this.b = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eof)) {
            return false;
        }
        eof eofVar = (eof) obj;
        return this.a == eofVar.a && this.b.equals(eofVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Error(errorTitle=" + this.a + ", errorSubtitle=" + this.b + Extension.C_BRAKE;
    }
}
