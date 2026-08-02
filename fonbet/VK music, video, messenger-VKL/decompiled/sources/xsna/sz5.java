package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vk.profile.design.compose.header.sink.AuthorHeaderEvent;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BadgesSlotImpl.kt */
/* loaded from: classes5.dex */
public final class sz5 implements e95 {
    public final wh50 a;
    public final wh50 b;

    public sz5(List list, rv5 rv5Var) {
        this.a = androidx.compose.runtime.k.b(new wow(list));
        this.b = androidx.compose.runtime.k.b(rv5Var);
    }

    @Override // xsna.e95
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(581890859);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(581890859, i2, -1, "com.vk.profile.design.compose.header.header.BadgesSlotImpl.Content (BadgesSlotImpl.kt:39)");
            }
            izs<? super AuthorHeaderEvent, s3q0> izsVar = (izs) M.r(h85.a);
            a.j g = androidx.compose.foundation.layout.a.g(4);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(g, dt1.a.k, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            M.K(1237915824);
            Iterator it = ((wow) ((zak0) this.a).getValue()).b.iterator();
            while (it.hasNext()) {
                b((AuthorHeaderConfig.Header.a) it.next(), izsVar, M, (i2 << 3) & 896);
            }
            if (gp.d(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qz5(this, q630Var, i, 0);
        }
    }

    public final void b(AuthorHeaderConfig.Header.a aVar, izs<? super AuthorHeaderEvent, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        int i2;
        Object obj;
        int i3;
        int i4;
        String str;
        int i5;
        androidx.compose.runtime.a M = aVar2.M(-2143231117);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2143231117, i2, -1, "com.vk.profile.design.compose.header.header.BadgesSlotImpl.BadgeContent (BadgesSlotImpl.kt:57)");
            }
            if (aVar instanceof AuthorHeaderConfig.Header.a.C1655a) {
                obj = AuthorHeaderEvent.a.InterfaceC1662a.C1663a.a;
                i3 = R.string.author_header_badge_a_plus;
                i4 = R.string.author_header_badge_a_plus_talkback;
                str = "author_header_a_plus_badge";
            } else if (aVar instanceof AuthorHeaderConfig.Header.a.c) {
                obj = AuthorHeaderEvent.a.InterfaceC1662a.c.a;
                i3 = R.string.author_header_badge_over_18;
                i4 = R.string.author_header_badge_over_18_talkback;
                str = "author_header_age_18_badge";
            } else {
                if (!(aVar instanceof AuthorHeaderConfig.Header.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                obj = AuthorHeaderEvent.a.InterfaceC1662a.b.a;
                i3 = R.string.author_header_badge_over_16;
                i4 = R.string.author_header_badge_over_16_talkback;
                str = "author_header_age_16_badge";
            }
            q630 E = ahn.E(q630.a.a, str);
            boolean y = M.y(obj) | ((i2 & 112) == 32);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new com.vk.newsfeed.common.recycler.holders.attachments.a(2, izsVar, obj);
                M.R(x);
            }
            q630 c = ojc.c(E, false, null, null, (gzs) x, 15);
            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Small;
            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.j().b;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            ContentBadgeAppearance.a aVar3 = new ContentBadgeAppearance.a(4, j, ylu0Var2.getText().d, 0L);
            String N = d370.N(i3, 0, M);
            String N2 = d370.N(i4, 0, M);
            if (androidx.compose.runtime.b.d()) {
                i5 = -1;
                androidx.compose.runtime.b.f(-1488300685, 384, -1, "com.vk.core.compose.component.contentbadge.ContentBadge.Middle.Text.Companion.invoke (ContentBadge.kt:103)");
            } else {
                i5 = -1;
            }
            us2 a = ws2.a(N, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-773012736, 6, i5, "com.vk.core.compose.component.contentbadge.remember (MiddleTextImpl.kt:80)");
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new bm20(N2, a);
                M.R(x2);
            }
            bm20 bm20Var = (bm20) x2;
            ((zak0) bm20Var.a).setValue(a);
            ((zak0) bm20Var.b).setValue(N2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rnu0.f(contentBadgeSize, contentBadgeMode, aVar3, c, bm20Var, (rv5) ((zak0) this.b).getValue(), M, 54);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rz5(i, 0, this, aVar, izsVar);
        }
    }
}
