package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.core.ui.tracking.UiTrackingScreen;

/* compiled from: EasterEggsUi.kt */
/* loaded from: classes14.dex */
public final class nvo implements m1q0 {
    public final /* synthetic */ lvo a;

    public nvo(lvo lvoVar) {
        this.a = lvoVar;
    }

    @Override // xsna.m1q0
    public final void a(UiTrackingScreen uiTrackingScreen, UiTrackingScreen uiTrackingScreen2) {
        lvo lvoVar = this.a;
        if (lvoVar.a.getLifecycle().getCurrentState().a(Lifecycle.State.STARTED)) {
            lvoVar.a();
        } else {
            lvoVar.e = true;
        }
    }
}
