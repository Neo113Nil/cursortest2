package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public final class evy implements gq60 {
    public final dy40 a = new dy40();
    public final HashMap b = new HashMap();
    public hs7 c;

    @Override // defpackage.gq60
    public final void a(dq60 dq60Var) {
        synchronized (this.b) {
            this.b.remove(dq60Var);
            if (this.b.isEmpty()) {
                geb1.f().execute(new cvy(this, 0));
            }
        }
    }

    @Override // defpackage.gq60
    public final void b(Executor executor, dq60 dq60Var) {
        synchronized (this.b) {
            boolean isEmpty = this.b.isEmpty();
            this.b.put(dq60Var, executor);
            if (isEmpty) {
                geb1.f().execute(new cvy(this, 1));
            } else {
                executor.execute(new r7v(22, this, dq60Var));
            }
        }
    }

    @Override // defpackage.gq60
    public final euy c() {
        return jx81.r(new uhx(3, this));
    }
}
