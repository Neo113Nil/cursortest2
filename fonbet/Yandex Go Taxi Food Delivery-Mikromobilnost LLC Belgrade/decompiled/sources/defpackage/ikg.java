package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ikg implements lkg {
    public final bpc a;

    public ikg(bpc bpcVar) {
        this.a = bpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ikg) && this.a.equals(((ikg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + Extension.C_BRAKE;
    }
}
