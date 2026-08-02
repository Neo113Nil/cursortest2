package defpackage;

import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import ru.yandex.taxi.altpins.walking_route.fragment.AltpinWalkingRouteFragment;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.preorder.RouteSelectorDestinationFragment;
import ru.yandex.taxi.maas.api.analytics.MultiTransportChooseStationCardAnalytics$OpenReasonV2;
import ru.yandex.taxi.maas.impl.ride.exitchoice.MaasExitChooseFragment;

/* loaded from: classes5.dex */
public final class j02 extends dds {
    public final /* synthetic */ int F;
    public final Object G;
    public final Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j02(mf00 mf00Var, a aVar, int i) {
        super("AltpinWalkingRouteRouter");
        this.F = i;
        switch (i) {
            case 1:
                super(null);
                this.G = mf00Var;
                this.H = aVar;
                break;
            default:
                this.G = mf00Var;
                this.H = aVar;
                break;
        }
    }

    @Override // defpackage.h55
    public void J(Object obj) {
        switch (this.F) {
            case 0:
                ((mf00) this.G).a(this, new j01(29));
                break;
            case 1:
                ((mf00) this.G).a(this, new iez(6));
                break;
        }
    }

    @Override // defpackage.dds
    public final a P() {
        int i = this.F;
        Object obj = this.H;
        switch (i) {
            case 0:
                return (a) obj;
            case 1:
                return (a) obj;
            default:
                return ((nzi) this.G).h;
        }
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        switch (this.F) {
            case 0:
                AltpinWalkingRouteFragment.Companion.getClass();
                AltpinWalkingRouteFragment altpinWalkingRouteFragment = new AltpinWalkingRouteFragment();
                altpinWalkingRouteFragment.state = (h741) obj;
                return altpinWalkingRouteFragment;
            case 1:
                g100 g100Var = (g100) obj;
                y000 y000Var = MaasExitChooseFragment.Companion;
                String str = g100Var.a;
                String str2 = g100Var.b;
                j7u0 j7u0Var = g100Var.c;
                h100 h100Var = new h100(this);
                MultiTransportChooseStationCardAnalytics$OpenReasonV2 multiTransportChooseStationCardAnalytics$OpenReasonV2 = g100Var.d;
                y000Var.getClass();
                MaasExitChooseFragment maasExitChooseFragment = new MaasExitChooseFragment(str, str2, j7u0Var, multiTransportChooseStationCardAnalytics$OpenReasonV2, null);
                maasExitChooseFragment.setCallbackListener(h100Var);
                return maasExitChooseFragment;
            default:
                return (RouteSelectorDestinationFragment) this.H;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j02(nzi nziVar, RouteSelectorDestinationFragment routeSelectorDestinationFragment) {
        super(null);
        this.F = 2;
        this.G = nziVar;
        this.H = routeSelectorDestinationFragment;
    }
}
