package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import xsna.tra0;

/* compiled from: VkProfileFriendsAndFollowersInfo.kt */
/* loaded from: classes5.dex */
public final class udv0 implements cp10 {
    public static final udv0 a = new udv0();

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, final long j) {
        zo10 zo10Var = list.get(0);
        zo10 zo10Var2 = list.get(1);
        int l0 = zo10Var.l0(o6j.h(j));
        final int l02 = zo10Var2.l0(o6j.h(j));
        final tra0 N = zo10Var.N(j);
        final tra0 N2 = l0 + l02 <= o6j.i(j) ? zo10Var2.N(j) : null;
        final int max = Math.max(N.c, N2 != null ? N2.c : 0);
        return ep10Var.Q(o6j.i(j), max, jgp.b, new izs() { // from class: xsna.tdv0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tra0.a aVar = (tra0.a) obj;
                tra0 tra0Var = tra0.this;
                int i = tra0Var.c;
                int i2 = max;
                aVar.q(tra0Var, 0, (i2 - i) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                tra0 tra0Var2 = N2;
                if (tra0Var2 != null) {
                    aVar.q(tra0Var2, o6j.i(j) - l02, (i2 - tra0Var2.c) / 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                return s3q0.a;
            }
        });
    }
}
