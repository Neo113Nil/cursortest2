package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ImageGalleryEditModeCell.kt */
/* loaded from: classes18.dex */
public final class ijw {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        ColorFilter porterDuffColorFilter;
        androidx.compose.runtime.a M = aVar.M(1708534107);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1708534107, i2, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryAddItemView (ImageGalleryEditModeCell.kt:231)");
            }
            String N = d370.N(R.string.image_picker_add_item_accessibility_description, 0, M);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.f;
            float f = 4;
            q630 E = ahn.E(txj0.s(s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), 62, 74), "addImageButton");
            float f2 = 6;
            q630 d = rte0.d(E, vog0.b(f2));
            boolean J = M.J(N);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new fjw(N, 0);
                M.R(x);
            }
            q630 a = r18.a((float) 0.5d, wlb0.h(M).getImage().a, hr80.m(egi0.b(d, true, (izs) x), wlb0.h(M).getBackground().x, androidx.compose.ui.graphics.e.a), vog0.b(f2));
            boolean z = (i2 & 112) == 32;
            Object x2 = M.x();
            if (z || x2 == obj) {
                x2 = new gjw(0, gzsVar);
                M.R(x2);
            }
            q630 c = ojc.c(a, false, null, null, (gzs) x2, 15);
            cp10 d2 = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, c);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1869183844, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-AddOutline28> (VkSdkIcons.kt:56)");
            }
            lg90 b = or.b(M, -604730424, R.drawable.vk_icon_add_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = wlb0.h(M).getIcon().l;
            if (Build.VERSION.SDK_INT >= 29) {
                se7.b();
                porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
            } else {
                porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
            }
            vjw.a(b, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), M, 56, 60);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xd0(q630Var, gzsVar, i, 5);
        }
    }

    public static final void b(int i, q630 q630Var, List list, String str, String str2, izs izsVar, androidx.compose.runtime.a aVar, int i2) {
        String O;
        androidx.compose.runtime.a M = aVar.M(-2082889911);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.J(q630Var) ? 2048 : 1024) | (M.J(list != null ? new wow(list) : null) ? 16384 : 8192) | (M.J(str) ? 131072 : 65536) | (M.J(str2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (M.y(izsVar) ? 8388608 : 4194304);
        if (M.t(i3 & 1, (4793491 & i3) != 4793490)) {
            M.V();
            if ((i2 & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2082889911, i3, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryEditModeCell (ImageGalleryEditModeCell.kt:62)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (i == 0) {
                M.K(90703743);
                M.j();
                O = str;
            } else {
                M.K(90758799);
                O = d370.O(R.string.image_picker_counter_string, new Object[]{Integer.valueOf(i)}, M);
                M.j();
            }
            yqv0.c(O, null, wlb0.h(M).getText().r, null, null, 0, 5, null, 0, false, 0, 0, null, wlb0.l(M).e0, M, 0, 0, 8122);
            M = M;
            q630.a aVar3 = q630.a.a;
            f9t.e(txj0.h(aVar3, 8), M, 6);
            q630 f = txj0.f(aVar3, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(6);
            boolean z = ((((57344 & i3) ^ 24576) > 16384 && M.J(list)) || (i3 & 24576) == 16384) | ((29360128 & i3) == 8388608);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new ng5(1, list, izsVar);
                M.R(x);
            }
            lqy.b(f, null, null, g, null, null, false, null, (izs) x, M, 24582, 494);
            if (str2 == null) {
                M.K(92608444);
            } else {
                M.K(92608445);
                f9t.e(txj0.h(aVar3, 12), M, 6);
                yqv0.c(str2, null, wlb0.h(M).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 0, 0, 8186);
                M = M;
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xg7(i, q630Var, list, str, str2, izsVar, i2);
        }
    }

    public static final void c(final int i, final String str, final boolean z, final boolean z2, final q630 q630Var, final izs izsVar, final izs izsVar2, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.a M = aVar.M(703016102);
        int i3 = i2 | (M.o(i) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.l(z2) ? 2048 : 1024) | (M.J(q630Var) ? 16384 : 8192) | (M.y(izsVar) ? 131072 : 65536) | (M.y(izsVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(703016102, i3, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryItemView (ImageGalleryEditModeCell.kt:128)");
            }
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = 4;
            q630.a aVar3 = q630.a.a;
            q630 s = txj0.s(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9), 62, 74);
            float f2 = 6;
            q630 d2 = rte0.d(s, vog0.b(f2));
            long j = wlb0.h(M).getImage().b;
            e.a aVar4 = androidx.compose.ui.graphics.e.a;
            fwu0.c(r18.a((float) 0.5d, wlb0.h(M).getImage().a, hr80.m(d2, j, aVar4), vog0.b(f2)), str, null, null, null, null, null, kai.c(1736299581, new a0t() { // from class: xsna.djw
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar5.J(lg90Var) : aVar5.y(lg90Var) ? 256 : 128;
                    }
                    boolean z3 = true;
                    if (aVar5.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1736299581, intValue, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryItemView.<anonymous>.<anonymous> (ImageGalleryEditModeCell.kt:143)");
                        }
                        dt1.a.getClass();
                        cp10 d3 = ja8.d(dt1.a.b, false);
                        int hashCode2 = Long.hashCode(n34.n(aVar5));
                        sy90 D2 = aVar5.D();
                        q630.a aVar6 = q630.a.a;
                        q630 c2 = qri.c(aVar5, aVar6);
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
                        k9q0.w(aVar5, d3, cri.a.f);
                        k9q0.w(aVar5, D2, cri.a.e);
                        k9q0.w(aVar5, Integer.valueOf(hashCode2), cri.a.g);
                        k9q0.t(aVar5, cri.a.h);
                        k9q0.w(aVar5, c2, cri.a.d);
                        int i4 = intValue;
                        boolean z4 = z;
                        boolean z5 = z2;
                        if (!z4 && !z5) {
                            z3 = false;
                        }
                        ijw.d(z3, lg90Var, null, aVar5, ((i4 >> 3) & 112) | 64);
                        ty6 ty6Var2 = dt1.a.f;
                        ra8 ra8Var = ra8.a;
                        q630 b = ra8Var.b(aVar6, ty6Var2);
                        izs izsVar3 = izsVar;
                        boolean J = aVar5.J(izsVar3);
                        int i5 = i;
                        boolean o = J | aVar5.o(i5);
                        Object x = aVar5.x();
                        if (o || x == a.C0011a.a) {
                            x = new hjw(i5, 0, izsVar3);
                            aVar5.R(x);
                        }
                        mm2.f(z4, xa4.J(b, false, (gzs) x), anp.e(null, 3), anp.f(null, 3), null, rgi.a, aVar5, 200064, 16);
                        mm2.f(z5, ra8Var.b(txj0.q(aVar6, 24), ty6Var2), anp.e(null, 3), anp.f(null, 3), null, rgi.b, aVar5, 200064, 16);
                        aVar5.G();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar5.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i3 & 112) | 100663296, 252);
            M = M;
            ty6 ty6Var2 = dt1.a.d;
            ra8 ra8Var = ra8.a;
            q630 q = txj0.q(ra8Var.b(aVar3, ty6Var2), 18);
            uog0 uog0Var = vog0.a;
            q630 m = hr80.m(rte0.d(q, uog0Var), wlb0.h(M).getBackground().g, aVar4);
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, m);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            long j2 = wlb0.h(M).getIcon().l;
            qzu0.a.getClass();
            lg90 x = qzu0.x(M);
            String N = d370.N(R.string.image_picker_reload_image_title, 0, M);
            q630 m2 = hr80.m(ahn.E(rte0.d(ra8Var.b(s200.D(aVar3, 2), dt1.a.f), uog0Var), "removeImageButton"), wlb0.h(M).getBackground().g, aVar4);
            boolean z3 = ((i3 & 3670016) == 1048576) | ((i3 & 14) == 4);
            Object x2 = M.x();
            if (z3 || x2 == a.C0011a.a) {
                x2 = new arb(izsVar2, i, 1);
                M.R(x2);
            }
            pzu0.b(x, N, ojc.c(m2, false, null, null, (gzs) x2, 15), j2, M, 8, 0);
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new wzs(i, str, z, z2, q630Var, izsVar, izsVar2, i2) { // from class: xsna.ejw
                public final /* synthetic */ int b;
                public final /* synthetic */ String c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ q630 f;
                public final /* synthetic */ izs g;
                public final /* synthetic */ izs h;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    ijw.c(this.b, this.c, this.d, this.e, this.f, this.g, this.h, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void d(boolean z, lg90 lg90Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1897168016);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? M.J(lg90Var) : M.y(lg90Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1897168016, i3, -1, "com.vk.ecomm.design.compose.imagegallery.ImageGalleryLoadedItemView (ImageGalleryEditModeCell.kt:207)");
            }
            q630.a aVar2 = q630.a.a;
            ijk.a(Boolean.valueOf(z), aVar2, null, "LoadedImage", kai.c(1759512881, new xs2(lg90Var, 2), M), M, (i3 & 14) | 27648 | ((i3 >> 3) & 112), 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cjw(z, lg90Var, q630Var, i);
        }
    }
}
