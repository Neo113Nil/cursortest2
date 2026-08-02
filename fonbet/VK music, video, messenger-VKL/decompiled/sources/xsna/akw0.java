package xsna;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;

/* compiled from: VoipCallViewBroadcastPreviewExtendedLayerDelegate.kt */
/* loaded from: classes7.dex */
public final class akw0 {
    public final l7s a;
    public final FragmentManager b;
    public final eh8 c;
    public final ViewGroup d;
    public q9f0 e;
    public yh8 f;
    public final io.reactivex.rxjava3.disposables.b g = new io.reactivex.rxjava3.disposables.b();
    public final io.reactivex.rxjava3.disposables.b h = new io.reactivex.rxjava3.disposables.b();
    public final tj8 i;

    public akw0(l7s l7sVar, FragmentManager fragmentManager, eh8 eh8Var, ViewGroup viewGroup) {
        this.a = l7sVar;
        this.b = fragmentManager;
        this.c = eh8Var;
        this.d = viewGroup;
        this.i = new tj8(l7sVar, nr4.b());
        bwt0.p0(viewGroup, false);
    }

    public final void a() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        q9f0 q9f0Var = this.e;
        if (q9f0Var != null) {
            yh8 yh8Var = this.f;
            int width = (yh8Var == null || (viewGroup2 = yh8Var.a) == null) ? 0 : viewGroup2.getWidth();
            yh8 yh8Var2 = this.f;
            q9f0Var.a(0, 0, width, (yh8Var2 == null || (viewGroup = yh8Var2.a) == null) ? 0 : viewGroup.getHeight());
        }
        this.h.e();
        yh8 yh8Var3 = this.f;
        if (yh8Var3 != null) {
            yh8Var3.o.a();
            io.reactivex.rxjava3.disposables.c cVar = yh8Var3.r;
            if (cVar != null) {
                cVar.dispose();
            }
            yh8Var3.r = null;
            yh8Var3.s = false;
        }
        this.f = null;
        this.i.a();
        ViewGroup viewGroup3 = this.d;
        bwt0.p0(viewGroup3, false);
        viewGroup3.removeAllViews();
    }

    public final void b(boolean z) {
        io.reactivex.rxjava3.disposables.b bVar = this.g;
        if (!z) {
            bVar.e();
            a();
        } else {
            bVar.b(new io.reactivex.rxjava3.internal.operators.observable.y(this.c.c().a0(asu0.a.d()).U(new did0(new eyp0(13), 17)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new d120(new n9t0(this, 4), 28)));
        }
    }
}
