package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.feature.music.holders.audiobook.ComposeAudioBookSliderVh;
import com.vk.dto.common.id.UserId;
import com.vk.video.profile.presentation.models.StateProfileSubscribe;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.j5h;
import xsna.k8s;
import xsna.q5b0;
import xsna.q630;
import xsna.t8s;
import xsna.ty6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class xd0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xd0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((ae0) this.c).a((gzs) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((no7) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                ((Integer) obj2).getClass();
                ((j5h.f) this.c).g((znj) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 3:
                vj4 vj4Var = (vj4) this.c;
                ComposeAudioBookSliderVh composeAudioBookSliderVh = (ComposeAudioBookSliderVh) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1656253311, intValue, -1, "com.vk.catalog2.feature.music.holders.audiobook.ComposeAudioBookSliderVh.bindData.<anonymous> (ComposeAudioBookSliderVh.kt:97)");
                    }
                    rrv0.d(null, null, null, null, kai.c(651172964, new n85(2, vj4Var, composeAudioBookSliderVh), aVar), aVar, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((t8s.b) this.c).a((k8s.a) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 5:
                q630 q630Var = (q630) this.c;
                gzs gzsVar = (gzs) this.d;
                ((Integer) obj2).getClass();
                ijw.a(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                p5b0.a((q5b0.b) this.c, (q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 7:
                UserId userId = (UserId) this.c;
                StateProfileSubscribe stateProfileSubscribe = (StateProfileSubscribe) this.d;
                UIBlockList uIBlockList = (UIBlockList) obj;
                for (UIBlock uIBlock : uIBlockList.y) {
                    if (uIBlock instanceof UIBlockVideo) {
                        UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                        if (epx.f(uIBlockVideo.B.I0(), userId)) {
                            uIBlockVideo.B.k3(stateProfileSubscribe == StateProfileSubscribe.SUBSCRIBE);
                        }
                    }
                }
                return uIBlockList;
            default:
                wh50 wh50Var = (wh50) this.c;
                b78 b78Var = (b78) this.d;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-594411872, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.VkAppBottomPlayer.<anonymous> (VkAppBottomPlayer.kt:77)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getIcon().l;
                    aVar2.K(847992);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j2 = ylu0Var2.getBackground().r;
                    e.a aVar3 = androidx.compose.ui.graphics.e.a;
                    q630.a aVar4 = q630.a.a;
                    q630 m = hr80.m(aVar4, j2, aVar3);
                    if (!((Boolean) wh50Var.getValue()).booleanValue()) {
                        boolean p = aVar2.p(j);
                        Object x = aVar2.x();
                        if (p || x == a.C0011a.a) {
                            x = new l5h(j, 2);
                            aVar2.R(x);
                        }
                        m = m.g(bu00.c(aVar4, (izs) x));
                    }
                    aVar2.j();
                    dt1.a.getClass();
                    ty6.b bVar = dt1.a.l;
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, aVar2, 48);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, m);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar5);
                    } else {
                        aVar2.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar2, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar2, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(aVar2, valueOf, bVar2);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar2, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar2, c, dVar);
                    float f = 16;
                    float f2 = 72;
                    q630 v = txj0.v(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), f2);
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, aVar2, 6);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, v);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar5);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a2, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar2, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    x8u0.h(b78Var, aVar2, 0);
                    aVar2.G();
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    x8u0.e(b78Var, s200.F(8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, new xpy(1.0f, true)), aVar2, 0);
                    x8u0.o(b78Var, txj0.v(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), f2), aVar2, 48);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ xd0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
