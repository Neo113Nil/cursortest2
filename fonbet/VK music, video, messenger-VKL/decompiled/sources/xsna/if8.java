package xsna;

import android.view.ViewGroup;

/* compiled from: BroadcastFinishComponent.kt */
/* loaded from: classes7.dex */
public abstract class if8 {
    public final ViewGroup a;
    public final eh8 b;
    public final mvl0 c;
    public final lpd d;
    public wf8 e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    public if8(ViewGroup viewGroup, eh8 eh8Var, mvl0 mvl0Var, lpd lpdVar) {
        this.a = viewGroup;
        this.b = eh8Var;
        this.c = mvl0Var;
        this.d = lpdVar;
        bwt0.p0(viewGroup, false);
    }

    public final void a() {
        this.g.e();
        wf8 wf8Var = this.e;
        if (wf8Var != null) {
            bzb0 bzb0Var = wf8Var.z;
            bzb0Var.a();
            bzb0Var.a();
            wf8Var.b();
            wf8Var.A = false;
        }
        this.e = null;
        ViewGroup viewGroup = this.a;
        bwt0.p0(viewGroup, false);
        viewGroup.removeAllViews();
    }

    public final void b(boolean z) {
        io.reactivex.rxjava3.disposables.b bVar = this.f;
        if (!z) {
            bVar.e();
            a();
            return;
        }
        eh8 eh8Var = this.b;
        zjw0 zjw0Var = (zjw0) this;
        bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(eh8Var.c().a0(asu0.a.d()).p0(eh8Var.b()).U(new ju1(new yy(zjw0Var, 7), 4)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new defpackage.d(new com.vk.movika.sdk.base.observable.m(zjw0Var, 14), 10)));
    }
}
