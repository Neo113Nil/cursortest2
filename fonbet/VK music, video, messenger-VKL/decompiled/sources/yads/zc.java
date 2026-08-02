package yads;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class zc implements View.OnTouchListener {
    public final View a;
    public final Dialog b;
    public final ne1 c;
    public float d;

    public zc(ViewGroup viewGroup, Dialog dialog, ne1 ne1Var) {
        this.a = viewGroup;
        this.b = dialog;
        this.c = ne1Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float rawY = motionEvent.getRawY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = rawY;
            return true;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float f = this.d;
            if (rawY > f) {
                this.a.setTranslationY(rawY - f);
            } else {
                this.a.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        } else if (rawY > this.d) {
            this.c.getClass();
            ne1.a(view);
            ng0.a(this.b);
        }
        return true;
    }
}
