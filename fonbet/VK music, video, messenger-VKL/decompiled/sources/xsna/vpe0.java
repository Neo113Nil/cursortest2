package xsna;

import android.content.Context;
import com.vk.stickers.api.models.question.StoryQuestionInfo;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: QuestionStickerStyle.kt */
/* loaded from: classes6.dex */
public interface vpe0 {

    /* compiled from: QuestionStickerStyle.kt */
    public static final class a implements vpe0 {
        public static final a a = new a();
        public static final int b = R.string.color_picker_color_name_blue;
        public static final StoryQuestionInfo.Style c = StoryQuestionInfo.Style.BLUE;
        public static final StoryQuestionInfo.a d = new StoryQuestionInfo.a(-1, e43.a.getColor(R.color.vk_azure_300), e43.a.getColor(R.color.azure_300_alpha15), e43.a.getColor(R.color.vk_azure_300), e43.a.getColor(R.color.white_alpha30), -1, e43.a.getColor(R.color.azure_300_alpha15), e43.a.getColor(R.color.vk_azure_300), e43.a.getColor(R.color.vk_azure_300), e43.a.getColor(R.color.vk_azure_300));

        @Override // xsna.vpe0
        public final StoryQuestionInfo.Style a() {
            return c;
        }

        @Override // xsna.vpe0
        public final StoryQuestionInfo.a b() {
            return d;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // xsna.vpe0
        public final int getDescription() {
            return b;
        }

        public final int hashCode() {
            return 595020951;
        }

        public final String toString() {
            return "BlueColorStyle";
        }
    }

    /* compiled from: QuestionStickerStyle.kt */
    public static final class b {

        /* compiled from: QuestionStickerStyle.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StoryQuestionInfo.Style.values().length];
                try {
                    iArr[StoryQuestionInfo.Style.LIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StoryQuestionInfo.Style.DARK.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StoryQuestionInfo.Style.BLUE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StoryQuestionInfo.Style.ACCENT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public static vpe0 a(StoryQuestionInfo.Style style, v2l0 v2l0Var) {
            l7s u;
            int i = a.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 1) {
                return e.a;
            }
            if (i == 2) {
                return d.a;
            }
            if (i == 3) {
                return a.a;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (v2l0Var == null) {
                return d.a;
            }
            StickerColorToken stickerColorToken = StickerColorToken.QUESTION_CARD_BACKGROUND;
            int b = b(v2l0Var, stickerColorToken);
            int b2 = b(v2l0Var, StickerColorToken.QUESTION_PRIMARY_BUTTON);
            int b3 = b(v2l0Var, StickerColorToken.QUESTION_TITLE_INPUT_PLACEHOLDER);
            int b4 = b(v2l0Var, StickerColorToken.QUESTION_TITLE);
            StickerColorToken stickerColorToken2 = StickerColorToken.QUESTION_CONTENT_INPUT_PLACEHOLDER;
            int b5 = b(v2l0Var, stickerColorToken2);
            if (l8g.d(b(v2l0Var, stickerColorToken))) {
                Context context = e43.a;
                u = bwt0.v(context != null ? context : null);
            } else {
                Context context2 = e43.a;
                u = bwt0.u(context2 != null ? context2 : null);
            }
            return new c(new StoryQuestionInfo.a(b, b2, b3, b4, b5, e3m.f(R.attr.vk_ui_text_contrast, u), b(v2l0Var, StickerColorToken.QUESTION_CONTENT_INPUT_BACKGROUND), b(v2l0Var, stickerColorToken2), b(v2l0Var, StickerColorToken.QUESTION_SELECTOR), b(v2l0Var, StickerColorToken.QUESTION_INPUT_POINTER)), style);
        }

        public static final int b(v2l0 v2l0Var, StickerColorToken stickerColorToken) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return v2l0Var.b(context, StickerCommonStyle.ACCENT, stickerColorToken);
        }
    }

    /* compiled from: QuestionStickerStyle.kt */
    public static final class c implements vpe0 {
        public final StoryQuestionInfo.a a;
        public final StoryQuestionInfo.Style b;

        public c(StoryQuestionInfo.a aVar, StoryQuestionInfo.Style style) {
            this.a = aVar;
            this.b = style;
        }

        @Override // xsna.vpe0
        public final StoryQuestionInfo.Style a() {
            return this.b;
        }

        @Override // xsna.vpe0
        public final StoryQuestionInfo.a b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            cVar.getClass();
            return this.a.equals(cVar.a) && this.b == cVar.b;
        }

        @Override // xsna.vpe0
        public final int getDescription() {
            return R.string.sticker_color_accent;
        }

        public final int hashCode() {
            return this.b.hashCode() + ((this.a.hashCode() + (Integer.hashCode(R.string.sticker_color_accent) * 31)) * 31);
        }

        public final String toString() {
            return "CustomColorStyle(description=2131963736, viewColors=" + this.a + ", questionInfoStyle=" + this.b + ')';
        }
    }

    /* compiled from: QuestionStickerStyle.kt */
    public static final class d implements vpe0 {
        public static final d a = new d();
        public static final int b = R.string.color_picker_color_name_black;
        public static final StoryQuestionInfo.Style c = StoryQuestionInfo.Style.DARK;

        public static int c(int i) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return e3m.f(i, bwt0.u(context));
        }

        @Override // xsna.vpe0
        public final StoryQuestionInfo.Style a() {
            return c;
        }

        @Override // xsna.vpe0
        public final StoryQuestionInfo.a b() {
            return new StoryQuestionInfo.a(c(R.attr.vk_ui_background_content), c(R.attr.vk_ui_background_accent_themed), c(R.attr.vk_ui_text_tertiary), c(R.attr.vk_ui_text_primary), e43.a.getColor(R.color.vk_black_alpha35), c(R.attr.vk_ui_text_primary), c(R.attr.vk_ui_field_background), e43.a.getColor(R.color.vk_gray_500), c(R.attr.vk_ui_background_content), c(R.attr.vk_ui_icon_accent));
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // xsna.vpe0
        public final int getDescription() {
            return b;
        }

        public final int hashCode() {
            return 232315059;
        }

        public final String toString() {
            return "DarkColorStyle";
        }
    }

    /* compiled from: QuestionStickerStyle.kt */
    public static final class e implements vpe0 {
        public static final e a = new e();
        public static final int b = R.string.color_picker_color_name_white;
        public static final StoryQuestionInfo.Style c = StoryQuestionInfo.Style.LIGHT;

        public static int c(int i) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            return e3m.f(i, bwt0.v(context));
        }

        @Override // xsna.vpe0
        public final StoryQuestionInfo.Style a() {
            return c;
        }

        @Override // xsna.vpe0
        public final StoryQuestionInfo.a b() {
            return new StoryQuestionInfo.a(c(R.attr.vk_ui_background_content), c(R.attr.vk_ui_background_accent_themed), c(R.attr.vk_ui_text_tertiary), c(R.attr.vk_ui_text_primary), e43.a.getColor(R.color.vk_white_alpha32), c(R.attr.vk_ui_text_contrast), c(R.attr.vk_ui_field_background), e43.a.getColor(R.color.vk_steel_gray_300), c(R.attr.vk_ui_background_content), c(R.attr.vk_ui_icon_accent));
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // xsna.vpe0
        public final int getDescription() {
            return b;
        }

        public final int hashCode() {
            return -788095211;
        }

        public final String toString() {
            return "LightColorStyle";
        }
    }

    StoryQuestionInfo.Style a();

    StoryQuestionInfo.a b();

    int getDescription();
}
