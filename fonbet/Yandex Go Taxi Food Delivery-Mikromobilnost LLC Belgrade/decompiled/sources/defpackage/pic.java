package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.ybsdk.core.utils.ui.core.CoreShapeDrawable;
import com.ybsdk.feature.qr.payments.internal.utils.DrawableSize;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class pic {
    public static final List a = scc.g(Integer.valueOf(ung0.ybColor_fill_color4_400), Integer.valueOf(ung0.ybColor_fill_color7_400), Integer.valueOf(ung0.ybColor_fill_color6_400), Integer.valueOf(ung0.ybColor_fill_color1_400), Integer.valueOf(ung0.ybColor_fill_color5_400), Integer.valueOf(ung0.ybColor_fill_color8_400), Integer.valueOf(ung0.ybColor_fill_color2_400), Integer.valueOf(ung0.ybColor_fill_color3_400));

    public static final BitmapDrawable a(Context context, String str, int i, DrawableSize drawableSize) {
        Drawable t = vng.t(iyg0.ybsdk_ic_default_merchant, context);
        CoreShapeDrawable g = jra1.g(i, i, String.valueOf(str), context, a);
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        g.setBounds(0, 0, i, i);
        g.draw(canvas);
        int r = kp50.r(drawableSize.getValue());
        int i2 = (i - r) / 2;
        int i3 = r + i2;
        t.setBounds(i2, i2, i3, i3);
        t.draw(canvas);
        return new BitmapDrawable(context.getResources(), createBitmap);
    }
}
