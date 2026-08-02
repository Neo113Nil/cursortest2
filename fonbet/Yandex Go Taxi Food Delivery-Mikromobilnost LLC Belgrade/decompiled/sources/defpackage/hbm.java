package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;

/* loaded from: classes6.dex */
public final class hbm {
    public final Context a;
    public final int b;

    public hbm(Context context) {
        this.a = context;
        this.b = context.getResources().getDimensionPixelSize(ysg0.map_point_stroke_width);
    }

    public final Drawable a(String str, Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        Integer S = q5z.S(str);
        if (S != null) {
            int intValue = S.intValue();
            drawable.mutate();
            Drawable drawable2 = drawable instanceof InsetDrawable ? ((InsetDrawable) drawable).getDrawable() : drawable;
            if (drawable2 instanceof GradientDrawable) {
                ((GradientDrawable) drawable2).setStroke(this.b, intValue);
            }
        }
        return drawable;
    }
}
