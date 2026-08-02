package xsna;

import android.os.Environment;
import android.os.StatFs;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class yrw implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = (statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong()) / ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        } catch (Exception unused) {
            j = -1;
        }
        return Boolean.valueOf(j >= 256);
    }
}
