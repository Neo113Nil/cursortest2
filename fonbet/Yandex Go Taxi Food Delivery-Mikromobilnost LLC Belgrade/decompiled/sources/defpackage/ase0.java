package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ase0 extends qse0 {
    public final sny a;

    public ase0(sny snyVar) {
        this.a = snyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ase0) && jl40.l(this.a, ((ase0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FromLinkedOrder(orderKey=" + this.a + Extension.C_BRAKE;
    }
}
