package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.go.slot.ui.view.SlotItemButtonViewComponent;
import com.yandex.go.slot.ui.view.SlotItemViewComponent;
import com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView;
import com.yandex.go.taxi.order.multi.feed.ui.TaxiOrderFeedView;
import com.yandex.messaging.internal.view.timeline.overlay.f;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.combo.ui.TravelCompanionStatusView;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.search.panorama.TaxiPanoramaModalView;
import ru.yandex.taxi.widget.RobotoTextView;
import ru.yandex.taxi.widget.TimerTextView;
import ru.yandex.taxi.widget.floatbuttonholder.RotatableFloatButton;
import ru.yandex.taxi.widget.map.SourceOnMapControl;

/* loaded from: classes14.dex */
public final class ifq0 extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ifq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        SlotItemViewComponent slotItemViewComponent;
        RobotoTextView robotoTextView;
        ad11 ad11Var;
        String currentTimerDescription;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.C(((gfq0) obj).b);
                whVar.q(false);
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                SlotItemButtonViewComponent slotItemButtonViewComponent = (SlotItemButtonViewComponent) obj;
                slotItemViewComponent = slotItemButtonViewComponent.slotItemView;
                List h = vng.h(slotItemViewComponent);
                int i2 = 6;
                String X = a.X(h, null, null, null, new l75(i2), 31);
                if (X.length() > 0) {
                    robotoTextView = slotItemButtonViewComponent.badgeView;
                    whVar.t(a.X(j73.A(new CharSequence[]{X, robotoTextView != null ? robotoTextView.getContentDescription() : null}), null, null, null, new l75(i2), 31));
                    whVar.p("android.widget.Button");
                    break;
                }
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.b(new ph(16, ((SourceOnMapControl) obj).getContext().getString(kyh0.common_edit)));
                whVar.p("android.widget.Button");
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                yfu0 yfu0Var = (yfu0) obj;
                if (((String) yfu0Var.V) == null) {
                    whVar.p(null);
                    whVar.i(ph.g);
                    break;
                } else {
                    whVar.p("android.widget.Button");
                    whVar.b(new ph(16, (String) yfu0Var.V));
                    break;
                }
            case 4:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                yfu0 yfu0Var2 = (yfu0) obj;
                if (((String) yfu0Var2.V) == null) {
                    whVar.p(null);
                    whVar.i(ph.g);
                    break;
                } else {
                    whVar.p("android.widget.Button");
                    whVar.b(new ph(16, (String) yfu0Var2.V));
                    break;
                }
            case 5:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.b(new ph(32, ((zt) obj).b));
                break;
            case 6:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                irv0 irv0Var = (irv0) obj;
                whVar.b(new ph(16, irv0Var.d));
                whVar.t(irv0Var.c + " " + irv0Var.e);
                break;
            case 7:
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                break;
            case 8:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, ((TaxiPanoramaModalView) obj).getContext().getString(kyh0.common_close)));
                break;
            case 9:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                ((f) obj).o(whVar);
                break;
            case 10:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, c.G(kyh0.mt_route_details_see_travel_options_description, ((gj5) obj).a)));
                break;
            case 11:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.t(((TimerTextView) obj).getCurrentContentDescription());
                break;
            case 12:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, (CharSequence) obj));
                break;
            case 13:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                TravelCompanionStatusView travelCompanionStatusView = (TravelCompanionStatusView) obj;
                ad11Var = travelCompanionStatusView.currentModel;
                String str = ad11Var.a;
                currentTimerDescription = travelCompanionStatusView.getCurrentTimerDescription();
                whVar.t(cvu0.v(str, "$TIME$", currentTimerDescription, false));
                break;
            case 14:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, ((RotatableFloatButton) obj).getContext().getString(kyh0.select_current_geolocation_description)));
                break;
            case 15:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
                whVar.t(((dv11) obj).b);
                break;
            case 16:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                u421 u421Var = (u421) obj;
                u421Var.c0();
                whVar.b(new ph(16, c.G(kyh0.common_remove, u421Var.a)));
                r421 r421Var = u421Var.T;
                if (r421Var != null) {
                    String str2 = r421Var.d;
                    if (str2.length() != 0) {
                        whVar.t(str2);
                        break;
                    }
                }
                if (view instanceof ViewGroup) {
                    String X2 = a.X(vng.h((ViewGroup) view), Extension.FIX_SPACE, null, null, null, 62);
                    if (X2.length() != 0) {
                        whVar.t(X2);
                        break;
                    }
                }
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.m(true);
                whVar.o(((yf20) obj).f);
                whVar.p("android.widget.Switch");
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        boolean isExpanded;
        q1y0 q1y0Var;
        m7y0 m7y0Var;
        switch (this.a) {
            case 7:
                TaxiOrderFlexView taxiOrderFlexView = (TaxiOrderFlexView) this.b;
                isExpanded = taxiOrderFlexView.isExpanded();
                if (!isExpanded && accessibilityEvent.getEventType() == 32768) {
                    q1y0Var = taxiOrderFlexView.flexViewCallback;
                    m7y0Var = ((TaxiOrderFeedView) ((l7s0) ((gym) q1y0Var).a).a).delegate;
                    ((k7y0) m7y0Var).a.setBehaviourState(3);
                }
                break;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.a) {
            case 9:
                if (!((f) this.b).s(i)) {
                    break;
                }
                break;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
