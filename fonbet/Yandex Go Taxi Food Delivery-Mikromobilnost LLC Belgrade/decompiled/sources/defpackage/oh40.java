package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsEntryPointSource;
import ru.yandex.taxi.masstransit.trains.search.StationSearchOpenReason;

/* loaded from: classes6.dex */
public final class oh40 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final StationSearchOpenReason e;
    public final TransportRouteAnalytics$RouteOptionsEntryPointSource f;

    public /* synthetic */ oh40(TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource, int i) {
        this(null, null, null, null, StationSearchOpenReason.OTHER, (i & 32) != 0 ? TransportRouteAnalytics$RouteOptionsEntryPointSource.Schedule : transportRouteAnalytics$RouteOptionsEntryPointSource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oh40)) {
            return false;
        }
        oh40 oh40Var = (oh40) obj;
        return jl40.l(this.a, oh40Var.a) && jl40.l(this.b, oh40Var.b) && jl40.l(this.c, oh40Var.c) && jl40.l(this.d, oh40Var.d) && this.e == oh40Var.e && this.f == oh40Var.f;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtTrainStationsPayload(sourceId=", this.a, ", sourceTitle=", this.b, ", destinationId=");
        g8e.D(v, this.c, ", destinationTitle=", this.d, ", openReason=");
        v.append(this.e);
        v.append(", entryPointSource=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public oh40(String str, String str2, String str3, String str4, StationSearchOpenReason stationSearchOpenReason, TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = stationSearchOpenReason;
        this.f = transportRouteAnalytics$RouteOptionsEntryPointSource;
    }

    public oh40() {
        this(null, 63);
    }
}
