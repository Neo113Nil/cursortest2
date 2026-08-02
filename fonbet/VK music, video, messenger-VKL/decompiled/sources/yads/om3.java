package yads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Result;
import xsna.an10;

/* loaded from: classes10.dex */
public abstract class om3 {
    public static final an3 a = new an3(new cc2(), new cn3());

    public static final int a(int i, float f) {
        int i2 = (int) ((255 * (100 - f)) / 100.0f);
        int i3 = 255 > i2 ? i2 : 255;
        if (i3 <= 0) {
            i3 = 0;
        }
        return Color.argb(i3, Color.red(i), Color.green(i), Color.blue(i));
    }

    public static final float b(int i, float f) {
        return ((i + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) / f) + 0.5f;
    }

    public static final boolean c(View view) {
        Drawable background = view.getBackground();
        return (background == null || ((float) background.getAlpha()) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true;
    }

    public static final int d(Context context) {
        return (int) b(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().density);
    }

    public static final int a(Context context, int i) {
        return an10.b(i / context.getResources().getDisplayMetrics().density);
    }

    public static final boolean b(View view) {
        return !view.isShown() || view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static final int b(Context context) {
        return (int) b(c(context), context.getResources().getDisplayMetrics().density);
    }

    public static final int c(Context context) {
        Object failure;
        int i;
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        qu2 a2 = gx2.a().a(context);
        if (a2 != null && a2.F0) {
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (Build.VERSION.SDK_INT >= 30) {
                    currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                    bounds = currentWindowMetrics.getBounds();
                    i = bounds.height();
                } else {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
                    i = displayMetrics.heightPixels;
                }
                failure = Integer.valueOf(i);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            Object valueOf = Integer.valueOf(context.getResources().getDisplayMetrics().heightPixels);
            if (failure instanceof Result.Failure) {
                failure = valueOf;
            }
            return ((Number) failure).intValue();
        }
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static final int a(Context context, float f) {
        return an10.b(TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()));
    }

    public static final int a(View view) {
        int i;
        if (view == null || !view.isShown() || (i = a.a(view).a) <= 0) {
            return 0;
        }
        int width = view.getLayoutParams().width > 0 ? view.getLayoutParams().width : view.getWidth();
        int height = view.getLayoutParams().height > 0 ? view.getLayoutParams().height : view.getHeight();
        if (height <= 0 || width <= 0) {
            return 0;
        }
        return (i * 100) / (height * width);
    }

    public static final void a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            try {
                if (viewGroup.getParent() instanceof ViewGroup) {
                    ((ViewGroup) viewGroup.getParent()).removeView(viewGroup);
                }
            } catch (Exception unused) {
            }
            try {
                viewGroup.removeAllViews();
            } catch (Exception unused2) {
            }
        }
    }

    public static final int a(Context context) {
        return context.getResources().getDisplayMetrics().densityDpi;
    }
}
