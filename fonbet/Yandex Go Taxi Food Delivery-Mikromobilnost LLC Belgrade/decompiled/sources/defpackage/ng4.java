package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ng4 implements qg4 {
    public final h0u a;

    public ng4(h0u h0uVar) {
        this.a = h0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng4) && this.a.equals(((ng4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShapeBackground(shape=" + this.a + Extension.C_BRAKE;
    }
}
