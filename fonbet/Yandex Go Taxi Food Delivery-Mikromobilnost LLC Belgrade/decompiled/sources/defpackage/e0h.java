package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class e0h implements f0h {
    public final w2d0 a;

    public e0h(w2d0 w2d0Var) {
        this.a = w2d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0h) && this.a == ((e0h) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PlusCard(plusHomeConfig=" + this.a + Extension.C_BRAKE;
    }
}
