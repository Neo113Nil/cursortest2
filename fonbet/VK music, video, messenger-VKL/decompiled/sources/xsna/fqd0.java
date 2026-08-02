package xsna;

import com.vk.ecomm.product_list.router.ProductListInternalParams;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.an50;
import xsna.uk50;

/* compiled from: ProductListMviStore.kt */
/* loaded from: classes18.dex */
public final class fqd0 implements bqd0, mm50<aqd0, com.vk.ecomm.product_list.presentation.e, com.vk.ecomm.product_list.presentation.j> {
    public final /* synthetic */ um50 b;

    /* compiled from: ProductListMviStore.kt */
    public static final /* synthetic */ class a implements omf0, g0t {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            if ((obj instanceof omf0) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(0, com.vk.ecomm.product_list.presentation.l.class, "<init>", "<init>()V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // xsna.gzs
        public final Object invoke() {
            return new com.vk.ecomm.product_list.presentation.l();
        }
    }

    public fqd0(final ProductListInternalParams productListInternalParams, final y330 y330Var, final rpd0 rpd0Var, final tpd0 tpd0Var) {
        an50 a2 = an50.a.a(new j18() { // from class: xsna.cqd0
            @Override // xsna.gzs
            public final Object invoke() {
                return new wpd0(ProductListInternalParams.this);
            }
        }, new dqd0(), a.b, new t5o0() { // from class: xsna.eqd0
            @Override // xsna.izs
            /* renamed from: m */
            public final mn50 invoke(nn50 nn50Var) {
                return new com.vk.ecomm.product_list.presentation.o(nn50Var, tpd0Var, y330Var, productListInternalParams.b, rpd0Var);
            }
        });
        this.b = new um50(a2.a, a2.b, a2.c, a2.d, a2.e, uk50.a.a);
    }

    @Override // xsna.mm50
    public final uic G(izs<? super aqd0, s3q0> izsVar) {
        return this.b.e.a(izsVar);
    }

    @Override // xsna.mm50
    public final uic R(izs<? super com.vk.ecomm.product_list.presentation.j, s3q0> izsVar) {
        return this.b.d.a(izsVar);
    }

    @Override // xsna.mm50
    public final void b(com.vk.ecomm.product_list.presentation.e eVar) {
        this.b.b(eVar);
    }

    @Override // xsna.uic
    public final void clear() {
        this.b.clear();
    }

    @Override // xsna.mm50
    public final aqd0 getCurrentState() {
        return (aqd0) this.b.e.b();
    }
}
