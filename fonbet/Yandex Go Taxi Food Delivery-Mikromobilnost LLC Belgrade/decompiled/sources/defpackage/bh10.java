package defpackage;

import androidx.lifecycle.v;

/* loaded from: classes10.dex */
public final class bh10 implements pq60 {
    public final v a;
    public final pq60 b;
    public int c = -1;

    public bh10(v vVar, pq60 pq60Var) {
        this.a = vVar;
        this.b = pq60Var;
    }

    @Override // defpackage.pq60
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }
}
