package xsna;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.vk.log.L;
import com.vk.toggle.features.ImFeatures;
import com.vk.translate.impl.models.SelectLanguageInitConfig;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import xsna.dop0;
import xsna.rb20;
import xsna.unp0;

/* compiled from: MessageTranslateComponent.kt */
/* loaded from: classes6.dex */
public final class qb20 extends j8i {
    public final yi30 i;
    public unp0 j;
    public final a k;
    public xg6 l;
    public final Object m;

    /* compiled from: MessageTranslateComponent.kt */
    public interface a {
        void M1();

        void em(SelectLanguageInitConfig selectLanguageInitConfig);

        void w3(AutoTransition autoTransition);
    }

    /* compiled from: MessageTranslateComponent.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<rb20, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(rb20 rb20Var) {
            rb20 rb20Var2 = rb20Var;
            a aVar = ((qb20) this.receiver).k;
            if (rb20Var2 instanceof rb20.b) {
                aVar.em(((rb20.b) rb20Var2).a);
            } else {
                if (!(rb20Var2 instanceof rb20.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar.M1();
            }
            return s3q0.a;
        }
    }

    /* compiled from: MessageTranslateComponent.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((qb20) this.receiver).getClass();
            L.i(th2);
            com.vk.metrics.eventtracking.b.a.a(th2);
            return s3q0.a;
        }
    }

    /* compiled from: MessageTranslateComponent.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<tb20, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(tb20 tb20Var) {
            tb20 tb20Var2 = tb20Var;
            xg6 xg6Var = ((qb20) this.receiver).l;
            if (xg6Var != null) {
                xg6Var.a(tb20Var2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MessageTranslateComponent.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((qb20) this.receiver).getClass();
            L.i(th2);
            com.vk.metrics.eventtracking.b.a.a(th2);
            return s3q0.a;
        }
    }

    public qb20(yi30 yi30Var, unp0 unp0Var, a aVar, Lazy<wb20> lazy) {
        this.i = yi30Var;
        this.j = unp0Var;
        this.k = aVar;
        this.m = lazy;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
        imFeatures.getClass();
        if (com.vk.toggle.b.A.a(imFeatures)) {
            vb20 vb20Var = new vb20(layoutInflater, viewGroup, this);
            this.l = vb20Var;
            e1();
            return vb20Var.b;
        }
        com.vk.translate.impl.views.b bVar = new com.vk.translate.impl.views.b(layoutInflater, viewGroup, this);
        this.l = bVar;
        e1();
        return bVar.b;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.l = null;
    }

    @Override // xsna.j8i
    public final void Q0() {
        k15.e(Z0().i.a0(asu0.a.d()).subscribe(new bdz(new b(1, this, qb20.class, "handleNavEvent", "handleNavEvent(Lcom/vk/translate/impl/nav_events/MessageTranslateNavEvent;)V", 0), 5), new fsq(new c(1, this, qb20.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 7)), this);
    }

    public final void X0(AutoTransition autoTransition) {
        this.k.w3(autoTransition);
    }

    public final void Y0() {
        Z0().h.onNext(rb20.a.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final wb20 Z0() {
        return (wb20) this.m.getValue();
    }

    public final void a1(kb20 kb20Var) {
        wb20 Z0 = Z0();
        Z0.getClass();
        kb20 kb20Var2 = mb20.a;
        int i = kb20Var.a;
        if (2 == i) {
            Z0.i(true);
        } else if (1 == i) {
            Z0.j();
        }
    }

    public final void b1() {
        Locale g;
        wb20 Z0 = Z0();
        vmo0 vmo0Var = Z0.d;
        tb20 P0 = Z0.f.P0();
        dop0 dop0Var = P0.b;
        if (dop0Var instanceof dop0.a) {
            dop0.a aVar = (dop0.a) dop0Var;
            if (aVar.b) {
                vmo0Var.c();
                synchronized (Z0) {
                    tb20 P02 = Z0.f.P0();
                    tb20 a2 = tb20.a(P02, null, dop0.a.a((dop0.a) dop0Var, false), null, null, false, 29);
                    if (!epx.f(P02, a2)) {
                        Z0.f.onNext(a2);
                    }
                }
                return;
            }
            unp0 unp0Var = P0.c;
            if (unp0Var instanceof unp0.c) {
                g = ((unp0.c) unp0Var).b.d().g();
            } else {
                if (!(unp0Var instanceof unp0.a)) {
                    if (!(unp0Var instanceof unp0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("language mode invalid");
                }
                g = ((unp0.a) unp0Var).b.d().g();
            }
            vmo0Var.a(aVar.a.toString(), g, Z0);
        }
    }

    public final void c1() {
        Z0().i(false);
    }

    public final void d1() {
        wb20 Z0 = Z0();
        ez80 ez80Var = Z0.f.P0().a;
        if (ez80Var.b) {
            return;
        }
        Z0.l(new k0j(ez80Var, 27));
    }

    public final void e1() {
        I0(Z0().g.a0(asu0.a.d()).subscribe(new m1r(new d(1, this, qb20.class, "applyNewScreenState", "applyNewScreenState(Lcom/vk/translate/impl/state/MessageTranslateScreenState;)V", 0), 6), new b0y(new e(1, this, qb20.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0), 6)));
    }

    public final void f1() {
        Z0().j();
    }

    @Override // xsna.j8i
    public final void M0() {
    }
}
