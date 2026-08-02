package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: BigPlayerControlsScaffold.kt */
/* loaded from: classes3.dex */
public final class j07 {
    public static final void a(jai jaiVar, jai jaiVar2, jai jaiVar3, jai jaiVar4, jai jaiVar5, androidx.compose.runtime.a aVar, int i) {
        int i2;
        final jai jaiVar6;
        final jai jaiVar7;
        final jai jaiVar8;
        final jai jaiVar9;
        final jai jaiVar10;
        androidx.compose.runtime.a M = aVar.M(-1985712451);
        if ((i & 6) == 0) {
            i2 = (M.y(jaiVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(jaiVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar4) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(jaiVar5) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(q630.a.a) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1985712451, i2, -1, "com.vk.music.stickyplayer.presentation.components.controls.BigPlayerControlsScaffold (BigPlayerControlsScaffold.kt:22)");
            }
            jaiVar6 = jaiVar;
            jaiVar7 = jaiVar2;
            jaiVar8 = jaiVar3;
            jaiVar9 = jaiVar4;
            jaiVar10 = jaiVar5;
            rvi.a(cuw.a.b(qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, false)), kai.c(116728317, new wzs() { // from class: xsna.h07
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(116728317, intValue, -1, "com.vk.music.stickyplayer.presentation.components.controls.BigPlayerControlsScaffold.<anonymous> (BigPlayerControlsScaffold.kt:24)");
                        }
                        float f = 16;
                        q630.a aVar3 = q630.a.a;
                        q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
                        dt1.a.getClass();
                        ty6.b bVar = dt1.a.l;
                        a.l lVar = androidx.compose.foundation.layout.a.a;
                        androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, aVar2, 48);
                        int hashCode = Long.hashCode(n34.n(aVar2));
                        sy90 D = aVar2.D();
                        q630 c = qri.c(aVar2, F);
                        cri.h7.getClass();
                        LayoutNode.a aVar4 = cri.a.b;
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
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
                        jai.this.invoke(aVar2, 0);
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), aVar2, 0);
                        androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(lVar, bVar, aVar2, 48);
                        int hashCode2 = Long.hashCode(n34.n(aVar2));
                        sy90 D2 = aVar2.D();
                        q630 c2 = qri.c(aVar2, aVar3);
                        if (aVar2.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar2.H();
                        if (aVar2.L()) {
                            aVar2.I(aVar4);
                        } else {
                            aVar2.f();
                        }
                        k9q0.w(aVar2, a2, cVar);
                        k9q0.w(aVar2, D2, eVar);
                        ur.d(hashCode2, aVar2, bVar2, aVar2, c2678a);
                        k9q0.w(aVar2, c2, dVar);
                        jaiVar7.invoke(aVar2, 0);
                        f9t.e(txj0.v(aVar3, f), aVar2, 6);
                        jaiVar8.invoke(aVar2, 0);
                        f9t.e(txj0.v(aVar3, f), aVar2, 6);
                        jaiVar9.invoke(aVar2, 0);
                        aVar2.G();
                        if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                            szw.a("invalid weight; must be greater than zero");
                        }
                        f9t.e(new xpy(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), aVar2, 0);
                        jaiVar10.invoke(aVar2, 0);
                        aVar2.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            jaiVar6 = jaiVar;
            jaiVar7 = jaiVar2;
            jaiVar8 = jaiVar3;
            jaiVar9 = jaiVar4;
            jaiVar10 = jaiVar5;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new i07(jaiVar6, jaiVar7, jaiVar8, jaiVar9, jaiVar10, i);
        }
    }
}
