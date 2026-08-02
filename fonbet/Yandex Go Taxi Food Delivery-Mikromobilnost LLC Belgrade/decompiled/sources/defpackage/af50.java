package defpackage;

import android.os.Handler;
import kotlin.Result;
import kotlin.a;

/* loaded from: classes12.dex */
public final class af50 extends ad5 {
    public final ej60 A;
    public final l0b0 B;
    public final jgu0 C;
    public long D;
    public final sf30 E;
    public final i3y F;
    public final r8h x;
    public final md50 y;
    public final ky2 z;

    public af50(r8h r8hVar, md50 md50Var, ky2 ky2Var, ej60 ej60Var, l0b0 l0b0Var, jgu0 jgu0Var) {
        super(ab50.class);
        this.x = r8hVar;
        this.y = md50Var;
        this.z = ky2Var;
        this.A = ej60Var;
        this.B = l0b0Var;
        this.C = jgu0Var;
        this.E = new sf30(12, this);
        this.F = a.a(new ah40(23));
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((Handler) this.F.getValue()).removeCallbacks(this.E);
        this.A.a(172332, null);
    }

    @Override // defpackage.zc5
    public final void Gg() {
        Object failure;
        ld50 a = this.y.a();
        l0b0 l0b0Var = this.B;
        try {
            boolean z = l0b0Var.b() && l0b0Var.i();
            ((ab50) Dg()).startForeground(a, z);
            this.z.k(Dg().getClass());
            if (!z && jx81.g() && this.D > 0) {
                ((Handler) this.F.getValue()).postAtTime(this.E, this.D + 18000000);
            }
            failure = zy11.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a2 = Result.a(failure);
        if (a2 != null) {
            ((ab50) Dg()).startForeground(172332, a.a);
            xby.l(jst.e, "NAVIGATOR_SERVICE:UPDATE_STATE", null, a2, "NavigatorService error while", 2);
            Kg();
        }
    }

    public final void Kg() {
        this.z.m(Dg().getClass());
        ((ab50) Dg()).stopForeground(1);
        ((ab50) Dg()).stopSelf();
    }
}
