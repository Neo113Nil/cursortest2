package one.video.player.live;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cgn;

/* loaded from: classes8.dex */
public final class DebugInfo {
    public static final AtomicInteger R = new AtomicInteger(1);
    public int C;
    public volatile int F;
    public volatile int G;
    public volatile int H;
    public volatile int I;
    public volatile int J;
    public volatile int K;
    public volatile int L;
    public volatile int M;
    public volatile int N;
    public String a;
    public int j;
    public int m;
    public int p;
    public volatile int s;
    public int w;
    public int z;
    public c b = c.INIT;
    public final boolean[] c = new boolean[2];
    public volatile String d = "";
    public final AtomicLong e = new AtomicLong();
    public final AtomicReference<Float> f = new AtomicReference<>(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    public final AtomicInteger g = new AtomicInteger();

    @NonNull
    public volatile d h = new d(0, null, null);
    public final AtomicInteger i = new AtomicInteger();
    public final AtomicLong k = new AtomicLong();
    public final AtomicInteger l = new AtomicInteger();
    public final AtomicLong n = new AtomicLong();
    public final AtomicInteger o = new AtomicInteger();
    public final AtomicLong q = new AtomicLong();
    public final AtomicInteger r = new AtomicInteger();
    public final AtomicInteger t = new AtomicInteger();

    @NonNull
    public volatile a u = new a(0, null, null);
    public final AtomicInteger v = new AtomicInteger();
    public final AtomicLong x = new AtomicLong();
    public final AtomicInteger y = new AtomicInteger();
    public final AtomicLong A = new AtomicLong();
    public final AtomicInteger B = new AtomicInteger();
    public final AtomicLong D = new AtomicLong();
    public final AtomicInteger E = new AtomicInteger();
    public final float[] O = new float[50000];
    public float P = Float.MAX_VALUE;
    public int Q = -1;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PacketDropReason {
        private static final /* synthetic */ PacketDropReason[] $VALUES;
        public static final PacketDropReason ADD_FRAME_OVERFLOW;
        public static final PacketDropReason ADD_TIMESTAMP_OVERFLOW;
        public static final PacketDropReason POLL_IF_DUE;
        public static final PacketDropReason TILL_KEYFRAME;
        public static final PacketDropReason TILL_TIMESTAMP;
        public static final PacketDropReason TIMESTAMP_ORDER;
        public static final PacketDropReason TIMESTAMP_ORDER_NON_KEY_FRAME;
        public static final PacketDropReason WAITING_KEY_FRAME;

        static {
            PacketDropReason packetDropReason = new PacketDropReason("WAITING_KEY_FRAME", 0);
            WAITING_KEY_FRAME = packetDropReason;
            PacketDropReason packetDropReason2 = new PacketDropReason("TIMESTAMP_ORDER", 1);
            TIMESTAMP_ORDER = packetDropReason2;
            PacketDropReason packetDropReason3 = new PacketDropReason("TIMESTAMP_ORDER_NON_KEY_FRAME", 2);
            TIMESTAMP_ORDER_NON_KEY_FRAME = packetDropReason3;
            PacketDropReason packetDropReason4 = new PacketDropReason("ADD_TIMESTAMP_OVERFLOW", 3);
            ADD_TIMESTAMP_OVERFLOW = packetDropReason4;
            PacketDropReason packetDropReason5 = new PacketDropReason("ADD_FRAME_OVERFLOW", 4);
            ADD_FRAME_OVERFLOW = packetDropReason5;
            PacketDropReason packetDropReason6 = new PacketDropReason("TILL_KEYFRAME", 5);
            TILL_KEYFRAME = packetDropReason6;
            PacketDropReason packetDropReason7 = new PacketDropReason("POLL_IF_DUE", 6);
            POLL_IF_DUE = packetDropReason7;
            PacketDropReason packetDropReason8 = new PacketDropReason("TILL_TIMESTAMP", 7);
            TILL_TIMESTAMP = packetDropReason8;
            $VALUES = new PacketDropReason[]{packetDropReason, packetDropReason2, packetDropReason3, packetDropReason4, packetDropReason5, packetDropReason6, packetDropReason7, packetDropReason8};
        }

        public PacketDropReason() {
            throw null;
        }

        public static PacketDropReason valueOf(String str) {
            return (PacketDropReason) Enum.valueOf(PacketDropReason.class, str);
        }

        public static PacketDropReason[] values() {
            return (PacketDropReason[]) $VALUES.clone();
        }
    }

    public static final class a extends b {
        public final int c;
        public final int d;

        public a(int i, MediaFormat mediaFormat, @Nullable Boolean bool) {
            super(i, bool);
            if (mediaFormat != null) {
                this.c = mediaFormat.containsKey("sample-rate") ? mediaFormat.getInteger("sample-rate") : -1;
                this.d = mediaFormat.containsKey("channel-count") ? mediaFormat.getInteger("channel-count") : -1;
            } else {
                this.d = -1;
                this.c = -1;
            }
        }
    }

    public static class b {
        public final int a;

        @Nullable
        public final Boolean b;

        public b(int i, @Nullable Boolean bool) {
            this.a = i;
            this.b = bool;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        private static final /* synthetic */ c[] $VALUES;
        public static final c BUFFERING;
        public static final c IDLE;
        public static final c INIT;
        public static final c SENT;

        static {
            c cVar = new c("INIT", 0);
            INIT = cVar;
            c cVar2 = new c("IDLE", 1);
            IDLE = cVar2;
            c cVar3 = new c("BUFFERING", 2);
            BUFFERING = cVar3;
            c cVar4 = new c("SENT", 3);
            SENT = cVar4;
            $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public static final class d extends b {
        public final float c;
        public final float d;
        public final int e;

        public d(int i, MediaFormat mediaFormat, @Nullable Boolean bool) {
            super(i, bool);
            float f;
            float f2 = -1.0f;
            if (mediaFormat == null) {
                this.e = -1;
                this.d = -1.0f;
                this.c = -1.0f;
                return;
            }
            if (mediaFormat.containsKey("width")) {
                mediaFormat.getInteger("width");
            }
            if (mediaFormat.containsKey("height")) {
                mediaFormat.getInteger("height");
            }
            if (mediaFormat.containsKey("i-frame-interval")) {
                try {
                    try {
                        f = mediaFormat.getFloat("i-frame-interval");
                    } catch (Exception unused) {
                        f = mediaFormat.getInteger("i-frame-interval");
                    }
                } catch (Exception unused2) {
                    f = -1.0f;
                }
                this.c = f;
            } else {
                this.c = -1.0f;
            }
            if (mediaFormat.containsKey("frame-rate")) {
                try {
                    try {
                        f2 = mediaFormat.getFloat("frame-rate");
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    f2 = mediaFormat.getInteger("frame-rate");
                }
            }
            this.d = f2;
            this.e = mediaFormat.containsKey("rotation-degrees") ? mediaFormat.getInteger("rotation-degrees") : -1;
        }
    }

    static {
        new AtomicLong();
    }

    public DebugInfo() {
        R.getAndIncrement();
    }

    public final void a(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        AtomicLong atomicLong = this.A;
        long j2 = currentTimeMillis - atomicLong.get();
        int i = this.z + 1;
        this.z = i;
        if (j2 >= 1000) {
            this.B.set((int) ((i * 1000.0f) / j2));
            atomicLong.set(currentTimeMillis);
            this.z = 0;
        }
    }

    public final void b(long j, long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        AtomicLong atomicLong = this.n;
        long j3 = currentTimeMillis - atomicLong.get();
        int i = this.m + 1;
        this.m = i;
        if (j3 >= 1000) {
            this.o.set((int) ((i * 1000.0f) / j3));
            atomicLong.set(currentTimeMillis);
            this.m = 0;
        }
        int i2 = this.Q;
        float[] fArr = this.O;
        if (i2 < fArr.length - 1) {
            float f = j;
            this.P = Math.min(f, this.P);
            int i3 = this.Q + 1;
            this.Q = i3;
            fArr[i3] = f;
        }
    }

    public final void c(int i, int i2, int i3, int i4) {
        if (this.G == i && this.F == 1000 && this.H == i2 && this.I == i3 && this.J == i4) {
            return;
        }
        this.G = i;
        this.F = 1000;
        this.H = i2;
        this.I = i3;
        this.J = i4;
    }

    public final void d(c cVar) {
        c cVar2 = this.b;
        if (cVar != cVar2) {
            cVar2.ordinal();
            Objects.toString(this.b);
            cVar.ordinal();
            cVar.toString();
            this.b = cVar;
        }
    }

    public final String toString() {
        long currentTimeMillis = System.currentTimeMillis();
        double floatValue = currentTimeMillis - this.e.get() <= 1500 ? this.f.get().floatValue() : ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        int i = currentTimeMillis - this.k.get() <= 1500 ? this.l.get() : 0;
        int i2 = currentTimeMillis - this.q.get() <= 1500 ? this.r.get() : 0;
        int i3 = currentTimeMillis - this.n.get() <= 1500 ? this.o.get() : 0;
        int i4 = currentTimeMillis - this.x.get() <= 1500 ? this.y.get() : 0;
        int i5 = currentTimeMillis - this.D.get() <= 1500 ? this.E.get() : 0;
        int i6 = currentTimeMillis - this.A.get() <= 1500 ? this.B.get() : 0;
        d dVar = this.h;
        a aVar = this.u;
        String str = this.a;
        if (str != null) {
            str.isEmpty();
        }
        StringBuilder sb = new StringBuilder("net: ");
        sb.append(this.d);
        sb.append("\nbitrate: ");
        sb.append((float) floatValue);
        sb.append(" Kbps\nvideo: ");
        Boolean bool = dVar.b;
        String str2 = "SW";
        sb.append(bool == null ? "?" : bool.booleanValue() ? "HW" : "SW");
        sb.append(", restarts=");
        sb.append(dVar.a);
        sb.append(", ifi=");
        sb.append(dVar.c);
        sb.append(", fps=");
        sb.append(dVar.d);
        sb.append(", rot=");
        sb.append(dVar.e);
        sb.append(", dec_err=");
        sb.append(this.i.get());
        sb.append("\naudio: ");
        Boolean bool2 = aVar.b;
        if (bool2 == null) {
            str2 = "?";
        } else if (bool2.booleanValue()) {
            str2 = "HW";
        }
        sb.append(str2);
        sb.append(", restarts=");
        sb.append(aVar.a);
        sb.append(", sr=");
        sb.append(aVar.c);
        sb.append(", chc=");
        sb.append(aVar.d);
        sb.append(", dec_err=");
        sb.append(this.v.get());
        sb.append("\nAJB: ");
        sb.append(this.G + this.H);
        sb.append(" ms (");
        sb.append(this.G);
        sb.append(" + ");
        sb.append(this.H);
        sb.append("); ");
        sb.append(this.I);
        sb.append(" pkts; start=");
        sb.append(this.J);
        sb.append("\nVJB: ");
        sb.append(this.K);
        sb.append(" ms; ");
        cgn.a(this.L, i, " pkts\nv:  pkts=", ", mc={", sb);
        sb.append(i2);
        sb.append(',');
        sb.append(i3);
        sb.append("}, back_pts=");
        sb.append(this.s);
        sb.append("\na:  q_deep=");
        sb.append(this.F);
        sb.append(", q=");
        cgn.a(this.G, i4, ", pkts=", ", mc={", sb);
        sb.append(i5);
        sb.append(',');
        sb.append(i6);
        sb.append("}\nplb_thread:  buff_cnt=");
        sb.append(this.M);
        sb.append(", idle_cnt=");
        sb.append(this.N);
        return sb.toString();
    }
}
