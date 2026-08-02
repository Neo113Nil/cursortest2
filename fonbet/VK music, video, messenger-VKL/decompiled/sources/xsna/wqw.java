package xsna;

import android.app.Dialog;
import android.content.Context;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.music.notifications.inapp.InAppNotification;

/* compiled from: InAppNotificationManager.kt */
/* loaded from: classes3.dex */
public final class wqw extends Dialog implements m0q0 {
    public final InAppNotification b;

    public wqw(Context context, InAppNotification inAppNotification, int i) {
        super(context, i);
        this.b = inAppNotification;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        if (this.b.a0()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.b.M();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        this.b.N();
    }

    @Override // xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        this.b.y(uiTrackingScreen);
    }
}
