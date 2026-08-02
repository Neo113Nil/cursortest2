package defpackage;

import com.ybsdk.core.analytics.generated.delegates.TransferEvents$TransferAmountEditedScreen;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kj01 {
    public final String a;
    public final boolean b;
    public final TransferEvents$TransferAmountEditedScreen c;

    public kj01(String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = z ? TransferEvents$TransferAmountEditedScreen.FINISH : TransferEvents$TransferAmountEditedScreen.START;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kj01)) {
            return false;
        }
        kj01 kj01Var = (kj01) obj;
        return this.a.equals(kj01Var.a) && this.b == kj01Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("AmountWrapper(amount=", this.a, ", receiverChosen=", this.b, Extension.C_BRAKE);
    }
}
