package xsna;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes.dex */
public final class lxz0 implements xd01 {
    public final Context a;
    public final t801 b;
    public final byz0 c;
    public final Executor d;

    public lxz0(Context context, ThreadPoolExecutor threadPoolExecutor, byz0 byz0Var, t801 t801Var) {
        this.a = context;
        this.b = t801Var;
        this.c = byz0Var;
        this.d = threadPoolExecutor;
    }

    @Override // xsna.xd01
    public final void a(List list, la01 la01Var) {
        if (klk0.e.get() == null) {
            throw new IllegalStateException("Ingestion should only be called in SplitCompat mode.");
        }
        this.d.execute(new fxz0(this, list, la01Var));
    }
}
