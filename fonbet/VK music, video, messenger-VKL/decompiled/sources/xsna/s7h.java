package xsna;

import android.content.Context;
import androidx.compose.runtime.a;
import com.vk.profile.community.core.communityleave.LeaveAction;
import xsna.t7h;

/* compiled from: CommunityLeaveView.kt */
/* loaded from: classes5.dex */
public final class s7h extends i6v0<t7h, t6h> {
    public final xqi<t7h.a> f;

    public s7h(Context context, u6h u6hVar, xqi xqiVar) {
        super(context, u6hVar);
        this.f = xqiVar;
        vq.b(-1, -2, this.d);
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((t7h) ao50Var, izsVar, aVar, 512);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(t7h t7hVar, izs<? super t6h, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        wh50 wh50Var;
        wh50 wh50Var2;
        androidx.compose.runtime.a M = aVar.M(-1405733432);
        int i2 = (M.y(izsVar) ? 32 : 16) | i | (M.y(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 145) != 144)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1405733432, i2, -1, "com.vk.profile.community.core.communityleave.CommunityLeaveView.ThemedContent (CommunityLeaveView.kt:33)");
            }
            zak0 zak0Var = (zak0) this.f.e;
            t7h.a aVar2 = (t7h.a) zak0Var.getValue();
            boolean z = aVar2 instanceof t7h.a.C3725a;
            a.C0011a.C0012a c0012a = a.C0011a.a;
            t7h.a.b bVar = t7h.a.b.a;
            if (z) {
                M.K(2004880997);
                wh50Var = jk50.d(((t7h.a.C3725a) aVar2).a, LeaveAction.STAY_ADMIN, M, 48);
                M.j();
            } else {
                if (!epx.f(aVar2, bVar)) {
                    throw alb0.c(2004877342, M);
                }
                M.K(2021880985);
                Object x = M.x();
                if (x == c0012a) {
                    x = androidx.compose.runtime.k.b(null);
                    M.R(x);
                }
                wh50Var = (wh50) x;
                M.j();
            }
            t7h.a aVar3 = (t7h.a) zak0Var.getValue();
            if (aVar3 instanceof t7h.a.C3725a) {
                M.K(2004890870);
                wh50Var2 = jk50.d(((t7h.a.C3725a) aVar3).b, Boolean.FALSE, M, 48);
                M.j();
            } else {
                if (!epx.f(aVar3, bVar)) {
                    throw alb0.c(2004887278, M);
                }
                M.K(2022141912);
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x2);
                }
                wh50Var2 = (wh50) x2;
                M.j();
            }
            LeaveAction leaveAction = (LeaveAction) wh50Var.getValue();
            if (leaveAction != null) {
                M.K(2022251528);
                a7h.a(izsVar, leaveAction, ((Boolean) wh50Var2.getValue()).booleanValue(), M, (i2 >> 3) & 14);
            } else {
                M.K(2020444538);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new cqg(i, 1, this, t7hVar, izsVar);
        }
    }
}
