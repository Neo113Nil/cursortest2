package xsna;

import android.content.res.Configuration;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.Map;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: BottomSheetLayout.kt */
/* loaded from: classes18.dex */
public final class s88 {
    public static final void a(final gzs gzsVar, final jai jaiVar, final int i, final wzs wzsVar, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        wzs wzsVar2;
        jai jaiVar3;
        androidx.compose.runtime.a M = aVar.M(1334807153);
        if ((i2 & 6) == 0) {
            i3 = (M.y(gzsVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.y(jaiVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.o(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            wzsVar2 = wzsVar;
            i3 |= M.y(wzsVar2) ? 2048 : 1024;
        } else {
            wzsVar2 = wzsVar;
        }
        if ((i2 & 24576) == 0) {
            jaiVar3 = jaiVar2;
            i3 |= M.y(jaiVar3) ? 16384 : 8192;
        } else {
            jaiVar3 = jaiVar2;
        }
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1334807153, i3, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetLayout (BottomSheetLayout.kt:255)");
            }
            boolean z = ((i3 & 7168) == 2048) | ((i3 & 896) == 256) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((i3 & 57344) == 16384);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                o88 o88Var = new o88(wzsVar2, i, gzsVar, jaiVar, jaiVar3);
                M.R(o88Var);
                x = o88Var;
            }
            xtm0.a(null, (wzs) x, M, 0, 1);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.p88
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s88.a(gzs.this, jaiVar, i, wzsVar, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i2 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final jai jaiVar, final wzs wzsVar, final f12 f12Var, final q630 q630Var, final boolean z, a98 a98Var, izs izsVar, float f, final wzs wzsVar2, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a aVar2;
        a98 a98Var2;
        final izs izsVar2;
        final float f2;
        a98 a98Var3;
        izs izsVar3;
        float f3;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1355452948);
        int i3 = (M.J(f12Var) ? 256 : 128) | i;
        if ((i & 24576) == 0) {
            i3 |= M.l(z) ? 16384 : 8192;
        }
        int i4 = i3 | 5832704;
        if (M.t(i4 & 1, (306783379 & i4) != 306783378)) {
            M.V();
            int i5 = i & 1;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (i5 == 0 || M.i()) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2030912991, 6, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetStyle.Companion.<get-Default> (BottomSheetLayout.kt:55)");
                }
                float f4 = 14;
                float f5 = 0;
                uog0 c = vog0.c(f4, f4, f5, f5);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                a98Var3 = new a98(c, ylu0Var.getBackground().g, 4);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                Object x = M.x();
                if (x == c0012a) {
                    x = new xr0(2);
                    M.R(x);
                }
                izsVar3 = (izs) x;
                f3 = ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenHeightDp;
                i2 = i4 & (-29818881);
            } else {
                M.h();
                i2 = i4 & (-29818881);
                a98Var3 = a98Var;
                izsVar3 = izsVar;
                f3 = f;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1355452948, i2, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetLayout (BottomSheetLayout.kt:158)");
            }
            final azl azlVar = (azl) M.r(uvi.h);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, q630Var);
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
            k9q0.w(M, c2, cri.a.d);
            int I0 = (int) azlVar.I0(f3);
            boolean z2 = (i2 & 896) == 256;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new yc(f12Var, 14);
                M.R(x2);
            }
            final a98 a98Var4 = a98Var3;
            final izs izsVar4 = izsVar3;
            final float f6 = f3;
            yzs yzsVar = new yzs() { // from class: xsna.r88
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final float f7;
                    int intValue = ((Integer) obj).intValue();
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                    int intValue2 = ((Integer) obj3).intValue();
                    if ((intValue2 & 6) == 0) {
                        intValue2 |= aVar4.o(intValue) ? 4 : 2;
                    }
                    if (aVar4.t(intValue2 & 1, (intValue2 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-215930659, intValue2, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetLayout.<anonymous>.<anonymous> (BottomSheetLayout.kt:165)");
                        }
                        final azl azlVar2 = azl.this;
                        boolean J = aVar4.J(azlVar2) | ((intValue2 & 14) == 4);
                        Object x3 = aVar4.x();
                        a.C0011a.C0012a c0012a2 = a.C0011a.a;
                        if (J || x3 == c0012a2) {
                            x3 = new pco(azlVar2.j1(intValue));
                            aVar4.R(x3);
                        }
                        final float f8 = ((pco) x3).b;
                        float f9 = ((pco) izsVar4.invoke(new pco(f8))).b;
                        q630 z3 = txj0.z(q630.a.a, null, 3);
                        final float f10 = f6;
                        q630 l = txj0.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f9 + f10, 1, z3);
                        final f12 f12Var2 = f12Var;
                        boolean J2 = aVar4.J(f12Var2);
                        Object x4 = aVar4.x();
                        if (J2 || x4 == c0012a2) {
                            x4 = new qmn0(f12Var2);
                            aVar4.R(x4);
                        }
                        q630 e = lz1.e(n34.t(l, (qmn0) x4, null), f12Var2, Orientation.Vertical, z, 56);
                        boolean J3 = aVar4.J(azlVar2) | aVar4.n(f10) | aVar4.J(f12Var2);
                        final wzs wzsVar3 = wzsVar;
                        boolean J4 = J3 | aVar4.J(wzsVar3) | aVar4.n(f8);
                        Object x5 = aVar4.x();
                        if (J4 || x5 == c0012a2) {
                            izs izsVar5 = new izs() { // from class: xsna.m88
                                @Override // xsna.izs
                                public final Object invoke(Object obj4) {
                                    Object value;
                                    int i6 = (int) (((q9x) obj4).a & 4294967295L);
                                    azl azlVar3 = azl.this;
                                    float j1 = azlVar3.j1(i6) - f10;
                                    mdl a = lz1.a(new tn0(4, (Map) wzsVar3.invoke(new pco(f8), new pco(j1)), azlVar3));
                                    f12 f12Var3 = f12Var2;
                                    kg50 kg50Var = f12Var3.j;
                                    f1m f1mVar = f12Var3.i;
                                    if (Float.isNaN(((vak0) kg50Var).getFloatValue())) {
                                        value = f1mVar.getValue();
                                    } else {
                                        value = a.a(((vak0) f12Var3.j).getFloatValue());
                                        if (value == null) {
                                            value = f1mVar.getValue();
                                        }
                                    }
                                    if (!epx.f(f12Var3.c(), a)) {
                                        ((zak0) f12Var3.n).setValue(a);
                                        if (!f12Var3.i(value)) {
                                            ((zak0) f12Var3.m).setValue(value);
                                        }
                                    }
                                    return s3q0.a;
                                }
                            };
                            f7 = f10;
                            aVar4.R(izsVar5);
                            x5 = izsVar5;
                        } else {
                            f7 = f10;
                        }
                        q630 z4 = sv1.z(e, (izs) x5);
                        final a98 a98Var5 = a98Var4;
                        uog0 uog0Var = a98Var5.a;
                        float f11 = a98Var5.c;
                        long j = a98Var5.b;
                        final jai jaiVar3 = jaiVar;
                        uov0.a(z4, uog0Var, j, 0L, null, f11, kai.c(342344804, new wzs() { // from class: xsna.n88
                            @Override // xsna.wzs
                            public final Object invoke(Object obj4, Object obj5) {
                                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj4;
                                int intValue3 = ((Integer) obj5).intValue();
                                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(342344804, intValue3, -1, "com.vk.ecomm.cart.impl.common.ui.compose.BottomSheetLayout.<anonymous>.<anonymous>.<anonymous> (BottomSheetLayout.kt:207)");
                                    }
                                    a.m mVar = androidx.compose.foundation.layout.a.c;
                                    dt1.a.getClass();
                                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar5, 0);
                                    int hashCode2 = Long.hashCode(n34.n(aVar5));
                                    sy90 D2 = aVar5.D();
                                    q630.a aVar6 = q630.a.a;
                                    q630 c3 = qri.c(aVar5, aVar6);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar7 = cri.a.b;
                                    if (aVar5.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar5.H();
                                    if (aVar5.L()) {
                                        aVar5.I(aVar7);
                                    } else {
                                        aVar5.f();
                                    }
                                    cri.a.c cVar = cri.a.f;
                                    k9q0.w(aVar5, a, cVar);
                                    cri.a.e eVar = cri.a.e;
                                    k9q0.w(aVar5, D2, eVar);
                                    Integer valueOf = Integer.valueOf(hashCode2);
                                    cri.a.b bVar = cri.a.g;
                                    k9q0.w(aVar5, valueOf, bVar);
                                    cri.a.C2678a c2678a = cri.a.h;
                                    k9q0.t(aVar5, c2678a);
                                    cri.a.d dVar = cri.a.d;
                                    k9q0.w(aVar5, c3, dVar);
                                    q630 l2 = txj0.l(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f8, 1, aVar6);
                                    cp10 d2 = ja8.d(dt1.a.b, false);
                                    int hashCode3 = Long.hashCode(n34.n(aVar5));
                                    sy90 D3 = aVar5.D();
                                    q630 c4 = qri.c(aVar5, l2);
                                    if (aVar5.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar5.H();
                                    if (aVar5.L()) {
                                        aVar5.I(aVar7);
                                    } else {
                                        aVar5.f();
                                    }
                                    k9q0.w(aVar5, d2, cVar);
                                    k9q0.w(aVar5, D3, eVar);
                                    ur.d(hashCode3, aVar5, bVar, aVar5, c2678a);
                                    k9q0.w(aVar5, c4, dVar);
                                    jaiVar3.invoke(aVar5, 0);
                                    aVar5.G();
                                    if (dt.c(hr80.m(txj0.k(txj0.f(aVar6, 1.0f), f7), a98Var5.b, androidx.compose.ui.graphics.e.a), aVar5, 0)) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar5.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar4), aVar4, 1572864, 24);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            };
            a98Var2 = a98Var4;
            aVar2 = M;
            a((gzs) x2, kai.c(-215930659, yzsVar, M), I0, wzsVar2, jaiVar2, aVar2, 27696);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            izsVar2 = izsVar4;
            f2 = f3;
        } else {
            aVar2 = M;
            aVar2.h();
            a98Var2 = a98Var;
            izsVar2 = izsVar;
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            final a98 a98Var5 = a98Var2;
            s.d = new wzs() { // from class: xsna.l88
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    s88.b(jai.this, wzsVar, f12Var, q630Var, z, a98Var5, izsVar2, f2, wzsVar2, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final f12 c(Enum r5, izs izsVar, androidx.compose.runtime.a aVar, int i, int i2) {
        xmk0 c = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        m7l k = fto0.k();
        int i3 = i2 & 32;
        Object obj = a.C0011a.a;
        if (i3 != 0) {
            Object x = aVar.x();
            if (x == obj) {
                x = new a60(1);
                aVar.R(x);
            }
            izsVar = (izs) x;
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-2015811467, i, -1, "com.vk.ecomm.cart.impl.common.ui.compose.rememberSheetState (BottomSheetLayout.kt:303)");
        }
        Object obj2 = (azl) aVar.r(uvi.h);
        boolean J = aVar.J(obj2);
        Object x2 = aVar.x();
        Object obj3 = x2;
        if (J || x2 == obj) {
            e1 e1Var = new e1(obj2, 12);
            f1 f1Var = new f1(obj2, 10);
            f12 f12Var = new f12(r5, izsVar);
            f12Var.b = e1Var;
            f12Var.c = f1Var;
            f12Var.d = c;
            f12Var.e = k;
            aVar.R(f12Var);
            obj3 = f12Var;
        }
        f12 f12Var2 = (f12) obj3;
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return f12Var2;
    }
}
