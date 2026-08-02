package xsna;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.vk.core.ui.tracking.UiTracker;

/* compiled from: UiTrackingFragmentStateAdapter.kt */
/* loaded from: classes17.dex */
public final class j1q0 implements androidx.lifecycle.l {
    public final /* synthetic */ k1q0 b;
    public final /* synthetic */ Fragment c;
    public final /* synthetic */ Fragment d;
    public final /* synthetic */ boolean e;

    public j1q0(k1q0 k1q0Var, Fragment fragment, Fragment fragment2, boolean z) {
        this.b = k1q0Var;
        this.c = fragment;
        this.d = fragment2;
        this.e = z;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            ViewPager2 viewPager2 = this.b.l;
            final Fragment fragment = this.d;
            final Fragment fragment2 = this.c;
            final boolean z = this.e;
            viewPager2.post(new Runnable() { // from class: xsna.i1q0
                @Override // java.lang.Runnable
                public final void run() {
                    UiTracker.i.i(Fragment.this, fragment2, z);
                }
            });
            fragment2.getLifecycle().removeObserver(this);
        }
    }
}
