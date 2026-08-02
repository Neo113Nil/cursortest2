package yads;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import xsna.qcy;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class gy1 implements View.OnAttachStateChangeListener {
    public final wx1 a;
    public final long b;

    public gy1(wx1 wx1Var, long j) {
        this.a = wx1Var;
        this.b = j;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        s3q0 s3q0Var;
        wx1 wx1Var = this.a;
        long j = this.b;
        if (j <= 0) {
            wx1Var.getClass();
            return;
        }
        if (wx1Var.f) {
            wx1Var.a();
            mn2 mn2Var = wx1Var.d;
            qcy qcyVar = wx1.g[0];
            ViewPager2 viewPager2 = (ViewPager2) mn2Var.a.get();
            if (viewPager2 != null) {
                yx1 yx1Var = new yx1(viewPager2, wx1Var.a, wx1Var.b);
                wx1Var.c.getClass();
                Handler handler = new Handler(Looper.getMainLooper());
                qi1 qi1Var = new qi1(handler);
                wx1Var.e = qi1Var;
                if (yx1Var.b == ct.b) {
                    handler.postDelayed(new pi1(qi1Var, j, yx1Var), j);
                }
                s3q0Var = s3q0.a;
            } else {
                s3q0Var = null;
            }
            if (s3q0Var == null) {
                wx1Var.a();
                wx1Var.f = false;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.a();
    }
}
