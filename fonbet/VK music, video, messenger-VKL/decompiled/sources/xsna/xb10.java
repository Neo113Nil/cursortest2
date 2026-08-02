package xsna;

import android.content.res.Configuration;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.ecomm.design.compose.pagintaiondots.MarketPaginationDotsSize;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import xsna.aa90;
import xsna.cri;
import xsna.dt1;
import xsna.f5h0;
import xsna.q630;

/* compiled from: MarketProductImages.kt */
/* loaded from: classes18.dex */
public final class xb10 {
    public static final void a(List list, q630 q630Var, xz00 xz00Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1032779773);
        int i2 = (M.J(list) ? 4 : 2) | i | 48 | (M.J(xz00Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                q630Var = q630.a.a;
            } else {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1032779773, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.image.MarketProductCardImages (MarketProductImages.kt:35)");
            }
            if (list.size() > 1) {
                M.K(1603714706);
                c(list, q630Var, xz00Var, M, i2 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
                M.j();
            } else {
                if (list.size() == 1) {
                    M.K(1603885330);
                    b(j5g.Y(new wow(list)), txj0.h(q630Var, xz00Var.b), ((Configuration) M.r(AndroidCompositionLocals_androidKt.a)).screenWidthDp, M, 0);
                } else {
                    M.K(1602160831);
                }
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k3o(i, 3, list, q630Var2, xz00Var);
        }
    }

    public static final void b(final Object obj, final q630 q630Var, final float f, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-355016346);
        int i2 = (M.J(obj) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        int i3 = i2 | (M.n(f) ? 256 : 128);
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-355016346, i3, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.image.MarketProductImage (MarketProductImages.kt:89)");
            }
            final int I0 = (int) ((azl) M.r(uvi.h)).I0(f);
            boolean z = (i3 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = ((Image) obj).Cb(I0, true, false);
                M.R(x);
            }
            final ImageSize imageSize = (ImageSize) x;
            String str = imageSize != null ? imageSize.d.d : null;
            boolean y = M.y(imageSize) | M.o(I0);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new izs() { // from class: xsna.vb10
                    @Override // xsna.izs
                    public final Object invoke(Object obj2) {
                        com.vk.dto.common.im.Image image;
                        int i4;
                        ojt ojtVar = (ojt) obj2;
                        ImageSize imageSize2 = imageSize;
                        f5h0.d dVar = f5h0.f.a;
                        if (imageSize2 != null && (i4 = (image = imageSize2.d).b) > image.c) {
                            dVar = i4 < I0 ? f5h0.i.a : f5h0.g.a;
                        }
                        ojtVar.l = dVar;
                        return s3q0.a;
                    }
                };
                M.R(x2);
            }
            fwu0.c(q630Var, null, str, null, null, (izs) x2, null, jhi.a, M, ((i3 >> 3) & 14) | 100663296, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.wb10
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int I = ne7.I(i | 1);
                    xb10.b(obj, q630Var, f, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void c(final List list, q630 q630Var, final xz00 xz00Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(447408146);
        if ((i & 6) == 0) {
            i2 = (M.J(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(xz00Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            M.V();
            if ((i & 1) != 0 && !M.i()) {
                M.h();
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(447408146, i2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.image.MarketProductImagesSlider (MarketProductImages.kt:57)");
            }
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new mhw(list, 1);
                M.R(x);
            }
            yjl b = rc90.b(0, (gzs) x, M, 0, 3);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
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
            float f = xz00Var.b;
            q630.a aVar4 = q630.a.a;
            aVar2 = M;
            nb90.a(b, txj0.h(aVar4, f), null, new aa90.b(xz00Var.a), 0, xz00Var.c, null, null, false, null, null, null, null, kai.c(-1795648981, new zzs() { // from class: xsna.ub10
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int intValue = ((Integer) obj2).intValue();
                    androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1795648981, intValue2, -1, "com.vk.ecomm.cart.impl.checkout.ui.compose.image.MarketProductImagesSlider.<anonymous>.<anonymous> (MarketProductImages.kt:67)");
                    }
                    xb10.b(list.get(intValue), txj0.d(q630.a.a, 1.0f), xz00Var.a, aVar5, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 0, 24576, 16340);
            s910.a(list.size(), b.k(), s200.H(ra8.a.b(aVar4, dt1.a.i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, xz00Var.d, 7), MarketPaginationDotsSize.Large, aVar2, 3072, 0);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new c3(i, 3, list, q630Var, xz00Var);
        }
    }
}
