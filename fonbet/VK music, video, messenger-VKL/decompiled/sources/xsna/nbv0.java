package xsna;

import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.superapp.vkpay.checkout.data.model.VkPay;
import xsna.bbv0;
import xsna.icl;
import xsna.iv9;
import xsna.l660;
import xsna.pr90;

/* compiled from: VkPayConfirmationFragment.kt */
/* loaded from: classes6.dex */
public final class nbv0 extends pr90<VkPay, mbv0> {
    public static final /* synthetic */ int q = 0;
    public final bpn0 o = new bpn0(new hri0(this, 22));
    public dw20 p;

    /* compiled from: VkPayConfirmationFragment.kt */
    public static final class a implements icl.a, l660.b {
        public final /* synthetic */ pr90.b a;
        public final mbv0 b;

        public a(mbv0 mbv0Var) {
            this.a = new pr90.b(mbv0Var);
            this.b = mbv0Var;
        }

        @Override // xsna.osa.a
        public final void a() {
            this.a.a();
        }

        @Override // xsna.l660.b
        public final void b(VkCardForm.b bVar) {
            mbv0 mbv0Var = this.b;
            if (mbv0Var != null) {
                mbv0Var.b(bVar);
            }
        }

        @Override // xsna.hv9.a
        public final void c(iv9.a aVar) {
            this.a.c(aVar);
        }

        @Override // xsna.zb.a
        public final void d() {
            this.a.d();
        }

        @Override // xsna.em7.a
        public final void g(boolean z) {
            this.a.g(z);
        }
    }

    @Override // xsna.pr90
    public final mbv0 An(VkPay vkPay) {
        bbv0.g.getClass();
        return new qbv0(this, vkPay, bbv0.a.f().d);
    }

    @Override // xsna.pr90
    public final icl.a xn() {
        return (a) this.o.getValue();
    }

    @Override // xsna.pr90
    public final String yn() {
        return "nbv0";
    }

    @Override // xsna.pr90
    public final icl zn() {
        a aVar = (a) this.o.getValue();
        lbv0 lbv0Var = new lbv0(aVar);
        lbv0Var.x0(s1g0.class, new gsq0(aVar, 8));
        lbv0Var.x0(k660.class, new skj0(aVar, 20));
        lbv0Var.x0(ew1.class, new c220(29));
        lbv0Var.x0(u1g0.class, new vyq0(aVar, 10));
        return lbv0Var;
    }
}
