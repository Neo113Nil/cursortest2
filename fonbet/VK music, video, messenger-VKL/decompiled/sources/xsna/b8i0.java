package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.e8i0;
import xsna.q630;

/* compiled from: SelectGroupVerificationMviView.kt */
/* loaded from: classes18.dex */
public final class b8i0 extends i6v0<p8i0, j7i0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        i((p8i0) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final e8i0.b bVar, final q630 q630Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1278116787);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            q630Var2 = q630Var;
            i2 |= M.J(q630Var2) ? 32 : 16;
        } else {
            q630Var2 = q630Var;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1278116787, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationMviView.SelectGroupVerificationMain (SelectGroupVerificationMviView.kt:53)");
            }
            wh50 a = jk50.a(bVar.a, M, 0, 3);
            final wh50 d = jk50.d(bVar.b, Boolean.FALSE, M, 48);
            final k7i0 k7i0Var = (k7i0) jk50.a(bVar.c, M, 0, 3).getValue();
            Throwable th = (Throwable) a.getValue();
            final String message = th != null ? th.getMessage() : null;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            phv0.b(q630Var2, kai.c(-453865196, new zjm(9, k7i0Var, izsVar), M), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(1985911209, new yzs() { // from class: xsna.z7i0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    s890 s890Var = (s890) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(s890Var) ? 4 : 2;
                    }
                    if (aVar3.t(intValue & 1, (intValue & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1985911209, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationMviView.SelectGroupVerificationMain.<anonymous> (SelectGroupVerificationMviView.kt:77)");
                        }
                        boolean booleanValue = ((Boolean) d.getValue()).booleanValue();
                        q630.a aVar4 = q630.a.a;
                        if (booleanValue) {
                            aVar3.K(-893606538);
                            w7i0.a(s200.C(txj0.d(aVar4, 1.0f), s890Var), aVar3, 0);
                            aVar3.j();
                        } else {
                            String str = message;
                            if (str == null || str.length() == 0) {
                                k7i0 k7i0Var2 = k7i0Var;
                                if (k7i0Var2 != null) {
                                    aVar3.K(-893018995);
                                    o7i0.a(k7i0Var2, izsVar, s200.H(s200.C(txj0.d(aVar4, 1.0f), s890Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar3, 0);
                                    aVar3.j();
                                } else {
                                    aVar3.K(-892635246);
                                    p7i0.a("", s200.C(txj0.d(aVar4, 1.0f), s890Var), aVar3, 6);
                                    aVar3.j();
                                }
                            } else {
                                aVar3.K(-893329336);
                                p7i0.a(str, s200.C(txj0.d(aVar4, 1.0f), s890Var), aVar3, 0);
                                aVar3.j();
                            }
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, ((i2 >> 3) & 14) | 805306416, 380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.a8i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b8i0.this.h(bVar, q630Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void i(p8i0 p8i0Var, izs<? super j7i0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-312777454);
        int i2 = (M.J(p8i0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-312777454, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.selectgroupverification.ui.SelectGroupVerificationMviView.ThemedContent (SelectGroupVerificationMviView.kt:28)");
            }
            e8i0 e8i0Var = (e8i0) d(e8i0.a.a, new n0u0[]{p8i0Var.a}, M, (i2 & 896) | 518).getValue();
            if (e8i0Var instanceof e8i0.b) {
                M.K(2126301348);
                int i3 = i2 << 3;
                h((e8i0.b) e8i0Var, txj0.d(q630.a.a, 1.0f), izsVar, M, (i3 & 7168) | (i3 & 896) | 4144);
                M.j();
            } else {
                M.K(68598390);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wuh(i, 3, this, p8i0Var, izsVar);
        }
    }
}
