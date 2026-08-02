package xsna;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes13.dex */
public final class di01 implements Runnable {
    public final /* synthetic */ qj01 b;
    public final /* synthetic */ Runnable c;

    public di01(qj01 qj01Var, Runnable runnable) {
        this.b = qj01Var;
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qj01 qj01Var = this.b;
        qj01Var.a();
        qj01Var.d().k();
        if (qj01Var.q == null) {
            qj01Var.q = new ArrayList();
        }
        qj01Var.q.add(this.c);
        qj01Var.u();
    }
}
