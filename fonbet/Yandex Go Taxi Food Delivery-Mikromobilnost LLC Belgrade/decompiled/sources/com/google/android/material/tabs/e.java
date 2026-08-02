package com.google.android.material.tabs;

import defpackage.ct31;
import java.lang.ref.WeakReference;

/* loaded from: classes11.dex */
public final class e implements ct31 {
    public final WeakReference a;
    public int b;
    public int c;

    public e(TabLayout tabLayout) {
        this.a = new WeakReference(tabLayout);
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        this.b = this.c;
        this.c = i;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            tabLayout.updateViewPagerScrollState(this.c);
        }
    }

    @Override // defpackage.ct31
    public final void onPageScrolled(int i, float f, int i2) {
        boolean z;
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout != null) {
            int i3 = this.c;
            boolean z2 = true;
            if (i3 != 2 || this.b == 1) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            if (i3 == 2 && this.b == 0) {
                z = false;
            }
            tabLayout.setScrollPosition(i, f, z2, z, false);
        }
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        TabLayout tabLayout = (TabLayout) this.a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.c;
        tabLayout.selectTab(tabLayout.getTabAt(i), i2 == 0 || (i2 == 2 && this.b == 0));
    }
}
