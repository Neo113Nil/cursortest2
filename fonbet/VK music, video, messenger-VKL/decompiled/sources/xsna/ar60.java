package xsna;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.toggle.features.SmbAdFeatures;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.LazyThreadSafetyMode;
import xsna.a9q0;

/* compiled from: NewsfeedListMviHost.kt */
/* loaded from: classes4.dex */
public final class ar60 {
    public final AtomicReference<String> a;
    public final fo60 b;
    public final gzs<mo60> c;
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();
    public qn60 e;
    public pn60 f;
    public ek40 g;
    public gzs<s3q0> h;
    public final lxd i;
    public final Object j;

    public ar60(tr60 tr60Var, AtomicReference<String> atomicReference, FragmentImpl fragmentImpl, fo60 fo60Var, gzs<mo60> gzsVar) {
        this.a = atomicReference;
        this.b = fo60Var;
        this.c = gzsVar;
        this.i = new lxd(tr60Var.j);
        this.j = msy.a(LazyThreadSafetyMode.NONE, new yq1(12, fragmentImpl, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final uq60 a() {
        return (uq60) this.j.getValue();
    }

    public final mo60 b() {
        return this.c.invoke();
    }

    public final void c() {
        his0.d++;
        if (his0.c == null || !(!r0.h())) {
            his0.c = wjs0.b.a0(asu0.a.d()).subscribe(new e7q0(new puq0(4), 5));
        }
        this.g = new ek40();
    }

    public final void d() {
        io.reactivex.rxjava3.disposables.c cVar;
        ek40 ek40Var = this.g;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.g = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        b().f().e();
        ehv ehvVar = (ehv) b().p.b;
        if (ehvVar != null) {
            ehvVar.p();
        }
        b().p.b = null;
        this.h = null;
        this.d.e();
        pn60 pn60Var = this.f;
        if (pn60Var != null) {
            pn60Var.a();
        }
        this.f = null;
        qn60 qn60Var = this.e;
        if (qn60Var != null) {
            qn60Var.a();
        }
        this.e = null;
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(RecyclerView recyclerView) {
        io.reactivex.rxjava3.disposables.c cVar;
        ek40 ek40Var = this.g;
        if (ek40Var != null) {
            ek40Var.a();
        }
        this.g = null;
        int i = his0.d - 1;
        his0.d = i;
        if (i == 0 && (cVar = his0.c) != null) {
            cVar.dispose();
        }
        this.i.a();
        b().d().a();
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        if (recyclerView != null) {
            recyclerView.removeOnScrollListener((dui) b().T.getValue());
        }
        if (com.vk.toggle.b.A.a(SmbAdFeatures.FEATURE_SMB_LEAD_ADS) && recyclerView != null) {
            recyclerView.removeOnScrollListener((y3v) b().g0.getValue());
        }
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
        }
        ehv ehvVar = (ehv) b().p.b;
        if (ehvVar != null && recyclerView != null) {
            recyclerView.removeOnScrollListener(ehvVar);
        }
        b().n.b();
        b().b().F0((or60) b().t.getValue());
        b().b().F0((oc60) b().z.getValue());
        b().b().G0((rl60) b().A.getValue());
        b().b().G0(((sr60) b().o.getValue()).c);
        b().b().G0((zjf0) b().B.getValue());
        b().b().k = null;
        b().b().E0();
        b().b().clear();
        b().f().f();
        ehv ehvVar2 = (ehv) b().p.b;
        if (ehvVar2 != null) {
            ehvVar2.q();
        }
        ((yl60) b().b0.getValue()).d();
        a().c();
        b().n.c();
        b().n.f = null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void f(boolean z) {
        ((tc60) b().U.getValue()).c();
        b().f().h();
        if (z) {
            hl60 hl60Var = hl60.a;
            hl60.b();
        }
        a().g();
        ((o170) b().V.getValue()).c();
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    public final void g() {
        a().e();
        b().f().j();
        ehv ehvVar = (ehv) b().p.b;
        if (ehvVar != null) {
            ehvVar.o();
        }
        ((yl60) b().b0.getValue()).b();
        gzs<s3q0> gzsVar = this.h;
        if (gzsVar != null) {
            this.h = null;
            gzsVar.invoke();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void h(Activity activity, RecyclerView recyclerView) {
        ((tc60) b().U.getValue()).d();
        b().f().k(activity, b().n);
        a().h();
        ((o170) b().V.getValue()).b(recyclerView);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void i(sq60 sq60Var) {
        a9q0 a9q0Var = sq60Var.h;
        if ((a9q0Var instanceof a9q0.b) || (a9q0Var instanceof a9q0.a) || (a9q0Var instanceof a9q0.c) || (a9q0Var instanceof a9q0.d)) {
            bs60.b(b().f());
            b().f().c();
        }
        this.i.d(sq60Var, (tc60) b().U.getValue(), this.a.get());
        b().f().l();
    }
}
