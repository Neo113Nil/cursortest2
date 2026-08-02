package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.semantics.SemanticsConfiguration;
import com.vk.ecomm.design.compose.booking.BookingCard$BookingCardType;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BookingCard.kt */
/* loaded from: classes18.dex */
public final class co7 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;

    public co7(BookingCard$BookingCardType bookingCard$BookingCardType, gzs gzsVar, com.vk.core.compose.component.semantics.a aVar) {
        this.a = androidx.compose.runtime.k.b(bookingCard$BookingCardType);
        this.b = androidx.compose.runtime.k.b(gzsVar);
        this.c = androidx.compose.runtime.k.b(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        int i3;
        q630.a aVar3;
        boolean z;
        lg90 b;
        String a;
        androidx.compose.runtime.a M = aVar.M(-445568364);
        if ((i & 6) == 0) {
            i2 = i | (M.J(q630Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-445568364, i2, -1, "com.vk.ecomm.design.compose.booking.BookingCardImpl.Content (BookingCard.kt:127)");
            }
            q630 b2 = com.vk.core.compose.component.semantics.b.b(q630Var, (SemanticsConfiguration) ((zak0) this.c).getValue());
            long j = wlb0.h(M).getBackground().B;
            float f = kqu0.g;
            q630 a2 = r18.a((float) 0.5d, wlb0.h(M).getImage().a, hr80.m(b2, j, vog0.b(f)), vog0.b(f));
            wh50 wh50Var = this.b;
            boolean z2 = ((gzs) ((zak0) wh50Var).getValue()) != null;
            int i4 = i2 & 112;
            boolean z3 = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z3 || x == c0012a) {
                x = new z4(this, 12);
                M.R(x);
            }
            q630 c = ojc.c(a2, z2, null, null, (gzs) x, 14);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, a3, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630.a aVar5 = q630.a.a;
            q630 E = s200.E(txj0.f(aVar5, 1.0f), kqu0.w, kqu0.v);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.t), dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, E);
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
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 q = txj0.q(aVar5, 64);
            wh50 wh50Var2 = this.a;
            BookingCard$BookingCardType bookingCard$BookingCardType = (BookingCard$BookingCardType) ((zak0) wh50Var2).getValue();
            bookingCard$BookingCardType.getClass();
            if (androidx.compose.runtime.b.d()) {
                q630Var2 = q;
                i3 = i4;
                aVar3 = aVar5;
                androidx.compose.runtime.b.f(-1787447813, 0, -1, "com.vk.ecomm.design.compose.booking.BookingCard.BookingCardType.<get-icon> (BookingCard.kt:86)");
            } else {
                q630Var2 = q;
                i3 = i4;
                aVar3 = aVar5;
            }
            int[] iArr = BookingCard$BookingCardType.a.$EnumSwitchMapping$0;
            int i5 = iArr[bookingCard$BookingCardType.ordinal()];
            if (i5 == 1) {
                z = false;
                b = or.b(M, 249572226, R.drawable.vk_icon_illustration_service_bubble_64, M, 0);
            } else if (i5 == 2) {
                z = false;
                b = or.b(M, 249575331, R.drawable.vk_icon_illustration_service_bubbles_64, M, 0);
            } else {
                if (i5 != 3) {
                    throw alb0.c(249571072, M);
                }
                z = false;
                b = or.b(M, 249578498, R.drawable.vk_icon_illustration_service_bubble_64, M, 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean z4 = z;
            q630 q630Var3 = q630Var2;
            int i6 = i3;
            q630.a aVar6 = aVar3;
            vjw.a(b, null, q630Var3, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, M, 440, 120);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 E2 = ahn.E(new xpy(1.0f, true), "booking_card_title");
            BookingCard$BookingCardType bookingCard$BookingCardType2 = (BookingCard$BookingCardType) ((zak0) wh50Var2).getValue();
            bookingCard$BookingCardType2.getClass();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(788571177, z4 ? 1 : 0, -1, "com.vk.ecomm.design.compose.booking.BookingCard.BookingCardType.<get-title> (BookingCard.kt:79)");
            }
            int i7 = iArr[bookingCard$BookingCardType2.ordinal()];
            if (i7 == 1) {
                a = zq.a(M, 1902659116, R.string.booking_card_individual_service, M, z4 ? 1 : 0);
            } else if (i7 == 2) {
                a = zq.a(M, 1902662087, R.string.booking_card_group_service, M, z4 ? 1 : 0);
            } else {
                if (i7 != 3) {
                    throw alb0.c(1902657944, M);
                }
                a = zq.a(M, 1902664936, R.string.booking_card_common_service, M, z4 ? 1 : 0);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(a, E2, wlb0.h(M).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).p, M, 0, 0, 8184);
            float f2 = 8;
            q630 H = s200.H(aVar6, 12, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 4);
            boolean z5 = ((gzs) ((zak0) wh50Var).getValue()) != null ? true : z4 ? 1 : 0;
            Object[] objArr = i6 == 32 ? true : z4 ? 1 : 0;
            Object x2 = M.x();
            if (objArr != false || x2 == c0012a) {
                x2 = new mh(this, 13);
                M.R(x2);
            }
            q630 E3 = ahn.E(ojc.c(H, z5, null, null, (gzs) x2, 14), "booking_card_chevron");
            cp10 d = ja8.d(dt1.a.b, z4);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, E3);
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
            k9q0.w(M, d, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            pzu0.b(pg90.a(R.drawable.vk_icon_chevron_right_24, z4 ? 1 : 0, M), null, txj0.s(aVar6, 16, 24), wlb0.h(M).getIcon().n, M, 440, 0);
            aVar2 = M;
            aVar2.G();
            aVar2.G();
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
            s.d = new bo7(this, q630Var, i, 0);
        }
    }
}
