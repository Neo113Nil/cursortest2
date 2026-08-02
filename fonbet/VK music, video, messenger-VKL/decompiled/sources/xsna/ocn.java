package xsna;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.DispatchException;

/* compiled from: DispatchedTask.kt */
/* loaded from: classes11.dex */
public abstract class ocn<T> extends b5o0 {
    public int d;

    public ocn(int i) {
        this.d = i;
    }

    public abstract spj<T> b();

    public Throwable c(Object obj) {
        d8i d8iVar = obj instanceof d8i ? (d8i) obj : null;
        if (d8iVar != null) {
            return d8iVar.a;
        }
        return null;
    }

    public final void f(Throwable th) {
        rvj.a(b().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object g();

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        r4 = (xsna.eyx) r5.get(xsna.eyx.a.b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        try {
            mcn mcnVar = (mcn) b();
            ContinuationImpl continuationImpl = mcnVar.f;
            Object obj = mcnVar.h;
            kotlin.coroutines.d context = continuationImpl.getContext();
            Object b = mqo0.b(context, obj);
            eyx eyxVar = null;
            z2q0<?> c = b != mqo0.a ? mvj.c(continuationImpl, context, b) : null;
            try {
                kotlin.coroutines.d context2 = continuationImpl.getContext();
                Object g = g();
                Throwable c2 = c(g);
                if (c2 == null) {
                    int i = this.d;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                }
                if (eyxVar != null && !eyxVar.isActive()) {
                    CancellationException I = eyxVar.I();
                    a(I);
                    continuationImpl.resumeWith(new Result.Failure(I));
                } else if (c2 != null) {
                    continuationImpl.resumeWith(new Result.Failure(c2));
                } else {
                    continuationImpl.resumeWith(e(g));
                }
                s3q0 s3q0Var = s3q0.a;
                if (c == null || c.y0()) {
                    mqo0.a(context, b);
                }
            } catch (Throwable th) {
                if (c == null || c.y0()) {
                    mqo0.a(context, b);
                }
                throw th;
            }
        } catch (DispatchException e) {
            rvj.a(b().getContext(), e.getCause());
        } catch (Throwable th2) {
            f(th2);
        }
    }

    public void a(CancellationException cancellationException) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T e(Object obj) {
        return obj;
    }
}
