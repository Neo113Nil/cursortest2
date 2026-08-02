package xsna;

import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import xsna.wmb;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class pnb implements View.OnTouchListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pnb(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.b) {
            case 0:
                ynb ynbVar = (ynb) this.c;
                View view2 = ynbVar.m;
                boolean z = false;
                if (view2 != null && view2.isAttachedToWindow()) {
                    z = true;
                }
                if (motionEvent.getAction() == 0 && z) {
                    xn50.a.c(ynbVar, wmb.f.b);
                }
                return z;
            case 1:
                a6z0 a6z0Var = (a6z0) this.c;
                a6z0Var.getClass();
                int action = motionEvent.getAction();
                if (action == 0) {
                    a6z0Var.g = Long.MAX_VALUE;
                    gu8.c(null, "ShoppableWebView: action down");
                    a6z0Var.onTouchEvent(motionEvent);
                    return false;
                }
                if (action == 1) {
                    a6z0Var.g = System.currentTimeMillis();
                    gu8.c(null, "ShoppableWebView: action up");
                    a6z0Var.f = true;
                    return false;
                }
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                    a6z0Var.g = System.currentTimeMillis();
                    gu8.c(null, "ShoppableWebView: action cancel");
                    return false;
                }
                gu8.c(null, "ShoppableWebView: action move");
                a6z0Var.g = Long.MAX_VALUE;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (x < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || x > view.getWidth() || y < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || y > view.getHeight()) {
                    return false;
                }
                a6z0Var.onTouchEvent(motionEvent);
                return false;
            default:
                return com.vungle.ads.internal.r1.a((com.vungle.ads.internal.r1) this.c, view, motionEvent);
        }
    }
}
