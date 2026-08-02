package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.Peer;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.phw;
import xsna.wkj;

/* compiled from: VkImAvatar.kt */
/* loaded from: classes14.dex */
public final class j0v0 {

    /* compiled from: VkImAvatar.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CHAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(final yr5 yr5Var, final kpv kpvVar, final q630 q630Var, final k18 k18Var, float f, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        final float f2;
        final float f3;
        Drawable drawable;
        boolean z;
        com.vk.im.ui.views.avatars.a aVar3;
        androidx.compose.runtime.a M = aVar.M(1763235211);
        if ((i & 6) == 0) {
            i2 = (M.J(yr5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(kpvVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(k18Var) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (M.t(i3 & 1, (i3 & 9363) != 9362)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                f3 = 72;
            } else {
                M.h();
                f3 = f;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1763235211, i3, -1, "com.vk.antispam.view.ImAvatar (VkImAvatar.kt:31)");
            }
            int i4 = i3 & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-762815571, i4, -1, "com.vk.antispam.view.getPlaceholderDrawable (VkImAvatar.kt:52)");
            }
            Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new com.vk.im.ui.views.avatars.b(context, true);
                M.R(x);
            }
            com.vk.im.ui.views.avatars.b bVar = (com.vk.im.ui.views.avatars.b) x;
            Peer peer = yr5Var.d;
            String str = yr5Var.a;
            if (a.$EnumSwitchMapping$0[peer.c.ordinal()] == 1) {
                boolean isEmpty = yr5Var.b.isEmpty();
                Integer num = yr5Var.e;
                long j = peer.b;
                if (bVar.b) {
                    z = isEmpty;
                    aVar3 = (com.vk.im.ui.views.avatars.a) bVar.g.getValue();
                } else {
                    z = isEmpty;
                    aVar3 = new com.vk.im.ui.views.avatars.a(bVar.a, null, 6);
                }
                if (z) {
                    aVar3.b(j, str, num);
                    drawable = aVar3;
                } else {
                    drawable = bVar.f();
                }
            } else {
                drawable = bVar.e(str, peer.c);
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 q = txj0.q(q630Var, f3);
            List list = yr5Var.b;
            EmptyList emptyList = EmptyList.b;
            boolean y = M.y(drawable);
            Object x2 = M.x();
            if (y || x2 == c0012a) {
                x2 = new z7t0(drawable, 3);
                M.R(x2);
            }
            float f4 = f3;
            aVar2 = M;
            fwu0.a(q, emptyList, list, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, (izs) x2, null, kai.c(181852017, new a0t() { // from class: xsna.h0v0
                @Override // xsna.a0t
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    lg90 lg90Var = (lg90) obj3;
                    androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    if ((intValue & 384) == 0) {
                        intValue |= (intValue & 512) == 0 ? aVar4.J(lg90Var) : aVar4.y(lg90Var) ? 256 : 128;
                    }
                    if (aVar4.t(intValue & 1, (intValue & 1153) != 1152)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(181852017, intValue, -1, "com.vk.antispam.view.ImAvatar.<anonymous> (VkImAvatar.kt:42)");
                        }
                        ldu0.b(phw.a.a(lg90Var, null, wkj.a.a, null, null, aVar4, 197000 | ((intValue >> 6) & 14), 26), f3, null, kpvVar, k18Var, false, null, null, null, aVar4, 0, 484);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar4.h();
                    }
                    return s3q0.a;
                }
            }, M), aVar2, 48, 760);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f2 = f4;
        } else {
            aVar2 = M;
            aVar2.h();
            f2 = f;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.i0v0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    j0v0.a(yr5.this, kpvVar, q630Var, k18Var, f2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
