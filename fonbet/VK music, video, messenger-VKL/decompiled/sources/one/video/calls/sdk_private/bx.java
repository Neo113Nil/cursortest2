package one.video.calls.sdk_private;

import java.time.Clock;
import java.time.Instant;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.function.IntSupplier;
import xsna.mby0;
import xsna.sp;
import xsna.vhy0;

/* compiled from: IdleTimer.java */
/* loaded from: classes8.dex */
public final class bx {
    public final Clock a;
    public final ScheduledExecutorService b;
    public final int c;
    public volatile long d;
    public final bE e;
    public volatile IntSupplier f;
    public volatile Instant g;
    public volatile boolean h;
    public volatile a i;
    public ScheduledFuture<?> j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IdleTimer.java */
    public static final class a {
        public static final a a;
        public static final a b;
        private static final /* synthetic */ a[] c;

        static {
            a aVar = new a("PACKET_RECEIVED", 0);
            a = aVar;
            a aVar2 = new a("PACKET_SENT", 1);
            b = aVar2;
            c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) c.clone();
        }
    }

    public bx(bE bEVar, sp spVar) {
        Clock systemUTC = Clock.systemUTC();
        this.a = systemUTC;
        this.e = bEVar;
        this.f = new vhy0();
        this.c = 1000;
        this.b = Executors.newScheduledThreadPool(1, new mby0("idle-timer"));
        this.g = systemUTC.instant();
        this.i = a.a;
    }
}
