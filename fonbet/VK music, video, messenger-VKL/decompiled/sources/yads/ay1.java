package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;

/* loaded from: classes10.dex */
public final class ay1 extends ViewPager2.g {
    public final /* synthetic */ ViewPager2 a;
    public final /* synthetic */ MultiBannerControlsContainer b;

    public ay1(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
        this.a = viewPager2;
        this.b = multiBannerControlsContainer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.g
    public final void onPageSelected(int i) {
        RecyclerView.Adapter adapter = this.a.getAdapter();
        this.b.a(i, adapter != null ? adapter.getItemCount() : 0);
    }
}
