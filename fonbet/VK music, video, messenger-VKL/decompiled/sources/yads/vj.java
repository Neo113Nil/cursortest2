package yads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class vj extends xj {
    public final long b;
    public final ArrayList c;
    public final ArrayList d;

    public vj(int i, long j) {
        super(i);
        this.b = j;
        this.c = new ArrayList();
        this.d = new ArrayList();
    }

    public final vj b(int i) {
        int size = this.d.size();
        for (int i2 = 0; i2 < size; i2++) {
            vj vjVar = (vj) this.d.get(i2);
            if (vjVar.a == i) {
                return vjVar;
            }
        }
        return null;
    }

    public final wj c(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            wj wjVar = (wj) this.c.get(i2);
            if (wjVar.a == i) {
                return wjVar;
            }
        }
        return null;
    }

    @Override // yads.xj
    public final String toString() {
        return xj.a(this.a) + " leaves: " + Arrays.toString(this.c.toArray()) + " containers: " + Arrays.toString(this.d.toArray());
    }
}
