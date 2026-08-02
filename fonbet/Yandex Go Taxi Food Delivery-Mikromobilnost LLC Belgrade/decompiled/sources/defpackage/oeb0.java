package defpackage;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.phoneconfirmation.presentation.PhoneConfirmationViewState$PhoneMode;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class oeb0 {
    public final boolean a;
    public final PhoneConfirmationViewState$PhoneMode b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final kao h;
    public final boolean i;
    public final Text j;
    public final boolean k;
    public final boolean l;

    public oeb0(boolean z, PhoneConfirmationViewState$PhoneMode phoneConfirmationViewState$PhoneMode, String str, String str2, String str3, boolean z2, boolean z3, kao kaoVar, boolean z4, Text text, boolean z5, boolean z6) {
        this.a = z;
        this.b = phoneConfirmationViewState$PhoneMode;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z2;
        this.g = z3;
        this.h = kaoVar;
        this.i = z4;
        this.j = text;
        this.k = z5;
        this.l = z6;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.d;
    }

    public final kao c() {
        return this.h;
    }

    public final PhoneConfirmationViewState$PhoneMode d() {
        return this.b;
    }

    public final Text e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oeb0)) {
            return false;
        }
        oeb0 oeb0Var = (oeb0) obj;
        return this.a == oeb0Var.a && this.b == oeb0Var.b && jl40.l(this.c, oeb0Var.c) && jl40.l(this.d, oeb0Var.d) && this.e.equals(oeb0Var.e) && this.f == oeb0Var.f && this.g == oeb0Var.g && jl40.l(this.h, oeb0Var.h) && this.i == oeb0Var.i && this.j.equals(oeb0Var.j) && this.k == oeb0Var.k && this.l == oeb0Var.l;
    }

    public final String f() {
        return this.c;
    }

    public final boolean g() {
        return this.f;
    }

    public final boolean h() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int e = unr0.e(unr0.e(unr0.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        kao kaoVar = this.h;
        return Boolean.hashCode(this.l) + unr0.e(n.c(this.j, unr0.e((e + (kaoVar != null ? kaoVar.hashCode() : 0)) * 31, 31, this.i), 31), 31, this.k);
    }

    public final boolean i() {
        return this.i;
    }

    public final boolean j() {
        return this.l;
    }

    public final boolean k() {
        return this.g;
    }

    public final boolean l() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhoneConfirmationViewState(isLoading=");
        sb.append(this.a);
        sb.append(", phoneMode=");
        sb.append(this.b);
        sb.append(", predefinedPhoneNumber=");
        g8e.D(sb, this.c, ", currentInput=", this.d, ", agreement=");
        tse0.y(this.e, ", showLoadingInConfirmButton=", ", isChangeNumberEnabled=", sb, this.f);
        sb.append(this.g);
        sb.append(", errorState=");
        sb.append(this.h);
        sb.append(", showPhoneNumberError=");
        sb.append(this.i);
        sb.append(", phoneNumberErrorHint=");
        sb.append(this.j);
        sb.append(", showPhoneHint=");
        return smw0.k(", showToolbar=", Extension.C_BRAKE, sb, this.k, this.l);
    }
}
