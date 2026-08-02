package defpackage;

import android.view.accessibility.AccessibilityManager;
import com.ybsdk.feature.merchant.offers.internal.screens.root.MerchantOffersFragment;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.preorder.source.routeoverlay.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class cp10 implements AccessibilityManager.AccessibilityStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cp10(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean z) {
        TaxiMapView taxiMapView;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((MerchantOffersFragment) obj).isAccessibilityModeEnabled = z;
                break;
            default:
                a aVar = (a) obj;
                if (z && aVar.k0 != null) {
                    TaxiMapView h = ((gh00) ((ah00) aVar.b)).h();
                    if (h != null) {
                        aVar.T.c(h);
                        break;
                    }
                } else {
                    wyi wyiVar = (wyi) aVar.T.a;
                    f4c0 f4c0Var = wyiVar.d;
                    if (f4c0Var != null && (taxiMapView = wyiVar.b) != null) {
                        f4c0Var.u(taxiMapView);
                    }
                    wyiVar.b = null;
                    break;
                }
                break;
        }
    }
}
