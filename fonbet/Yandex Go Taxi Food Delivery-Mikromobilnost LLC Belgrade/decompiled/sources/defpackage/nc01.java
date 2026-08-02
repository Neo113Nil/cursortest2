package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$FlowOrigin;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$RouteOptionsEntryPointSource;
import ru.yandex.taxi.masstransit.trains.search.StationSearchOpenReason;
import ru.yandex.taxi.masstransit.ui.StationFocus;

/* loaded from: classes6.dex */
public final class nc01 {
    public final vwp0 a;
    public final vwp0 b;
    public final List c;
    public final String d;
    public final TransportRouteAnalytics$FlowOrigin e;
    public final String f;
    public final String g;
    public final p6o h;
    public final StationSearchOpenReason i;
    public final StationFocus j;
    public final String k;
    public final TransportRouteAnalytics$RouteOptionsEntryPointSource l;

    public /* synthetic */ nc01(vwp0 vwp0Var, vwp0 vwp0Var2, String str, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str2, String str3, StationSearchOpenReason stationSearchOpenReason, StationFocus stationFocus, TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource, int i) {
        this(vwp0Var, vwp0Var2, EmptyList.a, str, transportRouteAnalytics$FlowOrigin, str2, str3, null, (i & 256) != 0 ? StationSearchOpenReason.OTHER : stationSearchOpenReason, (i & 512) != 0 ? StationFocus.SOURCE : stationFocus, null, (i & 2048) != 0 ? TransportRouteAnalytics$RouteOptionsEntryPointSource.Schedule : transportRouteAnalytics$RouteOptionsEntryPointSource);
    }

    public static nc01 a(nc01 nc01Var, vwp0 vwp0Var, vwp0 vwp0Var2, List list, p6o p6oVar, StationFocus stationFocus, String str, int i) {
        vwp0 vwp0Var3 = (i & 1) != 0 ? nc01Var.a : vwp0Var;
        vwp0 vwp0Var4 = (i & 2) != 0 ? nc01Var.b : vwp0Var2;
        List list2 = (i & 4) != 0 ? nc01Var.c : list;
        String str2 = nc01Var.d;
        TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin = nc01Var.e;
        String str3 = nc01Var.f;
        String str4 = nc01Var.g;
        p6o p6oVar2 = (i & 128) != 0 ? nc01Var.h : p6oVar;
        StationSearchOpenReason stationSearchOpenReason = nc01Var.i;
        StationFocus stationFocus2 = (i & 512) != 0 ? nc01Var.j : stationFocus;
        String str5 = (i & 1024) != 0 ? nc01Var.k : str;
        TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource = nc01Var.l;
        nc01Var.getClass();
        return new nc01(vwp0Var3, vwp0Var4, list2, str2, transportRouteAnalytics$FlowOrigin, str3, str4, p6oVar2, stationSearchOpenReason, stationFocus2, str5, transportRouteAnalytics$RouteOptionsEntryPointSource);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc01)) {
            return false;
        }
        nc01 nc01Var = (nc01) obj;
        return jl40.l(this.a, nc01Var.a) && jl40.l(this.b, nc01Var.b) && jl40.l(this.c, nc01Var.c) && jl40.l(this.d, nc01Var.d) && this.e == nc01Var.e && jl40.l(this.f, nc01Var.f) && jl40.l(this.g, nc01Var.g) && jl40.l(this.h, nc01Var.h) && this.i == nc01Var.i && this.j == nc01Var.j && jl40.l(this.k, nc01Var.k) && this.l == nc01Var.l;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b((this.e.hashCode() + unr0.b(unr0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g);
        p6o p6oVar = this.h;
        int hashCode = (this.j.hashCode() + ((this.i.hashCode() + ((b + (p6oVar == null ? 0 : p6oVar.hashCode())) * 31)) * 31)) * 31;
        String str = this.k;
        return this.l.hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrainStationSearchUiState(source=");
        sb.append(this.a);
        sb.append(", destination=");
        sb.append(this.b);
        sb.append(", suggests=");
        oyr.D(", emptySuggestsMessage=", this.d, ", flowOrigin=", sb, this.c);
        sb.append(this.e);
        sb.append(", clearIconDescription=");
        sb.append(this.f);
        sb.append(", swapIconDescription=");
        sb.append(this.g);
        sb.append(", errorContentState=");
        sb.append(this.h);
        sb.append(", openReason=");
        sb.append(this.i);
        sb.append(", focusedField=");
        sb.append(this.j);
        sb.append(", searchRequestId=");
        sb.append(this.k);
        sb.append(", entryPointSource=");
        sb.append(this.l);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public nc01(vwp0 vwp0Var, vwp0 vwp0Var2, List list, String str, TransportRouteAnalytics$FlowOrigin transportRouteAnalytics$FlowOrigin, String str2, String str3, p6o p6oVar, StationSearchOpenReason stationSearchOpenReason, StationFocus stationFocus, String str4, TransportRouteAnalytics$RouteOptionsEntryPointSource transportRouteAnalytics$RouteOptionsEntryPointSource) {
        this.a = vwp0Var;
        this.b = vwp0Var2;
        this.c = list;
        this.d = str;
        this.e = transportRouteAnalytics$FlowOrigin;
        this.f = str2;
        this.g = str3;
        this.h = p6oVar;
        this.i = stationSearchOpenReason;
        this.j = stationFocus;
        this.k = str4;
        this.l = transportRouteAnalytics$RouteOptionsEntryPointSource;
    }
}
