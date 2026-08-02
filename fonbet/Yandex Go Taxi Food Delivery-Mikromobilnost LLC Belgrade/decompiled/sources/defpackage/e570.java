package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class e570 implements qas0 {
    public final b0p a;

    public e570(b0p b0pVar) {
        this.a = b0pVar;
    }

    public final b0p a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e570) && this.a.equals(((e570) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Login(browserEntity=" + this.a + Extension.C_BRAKE;
    }
}
