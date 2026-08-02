package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class fo8 implements jo8 {
    public final rr51 a;

    public fo8(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final rr51 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fo8) && this.a.equals(((fo8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivKitContent(divData=" + this.a + Extension.C_BRAKE;
    }
}
