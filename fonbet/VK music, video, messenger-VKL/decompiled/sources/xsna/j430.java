package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.e3m;

/* compiled from: ModerationBlockedItemView.kt */
/* loaded from: classes18.dex */
public final class j430 {
    public static final void a(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        String str2;
        androidx.compose.runtime.a M = aVar.M(1791561743);
        if ((i & 6) == 0) {
            i2 = (M.J(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1791561743, i2, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.ModerationBlockedItemImage (ModerationBlockedItemView.kt:198)");
            }
            Drawable c = c(R.drawable.ic_market_outline_56_placeholder_rounded_8dp, wlb0.h(M).getIcon().l, M);
            Drawable c2 = c(R.drawable.vk_icon_error_outline_56, wlb0.h(M).getIcon().a, M);
            float f = 72;
            float f2 = 16;
            q630 a = r18.a((float) 0.5d, wlb0.h(M).getImage().a, rte0.d(txj0.h(txj0.v(q630Var, f), f), vog0.b(f2)), vog0.b(f2));
            boolean y = M.y(c) | M.y(c2);
            Object x = M.x();
            if (y || x == a.C0011a.a) {
                x = new n9(15, c, c2);
                M.R(x);
            }
            str2 = str;
            fwu0.c(a, null, str2, null, null, (izs) x, null, xhi.a, M, ((i2 << 6) & 896) | 100663296, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            str2 = str;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y70(str2, q630Var, i, 2);
        }
    }

    public static final void b(final us2 us2Var, final int i, final q630 q630Var, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        androidx.compose.runtime.a M = aVar.M(-1855987868);
        if ((i2 & 6) == 0) {
            i3 = (M.J(us2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= M.o(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1855987868, i3, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.ModerationLinkedText (ModerationBlockedItemView.kt:248)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getText().r;
            int i4 = i3 & 14;
            int i5 = i3 >> 3;
            yqv0.d(us2Var, q630Var, j, 3, null, 0, false, i, null, null, frv0Var, M, i4 | (i5 & 112), i5 & 14, 7096);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.i430
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(i2 | 1);
                    j430.b(us2.this, i, q630Var, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    public static final Drawable c(int i, long j, androidx.compose.runtime.a aVar) {
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.f(-802304838, 0, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.blocked.getPlaceHolder (ModerationBlockedItemView.kt:235)");
        }
        Context context = (Context) aVar.r(AndroidCompositionLocals_androidKt.b);
        e3m.a aVar2 = e3m.a;
        Drawable a = m33.a(i, context);
        if (a != null) {
            a.setTint(f870.H(j));
        }
        if (androidx.compose.runtime.b.d()) {
            androidx.compose.runtime.b.e();
        }
        return a;
    }
}
