package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class i9s {
    public final apu a;
    public final int b;

    public i9s(apu apuVar, int i) {
        this.a = apuVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9s)) {
            return false;
        }
        i9s i9sVar = (i9s) obj;
        return this.a.equals(i9sVar.a) && this.b == i9sVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FindHolderInfo(holder=" + this.a + ", offset=" + this.b + Extension.C_BRAKE;
    }
}
