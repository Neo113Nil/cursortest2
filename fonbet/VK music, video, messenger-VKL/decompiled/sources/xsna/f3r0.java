package xsna;

import java.util.Arrays;
import java.util.Locale;
import one.video.player.model.FrameSize;

/* compiled from: Utils.kt */
/* loaded from: classes8.dex */
public final class f3r0 {

    /* compiled from: Utils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FrameSize.values().length];
            try {
                iArr[FrameSize._144p.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FrameSize._240p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FrameSize._360p.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FrameSize._480p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FrameSize._720p.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[FrameSize._1080p.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[FrameSize._1440p.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[FrameSize._2160p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[FrameSize._4320p.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static String a(long j, long j2) {
        return pzl.b(b(j), "-", b(j2));
    }

    public static String b(long j) {
        long j2 = 1000;
        long j3 = j / j2;
        long abs = Math.abs(j - (j2 * j3));
        String str = (j3 != 0 || j >= 0) ? "" : "-";
        if (abs == 0) {
            return String.valueOf(j3);
        }
        long j4 = 100;
        long j5 = abs % j4;
        if (((int) (j5 + ((((j5 ^ j4) & ((-j5) | j5)) >> 63) & j4))) == 0) {
            return String.format(Locale.US, "%s%d.%d", Arrays.copyOf(new Object[]{str, Long.valueOf(j3), Long.valueOf(abs / j4)}, 3));
        }
        long j6 = 10;
        long j7 = abs % j6;
        return ((int) (j7 + ((((j7 ^ j6) & ((-j7) | j7)) >> 63) & j6))) == 0 ? String.format(Locale.US, "%s%d.%02d", Arrays.copyOf(new Object[]{str, Long.valueOf(j3), Long.valueOf(abs / j6)}, 3)) : String.format(Locale.US, "%s%d.%03d", Arrays.copyOf(new Object[]{str, Long.valueOf(j3), Long.valueOf(abs)}, 3));
    }
}
