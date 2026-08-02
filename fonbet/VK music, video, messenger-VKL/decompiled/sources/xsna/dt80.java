package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.stickers.api.styles.StickerColorToken;
import com.vk.stickers.api.styles.StickerCommonStyle;
import com.vkontakte.android.R;

/* compiled from: OpinionStyle.kt */
/* loaded from: classes6.dex */
public interface dt80 {

    /* compiled from: OpinionStyle.kt */
    public static final class a implements dt80 {
        public final v2l0 a;

        public a(v2l0 v2l0Var) {
            this.a = v2l0Var;
        }

        @Override // xsna.dt80
        public final int a(Context context) {
            return this.a.b(context, StickerCommonStyle.ACCENT, StickerColorToken.QUESTION_CARD_BACKGROUND);
        }

        @Override // xsna.dt80
        public final int b(Context context) {
            return g(context);
        }

        @Override // xsna.dt80
        public final int c(Context context) {
            return this.a.b(context, StickerCommonStyle.ACCENT, StickerColorToken.QUESTION_CONTENT_INPUT_PLACEHOLDER);
        }

        @Override // xsna.dt80
        public final Drawable d(Context context) {
            Drawable a = m33.a(R.drawable.bg_edittext_light, context);
            new baf0(a, this.a.b(context, StickerCommonStyle.ACCENT, StickerColorToken.QUESTION_CONTENT_INPUT_BACKGROUND));
            return a;
        }

        @Override // xsna.dt80
        public final int e(Context context) {
            return this.a.b(context, StickerCommonStyle.ACCENT, StickerColorToken.QUESTION_TITLE);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        @Override // xsna.dt80
        public final int f(Context context) {
            return this.a.b(context, StickerCommonStyle.ACCENT, StickerColorToken.QUESTION_INPUT_POINTER);
        }

        @Override // xsna.dt80
        public final int g(Context context) {
            return this.a.b(context, StickerCommonStyle.ACCENT, StickerColorToken.QUESTION_SECONDARY_BUTTON);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Accent(colors=" + this.a + ')';
        }
    }

    /* compiled from: OpinionStyle.kt */
    public static final class b implements dt80 {
        public static final b a = new b();

        @Override // xsna.dt80
        public final int a(Context context) {
            return e3m.f(R.attr.vk_ui_background_content, bwt0.u(context));
        }

        @Override // xsna.dt80
        public final int b(Context context) {
            return e3m.f(R.attr.vk_ui_icon_medium, bwt0.u(context));
        }

        @Override // xsna.dt80
        public final int c(Context context) {
            return context.getColor(R.color.vk_steel_gray_400);
        }

        @Override // xsna.dt80
        public final Drawable d(Context context) {
            return m33.a(R.drawable.bg_edittext_dark, context);
        }

        @Override // xsna.dt80
        public final int e(Context context) {
            return e3m.f(R.attr.vk_ui_text_primary, bwt0.u(context));
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // xsna.dt80
        public final int f(Context context) {
            return e3m.f(R.attr.vk_ui_icon_accent, context);
        }

        @Override // xsna.dt80
        public final int g(Context context) {
            return e3m.f(R.attr.vk_ui_text_secondary, bwt0.u(context));
        }

        public final int hashCode() {
            return -2086569028;
        }

        public final String toString() {
            return "Black";
        }
    }

    /* compiled from: OpinionStyle.kt */
    public static final class c implements dt80 {
        public static final c a = new c();

        @Override // xsna.dt80
        public final int a(Context context) {
            return context.getColor(R.color.vk_white);
        }

        @Override // xsna.dt80
        public final int b(Context context) {
            return context.getColor(R.color.vk_steel_gray_300);
        }

        @Override // xsna.dt80
        public final int c(Context context) {
            return context.getColor(R.color.vk_azure_300);
        }

        @Override // xsna.dt80
        public final Drawable d(Context context) {
            return m33.a(R.drawable.bg_edittext_blue, context);
        }

        @Override // xsna.dt80
        public final int e(Context context) {
            return context.getColor(R.color.vk_azure_300);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // xsna.dt80
        public final int f(Context context) {
            return e3m.f(R.attr.vk_ui_icon_accent, context);
        }

        @Override // xsna.dt80
        public final int g(Context context) {
            return context.getColor(R.color.vk_steel_gray_400);
        }

        public final int hashCode() {
            return 764024857;
        }

        public final String toString() {
            return "Dark";
        }
    }

    /* compiled from: OpinionStyle.kt */
    public static final class d implements dt80 {
        public static final d a = new d();

        @Override // xsna.dt80
        public final int a(Context context) {
            return e3m.f(R.attr.vk_ui_background_content, bwt0.v(context));
        }

        @Override // xsna.dt80
        public final int b(Context context) {
            return e3m.f(R.attr.vk_ui_icon_medium, bwt0.v(context));
        }

        @Override // xsna.dt80
        public final int c(Context context) {
            return context.getColor(R.color.vk_steel_gray_400);
        }

        @Override // xsna.dt80
        public final Drawable d(Context context) {
            return m33.a(R.drawable.bg_edittext_light, context);
        }

        @Override // xsna.dt80
        public final int e(Context context) {
            return e3m.f(R.attr.vk_ui_text_primary, bwt0.v(context));
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // xsna.dt80
        public final int f(Context context) {
            return e3m.f(R.attr.vk_ui_icon_accent, context);
        }

        @Override // xsna.dt80
        public final int g(Context context) {
            return e3m.f(R.attr.vk_ui_text_secondary, bwt0.v(context));
        }

        public final int hashCode() {
            return -2077417261;
        }

        public final String toString() {
            return "Light";
        }
    }

    int a(Context context);

    int b(Context context);

    int c(Context context);

    Drawable d(Context context);

    int e(Context context);

    int f(Context context);

    int g(Context context);
}
