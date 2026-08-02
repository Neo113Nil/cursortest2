package sg.bigo.ads.common.utils;

import android.os.SystemClock;
import org.chromium.base.TimeUtils;

/* loaded from: classes9.dex */
public class s {
    public static final s a = new s() { // from class: sg.bigo.ads.common.utils.s.1
        @Override // sg.bigo.ads.common.utils.s
        public final long a(int i) {
            return i * 1000;
        }
    };
    public static final s b = new s() { // from class: sg.bigo.ads.common.utils.s.2
        @Override // sg.bigo.ads.common.utils.s
        public final long a(int i) {
            return i * 60000;
        }
    };
    public static final s c = new s() { // from class: sg.bigo.ads.common.utils.s.3
        @Override // sg.bigo.ads.common.utils.s
        public final long a(int i) {
            return i * 3600000;
        }
    };
    public static final s d = new s() { // from class: sg.bigo.ads.common.utils.s.4
        @Override // sg.bigo.ads.common.utils.s
        public final long a(int i) {
            return i * TimeUtils.MILLISECONDS_PER_DAY;
        }
    };
    private static a e = null;
    private static long f = 1619452800;

    public static class a {
        private final long a;
        private final long b = SystemClock.elapsedRealtime();

        public a(long j) {
            this.a = j;
        }

        public final long a() {
            return (SystemClock.elapsedRealtime() - this.b) + this.a;
        }
    }

    private s() {
    }

    public static long a() {
        long currentTimeMillis = System.currentTimeMillis() - sg.bigo.ads.bw.a.e();
        if (currentTimeMillis > 0) {
            return currentTimeMillis;
        }
        sg.bigo.ads.bw.a.f();
        return System.currentTimeMillis();
    }

    public static long b() {
        a aVar = e;
        return aVar == null ? System.currentTimeMillis() : aVar.a();
    }

    public /* synthetic */ s(byte b2) {
        this();
    }

    public long a(int i) {
        return i;
    }

    public static void a(long j) {
        if (j < f) {
            return;
        }
        a aVar = new a(j * 1000);
        if (e == null) {
            e = aVar;
        } else if (aVar.a() > e.a()) {
            e = aVar;
        }
    }
}
