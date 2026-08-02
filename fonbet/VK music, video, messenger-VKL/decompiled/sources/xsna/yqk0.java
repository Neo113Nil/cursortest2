package xsna;

import com.vk.auth.main.LibverifyFactorsForKazakhstan;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import java.util.List;

/* compiled from: StartVerificationData.kt */
/* loaded from: classes15.dex */
public final class yqk0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final List<LibverifyValidationType> d;
    public final LibverifyFactorsForKazakhstan e;
    public final boolean f;

    public yqk0() {
        this(null, null, false, null, null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqk0)) {
            return false;
        }
        yqk0 yqk0Var = (yqk0) obj;
        return epx.f(this.a, yqk0Var.a) && epx.f(this.b, yqk0Var.b) && this.c == yqk0Var.c && epx.f(this.d, yqk0Var.d) && epx.f(this.e, yqk0Var.e) && this.f == yqk0Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int b = qoy.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        List<LibverifyValidationType> list = this.d;
        int hashCode2 = (b + (list == null ? 0 : list.hashCode())) * 31;
        LibverifyFactorsForKazakhstan libverifyFactorsForKazakhstan = this.e;
        return Boolean.hashCode(this.f) + ((hashCode2 + (libverifyFactorsForKazakhstan != null ? libverifyFactorsForKazakhstan.a.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StartVerificationData(startPhone=");
        sb.append(this.a);
        sb.append(", startExternalId=");
        sb.append(this.b);
        sb.append(", startCallInToggleEnabled=");
        sb.append(this.c);
        sb.append(", startValidationTypes=");
        sb.append(this.d);
        sb.append(", startFactorsForKazakhstan=");
        sb.append(this.e);
        sb.append(", startMessengersEnabled=");
        return defpackage.q0.a(sb, this.f, ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public yqk0(String str, String str2, boolean z, List<? extends LibverifyValidationType> list, LibverifyFactorsForKazakhstan libverifyFactorsForKazakhstan, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
        this.e = libverifyFactorsForKazakhstan;
        this.f = z2;
    }
}
