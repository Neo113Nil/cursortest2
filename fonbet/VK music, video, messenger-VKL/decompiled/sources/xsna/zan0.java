package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import com.vk.queuesync.sync.models.SuperAppQueueAccessException;

/* compiled from: SuperAppQueueSyncWorker.kt */
/* loaded from: classes5.dex */
public final class zan0 {
    public final e0a a;
    public final xan0<?> b;
    public final xan0<?> c;
    public final laq d;
    public final sxl0 e;
    public final boolean f;

    public zan0(e0a e0aVar, xan0 xan0Var, xan0 xan0Var2, laq laqVar, sxl0 sxl0Var, boolean z) {
        this.a = e0aVar;
        this.b = xan0Var;
        this.c = xan0Var2;
        this.d = laqVar;
        this.e = sxl0Var;
        this.f = z;
    }

    public final void a(xan0<?> xan0Var) {
        (this.f ? new van0(gau.a.b(), new ubn0()) : new om3(this.a)).b(xan0Var.b, new y2(this, xan0Var), new g06(14, this, xan0Var));
    }

    public final void b() {
        if (this.b == null) {
            return;
        }
        xan0<?> xan0Var = this.c;
        if (xan0Var != null) {
            fco0.c();
            try {
                xan0Var.c.invoke();
            } catch (Throwable th) {
                fco0.c();
                if (th instanceof InterruptedException) {
                    throw th;
                }
                i0q0.c(new RuntimeException("Unhandled exception during queue event processing: " + xan0Var.a.a, th));
            }
        }
        c("syncLoop", new pvh0(this, 7));
    }

    public final void c(String str, gzs gzsVar) {
        while (true) {
            try {
                this.e.invoke(Long.valueOf(this.d.g));
                this.d.e();
                gzsVar.invoke();
                this.e.invoke(0L);
                return;
            } catch (VKApiExecutionException e) {
                if (e.s() == 10) {
                    laq laqVar = this.d;
                    laqVar.a(laqVar.d);
                } else {
                    this.d.b();
                }
                L.e(e);
            } catch (SuperAppQueueAccessException e2) {
                this.d.b();
                if (e2.d().b) {
                    L.e("Unexpected error during queue sync: ".concat(str));
                } else {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
            } catch (InterruptedException e3) {
                throw e3;
            } catch (Throwable th) {
                this.d.b();
                com.vk.metrics.eventtracking.b.a.a(th);
            }
        }
    }
}
