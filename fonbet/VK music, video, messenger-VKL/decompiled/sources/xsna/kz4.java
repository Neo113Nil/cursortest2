package xsna;

import com.vk.media.pipeline.model.effect.AudioEffect;

/* compiled from: AudioTrackInfo.kt */
/* loaded from: classes3.dex */
public final class kz4 {
    public final long a;
    public final long b;
    public final float c;
    public final double d;
    public final AudioEffect e;
    public final boolean f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    public kz4(long j, long j2, long j3, float f, double d, AudioEffect audioEffect, boolean z) {
        this.a = j;
        this.b = j3;
        this.c = f;
        this.d = d;
        this.e = audioEffect;
        this.f = z;
        this.g = j3 - j2;
        long j4 = (long) ((r5 * 1.0f) / d);
        this.h = j4;
        this.i = j;
        this.j = j + j4;
    }
}
