package defpackage;

import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes7.dex */
public final class ob81 extends ViewPager2.a {
    public final b571 a;
    public final ew81 b;
    public boolean c;

    public ob81(b571 b571Var, ew81 ew81Var) {
        this.a = b571Var;
        this.b = ew81Var;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            this.c = false;
            return;
        }
        if (i != 1) {
            return;
        }
        ew81 ew81Var = this.b;
        if (ew81Var != null) {
            ew81Var.a();
            ew81Var.e = false;
        }
        this.c = true;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        if (this.c) {
            b571 b571Var = this.a;
            if (b571Var.d) {
                b571Var.a("first_user_swipe");
                b571Var.d = false;
            }
            this.c = false;
        }
    }
}
