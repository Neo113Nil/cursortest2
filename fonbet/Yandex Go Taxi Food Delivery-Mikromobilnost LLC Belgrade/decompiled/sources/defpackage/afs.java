package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;

/* loaded from: classes9.dex */
public final /* synthetic */ class afs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cfs b;

    public /* synthetic */ afs(cfs cfsVar, int i) {
        this.a = i;
        this.b = cfsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        cfs cfsVar = this.b;
        switch (i) {
            case 0:
                if (cfsVar.f != null) {
                    if (cfsVar.m) {
                        cfsVar.c();
                        xby.l(jst.e, "FramesListener.ResetRunningListener", null, null, "Reset running listener", 6);
                    }
                    cfsVar.m = true;
                    cfsVar.h = 0L;
                    cfsVar.i = 0L;
                    cfsVar.j = 0;
                    cfsVar.k = 0;
                    cfsVar.l = 0L;
                    cfsVar.l = SystemClock.elapsedRealtime();
                    cfsVar.c.postDelayed(cfsVar.o, 30000L);
                    cfsVar.f.registerDisplayListener(cfsVar.q, cfsVar.c);
                    cfsVar.d.post(new afs(cfsVar, 3));
                    break;
                } else {
                    xby.l(jst.e, "FramesListener.FailedToInitDisplayManager", null, null, "Failed to get display manager", 6);
                    break;
                }
            case 1:
                cfsVar.c();
                cfsVar.b.quitSafely();
                break;
            case 2:
                cfsVar.c();
                xby.l(jst.e, "FramesListener.StoppedByTimer", "Frames listener stopped by timer", null, null, 12);
                break;
            default:
                Activity activity = cfsVar.a;
                if (!cfsVar.n && !activity.isDestroyed() && !activity.isFinishing()) {
                    Window window = activity.getWindow();
                    if (window != null) {
                        View peekDecorView = window.peekDecorView();
                        if (peekDecorView != null) {
                            if (!peekDecorView.isAttachedToWindow()) {
                                xby.l(jst.e, "FramesListener.FailedToGetAttachedToWindow", null, null, "Failed to get attached to window at start", 6);
                                break;
                            } else if (!peekDecorView.isHardwareAccelerated()) {
                                xby.l(jst.e, "FramesListener.FailedToGetHardwareAcceleration", null, null, "Failed to get hardware acceleration at start", 6);
                                break;
                            } else {
                                window.addOnFrameMetricsAvailableListener(cfsVar.p, cfsVar.c);
                                cfsVar.n = true;
                                break;
                            }
                        } else {
                            xby.l(jst.e, "FramesListener.FailedToGetDecorView", null, null, "Failed to get decor view at start", 6);
                            break;
                        }
                    } else {
                        xby.l(jst.e, "FramesListener.FailedToGetWindow", null, null, "Failed to get activity window at start", 6);
                        break;
                    }
                }
                break;
        }
    }
}
