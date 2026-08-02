package xsna;

import androidx.compose.runtime.a;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.core.compose.component.cell.content.Cell$Left;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;

/* compiled from: ObtainVerificationConditionRow.kt */
/* loaded from: classes18.dex */
public final class or70 {
    public static final void a(boolean z, String str, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        long j;
        androidx.compose.runtime.a M = aVar.M(628747682);
        int i2 = i | (M.l(z) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(628747682, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationConditionRow (ObtainVerificationConditionRow.kt:21)");
            }
            long j2 = wlb0.h(M).getText().f;
            boolean p = ((i2 & 112) == 32) | M.p(j2) | ((i2 & 896) == 256);
            Object x = M.x();
            if (p || x == a.C0011a.a) {
                x = bj90.a(str, izsVar, j2);
                M.R(x);
            }
            us2 us2Var = (us2) x;
            qzu0.a.getClass();
            lg90 s = qzu0.s(M);
            Cell$Left.Main.Size size = Cell$Left.Main.Size.Small;
            if (z) {
                j = vcl0.a(M, 670494392, M).i;
                M.j();
            } else {
                j = vcl0.a(M, 670571768, M).n;
                M.j();
            }
            com.vk.core.compose.component.cell.content.i0 a = Cell$Left.a.a(com.vk.core.compose.component.cell.content.f.a(s, size, j, null, null, M, 196664, 24), null, M, 2);
            com.vk.core.compose.component.cell.content.k0 a2 = Cell$Middle.a.a(Cell$Middle.d.b.b(us2Var, null, null, null, 0, 0, null, null, null, M, 0, 6, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW), null, null, null, M, 196608, 30);
            q630.a aVar3 = q630.a.a;
            wiu0.b(aVar3, false, a, a2, null, null, null, M, 6, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s2 = aVar2.s();
        if (s2 != null) {
            s2.d = new wac(i, 3, (Object) str, (xzs) izsVar, q630Var2, z);
        }
    }
}
