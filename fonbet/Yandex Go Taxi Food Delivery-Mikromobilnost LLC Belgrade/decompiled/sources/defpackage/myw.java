package defpackage;

import com.google.android.gms.measurement.internal.g;
import com.google.android.gms.measurement.internal.j;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes10.dex */
public final class myw implements Executor {
    public static volatile myw c;
    public final /* synthetic */ int a;
    public final Object b;

    public myw() {
        this.a = 0;
        this.b = Executors.newFixedThreadPool(2, new of3(2));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ExecutorService) obj).execute(runnable);
                break;
            default:
                aaa1 aaa1Var = ((g) ((j) obj).b).z;
                g.g(aaa1Var);
                aaa1Var.Pg(runnable);
                break;
        }
    }

    public myw(j jVar) {
        this.a = 1;
        this.b = jVar;
    }
}
