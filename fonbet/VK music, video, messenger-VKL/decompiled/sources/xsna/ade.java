package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.clips.viewer.impl.grid.lists.fragments.AbstractClipsGridListFragment;

/* compiled from: ClipsGridFragment.kt */
/* loaded from: classes17.dex */
public final class ade implements ViewPager.j {
    public final /* synthetic */ ClipsGridFragment b;

    public ade(ClipsGridFragment clipsGridFragment) {
        this.b = clipsGridFragment;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        qcy<Object>[] qcyVarArr = ClipsGridFragment.H0;
        ClipsGridFragment clipsGridFragment = this.b;
        int size = clipsGridFragment.lo().k.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractClipsGridListFragment h = clipsGridFragment.lo().h(i2);
            if (h != null && h.V != 0) {
                androidx.lifecycle.f g = clipsGridFragment.lo().g();
                rde rdeVar = g instanceof rde ? (rde) g : null;
                if (rdeVar != null) {
                    rdeVar.Mc();
                    return;
                }
                return;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
