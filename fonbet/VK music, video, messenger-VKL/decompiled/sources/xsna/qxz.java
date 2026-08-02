package xsna;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import com.vk.location.common.LocationCommon;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class qxz implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Context d;

    public /* synthetic */ qxz(Context context, long j, long j2) {
        this.b = j;
        this.c = j2;
        this.d = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f A[RETURN] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Location a;
        Location location = (Location) obj;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.b;
        Random random = txz.c;
        if (TimeUnit.NANOSECONDS.toMillis(SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos()) < this.c) {
            LocationCommon.a.getClass();
            if (!location.equals(LocationCommon.b) && location.getLatitude() != ConnectivityTracker.DEFAULT_UPLINK_BITRATE && location.getLongitude() != ConnectivityTracker.DEFAULT_UPLINK_BITRATE && location.getTime() != 0) {
                a = location;
                return a != null ? location : a;
            }
        }
        a = txz.a(Math.max(1L, 1000 - elapsedRealtime), this.d);
        if (a != null) {
        }
    }
}
