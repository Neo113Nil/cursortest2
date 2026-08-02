package defpackage;

import com.ybsdk.feature.partnerselection.api.SelectedPartner;
import com.ybsdk.feature.transfer.version2.api.PhoneInputSource;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class afb0 implements cfb0 {
    public final SelectedPartner a;
    public final PhoneInputSource b;

    public afb0(SelectedPartner selectedPartner, PhoneInputSource phoneInputSource) {
        this.a = selectedPartner;
        this.b = phoneInputSource;
    }

    public final PhoneInputSource a() {
        return this.b;
    }

    public final SelectedPartner b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afb0)) {
            return false;
        }
        afb0 afb0Var = (afb0) obj;
        return jl40.l(this.a, afb0Var.a) && this.b == afb0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YbCheckFound(target=" + this.a + ", inputSource=" + this.b + Extension.C_BRAKE;
    }
}
