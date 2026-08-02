package xsna;

import java.util.concurrent.CancellationException;
import xsna.lgj;

/* compiled from: BringIntoViewRequestPriorityQueue.kt */
/* loaded from: classes11.dex */
public final class xc8 {
    public final ci50<lgj.a> a = new ci50<>(new lgj.a[16]);

    public final void a(CancellationException cancellationException) {
        ci50<lgj.a> ci50Var = this.a;
        int i = ci50Var.d;
        kq9[] kq9VarArr = new kq9[i];
        for (int i2 = 0; i2 < i; i2++) {
            kq9VarArr[i2] = ci50Var.b[i2].b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            kq9VarArr[i3].z(cancellationException);
        }
        if (ci50Var.d == 0) {
            return;
        }
        xzw.c("uncancelled requests present");
    }

    public final void b() {
        ci50<lgj.a> ci50Var = this.a;
        k9x q = swe0.q(0, ci50Var.d);
        int i = q.b;
        int i2 = q.c;
        if (i <= i2) {
            while (true) {
                ci50Var.b[i].b.resumeWith(s3q0.a);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        ci50Var.g();
    }
}
