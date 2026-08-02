package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import ru.yandex.taxi.utils.f;

/* loaded from: classes14.dex */
public final class f09 extends r8 {
    public final f c;
    public final an8 w;
    public u08 x;

    public f09(ah00 ah00Var) {
        super(5, ah00Var);
        ConcurrentHashMap concurrentHashMap = pwf0.a;
        this.c = new f(e070.class);
        this.w = new an8(new e09(this));
    }

    public final void Hg(xz4 xz4Var) {
        an8 an8Var = this.w;
        an8Var.getClass();
        an8Var.u(new n09(xz4Var));
    }

    public final void Ig(xz4 xz4Var) {
        boolean z;
        an8 an8Var = this.w;
        xz4 n = an8Var.n();
        if (n != null) {
            z = an8Var.u(new n09(n));
            an8Var.u(new m09(n));
        } else {
            z = false;
        }
        jst.e.getClass();
        an8Var.u(new l09(xz4Var));
        if (z) {
            an8Var.u(new o09(xz4Var));
        }
    }

    public final void setVisible(boolean z) {
        svp0 i;
        xz4 n = this.w.n();
        if (n == null || (i = n.i()) == null) {
            return;
        }
        i.setVisible(z);
    }
}
