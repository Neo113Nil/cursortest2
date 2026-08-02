package defpackage;

import com.yandex.go.deeplinks.generated.summary.SummarySection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class afv0 {
    public final SummarySection a;
    public final String b;

    public afv0(SummarySection summarySection, String str) {
        this.a = summarySection;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof afv0)) {
            return false;
        }
        afv0 afv0Var = (afv0) obj;
        return this.a == afv0Var.a && jl40.l(this.b, afv0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "SummaryDeeplink(section=" + this.a + ", origin=" + this.b + Extension.C_BRAKE;
    }
}
