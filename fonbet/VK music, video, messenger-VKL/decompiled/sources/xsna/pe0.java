package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.Thumb;
import xsna.dt1;
import xsna.gfp0;
import xsna.q630;

/* compiled from: AdCover.kt */
/* loaded from: classes3.dex */
public final class pe0 {
    public static final float a = 16;
    public static final float b = 4;

    public static final void a(final gfp0.b.a aVar, final pfl0 pfl0Var, final izs izsVar, final q630 q630Var, androidx.compose.runtime.a aVar2, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar2.M(1194450596);
        if ((i & 6) == 0) {
            i2 = (M.J(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(pfl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(q630Var) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1194450596, i2, -1, "com.vk.music.stickyplayer.presentation.components.AdCover (AdCover.kt:34)");
            }
            final Thumb thumb = aVar.a;
            ua8.a(ahn.E(q630Var, "adCover"), null, false, kai.c(-77529970, new yzs() { // from class: xsna.ne0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    qow qowVar;
                    va8 va8Var = (va8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(va8Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-77529970, intValue, -1, "com.vk.music.stickyplayer.presentation.components.AdCover.<anonymous> (AdCover.kt:39)");
                        }
                        pfl0 pfl0Var2 = pfl0.this;
                        final gfp0.b.a aVar4 = aVar;
                        if (pfl0Var2 != null) {
                            aVar4.getClass();
                            pfl0Var2.e("advertisement_id", null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                        }
                        String f = z3r0.f(thumb, va8Var.g(), aVar3, 0);
                        dt1.a.getClass();
                        q630 q = txj0.q(va8Var.b(q630.a.a, dt1.a.f), va8Var.g());
                        if (pfl0Var2 != null) {
                            aVar4.getClass();
                            qowVar = new qow(new dw5("advertisement_id", pfl0Var2, l5g.j));
                        } else {
                            qowVar = null;
                        }
                        final izs izsVar2 = izsVar;
                        fwu0.c(q, null, f, null, null, null, qowVar, kai.c(1396739805, new a0t() { // from class: xsna.ke0
                            @Override // xsna.a0t
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                                int i3;
                                chs chsVar = (chs) obj5;
                                lg90 lg90Var = (lg90) obj6;
                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj7;
                                int intValue2 = ((Integer) obj8).intValue();
                                if ((intValue2 & 48) == 0) {
                                    i3 = (aVar5.J(chsVar) ? 32 : 16) | intValue2;
                                } else {
                                    i3 = intValue2;
                                }
                                if ((intValue2 & 384) == 0) {
                                    i3 |= (intValue2 & 512) == 0 ? aVar5.J(lg90Var) : aVar5.y(lg90Var) ? 256 : 128;
                                }
                                if (aVar5.t(i3 & 1, (i3 & 1169) != 1168)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1396739805, i3, -1, "com.vk.music.stickyplayer.presentation.components.AdCover.<anonymous>.<anonymous> (AdCover.kt:50)");
                                    }
                                    shu0.a(null, vog0.b(pe0.a), l5g.j, 0L, null, pe0.b, kai.c(-2055324692, new le0(chsVar, gfp0.b.a.this, izsVar2, lg90Var, 0), aVar5), aVar5, 1769856, 25);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar5.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 100663296, 186);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
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
            s.d = new wzs() { // from class: xsna.oe0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pe0.a(gfp0.b.a.this, pfl0Var, izsVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
