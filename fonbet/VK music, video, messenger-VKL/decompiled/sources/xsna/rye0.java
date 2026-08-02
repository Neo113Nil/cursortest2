package xsna;

import android.media.MediaFormat;
import android.util.Size;
import com.vk.media.pipeline.model.source.picture.ImageMediaSource;
import java.nio.ByteBuffer;
import xsna.k0h0;

/* compiled from: RawVideoSource.kt */
/* loaded from: classes3.dex */
public final class rye0 implements tht0 {
    public final int b;
    public final long c;
    public final int d;
    public final int e;
    public double i;
    public final double f = 1000000.0d / 30;
    public final ByteBuffer g = ByteBuffer.allocateDirect(0);
    public final int h = 1;
    public final boolean j = true;

    public rye0(int i, long j, ImageMediaSource imageMediaSource) {
        this.b = i;
        this.c = j;
        Size a = nka0.a(imageMediaSource);
        this.d = a.getWidth();
        this.e = a.getHeight();
    }

    @Override // xsna.tht0
    public final int b() {
        return 0;
    }

    @Override // xsna.k0h0
    public final boolean d(long j, long j2) {
        return true;
    }

    @Override // xsna.tht0
    public final Integer e() {
        return 30;
    }

    @Override // xsna.k0h0
    public final k0h0.b g() {
        return new tll(this.g, (long) this.i, this.h, 1, true, this.j);
    }

    @Override // xsna.k0h0
    public final MediaFormat getFormat() {
        return null;
    }

    @Override // xsna.tht0
    public final int getHeight() {
        return this.e;
    }

    @Override // xsna.tht0
    public final int getWidth() {
        return this.d;
    }

    @Override // xsna.k0h0
    public final boolean i() {
        double d = this.i + this.f;
        this.i = d;
        return d <= ((double) this.c);
    }

    @Override // xsna.k0h0
    public final int m() {
        return this.b;
    }

    @Override // xsna.k0h0
    public final void seekTo(long j) {
        this.i = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RawVideoSource(");
        sb.append(this.d);
        sb.append('x');
        return vu5.b(sb, this.e, ')');
    }

    @Override // xsna.k0h0
    public final void release() {
    }
}
