package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.concurrent.TimeUnit;

/* compiled from: DefaultEncodedMemoryCacheParamsSupplier.java */
/* loaded from: classes12.dex */
public final class del implements yhn0<o220> {
    public static final long a = TimeUnit.MINUTES.toMillis(5);

    @Override // xsna.yhn0
    public final o220 get() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        int i = min < 16777216 ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : min < 33554432 ? 2097152 : 4194304;
        return new o220(i, a, Integer.MAX_VALUE, i, Integer.MAX_VALUE, i / 8);
    }
}
