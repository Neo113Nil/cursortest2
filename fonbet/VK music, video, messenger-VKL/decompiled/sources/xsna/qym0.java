package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SubscriptionInfoView.kt */
/* loaded from: classes5.dex */
public final class qym0 {
    public static final void a(r5j0 r5j0Var, gzs<s3q0> gzsVar, String str, q630 q630Var, izs<? super ljo0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        q630 q630Var2;
        int i3;
        izs<? super ljo0, s3q0> izsVar2;
        int i4;
        androidx.compose.runtime.a aVar2;
        q630 q630Var3;
        izs<? super ljo0, s3q0> izsVar3;
        izs<? super ljo0, s3q0> izsVar4;
        q630 g;
        androidx.compose.runtime.a M = aVar.M(-2134094662);
        int i5 = i | (M.J(r5j0Var) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.J(str) ? 256 : 128);
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = i5 | (M.J(q630Var2) ? 2048 : 1024);
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i4 = i3 | 24576;
            izsVar2 = izsVar;
        } else {
            izsVar2 = izsVar;
            i4 = i3 | (M.y(izsVar2) ? 16384 : 8192);
        }
        int i8 = i4;
        if (M.t(i8 & 1, (i8 & 9363) != 9362)) {
            q630.a aVar3 = q630.a.a;
            q630 q630Var4 = i6 != 0 ? aVar3 : q630Var2;
            if (i7 != 0) {
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new y160(13);
                    M.R(x);
                }
                izsVar4 = (izs) x;
            } else {
                izsVar4 = izsVar2;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2134094662, i8, -1, "com.vk.profile.design.view.subscriptioninfo.ContentRow (SubscriptionInfoView.kt:108)");
            }
            q630 d = rte0.d(aVar3, r5j0Var);
            if (gzsVar != null && (g = d.g(ojc.c(aVar3, false, null, null, gzsVar, 15))) != null) {
                d = g;
            }
            float f = 12;
            q630 E = s200.E(txj0.f(d, 1.0f), f, f);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.e, dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 q = txj0.q(s200.D(aVar3, 1), 11);
            qzu0.a.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(225322844, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-Asterisk816> (VkIcons.kt:530)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_asterisk_8_16, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            pzu0.b(a2, null, q, wlb0.h(M).getIcon().b, aVar2, 440, 0);
            f9t.e(txj0.v(aVar3, 8), aVar2, 6);
            int i9 = i8 >> 6;
            q630 q630Var5 = q630Var4;
            yqv0.c(str, q630Var5, wlb0.h(aVar2).getText().m, null, null, 0, 0, null, 0, false, 0, 0, izsVar4, wlb0.l(aVar2).d0, aVar2, i9 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, i9 & 896, 4088);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var3 = q630Var5;
            izsVar3 = izsVar4;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var3 = q630Var2;
            izsVar3 = izsVar2;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new pym0(r5j0Var, gzsVar, str, q630Var3, izsVar3, i, i2);
        }
    }
}
