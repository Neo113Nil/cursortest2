package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.i7d0;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: ErrorPrimaryBlockContentImpl.kt */
/* loaded from: classes17.dex */
public final class kwp extends i7d0.b {
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;
    public final wh50 e = androidx.compose.runtime.k.b(null);

    public kwp(String str, String str2, gzs gzsVar) {
        this.b = androidx.compose.runtime.k.b(str);
        this.c = androidx.compose.runtime.k.b(str2);
        this.d = androidx.compose.runtime.k.b(gzsVar);
    }

    @Override // xsna.i7d0
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1416973098);
        int i3 = i & 6;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 = (M.J(aVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1416973098, i2, -1, "com.vk.community.design.compose.primaryblock.ErrorPrimaryBlockContentImpl.Content (ErrorPrimaryBlockContentImpl.kt:32)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, aVar3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            vl20 a = zra0.a.a(null, null, (String) ((zak0) this.b).getValue(), null, M, 196608, 27);
            String str = (String) ((zak0) this.c).getValue();
            ButtonStyle buttonStyle = ButtonStyle.Secondary;
            ButtonSize buttonSize = ButtonSize.Small;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1888409892, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-RefreshOutline24> (VkSdkIcons.kt:2924)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_refresh_outline_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            gzs gzsVar = (gzs) ((zak0) this.d).getValue();
            if (gzsVar == null) {
                M.K(220056956);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new i9(22);
                    M.R(x);
                }
                gzsVar = (gzs) x;
            } else {
                M.K(-1516922631);
            }
            M.j();
            aVar2 = M;
            ldv0.d(aVar3, null, a, wra0.b.a(wra0.a.C3954a.a(str, gzsVar, buttonSize, buttonStyle, buttonAppearance, false, a2, null, null, null, null, null, false, false, null, null, aVar2, 2125184, 12582912, 130976), null, null, aVar2, 14), null, null, false, aVar2, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new at3(this, i);
        }
    }
}
