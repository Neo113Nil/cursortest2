package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class epf0 implements fpf0 {
    public final dpf0 a;
    public final List b;
    public final wls c;

    public epf0(dpf0 dpf0Var, List list, wls wlsVar) {
        this.a = dpf0Var;
        this.b = list;
        this.c = wlsVar;
    }

    @Override // defpackage.fpf0
    public final dpf0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof epf0)) {
            return false;
        }
        epf0 epf0Var = (epf0) obj;
        return this.a.equals(epf0Var.a) && jl40.l(this.b, epf0Var.b) && jl40.l(this.c, epf0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ToggleClicked(actionInfo=" + this.a + ", actions=" + this.b + ", toggleStateUpdater=" + this.c + Extension.C_BRAKE;
    }
}
