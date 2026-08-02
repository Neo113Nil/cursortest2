package defpackage;

import com.yandex.go.agreement.api.Acceptance$Default$IconStyle;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class bd extends dd {
    public final String a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final Acceptance$Default$IconStyle m;

    public bd(String str, long j, boolean z, String str2, String str3, String str4, String str5, String str6, long j2, String str7, boolean z2, boolean z3, Acceptance$Default$IconStyle acceptance$Default$IconStyle) {
        this.a = str;
        this.b = j;
        this.c = z;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = j2;
        this.j = str7;
        this.k = z2;
        this.l = z3;
        this.m = acceptance$Default$IconStyle;
    }

    @Override // defpackage.dd
    public final String a() {
        return this.a;
    }

    @Override // defpackage.dd
    public final long b() {
        return this.b;
    }

    @Override // defpackage.dd
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return jl40.l(this.a, bdVar.a) && this.b == bdVar.b && this.c == bdVar.c && jl40.l(this.d, bdVar.d) && jl40.l(this.e, bdVar.e) && jl40.l(this.f, bdVar.f) && jl40.l(this.g, bdVar.g) && jl40.l(this.h, bdVar.h) && this.i == bdVar.i && jl40.l(this.j, bdVar.j) && this.k == bdVar.k && this.l == bdVar.l && this.m == bdVar.m;
    }

    public final int hashCode() {
        int e = unr0.e(qv10.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int c = qv10.c((hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.i);
        String str6 = this.j;
        return this.m.hashCode() + unr0.e(unr0.e((c + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.k), 31, this.l);
    }

    public final String toString() {
        StringBuilder l = x4e.l("Default(id=", this.a, ", uid=", this.b);
        l.append(", isOnDemand=");
        l.append(this.c);
        l.append(", title=");
        l.append(this.d);
        g8e.D(l, ", content=", this.e, ", acceptButton=", this.f);
        g8e.D(l, ", cancelButton=", this.g, ", imageTag=", this.h);
        x4e.A(this.i, ", ttl=", ", webviewUrl=", l);
        tse0.y(this.j, ", isCloseButtonVisible=", ", isOnBackPressEnabled=", l, this.k);
        l.append(this.l);
        l.append(", iconStyle=");
        l.append(this.m);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
