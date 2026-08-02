package defpackage;

import ru.yandex.taxi.logistics.sdk.n;

/* loaded from: classes9.dex */
public final class fq50 {
    public final n a;
    public final h3y b;
    public final eq50 c;
    public final ijz d;

    public fq50(n nVar, h3y h3yVar, dq50 dq50Var, ijz ijzVar) {
        this.a = nVar;
        this.b = h3yVar;
        this.c = dq50Var;
        this.d = ijzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fq50) {
            fq50 fq50Var = (fq50) obj;
            return this.a == fq50Var.a && this.b.equals(fq50Var.b) && this.c.equals(fq50Var.c) && this.d == fq50Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 961;
    }

    public final String toString() {
        return "NetworkConfig(authorizationTokenFlow=" + this.a + ", okHttpClient=" + this.b + ", environment=" + this.c + ", userDataProvider=" + this.d + ", userAgentProvider=null, acceptLanguageProvider=null)";
    }
}
