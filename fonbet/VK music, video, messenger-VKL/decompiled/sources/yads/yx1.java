package yads;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import xsna.qcy;
import xsna.s3q0;

/* loaded from: classes10.dex */
public final class yx1 extends dt {
    public static final /* synthetic */ qcy[] g = {wb.a(yx1.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    public final ky1 c;
    public final cy1 d;
    public final mn2 e;
    public xx1 f = xx1.b;

    public yx1(ViewPager2 viewPager2, ky1 ky1Var, cy1 cy1Var) {
        this.c = ky1Var;
        this.d = cy1Var;
        this.e = nn2.a(viewPager2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        s3q0 s3q0Var;
        ViewPager2 viewPager2;
        mn2 mn2Var = this.e;
        qcy qcyVar = g[0];
        ViewPager2 viewPager22 = (ViewPager2) mn2Var.a.get();
        if (viewPager22 != null) {
            if (om3.a.a(viewPager22).a > 0) {
                RecyclerView.Adapter adapter = viewPager22.getAdapter();
                int itemCount = adapter != null ? adapter.getItemCount() : 0;
                if (itemCount != 0) {
                    int currentItem = viewPager22.getCurrentItem();
                    if (currentItem == 0) {
                        this.f = xx1.b;
                    } else if (currentItem == itemCount - 1) {
                        this.f = xx1.c;
                    }
                } else {
                    this.b = ct.c;
                }
                int ordinal = this.f.ordinal();
                if (ordinal == 0) {
                    ViewPager2 viewPager23 = (ViewPager2) this.c.a.get();
                    if (viewPager23 != null) {
                        viewPager23.e(viewPager23.getCurrentItem() + 1, true);
                    }
                } else if (ordinal == 1 && (viewPager2 = (ViewPager2) this.c.a.get()) != null) {
                    viewPager2.e(viewPager2.getCurrentItem() - 1, true);
                }
                cy1 cy1Var = this.d;
                if (cy1Var.e) {
                    cy1Var.a("first_auto_swipe");
                    cy1Var.e = false;
                }
            }
            s3q0Var = s3q0.a;
        } else {
            s3q0Var = null;
        }
        if (s3q0Var == null) {
            this.b = ct.c;
        }
    }
}
