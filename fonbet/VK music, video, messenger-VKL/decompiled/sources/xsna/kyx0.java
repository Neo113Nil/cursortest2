package xsna;

import androidx.work.DirectExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Lambda;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class kyx0 implements ub9.c {
    public final /* synthetic */ Executor b;
    public final /* synthetic */ Lambda c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kyx0(Executor executor, gzs gzsVar) {
        this.b = executor;
        this.c = (Lambda) gzsVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
    @Override // xsna.ub9.c
    public final Object attachCompleter(final ub9.a aVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar.a(new Runnable() { // from class: xsna.lyx0
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        }, DirectExecutor.INSTANCE);
        final ?? r2 = this.c;
        this.b.execute(new Runnable(atomicBoolean, aVar, r2) { // from class: xsna.myx0
            public final /* synthetic */ AtomicBoolean b;
            public final /* synthetic */ ub9.a c;
            public final /* synthetic */ Lambda d;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.d = (Lambda) r2;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.internal.Lambda, xsna.gzs] */
            @Override // java.lang.Runnable
            public final void run() {
                ub9.a aVar2 = this.c;
                ?? r1 = this.d;
                if (this.b.get()) {
                    return;
                }
                try {
                    aVar2.b(r1.invoke());
                } catch (Throwable th) {
                    aVar2.d(th);
                }
            }
        });
        return s3q0.a;
    }
}
