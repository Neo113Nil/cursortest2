package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class njf0 extends pjf0 {
    public final int a;
    public final boolean b;

    public njf0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njf0)) {
            return false;
        }
        njf0 njf0Var = (njf0) obj;
        return this.a == njf0Var.a && this.b == njf0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Loading(text=" + this.a + ", showCancel=" + this.b + Extension.C_BRAKE;
    }
}
