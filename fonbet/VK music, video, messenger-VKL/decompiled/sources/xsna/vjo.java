package xsna;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: DrawableHelper.kt */
/* loaded from: classes6.dex */
public final class vjo {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r5v5, types: [xsna.nog0] */
    public static RippleDrawable a(Context context, int i, int i2, int i3, float f, Bitmap bitmap, float f2, int i4) {
        Object obj;
        ?? r5;
        if ((i4 & 2) != 0) {
            i = -1;
        }
        if ((i4 & 4) != 0) {
            i2 = krv0.m(R.attr.vk_ui_separator_primary_alpha, context);
        }
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        int m = krv0.m(R.attr.vk_ui_image_border_alpha, context);
        if ((i4 & 64) != 0) {
            f = 0.0f;
        }
        if ((i4 & 128) != 0) {
            bitmap = null;
        }
        if ((i4 & 256) != 0) {
            f2 = 0.0f;
        }
        if (bitmap != null) {
            r5 = new mog0(context.getResources(), bitmap);
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                r5.b(f);
            }
        } else {
            if (i3 > 0) {
                c1x c1xVar = new c1x(new ShapeDrawable[]{new ShapeDrawable(), new ShapeDrawable()});
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(i);
                gradientDrawable.setStroke(i3, 0);
                gradientDrawable.setCornerRadius(f);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setColor(0);
                gradientDrawable2.setStroke(i3, m);
                gradientDrawable2.setCornerRadius(f);
                int i5 = c1x.b;
                c1xVar.setId(0, i5);
                int i6 = c1x.c;
                c1xVar.setId(1, i6);
                c1xVar.setDrawableByLayerId(i5, gradientDrawable);
                c1xVar.setDrawableByLayerId(i6, gradientDrawable2);
                obj = c1xVar;
            } else if (f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                obj = new pog0(i, (int) f2);
            } else {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
                shapeDrawable.getPaint().setColor(i);
                obj = shapeDrawable;
            }
            r5 = obj;
        }
        return new RippleDrawable(ColorStateList.valueOf(i2), r5, new ujo(-16777216, (int) f));
    }
}
