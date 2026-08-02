package defpackage;

/* loaded from: classes7.dex */
public final class np81 implements fb81 {
    public final byte[] a = new byte[4096];

    @Override // defpackage.fb81
    public final void a(int i, dl81 dl81Var) {
        dl81Var.m(dl81Var.b + i);
    }

    @Override // defpackage.fb81
    public final void b(long j, int i, int i2, int i3, v781 v781Var) {
    }

    @Override // defpackage.fb81
    public final int c(jz61 jz61Var, int i, boolean z) {
        byte[] bArr = this.a;
        int v = jz61Var.v(0, Math.min(bArr.length, i), bArr);
        if (v != -1) {
            return v;
        }
        if (z) {
            return -1;
        }
        ny61.b();
        return 0;
    }

    @Override // defpackage.fb81
    public final void k(qd81 qd81Var) {
    }
}
