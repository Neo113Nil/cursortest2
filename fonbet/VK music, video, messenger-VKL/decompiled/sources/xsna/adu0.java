package xsna;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.image.VKImageController;
import com.vkontakte.android.R;

/* compiled from: VkAuthViewUtils.kt */
/* loaded from: classes15.dex */
public final class adu0 {
    public static VKImageController.b a(int i, Context context) {
        int i2 = (i & 2) != 0 ? R.drawable.vk_user_placeholder_icon_64 : 0;
        Integer valueOf = Integer.valueOf(e3m.f(R.attr.vk_ui_vkontakte_color_placeholder_icon_foreground_secondary, context));
        bpn0 bpn0Var = t65.a;
        return new VKImageController.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, true, i2, null, valueOf, null, null, (int) Math.floor(0.5f * Resources.getSystem().getDisplayMetrics().density), krv0.m(R.attr.vk_ui_image_border_alpha, context), null, null, null, 63915);
    }

    public static Typeface b(Context context, TypedArray typedArray, int i) {
        Typeface typeface;
        try {
            typeface = dbg0.a(typedArray.getResourceId(i, -1), context);
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            return typeface;
        }
        String string = typedArray.getString(i);
        if (string != null) {
            return Typeface.create(string, 0);
        }
        return null;
    }
}
