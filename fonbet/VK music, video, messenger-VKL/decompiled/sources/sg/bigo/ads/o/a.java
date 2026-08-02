package sg.bigo.ads.o;

import androidx.annotation.NonNull;
import sg.bigo.ads.ai.o;

/* loaded from: classes9.dex */
public final class a extends b {
    public a(@NonNull o oVar) {
        super(oVar.a("icon_ads.is_display_endpage", 0), oVar.a("icon_ads.ad_component_layout_endpage", 1), oVar.a("icon_ads.cta_color_endpage", 1), oVar.a("icon_ads.icon_color_endpage", 1), oVar.a("icon_ads.icon_num_endpage", 20), oVar.a("icon_ads.ad_component_show_time_endpage", 0), oVar.a("icon_ads.rotate_time_endpage", 2), oVar.a("icon_ads.click_type_endpage", 3), oVar.a("icon_ads.auto_click_endpage", -1), oVar.a("icon_ads.imp_tracking_type_ep", 0), oVar.a("icon_ads.early_tracker_value_ep", 0));
    }

    @Override // sg.bigo.ads.o.b
    public final boolean a() {
        return this.c == 5;
    }

    @Override // sg.bigo.ads.o.b
    public final int b() {
        return 4;
    }
}
