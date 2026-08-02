package androidx.media3.exoplayer.video;

import android.hardware.display.DisplayManager;
import android.view.Display;
import defpackage.tw21;

/* loaded from: classes10.dex */
final class VideoFrameReleaseHelper$DisplayHelper implements DisplayManager.DisplayListener {
    private final DisplayManager displayManager;
    final /* synthetic */ c this$0;

    public VideoFrameReleaseHelper$DisplayHelper(c cVar, DisplayManager displayManager) {
        this.this$0 = cVar;
        this.displayManager = displayManager;
    }

    private Display getDefaultDisplay() {
        return this.displayManager.getDisplay(0);
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayAdded(int i) {
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayChanged(int i) {
        if (i == 0) {
            c.a(this.this$0, getDefaultDisplay());
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public void onDisplayRemoved(int i) {
    }

    public void register() {
        this.displayManager.registerDisplayListener(this, tw21.n(null));
        c.a(this.this$0, getDefaultDisplay());
    }

    public void unregister() {
        this.displayManager.unregisterDisplayListener(this);
    }
}
