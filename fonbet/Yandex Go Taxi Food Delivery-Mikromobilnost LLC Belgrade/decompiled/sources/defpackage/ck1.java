package defpackage;

import com.yandex.go.agreement.api.Acceptance$Default$IconStyle;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ck1 {
    public static final ck1 g = new ck1(null, null, new q47((List) null, 3), false, Acceptance$Default$IconStyle.CENTER, null);
    public final String a;
    public final String b;
    public final q47 c;
    public final boolean d;
    public final Acceptance$Default$IconStyle e;
    public final String f;

    public ck1(String str, String str2, q47 q47Var, boolean z, Acceptance$Default$IconStyle acceptance$Default$IconStyle, String str3) {
        this.a = str;
        this.b = str2;
        this.c = q47Var;
        this.d = z;
        this.e = acceptance$Default$IconStyle;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck1)) {
            return false;
        }
        ck1 ck1Var = (ck1) obj;
        return jl40.l(this.a, ck1Var.a) && jl40.l(this.b, ck1Var.b) && this.c.equals(ck1Var.c) && this.d == ck1Var.d && this.e == ck1Var.e && jl40.l(this.f, ck1Var.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (this.e.hashCode() + unr0.e((this.c.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.d)) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("AgreementModalUiState(title=", this.a, ", description=", this.b, ", bottomButtons=");
        v.append(this.c);
        v.append(", isCloseButtonVisible=");
        v.append(this.d);
        v.append(", iconStyle=");
        v.append(this.e);
        v.append(", iconUrl=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
