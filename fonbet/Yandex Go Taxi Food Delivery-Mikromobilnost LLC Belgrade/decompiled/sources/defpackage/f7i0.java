package defpackage;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes15.dex */
public final class f7i0 {
    public final Handler a = new Handler();
    public final ArrayList b = new ArrayList();
    public final oxe0 c = new oxe0(17, this);
    public long d;

    public f7i0(wff0 wff0Var) {
        wff0Var.a(new fn3(13, this));
    }

    public final void a(long j) {
        if (this.d == j) {
            return;
        }
        this.d = j;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            tf4 tf4Var = ((e7i0) it.next()).a;
            if (tf4Var != null) {
                ((x6f0) tf4Var.b).d(Long.valueOf(j));
            }
        }
        Handler handler = this.a;
        handler.removeCallbacksAndMessages(null);
        handler.postDelayed(this.c, 1000L);
    }
}
