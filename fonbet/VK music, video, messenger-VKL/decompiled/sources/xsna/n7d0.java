package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.core.tool.onboarding.VkOnboarding$HighlighterMarkerType;
import com.vk.core.tool.onboarding.VkOnboarding$TintColor;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.v5v;

/* compiled from: PrimaryBlockAlbumItem.kt */
/* loaded from: classes17.dex */
public final class n7d0 {
    public static final float a = 10;
    public static final long b = f870.d(4294177780L);
    public static final long c = f870.d(4281019180L);
    public static final long d = f870.d(4292994021L);
    public static final long e = f870.d(4282730055L);

    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, String str, final boolean z) {
        boolean z2;
        String a2;
        androidx.compose.runtime.a M = aVar.M(475003786);
        int i3 = (M.J(str) ? 4 : 2) | i2 | (M.l(z) ? 32 : 16) | (M.o(i) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(475003786, i3, -1, "com.vk.community.design.compose.primaryblock.items.DescriptionContent (PrimaryBlockAlbumItem.kt:84)");
            }
            if (i > 0) {
                M.K(1212109818);
                a2 = d370.F(R.plurals.community_primary_block_goods_album_item_count_goods, i, new Object[]{Integer.valueOf(i)}, M, (i3 >> 3) & 112);
                M.j();
            } else {
                a2 = zq.a(M, 1212114943, R.string.community_primary_block_goods_album_item_without_goods_count, M, 0);
            }
            String str2 = a2;
            Object x = M.x();
            if (x == a.C0011a.a) {
                bpn0 bpn0Var = v5v.c;
                x = v5v.a.a("<u>" + str + "</u>");
                M.R(x);
            }
            final v5v v5vVar = (v5v) x;
            d8v0.a(v5vVar.b, null, VkOnboarding$HighlighterMarkerType.Type3, VkOnboarding$TintColor.Lime, z, false, false, null, kai.c(-359373754, new zzs() { // from class: xsna.l7d0
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    izs izsVar = (izs) obj;
                    ((Boolean) obj2).getClass();
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= aVar2.y(izsVar) ? 4 : 2;
                    }
                    if (aVar2.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-359373754, intValue, -1, "com.vk.community.design.compose.primaryblock.items.DescriptionContent.<anonymous> (PrimaryBlockAlbumItem.kt:101)");
                        }
                        boolean s = true ^ wlb0.h(aVar2).s();
                        long j = wlb0.h(aVar2).getText().o;
                        bpn0 bpn0Var2 = v5v.c;
                        yqv0.d(d8v0.c(v5v.this, z, s, j, aVar2, 0), ahn.E(q630.a.a, "priority_block_album_item_count"), wlb0.h(aVar2).getText().m, 0, null, 2, false, 1, izsVar, null, wlb0.l(aVar2).h0, aVar2, 100663344, ((intValue << 3) & 112) | 6, 4856);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, ((i3 << 9) & 57344) | 805309824, 482);
            z2 = z;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().p;
            q630.a aVar2 = q630.a.a;
            yqv0.c(str2, ahn.E(aVar2, "priority_block_album_title"), j, null, null, 0, 0, null, 0, false, 0, 1, null, frv0Var, M, 48, 48, 6136);
            M = M;
            if (a690.d(aVar2, 20, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            z2 = z;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ik40(i, i2, str, z2);
        }
    }

    public static final void b(String str, androidx.compose.runtime.a aVar, int i) {
        String str2;
        s3q0 s3q0Var;
        androidx.compose.runtime.a M = aVar.M(-1068661590);
        int i2 = (M.J(str) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1068661590, i2, -1, "com.vk.community.design.compose.primaryblock.items.ImageContent (PrimaryBlockAlbumItem.kt:133)");
            }
            q630.a aVar2 = q630.a.a;
            q630 d2 = sua.d(1.0f, txj0.f(aVar2, 1.0f), false);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, d2);
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
            k9q0.w(M, d3, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            d(-4.0f, 1.107f, dhr0.M() ? c : b, M, 48);
            d(4.0f, 1.184f, dhr0.M() ? e : d, M, 54);
            q630 f = txj0.f(aVar2, 1.0f);
            long j = wlb0.h(M).getBackground().x;
            float f2 = a;
            q630 E = ahn.E(r18.a((float) 0.5d, wlb0.h(M).getImage().a, sua.d(1.82f, rte0.d(hr80.m(f, j, vog0.b(f2)), vog0.b(f2)), false), vog0.b(10)), "product_main_image");
            cp10 d4 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, E);
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
            k9q0.w(M, d4, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            if (str == null) {
                M.K(-2064684216);
                M.j();
                s3q0Var = null;
                str2 = str;
            } else {
                M.K(-2064684215);
                fwu0.c(txj0.d(aVar2, 1.0f), null, str, null, null, null, null, rji.a, M, ((i2 << 6) & 896) | 100663302, 250);
                str2 = str;
                M = M;
                M.j();
                s3q0Var = s3q0.a;
            }
            if (s3q0Var == null) {
                M.K(-2064145962);
                qzu0.a.getClass();
                androidx.compose.runtime.a aVar4 = M;
                pzu0.b(qzu0.a0(M), null, txj0.q(aVar2, 56), wlb0.h(M).getIcon().n, aVar4, 440, 0);
                M = aVar4;
                M.j();
            } else {
                M.K(1734512573);
                M.j();
            }
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new uac(str2, i, 1);
        }
    }

    public static final void c(o7d0 o7d0Var, q630 q630Var, gzs gzsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2108637541);
        int i2 = (M.J(o7d0Var) ? 4 : 2) | i | (M.J(q630Var) ? 32 : 16) | (M.y(gzsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2108637541, i2, -1, "com.vk.community.design.compose.primaryblock.items.PrimaryBlockAlbumItem (PrimaryBlockAlbumItem.kt:63)");
            }
            q630 d2 = rte0.d(q630Var, vog0.b(10));
            boolean z = (i2 & 896) == 256;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ihq(2, gzsVar);
                M.R(x);
            }
            q630 c2 = ojc.c(d2, false, null, null, (gzs) x, 15);
            float f = kqu0.s;
            float f2 = kqu0.r;
            q630 E = s200.E(c2, f, f2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c3 = qri.c(M, E);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c3, cri.a.d);
            b(o7d0Var.e, M, 0);
            f9t.e(txj0.h(q630.a.a, f2), M, 0);
            a(o7d0Var.d, 0, M, o7d0Var.b, o7d0Var.c);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ax(o7d0Var, q630Var, gzsVar, i);
        }
    }

    public static final void d(final float f, final float f2, final long j, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1486358440);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (M.p(j) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1486358440, i3, -1, "com.vk.community.design.compose.primaryblock.items.RotatedBox (PrimaryBlockAlbumItem.kt:193)");
            }
            ja8.a(hr80.m(sua.d(f2, txj0.f(s200.E(fto0.t(q630.a.a, f), 12, 6), 1.0f), false), j, vog0.b(a)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.m7d0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n7d0.d(f, f2, j, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
