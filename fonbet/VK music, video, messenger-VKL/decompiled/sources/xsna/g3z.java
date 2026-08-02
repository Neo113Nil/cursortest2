package xsna;

import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.List;

/* compiled from: LibverifyInSmartflowOpenInfo.kt */
/* loaded from: classes15.dex */
public final class g3z {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final VkAuthValidateAccountResponse.NextStep.FactorsNumber e;
    public final List<LibverifyValidationType> f;

    /* JADX WARN: Multi-variable type inference failed */
    public g3z(String str, String str2, boolean z, String str3, VkAuthValidateAccountResponse.NextStep.FactorsNumber factorsNumber, List<? extends LibverifyValidationType> list) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = factorsNumber;
        this.f = list;
    }

    public final String a() {
        return this.d;
    }

    public final VkAuthValidateAccountResponse.NextStep.FactorsNumber b() {
        return this.e;
    }

    public final boolean c() {
        return this.c;
    }

    public final List<LibverifyValidationType> d() {
        return this.f;
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3z)) {
            return false;
        }
        g3z g3zVar = (g3z) obj;
        return epx.f(this.a, g3zVar.a) && epx.f(this.b, g3zVar.b) && this.c == g3zVar.c && epx.f(this.d, g3zVar.d) && this.e == g3zVar.e && epx.f(this.f, g3zVar.f);
    }

    public final String f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + urd0.a(qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31;
        List<LibverifyValidationType> list = this.f;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibverifyInSmartflowOpenInfo(phone=");
        sb.append(this.a);
        sb.append(", sid=");
        sb.append(this.b);
        sb.append(", hasAnotherVerificationMethods=");
        sb.append(this.c);
        sb.append(", externalId=");
        sb.append(this.d);
        sb.append(", factorsNumber=");
        sb.append(this.e);
        sb.append(", libverifyValidationTypes=");
        return ms9.a(')', sb, this.f);
    }
}
