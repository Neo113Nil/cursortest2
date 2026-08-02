package xsna;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import com.google.android.gms.cast.framework.media.widget.ExpandedControllerActivity;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class qm01 {
    public static final o100 a = new o100("WidgetUtil", null);

    public static Drawable a(ExpandedControllerActivity expandedControllerActivity, int i, int i2) {
        ColorStateList colorStateList;
        Drawable mutate = expandedControllerActivity.getResources().getDrawable(i2).mutate();
        mutate.setTintMode(PorterDuff.Mode.SRC_IN);
        if (i != 0) {
            colorStateList = anj.b(i, expandedControllerActivity);
        } else {
            int color = expandedControllerActivity.getColor(R.color.white);
            colorStateList = new ColorStateList(new int[][]{new int[]{R.attr.state_enabled}, new int[]{-16842910}}, new int[]{color, n8g.l(color, 128)});
        }
        mutate.setTintList(colorStateList);
        return mutate;
    }
}
