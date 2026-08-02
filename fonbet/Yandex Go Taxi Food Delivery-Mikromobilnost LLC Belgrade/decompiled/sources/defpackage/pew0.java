package defpackage;

import com.yandex.go.superapp.searchbar.impl.ui.SuperappSearchbarContainerView;

/* loaded from: classes14.dex */
public final class pew0 {
    public final int a;
    public final ffc0 b;
    public final ffc0 c;
    public final float d;
    public final int e;
    public final float f;
    public final float g;

    public pew0(SuperappSearchbarContainerView superappSearchbarContainerView) {
        int r = tje.r(qug0.superapp_searchbar_margin_horizontal_expanded, superappSearchbarContainerView.getContext());
        this.a = r;
        gyt0 gyt0Var = new gyt0(18, superappSearchbarContainerView, this);
        float r2 = tje.r(qug0.superapp_searchbar_height_expanded, superappSearchbarContainerView.getContext());
        float r3 = tje.r(qug0.superapp_searchbar_corner_radius, superappSearchbarContainerView.getContext());
        float r4 = tje.r(qug0.superapp_searchbar_shadow_y_expanded, superappSearchbarContainerView.getContext());
        float r5 = tje.r(qug0.superapp_searchbar_shadow_radius_expanded, superappSearchbarContainerView.getContext());
        this.b = new ffc0(gyt0Var, r2, r, r3, r4, r5, 1);
        oew0 oew0Var = new oew0(0, superappSearchbarContainerView);
        float r6 = tje.r(qug0.superapp_searchbar_size_collapsed, superappSearchbarContainerView.getContext());
        int r7 = tje.r(qug0.superapp_searchbar_margin_horizontal_collapsed, superappSearchbarContainerView.getContext());
        float r8 = tje.r(qug0.superapp_searchbar_corner_radius, superappSearchbarContainerView.getContext());
        float r9 = tje.r(qug0.superapp_searchbar_shadow_y_collapsed, superappSearchbarContainerView.getContext());
        float r10 = tje.r(qug0.superapp_searchbar_shadow_radius_collapsed, superappSearchbarContainerView.getContext());
        this.c = new ffc0(oew0Var, r6, r7, r8, r9, r10, 1);
        this.d = r2 - r6;
        this.e = r - r7;
        this.f = r4 - r9;
        this.g = r5 - r10;
    }
}
