package xsna;

import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class p6q implements Executor {
    public final /* synthetic */ otu b;

    public /* synthetic */ p6q(otu otuVar) {
        this.b = otuVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.b.post(runnable);
    }
}
