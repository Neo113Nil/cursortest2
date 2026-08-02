package defpackage;

import com.ybsdk.widgets.common.k;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kfi0 {
    public final String a;
    public final k b;

    public kfi0(String str, k kVar) {
        this.a = str;
        this.b = kVar;
    }

    public final k a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfi0)) {
            return false;
        }
        kfi0 kfi0Var = (kfi0) obj;
        return jl40.l(this.a, kfi0Var.a) && this.b.equals(kfi0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "RebindPaymentMethodViewState(url3ds=" + this.a + ", overlayDialogState=" + this.b + Extension.C_BRAKE;
    }
}
