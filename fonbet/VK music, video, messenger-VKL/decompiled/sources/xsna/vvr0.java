package xsna;

import android.os.VibrationEffect;
import android.os.Vibrator;
import com.vk.log.L;

/* compiled from: VibrationManager.kt */
/* loaded from: classes17.dex */
public final class vvr0 {
    public static final bpn0 a = new bpn0(new ufm0(6));

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VibrationManager.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CALL_ACCEPT;
        public static final a CALL_DECLINE;
        public static final a CALL_RINGING;
        public static final a HEART_BEAT;
        private final int[] amps;
        private final long[] patternCompat;
        private final int repeat;
        private final long[] timings;

        static {
            a aVar = new a("CALL_RINGING", 0, new long[]{200, 200, 200, 200, 300, 100, 300, 300, 300, 100, 300, 300}, new int[]{51, 102, 153, 204, 255, 0, 120, 80, 30, 0, 30, 80}, new long[]{200, 200, 200, 200, 300, 100, 300, 300, 300, 100, 300, 300}, 6);
            CALL_RINGING = aVar;
            a aVar2 = new a("CALL_ACCEPT", 1, new long[0], new int[0], new long[]{0, 200}, -1);
            CALL_ACCEPT = aVar2;
            a aVar3 = new a("CALL_DECLINE", 2, new long[0], new int[0], new long[]{0, 100, 50, 100, 50, 100}, -1);
            CALL_DECLINE = aVar3;
            a aVar4 = new a("HEART_BEAT", 3, new long[]{100, 50, 50, 50, 50, 300, 100}, new int[]{0, 25, 50, 75, 100, 30, 200}, new long[]{200, 30, 600, 30}, 0);
            HEART_BEAT = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, long[] jArr, int[] iArr, long[] jArr2, int i2) {
            this.timings = jArr;
            this.amps = iArr;
            this.patternCompat = jArr2;
            this.repeat = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int[] h() {
            return this.amps;
        }

        public final long[] i() {
            return this.patternCompat;
        }

        public final int j() {
            return this.repeat;
        }

        public final long[] k() {
            return this.timings;
        }
    }

    public static Vibrator a() {
        return (Vibrator) a.getValue();
    }

    public static final void b(int i, long j) {
        L.p("VibrationManager", "onShotSoft: defMillSec=" + j + ", amplitude=" + i);
        if (a().hasVibrator()) {
            boolean a2 = gz80.a(26);
            L.p("VibrationManager", zhy0.a("onShotSoft: isAtLeastOreo=", a2));
            if (a2) {
                a().vibrate(VibrationEffect.createOneShot(j, i));
            } else {
                a().vibrate(j);
            }
        }
    }

    public static void c() {
        L.p("VibrationManager", "oneShotSoft");
        b(100, 75L);
    }

    public static void d() {
        L.p("VibrationManager", "oneShotSofter");
        b(75, 50L);
    }

    public static void e() {
        h(a.CALL_ACCEPT);
    }

    public static void f() {
        h(a.CALL_DECLINE);
    }

    public static void g() {
        L.p("VibrationManager", "stop");
        a().cancel();
    }

    public static void h(a aVar) {
        L.p("VibrationManager", "vibrateByPreset: preset=" + aVar.name());
        if (a().hasVibrator()) {
            boolean a2 = gz80.a(26);
            L.p("VibrationManager", zhy0.a("vibrateByPreset: isAtLeastOreo=", a2));
            if (!a2 || aVar.k().length == 0) {
                a().vibrate(aVar.i(), aVar.j());
            } else {
                a().vibrate(VibrationEffect.createWaveform(aVar.k(), aVar.h(), aVar.j()));
            }
        }
    }
}
