package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import xsna.q630;
import xsna.ve10;

/* compiled from: MarketShopConditionsBottomView.kt */
/* loaded from: classes18.dex */
public final class fe10 extends i6v0<ve10, ce10> {
    public final ComposeView f;
    public final xqi<ve10.a<oe10>> g;

    static {
        int i = ComposeView.n;
    }

    public fe10(ComposeView composeView, xqi xqiVar, ee10 ee10Var, Context context) {
        super(context, ee10Var);
        this.f = composeView;
        this.g = xqiVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((ve10) ao50Var, izsVar, aVar, 512);
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(ve10.a.C3884a c3884a, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> k3oVar;
        androidx.compose.runtime.a M = aVar.M(26616275);
        int i2 = i | (M.J(c3884a) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(26616275, i2, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.MarketShopConditionsBottomView.ShopConditionsButton (MarketShopConditionsBottomView.kt:60)");
            }
            hej0 hej0Var = (hej0) jk50.d(c3884a.a, hej0.c, M, 0).getValue();
            gej0 gej0Var = hej0Var.b;
            if (gej0Var == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    k3oVar = new h06(i, 4, this, c3884a, izsVar);
                    s.d = k3oVar;
                }
                return;
            }
            boolean z = gej0Var.c;
            String str = gej0Var.a;
            q630 f = txj0.f(ahn.E(q630.a.a, z ? "shopConditionsEditBtn" : "shopConditionsMessageBtn"), 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = s200.E(hr80.m(f, ylu0Var.getBackground().r, androidx.compose.ui.graphics.e.a), kqu0.b, kqu0.c);
            ButtonSize buttonSize = ButtonSize.Large;
            ButtonStyle buttonStyle = z ? ButtonStyle.Primary : ButtonStyle.Secondary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            boolean y = ((i2 & 896) == 256 || M.y(this)) | M.y(hej0Var) | ((i2 & 112) == 32);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new h84(this, hej0Var, izsVar, 2);
                M.R(x);
            }
            aVar2 = M;
            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar2, 3120, 0, 0, 4190176);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        s = aVar2.s();
        if (s != null) {
            k3oVar = new k3o(i, 4, this, c3884a, izsVar);
            s.d = k3oVar;
        }
    }

    public final void i(ve10 ve10Var, izs<? super ce10, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1222299000);
        int i2 = (M.y(izsVar) ? 32 : 16) | i | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1222299000, i2, -1, "com.vk.ecomm.shop_conditions.impl.ui.dovdialog.presentation.compose.MarketShopConditionsBottomView.ThemedContent (MarketShopConditionsBottomView.kt:47)");
            }
            ve10.a aVar2 = (ve10.a) ((zak0) this.g.e).getValue();
            if (aVar2 instanceof ve10.a.C3884a) {
                M.K(-2103256462);
                int i3 = ComposeView.n;
                h((ve10.a.C3884a) aVar2, izsVar, M, (i2 & 896) | (i2 & 112) | 512);
                M.j();
            } else {
                M.K(-2103254484);
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
            s.d = new n87(this, ve10Var, izsVar, i, 4);
        }
    }
}
