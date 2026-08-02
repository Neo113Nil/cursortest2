package defpackage;

import androidx.media3.common.a;

/* loaded from: classes10.dex */
public final class coj implements g001 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.g001
    public final void a(ef90 ef90Var, int i, int i2) {
        ef90Var.L(i);
    }

    @Override // defpackage.g001
    public final int b(apg apgVar, int i, boolean z) {
        byte[] bArr = this.a;
        int read = apgVar.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        ny61.b();
        return 0;
    }

    @Override // defpackage.g001
    public final void c(long j, int i, int i2, int i3, f001 f001Var) {
    }

    @Override // defpackage.g001
    public final void d(a aVar) {
    }
}
