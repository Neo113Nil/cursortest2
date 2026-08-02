package yads;

import androidx.viewpager2.widget.ViewPager2;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class wx1 {
    public static final /* synthetic */ qcy[] g = {wb.a(wx1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final ky1 a;
    public final cy1 b;
    public final ri1 c;
    public final mn2 d;
    public qi1 e;
    public boolean f = true;

    public wx1(ViewPager2 viewPager2, ky1 ky1Var, cy1 cy1Var, ri1 ri1Var) {
        this.a = ky1Var;
        this.b = cy1Var;
        this.c = ri1Var;
        this.d = nn2.a(viewPager2);
    }

    public final void a() {
        qi1 qi1Var = this.e;
        if (qi1Var != null) {
            qi1Var.a.removeCallbacksAndMessages(null);
        }
        this.e = null;
    }
}
