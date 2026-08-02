package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.vk.clips.sdk.common.provider.ClipsComposeImageLoader;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.cri;
import xsna.dt1;
import xsna.kpv;
import xsna.phw;
import xsna.q630;

/* compiled from: AvatarImage.kt */
/* loaded from: classes17.dex */
public final class nr5 {
    public static final void a(final String str, final boolean z, final float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        iy5 iy5Var;
        androidx.compose.runtime.a M = aVar.M(1347543837);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.l(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.n(f) ? 256 : 128;
        }
        int i3 = i & 3072;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 2048 : 1024;
        }
        int i4 = i2;
        if (M.t(i4 & 1, (i4 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1347543837, i4, -1, "com.vk.clips.upload.ui.impl.compose.image.AvatarImage (AvatarImage.kt:30)");
            }
            if (((Boolean) M.r(c5x.a)).booleanValue()) {
                M.K(-380649713);
                ja8.a(hr80.l(rte0.d(txj0.q(aVar2, f), vog0.a), new y7z(e43.l(new l5g(l5g.e), new l5g(l5g.f)), null, 0L, 9187343241974906880L, 0), null, 6), M, 0);
                M.j();
            } else {
                M.K(-380411137);
                Pair<ClipsComposeImageLoader.LoadingState, lg90> a = ((ClipsComposeImageLoader) M.r(ckw.b)).a(str, M, i4 & 14);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, aVar2);
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
                if (a.i() != ClipsComposeImageLoader.LoadingState.Loaded) {
                    M.K(1894925475);
                    b(f, (i4 >> 6) & 14, M, null);
                } else {
                    M.K(1893202619);
                }
                M.j();
                phw a2 = phw.a.a(a.j(), null, null, null, null, M, 196616, 30);
                M = M;
                if (z) {
                    M.K(1895195919);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-741638904, 6, -1, "com.vk.clips.upload.ui.impl.compose.views.theme.ClipsUploadTheme.<get-icons> (ClipsUploadTheme.kt:34)");
                    }
                    egf egfVar = (egf) M.r(okf.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    lg90 a3 = egfVar.a(M);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    float f2 = 24;
                    iy5Var = kpv.a.a(a3, ylu0Var.getIcon().a, byc0.b(f2, f2), null, false, null, null, M, 100860296, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
                    M.j();
                } else {
                    M.K(1895507593);
                    M.j();
                    iy5Var = rep.a;
                }
                ldu0.b(a2, f, null, iy5Var, null, false, null, null, null, M, (i4 >> 3) & 112, 500);
                M.G();
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.lr5
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    nr5.a(str, z, f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final void b(final float f, final int i, androidx.compose.runtime.a aVar, q630 q630Var) {
        int i2;
        final q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(643190965);
        if ((i & 6) == 0) {
            i2 = (M.n(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (M.t(i3 & 1, (i3 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(643190965, i3, -1, "com.vk.clips.upload.ui.impl.compose.image.Placeholder (AvatarImage.kt:70)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-741638904, 6, -1, "com.vk.clips.upload.ui.impl.compose.views.theme.ClipsUploadTheme.<get-icons> (ClipsUploadTheme.kt:34)");
            }
            egf egfVar = (egf) M.r(okf.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630.a.a;
            ldu0.b(phw.a.a(egfVar.b(M), null, null, null, null, M, 196616, 30), f, q630Var2, null, null, false, null, null, null, M, (i3 << 3) & 1008, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mr5
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i | 1);
                    nr5.b(f, I, (androidx.compose.runtime.a) obj, q630Var2);
                    return s3q0.a;
                }
            };
        }
    }
}
