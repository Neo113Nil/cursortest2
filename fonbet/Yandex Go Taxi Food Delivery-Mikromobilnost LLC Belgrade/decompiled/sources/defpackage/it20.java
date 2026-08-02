package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.selectcontact.presentation.MobilePaymentSelectContactState$SelectedContact$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class it20 {
    public final jfb0 a;
    public final MobilePaymentSelectContactState$SelectedContact$Status b;

    public it20(jfb0 jfb0Var, MobilePaymentSelectContactState$SelectedContact$Status mobilePaymentSelectContactState$SelectedContact$Status) {
        this.a = jfb0Var;
        this.b = mobilePaymentSelectContactState$SelectedContact$Status;
    }

    public static it20 a(it20 it20Var, MobilePaymentSelectContactState$SelectedContact$Status mobilePaymentSelectContactState$SelectedContact$Status) {
        jfb0 jfb0Var = it20Var.a;
        it20Var.getClass();
        return new it20(jfb0Var, mobilePaymentSelectContactState$SelectedContact$Status);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it20)) {
            return false;
        }
        it20 it20Var = (it20) obj;
        return jl40.l(this.a, it20Var.a) && this.b == it20Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedContact(phoneNumber=" + this.a + ", status=" + this.b + Extension.C_BRAKE;
    }
}
