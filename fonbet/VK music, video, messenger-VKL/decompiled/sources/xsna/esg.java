package xsna;

import ru.ok.android.api.core.ApiInvocationException;
import xsna.phw;
import xsna.q630;

/* compiled from: CommunityAvatar.kt */
/* loaded from: classes5.dex */
public final class esg {
    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> dsgVar;
        androidx.compose.runtime.a M = aVar.M(1186805036);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1186805036, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.component.CommunityAvatar (CommunityAvatar.kt:19)");
            }
            if (str == null) {
                M.K(-61816112);
                f9t.e(txj0.q(q630.a.a, 98), M, 6);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s != null) {
                    dsgVar = new e3(str, q630Var, i, 6);
                    s.d = dsgVar;
                }
                return;
            }
            M.K(-62581130);
            M.j();
            phw a = phw.a.a(xus.s(str, 0L, M, i2 & 14, 2), null, null, null, null, M, 196616, 30);
            float f = 90;
            float f2 = 4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ldu0.b(a, f, s200.D(r18.a(f2, ylu0Var.getBackground().g, q630Var, vog0.a), f2), null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        s = M.s();
        if (s != null) {
            dsgVar = new dsg(str, q630Var, i, 0);
            s.d = dsgVar;
        }
    }
}
