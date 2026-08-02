package xsna;

import com.vk.superapp.vkpay.checkout.core.ui.views.VkCardForm;
import com.vk.superapp.vkpay.checkout.data.model.AddCardMethod;
import xsna.bbv0;
import xsna.e37;
import xsna.icl;
import xsna.iv9;
import xsna.pr90;

/* compiled from: BindNewCardFragment.kt */
/* loaded from: classes6.dex */
public final class g37 extends pr90<AddCardMethod, f37> {
    public static final /* synthetic */ int p = 0;
    public final bpn0 o = new bpn0(new ah(this, 8));

    /* compiled from: BindNewCardFragment.kt */
    public static final class a implements icl.a, e37.a {
        public final /* synthetic */ pr90.b a;
        public final f37 b;

        public a(f37 f37Var) {
            this.a = new pr90.b(f37Var);
            this.b = f37Var;
        }

        @Override // xsna.osa.a
        public final void a() {
            this.a.a();
        }

        @Override // xsna.l660.b
        public final void b(VkCardForm.b bVar) {
            f37 f37Var = this.b;
            if (f37Var != null) {
                f37Var.b(bVar);
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

        @Override // xsna.sj.a
        public final void x() {
            f37 f37Var = this.b;
            if (f37Var != null) {
                f37Var.x();
            }
        }

        @Override // xsna.sj.a
        public final void z(boolean z) {
            f37 f37Var = this.b;
            if (f37Var != null) {
                f37Var.z(z);
            }
        }
    }

    @Override // xsna.pr90
    public final f37 An(AddCardMethod addCardMethod) {
        bbv0.g.getClass();
        return new h37(this, bbv0.a.f().d, addCardMethod);
    }

    @Override // xsna.pr90
    public final icl.a xn() {
        return (e37.a) this.o.getValue();
    }

    @Override // xsna.pr90
    public final String yn() {
        return "g37";
    }

    @Override // xsna.pr90
    public final icl zn() {
        e37.a aVar = (e37.a) this.o.getValue();
        e37 e37Var = new e37(aVar);
        e37Var.x0(k4j.class, new d37(0));
        e37Var.x0(qj.class, new com.vk.movika.sdk.base.observable.c(aVar, 10));
        e37Var.x0(k660.class, new go1(aVar, 12));
        return e37Var;
    }
}
