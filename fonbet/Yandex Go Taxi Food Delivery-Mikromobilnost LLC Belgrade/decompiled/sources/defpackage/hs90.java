package defpackage;

import java.util.Set;

/* loaded from: classes10.dex */
public final class hs90 implements dui0 {
    public final Set a;
    public final wz40 b = new wz40(new gts[16]);

    public hs90(Set set) {
        this.a = set;
    }

    public final wz40 a() {
        return this.b;
    }

    @Override // defpackage.dui0
    public final void b() {
        wz40 wz40Var = this.b;
        Object[] objArr = wz40Var.a;
        int i = wz40Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            dui0 dui0Var = ((gts) objArr[i2]).a;
            this.a.remove(dui0Var);
            dui0Var.b();
        }
    }

    @Override // defpackage.dui0
    public final void d() {
    }

    @Override // defpackage.dui0
    public final void e() {
    }
}
