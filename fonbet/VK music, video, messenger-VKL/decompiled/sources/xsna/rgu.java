package xsna;

import android.view.ViewGroup;
import xsna.ga90;
import xsna.hfz;

/* compiled from: GridViewHolder.kt */
/* loaded from: classes7.dex */
public abstract class rgu<T extends hfz> extends vfz<T> implements yfu {
    public static final /* synthetic */ int r = 0;
    public final qfu l;
    public final y990 m;
    public final ga90 n;
    public boolean o;
    public final io.reactivex.rxjava3.disposables.b p;
    public T q;

    public rgu(int i, ViewGroup viewGroup, qfu qfuVar, y990 y990Var, ga90 ga90Var) {
        super(i, viewGroup);
        this.l = qfuVar;
        this.m = y990Var;
        this.n = ga90Var;
        this.p = new io.reactivex.rxjava3.disposables.b();
        bwt0.i0(this.itemView, new eph(this, 24));
    }

    @Override // xsna.vfz
    public void V5() {
        this.p.b(this.n.a().a0(asu0.a.d()).subscribe(new x8(new qgu(1, this, rgu.class, "onPageVisibility", "onPageVisibility(Lcom/vk/voip/ui/groupcalls/page/visibility/PageVisibilityProvider$VisiblePage;)V", 0), 23)));
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
        ((xen) this.l.c).b(this);
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
        qfu qfuVar = this.l;
        ((xen) qfuVar.c).a(this);
        ((cfn) qfuVar.b).a();
    }
}
