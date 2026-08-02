package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.internal.ServerMessageRef;

/* loaded from: classes15.dex */
public final class hta0 implements a9b {
    public final ServerMessageRef a;
    public ebi0 b;
    public final Handler c = new Handler();
    public final /* synthetic */ oy80 w;

    public hta0(oy80 oy80Var, ServerMessageRef serverMessageRef, ebi0 ebi0Var) {
        this.w = oy80Var;
        this.a = serverMessageRef;
        this.b = ebi0Var;
    }

    @Override // defpackage.a9b
    public final void B(j9b j9bVar) {
        ssa0 ssa0Var;
        ebi0 ebi0Var;
        long j = j9bVar.h().a;
        kta0 kta0Var = (kta0) this.w.b;
        long timestamp = this.a.getTimestamp();
        synchronized (kta0Var) {
            ssa0Var = (ssa0) kta0Var.b.get(new ita0(j, timestamp));
        }
        if (ssa0Var == null || (ebi0Var = this.b) == null) {
            return;
        }
        ebi0Var.c(ssa0Var);
    }

    public final void a(ssa0 ssa0Var) {
        this.c.post(new yo90(8, this, ssa0Var));
    }

    @Override // defpackage.a9b
    public final void close() {
        this.b = null;
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        long j = ((m8g) s020Var).a.a;
        kta0 kta0Var = (kta0) this.w.b;
        long timestamp = this.a.getTimestamp();
        z83.g(null, kta0Var.a, Looper.myLooper());
        return new jta0(kta0Var, new ita0(j, timestamp), this);
    }
}
