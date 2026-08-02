package xsna;

import android.text.Spannable;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CartSummary.kt */
/* loaded from: classes18.dex */
public final class ry9 {

    /* compiled from: CartSummary.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CartItem.Summary.Action.Type.values().length];
            try {
                iArr[CartItem.Summary.Action.Type.Checkout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CartItem.Summary.Action.Type.CommunityShop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CartItem.Summary.Action.Style.values().length];
            try {
                iArr2[CartItem.Summary.Action.Style.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CartItem.Summary.Action.Style.Secondary.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void a(CartItem.Summary summary, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        ButtonStyle buttonStyle;
        CartItem.Summary.Action action = summary.g;
        androidx.compose.runtime.a M = aVar.M(-1899412257);
        if ((i & 6) == 0) {
            i2 = (M.J(summary) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1899412257, i2, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.CartSummary (CartSummary.kt:34)");
            }
            String str = "cart_summary_" + fkq0.a(summary.c);
            q630.a aVar2 = q630.a.a;
            q630 g = ahn.E(aVar2, str).g(q630Var);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.u, 1, txj0.f(aVar2, 1.0f));
            String g2 = kq01.g(summary.d, M);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new g54(4);
                M.R(x);
            }
            int i3 = i2;
            com.vk.core.compose.component.cell.content.f1 a3 = RichCell$Middle.h.b.a(g2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14);
            String g3 = kq01.g(summary.e, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new com.vk.movika.sdk.base.observable.s(9);
                M.R(x2);
            }
            com.vk.core.compose.component.cell.content.f1 a4 = RichCell$Middle.c.b.a(g3, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 196656, 12);
            String str2 = summary.f;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new p60(8);
                M.R(x3);
            }
            ygv0.a(F, null, RichCell$Middle.b.a(null, a3, null, a4, null, null, null, null, RichCell$Middle.d.a.a(str2, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), M, 3072, 2), M, 0, 1515), null, null, M, 0, 58);
            int i4 = i3 & 112;
            boolean z = (i4 == 32) | ((i3 & 14) == 4);
            Object x4 = M.x();
            if (z || x4 == c0012a) {
                x4 = new xy0(2, izsVar, summary);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            ButtonSize buttonSize = ButtonSize.Large;
            int i5 = a.$EnumSwitchMapping$1[action.b.ordinal()];
            if (i5 == 1) {
                buttonStyle = ButtonStyle.Primary;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                buttonStyle = ButtonStyle.Secondary;
            }
            bhu0.e(gzsVar, buttonSize, buttonStyle, ButtonAppearance.Accent, s200.E(txj0.f(ahn.E(aVar2, "cart_summary_button"), 1.0f), kqu0.b, kqu0.v), null, false, false, null, null, null, kq01.g(action.a, M), null, null, null, null, action.d, null, null, null, M, 3120, 0, 0, 4059104);
            M = M;
            b(summary.h, izsVar, null, M, i4);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new py9(i, 0, summary, izsVar, q630Var);
        }
    }

    public static final void b(Object obj, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(107462432);
        if ((i & 6) == 0) {
            i2 = i | (M.J(obj) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(107462432, i3, -1, "com.vk.ecomm.cart.impl.cart.ui.compose.list.UserAgreement (CartSummary.kt:108)");
            }
            Spannable spannable = (Spannable) obj;
            boolean J = M.J(spannable) | ((i3 & 112) == 32);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = spannable != null ? ws2.d(spannable, new pc5(izsVar, 1)) : null;
                M.R(x);
            }
            us2 us2Var = (us2) x;
            q630.a aVar2 = q630.a.a;
            if (us2Var == null || us2Var.c.length() == 0) {
                M.K(1658652642);
            } else {
                M.K(1663176441);
                q630 f = txj0.f(ahn.E(aVar2, "cart_summary_user_agreement").g(aVar2), 1.0f);
                float f2 = kqu0.b;
                yqv0.d(us2Var, s200.H(f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, kqu0.v, 2), 0L, 0, null, 0, false, 0, null, null, null, M, 0, 0, 16380);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qy9(obj, izsVar, q630Var2, i, 0);
        }
    }
}
