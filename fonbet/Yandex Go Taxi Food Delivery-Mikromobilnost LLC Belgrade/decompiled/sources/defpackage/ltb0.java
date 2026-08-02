package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ltb0 extends tl91 {
    public final lvi0 a;

    public ltb0(lvi0 lvi0Var) {
        this.a = lvi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ltb0) && this.a.equals(((ltb0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Custom(image=" + this.a + Extension.C_BRAKE;
    }
}
