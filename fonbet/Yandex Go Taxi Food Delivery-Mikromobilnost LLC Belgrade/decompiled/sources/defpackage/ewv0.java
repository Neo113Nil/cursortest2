package defpackage;

import com.yandex.go.coroutines.b;
import com.yandex.go.superapp.discovery.map.api.repositories.state.SuperAppDiscoveryMapOverlayState;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapPresenter$startObserveCompassButtonState$$inlined$safeCollectIn$1;
import com.yandex.go.superapp.discovery.map.impl.ui.main.SuperAppDiscoveryMapPresenter$startObserveCompassButtonState$$inlined$start$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class ewv0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwv0 b;

    public /* synthetic */ ewv0(fwv0 fwv0Var, int i) {
        this.a = i;
        this.b = fwv0Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        switch (this.a) {
            case 0:
                float floatValue = ((Number) obj).floatValue();
                ((uvv0) this.b.Dg()).b(360.0f - floatValue, !(floatValue == 0.0f));
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                r0 r0Var = this.b.M.h;
                r0Var.getClass();
                r0Var.m(null, bool);
                fwv0 fwv0Var = this.b;
                if (booleanValue) {
                    ((uvv0) this.b.Dg()).N9(!(((gh00) fwv0Var.H).e.c.getAzimuth() == 0.0f));
                    fwv0 fwv0Var2 = this.b;
                    pzt0 pzt0Var = fwv0Var2.N;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    fwv0Var2.N = tje.N(fwv0Var2.Jg(), null, null, new SuperAppDiscoveryMapPresenter$startObserveCompassButtonState$$inlined$safeCollectIn$1(e.t(b.d(new com.yandex.go.superapp.discovery.map.impl.ui.main.b(dib1.c(fwv0Var2.H)), new SuperAppDiscoveryMapPresenter$startObserveCompassButtonState$$inlined$start$1(fwv0Var2, null))), null, fwv0Var2), 3);
                } else {
                    ((uvv0) fwv0Var.Dg()).cd();
                    pzt0 pzt0Var2 = this.b.N;
                    if (pzt0Var2 != null) {
                        pzt0Var2.a(null);
                    }
                }
                break;
            case 2:
                SuperAppDiscoveryMapOverlayState superAppDiscoveryMapOverlayState = ((c0d) obj).b;
                if (superAppDiscoveryMapOverlayState == SuperAppDiscoveryMapOverlayState.MINIFY || superAppDiscoveryMapOverlayState == SuperAppDiscoveryMapOverlayState.HIDDEN) {
                    this.b.A.b(t6c0.a);
                }
                break;
            case 3:
                if (((c0d) obj).b != SuperAppDiscoveryMapOverlayState.SELECTED) {
                    this.b.B.b(n010.a);
                }
                break;
            case 4:
                ((uvv0) this.b.Dg()).Z7((fto) obj);
                break;
            case 5:
                ((uvv0) this.b.Dg()).q1((qto) obj);
                break;
            default:
                ((uvv0) this.b.Dg()).render((byv0) obj);
                break;
        }
        return zy11.a;
    }
}
