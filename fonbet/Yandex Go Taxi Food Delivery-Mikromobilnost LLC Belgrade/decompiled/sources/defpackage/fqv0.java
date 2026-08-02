package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fqv0 implements iqv0 {
    public final u0s a;

    public fqv0(u0s u0sVar) {
        this.a = u0sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fqv0) && jl40.l(this.a, ((fqv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FooterAction(footerUiAction=" + this.a + Extension.C_BRAKE;
    }
}
