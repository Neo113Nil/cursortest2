package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class l841 {
    public final sls a;
    public final tls b;
    public final mhr c;

    public l841(sls slsVar, tls tlsVar, mhr mhrVar) {
        this.a = slsVar;
        this.b = tlsVar;
        this.c = mhrVar;
    }

    public final tls a() {
        return this.b;
    }

    public final sls b() {
        return this.a;
    }

    public final mhr c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l841)) {
            return false;
        }
        l841 l841Var = (l841) obj;
        return this.a.equals(l841Var.a) && this.b.equals(l841Var.b) && this.c.equals(l841Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ly3.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WalletFlexHostCallbacks(onExit=" + this.a + ", actionDispatcher=" + this.b + ", routeHandlerNavigator=" + this.c + Extension.C_BRAKE;
    }
}
