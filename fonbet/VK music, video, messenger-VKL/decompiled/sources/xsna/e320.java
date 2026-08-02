package xsna;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MemorySizeCalculator.java */
/* loaded from: classes12.dex */
public final class e320 {
    public final int a;
    public final int b;
    public final int c;

    /* compiled from: MemorySizeCalculator.java */
    public static final class a {
        public final Context a;
        public final ActivityManager b;
        public final b c;
        public final float d;

        public a(Context context) {
            this.d = 1;
            this.a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.b = activityManager;
            this.c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
    }

    /* compiled from: MemorySizeCalculator.java */
    public static final class b {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    public e320(a aVar) {
        Context context = aVar.a;
        float f = aVar.d;
        ActivityManager activityManager = aVar.b;
        int i = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.c = i;
        int round = Math.round(activityManager.getMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.c.a;
        float f2 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        int round2 = Math.round(f2 * f);
        int round3 = Math.round(f2 * 2.0f);
        int i2 = round - i;
        if (round3 + round2 <= i2) {
            this.b = round3;
            this.a = round2;
        } else {
            float f3 = i2 / (f + 2.0f);
            this.b = Math.round(2.0f * f3);
            this.a = Math.round(f3 * f);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            Formatter.formatFileSize(context, this.b);
            Formatter.formatFileSize(context, this.a);
            Formatter.formatFileSize(context, i);
            Formatter.formatFileSize(context, round);
            activityManager.getMemoryClass();
            activityManager.isLowRamDevice();
        }
    }
}
