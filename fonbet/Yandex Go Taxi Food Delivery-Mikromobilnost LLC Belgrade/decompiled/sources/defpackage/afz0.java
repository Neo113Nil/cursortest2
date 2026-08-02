package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class afz0 implements bfz0 {
    public final ow91 a;

    public afz0(ow91 ow91Var) {
        this.a = ow91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afz0) && this.a.equals(((afz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "YaColorTint(color=" + this.a + Extension.C_BRAKE;
    }
}
