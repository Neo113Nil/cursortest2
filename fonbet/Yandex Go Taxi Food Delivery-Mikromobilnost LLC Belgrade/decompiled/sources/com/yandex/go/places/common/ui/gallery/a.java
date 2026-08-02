package com.yandex.go.places.common.ui.gallery;

import androidx.viewpager2.widget.ViewPager2;
import defpackage.be80;
import defpackage.bvf0;
import defpackage.mdh;
import defpackage.mf80;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.ub60;
import defpackage.uh60;
import defpackage.uyj;
import ru.yandex.taxi.design.StoryProgressComponent;

/* loaded from: classes13.dex */
public final class a extends ViewPager2.a {
    public int a;
    public final StoryProgressComponent b;
    public final mf80 c;
    public final be80 w = new be80();
    public int x;
    public boolean y;

    public a(StoryProgressComponent storyProgressComponent, mf80 mf80Var) {
        this.a = 0;
        this.b = storyProgressComponent;
        this.c = mf80Var;
        int i = this.a;
        this.a = i;
        storyProgressComponent.setMediaCount(i);
    }

    public final void a() {
        this.b.setCurrentMediaProgressPercent(0.0f).invalidateComponent();
        ub60 ub60Var = new ub60(16, this);
        uh60 uh60Var = new uh60(28, this);
        be80 be80Var = this.w;
        pzt0 pzt0Var = be80Var.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        sjh sjhVar = uyj.a;
        be80Var.a = tje.N(bvf0.a(mdh.b), null, null, new OrganizationAutoscrollGalleryController$AutoscrollTimer$startTimer$1(10000L, 100L, ub60Var, uh60Var, null), 3);
    }

    @Override // androidx.viewpager2.widget.ViewPager2.a
    public final void onPageScrolled(int i, float f, int i2) {
        int i3 = this.a;
        if (i3 <= 0 || i == i3 || i == this.x) {
            return;
        }
        pzt0 pzt0Var = this.w.a;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        StoryProgressComponent storyProgressComponent = this.b;
        storyProgressComponent.setCurrentMediaProgressPercent(0.0f);
        storyProgressComponent.setCurrentMedia(i).invalidateComponent();
        this.x = i;
        if (this.y) {
            a();
        }
    }
}
