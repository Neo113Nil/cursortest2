package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vkontakte.android.R;

/* compiled from: CtaSwitchCell.kt */
/* loaded from: classes17.dex */
public final class hoa implements com.vk.core.compose.component.cell.content.o {
    public final VkTooltip$MarkerSize a;
    public final gzs<s3q0> b;
    public final gzs<s3q0> c;
    public final jai d;

    public hoa(VkTooltip$MarkerSize vkTooltip$MarkerSize, gzs gzsVar, gzs gzsVar2, jai jaiVar) {
        this.a = vkTooltip$MarkerSize;
        this.b = gzsVar;
        this.c = gzsVar2;
        this.d = jaiVar;
    }

    @Override // com.vk.core.compose.component.cell.content.o
    public final void a(final spg0 spg0Var, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1598751773);
        if ((i & 48) == 0) {
            i2 = (M.J(q630Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(this) ? 256 : 128;
        }
        int i3 = i2;
        if (M.t(i3 & 1, (i3 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1598751773, i3, -1, "com.vk.clips.upload.vk.ui.impl.fragment.view.custom.cta.CellRightWithOnboardingTooltip.Content (CtaSwitchCell.kt:102)");
            }
            int i4 = i3 & 896;
            boolean z = i4 == 256;
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (z || x == obj) {
                x = new jm0(this, 6);
                M.R(x);
            }
            izs izsVar = (izs) x;
            boolean z2 = i4 == 256;
            Object x2 = M.x();
            if (z2 || x2 == obj) {
                x2 = new sa(this, 18);
                M.R(x2);
            }
            buv0 z3 = rdi.z(true, izsVar, (izs) x2, M, 0, 0);
            String N = d370.N(R.string.clips_publish_open_channel_tip, 0, M);
            VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.BottomLeft;
            boolean y = (i4 == 256) | M.y(z3);
            Object x3 = M.x();
            if (y || x3 == obj) {
                x3 = new u14(2, this, z3);
                M.R(x3);
            }
            gzs gzsVar = (gzs) x3;
            boolean y2 = M.y(z3) | (i4 == 256);
            Object x4 = M.x();
            if (y2 || x4 == obj) {
                x4 = new com.vk.movika.sdk.base.logic.processor.actions.e(4, this, z3);
                M.R(x4);
            }
            aVar2 = M;
            o9v0.a(N, z3, q630Var, null, this.a, null, vkTooltip$BalloonPosition, null, gzsVar, (gzs) x4, null, null, null, false, null, true, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, this.d, aVar2, ((i3 << 3) & 896) | 1572864, 196608, 490664);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.goa
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    int I = ne7.I(i | 1);
                    hoa.this.a(spg0Var, q630Var, (androidx.compose.runtime.a) obj2, I);
                    return s3q0.a;
                }
            };
        }
    }
}
