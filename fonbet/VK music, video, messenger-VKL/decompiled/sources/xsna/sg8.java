package xsna;

import android.view.ViewGroup;

/* compiled from: BroadcastLaunchComponent.kt */
/* loaded from: classes7.dex */
public final class sg8 {
    public final ViewGroup a;
    public final eh8 b;
    public final yyl0 c;
    public xg8 d;
    public final io.reactivex.rxjava3.disposables.b e = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();

    public sg8(ViewGroup viewGroup, eh8 eh8Var, yyl0 yyl0Var) {
        this.a = viewGroup;
        this.b = eh8Var;
        this.c = yyl0Var;
        bwt0.p0(viewGroup, false);
    }

    public final void a(boolean z) {
        io.reactivex.rxjava3.disposables.b bVar = this.e;
        if (z) {
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(this.b.c().a0(asu0.a.d()).U(new k7(new nk(6), 3)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new y50(new dg(this, 11), 5)));
            return;
        }
        bVar.e();
        this.f.e();
        xg8 xg8Var = this.d;
        if (xg8Var != null) {
            xg8Var.k = false;
        }
        this.d = null;
        ViewGroup viewGroup = this.a;
        bwt0.p0(viewGroup, false);
        viewGroup.removeAllViews();
    }
}
