package xsna;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: CommunityChannelImageCell.kt */
/* loaded from: classes17.dex */
public final class hug {
    public static final void a(final dt10 dt10Var, final yua yuaVar, final q630 q630Var, uog0 uog0Var, final float f, final int i, final String str, final gzs gzsVar, androidx.compose.runtime.a aVar, final int i2) {
        final uog0 uog0Var2;
        int i3;
        uog0 b;
        androidx.compose.runtime.a M = aVar.M(805372949);
        int i4 = i2 | (M.J(dt10Var) ? 4 : 2) | (M.J(yuaVar) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | 1024 | (M.n(f) ? 16384 : 8192) | (M.o(i) ? 131072 : 65536) | (M.J(str) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(gzsVar) ? 8388608 : 4194304);
        if (M.t(i4 & 1, (4793491 & i4) != 4793490)) {
            M.V();
            if ((i2 & 1) == 0 || M.i()) {
                i3 = i4 & (-7169);
                b = vog0.b(kqu0.f);
            } else {
                M.h();
                i3 = i4 & (-7169);
                b = uog0Var;
            }
            int i5 = i3;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(805372949, i5, -1, "com.vk.community.design.compose.components.channel.CommunityChannelImageCell (CommunityChannelImageCell.kt:53)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uog0 uog0Var3 = b;
            shu0.b(gzsVar, q630Var, uog0Var3, ylu0Var.getBackground().B, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, kai.c(-1393577789, new wzs() { // from class: xsna.fug
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    yua yuaVar2;
                    q630.a aVar2;
                    Object obj3;
                    int i6;
                    yua yuaVar3 = yuaVar;
                    String str2 = yuaVar3.a;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1393577789, intValue, -1, "com.vk.community.design.compose.components.channel.CommunityChannelImageCell.<anonymous> (CommunityChannelImageCell.kt:60)");
                        }
                        q630.a aVar4 = q630.a.a;
                        q630 D = s200.D(m200.G(txj0.c(aVar4, 1.0f), IntrinsicSize.Min), kqu0.u);
                        a.m mVar = androidx.compose.foundation.layout.a.c;
                        dt1.a.getClass();
                        androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                        int hashCode = Long.hashCode(n34.n(aVar3));
                        sy90 D2 = aVar3.D();
                        q630 c = qri.c(aVar3, D);
                        cri.h7.getClass();
                        LayoutNode.a aVar5 = cri.a.b;
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        cri.a.c cVar = cri.a.f;
                        k9q0.w(aVar3, a, cVar);
                        cri.a.e eVar = cri.a.e;
                        k9q0.w(aVar3, D2, eVar);
                        Integer valueOf = Integer.valueOf(hashCode);
                        cri.a.b bVar = cri.a.g;
                        k9q0.w(aVar3, valueOf, bVar);
                        cri.a.C2678a c2678a = cri.a.h;
                        k9q0.t(aVar3, c2678a);
                        cri.a.d dVar = cri.a.d;
                        k9q0.w(aVar3, c, dVar);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        q630 d = sua.d(f, new xpy(1.0f, true), false);
                        String str3 = str;
                        boolean J = aVar3.J(str3);
                        Object x = aVar3.x();
                        Object obj4 = a.C0011a.a;
                        if (J || x == obj4) {
                            x = new g5b(str3, 2);
                            aVar3.R(x);
                        }
                        q630 b2 = egi0.b(d, false, (izs) x);
                        cp10 d2 = ja8.d(dt1.a.d, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar3));
                        sy90 D3 = aVar3.D();
                        q630 c2 = qri.c(aVar3, b2);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, d2, cVar);
                        k9q0.w(aVar3, D3, eVar);
                        ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                        k9q0.w(aVar3, c2, dVar);
                        uog0 b3 = vog0.b(kqu0.e);
                        dt10 dt10Var2 = dt10Var;
                        q4h.a(dt10Var2.a, txj0.d(aVar4, 1.0f), b3, kai.c(-1345812913, new rv7(2, dt10Var2, b3), aVar3), aVar3, 24624, 8);
                        int i7 = i;
                        if (i7 > 1) {
                            aVar3.K(-1589854711);
                            String valueOf2 = String.valueOf(i7);
                            ContentBadgeSize contentBadgeSize = ContentBadgeSize.Small;
                            ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
                            ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
                            q630 D4 = s200.D(aVar4, kqu0.s);
                            Object x2 = aVar3.x();
                            if (x2 == obj4) {
                                x2 = new sd4(17);
                                aVar3.R(x2);
                            }
                            obj3 = obj4;
                            aVar2 = aVar4;
                            yuaVar2 = yuaVar3;
                            i6 = 0;
                            rnu0.c(contentBadgeSize, contentBadgeMode, design, egi0.a(D4, (izs) x2), null, null, valueOf2, null, null, null, false, null, false, null, aVar3, 438, 0, 16304);
                            aVar3 = aVar3;
                        } else {
                            yuaVar2 = yuaVar3;
                            aVar2 = aVar4;
                            obj3 = obj4;
                            i6 = 0;
                            aVar3.K(-1593575269);
                        }
                        aVar3.j();
                        aVar3.G();
                        boolean J2 = aVar3.J(str2);
                        Object x3 = aVar3.x();
                        if (J2 || x3 == obj3) {
                            x3 = androidx.compose.runtime.k.b(str2);
                            aVar3.R(x3);
                        }
                        wh50 wh50Var = (wh50) x3;
                        String str4 = (String) wh50Var.getValue();
                        q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, i6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.C0;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, i6, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var2.getText().p;
                        yua yuaVar4 = yuaVar2;
                        boolean J3 = aVar3.J(yuaVar4) | aVar3.J(wh50Var);
                        Object x4 = aVar3.x();
                        if (J3 || x4 == obj3) {
                            x4 = new m9(9, yuaVar4, wh50Var);
                            aVar3.R(x4);
                        }
                        androidx.compose.runtime.a aVar6 = aVar3;
                        yqv0.c(str4, H, j, null, null, 0, 0, null, 2, false, 0, 1, (izs) x4, frv0Var, aVar6, 100663296, 48, 1784);
                        aVar6.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i5 >> 21) & 14) | 805306368 | ((i5 >> 3) & 112));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uog0Var2 = uog0Var3;
        } else {
            M.h();
            uog0Var2 = uog0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(yuaVar, q630Var, uog0Var2, f, i, str, gzsVar, i2) { // from class: xsna.gug
                public final /* synthetic */ yua c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ uog0 e;
                public final /* synthetic */ float f;
                public final /* synthetic */ int g;
                public final /* synthetic */ String h;
                public final /* synthetic */ gzs i;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    hug.a(dt10.this, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
