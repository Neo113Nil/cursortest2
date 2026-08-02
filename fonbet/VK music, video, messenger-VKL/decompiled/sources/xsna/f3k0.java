package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.banner.CatalogBannerImageMode;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.core.compose.component.banner.Banner$BackgroundMode;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.z06;

/* compiled from: SmallCatalogAlbumBanner.kt */
/* loaded from: classes3.dex */
public final class f3k0 {
    public static final float a = 64;

    /* compiled from: SmallCatalogAlbumBanner.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CatalogBannerImageMode.values().length];
            try {
                iArr[CatalogBannerImageMode.ROUND_SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CatalogBannerImageMode.ROUND_BIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CatalogBannerImageMode.SQUARE_SMALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CatalogBannerImageMode.SQUARE_BIG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CatalogBannerImageMode.FULL_BACKGROUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02db  */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [xsna.gzs] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(UIBlockPlaceholder uIBlockPlaceholder, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        float f;
        lg90 lg90Var;
        androidx.compose.runtime.a aVar3;
        ArrayList<UIBlockAction> arrayList;
        rw6 rw6Var;
        Iterator it;
        Object obj;
        UIBlockActionOpenUrl uIBlockActionOpenUrl;
        Iterator it2;
        Object obj2;
        x61 x61Var;
        float f2;
        UIBlockAction uIBlockAction;
        a.C0011a.C0012a c0012a;
        q630.a aVar4;
        a.C0011a.C0012a c0012a2;
        x61 x61Var2;
        ?? r14;
        ImageSize Cb;
        androidx.compose.runtime.a M = aVar.M(-1721620464);
        int i3 = i | (M.J(uIBlockPlaceholder) ? 4 : 2);
        if (M.t(i3 & 1, (i3 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1721620464, i3, -1, "com.vk.music.playlist.framework.presentation.catalog.SmallCatalogAlbumBanner (SmallCatalogAlbumBanner.kt:45)");
            }
            epi epiVar = (epi) M.r(fpi.a);
            q630.a aVar5 = q630.a.a;
            q630 d = rte0.d(s200.H(txj0.f(aVar5, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), vog0.b(20));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f3 = 16;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, 1, hr80.m(d, ylu0Var.getBackground().g, androidx.compose.ui.graphics.e.a));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
            cri.h7.getClass();
            LayoutNode.a aVar6 = cri.a.b;
            zp8 zp8Var = null;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar6);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            CatalogBannerImageMode catalogBannerImageMode = uIBlockPlaceholder.H;
            ArrayList<UIBlockAction> arrayList2 = uIBlockPlaceholder.G;
            boolean z = catalogBannerImageMode == CatalogBannerImageMode.FULL_BACKGROUND;
            Banner$BackgroundMode banner$BackgroundMode = z ? Banner$BackgroundMode.Dark : Banner$BackgroundMode.Light;
            int dimensionPixelSize = ((Context) M.r(AndroidCompositionLocals_androidKt.b)).getResources().getDimensionPixelSize(R.dimen.catalog_banner_height_small);
            Image image = uIBlockPlaceholder.B;
            String str = (image == null || (Cb = image.Cb(dimensionPixelSize, false, false)) == null) ? null : Cb.d.d;
            int i4 = a.$EnumSwitchMapping$0[(catalogBannerImageMode == null ? CatalogBannerImageMode.NONE : catalogBannerImageMode).ordinal()];
            if (i4 != 1) {
                if (i4 == 2 || i4 == 3) {
                    f = 48;
                } else if (i4 == 4) {
                    i2 = 96;
                } else if (i4 != 5) {
                    f = 0;
                } else {
                    i2 = 400;
                }
                float f4 = f;
                if (str == null && z) {
                    M.K(-655136272);
                    lg90 a2 = tlw.a(new vlw(str, null), M, 0);
                    M.j();
                    lg90Var = a2;
                } else {
                    M.K(-655071792);
                    M.j();
                    lg90Var = null;
                }
                if (str != null || catalogBannerImageMode == CatalogBannerImageMode.NONE || z) {
                    aVar3 = M;
                    arrayList = arrayList2;
                    aVar3.K(-654653168);
                    aVar3.j();
                    rw6Var = null;
                } else {
                    M.K(-654885823);
                    lg90 a3 = tlw.a(new vlw(str, null), M, 0);
                    arrayList = arrayList2;
                    aVar3 = M;
                    rw6 f5 = wp80.f(phw.a.a(a3, null, null, null, null, M, 196616, 30), f4, PictureRadius.Large, aVar3, 12607488, 108);
                    aVar3.j();
                    rw6Var = f5;
                }
                it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        UIBlockAction uIBlockAction2 = (UIBlockAction) obj;
                        if ((uIBlockAction2 instanceof UIBlockActionOpenUrl) && uIBlockAction2.d != CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                uIBlockActionOpenUrl = !(obj instanceof UIBlockActionOpenUrl) ? (UIBlockActionOpenUrl) obj : null;
                it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it2.next();
                        if (((UIBlockAction) obj2).d == CatalogViewType.SYNTHETIC_ACTION_CLOSE_BANNER) {
                            break;
                        }
                    }
                }
                UIBlockAction uIBlockAction3 = (UIBlockAction) obj2;
                a.C0011a.C0012a c0012a3 = a.C0011a.a;
                if (uIBlockActionOpenUrl != null) {
                    aVar3.K(-654221091);
                    aVar3.j();
                    c0012a = c0012a3;
                    uIBlockAction = uIBlockAction3;
                    x61Var = null;
                    f2 = f3;
                    aVar4 = aVar5;
                } else {
                    aVar3.K(-654221090);
                    if (uIBlockActionOpenUrl.z.length() == 0) {
                        aVar3.K(1163102582);
                        aVar3.j();
                        c0012a = c0012a3;
                        uIBlockAction = uIBlockAction3;
                        x61Var = null;
                        f2 = f3;
                        aVar4 = aVar5;
                    } else {
                        aVar3.K(1163153298);
                        String str2 = uIBlockActionOpenUrl.z;
                        ButtonStyle buttonStyle = ButtonStyle.Primary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                        boolean J = aVar3.J(epiVar) | aVar3.y(uIBlockPlaceholder);
                        Object x = aVar3.x();
                        if (J || x == c0012a3) {
                            x = new fqd(13, epiVar, uIBlockPlaceholder);
                            aVar3.R(x);
                        }
                        androidx.compose.runtime.a aVar7 = aVar3;
                        x61Var = null;
                        f2 = f3;
                        uIBlockAction = uIBlockAction3;
                        c0012a = c0012a3;
                        aVar4 = aVar5;
                        zp8Var = d16.a.C2697a.a(buttonStyle, buttonAppearance, null, str2, null, null, null, null, null, null, null, null, (gzs) x, aVar7, 54, 24576, 8180);
                        aVar3 = aVar7;
                        aVar3.j();
                    }
                    aVar3.j();
                }
                if (uIBlockAction == null) {
                    aVar3.K(-653748681);
                    boolean y = aVar3.y(uIBlockPlaceholder) | aVar3.y(uIBlockAction) | aVar3.J(epiVar);
                    Object x2 = aVar3.x();
                    c0012a2 = c0012a;
                    if (y || x2 == c0012a2) {
                        x2 = new fu5(uIBlockPlaceholder, uIBlockAction, epiVar, 5);
                        aVar3.R(x2);
                    }
                    androidx.compose.runtime.a aVar8 = aVar3;
                    x61Var2 = z06.b.a.a((gzs) x2, null, null, null, null, null, aVar8, 1572864, 62);
                    aVar3 = aVar8;
                    aVar3.j();
                } else {
                    c0012a2 = c0012a;
                    aVar3.K(-653537168);
                    aVar3.j();
                    x61Var2 = x61Var;
                }
                androidx.compose.runtime.a aVar9 = aVar3;
                xl20 a4 = d16.b.a(uIBlockPlaceholder.A, uIBlockPlaceholder.D, null, zp8Var, null, null, null, null, aVar9, 100663296, 244);
                q630 F2 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar4, 1.0f), a));
                if (uIBlockPlaceholder.F == null) {
                    aVar9.K(-652950679);
                    boolean J2 = aVar9.J(epiVar) | aVar9.y(uIBlockPlaceholder);
                    Object x3 = aVar9.x();
                    if (J2 || x3 == c0012a2) {
                        x3 = new hc1(24, epiVar, uIBlockPlaceholder);
                        aVar9.R(x3);
                    }
                    aVar9.j();
                    r14 = (gzs) x3;
                } else {
                    aVar9.K(-652849465);
                    aVar9.j();
                    r14 = x61Var;
                }
                beu0.a(a4, F2, lg90Var, null, null, banner$BackgroundMode, null, rw6Var, x61Var2, null, null, r14, aVar9, 560, 0, 1624);
                aVar2 = aVar9;
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                i2 = 28;
            }
            f = i2;
            float f42 = f;
            if (str == null) {
            }
            M.K(-655071792);
            M.j();
            lg90Var = null;
            if (str != null) {
            }
            aVar3 = M;
            arrayList = arrayList2;
            aVar3.K(-654653168);
            aVar3.j();
            rw6Var = null;
            it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                }
            }
            if (!(obj instanceof UIBlockActionOpenUrl)) {
            }
            it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                }
            }
            UIBlockAction uIBlockAction32 = (UIBlockAction) obj2;
            a.C0011a.C0012a c0012a32 = a.C0011a.a;
            if (uIBlockActionOpenUrl != null) {
            }
            if (uIBlockAction == null) {
            }
            androidx.compose.runtime.a aVar92 = aVar3;
            xl20 a42 = d16.b.a(uIBlockPlaceholder.A, uIBlockPlaceholder.D, null, zp8Var, null, null, null, null, aVar92, 100663296, 244);
            q630 F22 = s200.F(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.h(txj0.f(aVar4, 1.0f), a));
            if (uIBlockPlaceholder.F == null) {
            }
            beu0.a(a42, F22, lg90Var, null, null, banner$BackgroundMode, null, rw6Var, x61Var2, null, null, r14, aVar92, 560, 0, 1624);
            aVar2 = aVar92;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new com.vk.movika.tools.controls.seekbar.k(uIBlockPlaceholder, i, 10);
        }
    }
}
