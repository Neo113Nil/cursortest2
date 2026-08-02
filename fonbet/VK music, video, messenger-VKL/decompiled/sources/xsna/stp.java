package xsna;

/* compiled from: EqualizerGraph.kt */
/* loaded from: classes3.dex */
public final class stp {
    public static rtp a(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, int i) {
        long j15;
        long j16;
        long j17 = (i & 1) != 0 ? l5g.g : j;
        long j18 = (i & 2) != 0 ? l5g.g : j2;
        long j19 = (i & 4) != 0 ? l5g.g : j3;
        long j20 = (i & 8) != 0 ? l5g.g : j4;
        long j21 = (i & 16) != 0 ? l5g.g : j5;
        long j22 = (i & 32) != 0 ? l5g.e : j6;
        long j23 = (i & 64) != 0 ? l5g.g : j7;
        long j24 = (i & 128) != 0 ? l5g.c : j8;
        long j25 = j17;
        long j26 = (i & 256) != 0 ? l5g.c : j9;
        long j27 = (i & 512) != 0 ? l5g.c : j10;
        long j28 = (i & 1024) != 0 ? l5g.c : j11;
        long j29 = (i & 2048) != 0 ? l5g.c : j12;
        long j30 = (i & 4096) != 0 ? l5g.c : j13;
        long j31 = (i & 8192) != 0 ? l5g.c : j14;
        if (androidx.compose.runtime.b.d()) {
            j15 = j30;
            j16 = j18;
            androidx.compose.runtime.b.f(362915181, 0, 24576, "com.vk.music.design.compose.equalizer.EqualizerGraphDefaults.colors (EqualizerGraph.kt:220)");
        } else {
            j15 = j30;
            j16 = j18;
        }
        rtp rtpVar = new rtp(j25, j16, j19, j20, j21, j22, j23, j24, j26, j27, j28, j29, j15, j31);
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return rtpVar;
    }
}
