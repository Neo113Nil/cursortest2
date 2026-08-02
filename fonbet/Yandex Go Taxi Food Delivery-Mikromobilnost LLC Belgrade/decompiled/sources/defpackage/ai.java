package defpackage;

import android.media.RouteDiscoveryPreference;
import android.util.CloseGuard;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class ai {
    public static /* synthetic */ AccessibilityEvent C() {
        return new AccessibilityEvent(32);
    }

    public static /* synthetic */ RouteDiscoveryPreference.Builder j(List list) {
        return new RouteDiscoveryPreference.Builder(list, false);
    }

    public static /* bridge */ /* synthetic */ CloseGuard m(Object obj) {
        return (CloseGuard) obj;
    }

    public static /* synthetic */ AccessibilityEvent p() {
        return new AccessibilityEvent(2048);
    }

    public static /* synthetic */ AccessibilityEvent q(int i) {
        return new AccessibilityEvent(i);
    }

    public static /* synthetic */ AccessibilityNodeInfo r(View view) {
        return new AccessibilityNodeInfo(view);
    }

    public static /* synthetic */ void s() {
    }
}
