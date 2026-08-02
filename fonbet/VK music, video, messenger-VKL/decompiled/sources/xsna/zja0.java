package xsna;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* compiled from: PictureInPictureOverlayDragListener.kt */
/* loaded from: classes7.dex */
public final class zja0 implements View.OnTouchListener {
    public final WindowManager b;
    public final WindowManager.LayoutParams c;
    public final int d;
    public int e;
    public int f;
    public float g;
    public float h;
    public boolean i;

    public zja0(Context context, FrameLayout frameLayout, WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        this.b = windowManager;
        this.c = layoutParams;
        this.d = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        WindowManager.LayoutParams layoutParams = this.c;
        if (action == 0) {
            this.e = layoutParams.x;
            this.f = layoutParams.y;
            this.g = motionEvent.getRawX();
            this.h = motionEvent.getRawY();
            this.i = false;
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                float rawX = motionEvent.getRawX() - this.g;
                float rawY = motionEvent.getRawY() - this.h;
                layoutParams.x = this.e - ((int) rawX);
                layoutParams.y = this.f - ((int) rawY);
                float abs = Math.abs(rawX);
                float f = this.d;
                if (abs <= f && Math.abs(rawY) <= f) {
                    return true;
                }
                this.i = true;
                this.b.updateViewLayout(view, layoutParams);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (!this.i) {
            view.performClick();
        }
        view.postDelayed(new dxt(4, this, view), 100L);
        return true;
    }
}
