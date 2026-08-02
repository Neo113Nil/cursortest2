package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: AlertDialog.kt */
/* loaded from: classes11.dex */
public final class rbl implements gt6 {
    public static final rbl a = new rbl();

    /* compiled from: AlertDialog.kt */
    public static final class a implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ ht6 b;

        public a(ht6 ht6Var) {
            this.b = ht6Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1163527043, intValue, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog.<anonymous> (AlertDialog.kt:165)");
                }
                String b = e7b0.b(R.string.m3c_dialog, aVar2);
                ht6 ht6Var = this.b;
                q630 u = txj0.u(ht6Var.b, es1.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, es1.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                boolean J = aVar2.J(b);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new qbl(b, 0);
                    aVar2.R(x);
                }
                q630 g = u.g(egi0.b(q630.a.a, false, (izs) x));
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, true);
                int m = n34.m(aVar2);
                sy90 D = aVar2.D();
                q630 c = qri.c(aVar2, g);
                cri.h7.getClass();
                LayoutNode.a aVar3 = cri.a.b;
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar3);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d, cri.a.f);
                k9q0.w(aVar2, D, cri.a.e);
                cri.a.b bVar = cri.a.g;
                if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                    kr.a(m, aVar2, m, bVar);
                }
                k9q0.w(aVar2, c, cri.a.d);
                if (er.f(0, aVar2, ht6Var.d)) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    @Override // xsna.gt6
    public final void a(ht6 ht6Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1565826668);
        int i2 = (M.J(ht6Var) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1565826668, i2, -1, "androidx.compose.material3.DefaultBasicAlertDialogOverride.BasicAlertDialog (AlertDialog.kt:163)");
            }
            v72.a(ht6Var.a, ht6Var.c, kai.c(1163527043, new a(ht6Var), M), M, 384, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ud6(this, ht6Var, i, 5);
        }
    }
}
