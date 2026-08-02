package xsna;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import xsna.rgp0;

/* compiled from: DiscardingTrackOutput.java */
/* loaded from: classes12.dex */
public final class k0n implements rgp0 {
    public final byte[] a = new byte[4096];

    @Override // xsna.rgp0
    public final void b(xi90 xi90Var, int i, int i2) {
        xi90Var.Q(i);
    }

    @Override // xsna.rgp0
    public final int f(suk sukVar, int i, boolean z) throws IOException {
        byte[] bArr = this.a;
        int read = sukVar.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // xsna.rgp0
    public final void c(androidx.media3.common.a aVar) {
    }

    @Override // xsna.rgp0
    public final void a(long j, int i, int i2, int i3, @Nullable rgp0.a aVar) {
    }
}
