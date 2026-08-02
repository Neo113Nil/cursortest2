package xsna;

import androidx.work.DirectExecutor;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.ub9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class xgz implements ub9.c, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xgz(Object obj, Object obj2, Object obj3) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // xsna.ub9.c
    public Object attachCompleter(ub9.a aVar) {
        Executor executor = (Executor) this.b;
        String str = (String) this.c;
        gzs gzsVar = (gzs) this.d;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        aVar.a(new o1(atomicBoolean, 9), DirectExecutor.INSTANCE);
        executor.execute(new vke(atomicBoolean, aVar, gzsVar, 1));
        return str;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }
}
