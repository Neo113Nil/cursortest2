package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;

/* compiled from: UiTrackingSubNavigation.kt */
/* loaded from: classes17.dex */
public final class y1q0 {
    public final l1q0 a;
    public UiTrackingScreen b;
    public UiTrackingScreen c;
    public boolean d;

    public y1q0() {
        this(0);
    }

    public final void a() {
        this.d = false;
        UiTrackingScreen uiTrackingScreen = this.b;
        if (uiTrackingScreen != null) {
            d(uiTrackingScreen, false);
        }
    }

    public final void b() {
        UiTracker uiTracker = UiTracker.a;
        this.b = UiTracker.j.b;
        this.d = true;
    }

    public final void c(UiTrackingScreen uiTrackingScreen, boolean z) {
        if (this.d) {
            d(uiTrackingScreen, z);
        }
    }

    public final void d(UiTrackingScreen uiTrackingScreen, boolean z) {
        UiTrackingScreen uiTrackingScreen2 = this.c;
        if (uiTrackingScreen2 != null && uiTrackingScreen2.a == uiTrackingScreen.a && epx.f(uiTrackingScreen2.f, uiTrackingScreen.f)) {
            return;
        }
        this.a.j(uiTrackingScreen, z);
        this.c = uiTrackingScreen;
    }

    public y1q0(int i) {
        this.a = UiTracker.i;
    }
}
