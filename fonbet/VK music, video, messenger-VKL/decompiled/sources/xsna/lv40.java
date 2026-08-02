package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.chs;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.q630;
import xsna.ty6;

/* compiled from: MusicPlaybackQueueItem.kt */
/* loaded from: classes3.dex */
public final class lv40 extends eya0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public lv40(dz40.o.b bVar, boolean z, boolean z2, boolean z3) {
        this.a = androidx.compose.runtime.k.b(bVar);
        this.b = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        this.c = androidx.compose.runtime.k.b(Boolean.valueOf(z2));
        this.d = androidx.compose.runtime.k.b(Boolean.valueOf(z3));
    }

    @Override // xsna.eya0
    public final void a(int i, androidx.compose.runtime.a aVar, izs izsVar, q630 q630Var) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2070117779);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2070117779, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicPlaybackQueueItem.Content (MusicPlaybackQueueItem.kt:58)");
            }
            boolean booleanValue = ((Boolean) ((zak0) this.d).getValue()).booleanValue();
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new dy0(20, this, izsVar);
                M.R(x);
            }
            q630 c = ojc.c(q630Var, booleanValue, null, null, (gzs) x, 14);
            float f = 16;
            float f2 = 6;
            q630 E = s200.E(c, f, f2);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            q630.a aVar4 = q630.a.a;
            q630 E2 = ahn.E(txj0.q(aVar4, 48), "trackCover");
            wh50 wh50Var = this.a;
            aVar2 = M;
            c(((dz40.o.b) ((zak0) wh50Var).getValue()).b, E2, f2, kai.c(1523692495, new b15(this, 4), M), aVar2, ((i2 << 6) & 57344) | X2.b.f);
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 H = s200.H(new xpy(1.0f, true), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, aVar2, 0);
            int hashCode2 = Long.hashCode(n34.n(aVar2));
            sy90 D2 = aVar2.D();
            q630 c3 = qri.c(aVar2, H);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a2, cVar);
            k9q0.w(aVar2, D2, eVar);
            ur.d(hashCode2, aVar2, bVar2, aVar2, c2678a);
            k9q0.w(aVar2, c3, dVar);
            androidx.compose.foundation.layout.k a3 = androidx.compose.foundation.layout.j.a(lVar, bVar, aVar2, 48);
            int hashCode3 = Long.hashCode(n34.n(aVar2));
            sy90 D3 = aVar2.D();
            q630 c4 = qri.c(aVar2, aVar4);
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a3, cVar);
            k9q0.w(aVar2, D3, eVar);
            ur.d(hashCode3, aVar2, bVar2, aVar2, c2678a);
            k9q0.w(aVar2, c4, dVar);
            yqv0.c(((dz40.o.b) ((zak0) wh50Var).getValue()).c, ahn.E(aVar4, "trackTitle"), wlb0.h(aVar2).getText().m, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(aVar2).J, aVar2, 48, 48, 6136);
            if (((dz40.o.b) ((zak0) wh50Var).getValue()).e) {
                aVar2.K(-1226732704);
                z3r0.b(null, true, aVar2, 48, 1);
            } else {
                aVar2.K(-1231266857);
            }
            aVar2.j();
            aVar2.G();
            yqv0.c(((dz40.o.b) ((zak0) wh50Var).getValue()).d, aVar4, wlb0.h(aVar2).getText().q, null, null, 0, 0, null, 0, false, 0, 1, null, wlb0.l(aVar2).i0, aVar2, 48, 48, 6136);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1416148378, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Reorder24> (VkSdkIcons.kt:2948)");
            }
            lg90 b = or.b(aVar2, -987250162, R.drawable.vk_icon_reorder_24, aVar2, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(b, null, s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11).g(new gor0(bVar)), wlb0.h(aVar2).getIcon().m, aVar2, 56, 0);
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
            s.d = new or3(i, 1, this, izsVar, q630Var);
        }
    }

    public final void c(final Object obj, final q630 q630Var, final float f, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1587241298);
        if ((i & 6) == 0) {
            i2 = (M.J(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.n(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.y(jaiVar) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1587241298, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicPlaybackQueueItem.MusicTrackImage (MusicPlaybackQueueItem.kt:137)");
            }
            ua8.a(rte0.d(sua.d(1.0f, q630Var, false), vog0.b(f)), null, false, kai.c(-1492071108, new yzs() { // from class: xsna.iv40
                @Override // xsna.yzs
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    va8 va8Var = (va8) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.J(va8Var) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-1492071108, intValue, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicPlaybackQueueItem.MusicTrackImage.<anonymous> (MusicPlaybackQueueItem.kt:144)");
                        }
                        String e = z3r0.e(obj, va8Var.j(), aVar2);
                        int length = e.length();
                        q630.a aVar3 = q630.a.a;
                        final float f2 = f;
                        if (length == 0) {
                            aVar2.K(-1673731961);
                            nsa0.a(f2, 6, aVar2, txj0.d(aVar3, 1.0f));
                            aVar2.j();
                        } else {
                            aVar2.K(-1673533933);
                            fwu0.c(txj0.d(aVar3, 1.0f), null, e, null, null, null, null, kai.c(-1667090329, new a0t() { // from class: xsna.kv40
                                @Override // xsna.a0t
                                public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                                    int i3;
                                    chs chsVar = (chs) obj6;
                                    lg90 lg90Var = (lg90) obj7;
                                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj8;
                                    int intValue2 = ((Integer) obj9).intValue();
                                    if ((intValue2 & 48) == 0) {
                                        i3 = (aVar4.J(chsVar) ? 32 : 16) | intValue2;
                                    } else {
                                        i3 = intValue2;
                                    }
                                    if ((intValue2 & 384) == 0) {
                                        i3 |= (intValue2 & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                                    }
                                    if (aVar4.t(i3 & 1, (i3 & 1169) != 1168)) {
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1667090329, i3, -1, "com.vk.music.stickyplayer.presentation.components.music.MusicPlaybackQueueItem.MusicTrackImage.<anonymous>.<anonymous> (MusicPlaybackQueueItem.kt:155)");
                                        }
                                        boolean z = chsVar instanceof chs.b;
                                        q630.a aVar5 = q630.a.a;
                                        float f3 = f2;
                                        if (z || (chsVar instanceof chs.a) || (chsVar instanceof chs.c)) {
                                            aVar4.K(-50998422);
                                            nsa0.a(f3, 6, aVar4, txj0.d(aVar5, 1.0f));
                                            aVar4.j();
                                        } else {
                                            aVar4.K(-1580740559);
                                            q630 d = txj0.d(aVar5, 1.0f);
                                            float f4 = (float) 0.5d;
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                            }
                                            ylu0 ylu0Var = (ylu0) aVar4.r(rrv0.a);
                                            if (androidx.compose.runtime.b.d()) {
                                                androidx.compose.runtime.b.e();
                                            }
                                            y18 a = aqw.a(f4, ylu0Var.getImage().a);
                                            vjw.a(lg90Var, null, rte0.d(r18.b(a.a, a.b, d, vog0.b(f3)), vog0.b(f3)), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 56 | ((i3 >> 6) & 14), 120);
                                            aVar4.j();
                                        }
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        aVar4.h();
                                    }
                                    return s3q0.a;
                                }
                            }, aVar2), aVar2, 100663302, 250);
                            aVar2.j();
                        }
                        jaiVar.invoke(txj0.d(q630Var, 1.0f), aVar2, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 3072, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.jv40
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    lv40.this.c(obj, q630Var, f, jaiVar, (androidx.compose.runtime.a) obj2, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
