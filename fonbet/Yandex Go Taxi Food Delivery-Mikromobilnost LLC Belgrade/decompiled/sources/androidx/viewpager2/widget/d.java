package androidx.viewpager2.widget;

import defpackage.ht31;

/* loaded from: classes.dex */
public final class d extends ht31 {
    public final /* synthetic */ ViewPager2 a;

    public d(ViewPager2 viewPager2) {
        this.a = viewPager2;
    }

    @Override // defpackage.ht31, androidx.recyclerview.widget.RecyclerView.a
    public final void a() {
        ViewPager2 viewPager2 = this.a;
        viewPager2.mCurrentItemDirty = true;
        viewPager2.mScrollEventAdapter.l = true;
    }
}
