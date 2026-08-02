package xsna;

import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vkontakte.android.R;

/* compiled from: RestrictionUtils.kt */
/* loaded from: classes5.dex */
public final class edg0 {
    public static final jwx a = new jwx(2, 8);
    public static final jwx b = new jwx(2, 20);
    public static final jwx c = new jwx(2, 30);

    static {
        new jwx(2, 12);
    }

    public static baf0 a(PhotoRestriction photoRestriction, Integer num) {
        if (photoRestriction == null) {
            return null;
        }
        if (photoRestriction.d) {
            return new baf0(dhr0.t.a(R.drawable.vk_icon_hide_outline_56), num != null ? num.intValue() : -1);
        }
        if (num != null) {
            return new baf0(dhr0.t.a(R.drawable.vk_icon_do_not_disturb_outline_56), num.intValue());
        }
        return dhr0.t.b(R.drawable.vk_icon_do_not_disturb_outline_56, R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_primary);
    }
}
