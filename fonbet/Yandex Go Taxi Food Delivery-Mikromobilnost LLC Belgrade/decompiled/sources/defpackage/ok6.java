package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public final class ok6 {
    public final wz40 a = new wz40(new gge[16]);

    public final void a(CancellationException cancellationException) {
        wz40 wz40Var = this.a;
        int i = wz40Var.c;
        i18[] i18VarArr = new i18[i];
        for (int i2 = 0; i2 < i; i2++) {
            i18VarArr[i2] = ((gge) wz40Var.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            i18VarArr[i3].b(cancellationException);
        }
        if (wz40Var.c == 0) {
            return;
        }
        lxv.c("uncancelled requests present");
    }

    public final void b() {
        wz40 wz40Var = this.a;
        d6w n = y6i0.n(0, wz40Var.c);
        int i = n.a;
        int i2 = n.b;
        if (i <= i2) {
            while (true) {
                ((gge) wz40Var.a[i]).b.resumeWith(zy11.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        wz40Var.g();
    }
}
