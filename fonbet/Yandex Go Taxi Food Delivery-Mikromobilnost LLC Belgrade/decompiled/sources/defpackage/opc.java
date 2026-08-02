package defpackage;

import com.yandex.go.chargers.api.ChargersFromScreen;
import com.yandex.go.chargers.api.ChargersOpenReason;
import com.yandex.go.dto.response.Action$CityMode;
import com.yandex.go.dto.response.Action$Discovery;
import com.yandex.go.dto.response.Action$IntercityMain;
import com.yandex.go.perf.api.screen.SourceScreen;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Clarification;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressDto$Coordinates;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.AddressesDto;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.d;
import com.yandex.go.taxi.intercity.dashboard.api.data.entity.e;
import ru.yandex.taxi.communications.api.dto.RetryPolicy;
import ru.yandex.taxi.communications.stories.domain.a;
import ru.yandex.taxi.perf.screen.PerformanceScreenName;
import ru.yandex.taxi.perf.screen.c;
import ru.yandex.taxi.search.suggest.i;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes8.dex */
public final class opc implements mpc {
    public final zuj0 a;
    public final yvf0 b;
    public final yvf0 c;
    public final yvf0 d;
    public final yvf0 e;
    public final oep0 f;
    public final yvf0 g;
    public final yvf0 h;
    public final i i;
    public final h010 j;
    public final fgw k;
    public final yvf0 l;
    public final rfw0 m;

    public opc(zuj0 zuj0Var, yvf0 yvf0Var, yvf0 yvf0Var2, yvf0 yvf0Var3, yvf0 yvf0Var4, oep0 oep0Var, yvf0 yvf0Var5, yvf0 yvf0Var6, i iVar, h010 h010Var, fgw fgwVar, zth zthVar, rfw0 rfw0Var) {
        this.a = zuj0Var;
        this.b = yvf0Var;
        this.c = yvf0Var2;
        this.d = yvf0Var3;
        this.e = yvf0Var4;
        this.f = oep0Var;
        this.g = yvf0Var5;
        this.h = yvf0Var6;
        this.i = iVar;
        this.j = h010Var;
        this.k = fgwVar;
        this.l = zthVar;
        this.m = rfw0Var;
    }

    public final void a(Action$CityMode action$CityMode) {
        if (jl40.l(action$CityMode.a, "intercity")) {
            pv0 pv0Var = (pv0) this.i.i().orElse(null);
            ((pep0) this.f).f((m950) this.e.get(), new zow(new tnw(action$CityMode.a, action$CityMode.b, action$CityMode.c, action$CityMode.d, pv0Var != null ? pv0Var.a.B() : null), true), hxx.a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public final void b(Action$Discovery action$Discovery, yaf0 yaf0Var) {
        String str = action$Discovery.a;
        int hashCode = str.hashCode();
        oep0 oep0Var = this.f;
        switch (hashCode) {
            case -487820126:
                if (str.equals("scooters")) {
                    ((pep0) oep0Var).f((m950) this.c.get(), new rvn0(((yaf0Var instanceof waf0) && jl40.l(((vaf0) yaf0Var).e, "city-mode")) ? q0b1.c() : w0b1.d()), hxx.a);
                    break;
                }
                break;
            case -92343201:
                if (str.equals("masstransit")) {
                    rfw0 rfw0Var = this.m;
                    ((c) rfw0Var.a).f(new cwa0(PerformanceScreenName.TransportDiscovery, (f211.a[((com.yandex.go.navigation.screen.c) rfw0Var.b).b().ordinal()] == 1 ? SourceScreen.SUPERAPP_MAIN : SourceScreen.UNKNOWN).getAnalyticsName(), d211.a, null, 56));
                    this.j.a(new vm30(0), action$Discovery.b);
                    break;
                }
                break;
            case 95852938:
                if (str.equals(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                    c();
                    break;
                }
                break;
            case 1436111861:
                if (str.equals("chargers")) {
                    m950 m950Var = (m950) this.d.get();
                    ChargersOpenReason chargersOpenReason = ChargersOpenReason.SHORTCUT;
                    ChargersFromScreen chargersFromScreen = ChargersFromScreen.MAIN_SCREEN;
                    ((pep0) oep0Var).f(m950Var, new p2a(chargersOpenReason), hxx.a);
                    break;
                }
                break;
        }
    }

    public final void c() {
        ((pep0) this.f).f((m950) this.h.get(), pdm.a, hxx.a);
    }

    public final void d(Action$IntercityMain action$IntercityMain) {
        rnw rnwVar;
        AddressesDto addressesDto = action$IntercityMain.b;
        String str = action$IntercityMain.a;
        this.k.getClass();
        e a = addressesDto.getA();
        if ((a instanceof AddressDto$Clarification) || (a instanceof AddressDto$Coordinates)) {
            rnwVar = new rnw(fgw.a(addressesDto.getA()), fgw.a(addressesDto.getB()));
        } else {
            if (!jl40.l(a, com.yandex.go.taxi.intercity.dashboard.api.data.entity.c.INSTANCE) && !jl40.l(a, d.INSTANCE)) {
                w511.b();
                return;
            }
            rnwVar = new rnw(bei.G, fgw.a(addressesDto.getB()));
        }
        ((pep0) this.f).f((m950) this.l.get(), new egw(str, dgw.a, rnwVar, null), hxx.a);
    }

    public final void e(String str, boolean z, sls slsVar) {
        Float f;
        npc npcVar = new npc((a) this.b.get(), slsVar, 0);
        mpu0 mpu0Var = new mpu0(str);
        if (z) {
            f = Float.valueOf(((avj0) this.a).b(psg0.shortcuts_corners_round));
        } else {
            f = null;
        }
        ((pep0) this.f).f(npcVar, new npu0((x3) mpu0Var, "mediashortcut", f, true, RetryPolicy.SINGLE_ATTEMPT), hxx.a);
    }
}
