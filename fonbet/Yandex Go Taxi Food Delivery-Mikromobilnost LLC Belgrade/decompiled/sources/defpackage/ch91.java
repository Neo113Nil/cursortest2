package defpackage;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ch91 implements agb1, t070, iy60, sx60 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final pke c;
    public final zzw w;

    public /* synthetic */ ch91(Executor executor, pke pkeVar, zzw zzwVar, int i) {
        this.a = i;
        this.b = executor;
        this.c = pkeVar;
        this.w = zzwVar;
    }

    @Override // defpackage.agb1
    public final void a(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new na3(8, this, task));
                break;
            default:
                this.b.execute(new na3(9, this, task));
                break;
        }
    }

    @Override // defpackage.sx60
    public void onCanceled() {
        this.w.t();
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        this.w.r(exc);
    }

    @Override // defpackage.t070
    public void onSuccess(Object obj) {
        this.w.s(obj);
    }
}
