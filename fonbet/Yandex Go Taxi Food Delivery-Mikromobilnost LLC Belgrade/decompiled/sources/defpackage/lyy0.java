package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class lyy0 implements oyy0 {
    public final MtTransportType a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final kdc g;
    public final up2 h;
    public final m540 i;
    public final String j;
    public final String k;

    public lyy0(MtTransportType mtTransportType, String str, String str2, String str3, String str4, boolean z, kdc kdcVar, up2 up2Var, m540 m540Var, String str5, String str6) {
        this.a = mtTransportType;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = kdcVar;
        this.h = up2Var;
        this.i = m540Var;
        this.j = str5;
        this.k = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyy0)) {
            return false;
        }
        lyy0 lyy0Var = (lyy0) obj;
        return this.a == lyy0Var.a && jl40.l(this.b, lyy0Var.b) && this.c.equals(lyy0Var.c) && jl40.l(this.d, lyy0Var.d) && this.e.equals(lyy0Var.e) && this.f == lyy0Var.f && this.g.equals(lyy0Var.g) && this.h.equals(lyy0Var.h) && jl40.l(this.i, lyy0Var.i) && jl40.l(this.j, lyy0Var.j) && jl40.l(this.k, lyy0Var.k);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + smw0.d(this.g, unr0.e(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31)) * 31;
        m540 m540Var = this.i;
        int hashCode2 = (hashCode + (m540Var == null ? 0 : m540Var.hashCode())) * 31;
        String str = this.j;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.k;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroundThreadUiState(type=");
        sb.append(this.a);
        sb.append(", threadName=");
        sb.append(this.b);
        sb.append(", destination=");
        g8e.D(sb, this.c, ", scheduleTitle=", this.d, ", scheduleSubtitle=");
        tse0.y(this.e, ", estimated=", ", color=", sb, this.f);
        sb.append(this.g);
        sb.append(", typeColor=");
        sb.append(this.h);
        sb.append(", clickAction=");
        sb.append(this.i);
        sb.append(", threadId=");
        sb.append(this.j);
        sb.append(", lineId=");
        return oyr.t(sb, this.k, Extension.C_BRAKE);
    }
}
