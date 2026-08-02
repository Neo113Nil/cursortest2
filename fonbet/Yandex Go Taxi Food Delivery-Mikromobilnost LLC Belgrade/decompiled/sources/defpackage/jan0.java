package defpackage;

import ru.yandex.taxi.scooters.presentation.detailed_order.e;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.a;
import ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationAnalytics$OpenReason;

/* loaded from: classes6.dex */
public final class jan0 implements pbo0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzs b;
    public final /* synthetic */ h55 c;
    public final /* synthetic */ Object w;

    public /* synthetic */ jan0(h55 h55Var, zzs zzsVar, Object obj, int i) {
        this.a = i;
        this.c = h55Var;
        this.b = zzsVar;
        this.w = obj;
    }

    private final void n1() {
    }

    @Override // defpackage.pbo0
    public final void G0() {
        int i = this.a;
        zzs zzsVar = this.b;
        h55 h55Var = this.c;
        switch (i) {
            case 0:
                ((a) h55Var).r(new zef(5, zzsVar));
                break;
            default:
                ((e) h55Var).R().a(new kwo0(zzsVar, ScootersRouteNavigationAnalytics$OpenReason.PARKING_PANORAMA, (zuo0) this.w, null));
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                ((dpf) this.w).invoke();
                break;
        }
    }
}
