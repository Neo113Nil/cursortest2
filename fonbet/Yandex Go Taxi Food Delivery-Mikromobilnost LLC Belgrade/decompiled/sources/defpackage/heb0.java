package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class heb0 {
    public final u8j0 a;
    public final u8j0 b;
    public final Text c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public heb0(u8j0 u8j0Var, u8j0 u8j0Var2, Text text, boolean z, String str, boolean z2, boolean z3) {
        this.a = u8j0Var;
        this.b = u8j0Var2;
        this.c = text;
        this.d = z;
        this.e = str;
        this.f = z2;
        this.g = z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [u8j0] */
    public static heb0 a(heb0 heb0Var, u8j0 u8j0Var, t8j0 t8j0Var, Text text, boolean z, String str, boolean z2, int i) {
        if ((i & 1) != 0) {
            u8j0Var = heb0Var.a;
        }
        u8j0 u8j0Var2 = u8j0Var;
        t8j0 t8j0Var2 = t8j0Var;
        if ((i & 2) != 0) {
            t8j0Var2 = heb0Var.b;
        }
        t8j0 t8j0Var3 = t8j0Var2;
        heb0Var.getClass();
        if ((i & 8) != 0) {
            text = heb0Var.c;
        }
        Text text2 = text;
        if ((i & 16) != 0) {
            z = heb0Var.d;
        }
        boolean z3 = z;
        if ((i & 32) != 0) {
            str = heb0Var.e;
        }
        String str2 = str;
        boolean z4 = heb0Var.f;
        if ((i & 128) != 0) {
            z2 = heb0Var.g;
        }
        heb0Var.getClass();
        return new heb0(u8j0Var2, t8j0Var3, text2, z3, str2, z4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof heb0)) {
            return false;
        }
        heb0 heb0Var = (heb0) obj;
        return jl40.l(this.a, heb0Var.a) && jl40.l(this.b, heb0Var.b) && jl40.l(this.c, heb0Var.c) && this.d == heb0Var.d && jl40.l(this.e, heb0Var.e) && this.f == heb0Var.f && this.g == heb0Var.g;
    }

    public final int hashCode() {
        u8j0 u8j0Var = this.a;
        int hashCode = (u8j0Var == null ? 0 : u8j0Var.hashCode()) * 31;
        u8j0 u8j0Var2 = this.b;
        int e = unr0.e((hashCode + (u8j0Var2 == null ? 0 : u8j0Var2.hashCode())) * 31, 31, false);
        Text text = this.c;
        int e2 = unr0.e((e + (text == null ? 0 : text.hashCode())) * 31, 31, this.d);
        String str = this.e;
        return Boolean.hashCode(this.g) + unr0.e((e2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneConfirmationState(registrationData=");
        sb.append(this.a);
        sb.append(", otpCode=");
        sb.append(this.b);
        sb.append(", hasPhoneNumberError=false, phoneNumberErrorHint=");
        sb.append(this.c);
        sb.append(", usePredefinedPhoneNumber=");
        sb.append(this.d);
        sb.append(", userPhoneInput=");
        tse0.y(this.e, ", showAgreement=", ", needSkipPhoneConfirmationScreen=", sb, this.f);
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }

    public heb0() {
        this(false, 255);
    }

    public /* synthetic */ heb0(boolean z, int i) {
        this(null, null, null, false, null, (i & 64) != 0 ? true : z, false);
    }
}
