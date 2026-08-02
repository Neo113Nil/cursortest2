package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import com.vkontakte.android.R;
import xsna.e3m;

/* compiled from: AvatarLockedDrawable.kt */
/* loaded from: classes2.dex */
public final class ur5 extends LayerDrawable {
    public ur5(Context context, int i) {
        super(new Drawable[0]);
        Drawable a;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(ColorStateList.valueOf(context.getColor(R.color.vk_gray_A40)));
        gradientDrawable.setShape(1);
        addLayer(gradientDrawable);
        if (i < cn70.b(56)) {
            e3m.a aVar = e3m.a;
            a = m33.a(R.drawable.vk_icon_lock_outline_24, context);
        } else {
            e3m.a aVar2 = e3m.a;
            a = m33.a(R.drawable.vk_icon_lock_outline_56, context);
        }
        if (a != null) {
            a.setTint(context.getColor(R.color.vk_steel_gray_150));
        }
        addLayer(a);
        setLayerGravity(1, 17);
    }
}
