package xsna;

import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.sharing.im_engine_impl.BaseSharingExternalActivity;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import java.lang.ref.WeakReference;
import xsna.wxi0;

/* compiled from: MultiAccountSharingDelegate.kt */
/* loaded from: classes5.dex */
public final class m340 {
    public final WeakReference<BaseSharingExternalActivity> a;
    public boolean b;
    public boolean c;
    public boolean d;
    public io.reactivex.rxjava3.disposables.c e;
    public final nf0 f = new nf0(this, 7);
    public final a g = new a();

    /* compiled from: MultiAccountSharingDelegate.kt */
    public static final class a implements ayi0 {
        public a() {
        }

        @Override // xsna.ayi0
        public final void a(uxi0 uxi0Var) {
            mui0 J2;
            mui0 J22;
            wxi0 a = new vxi0(uxi0Var).a();
            boolean z = a instanceof wxi0.d;
            m340 m340Var = m340.this;
            if (z) {
                SessionManagementComponent a2 = m340Var.a();
                if (a2 != null && (J22 = a2.J2()) != null) {
                    J22.k(this);
                }
                i0q0.f(new jl4(13, m340Var, (wxi0.d) a));
                return;
            }
            if ((a instanceof wxi0.a) || (a instanceof wxi0.c)) {
                SessionManagementComponent a3 = m340Var.a();
                if (a3 != null && (J2 = a3.J2()) != null) {
                    J2.k(this);
                }
                i0q0.f(new n1i(m340Var, 26));
            }
        }
    }

    public m340(WeakReference<BaseSharingExternalActivity> weakReference) {
        this.a = weakReference;
    }

    public final SessionManagementComponent a() {
        l7m a2;
        BaseSharingExternalActivity baseSharingExternalActivity = this.a.get();
        if (baseSharingExternalActivity == null || (a2 = m7m.a(baseSharingExternalActivity)) == null) {
            return null;
        }
        return (SessionManagementComponent) a2.a(fpf0.a(SessionManagementComponent.class));
    }

    public final VkClientMultiAccountComponent b() {
        l7m a2;
        BaseSharingExternalActivity baseSharingExternalActivity = this.a.get();
        if (baseSharingExternalActivity == null || (a2 = m7m.a(baseSharingExternalActivity)) == null) {
            return null;
        }
        return (VkClientMultiAccountComponent) a2.a(fpf0.a(VkClientMultiAccountComponent.class));
    }

    public final void c(BaseSharingExternalActivity baseSharingExternalActivity) {
        if (this.d || !this.c) {
            return;
        }
        VkClientMultiAccountComponent b = b();
        jlu0 a2 = b != null ? b.a() : null;
        if (a2 == null || !a2.a(baseSharingExternalActivity.getSupportFragmentManager())) {
            this.d = true;
            io.reactivex.rxjava3.disposables.c cVar = this.e;
            if (cVar != null) {
                cVar.dispose();
            }
            i0q0.d(150L, new n52(baseSharingExternalActivity, 11));
            i0q0.d(300L, new ieg(1, baseSharingExternalActivity, this));
        }
    }

    public final void d(izs<? super BaseSharingExternalActivity, s3q0> izsVar) {
        BaseSharingExternalActivity baseSharingExternalActivity = this.a.get();
        if (baseSharingExternalActivity != null) {
            izsVar.invoke(baseSharingExternalActivity);
        }
    }
}
