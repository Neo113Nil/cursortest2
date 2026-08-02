package xsna;

import android.view.ViewGroup;
import xsna.ga90;
import xsna.hfz;

/* compiled from: PrimaryViewHolder.kt */
/* loaded from: classes7.dex */
public abstract class abd0<T extends hfz> extends vfz<T> implements y9d0 {
    public static final /* synthetic */ int r = 0;
    public final y990 l;
    public final ga90 m;
    public final qfu n;
    public boolean o;
    public final io.reactivex.rxjava3.disposables.b p;
    public T q;

    public abd0(int i, ViewGroup viewGroup, qfu qfuVar, y990 y990Var, ga90 ga90Var) {
        super(i, viewGroup);
        this.l = y990Var;
        this.m = ga90Var;
        this.n = qfuVar;
        this.p = new io.reactivex.rxjava3.disposables.b();
        bwt0.i0(this.itemView, new ap30(this, 11));
    }

    @Override // xsna.vfz
    public void V5() {
        this.p.b(this.m.a().a0(asu0.a.d()).subscribe(new ow40(new zad0(1, this, abd0.class, "onPageVisibility", "onPageVisibility(Lcom/vk/voip/ui/groupcalls/page/visibility/PageVisibilityProvider$VisiblePage;)V", 0), 12)));
    }

    @Override // xsna.vfz
    public void W5(T t) {
        this.q = t;
    }

    @Override // xsna.vfz
    public void a6() {
        this.p.e();
        i6(ga90.a.b.a);
    }

    @Override // xsna.vfz
    public final void g6() {
        this.q = null;
    }

    public void h6() {
        ((xen) this.n.c).b(this);
    }

    public final void i6(ga90.a aVar) {
        boolean z = (aVar instanceof ga90.a.C2929a) && ((ga90.a.C2929a) aVar).a == getBindingAdapterPosition();
        if (z == this.o) {
            return;
        }
        this.o = z;
        if (z) {
            j6();
        } else {
            h6();
        }
    }

    public void j6() {
        qfu qfuVar = this.n;
        ((xen) qfuVar.c).a(this);
        ((cfn) qfuVar.b).a();
    }
}
