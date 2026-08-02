package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vkontakte.android.R;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.uxe0;

/* compiled from: FriendsReviewItemCell.kt */
/* loaded from: classes18.dex */
public final class wss {
    public static final void a(final long j, final String str, final String str2, final izs izsVar, q630 q630Var, final int i, androidx.compose.runtime.a aVar, final int i2) {
        final q630 q630Var2;
        q630.a aVar2;
        int i3;
        q630 q630Var3;
        androidx.compose.runtime.a M = aVar.M(-714471822);
        int i4 = i2 | (M.p(j) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.J(str2) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024) | 8192 | (M.o(i) ? 131072 : 65536);
        if (M.t(i4 & 1, (74899 & i4) != 74898)) {
            M.V();
            int i5 = i2 & 1;
            q630.a aVar3 = q630.a.a;
            if (i5 == 0 || M.i()) {
                boolean z = ((i4 & 7168) == 2048) | ((i4 & 14) == 4);
                Object x = M.x();
                if (z || x == a.C0011a.a) {
                    x = new f0j(1, j, izsVar);
                    M.R(x);
                }
                q630 c = ojc.c(aVar3, false, null, null, (gzs) x, 15);
                aVar2 = aVar3;
                i3 = i4 & (-57345);
                q630Var3 = c;
            } else {
                M.h();
                i3 = i4 & (-57345);
                aVar2 = aVar3;
                q630Var3 = q630Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-714471822, i3, -1, "com.vk.ecomm.design.compose.friendsitemcell.FriendsReviewItemCell (FriendsReviewItemCell.kt:40)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var3);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            int i6 = i3;
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
            k9q0.w(M, c2, dVar);
            float f = 6;
            f9t.e(txj0.h(aVar2, f), M, 6);
            q630 q630Var4 = q630Var3;
            q630 z2 = txj0.z(aVar2, null, 3);
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, z2);
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
            k9q0.w(M, c3, dVar);
            f9t.e(txj0.v(aVar2, 16), M, 6);
            q630.a aVar5 = aVar2;
            ldu0.b(phw.a.a(fwu0.l(null, str, null, null, M, i6 & 112, 61), null, null, null, null, M, 196616, 30), 42, s200.D(r18.a((float) 0.5d, wlb0.h(M).getBackground().g, aVar2, vog0.a), ((azl) M.r(uvi.h)).j1(1)), null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            f9t.e(txj0.v(aVar5, 12), M, 6);
            long j2 = wlb0.h(M).getText().m;
            frv0 frv0Var = wlb0.l(M).N;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(str2, new xpy(1.0f, true), j2, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, M, ((i6 >> 6) & 14) | 100663296, 48, 5880);
            M = M;
            if (i > 0) {
                M.K(-446249419);
                f9t.e(txj0.v(aVar5, f), M, 6);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(171813404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Favorite16> (VkSdkIcons.kt:840)");
                }
                lg90 b = or.b(M, -1107727797, R.drawable.vk_icon_favorite_16, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                pzu0.b(b, null, txj0.B(aVar5, null, 3), uxe0.a.a(M).e, M, 440, 0);
                f9t.e(txj0.v(aVar5, 4), M, 6);
                yqv0.c(String.valueOf(i), txj0.B(aVar5, null, 3), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).b0, M, 100663344, 48, 5880);
                M = M;
            } else {
                M.K(-449024694);
            }
            M.j();
            f9t.e(txj0.v(aVar5, 18), M, 6);
            M.G();
            if (xga0.c(aVar5, f, M, 6)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var4;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(j, str, str2, izsVar, q630Var2, i, i2) { // from class: xsna.vss
                public final /* synthetic */ long b;
                public final /* synthetic */ String c;
                public final /* synthetic */ String d;
                public final /* synthetic */ izs e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ int g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    wss.a(this.b, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
