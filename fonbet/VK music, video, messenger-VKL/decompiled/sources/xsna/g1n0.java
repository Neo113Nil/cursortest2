package xsna;

import androidx.annotation.Nullable;
import androidx.media3.common.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import xsna.a1n0;
import xsna.rgp0;

/* compiled from: SubtitleTranscodingTrackOutput.java */
/* loaded from: classes12.dex */
public final class g1n0 implements rgp0 {
    public final rgp0 a;
    public final a1n0.a b;

    @Nullable
    public a1n0 g;
    public androidx.media3.common.a h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = y2r0.b;
    public final xi90 c = new xi90();

    public g1n0(rgp0 rgp0Var, a1n0.a aVar) {
        this.a = rgp0Var;
        this.b = aVar;
    }

    @Override // xsna.rgp0
    public final void a(final long j, final int i, int i2, int i3, @Nullable rgp0.a aVar) {
        if (this.g == null) {
            this.a.a(j, i, i2, i3, aVar);
            return;
        }
        fxc0.q(aVar == null, "DRM on subtitles is not supported");
        int i4 = (this.e - i3) - i2;
        try {
            this.g.a(this.f, i4, i2, a1n0.b.c, new j7j() { // from class: xsna.f1n0
                @Override // xsna.j7j
                public final void accept(Object obj) {
                    wkk wkkVar = (wkk) obj;
                    g1n0 g1n0Var = g1n0.this;
                    g1n0Var.h.getClass();
                    byte[] a = tkk.a(wkkVar.a, wkkVar.c);
                    xi90 xi90Var = g1n0Var.c;
                    xi90Var.getClass();
                    xi90Var.N(a, a.length);
                    g1n0Var.a.d(a.length, xi90Var);
                    long j2 = wkkVar.b;
                    long j3 = j;
                    if (j2 == C.TIME_UNSET) {
                        fxc0.z(g1n0Var.h.s == Long.MAX_VALUE);
                    } else {
                        long j4 = g1n0Var.h.s;
                        j3 = j4 == Long.MAX_VALUE ? j3 + j2 : j2 + j4;
                    }
                    g1n0Var.a.a(j3, i | 1, a.length, 0, null);
                }
            });
        } catch (RuntimeException e) {
            if (!this.i) {
                throw e;
            }
            ahn.G("Parsing subtitles failed, ignoring sample.", e);
        }
        int i5 = i4 + i2;
        this.d = i5;
        if (i5 == this.e) {
            this.d = 0;
            this.e = 0;
        }
    }

    @Override // xsna.rgp0
    public final void b(xi90 xi90Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(xi90Var, i, i2);
            return;
        }
        h(i);
        xi90Var.n(this.f, this.e, i);
        this.e += i;
    }

    @Override // xsna.rgp0
    public final void c(androidx.media3.common.a aVar) {
        aVar.n.getClass();
        String str = aVar.n;
        fxc0.p(io20.i(str) == 3);
        boolean equals = aVar.equals(this.h);
        a1n0.a aVar2 = this.b;
        if (!equals) {
            this.h = aVar;
            this.g = aVar2.a(aVar) ? aVar2.c(aVar) : null;
        }
        a1n0 a1n0Var = this.g;
        rgp0 rgp0Var = this.a;
        if (a1n0Var == null) {
            rgp0Var.c(aVar);
            return;
        }
        a.C0043a a = aVar.a();
        a.m = io20.q("application/x-media3-cues");
        a.j = str;
        a.r = Long.MAX_VALUE;
        a.K = aVar2.b(aVar);
        zjh0.d(a, rgp0Var);
    }

    @Override // xsna.rgp0
    public final int f(suk sukVar, int i, boolean z) throws IOException {
        if (this.g == null) {
            return this.a.f(sukVar, i, z);
        }
        h(i);
        int read = sukVar.read(this.f, this.e, i);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void h(int i) {
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr2;
    }
}
