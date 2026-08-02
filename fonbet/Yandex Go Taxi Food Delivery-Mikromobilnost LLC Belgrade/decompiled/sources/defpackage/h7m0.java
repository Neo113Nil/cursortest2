package defpackage;

import com.ybsdk.feature.savings.internal.screens.name.SavingsAccountNameValidationError;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h7m0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final SavingsAccountNameValidationError e;
    public final boolean f;

    public /* synthetic */ h7m0(String str, String str2, String str3, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, null, null, false);
    }

    public static h7m0 a(h7m0 h7m0Var, String str, String str2, SavingsAccountNameValidationError savingsAccountNameValidationError, boolean z, int i) {
        String str3 = h7m0Var.a;
        String str4 = h7m0Var.b;
        if ((i & 4) != 0) {
            str = h7m0Var.c;
        }
        String str5 = str;
        if ((i & 8) != 0) {
            str2 = h7m0Var.d;
        }
        String str6 = str2;
        if ((i & 16) != 0) {
            savingsAccountNameValidationError = h7m0Var.e;
        }
        SavingsAccountNameValidationError savingsAccountNameValidationError2 = savingsAccountNameValidationError;
        if ((i & 32) != 0) {
            z = h7m0Var.f;
        }
        h7m0Var.getClass();
        return new h7m0(str3, str4, str5, str6, savingsAccountNameValidationError2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7m0)) {
            return false;
        }
        h7m0 h7m0Var = (h7m0) obj;
        return jl40.l(this.a, h7m0Var.a) && jl40.l(this.b, h7m0Var.b) && jl40.l(this.c, h7m0Var.c) && jl40.l(this.d, h7m0Var.d) && this.e == h7m0Var.e && this.f == h7m0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        SavingsAccountNameValidationError savingsAccountNameValidationError = this.e;
        return Boolean.hashCode(this.f) + ((hashCode4 + (savingsAccountNameValidationError != null ? savingsAccountNameValidationError.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("SavingsAccountNameState(title=", this.a, ", subtitle=", this.b, ", currentName=");
        g8e.D(v, this.c, ", pendingName=", this.d, ", validationError=");
        v.append(this.e);
        v.append(", renamingInProgress=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h7m0() {
        this(r0, r0, r0, 63);
        String str = null;
    }

    public h7m0(String str, String str2, String str3, String str4, SavingsAccountNameValidationError savingsAccountNameValidationError, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = savingsAccountNameValidationError;
        this.f = z;
    }
}
