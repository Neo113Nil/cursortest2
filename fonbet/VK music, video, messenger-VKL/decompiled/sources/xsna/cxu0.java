package xsna;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.vkontakte.android.R;

/* compiled from: VkGradients.kt */
/* loaded from: classes17.dex */
public final class cxu0 {
    public static final cxu0 a = new cxu0();

    public static GradientDrawable a(GradientDrawable.Orientation orientation, Context context) {
        return new GradientDrawable(orientation, new int[]{0, l8g.g(krv0.m(R.attr.vk_ui_background_content, context), (int) (Color.alpha(r1) * 0.05f)), l8g.g(krv0.m(R.attr.vk_ui_background_content, context), (int) (Color.alpha(r1) * 0.2f)), l8g.g(krv0.m(R.attr.vk_ui_background_content, context), (int) (Color.alpha(r1) * 0.8f)), l8g.g(krv0.m(R.attr.vk_ui_background_content, context), (int) (Color.alpha(r1) * 0.95f)), krv0.m(R.attr.vk_ui_background_content, context)});
    }

    public static GradientDrawable b(GradientDrawable.Orientation orientation, Context context) {
        return new GradientDrawable(orientation, new int[]{0, l8g.g(krv0.m(R.attr.vk_ui_background_tertiary, context), (int) (Color.alpha(r1) * 0.05f)), l8g.g(krv0.m(R.attr.vk_ui_background_tertiary, context), (int) (Color.alpha(r1) * 0.2f)), l8g.g(krv0.m(R.attr.vk_ui_background_tertiary, context), (int) (Color.alpha(r1) * 0.8f)), l8g.g(krv0.m(R.attr.vk_ui_background_tertiary, context), (int) (Color.alpha(r1) * 0.95f)), krv0.m(R.attr.vk_ui_background_tertiary, context)});
    }
}
