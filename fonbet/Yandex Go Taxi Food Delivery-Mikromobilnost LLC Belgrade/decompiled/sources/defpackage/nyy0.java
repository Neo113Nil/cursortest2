package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public final class nyy0 implements oyy0 {
    public final MtTransportType a;
    public final String b;
    public final kdc c;
    public final up2 d;
    public final String e;
    public final String f;

    public nyy0(MtTransportType mtTransportType, String str, kdc kdcVar, up2 up2Var, String str2, String str3) {
        this.a = mtTransportType;
        this.b = str;
        this.c = kdcVar;
        this.d = up2Var;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyy0)) {
            return false;
        }
        nyy0 nyy0Var = (nyy0) obj;
        return this.a == nyy0Var.a && jl40.l(this.b, nyy0Var.b) && this.c.equals(nyy0Var.c) && this.d.equals(nyy0Var.d) && jl40.l(this.e, nyy0Var.e) && jl40.l(this.f, nyy0Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + smw0.d(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuburbanThreadUiState(type=");
        sb.append(this.a);
        sb.append(", threadName=");
        sb.append(this.b);
        sb.append(", color=");
        sb.append(this.c);
        sb.append(", typeColor=");
        sb.append(this.d);
        sb.append(", threadId=");
        return g8e.r(sb, this.e, ", lineId=", this.f, Extension.C_BRAKE);
    }
}
