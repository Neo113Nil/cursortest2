package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.dw20;

/* compiled from: ProductCardCallAvailablePeriodModalBottomSheet.kt */
/* loaded from: classes18.dex */
public final class ujd0 extends jmu0 {
    public final String h1;
    public final String i1;
    public final gzs<s3q0> j1;

    /* compiled from: ProductCardCallAvailablePeriodModalBottomSheet.kt */
    public static final class a extends dw20.b {
        public final String e;
        public final String f;
        public final gzs<s3q0> g;

        public a(String str, String str2, ie3 ie3Var, Context context) {
            super(context, new tjd0());
            this.e = str;
            this.f = str2;
            this.g = ie3Var;
            m(R.attr.vk_ui_background_content);
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            return new ujd0(this.e, this.f, this.g);
        }
    }

    public ujd0(String str, String str2, gzs gzsVar) {
        this.h1 = str;
        this.i1 = str2;
        this.j1 = gzsVar;
    }

    @Override // xsna.jmu0
    public final void co(int i, androidx.compose.runtime.a aVar) {
        gzs gzsVar;
        androidx.compose.runtime.a M = aVar.M(17384634);
        int i2 = (M.y(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(17384634, i2, -1, "com.vk.ecomm.market.good.ui.dialog.ProductCardCallAvailablePeriodModalBottomSheet.ThemedContent (ProductCardCallAvailablePeriodModalBottomSheet.kt:33)");
            }
            a.C0011a.C0012a c0012a = a.C0011a.a;
            gzs<s3q0> gzsVar2 = this.j1;
            if (gzsVar2 == null) {
                M.K(-1785184711);
                M.j();
                gzsVar = null;
            } else {
                M.K(-1785184710);
                boolean J = M.J(gzsVar2) | ((i2 & 14) == 4 || M.y(this));
                Object x = M.x();
                if (J || x == c0012a) {
                    x = new ig1(26, gzsVar2, this);
                    M.R(x);
                }
                gzsVar = (gzs) x;
                M.j();
            }
            gzs gzsVar3 = gzsVar;
            boolean z = (i2 & 14) == 4 || M.y(this);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new sy50(this, 19);
                M.R(x2);
            }
            wjd0.b(this.h1, this.i1, gzsVar3, (gzs) x2, null, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q0r(this, i, 6);
        }
    }
}
