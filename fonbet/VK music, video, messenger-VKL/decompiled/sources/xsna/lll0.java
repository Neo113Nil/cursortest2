package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.VkTooltipAppearance;
import com.vk.dto.common.GoodAlbum;
import com.vk.ecomm.storefront.impl.community.presentation.model.LoadingState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import java.util.List;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.jpl0;
import xsna.ktv0;
import xsna.q630;

/* compiled from: StorefrontContent.kt */
/* loaded from: classes18.dex */
public final class lll0 {
    public static final void a(jpl0.a.d dVar, gzs<zhf0> gzsVar, izs<? super hjl0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.f s;
        wzs<? super androidx.compose.runtime.a, ? super Integer, s3q0> v17Var;
        androidx.compose.runtime.a M = aVar.M(-1392981204);
        int i2 = i | (M.J(dVar) ? 4 : 2) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1392981204, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.ShowToolTips (StorefrontContent.kt:137)");
            }
            zhf0 invoke = gzsVar.invoke();
            if (invoke == null) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                s = M.s();
                if (s == null) {
                    return;
                } else {
                    v17Var = new g8k(i, 3, dVar, gzsVar, izsVar);
                }
            } else {
                w4p0 w4p0Var = dVar.a.i;
                if (w4p0Var == null) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    s = M.s();
                    if (s == null) {
                        return;
                    } else {
                        v17Var = new w2k(dVar, gzsVar, izsVar, i, 7);
                    }
                } else {
                    int I0 = (int) ((azl) M.r(uvi.h)).I0(m7p0.a);
                    M.W(1374872736, w4p0Var.a);
                    q630.a aVar3 = q630.a.a;
                    q630 d = txj0.d(aVar3, 1.0f);
                    Object x = M.x();
                    Object obj = a.C0011a.a;
                    if (x == obj) {
                        x = ir.h(M);
                    }
                    sg50 sg50Var = (sg50) x;
                    boolean J = ((i2 & 896) == 256) | M.J(w4p0Var);
                    Object x2 = M.x();
                    if (J || x2 == obj) {
                        x2 = new com.vk.movika.sdk.base.logic.interactor.c(24, izsVar, w4p0Var);
                        M.R(x2);
                    }
                    q630 b = ojc.b(d, sg50Var, null, false, null, (gzs) x2, 28);
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(M));
                    sy90 D = M.D();
                    q630 c = qri.c(M, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar4);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, d2, cri.a.f);
                    k9q0.w(M, D, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c, cri.a.d);
                    String str = w4p0Var.b;
                    String str2 = w4p0Var.c;
                    ktv0 ktv0Var = w4p0Var.d ? ktv0.e.a : ktv0.a.a;
                    VkTooltipAppearance vkTooltipAppearance = VkTooltipAppearance.Accent;
                    guv0 s2 = sdi.s(true, false, M, 6, 2);
                    float f = 0;
                    boolean J2 = M.J(invoke) | M.J(w4p0Var) | M.o(I0);
                    Object x3 = M.x();
                    if (J2 || x3 == obj) {
                        x3 = new k330(invoke, w4p0Var, I0);
                        M.R(x3);
                    }
                    aVar2 = M;
                    cuv0.b(str, ktv0Var, vkTooltipAppearance, kci.k(aVar3, (izs) x3), str2, false, false, false, false, s2, null, f, null, null, 0, znk0.g, aVar2, 1573248, 196656, 30112);
                    aVar2.G();
                    aVar2.a0();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                }
            }
            s.d = v17Var;
        }
        aVar2 = M;
        aVar2.h();
        s = aVar2.s();
        if (s != null) {
            v17Var = new v17(i, 6, dVar, gzsVar, izsVar);
            s.d = v17Var;
        }
    }

    public static final void b(izs<? super hjl0, s3q0> izsVar, jpl0.a.d dVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        final jpl0.a.d dVar2;
        int i2;
        a.C0011a.C0012a c0012a;
        boolean z;
        int i3;
        boolean z2;
        int i4;
        xvy xvyVar;
        rg50 rg50Var;
        rg50 rg50Var2;
        int i5;
        int i6;
        ja9 ja9Var;
        final izs<? super hjl0, s3q0> izsVar2 = izsVar;
        apl0 apl0Var = dVar.a;
        androidx.compose.runtime.a M = aVar.M(-950127704);
        int i7 = (M.y(izsVar2) ? 4 : 2) | i | (M.J(dVar) ? 32 : 16);
        if (M.t(i7 & 1, (i7 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-950127704, i7, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontContent (StorefrontContent.kt:44)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            HashSet hashSet = iah0.a;
            boolean d = fnj.d(context);
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (x == c0012a2) {
                x = androidx.compose.runtime.i.a(0);
                M.R(x);
            }
            final rg50 rg50Var3 = (rg50) x;
            int i8 = i7 & 14;
            int i9 = i7 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1276534707, i9, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.rememberLazyStateWithPagination (StorefrontContentUtils.kt:90)");
            }
            M.K(-1610786509);
            xvy a = zvy.a(0, 3, M);
            t8u t8uVar = apl0Var.f;
            LoadingState loadingState = apl0Var.l;
            boolean z3 = t8uVar != null && t8uVar.c < t8uVar.b;
            boolean z4 = loadingState != LoadingState.Page;
            if (z3 && z4) {
                c0012a = c0012a2;
                z = true;
            } else {
                c0012a = c0012a2;
                z = false;
            }
            rll0.a(a, izsVar2, z, 0, M, (i9 << 3) & 112);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = androidx.compose.runtime.i.a(0);
                M.R(x2);
            }
            rg50 rg50Var4 = (rg50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = androidx.compose.runtime.i.a(0);
                M.R(x3);
            }
            rg50 rg50Var5 = (rg50) x3;
            if (androidx.compose.runtime.b.d()) {
                i3 = i7;
                z2 = d;
                androidx.compose.runtime.b.f(1453918870, X2.b.f, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.rememberNestedScrollConnection (StorefrontContentUtils.kt:29)");
            } else {
                i3 = i7;
                z2 = d;
            }
            if (androidx.compose.runtime.b.d()) {
                i4 = 0;
                androidx.compose.runtime.b.f(-425694475, 0, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.rememberIfFiltersFrozen (StorefrontContentUtils.kt:75)");
            } else {
                i4 = 0;
            }
            Object x4 = M.x();
            if (x4 == c0012a) {
                x4 = bbk0.b(new mll0(a, i4));
                M.R(x4);
            }
            mtk0 mtk0Var = (mtk0) x4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new qll0(rg50Var5, rg50Var4, rg50Var3, mtk0Var);
                M.R(x5);
            }
            final qll0 qll0Var = (qll0) x5;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = androidx.compose.runtime.k.b(null);
                M.R(x6);
            }
            final wh50 wh50Var = (wh50) x6;
            Object x7 = M.x();
            if (x7 == c0012a) {
                x7 = bbk0.b(new so40(rg50Var3, 24));
                M.R(x7);
            }
            final mtk0 mtk0Var2 = (mtk0) x7;
            int i10 = (i3 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                xvyVar = a;
                rg50Var = rg50Var4;
                rg50Var2 = rg50Var5;
                i5 = -1;
                androidx.compose.runtime.b.f(-1321813123, i10, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.rememberHasCTAButtons (StorefrontContentUtils.kt:125)");
            } else {
                xvyVar = a;
                rg50Var = rg50Var4;
                rg50Var2 = rg50Var5;
                i5 = -1;
            }
            Object x8 = M.x();
            if (x8 == c0012a) {
                sll0 sll0Var = dVar.b;
                x8 = Boolean.valueOf(sll0Var.a || ((ja9Var = sll0Var.b) != null && ja9Var.a == i5 && sll0Var.c));
                M.R(x8);
            }
            final boolean booleanValue = ((Boolean) x8).booleanValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            tsd0 tsd0Var = apl0Var.m;
            pqd0.a(tsd0Var != null ? tsd0Var.h : null, izsVar2, M, (i3 << 3) & 112);
            boolean z5 = loadingState == LoadingState.Refresh;
            boolean z6 = i8 == 4;
            Object x9 = M.x();
            if (z6 || x9 == c0012a) {
                i6 = 6;
                x9 = new t9d(izsVar2, 6);
                M.R(x9);
            } else {
                i6 = 6;
            }
            gzs gzsVar = (gzs) x9;
            q630 d2 = txj0.d(q630.a.a, 1.0f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 m = hr80.m(d2, ylu0Var.getBackground().a, androidx.compose.ui.graphics.e.a);
            aVar2 = M;
            dVar2 = dVar;
            final boolean z7 = z2;
            final rg50 rg50Var6 = rg50Var2;
            final xvy xvyVar2 = xvyVar;
            final rg50 rg50Var7 = rg50Var;
            yzs yzsVar = new yzs() { // from class: xsna.jll0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    final jpl0.a.d dVar3;
                    final boolean z8;
                    final izs izsVar3;
                    final rg50 rg50Var8;
                    final wh50 wh50Var2;
                    izs izsVar4;
                    qa8 qa8Var = (qa8) obj;
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar3.J(qa8Var) ? 4 : 2;
                    }
                    int i11 = intValue;
                    if (aVar3.t(i11 & 1, (i11 & 19) != 18)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1404209046, i11, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.StorefrontContent.<anonymous> (StorefrontContent.kt:72)");
                        }
                        q630 t = n34.t(txj0.f(ahn.E(q630.a.a, "storefront_content_list"), 1.0f), qll0Var, null);
                        u890 n = ((Boolean) mtk0Var2.getValue()).booleanValue() ? s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 52, 7) : s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7);
                        jpl0.a.d dVar4 = dVar2;
                        boolean J = aVar3.J(dVar4);
                        boolean z9 = booleanValue;
                        boolean l = J | aVar3.l(z9);
                        izs izsVar5 = izsVar2;
                        boolean J2 = l | aVar3.J(izsVar5);
                        final boolean z10 = z7;
                        boolean l2 = J2 | aVar3.l(z10);
                        Object x10 = aVar3.x();
                        rg50 rg50Var9 = rg50Var3;
                        wh50 wh50Var3 = wh50Var;
                        a.C0011a.C0012a c0012a3 = a.C0011a.a;
                        if (l2 || x10 == c0012a3) {
                            final rg50 rg50Var10 = rg50Var7;
                            final rg50 rg50Var11 = rg50Var6;
                            dVar3 = dVar4;
                            z8 = z9;
                            izsVar3 = izsVar5;
                            rg50Var8 = rg50Var9;
                            wh50Var2 = wh50Var3;
                            izs izsVar6 = new izs() { // from class: xsna.kll0
                                @Override // xsna.izs
                                public final Object invoke(Object obj4) {
                                    List<GoodAlbum> list;
                                    nvy nvyVar = (nvy) obj4;
                                    final jpl0.a.d dVar5 = jpl0.a.d.this;
                                    apl0 apl0Var2 = dVar5.a;
                                    pju pjuVar = apl0Var2.b;
                                    final izs izsVar7 = izsVar3;
                                    if (pjuVar != null) {
                                        final rg50 rg50Var12 = rg50Var8;
                                        final boolean z11 = z8;
                                        nvy.g(nvyVar, null, null, new jai(-1890126750, new yzs() { // from class: xsna.lku
                                            @Override // xsna.yzs
                                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj6;
                                                int intValue2 = ((Integer) obj7).intValue();
                                                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-1890126750, intValue2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.groupHeader.<anonymous> (GroupHeaderItem.kt:76)");
                                                    }
                                                    jpl0.a.d dVar6 = jpl0.a.d.this;
                                                    sku.d(dVar6.a.b, dVar6.b, rg50Var12, z11, izsVar7, aVar4, 0);
                                                    if (a690.d(q630.a.a, 8, aVar4, 6)) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar4.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true), 3);
                                    }
                                    tsd0 tsd0Var2 = apl0Var2.m;
                                    if (tsd0Var2 != null) {
                                        if (tsd0Var2.g) {
                                            nvy.g(nvyVar, null, null, wji.a, 3);
                                        } else {
                                            nvy.g(nvyVar, null, null, new jai(426108918, new zqz(1, dVar5, izsVar7), true), 3);
                                        }
                                    }
                                    wh50 wh50Var4 = wh50Var2;
                                    r820 r820Var = new r820(wh50Var4, 29);
                                    hr1 hr1Var = apl0Var2.d;
                                    if (hr1Var != null && (((list = hr1Var.a) != null && !list.isEmpty()) || hr1Var.d != null)) {
                                        nvy.g(nvyVar, null, null, new jai(1060314738, new pn1(dVar5, izsVar7, 0, r820Var), true), 3);
                                    }
                                    nvyVar.b(new jai(545959976, new g7h(rg50Var10, rg50Var11, dVar5, new t1(1, wh50Var4), izsVar7), true));
                                    t8u t8uVar2 = apl0Var2.f;
                                    final List<b5u> list2 = t8uVar2 != null ? t8uVar2.a : null;
                                    List<b5u> list3 = list2;
                                    if (list3 == null || list3.isEmpty()) {
                                        nvy.g(nvyVar, null, null, igi.a, 3);
                                    } else {
                                        final int i12 = z10 ? 3 : 2;
                                        final int ceil = (int) Math.ceil(list2.size() / i12);
                                        nvy.c(nvyVar, ceil, null, new jai(-766185190, new zzs() { // from class: xsna.u8u
                                            @Override // xsna.zzs
                                            public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                                                int intValue2 = ((Integer) obj6).intValue();
                                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj7;
                                                int intValue3 = ((Integer) obj8).intValue();
                                                if ((intValue3 & 48) == 0) {
                                                    intValue3 |= aVar4.o(intValue2) ? 32 : 16;
                                                }
                                                if (aVar4.t(intValue3 & 1, (intValue3 & 145) != 144)) {
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.f(-766185190, intValue3, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.goods.<anonymous> (GoodsWithFiltersList.kt:71)");
                                                    }
                                                    int i13 = i12;
                                                    int i14 = intValue2 * i13;
                                                    List list4 = list2;
                                                    List subList = list4.subList(i14, Math.min(i14 + i13, list4.size()));
                                                    if (subList.isEmpty()) {
                                                        aVar4.K(-1969711736);
                                                    } else {
                                                        aVar4.K(-1966546698);
                                                        z8u.b(i13 - subList.size(), 0, aVar4, subList, izsVar7);
                                                        if (intValue2 < ceil - 1) {
                                                            aVar4.K(-1966331744);
                                                            q630 f = txj0.f(txj0.h(q630.a.a, 6), 1.0f);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                                            }
                                                            ylu0 ylu0Var2 = (ylu0) aVar4.r(rrv0.a);
                                                            if (androidx.compose.runtime.b.d()) {
                                                                androidx.compose.runtime.b.e();
                                                            }
                                                            f9t.e(hr80.m(f, ylu0Var2.getBackground().g, androidx.compose.ui.graphics.e.a), aVar4, 0);
                                                        } else {
                                                            aVar4.K(-1969711736);
                                                        }
                                                        aVar4.j();
                                                    }
                                                    aVar4.j();
                                                    if (androidx.compose.runtime.b.d()) {
                                                        androidx.compose.runtime.b.e();
                                                    }
                                                } else {
                                                    aVar4.h();
                                                }
                                                return s3q0.a;
                                            }
                                        }, true), 6);
                                    }
                                    return s3q0.a;
                                }
                            };
                            aVar3.R(izsVar6);
                            x10 = izsVar6;
                        } else {
                            dVar3 = dVar4;
                            z8 = z9;
                            izsVar3 = izsVar5;
                            rg50Var8 = rg50Var9;
                            wh50Var2 = wh50Var3;
                        }
                        jpl0.a.d dVar5 = dVar3;
                        wh50 wh50Var4 = wh50Var2;
                        lqy.a(t, xvyVar2, n, null, null, null, false, null, (izs) x10, aVar3, 0, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                        if (z8) {
                            aVar3.K(-188409280);
                            izsVar4 = izsVar3;
                            ekk.c(qa8Var, dVar5.b, rg50Var8, izsVar4, aVar3, (i11 & 14) | 384);
                        } else {
                            izsVar4 = izsVar3;
                            aVar3.K(-193197044);
                        }
                        aVar3.j();
                        Object x11 = aVar3.x();
                        if (x11 == c0012a3) {
                            x11 = new ixe0(1, wh50Var4);
                            aVar3.R(x11);
                        }
                        lll0.a(dVar5, (gzs) x11, izsVar4, aVar3, 48);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            };
            izsVar2 = izsVar2;
            i2 = i6;
            dge0.a(z5, gzsVar, m, null, null, kai.c(1404209046, yzsVar, aVar2), aVar2, 196608, 24);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            dVar2 = dVar;
            i2 = 6;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jkd(izsVar2, dVar2, i, i2);
        }
    }
}
