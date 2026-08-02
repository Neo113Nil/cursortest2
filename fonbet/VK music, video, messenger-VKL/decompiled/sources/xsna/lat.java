package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.games.presentation.catalog.GamesCatalogFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import xsna.jdt;

/* compiled from: GamesCatalogContentView.kt */
/* loaded from: classes17.dex */
public final class lat extends i6v0<xet, o9t> {
    public final rha f;
    public final mzp0 g;
    public final f5z h;

    public lat(GamesCatalogFragment gamesCatalogFragment, Context context, mzp0 mzp0Var, f5z f5zVar, rha rhaVar) {
        super(context, gamesCatalogFragment);
        this.f = rhaVar;
        this.g = mzp0Var;
        this.h = f5zVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((xet) ao50Var, izsVar, aVar, 512);
    }

    public final void h(xet xetVar, izs<? super o9t, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-339597097);
        int i2 = (M.J(xetVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-339597097, i2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogContentView.RenderContent (GamesCatalogContentView.kt:46)");
            }
            jdt jdtVar = (jdt) d(jdt.c.a, (n0u0[]) Arrays.copyOf(new n0u0[]{xetVar.a}, 1), M, (((((i2 << 3) & 7168) | 4102) >> 3) & 896) | 6).getValue();
            if (jdtVar instanceof jdt.a) {
                M.K(-1228115396);
                j((jdt.a) jdtVar, izsVar, M, (i2 & 896) | (i2 & 112) | 512);
                M.j();
            } else {
                M.K(-316708552);
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
            s.d = new nwo(i, 1, this, xetVar, izsVar);
        }
    }

    public final void i(xet xetVar, izs<? super o9t, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1104195538);
        int i2 = (M.J(xetVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1104195538, i2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogContentView.ThemedContent (GamesCatalogContentView.kt:32)");
            }
            if (this.f.d) {
                M.K(-65056575);
                rrv0.a(null, null, kai.c(262281925, new hx(this, xetVar, izsVar, 1), M), M, 24576, 15);
                M.j();
            } else {
                M.K(-64942154);
                h(xetVar, izsVar, M, (i2 & 896) | (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | 512);
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
            s.d = new an7(i, 3, this, xetVar, izsVar);
        }
    }

    public final void j(jdt.a aVar, izs<? super o9t, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(1865642592);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1865642592, i2, -1, "com.vk.games.presentation.catalog.view.GamesCatalogContentView.WrappedGamesCatalogMainTabScreen (GamesCatalogContentView.kt:61)");
            }
            if (this.f.b) {
                M.K(-1813088436);
                rvi.a(bvz.a.b(this.h), kai.c(-1492590619, new i87(aVar, izsVar, this), M), M, 56);
                M.j();
            } else {
                M.K(-1812683917);
                boolean z = (i2 & 896) == 256 || M.y(this);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new maj(this, 17);
                    M.R(x);
                }
                pct.a(aVar, izsVar, (gzs) x, this.f, M, i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
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
            s.d = new k71(i, 7, this, aVar, izsVar);
        }
    }
}
