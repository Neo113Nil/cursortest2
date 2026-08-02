package xsna;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.util.List;
import one.video.stat2.DeviceType;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.lsk0;
import xsna.u8r;

/* compiled from: StatisticsManager.kt */
/* loaded from: classes8.dex */
public final class ryk0 {
    public static final vw3 a = ww3.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT);
    public static final List<Long> b;
    public static List<Long> c;
    public static long d;
    public static long e;
    public static final String f;
    public static DeviceType g;
    public static final String h;
    public static final String i;
    public static int j;

    static {
        List<Long> l = e43.l(5000L, 10000L, Long.valueOf(ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS));
        b = l;
        c = l;
        d = 60000L;
        e = ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS;
        f = Build.VERSION.RELEASE;
        g = DeviceType.UNKNOWN;
        h = Build.MANUFACTURER;
        i = Build.MODEL;
    }

    public static void a(Context context, f260 f260Var, dxi dxiVar) {
        DeviceType i2 = gcd0.i(context);
        lsk0.a aVar = lsk0.b;
        mrk0 mrk0Var = new mrk0(dxiVar.a, dxiVar.b, go9.b("android:", i2.h()), dxiVar.c);
        synchronized (aVar) {
            if (lsk0.c != null) {
                throw new RuntimeException("StatLogWriter already initialized");
            }
            lsk0.c = mrk0Var;
            bpn0 bpn0Var = u8r.a;
            cdi cdiVar = new cdi();
            StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
            u8r.d = new up70(cdiVar);
            u8r.b d2 = u8r.d();
            d2.getClass();
            d2.obtainMessage(0, new u8r.b.a(mrk0Var, f260Var, storageManager)).sendToTarget();
            s3q0 s3q0Var = s3q0.a;
        }
        List<Long> list = dxiVar.f;
        if (list == null) {
            list = b;
        }
        c = list;
        d = dxiVar.d;
        e = dxiVar.e;
        g = i2;
        j = context.getResources().getDisplayMetrics().densityDpi;
    }
}
