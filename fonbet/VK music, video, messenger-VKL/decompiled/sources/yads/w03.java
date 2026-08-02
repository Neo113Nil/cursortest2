package yads;

import java.util.Arrays;

/* loaded from: classes10.dex */
public final class w03 implements ch1 {
    public final u30 a;
    public final v43 b;
    public byte[] c;

    public w03(p30 p30Var, u30 u30Var) {
        wg1.a();
        this.a = u30Var;
        this.b = new v43(p30Var);
    }

    @Override // yads.ch1
    public final void a() {
        int i;
        v43 v43Var;
        byte[] bArr;
        v43 v43Var2 = this.b;
        v43Var2.b = 0L;
        try {
            v43Var2.a(this.a);
            do {
                i = (int) this.b.b;
                byte[] bArr2 = this.c;
                if (bArr2 == null) {
                    this.c = new byte[1024];
                } else if (i == bArr2.length) {
                    this.c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                v43Var = this.b;
                bArr = this.c;
            } while (v43Var.read(bArr, i, bArr.length - i) != -1);
            s30.a(this.b);
        } catch (Throwable th) {
            s30.a(this.b);
            throw th;
        }
    }

    @Override // yads.ch1
    public final void b() {
    }
}
