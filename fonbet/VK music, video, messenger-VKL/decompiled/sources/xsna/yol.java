package xsna;

import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.im.engine.models.dialogs.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import xsna.dhr0;

/* compiled from: DefaultThemeProvider.kt */
/* loaded from: classes.dex */
public final class yol implements plm {
    public final List<VKTheme> a;
    public final bpn0 b = new bpn0(new gia(this, 1));
    public final bpn0 c = new bpn0(new hia(this, 2));

    public yol(dhr0 dhr0Var, List<VKTheme> list) {
        this.a = list;
    }

    public static BubbleColors e(dhr0.f fVar, boolean z) {
        int f = e3m.f(R.attr.vk_legacy_accent, fVar);
        int f2 = e3m.f(R.attr.vk_legacy_im_attach_tint, fVar);
        int f3 = e3m.f(R.attr.vk_legacy_text_primary, fVar);
        int f4 = e3m.f(R.attr.vk_legacy_text_link, fVar);
        int f5 = e3m.f(R.attr.vk_legacy_text_placeholder, fVar);
        int f6 = e3m.f(R.attr.vk_legacy_text_primary, fVar);
        int f7 = e3m.f(R.attr.vk_legacy_text_secondary, fVar);
        int f8 = e3m.f(R.attr.vk_legacy_text_tertiary, fVar);
        int f9 = e3m.f(R.attr.vk_legacy_im_text_name, fVar);
        int f10 = !z ? e3m.f(R.attr.vk_legacy_text_name, fVar) : n8g.l(e3m.f(R.attr.vk_legacy_text_primary, fVar), 102);
        int f11 = e3m.f(R.attr.vk_legacy_im_text_name, fVar);
        int f12 = e3m.f(R.attr.vk_legacy_im_forward_line_tint, fVar);
        int f13 = z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_outgoing, fVar);
        int f14 = z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming_highlighted, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_outgoing_highlighted, fVar);
        int f15 = z ? e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_incoming, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_outgoing, fVar);
        int f16 = z ? e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_incoming_highlighted, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_outgoing_highlighted, fVar);
        int f17 = e3m.f(R.attr.vk_legacy_im_bubble_gift_background, fVar);
        int f18 = e3m.f(R.attr.vk_legacy_im_bubble_gift_background_highlighted, fVar);
        int f19 = e3m.f(R.attr.vk_legacy_button_outline_border, fVar);
        return new BubbleColors(f, f2, f3, f4, f5, f6, f10, f7, f8, f9, e3m.f(R.attr.vk_legacy_im_bubble_gift_text, fVar), e3m.f(R.attr.vk_legacy_im_bubble_gift_text_secondary, fVar), f11, f12, f13, f14, e3m.f(R.attr.vk_legacy_accent, fVar), f17, f18, f19, f15, f16, e3m.f(R.attr.vk_legacy_separator_alternate, fVar), z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming_expiring, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_outgoing_expiring, fVar), z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming_expiring_highlighted, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_outgoing_expiring_highlighted, fVar), e3m.f(R.attr.im_bubble_sending_status_tint_color, fVar), z ? e3m.f(R.attr.vk_legacy_im_bubble_button_background, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_button_outgoing_background, fVar), z ? e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_button_background, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_button_outgoing_background, fVar), z ? new int[]{e3m.f(R.attr.vk_legacy_im_bubble_incoming, fVar), e3m.f(R.attr.vk_legacy_im_bubble_incoming, fVar)} : new int[]{e3m.f(R.attr.vk_legacy_im_bubble_outgoing, fVar), e3m.f(R.attr.vk_legacy_im_bubble_outgoing, fVar)}, e3m.f(R.attr.vk_ui_accent_purple, fVar));
    }

    @Override // xsna.plm
    public final Map a(npo0 npo0Var, npo0 npo0Var2) {
        return null;
    }

    @Override // xsna.plm
    public final Pair<com.vk.im.engine.models.dialogs.c, DialogTheme> b(String str, npo0 npo0Var, npo0 npo0Var2) {
        return null;
    }

    @Override // xsna.plm
    public final Map<com.vk.im.engine.models.dialogs.c, DialogTheme> c() {
        return (Map) this.c.getValue();
    }

    @Override // xsna.plm
    public final Pair<com.vk.im.engine.models.dialogs.c, Map<VKTheme, DialogThemeImpl>> d() {
        return new Pair<>(c.C1124c.c, f().d);
    }

    public final DialogTheme f() {
        c.C1124c c1124c = c.C1124c.c;
        List<VKTheme> list = this.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (VKTheme vKTheme : list) {
            arrayList.add(new Pair(vKTheme, new bpn0(new m66(this, dhr0.q0(vKTheme.c)))));
        }
        return new DialogTheme(c1124c, null, new dwy(pn00.s(arrayList)), null, 10, null);
    }
}
