package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d030 {
    public final o330 a;

    public d030(o330 o330Var) {
        this.a = o330Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d030) && this.a.equals(((d030) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Button(title=" + this.a + Extension.C_BRAKE;
    }
}
