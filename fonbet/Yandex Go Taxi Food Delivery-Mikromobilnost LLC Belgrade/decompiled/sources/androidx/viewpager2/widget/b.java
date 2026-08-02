package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.b64;
import defpackage.jt31;
import defpackage.ny61;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b extends ViewPager2.a {
    public final LinearLayoutManager a;
    public jt31 b;

    public b(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        if (this.b == null) {
            return;
        }
        float f2 = -f;
        int i3 = 0;
        while (true) {
            LinearLayoutManager linearLayoutManager = this.a;
            if (i3 >= linearLayoutManager.d0()) {
                return;
            }
            View c0 = linearLayoutManager.c0(i3);
            if (c0 == null) {
                Locale locale = Locale.US;
                ny61.r(b64.d(i3, linearLayoutManager.d0(), "LayoutManager returned a null child at pos ", "/", " while transforming pages"));
                return;
            } else {
                this.b.c((((RecyclerView.LayoutParams) c0.getLayoutParams()).getViewLayoutPosition() - i) + f2, c0);
                i3++;
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
    }
}
