package xsna;

import android.view.ViewStub;
import com.vk.im.engine.models.education.EduMaxTransitionBannerLocalState$EntryPoint;

/* compiled from: EduMaxTransitionComponent.kt */
/* loaded from: classes2.dex */
public final class i6p {
    public final h7m a;
    public final l6p b;
    public final bpn0 c = new bpn0(new l1i(this, 7));
    public final io.reactivex.rxjava3.disposables.b d = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: EduMaxTransitionComponent.kt */
    public interface a {
    }

    public i6p(ViewStub viewStub, EduMaxTransitionBannerLocalState$EntryPoint eduMaxTransitionBannerLocalState$EntryPoint, l7m l7mVar, a aVar) {
        this.a = l7mVar;
        this.b = new l6p(viewStub, viewStub.getContext(), aVar);
    }

    public final void a() {
        io.reactivex.rxjava3.internal.operators.single.x a2 = ((j6p) this.c.getValue()).a();
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.internal.operators.single.b0 m = a2.q(asu0Var.c()).m(asu0Var.d());
        zl0 zl0Var = new zl0(new dxh(this, 10), 25);
        int i = kwg0.a;
        this.d.b(m.subscribe(zl0Var, new iwg0()));
    }

    public final void b() {
        this.d.e();
    }
}
