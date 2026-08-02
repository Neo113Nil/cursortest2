package xsna;

import androidx.viewpager.widget.ViewPager;
import com.vk.core.fragments.FragmentImpl;
import java.util.Iterator;

/* compiled from: ModalPostReactionsFragment.kt */
/* loaded from: classes4.dex */
public final class n130 implements ViewPager.j {
    public final /* synthetic */ z130 b;

    public n130(z130 z130Var) {
        this.b = z130Var;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        Iterator<FragmentImpl> it = this.b.i.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            androidx.lifecycle.f next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            androidx.lifecycle.f fVar = (FragmentImpl) next;
            if (fVar instanceof rcs) {
                ((rcs) fVar).Zh(i == i2);
            }
            i2 = i3;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
