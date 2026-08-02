package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import xsna.kb70;

/* compiled from: Notification.kt */
/* loaded from: classes4.dex */
public final class ma70 {
    public static final void a(kb70.d dVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        kb70.d dVar2;
        izs izsVar2;
        q630 q630Var2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-946477272);
        int i3 = (M.J(dVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-946477272, i3, -1, "com.vk.notifications.design.compose.list.common.Notification (Notification.kt:15)");
            }
            r970 r970Var = dVar.l;
            if (r970Var != null) {
                M.K(-43884494);
                i0n.a(r970Var, izsVar, M, (i3 & 112) | 384);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                androidx.compose.runtime.f s = M.s();
                if (s != null) {
                    s.d = new x85(dVar, izsVar, q630Var, i, 2);
                    return;
                }
                return;
            }
            M.K(-43884495);
            M.j();
            M.K(-43569472);
            un20.b(dVar, izsVar, q630Var, M, i3 & IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            dVar2 = dVar;
            izsVar2 = izsVar;
            q630Var2 = q630Var;
            i2 = i;
        } else {
            dVar2 = dVar;
            izsVar2 = izsVar;
            q630Var2 = q630Var;
            i2 = i;
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            int i4 = i2;
            s2.d = new y85(dVar2, izsVar2, q630Var2, i4, 3);
        }
    }
}
