package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.DiagonalUserStackSize;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.phw;
import xsna.q630;
import xsna.w770;
import xsna.xcc;
import xsna.xpv;

/* compiled from: NotificationAvatarContent.kt */
/* loaded from: classes4.dex */
public final class y770 {
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w770 w770Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        boolean z;
        q630.a aVar2;
        q630 q630Var3;
        boolean y;
        Object x;
        long j;
        androidx.compose.runtime.a M = aVar.M(-1281241167);
        if ((i & 6) == 0) {
            i2 = (M.J(w770Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1281241167, i3, -1, "com.vk.notifications.design.compose.list.common.NotificationAvatarContent (NotificationAvatarContent.kt:41)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            boolean z2 = w770Var instanceof w770.b;
            q630.a aVar3 = q630.a.a;
            if (z2) {
                M.K(-80922717);
                y18 a = aqw.a((float) 0.5d, wlb0.h(M).getBackground().z);
                uog0 uog0Var = vog0.a;
                q630 d = rte0.d(r18.b(a.a, a.b, aVar3, uog0Var), uog0Var);
                float f = 48;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1060031380, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-DoneOutline28> (VkSdkIcons.kt:712)");
                }
                lg90 a2 = pg90.a(R.drawable.vk_icon_done_outline_28, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                if (wlb0.h(M).s()) {
                    M.K(-80477960);
                    M.j();
                    j = l5g.k;
                } else {
                    j = vcl0.a(M, -80414999, M).c;
                    M.j();
                }
                ldu0.b(xpv.a.a(a2, j, new rek0(wlb0.h(M).getBackground().x), M, 24584, 8), f, d, null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                M = M;
                M.j();
                aVar2 = aVar3;
            } else {
                boolean z3 = w770Var instanceof w770.d;
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z3) {
                    M.K(-80162163);
                    M.K(1382898862);
                    float f2 = (float) 0.5d;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    y18 a3 = aqw.a(f2, ylu0Var.getBackground().z);
                    uog0 uog0Var2 = vog0.a;
                    q630 E = ahn.E(rte0.d(r18.b(a3.a, a3.b, aVar3, uog0Var2), uog0Var2), "NotificationAvatar");
                    w770.d dVar = (w770.d) w770Var;
                    snv snvVar = dVar.b;
                    if (snvVar != null) {
                        boolean y2 = ((i3 & 112) == 32) | M.y(snvVar);
                        Object x2 = M.x();
                        if (y2 || x2 == c0012a) {
                            x2 = new hc1(17, izsVar, snvVar);
                            M.R(x2);
                        }
                        q630 g = E.g(o19.g(aVar3, (gzs) x2));
                        if (g != null) {
                            q630Var3 = g;
                            M.j();
                            float f3 = 48;
                            lg90 l = fwu0.l(dVar.a, null, null, null, M, 0, 62);
                            y = M.y(context) | ((i3 & 14) == 4);
                            x = M.x();
                            if (!y || x == c0012a) {
                                x = new sf4(13, w770Var, context);
                                M.R(x);
                            }
                            ldu0.b(phw.a.a(l, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196616, 14), f3, q630Var3, null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                            M = M;
                            M.j();
                            aVar2 = aVar3;
                        }
                    }
                    q630Var3 = E;
                    M.j();
                    float f32 = 48;
                    lg90 l2 = fwu0.l(dVar.a, null, null, null, M, 0, 62);
                    y = M.y(context) | ((i3 & 14) == 4);
                    x = M.x();
                    if (!y) {
                    }
                    x = new sf4(13, w770Var, context);
                    M.R(x);
                    ldu0.b(phw.a.a(l2, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196616, 14), f32, q630Var3, null, null, false, null, null, null, M, 48, ApiInvocationException.ErrorCodes.PHOTO_IMAGE_CORRUPTED);
                    M = M;
                    M.j();
                    aVar2 = aVar3;
                } else if (w770Var instanceof w770.a) {
                    M.K(-79211083);
                    q630 E2 = ahn.E(aVar3, "NotificationDoubleAvatar");
                    DiagonalUserStackSize diagonalUserStackSize = DiagonalUserStackSize.ExtraLarge;
                    xcc.a.c cVar = xcc.a.c.a;
                    boolean z4 = (i3 & 14) == 4;
                    Object x3 = M.x();
                    if (z4 || x3 == c0012a) {
                        x3 = new fju(w770Var, 16);
                        M.R(x3);
                    }
                    hyv0.b(E2, diagonalUserStackSize, cVar, (izs) x3, M, 48, 0);
                    M.j();
                    aVar2 = aVar3;
                } else {
                    if (!(w770Var instanceof w770.c)) {
                        throw alb0.c(1382863671, M);
                    }
                    M.K(-78712107);
                    w770.c cVar2 = (w770.c) w770Var;
                    lg90 l3 = fwu0.l(null, cVar2.a, null, null, M, 0, 61);
                    M.K(1382952486);
                    float f4 = 10;
                    q630 d2 = rte0.d(txj0.q(aVar3, 48), vog0.b(f4));
                    float f5 = (float) 0.5d;
                    if (androidx.compose.runtime.b.d()) {
                        z = false;
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    } else {
                        z = false;
                    }
                    ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    y18 a4 = aqw.a(f5, ylu0Var2.getBackground().z);
                    q630 E3 = ahn.E(r18.b(a4.a, a4.b, d2, vog0.b(f4)), "NotificationServiceAvatar");
                    snv snvVar2 = cVar2.b;
                    if (snvVar2 != null) {
                        boolean y3 = M.y(snvVar2) | ((i3 & 112) == 32 ? true : z);
                        Object x4 = M.x();
                        if (y3 || x4 == c0012a) {
                            x4 = new h4(12, izsVar, snvVar2);
                            M.R(x4);
                        }
                        q630 g2 = E3.g(o19.g(aVar3, (gzs) x4));
                        if (g2 != null) {
                            E3 = g2;
                        }
                    }
                    M.j();
                    aVar2 = aVar3;
                    r0v0.a(l3, E3, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, cVar2.c.a(context).toString(), M, 8, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    M = M;
                    M.j();
                }
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gdv(w770Var, izsVar, q630Var2, i);
        }
    }
}
