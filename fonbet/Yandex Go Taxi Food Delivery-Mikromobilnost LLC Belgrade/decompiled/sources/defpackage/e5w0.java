package defpackage;

import com.yandex.go.superapp.discovery.map.impl.ui.main.searchbar.views.SuperAppMapSearchbarView;

/* loaded from: classes14.dex */
public final class e5w0 {
    public final int a;
    public final gyt0 b;
    public final float c;
    public final int d;
    public final float e;

    public e5w0(SuperAppMapSearchbarView superAppMapSearchbarView) {
        int r = tje.r(sug0.discovery_map_searchbar_margin_horizontal_expanded, superAppMapSearchbarView.getContext());
        this.a = r;
        this.b = new gyt0(13, superAppMapSearchbarView, this);
        this.c = tje.r(sug0.discovery_map_searchbar_height_expanded, superAppMapSearchbarView.getContext());
        this.d = r;
        this.e = tje.r(sug0.discovery_map_searchbar_corner_radius, superAppMapSearchbarView.getContext());
    }
}
