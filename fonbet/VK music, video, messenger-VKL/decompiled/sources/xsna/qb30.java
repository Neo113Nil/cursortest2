package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MotionSwipeRefreshLayout.kt */
@ozl
/* loaded from: classes6.dex */
public class qb30 extends SwipeRefreshLayout {
    public final int P;
    public final Rect Q;
    public View R;
    public float S;
    public float T;

    public qb30(Context context) {
        super(context, null);
        this.P = ViewConfiguration.get(context).getScaledTouchSlop();
        this.Q = new Rect();
    }

    public static View l(View view, pb30 pb30Var) {
        if (!bwt0.K(view)) {
            return null;
        }
        if (((Boolean) pb30Var.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View l = l(viewGroup.getChildAt(i), pb30Var);
            if (l != null) {
                return l;
            }
        }
        return null;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout
    public final boolean c() {
        View view;
        View childAt = getChildAt(0);
        MotionLayout motionLayout = childAt instanceof MotionLayout ? (MotionLayout) childAt : null;
        return super.c() || (motionLayout != null && motionLayout.getProgress() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) || ((view = this.R) != null && view.canScrollVertically(-1));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.S = motionEvent.getX();
            this.T = motionEvent.getY();
            this.R = l(this, new pb30(this, an10.b(motionEvent.getX()), an10.b(motionEvent.getY())));
        } else if (action == 1) {
            this.R = null;
        } else if (action == 2) {
            float abs = Math.abs(motionEvent.getX() - this.S);
            float abs2 = Math.abs(motionEvent.getY() - this.T);
            if (abs > this.P && abs > abs2) {
                return false;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
