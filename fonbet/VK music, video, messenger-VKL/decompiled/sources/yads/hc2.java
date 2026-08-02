package yads;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes10.dex */
public final class hc2 extends ViewPager2.g {
    public final cy1 a;
    public final wx1 b;
    public boolean c;

    public hc2(cy1 cy1Var, wx1 wx1Var) {
        this.a = cy1Var;
        this.b = wx1Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.c = false;
            return;
        }
        if (i != 1) {
            return;
        }
        wx1 wx1Var = this.b;
        if (wx1Var != null) {
            wx1Var.a();
            wx1Var.f = false;
        }
        this.c = true;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        if (this.c) {
            cy1 cy1Var = this.a;
            if (cy1Var.d) {
                cy1Var.a("first_user_swipe");
                cy1Var.d = false;
            }
            this.c = false;
        }
    }
}
