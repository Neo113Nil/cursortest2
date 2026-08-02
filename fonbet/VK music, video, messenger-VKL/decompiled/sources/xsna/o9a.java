package xsna;

import android.view.View;
import android.view.ViewParent;
import androidx.viewpager.widget.ViewPager;

/* compiled from: CatalogModalBottomSheetController.kt */
/* loaded from: classes6.dex */
public final class o9a implements ViewPager.j {
    public final /* synthetic */ n9a b;

    public o9a(n9a n9aVar) {
        this.b = n9aVar;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        n9a n9aVar = this.b;
        ViewPager viewPager = n9aVar.s;
        ViewParent parent = viewPager != null ? viewPager.getParent() : null;
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            n9aVar.u.G(view);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
