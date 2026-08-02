package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.vkontakte.android.R;

/* compiled from: DialogWithSelfDrawable.kt */
/* loaded from: classes2.dex */
public final class qmm extends LayerDrawable {
    public qmm(int i) {
        super(new Drawable[0]);
        GradientDrawable gradientDrawable = new GradientDrawable();
        abg0 abg0Var = dhr0.u;
        gradientDrawable.setColor(ColorStateList.valueOf(abg0Var.c(R.attr.vk_ui_accent_secondary)));
        gradientDrawable.setShape(1);
        addLayer(gradientDrawable);
        Drawable a = i < cn70.b(56) ? abg0Var.a(R.drawable.vk_icon_bookmark_outline_20) : abg0Var.a(R.drawable.vk_icon_bookmark_outline_28);
        if (a != null) {
            a.setTint(abg0Var.c(R.attr.vk_ui_icon_contrast));
        }
        addLayer(a);
        setLayerGravity(1, 17);
    }
}
