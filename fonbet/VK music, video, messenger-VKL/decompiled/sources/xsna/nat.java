package xsna;

import android.content.Context;
import com.vk.games.presentation.detail.GamesCatalogDetailFragment;
import java.util.Arrays;
import xsna.bbt;

/* compiled from: GamesCatalogDetailContentView.kt */
/* loaded from: classes17.dex */
public final class nat extends i6v0<ibt, mat> {
    public final rha f;

    public nat(rha rhaVar, GamesCatalogDetailFragment gamesCatalogDetailFragment, Context context) {
        super(context, gamesCatalogDetailFragment);
        this.f = rhaVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((ibt) ao50Var, izsVar, aVar, 512);
    }

    public final void h(ibt ibtVar, izs<? super mat, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1122294785);
        int i2 = (M.J(ibtVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1122294785, i2, -1, "com.vk.games.presentation.detail.view.GamesCatalogDetailContentView.ThemedContent (GamesCatalogDetailContentView.kt:26)");
            }
            int i3 = i2 << 3;
            bbt bbtVar = (bbt) d(bbt.c.a, (n0u0[]) Arrays.copyOf(new n0u0[]{ibtVar.a}, 1), M, ((((i3 & 7168) | 4102) >> 3) & 896) | 6).getValue();
            if (bbtVar instanceof bbt.a) {
                M.K(249202535);
                dbt.b((bbt.a) bbtVar, this.f, izsVar, M, i3 & 896);
                M.j();
            } else {
                M.K(-407596871);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new l8c(i, 4, this, ibtVar, izsVar);
        }
    }
}
