package xsna;

import android.content.Context;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: StickerDarkTheme.kt */
/* loaded from: classes6.dex */
public final class d3l0 implements u2l0 {

    /* compiled from: StickerDarkTheme.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[StickerColorToken.values().length];
            try {
                iArr[StickerColorToken.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StickerColorToken.CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CARD_BACKGROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[StickerColorToken.QUESTION_INPUT_POINTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[StickerColorToken.QUESTION_TITLE_INPUT_PLACEHOLDER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[StickerColorToken.QUESTION_TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CONTENT_INPUT_PLACEHOLDER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CONTENT_INPUT_BACKGROUND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[StickerColorToken.QUESTION_CONTENT_INPUT_TEXT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[StickerColorToken.QUESTION_PRIMARY_BUTTON.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[StickerColorToken.QUESTION_SECONDARY_BUTTON.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[StickerColorToken.QUESTION_SELECTOR.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[StickerColorToken.POLL_PREVIEW_BACKGROUND.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[StickerColorToken.POLL_PREVIEW_CONTENT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[StickerColorToken.POLL_BACKGROUND.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[StickerColorToken.POLL_TITLE.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[StickerColorToken.POLL_SUBTITLE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_BACKGROUND.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_RESULT_BACKGROUND.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_RESULT_TEXT.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[StickerColorToken.POLL_OPTION_TEXT.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_BUTTON_BACKGROUND_FILL.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_BUTTON_BACKGROUND_PRESSED.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_BUTTON_TEXT.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[StickerColorToken.POLL_MULTIVOTE_OPTION_CHECKBOX.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static int b(int i, Context context) {
        return e3m.f(i, bwt0.u(context));
    }

    @Override // xsna.u2l0
    public final int a(Context context, StickerColorToken stickerColorToken) {
        l7s u = bwt0.u(context);
        switch (a.$EnumSwitchMapping$0[stickerColorToken.ordinal()]) {
            case 1:
                return dhr0.t.c(R.attr.vk_ui_avatar_overlay);
            case 2:
                return dhr0.t.c(R.attr.vk_ui_text_contrast);
            case 3:
                return b(R.attr.vk_ui_background_content, context);
            case 4:
                return b(R.attr.vk_ui_icon_accent, context);
            case 5:
                return b(R.attr.vk_ui_text_tertiary, context);
            case 6:
                return b(R.attr.vk_ui_text_primary, context);
            case 7:
                return context.getColor(R.color.vk_gray_500);
            case 8:
                return b(R.attr.vk_ui_field_background, context);
            case 9:
                return b(R.attr.vk_ui_text_primary, context);
            case 10:
                return b(R.attr.vk_ui_background_accent_themed, context);
            case 11:
                return b(R.attr.vk_ui_text_secondary, context);
            case 12:
                return b(R.attr.vk_ui_background_content, context);
            case 13:
                return e3m.f(R.attr.vk_ui_background_contrast_themed, u);
            case 14:
                return u.getColor(R.color.vk_white_alpha40);
            case 15:
                return e3m.f(R.attr.vk_ui_background_content, u);
            case 16:
                return e3m.f(R.attr.vk_ui_text_primary, u);
            case 17:
                return e3m.f(R.attr.vk_ui_text_secondary, u);
            case 18:
                return e3m.f(R.attr.vk_ui_background_secondary, u);
            case 19:
                return l8g.f(0.2f, e3m.f(R.attr.vk_ui_background_accent_themed, u));
            case 20:
                return e3m.f(R.attr.vk_ui_text_subhead, u);
            case 21:
                return e3m.f(R.attr.vk_ui_text_primary, u);
            case 22:
                return e3m.f(R.attr.vk_ui_background_accent_themed, u);
            case 23:
                return e3m.f(R.attr.vk_ui_background_accent_themed, u);
            case 24:
                return e3m.f(R.attr.vk_ui_text_contrast_themed, u);
            case 25:
                return u.getColor(R.color.vk_white);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
