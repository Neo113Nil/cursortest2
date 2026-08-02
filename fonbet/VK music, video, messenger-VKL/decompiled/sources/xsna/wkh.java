package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.profile.community.impl.ui.profile.state.Services;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import xsna.cvd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wkh implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wkh(Object obj, Object obj2, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.e = obj2;
        this.c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                xkh xkhVar = (xkh) this.d;
                Services services = (Services) this.e;
                boolean z = this.c;
                xkhVar.q(Services.i(services, null, null, null, false, false, null, null, null, null, z ? CommunityProfileContentItem.State.ERROR : services.w, z ? services.x : CommunityProfileContentItem.State.ERROR, 40959));
                break;
            case 1:
                vlq0 vlq0Var = (vlq0) this.d;
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) this.e;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = vlq0Var.j;
                if (izsVar == null) {
                    izsVar = null;
                }
                extendedUserProfile.o0 = this.c;
                izsVar.invoke(new b.y(extendedUserProfile));
                u5p0 u5p0Var = vlq0Var.i;
                if (u5p0Var == null) {
                    u5p0Var = null;
                }
                u5p0Var.invoke(new UserProfileAction.x(null, 15));
                break;
            default:
                nnq0 nnq0Var = (nnq0) this.d;
                uu50 uu50Var = (uu50) this.e;
                VKList vKList = (VKList) ((it80) obj).a;
                if (vKList == null) {
                    vKList = new VKList();
                }
                boolean z2 = this.c;
                if (z2 && vKList.isEmpty()) {
                    wmq0.B(nnq0Var, uu50Var, CommunityProfileContentItem.State.EMPTY, null, 4);
                } else {
                    ArrayList arrayList = new ArrayList();
                    cvd0.b bVar = uu50Var.j;
                    if (bVar != null) {
                        arrayList.addAll(bVar.a);
                    }
                    arrayList.addAll(vKList);
                    uu50 i = uu50.i(uu50Var, new cvd0.b(arrayList), myc0.f(vKList.j()) && !vKList.isEmpty(), vKList.j(), null, z2 ? CommunityProfileContentItem.State.LOADED : uu50Var.o, z2 ? uu50Var.q : CommunityProfileContentItem.State.LOADED, false, 1880);
                    izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar2 = nnq0Var.h;
                    (izsVar2 != null ? izsVar2 : null).invoke(new b.c(i));
                }
                break;
        }
        return s3q0.a;
    }
}
