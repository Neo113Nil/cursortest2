package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes4.dex */
public final class j8 extends k8 implements RandomAccess {
    public final k8 a;
    public final int b;
    public final int c;

    public j8(k8 k8Var, int i, int i2) {
        this.a = k8Var;
        this.b = i;
        g8 g8Var = k8.Companion;
        int size = k8Var.size();
        g8Var.getClass();
        g8.d(i, i2, size);
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k8.Companion.getClass();
        g8.b(i, this.c);
        return this.a.get(this.b + i);
    }

    @Override // defpackage.z6
    public final int getSize() {
        return this.c;
    }

    @Override // defpackage.k8, java.util.List
    public final List subList(int i, int i2) {
        k8.Companion.getClass();
        g8.d(i, i2, this.c);
        int i3 = this.b;
        return new j8(this.a, i + i3, i3 + i2);
    }
}
