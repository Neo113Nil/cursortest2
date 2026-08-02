package sg.bigo.ads.o;

import androidx.annotation.NonNull;
import sg.bigo.ads.ai.o;

/* loaded from: classes9.dex */
public final class c extends b {
    protected final boolean a;

    public c(@NonNull o oVar, boolean z) {
        super(oVar.a("icon_ads.is_display_layer", 0), oVar.a("icon_ads.ad_component_layout_layer", 1), oVar.a("icon_ads.cta_color_layer", 1), oVar.a("icon_ads.icon_color_layer", 1), oVar.a("icon_ads.icon_num_layer", 20), oVar.a("icon_ads.ad_component_show_time_layer", 0), oVar.a("icon_ads.rotate_time_layer", 2), oVar.a("icon_ads.click_type_layer", 3), oVar.a("icon_ads.auto_click_layer", -1), oVar.a("icon_ads.imp_tracking_type_lyr", 0), oVar.a("icon_ads.early_tracker_value_lyr", 0));
        this.a = z;
    }

    @Override // sg.bigo.ads.o.b
    public final boolean a() {
        return this.c == 7;
    }

    @Override // sg.bigo.ads.o.b
    public final int b() {
        return 10;
    }

    @Override // sg.bigo.ads.o.b
    public final int e() {
        if (!this.a) {
            return super.e();
        }
        int i = this.c;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return i;
            default:
                return 1;
        }
    }

    @Override // sg.bigo.ads.o.b
    public final int f() {
        int i = this.c;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return i;
            default:
                return 1;
        }
    }
}
