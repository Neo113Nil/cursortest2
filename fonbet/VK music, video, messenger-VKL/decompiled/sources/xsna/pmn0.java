package xsna;

import android.view.MotionEvent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.design.view.swipe.SwipeFrameLayout;

/* compiled from: SwipeViewDelegate.kt */
/* loaded from: classes3.dex */
public final class pmn0 {
    public final SwipeFrameLayout a;
    public float b;
    public float c;
    public boolean d;
    public boolean e;
    public float i;
    public float j;
    public boolean l;
    public final float f = iah0.a(5.0f);
    public final float g = iah0.a(25.0f);
    public final boolean h = true;
    public final int k = iah0.a(24.0f);

    public pmn0(SwipeFrameLayout swipeFrameLayout) {
        this.a = swipeFrameLayout;
    }

    public final void a(MotionEvent motionEvent) {
        if (this.i == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.i = motionEvent.getY();
            this.j = motionEvent.getX();
            this.l = this.i < ((float) this.k);
        }
    }
}
