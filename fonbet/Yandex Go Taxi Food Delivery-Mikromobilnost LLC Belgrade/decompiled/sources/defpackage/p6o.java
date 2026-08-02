package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleErrorReason;

/* loaded from: classes6.dex */
public final class p6o {
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final u1n e;
    public final TransportRouteAnalytics$ScheduleErrorReason f;

    public p6o(String str, int i, String str2, String str3, u1n u1nVar, TransportRouteAnalytics$ScheduleErrorReason transportRouteAnalytics$ScheduleErrorReason) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = u1nVar;
        this.f = transportRouteAnalytics$ScheduleErrorReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6o)) {
            return false;
        }
        p6o p6oVar = (p6o) obj;
        return jl40.l(this.a, p6oVar.a) && this.b == p6oVar.b && jl40.l(this.c, p6oVar.c) && jl40.l(this.d, p6oVar.d) && jl40.l(this.e, p6oVar.e) && this.f == p6oVar.f;
    }

    public final int hashCode() {
        String str = this.a;
        return this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b(oyr.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "ErrorContentState(toolbarTitle=", this.a, ", icon=", ", title=");
        g8e.D(u, this.c, ", subtitle=", this.d, ", button=");
        u.append(this.e);
        u.append(", errorName=");
        u.append(this.f);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }

    public /* synthetic */ p6o(String str, int i, String str2, String str3, u1n u1nVar) {
        this(str, i, str2, str3, u1nVar, TransportRouteAnalytics$ScheduleErrorReason.LoadError);
    }
}
