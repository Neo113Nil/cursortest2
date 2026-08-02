package defpackage;

import android.os.Looper;
import androidx.room.util.a;
import com.yandex.messaging.core.net.entities.LeaveParams;
import com.yandex.messaging.core.net.entities.LeaveThreadParams;

/* loaded from: classes15.dex */
public final class b9y extends ky4 {
    public xo3 y;

    @Override // defpackage.ky4, defpackage.xx4, defpackage.hr
    public final void b() {
        xo3 xo3Var = this.y;
        if (xo3Var != null) {
            xo3Var.cancel();
            this.y = null;
        }
        super.b();
    }

    @Override // defpackage.b9b
    public final void k(j3b j3bVar, s020 s020Var) {
        xo3 a;
        p99 p99Var = (p99) ((m8g) s020Var).U.get();
        to3 to3Var = p99Var.c;
        o1b0 o1b0Var = p99Var.d;
        p99Var.g.getLooper();
        Looper.myLooper();
        z83.i();
        int i = 1;
        if (j3bVar.J) {
            o99 o99Var = new o99(p99Var, this, j3bVar, i);
            a = to3Var.a.a(new io3(20, to3Var, new LeaveThreadParams(o1b0Var.b), o99Var));
        } else {
            boolean z = o1b0Var.d;
            String str = o1b0Var.b;
            z83.i();
            o99 o99Var2 = new o99(p99Var, this, j3bVar, 0);
            a = to3Var.a.a(new io3(19, to3Var, new LeaveParams(str, ((Number) a.b(p99Var.a.Y().a, true, false, new b5a(str, 16))).longValue()), o99Var2));
        }
        this.y = a;
    }
}
