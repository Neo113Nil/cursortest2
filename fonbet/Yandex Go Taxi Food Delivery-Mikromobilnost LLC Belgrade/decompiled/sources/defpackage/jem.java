package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class jem implements w201 {
    public final String a;
    public final i501 b;
    public final long c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    public jem(String str, i501 i501Var, long j, String str2, String str3, String str4, String str5, String str6, int i) {
        this.a = str;
        this.b = i501Var;
        this.c = j;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = i;
    }

    public static jem c(jem jemVar, i501 i501Var, String str, int i) {
        String str2 = jemVar.a;
        if ((i & 2) != 0) {
            i501Var = jemVar.b;
        }
        i501 i501Var2 = i501Var;
        long j = jemVar.c;
        String str3 = jemVar.d;
        if ((i & 16) != 0) {
            str = jemVar.e;
        }
        return new jem(str2, i501Var2, j, str3, str, jemVar.f, jemVar.g, jemVar.h, jemVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jem)) {
            return false;
        }
        jem jemVar = (jem) obj;
        return jl40.l(this.a, jemVar.a) && jl40.l(this.b, jemVar.b) && this.c == jemVar.c && this.d.equals(jemVar.d) && jl40.l(this.e, jemVar.e) && this.f.equals(jemVar.f) && this.g.equals(jemVar.g) && jl40.l(this.h, jemVar.h) && this.i == jemVar.i;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.b(qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return Integer.hashCode(this.i) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // defpackage.w201
    public final i501 q() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DriveOrderTracking(id=");
        sb.append(this.a);
        sb.append(", cardSwipeBehaviour=");
        sb.append(this.b);
        sb.append(", timestamp=");
        uw51.v(this.c, ", title=", this.d, sb);
        g8e.D(sb, ", subtitle=", this.e, ", carPlate=", this.f);
        g8e.D(sb, ", orderState=", this.g, ", carImageUrl=", this.h);
        return b64.q(sb, ", carImageId=", this.i, Extension.C_BRAKE);
    }
}
