package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.Calendar;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.s2x;
import xsna.ty6;

/* compiled from: PollEditorDatePicker.kt */
/* loaded from: classes4.dex */
public final class fob0 {
    public static final void a(izs izsVar, yrb0 yrb0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(496062863);
        int i2 = (M.y(izsVar) ? 4 : 2) | i | (M.J(yrb0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(496062863, i2, -1, "com.vk.newsfeed.posting.poll_editor.presentation.base.view.components.PollDatePicker (PollEditorDatePicker.kt:23)");
            }
            q630.a aVar2 = q630.a.a;
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar2);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(yrb0Var.f);
            String j = pvo0.j(calendar.getTimeInMillis(), false, true);
            int i3 = i2 & 14;
            boolean y = (i3 == 4) | M.y(calendar);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (y || x == obj) {
                x = new xk(26, izsVar, calendar);
                M.R(x);
            }
            b7i0 a2 = s2x.b.a.a(j, (gzs) x, null, 0L, null, null, M, 805306368, IronSourceError.ERROR_CODE_INIT_FAILED);
            tpg0 tpg0Var = tpg0.a;
            q630 b = tpg0Var.b(6.0f, aVar2, true);
            ty6.b bVar = dt1.a.l;
            z0v0.a(a2, tpg0Var.a(b, bVar), null, false, M, 0, 12);
            f9t.e(txj0.v(aVar2, 12), M, 6);
            String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2));
            boolean y2 = M.y(calendar) | (i3 == 4);
            Object x2 = M.x();
            if (y2 || x2 == obj) {
                x2 = new kg(21, izsVar, calendar);
                M.R(x2);
            }
            z0v0.a(s2x.b.a.a(format, (gzs) x2, null, 0L, null, null, M, 805306368, IronSourceError.ERROR_CODE_INIT_FAILED), tpg0Var.a(tpg0Var.b(4.0f, aVar2, true), bVar), null, false, M, 0, 12);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new xmd(izsVar, yrb0Var, q630Var, i);
        }
    }
}
