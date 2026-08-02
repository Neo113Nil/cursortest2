package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class njl {
    public final u8j0 a;

    public njl(u8j0 u8j0Var) {
        this.a = u8j0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof njl) && this.a.equals(((njl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DivTransactionInfoState(dataRequest=" + this.a + Extension.C_BRAKE;
    }
}
