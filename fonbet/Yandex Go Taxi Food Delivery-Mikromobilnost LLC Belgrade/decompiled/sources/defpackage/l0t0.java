package defpackage;

import androidx.viewpager2.widget.ViewPager2;
import com.ybsdk.widgets.common.snackbar.Snackbar;

/* loaded from: classes4.dex */
public final class l0t0 extends ViewPager2.a {
    public final /* synthetic */ Snackbar a;
    public final /* synthetic */ ViewPager2 b;

    public l0t0(Snackbar snackbar, ViewPager2 viewPager2) {
        this.a = snackbar;
        this.b = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        l8x l8xVar;
        Snackbar snackbar = this.a;
        l8xVar = snackbar.dismissJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        if (i == 0 && this.b.getCurrentItem() == 1) {
            snackbar.dismissWithDelay();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        l8x l8xVar;
        if (f != 0.0f || i == 1) {
            return;
        }
        Snackbar snackbar = this.a;
        l8xVar = snackbar.dismissJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        snackbar.animateDismiss();
    }
}
