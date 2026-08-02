package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class muz extends FutureTask {
    public nuz a;

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        try {
            if (isCancelled()) {
                return;
            }
            try {
                this.a.e((euz) get());
            } catch (InterruptedException | ExecutionException e) {
                this.a.e(new euz(e));
            }
        } finally {
            this.a = null;
        }
    }
}
