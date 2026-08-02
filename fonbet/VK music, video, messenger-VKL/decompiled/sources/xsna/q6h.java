package xsna;

import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.data.VKList;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vkontakte.android.api.ExtendedUserProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class q6h implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ q6h(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        RecyclerView recyclerView;
        switch (this.b) {
            case 0:
                ((s6h) this.d).f((oap) this.e, this.c, (m0y) obj);
                break;
            case 1:
                ke4 ke4Var = (ke4) this.d;
                ixa0 ixa0Var = (ixa0) this.e;
                String str = (String) obj;
                if ((str != null && str.length() != 0) || this.c) {
                    if (str == null) {
                        str = "";
                    }
                    ke4Var.invoke(str, ixa0Var.a.b);
                }
                break;
            case 2:
                RestoreSearchFragment restoreSearchFragment = (RestoreSearchFragment) this.d;
                com.vk.lists.c cVar = (com.vk.lists.c) this.e;
                VKList vKList = (VKList) obj;
                if (this.c) {
                    RecyclerPaginatedView recyclerPaginatedView = restoreSearchFragment.V;
                    if (recyclerPaginatedView != null && (recyclerView = recyclerPaginatedView.getRecyclerView()) != null) {
                        recyclerView.scrollToPosition(0);
                    }
                    RestoreSearchFragment.b bVar = restoreSearchFragment.a0;
                    if (bVar == null) {
                        bVar = null;
                    }
                    bVar.clear();
                }
                RestoreSearchFragment.b bVar2 = restoreSearchFragment.a0;
                (bVar2 != null ? bVar2 : null).n0(vKList);
                cVar.l(vKList.i());
                break;
            default:
                vlq0 vlq0Var = (vlq0) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.e;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = vlq0Var.j;
                if (izsVar == null) {
                    izsVar = null;
                }
                extendedUserProfile.i0 = this.c;
                izsVar.invoke(new b.y(extendedUserProfile));
                u5p0 u5p0Var = vlq0Var.i;
                if (u5p0Var == null) {
                    u5p0Var = null;
                }
                u5p0Var.invoke(new UserProfileAction.x(null, 15));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ q6h(boolean z, Object obj, Object obj2, int i) {
        this.b = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
    }
}
