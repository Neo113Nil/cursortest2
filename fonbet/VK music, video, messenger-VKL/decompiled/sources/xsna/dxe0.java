package xsna;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.v1.SessionVerbosity;
import com.google.protobuf.Internal;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;
import com.unity3d.services.UnityAdsConstants;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.vwe0;

/* compiled from: RateLimiter.java */
/* loaded from: classes13.dex */
public final class dxe0 {
    public final txi a;
    public final float b;
    public final float c;
    public final a d;
    public final a e;

    /* compiled from: RateLimiter.java */
    public static class a {
        public static final long i;
        public vwe0 b;
        public final vwe0 e;
        public final vwe0 f;
        public final long g;
        public final long h;
        public long c = 500;
        public double d = 500;
        public Timer a = new Timer();

        static {
            ra2.d();
            i = TimeUnit.SECONDS.toMicros(1L);
        }

        public a(vwe0 vwe0Var, bvf bvfVar, txi txiVar, String str) {
            oyi oyiVar;
            long longValue;
            nyi nyiVar;
            long longValue2;
            zyi zyiVar;
            azi aziVar;
            this.b = vwe0Var;
            long k = str == "Trace" ? txiVar.k() : txiVar.k();
            if (str == "Trace") {
                synchronized (azi.class) {
                    try {
                        if (azi.c == null) {
                            azi.c = new azi(0);
                        }
                        aziVar = azi.c;
                    } finally {
                    }
                }
                RemoteConfigManager remoteConfigManager = txiVar.a;
                aziVar.getClass();
                kt80<Long> kt80Var = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
                if (kt80Var.b() && txi.l(kt80Var.a().longValue())) {
                    txiVar.c.e(kt80Var.a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    longValue = kt80Var.a().longValue();
                } else {
                    kt80<Long> c = txiVar.c(aziVar);
                    longValue = (c.b() && txi.l(c.a().longValue())) ? c.a().longValue() : 300L;
                }
            } else {
                synchronized (oyi.class) {
                    try {
                        if (oyi.c == null) {
                            oyi.c = new oyi(0);
                        }
                        oyiVar = oyi.c;
                    } finally {
                    }
                }
                RemoteConfigManager remoteConfigManager2 = txiVar.a;
                oyiVar.getClass();
                kt80<Long> kt80Var2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
                if (kt80Var2.b() && txi.l(kt80Var2.a().longValue())) {
                    txiVar.c.e(kt80Var2.a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    longValue = kt80Var2.a().longValue();
                } else {
                    kt80<Long> c2 = txiVar.c(oyiVar);
                    longValue = (c2.b() && txi.l(c2.a().longValue())) ? c2.a().longValue() : 700L;
                }
            }
            long j = longValue;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            this.e = new vwe0(j, k, timeUnit);
            this.g = j;
            long k2 = str == "Trace" ? txiVar.k() : txiVar.k();
            if (str == "Trace") {
                synchronized (zyi.class) {
                    try {
                        if (zyi.c == null) {
                            zyi.c = new zyi(0);
                        }
                        zyiVar = zyi.c;
                    } finally {
                    }
                }
                RemoteConfigManager remoteConfigManager3 = txiVar.a;
                zyiVar.getClass();
                kt80<Long> kt80Var3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
                if (kt80Var3.b() && txi.l(kt80Var3.a().longValue())) {
                    txiVar.c.e(kt80Var3.a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    longValue2 = kt80Var3.a().longValue();
                } else {
                    kt80<Long> c3 = txiVar.c(zyiVar);
                    longValue2 = (c3.b() && txi.l(c3.a().longValue())) ? c3.a().longValue() : 30L;
                }
            } else {
                synchronized (nyi.class) {
                    try {
                        if (nyi.c == null) {
                            nyi.c = new nyi(0);
                        }
                        nyiVar = nyi.c;
                    } finally {
                    }
                }
                RemoteConfigManager remoteConfigManager4 = txiVar.a;
                nyiVar.getClass();
                kt80<Long> kt80Var4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
                if (kt80Var4.b() && txi.l(kt80Var4.a().longValue())) {
                    txiVar.c.e(kt80Var4.a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    longValue2 = kt80Var4.a().longValue();
                } else {
                    kt80<Long> c4 = txiVar.c(nyiVar);
                    longValue2 = (c4.b() && txi.l(c4.a().longValue())) ? c4.a().longValue() : 70L;
                }
            }
            long j2 = longValue2;
            this.f = new vwe0(j2, k2, timeUnit);
            this.h = j2;
        }

        public final synchronized void a(boolean z) {
            try {
                this.b = z ? this.e : this.f;
                this.c = z ? this.g : this.h;
            } catch (Throwable th) {
                throw th;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005f A[Catch: all -> 0x006e, TryCatch #0 {all -> 0x006e, blocks: (B:3:0x0001, B:9:0x002c, B:10:0x0054, B:12:0x005f, B:13:0x0070, B:15:0x0078, B:22:0x0034, B:23:0x003d, B:24:0x0040, B:25:0x004a), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0078 A[Catch: all -> 0x006e, TRY_LEAVE, TryCatch #0 {all -> 0x006e, blocks: (B:3:0x0001, B:9:0x002c, B:10:0x0054, B:12:0x005f, B:13:0x0070, B:15:0x0078, B:22:0x0034, B:23:0x003d, B:24:0x0040, B:25:0x004a), top: B:2:0x0001 }] */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007d A[DONT_GENERATE] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized boolean b() {
            double d;
            long nanos;
            double d2;
            double d3;
            double d4;
            try {
                Timer timer = new Timer();
                Timer timer2 = this.a;
                timer2.getClass();
                double d5 = timer.c - timer2.c;
                vwe0 vwe0Var = this.b;
                long j = vwe0Var.b;
                long j2 = vwe0Var.a;
                int i2 = vwe0.a.a[vwe0Var.c.ordinal()];
                if (i2 == 1) {
                    d = j2 / j;
                    nanos = TimeUnit.SECONDS.toNanos(1L);
                } else if (i2 == 2) {
                    d = j2 / j;
                    nanos = TimeUnit.SECONDS.toMicros(1L);
                } else {
                    if (i2 != 3) {
                        d2 = j2 / r3.toSeconds(j);
                        d3 = (d5 * d2) / i;
                        if (d3 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            this.d = Math.min(this.d + d3, this.c);
                            this.a = timer;
                        }
                        d4 = this.d;
                        if (d4 >= 1.0d) {
                            return false;
                        }
                        this.d = d4 - 1.0d;
                        return true;
                    }
                    d = j2 / j;
                    nanos = TimeUnit.SECONDS.toMillis(1L);
                }
                d2 = d * nanos;
                d3 = (d5 * d2) / i;
                if (d3 > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                }
                d4 = this.d;
                if (d4 >= 1.0d) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public dxe0(@NonNull Context context, vwe0 vwe0Var) {
        bvf bvfVar = new bvf();
        float nextFloat = new Random().nextFloat();
        float nextFloat2 = new Random().nextFloat();
        txi e = txi.e();
        this.d = null;
        this.e = null;
        boolean z = false;
        if (!(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= nextFloat && nextFloat < 1.0f)) {
            throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0f, 1.0f).");
        }
        if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT <= nextFloat2 && nextFloat2 < 1.0f) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        }
        this.b = nextFloat;
        this.c = nextFloat2;
        this.a = e;
        this.d = new a(vwe0Var, bvfVar, e, "Trace");
        this.e = new a(vwe0Var, bvfVar, e, AndroidInitializeBoldSDK.MSG_NETWORK);
        i3r0.a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Internal.ProtobufList protobufList) {
        return protobufList.size() > 0 && ((com.google.firebase.perf.v1.h) protobufList.get(0)).g() > 0 && ((com.google.firebase.perf.v1.h) protobufList.get(0)).f() == SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS;
    }
}
