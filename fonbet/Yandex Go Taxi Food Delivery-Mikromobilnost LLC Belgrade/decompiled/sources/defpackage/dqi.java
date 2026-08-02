package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class dqi {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final lqi d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final dri j;
    public final ypi k;
    public final iqi l;

    public dqi(boolean z, boolean z2, boolean z3, lqi lqiVar, boolean z4, String str, String str2, String str3, long j, dri driVar, ypi ypiVar, iqi iqiVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lqiVar;
        this.e = z4;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j;
        this.j = driVar;
        this.k = ypiVar;
        this.l = iqiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqi)) {
            return false;
        }
        dqi dqiVar = (dqi) obj;
        return this.a == dqiVar.a && this.b == dqiVar.b && this.c == dqiVar.c && jl40.l(this.d, dqiVar.d) && this.e == dqiVar.e && jl40.l(this.f, dqiVar.f) && jl40.l(this.g, dqiVar.g) && jl40.l(this.h, dqiVar.h) && this.i == dqiVar.i && jl40.l(this.j, dqiVar.j) && jl40.l(this.k, dqiVar.k) && jl40.l(this.l, dqiVar.l);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        lqi lqiVar = this.d;
        int e2 = unr0.e((e + (lqiVar == null ? 0 : lqiVar.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int hashCode = (e2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int c = qv10.c((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.i);
        dri driVar = this.j;
        int hashCode3 = (c + (driVar == null ? 0 : driVar.hashCode())) * 31;
        ypi ypiVar = this.k;
        int hashCode4 = (hashCode3 + (ypiVar == null ? 0 : ypiVar.a.hashCode())) * 31;
        iqi iqiVar = this.l;
        return hashCode4 + (iqiVar != null ? iqiVar.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder u = qv10.u("Context(isPromotionBannersEnabled=", ", isPerformerPositionAvailable=", ", presentAsCompleted=", this.a, this.b);
        u.append(this.c);
        u.append(", performerSearch=");
        u.append(this.d);
        u.append(", isShimmering=");
        unr0.A(", providerStatus=", this.f, ", providerTariffClass=", u, this.e);
        g8e.D(u, this.g, ", role=", this.h, ", serverTimeDiff=");
        u.append(this.i);
        u.append(", trackingPopup=");
        u.append(this.j);
        u.append(", adsBanner=");
        u.append(this.k);
        u.append(", objectsOverMapSettings=");
        u.append(this.l);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
