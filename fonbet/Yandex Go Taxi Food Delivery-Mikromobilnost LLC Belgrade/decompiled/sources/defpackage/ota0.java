package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class ota0 {
    public final int a;
    public final boolean b;

    public ota0(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ota0)) {
            return false;
        }
        ota0 ota0Var = (ota0) obj;
        return this.a == ota0Var.a && this.b == ota0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PendingStar(pendingId=" + this.a + ", isStarred=" + this.b + Extension.C_BRAKE;
    }
}
