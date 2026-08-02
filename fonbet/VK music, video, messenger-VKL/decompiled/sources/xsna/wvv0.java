package xsna;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import xsna.e3m;

/* compiled from: VkUiDrawableHelper.kt */
/* loaded from: classes17.dex */
public final class wvv0 {
    public static final int a = iah0.a(0.5f);
    public static final int[][] b = {new int[]{R.attr.state_focused}, new int[]{0}};

    public static Drawable a(Context context, int i, int i2, int i3, int i4, int i5) {
        int[][] iArr = b;
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{i2, i3});
        ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{i4, i5});
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(i, context);
        Drawable mutate = a2 != null ? a2.mutate() : null;
        GradientDrawable gradientDrawable = mutate instanceof GradientDrawable ? (GradientDrawable) mutate : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(colorStateList);
            gradientDrawable.setStroke(a, colorStateList2);
        }
        return mutate;
    }

    public static Drawable b(Context context) {
        return a(context, com.vkontakte.android.R.drawable.vkui_bg_edittext, e3m.f(com.vkontakte.android.R.attr.vk_ui_field_background, context), e3m.f(com.vkontakte.android.R.attr.vk_ui_field_background, context), e3m.f(com.vkontakte.android.R.attr.vk_ui_stroke_accent, context), e3m.f(com.vkontakte.android.R.attr.vk_ui_field_border_alpha, context));
    }
}
