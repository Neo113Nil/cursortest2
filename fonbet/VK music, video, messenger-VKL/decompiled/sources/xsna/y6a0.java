package xsna;

import androidx.viewpager.widget.ViewPager;

/* compiled from: PhotoEditorSelectionStickerView.java */
/* loaded from: classes15.dex */
public final class y6a0 implements ViewPager.j {
    public final /* synthetic */ x6a0 b;

    public y6a0(x6a0 x6a0Var) {
        this.b = x6a0Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        x6a0 x6a0Var = this.b;
        x6a0Var.O.e(x6a0Var.Q.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
