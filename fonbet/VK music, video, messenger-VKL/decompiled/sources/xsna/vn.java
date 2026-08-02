package xsna;

import com.vk.feed.blacklist.impl.presentation.blacklist.BlacklistFragment;
import com.vk.feed.blacklist.impl.presentation.blacklist.a;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class vn implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ vn(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        boolean z = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) obj3;
                yn ynVar = (yn) obj2;
                u06 u06Var = (u06) obj;
                cVar.q(u06Var.b);
                cVar.r(u06Var.b < u06Var.a);
                v34 v34Var = ynVar.c;
                a.C1032a c1032a = new a.C1032a(u06Var, z);
                BlacklistFragment blacklistFragment = (BlacklistFragment) v34Var.c;
                int i2 = BlacklistFragment.V;
                blacklistFragment.getFeature().C(c1032a);
                break;
            default:
                uu50 uu50Var = (uu50) obj2;
                ((tjh) obj3).q(z ? uu50.i(uu50Var, null, false, null, null, CommunityProfileContentItem.State.ERROR, null, false, 2015) : uu50.i(uu50Var, null, false, null, null, null, CommunityProfileContentItem.State.ERROR, false, 1919));
                break;
        }
        return s3q0.a;
    }
}
