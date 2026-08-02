package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ga01 implements ja01 {
    public final ra90 a;

    public ga01(ra90 ra90Var) {
        this.a = ra90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ga01) && this.a.equals(((ga01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CustomIcon(icon=" + this.a + Extension.C_BRAKE;
    }
}
