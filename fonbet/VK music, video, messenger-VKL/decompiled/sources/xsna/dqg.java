package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.profile.community.details.impl.contacts.CommunityAddContactsState;
import com.vk.profile.community.details.impl.contacts.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class dqg implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dqg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                ((izs) this.c).invoke(new a.e((CommunityAddContactsState.ContactField.ContactViewType) obj, (String) obj2, (qko0) obj3));
                break;
            case 1:
                o8d0 o8d0Var = (o8d0) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(147858841, intValue, -1, "com.vk.community.design.compose.primaryblock.PrimaryBlockGoodsShimmerContentImpl.Content.<anonymous> (PrimaryBlockGoodsShimmerContentImpl.kt:34)");
                    }
                    u890 n = s200.n(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    boolean J = aVar.J(o8d0Var);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new o440(o8d0Var, 18);
                        aVar.R(x);
                    }
                    lqy.b(null, null, n, null, null, null, false, null, (izs) x, aVar, 12583296, 379);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                com.vk.sharing.core.view.f fVar = (com.vk.sharing.core.view.f) this.c;
                ((Integer) obj2).getClass();
                ((Integer) obj3).getClass();
                fVar.c2(false);
                break;
        }
        return s3q0.a;
    }
}
