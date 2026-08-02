package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;
import com.vk.libvideo.design.view.live.LiveView;
import com.vk.libvideo.ui.ad.AdvertBannerView;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: LiveView.java */
/* loaded from: classes2.dex */
public final class ynz extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ LiveView b;

    public ynz(LiveView liveView) {
        this.b = liveView;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        LiveView liveView = this.b;
        if (!liveView.R && liveView.Q.w()) {
            liveView.c(motionEvent);
        }
        return liveView.R;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        LiveView liveView = this.b;
        if (liveView.Q.w()) {
            int i = ify.a;
            if (ify.e(ify.c)) {
                return;
            }
        }
        if (liveView.Q.w() && liveView.R) {
            ikv0.a aVar = new ikv0.a(liveView.getContext());
            aVar.u = new ikv0.d(liveView.getContext().getString(R.string.live_controls_hidden_toast), (String) null, (ikv0.d.a) null);
            aVar.l = 48;
            aVar.b = true;
            aVar.e = 1500L;
            aVar.n();
        }
        liveView.q(true);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        fes0 debugView;
        LiveView liveView = this.b;
        AdvertBannerView advertBannerView = liveView.v;
        if (liveView.R) {
            if (!fdp0.a(motionEvent.getRawX(), motionEvent.getRawY(), liveView, new edp0(false)) && !liveView.a0() && !liveView.a0 && !liveView.Q.w()) {
                liveView.q(true);
                return true;
            }
        } else if (!((g7s0) fxc0.a.getValue()).i().f() || (debugView = liveView.getVideoTextureView().getDebugView()) == null || !fdp0.a(motionEvent.getRawX(), motionEvent.getRawY(), debugView.b(), new edp0(true))) {
            if (advertBannerView != null && fdp0.a(motionEvent.getRawX(), motionEvent.getRawY(), advertBannerView, new lh3(liveView, 23)) && motionEvent.getAction() == 0) {
                advertBannerView.getLocationOnScreen(new int[2]);
                motionEvent.setLocation(motionEvent.getRawX() - r0[0], motionEvent.getRawY() - r0[1]);
                advertBannerView.onTouchEvent(motionEvent);
                motionEvent.setAction(1);
                advertBannerView.onTouchEvent(motionEvent);
                return true;
            }
            if (!liveView.Q.w() || !liveView.c(motionEvent)) {
                liveView.q(true);
                return true;
            }
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        LiveView liveView = this.b;
        if (!liveView.g0) {
            return super.onSingleTapUp(motionEvent);
        }
        liveView.g0 = false;
        return false;
    }
}
