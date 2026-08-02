package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g7e {
    public final int a;

    public /* synthetic */ g7e(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g7e) {
            return this.a == ((g7e) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "ConstrainedView(id=", Extension.C_BRAKE);
    }
}
