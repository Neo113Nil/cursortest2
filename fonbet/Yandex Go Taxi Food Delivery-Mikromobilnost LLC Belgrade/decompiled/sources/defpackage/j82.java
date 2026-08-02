package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class j82 implements Runnable {
    public final /* synthetic */ AndroidComposeView a;

    public j82(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MotionEvent motionEvent;
        int actionMasked;
        long j;
        AndroidComposeView androidComposeView = this.a;
        androidComposeView.removeCallbacks(this);
        motionEvent = androidComposeView.previousMotionEvent;
        if (motionEvent == null || (actionMasked = motionEvent.getActionMasked()) == 10 || actionMasked == 1) {
            return;
        }
        int i = 7;
        if (actionMasked != 7 && actionMasked != 9) {
            i = 2;
        }
        j = androidComposeView.relayoutTime;
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, false);
    }
}
