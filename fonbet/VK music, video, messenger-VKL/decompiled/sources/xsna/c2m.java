package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.base.version_info.VersionConstants;
import xsna.a5x;
import xsna.g8s;
import xsna.h8s;
import xsna.q630;

/* compiled from: DescriptionInputForm.kt */
/* loaded from: classes5.dex */
public final class c2m {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, izs izsVar, q630 q630Var) {
        int i2;
        gzs gzsVar2;
        q630 q630Var2;
        wh50 wh50Var;
        wh50 wh50Var2;
        androidx.compose.runtime.a M = aVar.M(1955875329);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            gzsVar2 = gzsVar;
            i3 |= M.y(gzsVar2) ? 2048 : 1024;
        } else {
            gzsVar2 = gzsVar;
        }
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1955875329, i3, -1, "com.vk.profile.user.impl.ui.edit.mvi.view.main.settings.name.DescriptionInputForm (DescriptionInputForm.kt:31)");
            }
            rc8 a = wc8.a(M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = qq.h(0, M);
            }
            wh50 wh50Var3 = (wh50) x;
            nek0 nek0Var = (nek0) M.r(uvi.q);
            boolean l = M.l(str.length() == 0);
            Object x2 = M.x();
            if (l || x2 == c0012a) {
                String D0 = erm0.D0(VersionConstants.PRODUCT_MAJOR_VERSION, str);
                int length = D0.length();
                wh50Var = wh50Var3;
                x2 = androidx.compose.runtime.k.b(new tho0(D0, jgz.c(length, length), 4));
                M.R(x2);
            } else {
                wh50Var = wh50Var3;
            }
            wh50 wh50Var4 = (wh50) x2;
            sc8 sc8Var = new sc8(a, 0);
            a5x.a aVar2 = a5x.a;
            q630.a aVar3 = q630.a.a;
            q630 a2 = qri.a(aVar3, aVar2, sc8Var);
            tho0 tho0Var = (tho0) wh50Var4.getValue();
            String N = d370.N(R.string.user_profile_edit_description_hint, 0, M);
            boolean booleanValue = ((Boolean) gzsVar2.invoke()).booleanValue();
            int i4 = i3;
            rgy rgyVar = new rgy(0, 7, Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
            boolean J = M.J(nek0Var);
            Object x3 = M.x();
            if (J || x3 == c0012a) {
                x3 = new zt4(nek0Var, 29);
                M.R(x3);
            }
            uey ueyVar = new uey((izs) x3, null, null, 62);
            boolean J2 = ((i4 & 112) == 32) | M.J(wh50Var4);
            Object x4 = M.x();
            if (J2 || x4 == c0012a) {
                x4 = new z1m(izsVar, wh50Var4, 0);
                M.R(x4);
            }
            izs izsVar2 = (izs) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                wh50Var2 = wh50Var;
                x5 = new w3i(2, wh50Var2);
                M.R(x5);
            } else {
                wh50Var2 = wh50Var;
            }
            ybo0 a3 = g8s.e.a.a(tho0Var, izsVar2, N, null, 2, 0, booleanValue, rgyVar, ueyVar, (izs) x5, null, M, 100687872, 24960, 11432);
            M = M;
            nvu0.a(a3, a2, h8s.a.a(d370.N(R.string.user_profile_edit_description, 0, M), false, null, null, null, M, 196608, 30), null, null, M, 0, 24);
            Integer valueOf = Integer.valueOf(((Number) wh50Var2.getValue()).intValue());
            Boolean valueOf2 = Boolean.valueOf(drm0.N(str));
            boolean y = M.y(a);
            Object x6 = M.x();
            if (y || x6 == c0012a) {
                x6 = new b2m(a, null);
                M.R(x6);
            }
            bap.f(valueOf, valueOf2, (wzs) x6, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a2m(i, 0, str, izsVar, gzsVar, q630Var2);
        }
    }
}
