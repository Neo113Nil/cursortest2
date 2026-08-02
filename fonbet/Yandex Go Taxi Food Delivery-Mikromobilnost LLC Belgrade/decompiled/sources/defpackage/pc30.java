package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pc30 implements rc30 {
    public final String a;
    public final long b;

    public pc30(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc30)) {
            return false;
        }
        pc30 pc30Var = (pc30) obj;
        return this.a.equals(pc30Var.a) && this.b == pc30Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("ClosedUntil(time=", this.a, ", timeValue=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
