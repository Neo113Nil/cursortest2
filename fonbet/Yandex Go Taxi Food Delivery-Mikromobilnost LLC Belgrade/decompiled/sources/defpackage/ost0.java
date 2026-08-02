package defpackage;

import com.ybsdk.feature.pdf.internal.entities.SplitContractDraftStatus$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ost0 {
    public final SplitContractDraftStatus$Status a;
    public final String b;

    public ost0(SplitContractDraftStatus$Status splitContractDraftStatus$Status, String str) {
        this.a = splitContractDraftStatus$Status;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ost0)) {
            return false;
        }
        ost0 ost0Var = (ost0) obj;
        return this.a == ost0Var.a && jl40.l(this.b, ost0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SplitContractDraftStatus(status=" + this.a + ", url=" + this.b + Extension.C_BRAKE;
    }
}
