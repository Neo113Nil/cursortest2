package defpackage;

import androidx.compose.foundation.lazy.b;
import com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi$showPlus$lambda$0$$inlined$suspendCallbackApi$2;
import com.yandex.go.chargers.dvizh_subscription.web.js.ChargersDvizhSubscriptionJsApi$showStories$lambda$0$$inlined$suspendCallbackApi$2;
import com.yandex.go.design.compose.text.a;
import com.yandex.go.scooters.ignition.controlling.ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOptiondlKKtPk$$inlined$suspendCallbackApi$2;
import com.yandex.go.scooters.passes.data.e;
import com.yandex.messaging.internal.e0;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.PresaleFragment;
import kotlin.jvm.internal.Ref$IntRef;
import ru.yandex.taxi.masstransit.MassTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2;

/* loaded from: classes15.dex */
public final class a80 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        boolean z = true;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                xfc xfcVar = (xfc) aVar.I.getValue();
                return new ldc(xfcVar != null ? xfcVar.a() : aVar.A);
            case 1:
                return new dnd0(1, (j23) obj);
            case 2:
                return new dnd0(1, (j23) obj);
            case 3:
                ((vf4) obj).close();
                return zy11Var;
            case 4:
                return new dnd0(1, (l95) obj);
            case 5:
                iq7 iq7Var = (iq7) obj;
                iq7Var.getClass();
                tob1.b();
                t7v t7vVar = iq7Var.h;
                iq7Var.g = null;
                iq7Var.h = null;
                iq7Var.i.H();
                iq7Var.n(t7vVar, null);
                return zy11Var;
            case 6:
                ((ChargersDvizhSubscriptionJsApi$showPlus$lambda$0$$inlined$suspendCallbackApi$2) obj).invoke(zy11Var);
                return zy11Var;
            case 7:
                ((ChargersDvizhSubscriptionJsApi$showStories$lambda$0$$inlined$suspendCallbackApi$2) obj).invoke(zy11Var);
                return zy11Var;
            case 8:
                return Integer.valueOf(((Ref$IntRef) obj).element);
            case 9:
                return new dnd0(1, (c1o) obj);
            case 10:
                ((xi3) obj).close();
                return zy11Var;
            case 11:
                ((zyj) obj).close();
                return zy11Var;
            case 12:
                ((xi3) obj).close();
                return zy11Var;
            case 13:
                ((v1b) obj).close();
                return zy11Var;
            case 14:
                ((e0) obj).close();
                return zy11Var;
            case 15:
                ((s2r) obj).close();
                return zy11Var;
            case 16:
                ((e7i0) obj).a = null;
                return zy11Var;
            case 17:
                ((dyj0) obj).close();
                return zy11Var;
            case 18:
                ((zyj) obj).close();
                return zy11Var;
            case 19:
                ((a4f0) obj).close();
                return zy11Var;
            case 20:
                ((ljt) obj).close();
                return zy11Var;
            case 21:
                ((xi3) obj).close();
                return zy11Var;
            case 22:
                return g8e.o("handlePollingUpdates: error creating route for car=", ((m58) obj).a);
            case 23:
                ((MassTransitModeRouterImpl$onAttach$1$visit$$inlined$suspendCallbackApi$2) obj).invoke(zy11Var);
                return zy11Var;
            case 24:
                ((cn2) obj).close();
                return zy11Var;
            case 25:
                return ((PresaleFragment) obj).getViewLifecycleOwner().getLifecycle();
            case 26:
                return new dnd0(1, (hli0) obj);
            case 27:
                b bVar = (b) obj;
                if (bVar.h() <= 0 && bVar.i() <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 28:
                ((ScootersIgnitionControllingUiActionInteractor$clickOnSpecificOptiondlKKtPk$$inlined$suspendCallbackApi$2) obj).invoke(zy11Var);
                return zy11Var;
            default:
                return (fgo0) ((e) obj).f.getValue();
        }
    }
}
