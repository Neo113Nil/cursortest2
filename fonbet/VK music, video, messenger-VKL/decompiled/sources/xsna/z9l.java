package xsna;

import androidx.annotation.Nullable;
import java.util.Arrays;
import xsna.xu1;

/* compiled from: DefaultAllocator.java */
/* loaded from: classes12.dex */
public final class z9l implements xu1 {
    public final boolean a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public vu1[] f;

    public z9l(int i) {
        fxc0.p(i > 0);
        this.a = true;
        this.b = i;
        this.e = 0;
        this.f = new vu1[100];
    }

    @Override // xsna.xu1
    public final synchronized void a(vu1 vu1Var) {
        vu1[] vu1VarArr = this.f;
        int i = this.e;
        this.e = i + 1;
        vu1VarArr[i] = vu1Var;
        this.d--;
        notifyAll();
    }

    @Override // xsna.xu1
    public final synchronized vu1 allocate() {
        vu1 vu1Var;
        try {
            int i = this.d + 1;
            this.d = i;
            int i2 = this.e;
            if (i2 > 0) {
                vu1[] vu1VarArr = this.f;
                int i3 = i2 - 1;
                this.e = i3;
                vu1Var = vu1VarArr[i3];
                vu1Var.getClass();
                this.f[this.e] = null;
            } else {
                vu1 vu1Var2 = new vu1(new byte[this.b], 0);
                vu1[] vu1VarArr2 = this.f;
                if (i > vu1VarArr2.length) {
                    this.f = (vu1[]) Arrays.copyOf(vu1VarArr2, vu1VarArr2.length * 2);
                }
                vu1Var = vu1Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return vu1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [xsna.xu1$a] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [androidx.media3.exoplayer.source.o$a] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // xsna.xu1
    public final synchronized void b(@Nullable xu1.a aVar) {
        while (aVar != 0) {
            try {
                vu1[] vu1VarArr = this.f;
                int i = this.e;
                this.e = i + 1;
                vu1 vu1Var = aVar.c;
                vu1Var.getClass();
                vu1VarArr[i] = vu1Var;
                this.d--;
                aVar = aVar.d;
                if (aVar == 0 || aVar.c == null) {
                    aVar = 0;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        notifyAll();
    }

    public final synchronized void c(int i) {
        boolean z = i < this.c;
        this.c = i;
        if (z) {
            trim();
        }
    }

    @Override // xsna.xu1
    public final int getIndividualAllocationLength() {
        return this.b;
    }

    @Override // xsna.xu1
    public final synchronized void trim() {
        int max = Math.max(0, y2r0.g(this.c, this.b) - this.d);
        int i = this.e;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.f, max, i, (Object) null);
        this.e = max;
    }
}
