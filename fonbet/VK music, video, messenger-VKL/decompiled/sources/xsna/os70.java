package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vk.ecomm.verifiedseller.impl.screens.obtainverification.model.ObtainVerificationScreenContent;
import xsna.cri;
import xsna.dt1;
import xsna.fs70;
import xsna.o4q0;
import xsna.q630;
import xsna.tlo0;

/* compiled from: ObtainVerificationScreen.kt */
/* loaded from: classes18.dex */
public final class os70 {

    /* compiled from: ObtainVerificationScreen.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ObtainVerificationScreenContent.CurrentModalType.values().length];
            try {
                iArr[ObtainVerificationScreenContent.CurrentModalType.UNLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ObtainVerificationScreenContent.CurrentModalType.UNLINKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ObtainVerificationScreenContent.CurrentModalType.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ObtainVerificationScreenContent.CurrentModalType.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(ObtainVerificationScreenContent obtainVerificationScreenContent, izs<? super mr70, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(2068836746);
        if ((i & 6) == 0) {
            i2 = (M.J(obtainVerificationScreenContent) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2068836746, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationModal (ObtainVerificationScreen.kt:178)");
            }
            o4q0 o4q0Var = obtainVerificationScreenContent != null ? obtainVerificationScreenContent.g : null;
            if (o4q0Var == null) {
                M.K(-64925302);
            } else {
                M.K(-64925301);
                int i3 = a.$EnumSwitchMapping$0[obtainVerificationScreenContent.h.ordinal()];
                Object obj = a.C0011a.a;
                if (i3 != 1) {
                    int i4 = 8;
                    if (i3 == 2) {
                        int i5 = i2;
                        M.K(2055694345);
                        o4q0.a aVar2 = o4q0Var.f;
                        if (aVar2 == null) {
                            M.K(2055727545);
                            M.j();
                        } else {
                            M.K(2055727546);
                            int i6 = i5 & 112;
                            boolean J = (i6 == 32) | M.J(aVar2);
                            Object x = M.x();
                            if (J || x == obj) {
                                x = new uk(16, izsVar, aVar2);
                                M.R(x);
                            }
                            gzs gzsVar = (gzs) x;
                            boolean z = i6 == 32;
                            Object x2 = M.x();
                            if (z || x2 == obj) {
                                x2 = new o87(izsVar, i4);
                                M.R(x2);
                            }
                            zdg0.a(aVar2, true, gzsVar, (gzs) x2, M, 48);
                            M.j();
                            s3q0 s3q0Var = s3q0.a;
                        }
                        M.j();
                    } else if (i3 == 3) {
                        M.K(2056428425);
                        int i7 = i2;
                        o4q0.a aVar3 = o4q0Var.g;
                        if (aVar3 == null) {
                            M.K(2056459703);
                            M.j();
                        } else {
                            M.K(2056459704);
                            int i8 = i7 & 112;
                            boolean z2 = i8 == 32;
                            Object x3 = M.x();
                            if (z2 || x3 == obj) {
                                x3 = new mse(izsVar, 6);
                                M.R(x3);
                            }
                            gzs gzsVar2 = (gzs) x3;
                            boolean z3 = i8 == 32;
                            Object x4 = M.x();
                            if (z3 || x4 == obj) {
                                x4 = new nse(izsVar, 8);
                                M.R(x4);
                            }
                            zdg0.a(aVar3, false, gzsVar2, (gzs) x4, M, 48);
                            M.j();
                            s3q0 s3q0Var2 = s3q0.a;
                        }
                        M.j();
                    } else {
                        if (i3 != 4) {
                            throw alb0.c(343375536, M);
                        }
                        M.K(343448283);
                        M.j();
                        s3q0 s3q0Var3 = s3q0.a;
                    }
                } else {
                    M.K(2054769708);
                    ynr0 ynr0Var = new ynr0(o4q0Var.a, o4q0Var.b, o4q0Var.c, o4q0Var.d, o4q0Var.e);
                    int i9 = i2 & 112;
                    boolean J2 = M.J(o4q0Var) | (i9 == 32);
                    Object x5 = M.x();
                    if (J2 || x5 == obj) {
                        x5 = new fqd(9, o4q0Var, izsVar);
                        M.R(x5);
                    }
                    gzs gzsVar3 = (gzs) x5;
                    boolean z4 = i9 == 32;
                    Object x6 = M.x();
                    if (z4 || x6 == obj) {
                        x6 = new yt7(izsVar, 7);
                        M.R(x6);
                    }
                    gzs gzsVar4 = (gzs) x6;
                    boolean z5 = i9 == 32;
                    Object x7 = M.x();
                    if (z5 || x7 == obj) {
                        x7 = new th2(izsVar, 5);
                        M.R(x7);
                    }
                    uzp.b(ynr0Var, gzsVar3, gzsVar4, (gzs) x7, M, 0);
                    M.j();
                    s3q0 s3q0Var4 = s3q0.a;
                }
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new knc(obtainVerificationScreenContent, izsVar, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(fs70.b bVar, final izs izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-591449198);
        if ((i & 6) == 0) {
            i2 = (M.J(bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i & 48;
        int i5 = i2;
        q630.a aVar2 = q630.a.a;
        if (i4 == 0) {
            i3 = (M.J(aVar2) ? 32 : 16) | i5;
        } else {
            i3 = i5;
        }
        if ((i & 384) == 0) {
            i3 |= M.y(izsVar) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-591449198, i3, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationScreen (ObtainVerificationScreen.kt:39)");
            }
            wh50 a2 = jk50.a(bVar.a, M, 0, 3);
            final wh50 d = jk50.d(bVar.b, Boolean.FALSE, M, 48);
            wh50 a3 = jk50.a(bVar.c, M, 0, 3);
            final ObtainVerificationScreenContent obtainVerificationScreenContent = (ObtainVerificationScreenContent) a3.getValue();
            Throwable th = (Throwable) a2.getValue();
            final String message = th != null ? th.getMessage() : null;
            int i6 = i3 >> 3;
            a((ObtainVerificationScreenContent) a3.getValue(), izsVar, M, i6 & 112);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            phv0.b(aVar2, kai.c(-1285053909, new dsg(5, obtainVerificationScreenContent, izsVar), M), kai.c(-1275283348, new wja(8, obtainVerificationScreenContent, izsVar), M), null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(481348534, new yzs() { // from class: xsna.ms70
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
                            androidx.compose.runtime.b.f(481348534, intValue, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationScreen.<anonymous> (ObtainVerificationScreen.kt:92)");
                        }
                        boolean booleanValue = ((Boolean) d.getValue()).booleanValue();
                        q630.a aVar4 = q630.a.a;
                        if (booleanValue) {
                            aVar3.K(-1041578696);
                            os70.d(s200.C(aVar4, s890Var), aVar3, 0);
                            aVar3.j();
                        } else {
                            String str = message;
                            if (str == null || str.length() == 0) {
                                ObtainVerificationScreenContent obtainVerificationScreenContent2 = obtainVerificationScreenContent;
                                if (obtainVerificationScreenContent2 != null) {
                                    aVar3.K(-1041140387);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    String str2 = ylu0Var2.s() ? obtainVerificationScreenContent2.a : obtainVerificationScreenContent2.b;
                                    q630 C = s200.C(aVar4, s890Var);
                                    CharSequence a4 = tlo0.b.a(obtainVerificationScreenContent2.d, (Context) aVar3.r(AndroidCompositionLocals_androidKt.b));
                                    String obj4 = a4 != null ? a4.toString() : null;
                                    qr70.a(str2, obj4 == null ? "" : obj4, obtainVerificationScreenContent2.e, C, izsVar, aVar3, 0);
                                    aVar3.j();
                                } else {
                                    aVar3.K(-1040576621);
                                    p7i0.a("", aVar4, aVar3, 54);
                                    aVar3.j();
                                }
                            } else {
                                aVar3.K(-1041383613);
                                os70.c(str, s200.C(aVar4, s890Var), aVar3, 0);
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
            }, M), M, (i6 & 14) | 805306800, 376);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ns70(bVar, izsVar, i);
        }
    }

    public static final void c(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1295965981);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1295965981, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationScreenError (ObtainVerificationScreen.kt:139)");
            }
            q630.a aVar2 = q630.a.a;
            q630 g = q630Var.g(txj0.c(txj0.f(aVar2, 1.0f), 1.0f));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            yqv0.c(str, txj0.f(aVar2, 1.0f), 0L, null, null, 0, 3, null, 0, false, 0, 0, null, null, M, (i2 & 14) | 48, 0, 16316);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tt00(str, q630Var, i, 1);
        }
    }

    public static final void d(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1569632990);
        int i2 = (M.J(q630Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1569632990, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationScreenLoading (ObtainVerificationScreen.kt:159)");
            }
            q630.a aVar2 = q630.a.a;
            q630 g = q630Var.g(txj0.c(txj0.f(aVar2, 1.0f), 1.0f));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, g);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            zfr0.f(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, 0L, null, null, M, 6, 60);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new c7c(q630Var, i, 1);
        }
    }
}
