package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import xsna.hf70;
import xsna.q630;

/* compiled from: NotificationSettingView.kt */
/* loaded from: classes5.dex */
public final class mf70 extends i6v0<nf70, le70> {
    public final wj50<vzi0> f;

    public mf70(f4z f4zVar, f5z f5zVar, Context context) {
        super(context, f5zVar);
        this.f = f4zVar;
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        j((nf70) ao50Var, izsVar, aVar, 512);
    }

    public final void h(hf70 hf70Var, izs<? super le70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-153262783);
        int i2 = (M.J(hf70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-153262783, i2, -1, "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView.Content (NotificationSettingView.kt:69)");
            }
            if (hf70Var instanceof hf70.a) {
                M.K(-301025648);
                hf70.a aVar2 = (hf70.a) hf70Var;
                wh50 b = jk50.b(this.f, M);
                boolean y = M.y(this);
                Object x = M.x();
                if (y || x == a.C0011a.a) {
                    x = new i750(this, 5);
                    M.R(x);
                }
                i(aVar2, b, izsVar, (izs) x, null, M, ((i2 << 9) & 458752) | ((i2 << 3) & 896));
                M.j();
            } else {
                M.K(-300650145);
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
            s.d = new k3o(i, 6, this, hf70Var, izsVar);
        }
    }

    public final void i(final hf70.a aVar, final mtk0 mtk0Var, final izs izsVar, final izs izsVar2, q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a aVar3;
        q630 q630Var2;
        wh50 wh50Var;
        boolean z;
        androidx.compose.runtime.a M = aVar2.M(1754955754);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(mtk0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1754955754, i3, -1, "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView.ContentSurface (NotificationSettingView.kt:92)");
            }
            yzt0<Boolean> yzt0Var = aVar.a;
            Boolean bool = Boolean.FALSE;
            wh50 d = jk50.d(yzt0Var, bool, M, 48);
            wh50 d2 = jk50.d(aVar.b, bool, M, 48);
            wh50 a = jk50.a(aVar.c, M, 48, 2);
            wh50 a2 = jk50.a(aVar.d, M, 48, 2);
            wh50 c = androidx.compose.runtime.k.c(izsVar2, M, (i3 >> 9) & 14);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new in60(mtk0Var, 1));
                M.R(x);
            }
            mtk0 mtk0Var2 = (mtk0) x;
            q630.a aVar4 = q630.a.a;
            q630 d3 = txj0.d(aVar4, 1.0f);
            jai c2 = kai.c(-582699727, new yb1(8, (Object) a2, izsVar), M);
            if (androidx.compose.runtime.b.d()) {
                wh50Var = a;
                z = false;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                wh50Var = a;
                z = false;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar4;
            phv0.b(d3, c2, null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(647364422, new y5u(izsVar, d, d2, wh50Var, mtk0Var2, 1), M), M, 805306416, 380);
            aVar3 = M;
            vzi0 vzi0Var = (vzi0) mtk0Var.getValue();
            boolean J = aVar3.J(c) | ((i3 & 112) == 32);
            Object x2 = aVar3.x();
            if (J || x2 == c0012a) {
                x2 = new lf70(mtk0Var, c, null);
                aVar3.R(x2);
            }
            bap.g(vzi0Var, (wzs) x2, aVar3, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            final q630 q630Var3 = q630Var2;
            s.d = new wzs() { // from class: xsna.kf70
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mf70.this.i(aVar, mtk0Var, izsVar, izsVar2, q630Var3, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void j(nf70 nf70Var, izs<? super le70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(684052066);
        int i2 = (M.J(nf70Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(684052066, i2, -1, "com.vk.settings.impl.presentation.base.mvi.setting.NotificationSettingView.ThemedContent (NotificationSettingView.kt:48)");
            }
            wh50 d = d(hf70.b.a, new n0u0[]{nf70Var.a}, M, (i2 & 896) | 6);
            int i3 = y1z.a;
            LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
            M.K(-1024165885);
            rrv0.d(null, null, null, null, kai.c(-334387783, new sa5(this, izsVar, d, 3), M), M, 24576, 15);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h06(i, 6, this, nf70Var, izsVar);
        }
    }
}
