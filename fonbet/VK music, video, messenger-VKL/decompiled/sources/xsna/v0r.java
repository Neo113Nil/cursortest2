package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.dto.common.VerifyInfo;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: FeedInlineCommentsScreenContent.kt */
/* loaded from: classes18.dex */
public final class v0r implements yah0 {
    public static com.vk.feed.design.view.newsfeed.inline.a o(Context context, String str, String str2, boolean z, String str3, boolean z2) {
        com.vk.feed.design.view.newsfeed.inline.a aVar = new com.vk.feed.design.view.newsfeed.inline.a(context);
        float f = 1;
        aVar.setPadding(aVar.getPaddingLeft(), iah0.a(f), aVar.getPaddingRight(), iah0.a(3));
        aVar.b.setPadding(iah0.a(8), iah0.a(2), iah0.a(16), iah0.a(f));
        aVar.setTextFontSize(14.0f);
        aVar.setNameTextSpaceWidth(iah0.a(7));
        if (z) {
            aVar.setAvatar("https://sun9-2.userapi.com/impg/oc1rZsWzXGH8ViKAoqaA4ddJ6DAVXsbrRi6E1w/hXNBroiBLV8.jpg?size=1000x1000&quality=95&sign=1bb2851e6c95e29f9f1c2a32f4e78662&c_uniq_tag=qwb74FOch2P7_eqjAcXQ8ffrGjKtkNXRVKaKJ2mB0DY&type=album");
        }
        aVar.a(str, str2, str3, false, z2 ? new VerifyInfo(true, false, false, false, false, false, 62, null) : null);
        return aVar;
    }

    public static /* synthetic */ com.vk.feed.design.view.newsfeed.inline.a p(v0r v0rVar, Context context, String str, String str2, boolean z, int i) {
        String str3 = (i & 16) != 0 ? null : "Фото";
        boolean z2 = (i & 32) == 0;
        v0rVar.getClass();
        return o(context, str, str2, z, str3, z2);
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        v0r v0rVar;
        androidx.compose.runtime.a M = aVar.M(-437227247);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-437227247, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.Content (FeedInlineCommentsScreenContent.kt:45)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i4 = i2;
            jjn0.a("Inline Comments", gzsVar, x5Var, gzsVar2, null, null, M, (i2 & 896) | ((i2 << 3) & 112) | 6 | ((i2 << 6) & 7168), 48);
            djn0.a(false, true, M, 438, 0);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            v0rVar = this;
            v0rVar.m(q9g.a(aVar2, 1.0f), M, (i4 >> 12) & 112);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            v0rVar = this;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h0c(v0rVar, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1018113914);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1018113914, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentInputSample (FeedInlineCommentsScreenContent.kt:177)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new rd1(19);
                M.R(x);
            }
            ae2.a(54, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new hd4(this, i, 2);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1896139113);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1896139113, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentMultiLineSample (FeedInlineCommentsScreenContent.kt:217)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new wcg(this, 14);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o85(this, i, 6);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1761444110);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1761444110, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentMultiLineWithAttachmentSample (FeedInlineCommentsScreenContent.kt:233)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new pwk(this, 10);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new zg7(this, i, 6);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1035853604);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1035853604, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentMultiLineWithAvatarAndAttachSample (FeedInlineCommentsScreenContent.kt:319)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new d9j(this, 7);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b47(this, i, 1);
        }
    }

    public final void f(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(911529734);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(911529734, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentMultiLineWithAvatarAndAttachmentSample (FeedInlineCommentsScreenContent.kt:250)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new mre(this, 19);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xa2(this, i, 6);
        }
    }

    public final void g(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1146448100);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1146448100, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentMultiLineWithAvatarAndLongNameAndAttachmentSample (FeedInlineCommentsScreenContent.kt:267)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ifg(this, 17);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new q0r(this, i, 0);
        }
    }

    public final void h(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1396297032);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1396297032, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentMultiLineWithAvatarAndLongNameAndBadgeAndAttachmentSample (FeedInlineCommentsScreenContent.kt:284)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new g54(this, 23);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new com.vk.movika.sdk.android.defaultplayer.control.n(this, i, 5);
        }
    }

    public final void i(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1356641258);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1356641258, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentMultiLineWithAvatarAndLongNameAndBadgeSample (FeedInlineCommentsScreenContent.kt:302)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new cvh(this, 6);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new oac(this, i, 5);
        }
    }

    public final void j(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1377479480);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1377479480, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentSingleLineSample (FeedInlineCommentsScreenContent.kt:201)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new lrk(this, 11);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new fne(this, i, 5);
        }
    }

    public final void k(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1028359915);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1028359915, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentWithAttachmentSample (FeedInlineCommentsScreenContent.kt:336)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new u4e(this, 20);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jd4(this, i, 9);
        }
    }

    public final void l(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1772920254);
        int i2 = (M.J(this) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1772920254, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentWithBadgesSample (FeedInlineCommentsScreenContent.kt:353)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new qqe(this, 17);
                M.R(x);
            }
            ae2.a(48, 4, M, (izs) x, null, txj0.f(q630.a.a, 1.0f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new u70(this, i, 4);
        }
    }

    public final void m(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-913354156);
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
                androidx.compose.runtime.b.f(-913354156, i2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList (FeedInlineCommentsScreenContent.kt:63)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(16);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new f1j(this, 9);
                M.R(x);
            }
            lqy.a(f, null, null, g, null, null, false, null, (izs) x, M, 24576, 494);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new rac(this, q630Var, i, 3);
        }
    }

    public final void n(String str, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(1267909795);
        if (M.t(i & 1, (i & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1267909795, i, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.SectionHeader (FeedInlineCommentsScreenContent.kt:165)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.d0;
            q630 f = txj0.f(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, s200.E(hr80.m(f, ylu0Var.getBackground().x, androidx.compose.ui.graphics.e.a), 16, 8), 0L, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, aVar2, 6, 0, 8188);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ed4(this, str, i, 4);
        }
    }
}
