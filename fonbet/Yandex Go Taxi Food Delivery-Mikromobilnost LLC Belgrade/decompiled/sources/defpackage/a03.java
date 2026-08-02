package defpackage;

import com.ybsdk.common.entities.ApplicationEntity$ApplicationStatus;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class a03 {
    public final String a;
    public final ApplicationEntity$ApplicationStatus b;
    public final String c;
    public final Map d;

    public a03(String str, ApplicationEntity$ApplicationStatus applicationEntity$ApplicationStatus, String str2, Map map) {
        this.a = str;
        this.b = applicationEntity$ApplicationStatus;
        this.c = str2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a03)) {
            return false;
        }
        a03 a03Var = (a03) obj;
        return jl40.l(this.a, a03Var.a) && this.b == a03Var.b && jl40.l(this.c, a03Var.c) && this.d.equals(a03Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ApplicationEntity(applicationId=" + this.a + ", status=" + this.b + ", agreement=" + this.c + ", form=" + this.d + Extension.C_BRAKE;
    }
}
