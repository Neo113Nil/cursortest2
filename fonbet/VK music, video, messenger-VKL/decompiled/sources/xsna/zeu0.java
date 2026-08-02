package xsna;

import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.cell.content.o;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.us2;

/* compiled from: VkBidProfile.kt */
/* loaded from: classes18.dex */
public final class zeu0 {
    public static final void a(final String str, final String str2, final boolean z, final boolean z2, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i) {
        com.vk.core.compose.component.cell.content.h1 h1Var;
        androidx.compose.runtime.a M = aVar.M(705148056);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(str2) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(705148056, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.VkBidProfile (VkBidProfile.kt:24)");
            }
            com.vk.core.compose.component.cell.content.h1 a = Cell$Middle.d.b.a(str, null, null, 1, null, null, M, (i2 & 14) | 12610560, 102);
            M.K(-957535930);
            com.vk.core.compose.component.cell.content.h1 b = Cell$Middle.c.b.b(str2, 0, null, null, null, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            M.j();
            if (z2) {
                M.K(-957530342);
                M.K(-957528930);
                us2.b bVar = new us2.b();
                M.K(-957527615);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                int m = bVar.m(new hik0(ylu0Var.getText().l, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    bVar.g(d370.N(R.string.verificated_vkbid_profile, 0, M));
                    s3q0 s3q0Var = s3q0.a;
                    bVar.k(m);
                    M.j();
                    us2 n = bVar.n();
                    M.j();
                    h1Var = Cell$Middle.b.a.b(n, 1, 0, null, M, 196992, 26);
                    M.j();
                } catch (Throwable th) {
                    bVar.k(m);
                    throw th;
                }
            } else {
                M.K(381645989);
                M.j();
                h1Var = null;
            }
            wiu0.b(q630.a.a, false, null, Cell$Middle.a.a(a, b, h1Var, null, M, 196608, 24), o.e.a.C0736a.a(z, gzsVar, false, null, M, ((i2 >> 6) & 14) | 24576 | ((i2 >> 9) & 112), 12), gzsVar, null, M, 6 | ((i2 << 3) & 458752), 70);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(str, str2, z, z2, gzsVar, i) { // from class: xsna.yeu0
                public final /* synthetic */ String b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(196609);
                    zeu0.a(this.b, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
