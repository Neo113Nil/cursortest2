package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.WeakHashMap;

/* compiled from: StoryRepostStylePresenter.kt */
/* loaded from: classes16.dex */
public final class ybm0 implements uyl0 {
    public final xbm0 b;
    public final rbm0 c;
    public Integer d;

    public ybm0(xbm0 xbm0Var, rbm0 rbm0Var) {
        this.b = xbm0Var;
        this.c = rbm0Var;
    }

    @Override // xsna.uyl0
    public final void X1(nov novVar) {
        nxt0 nxt0Var;
        if (novVar instanceof z7c0) {
            z7c0 z7c0Var = (z7c0) novVar;
            z7c0 z7c0Var2 = new z7c0(z7c0Var.getContext(), z7c0Var.f, null, 8);
            z7c0Var2.setMetaHeaderVisibility(false);
            nxt0Var = z7c0Var2;
        } else if (novVar instanceof lba0) {
            lba0 lba0Var = (lba0) novVar;
            lba0 lba0Var2 = new lba0(lba0Var.getContext(), lba0Var.getInfo(), true);
            lba0Var2.setMetaHeaderVisibility(false);
            nxt0Var = lba0Var2;
        } else if (novVar instanceof h5a0) {
            h5a0 h5a0Var = (h5a0) novVar;
            nxt0Var = new h5a0(h5a0Var.getContext(), h5a0Var.f, true);
        } else if (novVar instanceof r4g0) {
            r4g0 r4g0Var = (r4g0) novVar;
            r4g0 r4g0Var2 = new r4g0(r4g0Var.getContext(), r4g0Var.getInfo(), r4g0Var.getVideo(), true);
            r4g0Var2.setMetaHeaderVisibility(false);
            nxt0Var = r4g0Var2;
        } else {
            nxt0Var = null;
        }
        if (nxt0Var == null) {
            return;
        }
        xbm0 xbm0Var = this.b;
        zbm0 zbm0Var = xbm0Var.f;
        iz8 iz8Var = xbm0Var.g;
        if (iz8Var != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            Window window = xbm0Var.getWindow();
            layoutParams.copyFrom(window != null ? window.getAttributes() : null);
            Float f = iz8Var.g;
            if (f == null) {
                layoutParams.gravity = 17;
            } else {
                layoutParams.gravity = 48;
                layoutParams.y = (int) f.floatValue();
            }
            layoutParams.width = -1;
            layoutParams.height = iz8Var.b;
            Window window2 = xbm0Var.getWindow();
            if (window2 != null) {
                window2.setAttributes(layoutParams);
            }
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        ViewGroup viewGroup = xbm0Var.h;
        if (viewGroup != null) {
            viewGroup.addView(nxt0Var, layoutParams2);
        }
        ViewGroup viewGroup2 = xbm0Var.h;
        if (viewGroup2 != null) {
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            if (!viewGroup2.isLaidOut()) {
                viewGroup2.addOnLayoutChangeListener(new vbm0(xbm0Var, nxt0Var, nxt0Var));
                return;
            }
            if (zbm0Var.b()) {
                zbm0Var.c(nxt0Var, zbm0Var.a(nxt0Var));
            }
            nxt0Var.requestLayout();
            xbm0.f(nxt0Var, new wbm0(nxt0Var, xbm0Var)).start();
        }
    }

    @Override // xsna.uyl0
    public final void k() {
        this.c.a(this.d);
        this.b.dismiss();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        throw null;
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.uyl0
    public final void onStart() {
    }

    @Override // xsna.uyl0
    public final void onStop() {
    }
}
