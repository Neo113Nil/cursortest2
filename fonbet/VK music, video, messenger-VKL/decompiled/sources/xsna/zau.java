package xsna;

import android.graphics.Color;
import android.util.SparseIntArray;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.themes.VKTheme;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.im.engine.models.dialogs.c;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;

/* compiled from: GradientBubblesThemeWithCustomColorsProvider.kt */
/* loaded from: classes2.dex */
public final class zau implements plm {
    public final dhr0 a;
    public final List<VKTheme> b;
    public final LinkedHashMap c;
    public final bpn0 d = new bpn0(new gbj(this, 16));

    public zau(dhr0 dhr0Var, List<VKTheme> list) {
        this.a = dhr0Var;
        this.b = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<VKTheme> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        for (VKTheme vKTheme : list2) {
            this.a.getClass();
            lpj lpjVar = new lpj(dhr0.E().getApplicationContext(), vKTheme.c);
            int f = e3m.f(R.attr.vk_ui_background_accent, lpjVar);
            int f2 = e3m.f(R.attr.vk_ui_vkontakte_im_attach_tint, lpjVar);
            int f3 = e3m.f(R.attr.vk_ui_text_primary, lpjVar);
            int f4 = e3m.f(R.attr.vk_ui_text_link, lpjVar);
            int f5 = e3m.f(R.attr.vk_ui_text_secondary, lpjVar);
            int f6 = e3m.f(R.attr.vk_ui_text_primary, lpjVar);
            int f7 = e3m.f(R.attr.vk_ui_text_secondary, lpjVar);
            int f8 = e3m.f(R.attr.vk_ui_text_tertiary, lpjVar);
            int f9 = e3m.f(R.attr.vk_ui_vkontakte_color_im_text_name, lpjVar);
            int f10 = e3m.f(R.attr.vk_ui_vkontakte_color_im_text_name, lpjVar);
            int f11 = e3m.f(R.attr.vk_ui_vkontakte_color_im_forward_line_alpha, lpjVar);
            int f12 = e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming, lpjVar);
            int f13 = e3m.f(R.attr.vk_ui_vkontakte_im_bubble_incoming_highlighted, lpjVar);
            int f14 = e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming_alternate, lpjVar);
            int f15 = e3m.f(R.attr.vk_ui_vkontakte_im_bubble_incoming_highlighted, lpjVar);
            int f16 = e3m.f(R.attr.vk_ui_vkontakte_im_bubble_gift_background, lpjVar);
            int f17 = e3m.f(R.attr.vk_ui_vkontakte_im_bubble_gift_background_highlighted, lpjVar);
            int f18 = e3m.f(R.attr.vk_ui_stroke_accent_themed, lpjVar);
            linkedHashMap.put(vKTheme, new BubbleColors(f, f2, f3, f4, f5, f6, 0, f7, f8, f9, e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_gift_text, lpjVar), e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_gift_text_secondary, lpjVar), f10, f11, f12, f13, e3m.f(R.attr.vk_ui_background_accent, lpjVar), f16, f17, f18, f14, f15, e3m.f(R.attr.vk_ui_separator_secondary, lpjVar), e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming_expiring, lpjVar), e3m.f(R.attr.vk_ui_vkontakte_color_im_bubble_incoming_expiring_active, lpjVar), e3m.f(R.attr.im_bubble_sending_status_tint_color, lpjVar), e3m.f(R.attr.vk_ui_vkontakte_im_bubble_button_background, lpjVar), e3m.f(R.attr.vk_ui_vkontakte_im_bubble_outgoing_alternate, lpjVar), null, 0, 805306432, null));
            arrayList.add(s3q0.a);
        }
        this.c = linkedHashMap;
    }

    @Override // xsna.plm
    public final Map a(npo0 npo0Var, npo0 npo0Var2) {
        this.a.getClass();
        DialogThemeImpl g = g(npo0Var, dhr0.z());
        DialogThemeImpl g2 = g(npo0Var2, dhr0.u());
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put(dhr0.z(), g);
        mapBuilder.put(dhr0.u(), g2);
        ehr0 ehr0Var = dhr0.e;
        mapBuilder.put(ehr0Var.a, g);
        mapBuilder.put(ehr0Var.b, g2);
        return mapBuilder.h();
    }

    @Override // xsna.plm
    public final Pair<com.vk.im.engine.models.dialogs.c, DialogTheme> b(String str, npo0 npo0Var, npo0 npo0Var2) {
        CopyOnWriteArraySet copyOnWriteArraySet = com.vk.im.engine.models.dialogs.c.b;
        com.vk.im.engine.models.dialogs.c a = c.a.a(str);
        return new Pair<>(a, new DialogTheme(a, null, a(npo0Var, npo0Var2), null, 10, null));
    }

    @Override // xsna.plm
    public final Map<com.vk.im.engine.models.dialogs.c, DialogTheme> c() {
        return jgp.b;
    }

    @Override // xsna.plm
    public final Pair<com.vk.im.engine.models.dialogs.c, Map<VKTheme, DialogThemeImpl>> d() {
        return null;
    }

    public final List<BubbleColors> e(VKTheme vKTheme, boolean z, npo0 npo0Var) {
        String str = npo0Var.a;
        dhr0 dhr0Var = this.a;
        if (z) {
            int parseColor = Color.parseColor(str);
            dhr0Var.getClass();
            int f = e3m.f(R.attr.vk_ui_accent_purple, dhr0.E());
            Object obj = this.c.get(vKTheme);
            if (obj == null) {
                throw new IllegalArgumentException(("Default incoming bubble colors are not specified for " + vKTheme).toString());
            }
            BubbleColors bubbleColors = (BubbleColors) obj;
            int i = vKTheme.b ? parseColor : bubbleColors.u;
            Serializer.c<BubbleColors> cVar = BubbleColors.CREATOR;
            return Collections.singletonList(new BubbleColors(parseColor, parseColor, bubbleColors.d, parseColor, bubbleColors.f, bubbleColors.g, bubbleColors.h, bubbleColors.i, bubbleColors.j, parseColor, bubbleColors.l, bubbleColors.m, parseColor, bubbleColors.o, bubbleColors.p, bubbleColors.q, parseColor, bubbleColors.s, bubbleColors.t, i, bubbleColors.v, bubbleColors.w, bubbleColors.x, bubbleColors.y, bubbleColors.z, bubbleColors.A, bubbleColors.B, bubbleColors.C, bubbleColors.D, f));
        }
        String str2 = npo0Var.d;
        int parseColor2 = str2 != null ? Color.parseColor(str2) : f();
        String str3 = npo0Var.e;
        int parseColor3 = str3 != null ? Color.parseColor(str3) : f();
        String str4 = npo0Var.f;
        int parseColor4 = str4 != null ? Color.parseColor(str4) : f();
        int parseColor5 = Color.parseColor(str);
        List<String> list = npo0Var.g;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
        }
        int[] N0 = j5g.N0(arrayList);
        dhr0Var.getClass();
        int color = dhr0.E().getColor(R.color.vk_black_alpha12);
        return Collections.singletonList(new BubbleColors(parseColor5, parseColor2, parseColor2, parseColor2, parseColor3, parseColor2, parseColor3, parseColor3, parseColor3, parseColor2, parseColor3, parseColor3, parseColor2, parseColor4, 0, color, parseColor2, 0, color, parseColor2, 0, color, parseColor3, 0, color, parseColor5, e3m.f(R.attr.vk_ui_background_contrast_secondary_alpha, dhr0.E()), parseColor2, N0, e3m.f(R.attr.vk_ui_accent_purple, dhr0.E())));
    }

    public final int f() {
        return ((Number) this.d.getValue()).intValue();
    }

    public final DialogThemeImpl g(npo0 npo0Var, VKTheme vKTheme) {
        String str = npo0Var.d;
        int parseColor = str != null ? Color.parseColor(str) : f();
        int parseColor2 = Color.parseColor(npo0Var.b);
        int parseColor3 = Color.parseColor(npo0Var.c);
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(R.attr.vk_legacy_accent, parseColor3);
        sparseIntArray.put(R.attr.vk_ui_stroke_accent, parseColor3);
        sparseIntArray.put(R.attr.vk_ui_text_accent, parseColor3);
        sparseIntArray.put(R.attr.vk_ui_background_accent, parseColor3);
        sparseIntArray.put(R.attr.vk_ui_icon_accent, parseColor3);
        if (vKTheme.b) {
            sparseIntArray.put(R.attr.toolbar_title_textColor, parseColor2);
            sparseIntArray.put(R.attr.toolbar_title_textColor, parseColor2);
        }
        sparseIntArray.put(R.attr.vk_legacy_accent_alpha10, l8g.f(0.1f, parseColor3));
        sparseIntArray.put(R.attr.vk_legacy_header_tint, parseColor2);
        sparseIntArray.put(R.attr.vk_legacy_header_tint, parseColor2);
        sparseIntArray.put(R.attr.vk_legacy_header_text, parseColor2);
        sparseIntArray.put(R.attr.vk_legacy_header_text, parseColor2);
        sparseIntArray.put(R.attr.vk_legacy_text_primary, parseColor);
        sparseIntArray.put(R.attr.vk_ui_text_primary, parseColor);
        sparseIntArray.put(R.attr.vk_legacy_text_link, parseColor2);
        sparseIntArray.put(R.attr.vk_ui_text_link, parseColor2);
        sparseIntArray.put(R.attr.vk_legacy_im_text_name, parseColor2);
        sparseIntArray.put(R.attr.vk_ui_vkontakte_color_im_text_name, parseColor2);
        sparseIntArray.put(R.attr.vk_legacy_im_reply_separator, parseColor2);
        sparseIntArray.put(R.attr.vk_ui_vkontakte_im_reply_separator, parseColor2);
        sparseIntArray.put(R.attr.vk_legacy_icon_outline_secondary, parseColor3);
        sparseIntArray.put(R.attr.vk_ui_icon_secondary, parseColor3);
        sparseIntArray.put(R.attr.vk_legacy_attach_picker_tab_active_background, parseColor3);
        sparseIntArray.put(R.attr.vk_legacy_attach_picker_tab_active_text, parseColor3);
        sparseIntArray.put(R.attr.im_dropdown_icon_color, parseColor2);
        sparseIntArray.put(R.attr.im_dropdown_arrow_tint, parseColor2);
        return new DialogThemeImpl(sparseIntArray, e(vKTheme, true, npo0Var), e(vKTheme, false, npo0Var));
    }
}
