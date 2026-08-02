package xsna;

import android.content.Context;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;

/* compiled from: StickerCommonStyleValuesMapper.kt */
/* loaded from: classes6.dex */
public final class b3l0 {

    /* compiled from: StickerCommonStyleValuesMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerCommonStyle.values().length];
            try {
                iArr[StickerCommonStyle.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerCommonStyle.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerCommonStyle.ACCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerCommonStyle.ACCENT_BACKGROUND.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StickerCommonStyle.ACCENT_CONTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StickerCommonStyle.DARK_WITHOUT_BACKGROUND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StickerCommonStyle.LIGHT_WITHOUT_BACKGROUND.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static a3l0 a() {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return new a3l0(context, R.dimen.sticker_icon_margin_start, R.dimen.sticker_icon_margin_end, R.dimen.sticker_icon_margin_vertical, R.dimen.sticker_icon_size, R.dimen.sticker_icon_vector_drawable_size, R.font.vk_sans_display_demibold, R.dimen.sticker_text_size_max, R.dimen.sticker_text_size_min, R.dimen.sticker_text_margin_top, R.dimen.sticker_text_margin_bottom, R.dimen.sticker_text_margin_end, R.dimen.sticker_text_letter_spacing, R.font.vk_roboto_regular, R.dimen.sticker_meta_text_size, R.dimen.sticker_meta_text_margin_top, R.dimen.sticker_meta_text_margin_from_text, R.dimen.sticker_meta_text_letter_spacing, R.dimen.sticker_bg_corner_radius);
    }

    public static a3l0 b(StickerCommonStyle stickerCommonStyle, boolean z) {
        switch (a.$EnumSwitchMapping$0[stickerCommonStyle.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (!z) {
                    return a();
                }
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return new a3l0(context, R.dimen.sticker_icon_margin_start_redesign, R.dimen.sticker_icon_margin_end_redesign, R.dimen.sticker_icon_margin_vertical_redesign, R.dimen.sticker_icon_size, R.dimen.sticker_icon_vector_drawable_size, R.font.vk_sans_display_regular, R.dimen.sticker_text_size_max_redesign, R.dimen.sticker_text_size_min_redesign, R.dimen.sticker_text_margin_top_redesign, R.dimen.sticker_text_margin_bottom_redesign, R.dimen.sticker_text_margin_end_redesign, R.dimen.sticker_text_letter_spacing_redesign, R.font.vk_roboto_regular, R.dimen.sticker_meta_text_size, R.dimen.sticker_meta_text_margin_top, R.dimen.sticker_meta_text_margin_from_text, R.dimen.sticker_meta_text_letter_spacing, R.dimen.sticker_bg_corner_radius_redesign);
            default:
                return new a3l0(a().a, R.dimen.sticker_icon_margin_start, R.dimen.sticker_icon_margin_end, R.dimen.sticker_geo_unique_icon_margin_top, R.dimen.sticker_icon_size, R.dimen.sticker_icon_vector_drawable_size, R.font.vk_roboto_regular, R.dimen.sticker_geo_unique_text_size_max, R.dimen.sticker_text_size_min, R.dimen.sticker_geo_unique_text_margin_top, R.dimen.sticker_text_margin_bottom, R.dimen.sticker_text_margin_end, R.dimen.sticker_geo_unique_text_letter_spacing, R.font.vk_roboto_regular, R.dimen.sticker_meta_text_size, R.dimen.sticker_meta_text_margin_top, R.dimen.sticker_meta_text_margin_from_text, R.dimen.sticker_meta_text_letter_spacing, R.dimen.sticker_bg_corner_radius);
        }
    }
}
