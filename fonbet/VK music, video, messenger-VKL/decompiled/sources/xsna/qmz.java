package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.libvideo.live.impl.dialog.LiveVideoDialog;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;

/* compiled from: LiveSwipeView.java */
/* loaded from: classes3.dex */
public final class qmz implements ViewPager.j {
    public final /* synthetic */ LiveSwipeView b;

    public qmz(LiveSwipeView liveSwipeView) {
        this.b = liveSwipeView;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
        lmz lmzVar;
        if (i != 1 || (lmzVar = this.b.d) == null) {
            return;
        }
        lmzVar.k1();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        diz dizVar = this.b.f;
        if (dizVar != null) {
            if (i == 0) {
                ((LiveVideoDialog) dizVar).o0 = false;
            } else {
                ((LiveVideoDialog) dizVar).o0 = true;
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
