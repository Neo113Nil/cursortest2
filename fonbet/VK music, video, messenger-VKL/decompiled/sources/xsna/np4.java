package xsna;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* compiled from: AudioHelper.kt */
/* loaded from: classes3.dex */
public final class np4 {
    public final int a;
    public final int b;
    public AudioTrack c = a();
    public final int d;
    public final int e;
    public final int f;
    public final gl4 g;
    public int h;

    public np4(int i, int i2) {
        this.a = i;
        this.b = i2;
        int i3 = i2 * 2;
        this.d = i3;
        int i4 = (int) ((i * 100) / 1000);
        this.e = i4;
        int i5 = i4 * i3;
        this.f = i5;
        this.g = new gl4(i5);
    }

    public final AudioTrack a() {
        return new AudioTrack(new AudioAttributes.Builder().setLegacyStreamType(3).setUsage(1).build(), new AudioFormat.Builder().setSampleRate(this.a).setEncoding(2).setChannelMask(this.b == 2 ? 12 : 4).build(), this.f, 1, 0);
    }

    public final void b(long j) {
        this.h = (int) ((j * this.a) / 1000);
        gl4 gl4Var = this.g;
        gl4Var.d = 0;
        gl4Var.e = 0;
        boolean z = this.c.getPlayState() == 3;
        this.c.pause();
        this.c.release();
        AudioTrack a = a();
        this.c = a;
        if (z) {
            a.play();
        }
    }
}
