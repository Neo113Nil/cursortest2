package xsna;

import android.view.ViewGroup;

/* compiled from: VoipCallViewBroadcastPreviewSimpleLayerDelegate.kt */
/* loaded from: classes7.dex */
public final class dkw0 {
    public final l7s a;
    public final eh8 b;
    public final ViewGroup c;
    public s1j0 d;
    public bi8 e;
    public final io.reactivex.rxjava3.disposables.b f = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();

    public dkw0(l7s l7sVar, eh8 eh8Var, ViewGroup viewGroup) {
        this.a = l7sVar;
        this.b = eh8Var;
        this.c = viewGroup;
        bwt0.p0(viewGroup, false);
    }

    public final void a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        s1j0 s1j0Var = this.d;
        if (s1j0Var != null) {
            bi8 bi8Var = this.e;
            int width = (bi8Var == null || (viewGroup2 = bi8Var.b) == null) ? 0 : viewGroup2.getWidth();
            bi8 bi8Var2 = this.e;
            s1j0Var.a(0, 0, width, (bi8Var2 == null || (viewGroup = bi8Var2.b) == null) ? 0 : viewGroup.getHeight());
        }
        this.g.e();
        bi8 bi8Var3 = this.e;
        if (bi8Var3 != null) {
            bi8Var3.i.a();
            io.reactivex.rxjava3.disposables.c cVar = bi8Var3.l;
            if (cVar != null) {
                cVar.dispose();
            }
            bi8Var3.l = null;
            bi8Var3.m = false;
        }
        this.e = null;
        ViewGroup viewGroup3 = this.c;
        bwt0.p0(viewGroup3, false);
        viewGroup3.removeAllViews();
    }

    public final void b(boolean z) {
        io.reactivex.rxjava3.disposables.b bVar = this.f;
        if (!z) {
            bVar.e();
            a();
        } else {
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(this.b.c().a0(asu0.a.d()).U(new gwn0(new y160(24), 10)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new hmq0(new e0w0(this, 4), 12)));
        }
    }
}
