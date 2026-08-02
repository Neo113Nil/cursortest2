package defpackage;

import java.util.Iterator;

/* loaded from: classes11.dex */
public final class eq31 {
    public final cq31 a;

    public eq31() {
        cq31 cq31Var = new cq31();
        this.a = cq31Var;
        cq31Var.start();
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
    public final void a(hd1 hd1Var) {
        if (hd1Var.a.equals(this.a.b) || hd1Var.f) {
            return;
        }
        this.a.a.b.lock();
        try {
            if (!hd1Var.a.equals(this.a.b) && !hd1Var.f) {
                cf5 cf5Var = this.a.a;
                cf5Var.b.lock();
                Iterator it = cf5Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (((aq31) it.next()).b.equals(hd1Var.a)) {
                        break;
                    }
                }
                cf5Var.b.unlock();
                this.a.a.offer(new aq31(hd1Var, -1));
            }
        } finally {
        }
    }
}
