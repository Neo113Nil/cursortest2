package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$ScheduleEntryPointSource;

/* loaded from: classes6.dex */
public final class hh40 {
    public final String a;
    public final String b;
    public final pj40 c;
    public final TransportRouteAnalytics$ScheduleEntryPointSource d;

    public /* synthetic */ hh40(String str, String str2, TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, pj40.c, (i & 8) != 0 ? TransportRouteAnalytics$ScheduleEntryPointSource.Deeplink : transportRouteAnalytics$ScheduleEntryPointSource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hh40)) {
            return false;
        }
        hh40 hh40Var = (hh40) obj;
        return jl40.l(this.a, hh40Var.a) && jl40.l(this.b, hh40Var.b) && jl40.l(this.c, hh40Var.c) && this.d == hh40Var.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainSchedulesRouteInfoPayload(startingStopId=", this.a, ", destinationStopId=", this.b, ", utmParams=");
        v.append(this.c);
        v.append(", scheduleEntryPointSource=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public hh40(String str, String str2, pj40 pj40Var, TransportRouteAnalytics$ScheduleEntryPointSource transportRouteAnalytics$ScheduleEntryPointSource) {
        this.a = str;
        this.b = str2;
        this.c = pj40Var;
        this.d = transportRouteAnalytics$ScheduleEntryPointSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public hh40() {
        this((String) null, (String) (0 == true ? 1 : 0), (TransportRouteAnalytics$ScheduleEntryPointSource) (0 == true ? 1 : 0), 15);
    }
}
