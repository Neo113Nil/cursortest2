package xsna;

/* compiled from: FirebaseInstallationId.kt */
/* loaded from: classes.dex */
public final class qir {
    public final String a;
    public final String b;

    public qir(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qir)) {
            return false;
        }
        qir qirVar = (qir) obj;
        return epx.f(this.a, qirVar.a) && epx.f(this.b, qirVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FirebaseInstallationId(fid=");
        sb.append(this.a);
        sb.append(", authToken=");
        return ho8.a(sb, this.b, ')');
    }
}
