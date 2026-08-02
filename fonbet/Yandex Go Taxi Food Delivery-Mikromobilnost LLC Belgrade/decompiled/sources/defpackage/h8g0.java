package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h8g0 implements l8g0 {
    public final gpi0 a;

    public h8g0(gpi0 gpi0Var) {
        this.a = gpi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h8g0) && this.a.equals(((h8g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Refresh(refreshInfo=" + this.a + Extension.C_BRAKE;
    }
}
