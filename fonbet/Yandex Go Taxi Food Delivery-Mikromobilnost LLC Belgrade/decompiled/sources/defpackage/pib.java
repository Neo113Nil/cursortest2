package defpackage;

import com.yandex.go.masstransit.sdk.checkout.impl.checkout.analytics.CounterChange;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pib implements wib {
    public final String a;
    public final int b;
    public final CounterChange c;
    public final String d;
    public final String e;
    public final nnb f;

    public pib(String str, int i, CounterChange counterChange, String str2, String str3, nnb nnbVar) {
        this.a = str;
        this.b = i;
        this.c = counterChange;
        this.d = str2;
        this.e = str3;
        this.f = nnbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pib)) {
            return false;
        }
        pib pibVar = (pib) obj;
        return jl40.l(this.a, pibVar.a) && this.b == pibVar.b && this.c == pibVar.c && jl40.l(this.d, pibVar.d) && jl40.l(this.e, pibVar.e) && this.f.equals(pibVar.f);
    }

    @Override // defpackage.wib
    public final nnb getAnalytics() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "CounterValueChange(property=", this.a, ", value=", ", change=");
        u.append(this.c);
        u.append(", tripId=");
        u.append(this.d);
        u.append(", requestId=");
        u.append(this.e);
        u.append(", analytics=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
