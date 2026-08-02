package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mlb implements plb {
    public final String a;
    public final akb b;

    public mlb(String str, akb akbVar) {
        this.a = str;
        this.b = akbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mlb)) {
            return false;
        }
        mlb mlbVar = (mlb) obj;
        return jl40.l(this.a, mlbVar.a) && this.b.equals(mlbVar.b);
    }

    @Override // defpackage.plb
    public final snb getAnalytics() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MosmetroAuthRequired(tripId=" + this.a + ", analytics=" + this.b + Extension.C_BRAKE;
    }
}
