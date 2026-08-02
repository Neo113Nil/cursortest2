package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class fq31 {
    public final dq31 a;

    public fq31(l2f l2fVar) {
        dq31 dq31Var = new dq31(l2fVar);
        this.a = dq31Var;
        dq31Var.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        r2.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        throw r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(id1 id1Var) {
        if (id1Var.a.equals(this.a.c) || id1Var.i) {
            return;
        }
        this.a.b.b.lock();
        try {
            if (!id1Var.a.equals(this.a.c) && !id1Var.i) {
                df5 df5Var = this.a.b;
                df5Var.b.lock();
                Iterator it = df5Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((bq31) it.next()).b.equals(id1Var.a)) {
                        break;
                    }
                }
                df5Var.b.unlock();
                this.a.b.offer(new bq31(id1Var, -1));
            }
        } finally {
        }
    }
}
