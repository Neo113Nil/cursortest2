package xsna;

import android.view.View;
import com.vk.core.performance.score.PerformanceScoreProduct;
import com.vk.core.ui.measuring.UiMeasuringScreen;
import java.util.Iterator;
import java.util.List;

/* compiled from: CompositePerformanceMeasureDelegate.kt */
/* loaded from: classes16.dex */
public final class hui implements uzh0 {
    public final List<uzh0> a = e43.l(new lzp0(UiMeasuringScreen.SEARCH_VIDEO_SERVICE), new yrd0(PerformanceScoreProduct.SEARCH_VIDEO_SERVICE));

    @Override // xsna.uzh0
    public final void a(View view) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).a(view);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void b() {
        t(new ak(17));
    }

    @Override // xsna.uzh0
    public final void c() {
        t(new pl2(21));
    }

    @Override // xsna.uzh0
    public final void d(View view) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).d(view);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void e(View view) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).e(view);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void f() {
        t(new wq3(18));
    }

    @Override // xsna.uzh0
    public final void g() {
        t(new zj(21));
    }

    @Override // xsna.uzh0
    public final void h() {
        t(new rl2(16));
    }

    @Override // xsna.uzh0
    public final void i() {
        t(new ci7(18));
    }

    @Override // xsna.uzh0
    public final void j(View view) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).j(view);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void k(boolean z, boolean z2) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).k(z, z2);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void l(boolean z) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).l(z);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void m(boolean z) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).m(z);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void n() {
        t(new y40(22));
    }

    @Override // xsna.uzh0
    public final void o(boolean z) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).o(z);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void p() {
        t(new f57(15));
    }

    @Override // xsna.uzh0
    public final void q(String str) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).q(str);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void r(View view) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((uzh0) it.next()).r(view);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.uzh0
    public final void s() {
        t(new c2(23));
    }

    public final void t(izs<? super uzh0, s3q0> izsVar) {
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            izsVar.invoke((uzh0) it.next());
        }
    }
}
