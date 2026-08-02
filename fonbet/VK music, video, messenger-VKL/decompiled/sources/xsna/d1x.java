package xsna;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import xsna.e3m;

/* compiled from: InnerStrokeDrawable.kt */
/* loaded from: classes17.dex */
public final class d1x extends LayerDrawable {
    public static final int c;
    public static final int d;
    public final Context b;

    static {
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        c = View.generateViewId();
        d = View.generateViewId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1x(Context context, float f, int i, int i2, int i3) {
        super(new ShapeDrawable[]{new ShapeDrawable(), new ShapeDrawable()});
        float[] fArr = new float[8];
        for (int i4 = 0; i4 < 8; i4++) {
            fArr[i4] = f;
        }
        this.b = context;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(i2, 0);
        gradientDrawable.setCornerRadii(fArr);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        gradientDrawable2.setStroke(i2, i3);
        gradientDrawable2.setCornerRadii(fArr);
        int i5 = c;
        setId(0, i5);
        int i6 = d;
        setId(1, i6);
        setDrawableByLayerId(i5, gradientDrawable);
        setDrawableByLayerId(i6, gradientDrawable2);
    }

    public final void a(int i) {
        Drawable findDrawableByLayerId = findDrawableByLayerId(c);
        GradientDrawable gradientDrawable = findDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        } else {
            findDrawableByLayerId.setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void b(int i) {
        e3m.a aVar = e3m.a;
        setDrawableByLayerId(c, m33.a(i, this.b));
    }

    public d1x(float f, int i, int i2, Context context) {
        this(context, f, i, i2, e3m.f(R.attr.vk_ui_image_border_alpha, context));
    }
}
