package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a9k0 implements ibk0 {
    public final boolean a;

    public a9k0(boolean z) {
        this.a = z;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return "accordion_state_change";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a9k0) && this.a == ((a9k0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("AccordionStateChange(isCollapsed=", Extension.C_BRAKE, this.a);
    }
}
