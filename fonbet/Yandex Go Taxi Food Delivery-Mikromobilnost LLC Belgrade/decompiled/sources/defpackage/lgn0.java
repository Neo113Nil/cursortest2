package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class lgn0 {
    public final pen0 a;

    public /* synthetic */ lgn0(pen0 pen0Var) {
        this.a = pen0Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lgn0) {
            return jl40.l(this.a, ((lgn0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        pen0 pen0Var = this.a;
        if (pen0Var == null) {
            return 0;
        }
        return pen0Var.hashCode();
    }

    public final String toString() {
        return "ScootersDetailedOrderPayload(destinationNavigation=" + this.a + Extension.C_BRAKE;
    }
}
