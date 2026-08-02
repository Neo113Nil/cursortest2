package defpackage;

import android.util.SparseArray;
import com.yandex.div.core.view2.divs.tabs.a;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;

/* loaded from: classes11.dex */
public final class k05 implements ct31 {
    public final /* synthetic */ int a;
    public int b = 0;
    public final /* synthetic */ Object c;

    public /* synthetic */ k05(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.ct31
    public final void onPageScrollStateChanged(int i) {
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout;
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                x5x0 x5x0Var = (x5x0) obj;
                this.b = i;
                if (i == 0) {
                    int currentItem = x5x0Var.c.getCurrentItem();
                    com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout viewPagerFixedSizeLayout2 = x5x0Var.d;
                    r810 r810Var = x5x0Var.e;
                    if (r810Var != null && viewPagerFixedSizeLayout2 != null) {
                        r810Var.a(0.0f, currentItem);
                        viewPagerFixedSizeLayout2.requestLayout();
                    }
                    if (!x5x0Var.l) {
                        x5x0Var.b.fixScrollPosition(currentItem);
                    }
                    x5x0Var.l = false;
                    break;
                }
                break;
            default:
                a aVar = (a) obj;
                this.b = i;
                if (i == 0) {
                    int currentItem2 = aVar.d.getCurrentItem();
                    nt31 nt31Var = aVar.f;
                    if (nt31Var != null && (viewPagerFixedSizeLayout = aVar.e) != null) {
                        g5n g5nVar = (g5n) nt31Var;
                        g5nVar.d = currentItem2;
                        g5nVar.e = 0.0f;
                        viewPagerFixedSizeLayout.requestLayout();
                    }
                    if (!aVar.l) {
                        aVar.c.fixScrollPosition(currentItem2);
                    }
                    aVar.l = false;
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0082, code lost:
    
        if (r7.a() != r7.b()) goto L43;
     */
    @Override // defpackage.ct31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onPageScrolled(int i, float f, int i2) {
        com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout viewPagerFixedSizeLayout;
        r810 r810Var;
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout2;
        nt31 nt31Var;
        int i3 = this.a;
        Object obj = this.c;
        switch (i3) {
            case 0:
                x5x0 x5x0Var = (x5x0) obj;
                if (this.b != 0 && (viewPagerFixedSizeLayout = x5x0Var.d) != null && (r810Var = x5x0Var.e) != null) {
                    SparseArray sparseArray = r810Var.c;
                    if (sparseArray.size() != 0) {
                        if (i == 0 || (i == 1 && f <= 0.0f)) {
                            z83.h(null, sparseArray.size() > 0);
                            u4x0 u4x0Var = (u4x0) sparseArray.valueAt(sparseArray.size() - 1);
                            break;
                        }
                    }
                    x5x0Var.e.a(f, i);
                    if (viewPagerFixedSizeLayout.isInLayout()) {
                        viewPagerFixedSizeLayout.post(new js4(3, viewPagerFixedSizeLayout));
                    } else {
                        viewPagerFixedSizeLayout.requestLayout();
                    }
                }
                if (!x5x0Var.l) {
                    x5x0Var.b.setIntermediateState(i, f);
                    break;
                }
                break;
            default:
                a aVar = (a) obj;
                if (this.b != 0 && (viewPagerFixedSizeLayout2 = aVar.e) != null && (nt31Var = aVar.f) != null) {
                    g5n g5nVar = (g5n) nt31Var;
                    g5nVar.d = i;
                    g5nVar.e = f;
                    if (viewPagerFixedSizeLayout2.shouldRequestLayoutOnScroll(i, f)) {
                        if (viewPagerFixedSizeLayout2.isInLayout()) {
                            viewPagerFixedSizeLayout2.post(new js4(4, viewPagerFixedSizeLayout2));
                        } else {
                            viewPagerFixedSizeLayout2.requestLayout();
                        }
                    }
                }
                if (!aVar.l) {
                    aVar.c.setIntermediateState(i, f);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.ct31
    public final void onPageSelected(int i) {
        ViewPagerFixedSizeLayout viewPagerFixedSizeLayout;
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                x5x0 x5x0Var = (x5x0) obj;
                r810 r810Var = x5x0Var.e;
                if (r810Var != null) {
                    if (this.b == 0) {
                        com.yandex.alicekit.core.views.ViewPagerFixedSizeLayout viewPagerFixedSizeLayout2 = x5x0Var.d;
                        if (r810Var != null && viewPagerFixedSizeLayout2 != null) {
                            r810Var.a(0.0f, i);
                            viewPagerFixedSizeLayout2.requestLayout();
                            break;
                        }
                    }
                } else {
                    x5x0Var.c.requestLayout();
                    break;
                }
                break;
            default:
                a aVar = (a) obj;
                nt31 nt31Var = aVar.f;
                if (nt31Var != null) {
                    if (this.b == 0 && nt31Var != null && (viewPagerFixedSizeLayout = aVar.e) != null) {
                        g5n g5nVar = (g5n) nt31Var;
                        g5nVar.d = i;
                        g5nVar.e = 0.0f;
                        viewPagerFixedSizeLayout.requestLayout();
                        break;
                    }
                } else {
                    aVar.d.requestLayout();
                    break;
                }
                break;
        }
    }
}
