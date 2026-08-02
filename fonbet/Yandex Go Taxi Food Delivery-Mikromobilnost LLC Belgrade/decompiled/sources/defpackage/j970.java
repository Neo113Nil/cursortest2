package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class j970 extends mr {
    public final String a;
    public final nyc b;
    public final oyc c;
    public final oyc d;

    public j970(String str, nyc nycVar, oyc oycVar, oyc oycVar2) {
        this.a = str;
        this.b = nycVar;
        this.c = oycVar;
        this.d = oycVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j970) {
            j970 j970Var = (j970) obj;
            return jl40.l(this.a, j970Var.a) && this.b == j970Var.b && this.c == j970Var.c && this.d == j970Var.d;
        }
        return false;
    }

    public final int hashCode() {
        return hashCode() + ((hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "OpenWebView(url=" + this.a + ", onCloseWebView=" + this.b + ", beforeOpenAction=" + this.c + ", afterOpenAction=" + this.d + Extension.C_BRAKE;
    }
}
