package xsna;

import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.superapp.base.js.bridge.VkUiView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.fzu0;

/* compiled from: VkHtmlGamePresenter.kt */
/* loaded from: classes6.dex */
public final class ezu0 extends wwv0 implements fzu0.a {
    public static final long v = TimeUnit.SECONDS.toMillis(10);
    public boolean t;
    public long u;

    /* compiled from: VkHtmlGamePresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            ((xgx0) this.receiver).getClass();
            xgx0.d(th);
            return s3q0.a;
        }
    }

    @Override // xsna.fzu0.a
    public final boolean P() {
        return this.t;
    }

    @Override // xsna.fzu0.a
    public final void b0(boolean z) {
        this.t = z;
    }

    @Override // xsna.wwv0, xsna.xwv0
    public final VkUiView getView() {
        return (fzu0) this.a;
    }

    @Override // xsna.fzu0.a
    public final void m(String str) {
        WebApiApplication m = this.b.m();
        if (m == null || m.r) {
            return;
        }
        vdx0 vdx0Var = e370.e;
        if (vdx0Var == null) {
            vdx0Var = null;
        }
        zen0 d = vdx0Var.d();
        long j = m.b;
        if (str == null) {
            str = m.w;
        }
        io.reactivex.rxjava3.disposables.c subscribe = d.G(j, str).subscribe(new ksb0(new g6m0(5, m, this), 15), new k5j0(new a(1, xgx0.a, xgx0.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 20));
        fzu0 fzu0Var = (fzu0) this.a;
        up2.j(subscribe, fzu0Var);
        if (m.t || !m.s) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.u >= v) {
            this.u = currentTimeMillis;
            fzu0Var.lj(true);
        }
    }

    @Override // xsna.wwv0, xsna.xwv0
    public final fzu0 getView() {
        return (fzu0) this.a;
    }

    @Override // xsna.wwv0, xsna.fvv0, xsna.xwv0
    public final gvv0 getView() {
        return (fzu0) this.a;
    }
}
