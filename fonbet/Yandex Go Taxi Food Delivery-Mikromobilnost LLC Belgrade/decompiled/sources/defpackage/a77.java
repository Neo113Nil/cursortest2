package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes10.dex */
public final class a77 {
    public final ArrayDeque a;

    public a77(int i) {
        switch (i) {
            case 1:
                this.a = new ArrayDeque(16);
                break;
            default:
                this.a = new ArrayDeque(0);
                break;
        }
    }

    public synchronized void a(ygt ygtVar) {
        ygtVar.b = null;
        ygtVar.c = null;
        this.a.offer(ygtVar);
    }

    public void b() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + d());
    }

    public void c(long j) {
        long d = d();
        if (d != j) {
            if (d != -1) {
                if (d != -2) {
                    return;
                } else {
                    d = -2;
                }
            }
            StringBuilder w = unr0.w(j, "expected non-string scope or scope ", " but found ");
            w.append(d);
            throw new IOException(w.toString());
        }
    }

    public long d() {
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }
}
