package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.xpv;

/* compiled from: ManageSourceItem.kt */
/* loaded from: classes4.dex */
public final class qh00 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a M = aVar.M(-2137304058);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2137304058, i2, -1, "com.vk.notifications.design.compose.list.menu.ManageSourcesItem (ManageSourceItem.kt:33)");
            }
            M.K(465223385);
            b(i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, M, str, gzsVar, q630Var);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qi1(i, 1, str, gzsVar, q630Var);
        }
    }

    public static final void b(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-816254889);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-816254889, i2, -1, "com.vk.notifications.design.compose.list.menu.MilkshakeManageSourcesItem (ManageSourceItem.kt:68)");
            }
            q630 E = s200.E(ojc.c(txj0.z(txj0.f(q630Var, 1.0f), null, 3), false, null, null, gzsVar, 15), 16, 6);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            uog0 uog0Var = vog0.a;
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(aVar3, uog0Var);
            float f = 48;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1869183844, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
            }
            lg90 b = or.b(M, -604730424, R.drawable.vk_icon_add_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ldu0.b(xpv.a.a(b, wlb0.h(M).getIcon().a, new rek0(wlb0.h(M).getBackground().x), M, 24584, 8), f, d, null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            f9t.e(txj0.v(aVar3, 12), M, 6);
            long j = wlb0.h(M).getText().a;
            frv0 frv0Var = wlb0.l(M).T;
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new dam(15);
                M.R(x);
            }
            yqv0.c(str, aVar3, j, null, null, 0, 1, null, 0, false, 0, 1, (izs) x, frv0Var, M, (i2 & 14) | 48, Tensorflow.FRAME_WIDTH, 1976);
            M = M;
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ph00(i, 0, str, gzsVar, q630Var);
        }
    }
}
