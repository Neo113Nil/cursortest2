package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class pm {
    public final im a;
    public final List b;

    public pm(im imVar, List list) {
        this.a = imVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm)) {
            return false;
        }
        pm pmVar = (pm) obj;
        return jl40.l(this.a, pmVar.a) && this.b.equals(pmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountsModel(currentUid=" + this.a + ", accounts=" + this.b + Extension.C_BRAKE;
    }
}
