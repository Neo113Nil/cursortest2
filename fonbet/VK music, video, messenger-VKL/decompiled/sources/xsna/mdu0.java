package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.vkontakte.android.R;

/* compiled from: VkAvatarLockedDrawable.kt */
/* loaded from: classes2.dex */
public final class mdu0 extends LayerDrawable {
    public final Drawable b;

    public mdu0(int i) {
        super(new Drawable[0]);
        GradientDrawable gradientDrawable = new GradientDrawable();
        abg0 abg0Var = dhr0.u;
        gradientDrawable.setColor(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_background_secondary)));
        gradientDrawable.setShape(1);
        addLayer(gradientDrawable);
        Drawable a = i < cn70.b(56) ? abg0Var.a(R.drawable.vk_icon_lock_outline_24) : abg0Var.a(R.drawable.vk_icon_lock_outline_36);
        if (a != null) {
            a.setTint(abg0Var.c(R.attr.vk_ui_icon_tertiary));
        } else {
            a = null;
        }
        this.b = a;
        if (a != null) {
            addLayer(a);
        }
        setLayerGravity(getNumberOfLayers() - 1, 17);
    }
}
