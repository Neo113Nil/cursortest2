package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class pa70 {
    public final gq4 a;

    public /* synthetic */ pa70(gq4 gq4Var) {
        this.a = gq4Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pa70) {
            return jl40.l(this.a, ((pa70) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpeningBankDialogPayload(bankInfo=" + this.a + Extension.C_BRAKE;
    }
}
