package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dpl0 implements Executor {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dpl0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new cpl0(0, runnable));
                break;
            default:
                ((t951) obj).c.post(runnable);
                break;
        }
    }
}
