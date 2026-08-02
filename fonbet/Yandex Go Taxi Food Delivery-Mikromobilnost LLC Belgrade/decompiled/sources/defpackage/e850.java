package defpackage;

import com.yandex.go.navigator.domain.t;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.navigation.automotive.Guidance;
import com.yandex.mapkit.navigation.automotive.Navigation;
import com.yandex.mapkit.navigation.automotive.Windshield;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class e850 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ e850(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Guidance guidance;
        Guidance guidance2;
        Windshield windshield;
        Guidance guidance3;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                if (((Number) obj).longValue() < 1) {
                    tVar.y++;
                    r0 r0Var = tVar.D;
                    if (jl40.l(r0Var.getValue(), i950.a)) {
                        if (tVar.y <= 3) {
                            pe50 c = tVar.a.c();
                            if (c != null) {
                                tVar.c(c);
                                break;
                            }
                        } else {
                            tVar.x.b();
                            tVar.y = 0;
                            r0Var.m(null, k950.a);
                            break;
                        }
                    }
                }
                break;
            case 1:
                tVar.c((pe50) obj);
                break;
            default:
                Navigation navigation = (Navigation) obj;
                Navigation navigation2 = tVar.w;
                if (navigation2 != null) {
                    navigation2.removeListener(tVar.L);
                }
                Navigation navigation3 = tVar.w;
                if (navigation3 != null && (guidance3 = navigation3.getGuidance()) != null) {
                    guidance3.removeListener(tVar.J);
                }
                Navigation navigation4 = tVar.w;
                if (navigation4 != null && (guidance2 = navigation4.getGuidance()) != null && (windshield = guidance2.getWindshield()) != null) {
                    windshield.removeListener(tVar.K);
                }
                tVar.w = navigation;
                oc50 oc50Var = tVar.f;
                if (navigation != null) {
                    if (oc50Var.a()) {
                        ((cb50) tVar.h.get()).c();
                    }
                    tVar.b();
                    tVar.l.a(navigation.getGuidance().getCurrentRoute());
                    r0 r0Var2 = tVar.D;
                    r0Var2.getClass();
                    r0Var2.m(null, g950.a);
                    r0 r0Var3 = tVar.E;
                    r0Var3.getClass();
                    r0Var3.m(null, "");
                    tVar.F.l(navigation.getGuidance().getWindshield().getManoeuvres());
                    Navigation navigation5 = tVar.w;
                    tVar.k.c((navigation5 == null || (guidance = navigation5.getGuidance()) == null) ? null : guidance.getCurrentRoute());
                    tVar.j.a.l(navigation.getGuidance().getWindshield().getRoadEvents());
                    r0 r0Var4 = tVar.G;
                    LocalizedValue speedLimit = navigation.getGuidance().getSpeedLimit();
                    r0Var4.l(speedLimit != null ? Double.valueOf(speedLimit.getValue()) : null);
                    tVar.H.l(navigation.getGuidance().getSpeedLimitStatus());
                    if (oc50Var.a()) {
                        tVar.d();
                        tVar.d.a(true);
                    }
                }
                tVar.i();
                break;
        }
        return zy11Var;
    }
}
