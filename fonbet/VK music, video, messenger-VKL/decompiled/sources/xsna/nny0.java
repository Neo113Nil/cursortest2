package xsna;

import java.util.Optional;

/* compiled from: InitialPacketAssembler.java */
/* loaded from: classes8.dex */
public final class nny0 extends rny0 {
    public byte[] i;

    @Override // xsna.rny0
    public final Optional<uny0> a(int i, int i2, byte[] bArr, byte[] bArr2) {
        return i2 < 1200 ? Optional.empty() : super.a(i, i2, bArr, bArr2);
    }

    @Override // xsna.rny0
    public final tly0 b(byte[] bArr, byte[] bArr2) {
        kgy0 kgy0Var = this.a.a;
        byte[] bArr3 = this.i;
        cly0 cly0Var = new cly0(kgy0Var, bArr, bArr2);
        cly0Var.h = bArr3;
        sny0 sny0Var = this.e;
        long j = sny0Var.a;
        sny0Var.a = 1 + j;
        if (j < 0) {
            throw new IllegalArgumentException();
        }
        cly0Var.b = j;
        return cly0Var;
    }
}
