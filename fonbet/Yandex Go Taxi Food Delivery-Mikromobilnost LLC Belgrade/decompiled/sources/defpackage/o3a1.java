package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o3a1 implements agb1, t070, iy60, sx60 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object w;

    public o3a1(Executor executor, sx60 sx60Var) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.w = sx60Var;
    }

    @Override // defpackage.agb1
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                if (task.m()) {
                    synchronized (this.c) {
                    }
                    this.b.execute(new h3s0(28, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.c) {
                }
                this.b.execute(new na3(10, this, task));
                return;
            case 2:
                if (task.o() || task.m()) {
                    return;
                }
                synchronized (this.c) {
                }
                this.b.execute(new na3(12, this, task));
                return;
            case 3:
                if (task.o()) {
                    synchronized (this.c) {
                    }
                    this.b.execute(new na3(13, this, task));
                    return;
                }
                return;
            default:
                this.b.execute(new na3(16, this, task));
                return;
        }
    }

    @Override // defpackage.sx60
    public void onCanceled() {
        ((zzw) this.w).t();
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        ((zzw) this.w).r(exc);
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        ((zzw) this.w).s(obj);
    }

    public o3a1(Executor executor, wx60 wx60Var) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.w = wx60Var;
    }

    public o3a1(Executor executor, iy60 iy60Var) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.w = iy60Var;
    }

    public o3a1(Executor executor, t070 t070Var) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.w = t070Var;
    }

    public o3a1(Executor executor, h3v0 h3v0Var, zzw zzwVar) {
        this.a = 4;
        this.b = executor;
        this.c = h3v0Var;
        this.w = zzwVar;
    }
}
