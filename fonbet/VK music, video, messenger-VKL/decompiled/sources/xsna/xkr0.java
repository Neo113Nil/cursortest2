package xsna;

import java.util.ArrayList;

/* compiled from: VectorCompose.kt */
/* loaded from: classes11.dex */
public final class xkr0 extends oc {
    public static nju t(gir0 gir0Var) {
        if (gir0Var instanceof nju) {
            return (nju) gir0Var;
        }
        throw new IllegalStateException("Cannot only insert VNode into Group");
    }

    @Override // xsna.fd3
    public final void e(int i, Object obj) {
        t((gir0) this.b).e(i, (gir0) obj);
    }

    @Override // xsna.fd3
    public final void g(int i, int i2) {
        t((gir0) this.b).h(i, i2);
    }

    @Override // xsna.fd3
    public final void h(int i, int i2, int i3) {
        nju t = t((gir0) this.b);
        ArrayList arrayList = t.c;
        int i4 = 0;
        if (i > i2) {
            while (i4 < i3) {
                gir0 gir0Var = (gir0) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2, gir0Var);
                i2++;
                i4++;
            }
        } else {
            while (i4 < i3) {
                gir0 gir0Var2 = (gir0) arrayList.get(i);
                arrayList.remove(i);
                arrayList.add(i2 - 1, gir0Var2);
                i4++;
            }
        }
        t.c();
    }

    @Override // xsna.fd3
    public final /* bridge */ /* synthetic */ void i(int i, Object obj) {
    }

    @Override // xsna.oc
    public final void s() {
        nju t = t((gir0) this.a);
        t.h(0, t.c.size());
    }
}
