package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.notifications.core.item.NotificationImage;
import com.vk.notifications.core.item.a;
import xsna.q630;

/* compiled from: NotificationVisualContent.kt */
/* loaded from: classes4.dex */
public final class oi70 {
    public static final void a(a.c cVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(891635675);
        if ((i & 6) == 0) {
            i2 = (M.J(cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(891635675, i3, -1, "com.vk.notifications.design.compose.list.common.NotificationVisualContent (NotificationVisualContent.kt:36)");
            }
            q630.a aVar2 = q630.a.a;
            q630 E = ahn.E(txj0.d(aVar2, 1.0f), "NotificationAttachBlock");
            a.j g = androidx.compose.foundation.layout.a.g(8);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new uf1(28, cVar, izsVar);
                M.R(x);
            }
            q630Var2 = aVar2;
            lqy.b(E, null, null, g, null, null, false, null, (izs) x, M, 0, 494);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ni70(cVar, izsVar, q630Var2, i);
        }
    }

    public static final void b(NotificationImage notificationImage, NotificationImage.Shape shape, izs<? super snv, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-743085933);
        int i2 = i | (M.J(notificationImage) ? 4 : 2) | (M.o(shape.ordinal()) ? 32 : 16) | (M.y(izsVar) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-743085933, i2, -1, "com.vk.notifications.design.compose.list.common.NotificationVisualItem (NotificationVisualContent.kt:56)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            tlo0 tlo0Var = notificationImage.c;
            CharSequence a = tlo0Var != null ? tlo0Var.a(context) : null;
            lg90 l = fwu0.l(null, notificationImage.a, null, null, M, 0, 61);
            float f = 8;
            q630 d = rte0.d(txj0.s(q630.a.a, shape.getWidth(), shape.getHeight()), vog0.b(f));
            float f2 = (float) 0.5d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y18 a2 = aqw.a(f2, ylu0Var.getBackground().z);
            q630 b = r18.b(a2.a, a2.b, d, vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 E = ahn.E(hr80.m(b, ylu0Var2.c().a, androidx.compose.ui.graphics.e.a), "NotificatinAttachmentItem");
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new hc1(18, notificationImage, izsVar);
                M.R(x);
            }
            q630 g = o19.g(E, (gzs) x);
            boolean y = M.y(a);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new hs00(a, 11);
                M.R(x2);
            }
            M = M;
            r0v0.a(l, egi0.b(g, false, (izs) x2), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 8, 252);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qq0(i, 5, notificationImage, shape, izsVar);
        }
    }
}
