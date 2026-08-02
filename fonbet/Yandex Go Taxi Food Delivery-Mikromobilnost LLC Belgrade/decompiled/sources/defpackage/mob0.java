package defpackage;

import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.navigation.screen.c;
import com.yandex.go.pickup_from_photo.data.PickupFromPhotoOnboardingRepository$needShowTooltipFlow$$inlined$simpleCallbackApiToFlow$1;
import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import com.yandex.go.pickup_from_photo.experiment.p;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes13.dex */
public final class mob0 {
    public final p a;
    public final wiq0 b;
    public final g c;
    public final c d;
    public final qnb0 e;
    public final bob0 f;

    public mob0(p pVar, wiq0 wiq0Var, g gVar, c cVar, qnb0 qnb0Var, bob0 bob0Var) {
        this.a = pVar;
        this.b = wiq0Var;
        this.c = gVar;
        this.d = cVar;
        this.e = qnb0Var;
        this.f = bob0Var;
    }

    public final String a() {
        PickupPhotoRecognitionExperiment b;
        PickupPhotoRecognitionExperiment.Onboarding onboarding;
        String str;
        if (!this.f.a.g("pickup_from_photo_tooltip_should_be_shown", true) || (onboarding = (b = this.a.b()).k) == null || (str = onboarding.b) == null) {
            return null;
        }
        String Y = d6z.Y(b, str);
        if (evu0.J(Y)) {
            return null;
        }
        return Y;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0102, code lost:
    
        if (r1 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0145, code lost:
    
        if (r10.c.g() == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x014b, code lost:
    
        if (r10.e.a != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014d, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0122, code lost:
    
        if (defpackage.j73.f0(new com.yandex.go.navigation.screen.api.Screen[]{com.yandex.go.navigation.screen.api.Screen.MOBILITY_HUB, com.yandex.go.navigation.screen.api.Screen.MOBILITY_HUB_TRANSPORT_DETAILS}).contains(r3) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x013d, code lost:
    
        if (java.util.Collections.singleton(com.yandex.go.navigation.screen.api.Screen.SUMMARY_TRANSPORT).contains(r3) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b() {
        boolean z;
        kb5 kb5Var;
        p pVar = this.a;
        if (pVar.a.isEnabled() && !evu0.J(pVar.b().c.a) && !evu0.J(pVar.b().f.c.b) && !evu0.J(pVar.b().f.c.c) && !evu0.J(pVar.b().f.d.a) && !evu0.J(pVar.b().f.d.b)) {
            fnx0 n = ((k) this.b).n();
            TariffOrderFlow tariffOrderFlow = (n == null || (kb5Var = n.e) == null) ? null : kb5Var.d;
            Screen b = this.d.b();
            TariffOrderFlow.Companion.getClass();
            String b2 = ijx0.b(tariffOrderFlow);
            if (b2 != null) {
                if (pVar.b().d.contains(b2)) {
                    switch (b2.hashCode()) {
                        case 3552798:
                            if (b2.equals(TariffOrderFlow.ORDER_FLOW_TAXI_KEY)) {
                                z = j73.f0(new Screen[]{Screen.MAIN_V4, Screen.TAXI_MAIN, Screen.SUMMARY, Screen.ADDRESS_CONFIRMATION, Screen.ROUTE_SELECTOR, Screen.SUPERAPP_SUGGEST}).contains(b);
                                break;
                            }
                            z = false;
                            break;
                        case 95852938:
                            if (b2.equals(TariffOrderFlow.ORDER_FLOW_DRIVE_KEY)) {
                                z = j73.f0(new Screen[]{Screen.SUMMARY, Screen.SUMMARY_DRIVE}).contains(b);
                                break;
                            }
                            z = false;
                            break;
                        case 823466996:
                            if (b2.equals(TariffOrderFlow.ORDER_FLOW_DELIVERY_KEY)) {
                                z = j73.f0(new Screen[]{Screen.SUMMARY, Screen.DELIVERY_DISCOVERY}).contains(b);
                                break;
                            }
                            z = false;
                            break;
                        case 2072762553:
                            if (b2.equals(TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY)) {
                                z = j73.f0(new Screen[]{Screen.SUMMARY, Screen.INTERCITY_DASHBOARD}).contains(b);
                                break;
                            }
                            z = false;
                            break;
                        default:
                            z = false;
                            break;
                    }
                }
                if (pVar.b().d.contains("hub")) {
                }
                if (pVar.b().d.contains("transport")) {
                }
            }
        }
        return false;
    }

    public final b c() {
        bob0 bob0Var = this.f;
        bob0Var.getClass();
        return e.g(new PickupFromPhotoOnboardingRepository$needShowTooltipFlow$$inlined$simpleCallbackApiToFlow$1(new i4b0(12, bob0Var), null));
    }
}
