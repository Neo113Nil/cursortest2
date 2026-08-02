package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class lk60 {
    public final jk60 a;
    public final ArrayList b;

    public lk60(jk60 jk60Var, ArrayList arrayList) {
        this.a = jk60Var;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk60)) {
            return false;
        }
        lk60 lk60Var = (lk60) obj;
        return this.a.equals(lk60Var.a) && this.b.equals(lk60Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ReducedRequest(request=" + this.a + ", skippedXivaData=" + this.b + Extension.C_BRAKE;
    }
}
