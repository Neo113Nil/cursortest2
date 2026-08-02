package xsna;

import com.vk.core.compose.component.defaults.TabMode;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.q630;

/* compiled from: VkSecondaryTabRow.kt */
/* loaded from: classes17.dex */
public final class g1i0 extends b1i0 {
    public final khx a;

    public g1i0(khx khxVar) {
        this.a = khxVar;
    }

    @Override // xsna.b1i0
    public final void a(float f, float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final float f3;
        final float f4;
        androidx.compose.runtime.a M = aVar.M(1969757857);
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
                androidx.compose.runtime.b.f(1969757857, i2, -1, "com.vk.core.compose.component.SecondaryTabIndicatorScopeImpl.AnimatedSecondaryTabIndicator (VkSecondaryTabRow.kt:485)");
            }
            nkk nkkVar = luo.a;
            f4 = f2;
            f3 = f;
            c(((pco) hg2.a(f3, jq2.d(250, 0, nkkVar, 2), "Secondary Tab Row indicator offset", M, (i2 & 14) | 384, 8).getValue()).b, ((pco) hg2.a(f2, jq2.d(250, 0, nkkVar, 2), "Secondary Tab Row indicator width", M, ((i2 >> 3) & 14) | 384, 8).getValue()).b, M, i2 & 896);
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
            s.d = new wzs() { // from class: xsna.c1i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    g1i0.this.a(f3, f4, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    @Override // xsna.b1i0
    public final void b(mc90 mc90Var, List list, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1165533343);
        if ((i & 6) == 0) {
            i2 = (M.J(mc90Var) ? 4 : 2) | i;
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
                androidx.compose.runtime.b.f(1165533343, i2, -1, "com.vk.core.compose.component.SecondaryTabIndicatorScopeImpl.SecondaryTabIndicator (VkSecondaryTabRow.kt:477)");
            }
            wow wowVar = new wow(list);
            int i3 = i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            c(tni.c(mc90Var, wowVar, i3), tni.d(mc90Var, new wow(list), i3), M, i2 & 896);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y85(this, mc90Var, list, i);
        }
    }

    public final void c(final float f, final float f2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        float f3;
        androidx.compose.runtime.a M = aVar.M(854791684);
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
                androidx.compose.runtime.b.f(854791684, i2, -1, "com.vk.core.compose.component.SecondaryTabIndicatorScopeImpl.SecondaryTabIndicator (VkSecondaryTabRow.kt:450)");
            }
            pqo pqoVar = hfj.a;
            if (((Boolean) M.r(opv0.a)).booleanValue()) {
                M.K(1116061227);
                f3 = ((Number) M.r(pqoVar)).floatValue();
                M.j();
            } else {
                M.K(1297493950);
                M.j();
                f3 = 0.64f;
            }
            rvi.a(pqoVar.b(Float.valueOf(f3)), kai.c(-862262588, new wzs() { // from class: xsna.d1i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-862262588, intValue, -1, "com.vk.core.compose.component.SecondaryTabIndicatorScopeImpl.SecondaryTabIndicator.<anonymous> (VkSecondaryTabRow.kt:454)");
                        }
                        khx khxVar = g1i0.this.a;
                        final float f4 = f2;
                        khxVar.a(f, 384, aVar2, kai.c(-52331479, new wzs() { // from class: xsna.f1i0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                                int intValue2 = ((Integer) obj4).intValue();
                                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-52331479, intValue2, -1, "com.vk.core.compose.component.SecondaryTabIndicatorScopeImpl.SecondaryTabIndicator.<anonymous>.<anonymous> (VkSecondaryTabRow.kt:455)");
                                    }
                                    bpn0 bpn0Var = npv0.a;
                                    q630 a = o19.a(txj0.s(q630.a.a, f4, npv0.b(TabMode.Secondary)), ((Number) aVar3.r(hfj.a)).floatValue());
                                    TabMode tabMode = TabMode.Accent;
                                    q630 d = rte0.d(a, npv0.h(tabMode));
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    ja8.a(hr80.m(d, ylu0Var.getBackground().z, npv0.h(tabMode)), aVar3, 0);
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
            s.d = new wzs() { // from class: xsna.e1i0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int I = ne7.I(i | 1);
                    g1i0.this.c(f, f2, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
