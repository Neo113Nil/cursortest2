package xsna;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.vk.libvideo.design.view.seek.VideoFastSeekView;
import com.vk.libvideo.design.view.seek.VideoFastSeekView$Companion$Type;
import xsna.acx;
import xsna.rcx;

/* compiled from: GestureDetectorListenerImpl.kt */
/* loaded from: classes3.dex */
public final class got extends GestureDetector.SimpleOnGestureListener {
    public final evs b;
    public final VideoFastSeekView c;
    public final c5f d;
    public final bmq e;
    public boolean f = true;

    public got(evs evsVar, VideoFastSeekView videoFastSeekView, c5f c5fVar, bmq bmqVar) {
        this.b = evsVar;
        this.c = videoFastSeekView;
        this.d = c5fVar;
        this.e = bmqVar;
    }

    public final boolean a(MotionEvent motionEvent) {
        Long k;
        Long g;
        lcx lcxVar = ((evs) this.d.c).q;
        long longValue = (lcxVar == null || (g = lcxVar.g()) == null) ? 0L : g.longValue();
        long longValue2 = (lcxVar == null || (k = lcxVar.k()) == null) ? 0L : k.longValue();
        evs evsVar = this.b;
        ocx ocxVar = evsVar.l;
        View view = evsVar.y;
        long a = po10.a(ocxVar.e, longValue2);
        if (longValue >= 1000 && longValue != longValue2 && longValue < a) {
            boolean z = motionEvent.getX() <= ((float) view.getWidth()) / 3.0f;
            boolean z2 = motionEvent.getX() >= (((float) view.getWidth()) / 3.0f) * 2.0f;
            VideoFastSeekView videoFastSeekView = this.c;
            if (z) {
                if (po10.b(evsVar.l.e, Math.max(0L, longValue - 10000))) {
                    evsVar.a(acx.c.a);
                    PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                    videoFastSeekView.z = true;
                    videoFastSeekView.a(false, pointF, VideoFastSeekView$Companion$Type.TAP);
                    return true;
                }
            } else if (z2 && po10.b(evsVar.l.e, Math.min(longValue + 10000, a))) {
                evsVar.a(acx.d.a);
                PointF pointF2 = new PointF(motionEvent.getX(), motionEvent.getY());
                videoFastSeekView.z = true;
                videoFastSeekView.a(true, pointF2, VideoFastSeekView$Companion$Type.TAP);
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ocx currentState;
        lcx lcxVar = ((evs) this.d.c).q;
        if (lcxVar != null && (currentState = lcxVar.getCurrentState()) != null && currentState.h) {
            return false;
        }
        Long g = lcxVar != null ? lcxVar.g() : null;
        evs evsVar = this.b;
        boolean z = (evsVar.getState().c instanceof rcx.a.d) || (evsVar.getState().c instanceof rcx.a.c);
        if (g != null && z && a(motionEvent)) {
            this.f = false;
            this.c.setVisibility(0);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (!epx.f(this.b.getState().c, rcx.a.C3604a.a) && this.c.c()) {
            if (this.f) {
                a(motionEvent);
                return true;
            }
            this.f = true;
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        bmq bmqVar = this.e;
        if (bmqVar.g) {
            bmqVar.b(true, true);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (!this.c.c()) {
            evs evsVar = this.b;
            evsVar.s2();
            if (evsVar.B) {
                evsVar.Q(true);
                return true;
            }
            evsVar.S(true);
        }
        return true;
    }
}
