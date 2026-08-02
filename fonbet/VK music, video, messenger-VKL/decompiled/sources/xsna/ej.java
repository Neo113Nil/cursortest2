package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.q630;

/* compiled from: VkAccentTabRow.kt */
/* loaded from: classes17.dex */
public final class ej extends yi {
    public final khx a;

    public ej(khx khxVar) {
        this.a = khxVar;
    }

    @Override // xsna.yi
    public final void a(yjl yjlVar, List list, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1392781129);
        if ((i & 6) == 0) {
            i2 = (M.J(yjlVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1392781129, i2, -1, "com.vk.core.compose.component.AccentTabIndicatorScopeImpl.AccentTabIndicator (VkAccentTabRow.kt:484)");
            }
            wow wowVar = new wow(list);
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            c(tni.c(yjlVar, wowVar, i3), tni.d(yjlVar, new wow(list), i3), M, i2 & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new bj(i, 0, this, yjlVar, list);
        }
    }

    @Override // xsna.yi
    public final void b(float f, float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final float f3;
        final float f4;
        androidx.compose.runtime.a M = aVar.M(-702899901);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-702899901, i2, -1, "com.vk.core.compose.component.AccentTabIndicatorScopeImpl.AnimatedAccentTabIndicator (VkAccentTabRow.kt:492)");
            }
            nkk nkkVar = luo.a;
            f4 = f2;
            f3 = f;
            c(((pco) hg2.a(f3, jq2.d(250, 0, nkkVar, 2), "Accent Tab Row indicator offset", M, (i2 & 14) | 384, 8).getValue()).b, ((pco) hg2.a(f2, jq2.d(250, 0, nkkVar, 2), "Accent Tab Row indicator width", M, ((i2 >> 3) & 14) | 384, 8).getValue()).b, M, i2 & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            f3 = f;
            f4 = f2;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.dj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    ej.this.b(f3, f4, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public final void c(final float f, final float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        float f3;
        androidx.compose.runtime.a M = aVar.M(1007695488);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.n(f2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1007695488, i2, -1, "com.vk.core.compose.component.AccentTabIndicatorScopeImpl.AccentTabIndicator (VkAccentTabRow.kt:455)");
            }
            pqo pqoVar = hfj.a;
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(2027728711);
                f3 = ((Number) M.r(pqoVar)).floatValue();
                M.j();
            } else {
                M.K(-505585118);
                M.j();
                f3 = 0.64f;
            }
            rvi.a(pqoVar.b(Float.valueOf(f3)), kai.c(1075972544, new wzs() { // from class: xsna.zi
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1075972544, intValue, -1, "com.vk.core.compose.component.AccentTabIndicatorScopeImpl.AccentTabIndicator.<anonymous> (VkAccentTabRow.kt:459)");
                        }
                        khx khxVar = ej.this.a;
                        final float f4 = f2;
                        khxVar.a(f, 384, aVar2, kai.c(-595565893, new wzs() { // from class: xsna.cj
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-595565893, intValue2, -1, "com.vk.core.compose.component.AccentTabIndicatorScopeImpl.AccentTabIndicator.<anonymous>.<anonymous> (VkAccentTabRow.kt:460)");
                                    }
                                    bpn0 bpn0Var = npv0.a;
                                    TabMode tabMode = TabMode.Accent;
                                    q630 a = r18.a((float) 0.5d, wlb0.h(aVar3).p().a, txj0.s(q630.a.a, f4, npv0.b(tabMode)), npv0.h(tabMode));
                                    r5j0 h = npv0.h(tabMode);
                                    wlb0.i(aVar3).getClass();
                                    uov0.a(a, h, wlb0.h(aVar3).getBackground().n, wlb0.h(aVar3).getBackground().n, null, tqu0.c, nni.c, aVar3, 1572864, 16);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar3.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar2), null);
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
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.aj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    ej.this.c(f, f2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
