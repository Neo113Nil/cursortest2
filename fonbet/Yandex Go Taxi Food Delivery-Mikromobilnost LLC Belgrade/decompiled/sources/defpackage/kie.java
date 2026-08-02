package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kie implements mie {
    public final ovi0 a;

    public kie(ovi0 ovi0Var) {
        this.a = ovi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kie) && this.a.equals(((kie) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "IconContent(image=" + this.a + Extension.C_BRAKE;
    }
}
