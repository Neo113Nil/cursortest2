package xsna;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
/* loaded from: classes13.dex */
public final class jc7 {
    public static final f3u c = new f3u("StreamingFormatChecker", "");
    public final LinkedList a = new LinkedList();
    public long b = -1;

    public final void a(@NonNull y1x y1xVar) {
        if (y1xVar.g != -1) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Long valueOf = Long.valueOf(elapsedRealtime);
        LinkedList linkedList = this.a;
        linkedList.add(valueOf);
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (linkedList.size() == 5) {
            Long l = (Long) linkedList.peekFirst();
            exc0.i(l);
            if (elapsedRealtime - l.longValue() < 5000) {
                long j = this.b;
                if (j == -1 || elapsedRealtime - j >= TimeUnit.SECONDS.toMillis(5L)) {
                    this.b = elapsedRealtime;
                    c.a("ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
                }
            }
        }
    }
}
