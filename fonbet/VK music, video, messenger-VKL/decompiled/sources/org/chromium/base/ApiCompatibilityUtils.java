package org.chromium.base;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityOptions;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.os.UserManager;
import android.view.Display;
import android.view.View;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class ApiCompatibilityUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "ApiCompatUtil";

    private ApiCompatibilityUtils() {
    }

    public static int checkPermission(Context context, String str, int i, int i2) {
        try {
            return context.checkPermission(str, i, i2);
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public static void clearHandwritingBoundsOffsetBottom(View view) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        try {
            Float f = (Float) View.class.getMethod("getHandwritingBoundsOffsetTop", null).invoke(view, null);
            f.floatValue();
            Float f2 = (Float) View.class.getMethod("getHandwritingBoundsOffsetLeft", null).invoke(view, null);
            f2.floatValue();
            Float f3 = (Float) View.class.getMethod("getHandwritingBoundsOffsetRight", null).invoke(view, null);
            f3.floatValue();
            Class cls = Float.TYPE;
            View.class.getMethod("setHandwritingBoundsOffsets", cls, cls, cls, cls).invoke(view, f2, f, f3, 0);
        } catch (IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
        }
    }

    private static int getBackgroundActivityStartAllowAlwaysMode() {
        try {
            Field declaredField = ActivityOptions.class.getDeclaredField("MODE_BACKGROUND_ACTIVITY_START_ALLOW_ALWAYS");
            declaredField.setAccessible(true);
            return declaredField.getInt(null);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            throw new RuntimeException("Background start mode cannot be found.", e);
        }
    }

    public static Bitmap getBitmapByUri(ContentResolver contentResolver, Uri uri) throws IOException {
        return ImageDecoder.decodeBitmap(ImageDecoder.createSource(contentResolver, uri));
    }

    public static byte[] getBytesUtf8(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public static Drawable getDrawable(Resources resources, int i) throws Resources.NotFoundException {
        return getDrawableForDensity(resources, i, 0);
    }

    public static Drawable getDrawableForDensity(Resources resources, int i, int i2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            Drawable drawable = i2 == 0 ? resources.getDrawable(i, null) : resources.getDrawableForDensity(i, i2, null);
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return drawable;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    public static List<Integer> getTargetableDisplayIds(Activity activity) {
        DisplayManager displayManager;
        boolean isActivityStartAllowedOnDisplay;
        if (Build.VERSION.SDK_INT < 29) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (activity != null && (displayManager = (DisplayManager) activity.getSystemService("display")) != null) {
            Display[] displays = displayManager.getDisplays();
            ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity");
            for (Display display : displays) {
                if (display.getState() == 2) {
                    isActivityStartAllowedOnDisplay = activityManager.isActivityStartAllowedOnDisplay(activity, display.getDisplayId(), new Intent(activity, activity.getClass()));
                    if (isActivityStartAllowedOnDisplay) {
                        arrayList.add(Integer.valueOf(display.getDisplayId()));
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean isDemoUser() {
        return ((UserManager) ContextUtils.getApplicationContext().getSystemService("user")).isDemoUser();
    }

    public static boolean isRunningInUserTestHarness() {
        boolean isRunningInUserTestHarness;
        if (Build.VERSION.SDK_INT < 29) {
            return false;
        }
        isRunningInUserTestHarness = ActivityManager.isRunningInUserTestHarness();
        return isRunningInUserTestHarness;
    }

    public static void setActivityOptionsBackgroundActivityStartAllowAlways(ActivityOptions activityOptions) {
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return;
        }
        if (i <= 35) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(1);
        } else {
            activityOptions.setPendingIntentBackgroundActivityStartMode(getBackgroundActivityStartAllowAlwaysMode());
        }
    }

    public static void setCreatorActivityOptionsBackgroundActivityStartMode(ActivityOptions activityOptions) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        activityOptions.setPendingIntentCreatorBackgroundActivityStartMode(1);
    }
}
