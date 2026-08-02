package defpackage;

import com.yandex.go.places.searchbar.impl.ui.PlacesSearchbarContainerView;

/* loaded from: classes13.dex */
public final class dfc0 {
    public final PlacesSearchbarContainerView a;
    public final int b;
    public final ffc0 c;
    public final ffc0 d;
    public final float e;
    public final int f;
    public final float g;
    public final float h;

    public dfc0(PlacesSearchbarContainerView placesSearchbarContainerView, boolean z) {
        this.a = placesSearchbarContainerView;
        int r = tje.r(gug0.places_searchbar_margin_horizontal_expanded, placesSearchbarContainerView.getContext());
        this.b = r;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: cfc0
            public final /* synthetic */ dfc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                dfc0 dfc0Var = this.b;
                switch (i2) {
                    case 0:
                        PlacesSearchbarContainerView placesSearchbarContainerView2 = dfc0Var.a;
                        int measuredWidth = placesSearchbarContainerView2.getMeasuredWidth();
                        if (measuredWidth <= 0) {
                            measuredWidth = tje.t(placesSearchbarContainerView2.getContext()).widthPixels;
                        }
                        return Float.valueOf(measuredWidth - (dfc0Var.b * 2));
                    default:
                        return Float.valueOf(tje.r(gug0.places_searchbar_size_collapsed, dfc0Var.a.getContext()));
                }
            }
        };
        float r2 = z ? tje.r(gug0.places_searchbar_height_expanded, placesSearchbarContainerView.getContext()) : 0.0f;
        float r3 = tje.r(gug0.places_searchbar_corner_radius, placesSearchbarContainerView.getContext());
        float r4 = tje.r(gug0.places_searchbar_shadow_y_expanded, placesSearchbarContainerView.getContext());
        float r5 = tje.r(gug0.places_searchbar_shadow_radius_expanded, placesSearchbarContainerView.getContext());
        this.c = new ffc0(slsVar, r2, r, r3, r4, r5, 0);
        final int i2 = 1;
        sls slsVar2 = new sls(this) { // from class: cfc0
            public final /* synthetic */ dfc0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                dfc0 dfc0Var = this.b;
                switch (i22) {
                    case 0:
                        PlacesSearchbarContainerView placesSearchbarContainerView2 = dfc0Var.a;
                        int measuredWidth = placesSearchbarContainerView2.getMeasuredWidth();
                        if (measuredWidth <= 0) {
                            measuredWidth = tje.t(placesSearchbarContainerView2.getContext()).widthPixels;
                        }
                        return Float.valueOf(measuredWidth - (dfc0Var.b * 2));
                    default:
                        return Float.valueOf(tje.r(gug0.places_searchbar_size_collapsed, dfc0Var.a.getContext()));
                }
            }
        };
        float r6 = z ? tje.r(gug0.places_searchbar_size_collapsed, placesSearchbarContainerView.getContext()) : 0.0f;
        int r7 = tje.r(gug0.places_searchbar_margin_horizontal_collapsed, placesSearchbarContainerView.getContext());
        float r8 = tje.r(gug0.places_searchbar_corner_radius, placesSearchbarContainerView.getContext());
        float r9 = tje.r(gug0.places_searchbar_shadow_y_collapsed, placesSearchbarContainerView.getContext());
        float r10 = tje.r(gug0.places_searchbar_shadow_radius_collapsed, placesSearchbarContainerView.getContext());
        this.d = new ffc0(slsVar2, r6, r7, r8, r9, r10, 0);
        this.e = r2 - r6;
        this.f = r - r7;
        this.g = r4 - r9;
        this.h = r5 - r10;
    }
}
