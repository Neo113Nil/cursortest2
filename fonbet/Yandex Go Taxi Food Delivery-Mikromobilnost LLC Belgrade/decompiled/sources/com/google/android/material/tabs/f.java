package com.google.android.material.tabs;

import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes11.dex */
public final class f implements d {
    public final ViewPager a;

    public f(ViewPager viewPager) {
        this.a = viewPager;
    }

    @Override // com.google.android.material.tabs.c
    public final void a(TabLayout.a aVar) {
        this.a.setCurrentItem(aVar.d);
    }

    @Override // com.google.android.material.tabs.c
    public final void b(TabLayout.a aVar) {
    }
}
