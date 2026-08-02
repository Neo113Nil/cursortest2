package xsna;

import android.app.ActivityManager;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultBitmapMemoryCacheParamsSupplier.java */
/* loaded from: classes12.dex */
public final class ubl implements yhn0<o220> {
    public static final long b = TimeUnit.MINUTES.toMillis(5);
    public final ActivityManager a;

    public ubl(ActivityManager activityManager) {
        this.a = activityManager;
    }

    @Override // xsna.yhn0
    public final o220 get() {
        int min = Math.min(this.a.getMemoryClass() * ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES, Integer.MAX_VALUE);
        return new o220(min < 33554432 ? 4194304 : min < 67108864 ? 6291456 : min / 4, b, 256, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }
}
