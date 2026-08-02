package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final /* synthetic */ class byj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dyj0 b;

    public /* synthetic */ byj0(dyj0 dyj0Var, int i) {
        this.a = i;
        this.b = dyj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        dyj0 dyj0Var = this.b;
        switch (i) {
            case 0:
                eyj0 eyj0Var = dyj0Var.c;
                z83.b(null, eyj0Var.a.getLooper(), Looper.myLooper());
                eyj0Var.d.b(dyj0Var);
                eyj0Var.b.post(new cyj0(dyj0Var, new txj0(eyj0Var.c.b.C().c()), 1));
                break;
            default:
                dyj0Var.c.d.d(dyj0Var);
                break;
        }
    }
}
