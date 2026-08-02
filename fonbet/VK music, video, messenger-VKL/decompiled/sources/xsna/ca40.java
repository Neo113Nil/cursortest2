package xsna;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ca40 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ KeyEvent.Callback d;

    public /* synthetic */ ca40(KeyEvent.Callback callback, int i, int i2) {
        this.b = i2;
        this.d = callback;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                AppBarLayout appBarLayout = (AppBarLayout) this.d;
                ViewGroup.LayoutParams layoutParams = appBarLayout.getLayoutParams();
                CoordinatorLayout.f fVar = layoutParams instanceof CoordinatorLayout.f ? (CoordinatorLayout.f) layoutParams : null;
                Object obj = fVar != null ? fVar.a : null;
                AppBarLayout.Behavior behavior = obj instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) obj : null;
                int i = this.c;
                if (behavior == null) {
                    appBarLayout.g(i >= 0, false, true);
                    break;
                } else {
                    behavior.G(i);
                    ViewParent parent = appBarLayout.getParent();
                    if (parent != null) {
                        parent.requestLayout();
                        break;
                    }
                }
                break;
            default:
                ((ner0) this.d).setProgress(this.c);
                break;
        }
    }
}
