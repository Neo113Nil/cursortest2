package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class a530 extends FutureTask {
    public final /* synthetic */ db3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a530(db3 db3Var, hxj hxjVar) {
        super(hxjVar);
        this.a = db3Var;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        db3 db3Var = this.a;
        AtomicBoolean atomicBoolean = db3Var.w;
        try {
            Object obj = get();
            if (atomicBoolean.get()) {
                return;
            }
            db3Var.b(obj);
        } catch (InterruptedException unused) {
        } catch (CancellationException unused2) {
            if (atomicBoolean.get()) {
                return;
            }
            db3Var.b(null);
        } catch (ExecutionException e) {
            ny61.n("An error occurred while executing doInBackground()", e.getCause());
        } catch (Throwable th) {
            ny61.n("An error occurred while executing doInBackground()", th);
        }
    }
}
