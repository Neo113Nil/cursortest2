package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class fze {
    public final int a;
    public final boolean b;

    public fze(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fze)) {
            return false;
        }
        fze fzeVar = (fze) obj;
        return this.a == fzeVar.a && this.b == fzeVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CounterData(currentCounterValue=" + this.a + ", shouldShowCounter=" + this.b + Extension.C_BRAKE;
    }
}
