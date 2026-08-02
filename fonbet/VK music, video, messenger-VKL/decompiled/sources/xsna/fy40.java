package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;

/* compiled from: MusicPlayerPersistentBottomSheet.kt */
/* loaded from: classes3.dex */
public final class fy40 implements ViewPager.j {
    public final /* synthetic */ MusicPlayerPersistentBottomSheet b;

    public fy40(MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet) {
        this.b = musicPlayerPersistentBottomSheet;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        this.b.k0.run();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
