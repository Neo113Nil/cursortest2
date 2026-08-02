package yads;

import java.io.EOFException;

/* loaded from: classes10.dex */
public final class bl0 implements q83 {
    public final byte[] a = new byte[4096];

    @Override // yads.q83
    public final void a(long j, int i, int i2, int i3, p83 p83Var) {
    }

    @Override // yads.q83
    public final void a(nx0 nx0Var) {
    }

    @Override // yads.q83
    public final int a(l30 l30Var, int i, boolean z) {
        int read = l30Var.read(this.a, 0, Math.min(this.a.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // yads.q83
    public final void a(int i, kc2 kc2Var) {
        kc2Var.e(kc2Var.b + i);
    }
}
