package xsna;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.sbz;

/* compiled from: LinkVKBidScreen.kt */
/* loaded from: classes18.dex */
public final class ccz {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(sbz.b bVar, final izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1689266900);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1689266900, i4, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreen (LinkVKBidScreen.kt:29)");
            }
            final wh50 a = jk50.a(bVar.a, M, 0, 3);
            final wh50 d = jk50.d(bVar.b, Boolean.FALSE, M, 48);
            final wbz wbzVar = (wbz) jk50.a(bVar.c, M, 0, 3).getValue();
            final String g = j03.g((Context) M.r(AndroidCompositionLocals_androidKt.b), (Throwable) a.getValue(), R.string.error);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(aVar3, kai.c(1723824691, new m2h(izsVar, 4), M), kai.c(1591500946, new zjm(4, wbzVar, izsVar), M), null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(54272904, new yzs() { // from class: xsna.bcz
                /* JADX WARN: Multi-variable type inference failed */
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar4.J(s890Var) ? 4 : 2;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(54272904, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreen.<anonymous> (LinkVKBidScreen.kt:61)");
                        }
                        boolean booleanValue = ((Boolean) d.getValue()).booleanValue();
                        q630.a aVar5 = q630.a.a;
                        if (booleanValue) {
                            aVar4.K(1936426983);
                            ccz.c(txj0.d(s200.C(aVar5, s890Var), 1.0f), aVar4, 0);
                            aVar4.j();
                        } else if (((Throwable) a.getValue()) != null) {
                            aVar4.K(1936641875);
                            ccz.b(g, txj0.d(s200.C(aVar5, s890Var), 1.0f), aVar4, 0);
                            aVar4.j();
                        } else {
                            wbz wbzVar2 = wbzVar;
                            if (wbzVar2 != null) {
                                aVar4.K(1936914892);
                                boolean isEmpty = wbzVar2.a.isEmpty();
                                izs izsVar2 = izsVar;
                                if (isEmpty) {
                                    aVar4.K(1936944342);
                                    acz.a(6, aVar4, izsVar2, s200.F(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar5));
                                    aVar4.j();
                                } else {
                                    aVar4.K(1937178733);
                                    zbz.a(wbzVar2, txj0.d(s200.C(aVar5, s890Var), 1.0f), izsVar2, aVar4, 0);
                                    aVar4.j();
                                }
                                aVar4.j();
                            } else {
                                aVar4.K(1937510557);
                                ccz.b("", txj0.d(s200.C(aVar5, s890Var), 1.0f), aVar4, 6);
                                aVar4.j();
                            }
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i4 >> 3) & 14) | 805306800, 376);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new n5c(bVar, izsVar, i);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1658904225);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.J(q630Var) ? 32 : 16);
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1658904225, i3, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreenError (LinkVKBidScreen.kt:114)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(str, ra8.a.b(txj0.f(q630.a.a, 1.0f), dt1.a.f), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, null, M, i3 & 14, 0, 16316);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n2f(str, q630Var, i, 2);
        }
    }

    public static final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2122390904);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2122390904, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.ui.LinkVKBidScreenLoading (LinkVKBidScreen.kt:131)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            zfr0.f(SpinnerState.Loading, ra8.a.b(q630.a.a, dt1.a.f), null, 0L, null, null, M, 6, 60);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new n2h(q630Var, i, 1);
        }
    }
}
