package xsna;

import java.nio.ByteBuffer;
import xsna.k0h0;

/* compiled from: DefaultSample.kt */
/* loaded from: classes3.dex */
public final class tll implements k0h0.b {
    public final ByteBuffer a;
    public final long b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;

    public /* synthetic */ tll(long j, int i, ByteBuffer byteBuffer) {
        this(byteBuffer, j, i, 1, false, true);
    }

    @Override // xsna.k0h0.b
    public final long a() {
        return this.b;
    }

    @Override // xsna.k0h0.b
    public final boolean b() {
        return this.f;
    }

    @Override // xsna.k0h0.b
    public final boolean c() {
        return this.e;
    }

    @Override // xsna.k0h0.b
    public final ByteBuffer getData() {
        return this.a;
    }

    @Override // xsna.k0h0.b
    public final int getFlags() {
        return this.d;
    }

    @Override // xsna.k0h0.b
    public final int getSize() {
        return this.c;
    }

    public tll(ByteBuffer byteBuffer, long j, int i, int i2, boolean z, boolean z2) {
        this.a = byteBuffer;
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = z2;
    }
}
