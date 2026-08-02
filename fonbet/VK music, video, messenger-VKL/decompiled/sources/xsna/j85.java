package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.header.TopBarVh;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class j85 implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ j85(String str, eda edaVar, Object obj, CatalogExtendedData catalogExtendedData, TopBarVh topBarVh) {
        this.c = str;
        this.d = edaVar;
        this.e = obj;
        this.f = catalogExtendedData;
        this.g = topBarVh;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ff  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        long j;
        int i;
        int r0;
        tra0 tra0Var;
        tra0 tra0Var2;
        tra0 N;
        switch (this.b) {
            case 0:
                m95 m95Var = (m95) this.c;
                jai jaiVar = (jai) this.d;
                final rv5 rv5Var = (rv5) this.g;
                final jai jaiVar2 = (jai) this.e;
                jai jaiVar3 = (jai) this.f;
                ztm0 ztm0Var = (ztm0) obj;
                o6j o6jVar = (o6j) obj2;
                int r02 = ztm0Var.r0(m95Var.c);
                long j2 = o6jVar.a;
                long b = o6j.b(0, j2, 0, 0, 0, 10);
                int i2 = m95Var.g + m95Var.h;
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 > 0) {
                    int i3 = o6j.i(b) - i2;
                    int k = o6j.k(b);
                    j = o6j.b(0, b, i3 < k ? k : i3, 0, 0, 13);
                } else {
                    j = b;
                }
                tra0 N2 = ((zo10) j5g.Y(ztm0Var.t1(n95.Main, new jai(-1648959994, new q85(0, jaiVar, rv5Var), true)))).N(j);
                if (!m95Var.d) {
                    int i4 = N2.c;
                    boolean z = m95Var.a;
                    boolean z2 = m95Var.b;
                    int r03 = ztm0Var.r0(d95.a);
                    if (z) {
                        r03 = ztm0Var.r0(d95.c) + ztm0Var.r0(d95.b) + r03;
                    }
                    if (z2) {
                        r03 = ztm0Var.r0(d95.e) + ztm0Var.K0(d95.d) + r03;
                    }
                    int i5 = i4 - r03;
                    if (i5 >= 0) {
                        i = i5;
                        final lja0 lja0Var = new lja0(r02, i);
                        final float f = !m95Var.e ? 4.5f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        tra0 N3 = ((zo10) j5g.Y(ztm0Var.t1(n95.Media, new jai(-630222378, new wzs() { // from class: xsna.p85
                            @Override // xsna.wzs
                            public final Object invoke(Object obj3, Object obj4) {
                                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(-630222378, intValue, -1, "com.vk.profile.design.compose.header.content.measureMediaPlaceable.<anonymous> (AuthorHeaderHeaderContent.kt:375)");
                                    }
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                                    }
                                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                    long j3 = ylu0Var.getBackground().a;
                                    q630.a aVar2 = q630.a.a;
                                    q630 b2 = lv5.b(f370.P(txj0.d(aVar2, 1.0f), f), rv5Var, j3, 2);
                                    dt1.a.getClass();
                                    cp10 d = ja8.d(dt1.a.b, false);
                                    int hashCode = Long.hashCode(n34.n(aVar));
                                    sy90 D = aVar.D();
                                    q630 c = qri.c(aVar, b2);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar3 = cri.a.b;
                                    if (aVar.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar.H();
                                    if (aVar.L()) {
                                        aVar.I(aVar3);
                                    } else {
                                        aVar.f();
                                    }
                                    k9q0.w(aVar, d, cri.a.f);
                                    k9q0.w(aVar, D, cri.a.e);
                                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                                    k9q0.t(aVar, cri.a.h);
                                    k9q0.w(aVar, c, cri.a.d);
                                    jaiVar2.invoke(lja0Var, txj0.d(aVar2, 1.0f), aVar, 48);
                                    aVar.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar.h();
                                }
                                return s3q0.a;
                            }
                        }, true)))).N(j2);
                        long j3 = o6jVar.a;
                        r0 = ztm0Var.r0(d95.f) + N2.c + m95Var.f;
                        if (r0 > 0) {
                            tra0Var = N2;
                            tra0Var2 = N3;
                            N = null;
                        } else {
                            tra0Var = N2;
                            tra0Var2 = N3;
                            N = ((zo10) j5g.Y(ztm0Var.t1(n95.Blur, new jai(35006354, new o85(rv5Var, 0), true)))).N(o6j.a(o6j.i(j3), o6j.i(j3), r0, r0));
                        }
                        zo10 zo10Var = (zo10) j5g.a0(ztm0Var.t1(n95.Badge, new jai(-489572487, new n85(0, jaiVar3, rv5Var), true)));
                        tra0 N4 = zo10Var == null ? zo10Var.N(b) : null;
                        ztm0Var.j1(i);
                        return ztm0Var.Q(o6j.i(j2), o6j.h(j2), jgp.b, new m85(lja0Var, o6jVar, tra0Var2, tra0Var, N, N4, null, m95Var, 0));
                    }
                }
                i = 0;
                final lja0 lja0Var2 = new lja0(r02, i);
                if (!m95Var.e) {
                }
                tra0 N32 = ((zo10) j5g.Y(ztm0Var.t1(n95.Media, new jai(-630222378, new wzs() { // from class: xsna.p85
                    @Override // xsna.wzs
                    public final Object invoke(Object obj3, Object obj4) {
                        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(-630222378, intValue, -1, "com.vk.profile.design.compose.header.content.measureMediaPlaceable.<anonymous> (AuthorHeaderHeaderContent.kt:375)");
                            }
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                            }
                            ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                            long j32 = ylu0Var.getBackground().a;
                            q630.a aVar2 = q630.a.a;
                            q630 b2 = lv5.b(f370.P(txj0.d(aVar2, 1.0f), f), rv5Var, j32, 2);
                            dt1.a.getClass();
                            cp10 d = ja8.d(dt1.a.b, false);
                            int hashCode = Long.hashCode(n34.n(aVar));
                            sy90 D = aVar.D();
                            q630 c = qri.c(aVar, b2);
                            cri.h7.getClass();
                            LayoutNode.a aVar3 = cri.a.b;
                            if (aVar.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar.H();
                            if (aVar.L()) {
                                aVar.I(aVar3);
                            } else {
                                aVar.f();
                            }
                            k9q0.w(aVar, d, cri.a.f);
                            k9q0.w(aVar, D, cri.a.e);
                            k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                            k9q0.t(aVar, cri.a.h);
                            k9q0.w(aVar, c, cri.a.d);
                            jaiVar2.invoke(lja0Var2, txj0.d(aVar2, 1.0f), aVar, 48);
                            aVar.G();
                            if (androidx.compose.runtime.b.d()) {
                                androidx.compose.runtime.b.e();
                            }
                        } else {
                            aVar.h();
                        }
                        return s3q0.a;
                    }
                }, true)))).N(j2);
                long j32 = o6jVar.a;
                r0 = ztm0Var.r0(d95.f) + N2.c + m95Var.f;
                if (r0 > 0) {
                }
                zo10 zo10Var2 = (zo10) j5g.a0(ztm0Var.t1(n95.Badge, new jai(-489572487, new n85(0, jaiVar3, rv5Var), true)));
                if (zo10Var2 == null) {
                }
                ztm0Var.j1(i);
                return ztm0Var.Q(o6j.i(j2), o6j.h(j2), jgp.b, new m85(lja0Var2, o6jVar, tra0Var2, tra0Var, N, N4, null, m95Var, 0));
            default:
                String str = (String) this.c;
                eda edaVar = (eda) this.d;
                CatalogExtendedData catalogExtendedData = (CatalogExtendedData) this.f;
                TopBarVh topBarVh = (TopBarVh) this.g;
                com.vk.lists.c cVar = (com.vk.lists.c) obj2;
                if (cVar != null) {
                    cVar.s(str);
                }
                UIBlockList uIBlockList = (UIBlockList) j5g.Y(jda.a(edaVar.c, this.e, catalogExtendedData, false, false, 12));
                if (topBarVh != null) {
                    topBarVh.N6(uIBlockList);
                }
                return uIBlockList;
        }
    }

    public /* synthetic */ j85(m95 m95Var, jai jaiVar, rv5 rv5Var, jai jaiVar2, jai jaiVar3) {
        this.c = m95Var;
        this.d = jaiVar;
        this.g = rv5Var;
        this.e = jaiVar2;
        this.f = jaiVar3;
    }
}
