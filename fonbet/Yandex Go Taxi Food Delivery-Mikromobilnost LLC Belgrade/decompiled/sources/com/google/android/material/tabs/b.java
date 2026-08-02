package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;
import defpackage.bt31;
import defpackage.e890;

/* loaded from: classes11.dex */
public final class b implements bt31 {
    public boolean a;
    public final /* synthetic */ TabLayout b;

    public b(TabLayout tabLayout) {
        this.b = tabLayout;
    }

    @Override // defpackage.bt31
    public final void onAdapterChanged(ViewPager viewPager, e890 e890Var, e890 e890Var2) {
        TabLayout tabLayout = this.b;
        if (tabLayout.viewPager == viewPager) {
            tabLayout.setPagerAdapter(e890Var2, this.a);
        }
    }
}
