package xsna;

import android.content.Context;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import java.lang.ref.WeakReference;
import java.util.List;
import xsna.c810;
import xsna.dw20;

/* compiled from: ProductsMultipickerRouterImpl.kt */
/* loaded from: classes18.dex */
public final class btd0 implements atd0 {

    /* compiled from: ProductsMultipickerRouterImpl.kt */
    public static final class a implements ysd0 {
        public final WeakReference<dw20> a;

        public a(dw20 dw20Var) {
            this.a = new WeakReference<>(dw20Var);
        }

        @Override // xsna.ysd0
        public final void hide() {
            dw20 dw20Var = this.a.get();
            if (dw20Var != null) {
                dw20Var.hide();
            }
        }
    }

    /* compiled from: ProductsMultipickerRouterImpl.kt */
    public static final class b implements iz20 {
        public final /* synthetic */ g910 b;

        public b(g910 g910Var) {
            this.b = g910Var;
        }

        @Override // xsna.iz20
        public final void n(dw20 dw20Var) {
            gzs<s3q0> gzsVar = this.b.k;
            if (gzsVar != null) {
                gzsVar.invoke();
            }
        }
    }

    @Override // xsna.atd0
    public final ysd0 a(Context context, g910 g910Var) {
        List<MultipickerProduct> list = g910Var.a;
        c810.a aVar = new c810.a(context, g910Var.b, list, g910Var.e, g910Var.d, g910Var.h, g910Var.i, g910Var.j);
        aVar.l = new zl20(g910Var, 25);
        aVar.o = new mgz(g910Var, 27);
        aVar.n = g910Var.m;
        String str = g910Var.c;
        if (str != null) {
            aVar.m = str;
        }
        return new a(((dw20.b) ((dw20.b) ((dw20.b) ((dw20.b) aVar.K()).c(new a470()).I(false).J()).e0(new b(g910Var)).Z(new rcq(g910Var, 1)).G0()).p(true).q(true).r()).u0(g910Var.g).I0(fpf0.a(btd0.class).l()));
    }
}
