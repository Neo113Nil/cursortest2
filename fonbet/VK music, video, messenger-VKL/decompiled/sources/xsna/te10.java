package xsna;

import android.content.Context;
import androidx.compose.ui.platform.ComposeView;
import xsna.ve10;

/* compiled from: MarketShopConditionsView.kt */
/* loaded from: classes18.dex */
public final class te10 extends i6v0<ve10, ce10> {
    public final ComposeView f;
    public final xqi<ve10.a<oe10>> g;

    static {
        int i = ComposeView.n;
    }

    public te10(ComposeView composeView, xqi xqiVar, ee10 ee10Var, Context context) {
        super(context, ee10Var);
        this.f = composeView;
        this.g = xqiVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((ve10) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.kk50, xsna.jj50
    public final ComposeView c() {
        return this.f;
    }

    @Override // xsna.kk50
    /* renamed from: e */
    public final ComposeView c() {
        return this.f;
    }

    public final void h(ve10 ve10Var, izs<? super ce10, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-130572706);
        int i2 = (M.y(izsVar) ? 32 : 16) | i | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-130572706, i2, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.MarketShopConditionsView.ThemedContent (MarketShopConditionsView.kt:61)");
            }
            ve10.a aVar2 = (ve10.a) ((zak0) this.g.e).getValue();
            if (aVar2 instanceof ve10.a.c) {
                M.K(1349226298);
                ue10.a(izsVar, khi.a, M, ((i2 >> 3) & 14) | 48);
                M.j();
            } else if (aVar2 instanceof ve10.a.C3884a) {
                M.K(1349583480);
                se10.d(jk50.d(((ve10.a.C3884a) aVar2).a, hej0.c, M, 0), izsVar, M, i2 & 112);
                M.j();
            } else {
                if (!(aVar2 instanceof ve10.a.b)) {
                    throw alb0.c(-926310210, M);
                }
                M.K(1349851940);
                ue10.a(izsVar, kai.c(-1975305848, new s67(izsVar, 1), M), M, ((i2 >> 3) & 14) | 48);
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
            s.d = new ar0(i, 5, this, ve10Var, izsVar);
        }
    }
}
