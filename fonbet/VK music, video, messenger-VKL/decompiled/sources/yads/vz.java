package yads;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes10.dex */
public final class vz extends xz {
    public final ky1 c;

    public vz(ky1 ky1Var, cy1 cy1Var, wx1 wx1Var) {
        super(cy1Var, wx1Var, 0);
        this.c = ky1Var;
    }

    @Override // yads.xz, android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewPager2 viewPager2 = (ViewPager2) this.c.a.get();
        if (viewPager2 != null) {
            viewPager2.e(viewPager2.getCurrentItem() - 1, true);
        }
        super.onClick(view);
    }
}
