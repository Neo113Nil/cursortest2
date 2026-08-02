package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import java.time.Duration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class eh91 {
    public static volatile eh91 c;
    public static final Object d = new Object();
    public static final Duration e = Duration.ofMinutes(30);
    public final e091 a;
    public final AtomicLong b = new AtomicLong(-1);

    public eh91(Context context) {
        this.a = vez0.v(context, new qdy0("ads_identifier:api"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r3 - r17.b.get()) > defpackage.eh91.e.toMillis()) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(int i, int i2, long j, long j2) {
        AtomicLong atomicLong = this.b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Log.i("AdvertisingIdClient", "shouldSendLog " + atomicLong.get());
        if (this.b.get() != -1) {
        }
        e091 e091Var = this.a;
        if (e091Var == null) {
            return;
        }
        e091Var.e(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i, 0, j, j2, null, null, 0, i2)))).d(new jpb(this, elapsedRealtime));
    }
}
