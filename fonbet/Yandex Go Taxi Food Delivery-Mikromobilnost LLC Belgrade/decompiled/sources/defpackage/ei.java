package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import com.yandex.div.internal.widget.SwitchView;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ei extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;

    public /* synthetic */ ei(int i) {
        this.a = i;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        switch (this.a) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(null);
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.v(true);
                whVar.q(false);
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(null);
                break;
            case 4:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                if (view instanceof ViewGroup) {
                    String X = a.X(vng.h((ViewGroup) view), Extension.FIX_SPACE, null, null, null, 62);
                    if (X.length() != 0) {
                        whVar.t(X);
                        break;
                    }
                }
                break;
            case 5:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 6:
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                break;
            case 7:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 8:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 9:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.r(null);
                break;
            case 10:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.B(false);
                break;
            case 11:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.r(null);
                break;
            case 12:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 13:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 14:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 15:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 16:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.q(false);
                whVar.i(ph.g);
                break;
            case 17:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.q(false);
                whVar.i(ph.g);
                break;
            case 18:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("");
                break;
            case 19:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.i(ph.g);
                whVar.q(false);
                break;
            case 20:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.G(false);
                whVar.a.setScreenReaderFocusable(false);
                whVar.i(ph.g);
                whVar.i(ph.e);
                break;
            case 21:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.q(false);
                whVar.i(ph.g);
                break;
            case 22:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 23:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(null);
                whVar.i(ph.g);
                break;
            case 24:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 25:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
            case 26:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Switch");
                whVar.m(true);
                SwitchView switchView = view instanceof SwitchView ? (SwitchView) view : null;
                whVar.o(switchView != null && switchView.isChecked());
                break;
            case 27:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.G(false);
                break;
            case 28:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p(null);
                break;
            case 29:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                break;
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        switch (this.a) {
            case 6:
                int eventType = accessibilityEvent.getEventType();
                if (eventType != 4 && eventType != 4096) {
                    break;
                }
                break;
        }
        return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
}
