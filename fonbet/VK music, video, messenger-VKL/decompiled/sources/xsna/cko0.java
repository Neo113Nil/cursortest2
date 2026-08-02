package xsna;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextPaintExt.kt */
/* loaded from: classes4.dex */
public final class cko0 {
    public static final void a(Paint paint, Context context, int i) {
        Resources.Theme theme;
        TypedValue typedValue = new TypedValue();
        if (context != null && (theme = context.getTheme()) != null) {
            theme.resolveAttribute(i, typedValue, true);
        }
        int i2 = typedValue.resourceId;
        if (context != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{R.attr.textSize, R.attr.fontFamily, R.attr.letterSpacing, R.attr.textFontWeight, R.attr.textStyle});
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    paint.setTextSize(obtainStyledAttributes.getDimension(0, paint.getTextSize()));
                }
                String string = obtainStyledAttributes.getString(1);
                if (string != null) {
                    paint.setTypeface(Typeface.create(string, 0));
                }
                if (obtainStyledAttributes.hasValue(2)) {
                    paint.setLetterSpacing(obtainStyledAttributes.getFloat(2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                }
                if (obtainStyledAttributes.hasValue(3)) {
                    paint.setTypeface(Typeface.create(paint.getTypeface(), obtainStyledAttributes.getInt(3, 0), false));
                }
                if (obtainStyledAttributes.hasValue(4)) {
                    paint.setTypeface(Typeface.create(paint.getTypeface(), obtainStyledAttributes.getInt(4, 0)));
                }
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }
}
