package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fdk0 implements idk0 {
    public final String a;
    public final kdc b;
    public final akk0 c;

    public fdk0(kdc kdcVar, String str) {
        this.a = str;
        this.b = kdcVar;
        wrs0.a.getClass();
        this.c = vrs0.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdk0)) {
            return false;
        }
        fdk0 fdk0Var = (fdk0) obj;
        return this.a.equals(fdk0Var.a) && jl40.l(this.b, fdk0Var.b);
    }

    @Override // defpackage.zjk0
    public final wrs0 getAnalytics() {
        return this.c;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Card(id=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
