package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.cell.content.SexyCell$Size;
import com.vk.core.compose.component.cell.content.a1;
import com.vk.profile.design.compose.header.AuthorHeaderConfig;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.q630;

/* compiled from: AdditionalInfoSlotImpl.kt */
/* loaded from: classes5.dex */
public final class dq0 implements l95 {
    public final wh50 a;

    public dq0(AuthorHeaderConfig.Info.InfoSlotData.c cVar) {
        this.a = androidx.compose.runtime.k.b(cVar);
    }

    @Override // xsna.l95
    public final void a(int i, androidx.compose.runtime.a aVar) {
        int i2;
        Pair pair;
        androidx.compose.runtime.a M = aVar.M(-1002830544);
        if ((i & 384) == 0) {
            i2 = (M.J(this) ? 256 : 128) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 129) != 128)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1002830544, i2, -1, "com.vk.profile.design.compose.header.info.AdditionalInfoSlotImpl.Content (AdditionalInfoSlotImpl.kt:25)");
            }
            izs izsVar = (izs) M.r(h85.a);
            AuthorHeaderConfig.Info.InfoSlotData.c cVar = (AuthorHeaderConfig.Info.InfoSlotData.c) ((zak0) this.a).getValue();
            if (cVar instanceof AuthorHeaderConfig.Info.InfoSlotData.c.a) {
                M.K(-1647469588);
                ((AuthorHeaderConfig.Info.InfoSlotData.c.a) cVar).getClass();
                pair = new Pair(null, fwu0.l(null, null, null, null, M, 0, 61));
                M.j();
            } else {
                if (!(cVar instanceof AuthorHeaderConfig.Info.InfoSlotData.c.b)) {
                    throw alb0.c(-1647473186, M);
                }
                M.K(-1647465043);
                ((AuthorHeaderConfig.Info.InfoSlotData.c.b) cVar).getClass();
                qzu0.a.getClass();
                pair = new Pair(null, qzu0.c1(M));
                M.j();
            }
            String str = (String) pair.d();
            lg90 lg90Var = (lg90) pair.g();
            SexyCell$Size sexyCell$Size = SexyCell$Size.Small;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            com.vk.core.compose.component.cell.content.x a = f4j0.a(lg90Var, 20, ylu0Var.getIcon().j, M, 196664, 24);
            com.vk.core.compose.component.cell.content.b1 a2 = a1.b.a(a1.g.b.a(str, null, null, 0, M, 12582912, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, null, null, null, null, null, M, 2046);
            boolean J = M.J(izsVar) | ((i2 & 896) == 256);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new uk(1, izsVar, this);
                M.R(x);
            }
            mjv0.a(q630.a.a, a2, a, null, sexyCell$Size, null, false, (gzs) x, null, M, 24582, 360);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cq0(this, i);
        }
    }
}
