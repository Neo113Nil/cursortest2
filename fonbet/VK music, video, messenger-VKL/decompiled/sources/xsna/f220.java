package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.community.members.impl.ui.MembersState;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class f220 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ xzs e;

    public /* synthetic */ f220(Object obj, Object obj2, xzs xzsVar, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = xzsVar;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                MembersState membersState = (MembersState) this.c;
                z37 z37Var = (z37) this.d;
                gzs gzsVar = (gzs) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1164545840, intValue, -1, "com.vk.profile.community.members.impl.ui.MembersScreen.<anonymous>.<anonymous>.<anonymous> (MembersScreen.kt:123)");
                    }
                    boolean z = membersState.d;
                    boolean J = aVar.J(z37Var);
                    Object x = aVar.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (J || x == c0012a) {
                        x = new fgm(z37Var, 25);
                        aVar.R(x);
                    }
                    xvy z2 = crx0.z(z, (gzs) x, 0, aVar, 0, 60);
                    List u0 = rl3.u0(new String[]{"banner"});
                    boolean J2 = aVar.J(z37Var);
                    Object x2 = aVar.x();
                    if (J2 || x2 == c0012a) {
                        x2 = new dkg(z37Var, 27);
                        aVar.R(x2);
                    }
                    com.vk.profile.community.members.impl.ui.d.g(z2, u0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (izs) x2, aVar, 0);
                    q630 d = txj0.d(n34.t(q630.a.a, fz5.z(null, aVar, 1), null), 1.0f);
                    boolean J3 = aVar.J(membersState) | aVar.J(z37Var) | aVar.J(gzsVar);
                    Object x3 = aVar.x();
                    if (J3 || x3 == c0012a) {
                        x3 = new m0i(membersState, z37Var, gzsVar, 2);
                        aVar.R(x3);
                    }
                    com.vk.profile.community.members.impl.ui.d.e(0, aVar, (izs) x3, z2, d);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.c;
                khg0 khg0Var = (khg0) this.d;
                izs izsVar = (izs) this.e;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(993283012, intValue2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeView.ThemedContent.<anonymous> (ReviewFriendsComposeView.kt:61)");
                    }
                    ijk.a((fm50) mtk0Var.getValue(), txj0.z(q630.a.a, null, 3), null, "StateChange", kai.c(-970618063, new tpd(1, khg0Var, izsVar), aVar2), aVar2, 27696, 4);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
