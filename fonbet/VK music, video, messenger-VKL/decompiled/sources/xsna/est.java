package xsna;

import com.vk.search.communities.map.catalog.root.SearchCommunitiesOnMapListRootVh;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.u4a;

/* compiled from: GetHealthConnectWorkoutsCommand.kt */
/* loaded from: classes6.dex */
public final /* synthetic */ class est extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ est(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                bst bstVar = (bst) this.receiver;
                m4s.z(bstVar.e, new ast(bstVar, null));
                return s3q0.a;
            case 1:
                ((r7u) this.receiver).d();
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((mkr0) this.receiver).G());
            case 3:
                SearchCommunitiesOnMapListRootVh searchCommunitiesOnMapListRootVh = (SearchCommunitiesOnMapListRootVh) this.receiver;
                u4a u4aVar = searchCommunitiesOnMapListRootVh.m;
                u4a.a aVar = u4aVar.b;
                vd7 vd7Var = new vd7(aVar.e);
                pye0 pye0Var = searchCommunitiesOnMapListRootVh.q;
                jda K = aVar.s.K(u4aVar);
                u4a u4aVar2 = searchCommunitiesOnMapListRootVh.m;
                return new kea(pye0Var, K, u4aVar2, vd7Var, false, null, null, false, null, null, u4aVar2.b.H, null, null, false, null, 126912);
            default:
                ((com.vk.voip.ui.c) this.receiver).getClass();
                return com.vk.voip.ui.c.u.g;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public est(Object obj, int i) {
        super(0, obj, r7u.class, "deleteRestrictedItem", "deleteRestrictedItem()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, mkr0.class, "canLoadMoreMessages", "canLoadMoreMessages()Z", 0);
                break;
            case 3:
            default:
                break;
            case 4:
                super(0, obj, com.vk.voip.ui.c.class, "getOpponentIcon", "getOpponentIcon()Landroidx/core/graphics/drawable/IconCompat;", 0);
                break;
        }
    }
}
