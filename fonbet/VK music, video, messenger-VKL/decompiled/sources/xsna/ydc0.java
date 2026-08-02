package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.ContentSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.dto.common.AttachmentType;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.qco0;

/* compiled from: PostingCtaAttachChoiceBottomSheetDelegate.kt */
/* loaded from: classes4.dex */
public final class ydc0 {

    /* compiled from: PostingCtaAttachChoiceBottomSheetDelegate.kt */
    public static final class a implements ekg0 {
        public final /* synthetic */ gzs<s3q0> a;
        public final /* synthetic */ boolean b;

        public a(boolean z, gzs gzsVar) {
            this.a = gzsVar;
            this.b = z;
        }

        @Override // xsna.ana
        public final void a(int i, androidx.compose.runtime.a aVar) {
            aVar.K(1487052142);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1487052142, i, -1, "com.vk.newsfeed.impl.posting.ButtonTypeCheckCircle.<no name provided>.invoke (PostingCtaAttachChoiceBottomSheetDelegate.kt:160)");
            }
            uju0.a(this.a, null, this.b, false, null, null, aVar, 0, 58);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar.j();
        }
    }

    public static final void a(rsx rsxVar, AttachmentType attachmentType, izs<? super AttachmentType, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-2015657434);
        int i4 = i | (M.J(rsxVar) ? 4 : 2) | (M.o(attachmentType == null ? -1 : attachmentType.ordinal()) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2015657434, i4, -1, "com.vk.newsfeed.impl.posting.BottomSheetContent (PostingCtaAttachChoiceBottomSheetDelegate.kt:96)");
            }
            float f = 12;
            q630 d = rte0.d(q630.a.a, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, m);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.market_involvement_button, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14), null, null, null, null, TopBar$Before.d.a.a(d370.N(R.string.close, 0, M), gzsVar, null, null, M, ((i4 >> 6) & 112) | 24576, 12), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            M = M;
            boolean z = rsxVar.b;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z) {
                M.K(-713602817);
                String N = d370.N(R.string.market_involvement_write, 0, M);
                String N2 = d370.N(R.string.market_involvement_write_description, 0, M);
                boolean z2 = attachmentType == AttachmentType.MESSAGE_TO_BC;
                i2 = i4;
                i3 = 256;
                boolean z3 = (i2 & 896) == 256;
                Object x = M.x();
                if (z3 || x == c0012a) {
                    x = new th2(izsVar, 8);
                    M.R(x);
                }
                b(R.drawable.vk_icon_message_outline_24, 0, M, N, N2, (gzs) x, z2);
            } else {
                i2 = i4;
                i3 = 256;
                M.K(-718001934);
            }
            M.j();
            if (rsxVar.a) {
                M.K(-713080808);
                String N3 = d370.N(R.string.market_involvement_all_goods, 0, M);
                String N4 = d370.N(R.string.market_involvement_all_goods_description, 0, M);
                boolean z4 = attachmentType == AttachmentType.MARKET_LINK;
                boolean z5 = (i2 & 896) == i3;
                Object x2 = M.x();
                if (z5 || x2 == c0012a) {
                    x2 = new ux(izsVar, 6);
                    M.R(x2);
                }
                b(R.drawable.vk_icon_storefront_outline_24, 0, M, N3, N4, (gzs) x2, z4);
            } else {
                M.K(-718001934);
            }
            M.j();
            if (rsxVar.c) {
                M.K(-712555327);
                String N5 = d370.N(R.string.market_involvement_booking, 0, M);
                String N6 = d370.N(R.string.market_involvement_booking_description, 0, M);
                boolean z6 = attachmentType == AttachmentType.BOOKING;
                boolean z7 = (i2 & 896) == i3;
                Object x3 = M.x();
                if (z7 || x3 == c0012a) {
                    x3 = new o87(izsVar, 10);
                    M.R(x3);
                }
                b(R.drawable.vk_icon_calendar_outline_24, 0, M, N5, N6, (gzs) x3, z6);
            } else {
                M.K(-718001934);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new r3g(rsxVar, attachmentType, izsVar, gzsVar, i);
        }
    }

    public static final void b(final int i, final int i2, androidx.compose.runtime.a aVar, final String str, final String str2, gzs gzsVar, final boolean z) {
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(95654057);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.l(z) ? 2048 : 1024) | (M.y(gzsVar) ? 16384 : 8192);
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(95654057, i3, -1, "com.vk.newsfeed.impl.posting.ButtonTypeCheckCircle (PostingCtaAttachChoiceBottomSheetDelegate.kt:149)");
            }
            gzsVar2 = gzsVar;
            q630 h = txj0.h(ojc.c(q630.a.a, false, null, null, gzsVar, 15), 58);
            lg90 a2 = pg90.a(i, i3 & 14, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getIcon().a;
            ContentSize contentSize = ContentSize.Medium;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2038013681, 24584, -1, "com.vk.core.compose.component.cell.content.LeftIconContent.Companion.invoke (LeftIconContent.kt:63)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new szy(a2, j, contentSize);
                M.R(x);
            }
            szy szyVar = (szy) x;
            ((zak0) szyVar.a).setValue(a2);
            ((zak0) szyVar.b).setValue(new l5g(j));
            ((zak0) szyVar.c).setValue(null);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            wiu0.c(qco0.a.a(((i3 >> 3) & 14) | 100663296 | (i3 & 896), 250, M, str, str2), h, szyVar, new a(z, gzsVar2), aVar2, 0, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final gzs gzsVar3 = gzsVar2;
            s.d = new wzs(i, str, str2, z, gzsVar3, i2) { // from class: xsna.xdc0
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ gzs f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ydc0.b(this.b, I, (androidx.compose.runtime.a) obj, this.c, this.d, this.f, this.e);
                    return s3q0.a;
                }
            };
        }
    }
}
