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

/* compiled from: StandardThemeProvider.kt */
/* loaded from: classes2.dex */
public final class jpk0 implements plm {
    public final List<VKTheme> a;
    public final bpn0 b = new bpn0(new qkd0(this, 10));

    public jpk0(dhr0 dhr0Var, List<VKTheme> list) {
        this.a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static BubbleColors e(dhr0.f fVar, boolean z, boolean z2) {
        char c;
        int l;
        int f;
        int i;
        int[] iArr;
        boolean z3 = z || z2;
        int f2 = e3m.f(R.attr.vk_legacy_accent, fVar);
        int f3 = z3 ? e3m.f(R.attr.vk_legacy_im_attach_tint, fVar) : -1;
        int f4 = z3 ? e3m.f(R.attr.vk_legacy_text_primary, fVar) : -1;
        int f5 = z3 ? e3m.f(R.attr.vk_legacy_text_link, fVar) : -1;
        int f6 = z3 ? e3m.f(R.attr.vk_legacy_text_placeholder, fVar) : -1;
        int f7 = z3 ? e3m.f(R.attr.vk_legacy_text_primary, fVar) : -1;
        int f8 = z3 ? e3m.f(R.attr.vk_legacy_text_secondary, fVar) : -1;
        int f9 = z3 ? e3m.f(R.attr.vk_legacy_text_tertiary, fVar) : -1;
        int f10 = z3 ? e3m.f(R.attr.vk_legacy_im_text_name, fVar) : -1;
        if (z) {
            c = 1;
            l = n8g.l(e3m.f(R.attr.vk_legacy_text_primary, fVar), 102);
        } else {
            l = e3m.f(R.attr.vk_legacy_text_name, fVar);
            c = 1;
        }
        int f11 = z3 ? e3m.f(R.attr.vk_legacy_im_text_name, fVar) : -1;
        int f12 = e3m.f(R.attr.vk_legacy_im_forward_line_tint, fVar);
        int f13 = z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_mable_outgoing, fVar);
        int f14 = z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming_highlighted, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_mable_outgoing_highlighted, fVar);
        int f15 = z ? e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_incoming, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_mable_wallpaper_outgoing, fVar);
        int f16 = z ? e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_incoming_highlighted, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_mable_wallpaper_outgoing_highlighted, fVar);
        int f17 = e3m.f(R.attr.vk_legacy_im_bubble_gift_background, fVar);
        int f18 = e3m.f(R.attr.vk_legacy_im_bubble_gift_background_highlighted, fVar);
        int f19 = z3 ? e3m.f(R.attr.vk_legacy_button_outline_border, fVar) : -1;
        int f20 = z3 ? e3m.f(R.attr.vk_legacy_accent, fVar) : -1;
        int f21 = e3m.f(R.attr.vk_legacy_separator_alternate, fVar);
        int f22 = z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming_expiring, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_outgoing_expiring, fVar);
        int f23 = z ? e3m.f(R.attr.vk_legacy_im_bubble_incoming_expiring_highlighted, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_mable_outgoing_expiring_highlighted, fVar);
        int f24 = z ? e3m.f(R.attr.im_bubble_sending_status_tint_color, fVar) : -1;
        int f25 = z ? e3m.f(R.attr.vk_legacy_im_bubble_button_background, fVar) : e3m.f(R.attr.vk_legacy_im_bubble_button_outgoing_background, fVar);
        if (z) {
            f = e3m.f(R.attr.vk_legacy_im_bubble_wallpaper_button_background, fVar);
        } else {
            if (!z3) {
                i = -1;
                int f26 = e3m.f(R.attr.vk_legacy_im_bubble_gift_text, fVar);
                int f27 = e3m.f(R.attr.vk_legacy_im_bubble_gift_text_secondary, fVar);
                if (z) {
                    int[] iArr2 = new int[2];
                    iArr2[0] = e3m.f(R.attr.vk_legacy_im_bubble_mable_outgoing, fVar);
                    iArr2[c] = e3m.f(R.attr.vk_legacy_im_bubble_mable_outgoing, fVar);
                    iArr = iArr2;
                } else {
                    int[] iArr3 = new int[2];
                    iArr3[0] = e3m.f(R.attr.vk_legacy_im_bubble_incoming, fVar);
                    iArr3[c] = e3m.f(R.attr.vk_legacy_im_bubble_incoming, fVar);
                    iArr = iArr3;
                }
                return new BubbleColors(f2, f3, f4, f5, f6, f7, l, f8, f9, f10, f26, f27, f11, f12, f13, f14, f20, f17, f18, f19, f15, f16, f21, f22, f23, f24, f25, i, iArr, e3m.f(R.attr.vk_ui_accent_purple, fVar));
            }
            f = e3m.f(R.attr.vk_legacy_im_bubble_button_outgoing_background, fVar);
        }
        i = f;
        int f262 = e3m.f(R.attr.vk_legacy_im_bubble_gift_text, fVar);
        int f272 = e3m.f(R.attr.vk_legacy_im_bubble_gift_text_secondary, fVar);
        if (z) {
        }
        return new BubbleColors(f2, f3, f4, f5, f6, f7, l, f8, f9, f10, f262, f272, f11, f12, f13, f14, f20, f17, f18, f19, f15, f16, f21, f22, f23, f24, f25, i, iArr, e3m.f(R.attr.vk_ui_accent_purple, fVar));
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
        return (Map) this.b.getValue();
    }

    @Override // xsna.plm
    public final Pair<com.vk.im.engine.models.dialogs.c, Map<VKTheme, DialogThemeImpl>> d() {
        return new Pair<>(c.g.c, f().d);
    }

    public final DialogTheme f() {
        c.g gVar = c.g.c;
        List<VKTheme> list = this.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (VKTheme vKTheme : list) {
            arrayList.add(new Pair(vKTheme, new bpn0(new ag1(this, dhr0.q0(vKTheme.c), vKTheme))));
        }
        return new DialogTheme(gVar, null, new dwy(pn00.s(arrayList)), null, 10, null);
    }
}
