package xsna;

import android.view.ViewGroup;
import xsna.hg1;

/* compiled from: VoipCallViewJoinLinkNotificationDelegate.kt */
/* loaded from: classes7.dex */
public final class hkw0 {
    public static final int e = cn70.b(8);
    public final ViewGroup a;
    public final ma9 b;
    public io.reactivex.rxjava3.disposables.c c;
    public ikv0 d;

    public hkw0(ViewGroup viewGroup, ma9 ma9Var) {
        this.a = viewGroup;
        this.b = ma9Var;
    }

    public final void a(boolean z) {
        if (!z) {
            io.reactivex.rxjava3.disposables.c cVar = this.c;
            if (cVar != null) {
                cVar.dispose();
            }
            this.c = null;
            ikv0 ikv0Var = this.d;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            this.d = null;
            return;
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.c;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.subjects.f<Object> fVar = ysg0.b.a;
        hg1.t4 t4Var = new hg1.t4();
        fVar.getClass();
        this.c = hg1.h(new io.reactivex.rxjava3.internal.operators.observable.y(new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, t4Var).U(new hg1.s4()), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(asu0.a.d()), new ujm0(this, 20));
    }
}
