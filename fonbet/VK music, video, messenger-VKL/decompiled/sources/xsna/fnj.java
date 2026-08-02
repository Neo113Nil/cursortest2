package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Build;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.vk.core.util.ScreenSize;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ContextExt.kt */
/* loaded from: classes.dex */
public final class fnj {

    /* compiled from: ContextExt.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScreenSize.values().length];
            try {
                iArr[ScreenSize.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenSize.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScreenSize.Xlarge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int a(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        return identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : (int) (24 * context.getResources().getDisplayMetrics().density);
    }

    public static final boolean b(Context context) {
        try {
            String string = context.getString(R.string.vk_screen_size);
            for (ScreenSize screenSize : ScreenSize.h()) {
                if (string.equalsIgnoreCase(screenSize.name())) {
                    break;
                }
            }
        } catch (Throwable unused) {
        }
        screenSize = ScreenSize.Normal;
        int i = a.$EnumSwitchMapping$0[screenSize.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(Context context) {
        return !d(context);
    }

    public static final boolean d(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics maximumWindowMetrics;
        Rect bounds2;
        if (b(context)) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 32) {
            return false;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        int width = bounds.width();
        int height = bounds.height();
        maximumWindowMetrics = windowManager.getMaximumWindowMetrics();
        bounds2 = maximumWindowMetrics.getBounds();
        return width < bounds2.width() && height == bounds2.height();
    }

    public static final Activity e(Context context) {
        boolean z;
        while (true) {
            z = context instanceof Activity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (z) {
            return (Activity) context;
        }
        return null;
    }
}
