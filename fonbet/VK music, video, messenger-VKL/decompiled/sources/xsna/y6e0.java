package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.q630;

/* compiled from: PropertiesContent.kt */
/* loaded from: classes18.dex */
public final class y6e0 {
    public final wh50 a;

    public y6e0(List list) {
        this.a = androidx.compose.runtime.k.b(new wow(list));
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-383169399);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-383169399, i2, -1, "com.vk.ecomm.design.compose.tile.impl.description.PropertiesContent.Content (PropertiesContent.kt:24)");
            }
            int i3 = (i2 >> 3) & 14;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(941292437, i3, -1, "com.vk.ecomm.design.compose.tile.impl.description.PropertiesContent.buildProperties (PropertiesContent.kt:39)");
            }
            StringBuilder sb = new StringBuilder();
            List<T> list = ((wow) ((zak0) this.a).getValue()).b;
            ArrayList arrayList = new ArrayList(c5g.u(new wow(list), 10));
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    e43.t();
                    throw null;
                }
                String str = (String) obj;
                if (i4 > 0) {
                    sb.append(" · ");
                }
                sb.append(str);
                arrayList.add(sb);
                i4 = i5;
            }
            String sb2 = sb.toString();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
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
            long j = ylu0Var.getText().s;
            q630.a aVar3 = q630.a.a;
            q630Var2 = aVar3;
            aVar2 = M;
            yqv0.c(sb2, s200.H(txj0.j(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), j, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, 100663296, 48, 5880);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new r21(this, q630Var2, i, 8);
        }
    }
}
