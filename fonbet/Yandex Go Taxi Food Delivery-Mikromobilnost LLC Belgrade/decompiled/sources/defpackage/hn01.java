package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.phone.TransferPhoneInputState$SelectedPhone$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hn01 {
    public final jfb0 a;
    public final TransferPhoneInputState$SelectedPhone$Status b;

    public hn01(jfb0 jfb0Var, TransferPhoneInputState$SelectedPhone$Status transferPhoneInputState$SelectedPhone$Status) {
        this.a = jfb0Var;
        this.b = transferPhoneInputState$SelectedPhone$Status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn01)) {
            return false;
        }
        hn01 hn01Var = (hn01) obj;
        return jl40.l(this.a, hn01Var.a) && this.b == hn01Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedPhone(phoneNumber=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
