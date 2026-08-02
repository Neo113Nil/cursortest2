package xsna;

import android.util.SparseArray;
import com.vk.core.ui.themes.ThemeKeyAttributes;
import com.vk.im.ui.themes.AccentColor;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: AppTheme.kt */
/* loaded from: classes2.dex */
public final class ba3 {
    public static final LinkedHashMap a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppTheme.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ATTACH_PICKER_HEADER_TEXTVIEW;
        public static final a IMAGE_QR_SCANNER;
        public static final a MEDIUM_BUTTON;
        public static final a POSTING_ATTACH_HEADER_BUTTON;
        public static final a PRIMARY_BUTTON;
        public static final a SECONDARY_BUTTON;
        public static final a TERTIARY_BUTTON;
        public static final a VKIM_BOTTOM_BUTTON;
        public static final a VKUI_BUTTON_TERTIARY_ROUNDED;
        public static final a VOIP_MEDIA_SETTING_BUTTON;
        private final int key;

        static {
            a aVar = new a("PRIMARY_BUTTON", 0, 2147483646);
            PRIMARY_BUTTON = aVar;
            a aVar2 = new a("SECONDARY_BUTTON", 1, 2147483645);
            SECONDARY_BUTTON = aVar2;
            a aVar3 = new a("MEDIUM_BUTTON", 2, 2147483644);
            MEDIUM_BUTTON = aVar3;
            a aVar4 = new a("TERTIARY_BUTTON", 3, 2147483643);
            TERTIARY_BUTTON = aVar4;
            a aVar5 = new a("VOIP_MEDIA_SETTING_BUTTON", 4, 2147483642);
            VOIP_MEDIA_SETTING_BUTTON = aVar5;
            a aVar6 = new a("IMAGE_QR_SCANNER", 5, 2147483641);
            IMAGE_QR_SCANNER = aVar6;
            a aVar7 = new a("VKIM_BOTTOM_BUTTON", 6, 2147483640);
            VKIM_BOTTOM_BUTTON = aVar7;
            a aVar8 = new a("POSTING_ATTACH_HEADER_BUTTON", 7, 2147483639);
            POSTING_ATTACH_HEADER_BUTTON = aVar8;
            a aVar9 = new a("ATTACH_PICKER_HEADER_TEXTVIEW", 8, 2147483638);
            ATTACH_PICKER_HEADER_TEXTVIEW = aVar9;
            a aVar10 = new a("VKUI_BUTTON_TERTIARY_ROUNDED", 9, 2147483637);
            VKUI_BUTTON_TERTIARY_ROUNDED = aVar10;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.key = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.key;
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer valueOf = Integer.valueOf(R.attr.vk_legacy_accent);
        linkedHashMap.put(valueOf, null);
        linkedHashMap.put(valueOf, null);
        Integer valueOf2 = Integer.valueOf(R.attr.vk_ui_text_accent_themed);
        linkedHashMap.put(valueOf2, null);
        Integer valueOf3 = Integer.valueOf(R.attr.vk_ui_icon_accent_themed);
        linkedHashMap.put(valueOf3, null);
        Integer valueOf4 = Integer.valueOf(R.attr.vk_ui_background_accent_themed);
        linkedHashMap.put(valueOf4, null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_stroke_accent_themed), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_accent_purple), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_red), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_yellow), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_orange), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_green), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_cyan), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_blue), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_violet), null);
        linkedHashMap.put(Integer.valueOf(R.attr.im_icon_grey), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_im_text_name), null);
        Integer valueOf5 = Integer.valueOf(R.attr.vk_legacy_header_tint);
        linkedHashMap.put(valueOf5, null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_vkontakte_color_im_text_name), null);
        linkedHashMap.put(valueOf2, null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_counter_primary_background), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_action_sheet_action_foreground), null);
        Integer valueOf6 = Integer.valueOf(R.attr.vk_legacy_text_link);
        linkedHashMap.put(valueOf6, null);
        linkedHashMap.put(valueOf6, null);
        linkedHashMap.put(valueOf4, null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_action_sheet_text), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_text_link), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vkim_iconTint), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_header_tab_active_indicator), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_activity_indicator_tint), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_button_tertiary_foreground), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_header_tab_active_text), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_background_accent), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_icon_tertiary), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_text_accent), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_ui_text_primary), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_connect_accent), null);
        linkedHashMap.put(valueOf5, null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_header_tint_alternate), null);
        linkedHashMap.put(valueOf2, null);
        linkedHashMap.put(valueOf3, null);
        linkedHashMap.put(Integer.valueOf(R.attr.colorAccent), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_attach_picker_tab_active_background), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_attach_picker_tab_active_text), null);
        linkedHashMap.put(Integer.valueOf(R.attr.vk_legacy_button_outline_foreground), null);
        linkedHashMap.put(valueOf4, null);
        linkedHashMap.put(valueOf2, null);
        linkedHashMap.put(valueOf2, null);
        a = linkedHashMap;
        AccentColor a2 = a();
        if (a2 == null || a2 == AccentColor.NOT_SET) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((Map.Entry) it.next()).setValue(null);
            }
        } else {
            int h = a2.h();
            Iterator it2 = linkedHashMap.entrySet().iterator();
            while (it2.hasNext()) {
                ((Map.Entry) it2.next()).setValue(Integer.valueOf(h));
            }
        }
        SparseArray sparseArray = new SparseArray();
        sparseArray.append(R.style.VkLegacyButton_Tertiary_Rounded, new int[]{a.VKUI_BUTTON_TERTIARY_ROUNDED.h(), 0});
        sparseArray.append(R.style.PostingAttachHeaderButton, new int[]{a.POSTING_ATTACH_HEADER_BUTTON.h(), 0});
        sparseArray.append(R.style.AttachPicker_Header_TextView, new int[]{a.ATTACH_PICKER_HEADER_TEXTVIEW.h(), 0});
        a aVar = a.PRIMARY_BUTTON;
        sparseArray.append(R.style.primary_button, new int[]{aVar.h(), 0});
        a aVar2 = a.SECONDARY_BUTTON;
        sparseArray.append(R.style.secondary_button, new int[]{aVar2.h(), 0});
        sparseArray.append(R.style.VkIm_BottomButton, new int[]{a.VKIM_BOTTOM_BUTTON.h(), 0});
        sparseArray.append(R.style.VoipMediaSettingButton, new int[]{a.VOIP_MEDIA_SETTING_BUTTON.h(), 0});
        sparseArray.append(R.style.VkLegacyTypography_Text_Medium, new int[]{a.MEDIUM_BUTTON.h(), 0});
        sparseArray.append(R.style.VkLegacyButton_Tertiary, new int[]{a.TERTIARY_BUTTON.h(), 0});
        sparseArray.append(R.style.ImageQrScanner, new int[]{a.IMAGE_QR_SCANNER.h(), 0});
        ThemeKeyAttributes themeKeyAttributes = ThemeKeyAttributes.TEXT_COLOR_STATE_LIST;
        int h2 = themeKeyAttributes.h();
        ThemeKeyAttributes themeKeyAttributes2 = ThemeKeyAttributes.BACKGROUND_RES;
        sparseArray.append(R.style.VkLegacyButton_Primary, new int[]{h2, R.color.vk_primary_button_text, themeKeyAttributes2.h(), R.drawable.vkui_bg_button_primary, aVar.h(), 0});
        sparseArray.append(R.style.VkLegacyButton_Primary_Big, new int[]{themeKeyAttributes.h(), R.color.vk_primary_button_text, themeKeyAttributes2.h(), R.drawable.vkui_bg_button_primary, aVar.h(), 0});
        sparseArray.append(R.style.VkLegacyButton_Secondary, new int[]{themeKeyAttributes.h(), R.color.vk_secondary_button_text, themeKeyAttributes2.h(), R.drawable.vkui_bg_button_secondary, aVar2.h(), 0});
        sparseArray.append(R.style.VkLegacyButton_Secondary_Big, new int[]{aVar2.h(), 0});
        dhr0 dhr0Var = dhr0.a;
        itm0 itm0Var = new itm0(sparseArray);
        dhr0Var.getClass();
        dhr0.D().a.add(itm0Var);
    }

    public static AccentColor a() {
        zdw zdwVar = i7o0.b;
        if (zdwVar == null) {
            zdwVar = null;
        }
        zdwVar.u.getClass();
        String string = cew.h().getString("pref_app_accent_color_name", null);
        if (string != null) {
            return AccentColor.valueOf(string);
        }
        return null;
    }

    public static boolean b() {
        return (a() == null || a() == AccentColor.NOT_SET) ? false : true;
    }
}
