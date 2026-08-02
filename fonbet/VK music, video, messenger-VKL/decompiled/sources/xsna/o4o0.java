package xsna;

import bolts.ExecutorException;
import java.util.concurrent.Executor;

/* compiled from: Task.java */
/* loaded from: classes12.dex */
public final class o4o0 implements tpj<Object, Void> {
    public final /* synthetic */ vou a;
    public final /* synthetic */ tpj b;
    public final /* synthetic */ Executor c;

    public o4o0(vou vouVar, tpj tpjVar, Executor executor) {
        this.a = vouVar;
        this.b = tpjVar;
        this.c = executor;
    }

    @Override // xsna.tpj
    public final void a(e5o0 e5o0Var) throws Exception {
        vou vouVar = this.a;
        tpj tpjVar = this.b;
        try {
            this.c.execute(new p4o0(vouVar, tpjVar, e5o0Var));
        } catch (Exception e) {
            vouVar.i(new ExecutorException(e));
        }
    }
}
