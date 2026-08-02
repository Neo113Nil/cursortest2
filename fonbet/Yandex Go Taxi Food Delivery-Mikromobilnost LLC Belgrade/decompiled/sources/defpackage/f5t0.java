package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f5t0 implements j5t0 {
    public final in00 a;

    public f5t0(in00 in00Var) {
        this.a = in00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5t0) && this.a.equals(((f5t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RedrawMapObject(mapObject=" + this.a + Extension.C_BRAKE;
    }
}
