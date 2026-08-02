package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g870 extends mr {
    public final yn a;

    public g870(yn ynVar) {
        this.a = ynVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g870) && jl40.l(this.a, ((g870) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenSummary(actionOrderMore=" + this.a + Extension.C_BRAKE;
    }
}
