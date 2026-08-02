package androidx.camera.camera2.internal;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.network.mapi.MapiClientImpl;

/* loaded from: classes10.dex */
public final class j {
    public final long a;
    public long b = -1;
    public final /* synthetic */ Camera2CameraImpl$StateCallback c;

    public j(Camera2CameraImpl$StateCallback camera2CameraImpl$StateCallback, long j) {
        this.c = camera2CameraImpl$StateCallback;
        this.a = j;
    }

    public final int a() {
        if (!this.c.shouldActiveResume()) {
            return 700;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.b == -1) {
            this.b = uptimeMillis;
        }
        long j = uptimeMillis - this.b;
        if (j <= 120000) {
            return 1000;
        }
        return j <= MapiClientImpl.RETRIES_TIME_MILLIS ? 2000 : 4000;
    }

    public final int b() {
        boolean shouldActiveResume = this.c.shouldActiveResume();
        long j = this.a;
        if (shouldActiveResume) {
            return j > 0 ? Math.min((int) j, Constants.THIRTY_MINUTES) : Constants.THIRTY_MINUTES;
        }
        if (j > 0) {
            return Math.min((int) j, 10000);
        }
        return 10000;
    }
}
