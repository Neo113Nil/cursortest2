package com.yandex.div.core.view2.divs.pager;

import androidx.viewpager2.widget.ViewPager2;
import defpackage.cxk;
import defpackage.sls;
import defpackage.u890;
import defpackage.wfx;
import defpackage.x43;
import defpackage.zy11;
import java.util.List;

/* loaded from: classes.dex */
public final class e extends ViewPager2.a {
    public int a = -1;
    public final x43 b = new x43();
    public final /* synthetic */ u890 c;

    public e(u890 u890Var) {
        this.c = u890Var;
    }

    public final void a() {
        while (true) {
            x43 x43Var = this.b;
            if (x43Var.isEmpty()) {
                return;
            }
            int intValue = ((Number) x43Var.removeFirst()).intValue();
            int i = wfx.a;
            final u890 u890Var = this.c;
            final cxk cxkVar = (cxk) u890Var.b.get(intValue);
            final List t = cxkVar.a.d().t();
            if (t != null) {
                u890Var.a.bulkActions$div_release(new sls() { // from class: com.yandex.div.core.view2.divs.pager.PagerSelectedActionsDispatcher$dispatchSelectedActions$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // defpackage.sls
                    public final Object invoke() {
                        u890 u890Var2 = u890.this;
                        com.yandex.div.core.c.c(u890Var2.c, u890Var2.a, cxkVar.b, t, "selection");
                        return zy11.a;
                    }
                });
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrollStateChanged(int i) {
        if (i == 0) {
            a();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageSelected(int i) {
        int i2 = wfx.a;
        if (this.a == i) {
            return;
        }
        if (i != -1) {
            this.b.addLast(Integer.valueOf(i));
        }
        if (this.a == -1) {
            a();
        }
        this.a = i;
    }
}
