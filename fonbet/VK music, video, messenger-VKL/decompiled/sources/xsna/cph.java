package xsna;

import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.k9h;

/* compiled from: CommunityProfileHeaderItemsProjector.kt */
/* loaded from: classes5.dex */
public final class cph {
    public final lrh a;
    public final boolean b;

    public cph(lrh lrhVar, boolean z) {
        this.a = lrhVar;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0025, code lost:
    
        if (((com.vk.profile.community.impl.ui.profile.state.CommunityProfileState.b.C1623b) r4).a != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<r4h> a(CommunityProfileState communityProfileState, ExtendedCommunityProfile extendedCommunityProfile, izs<? super kn00, kn00> izsVar) {
        k9h cVar;
        k9h k9hVar;
        CommunityProfileState.a aVar = communityProfileState.l;
        r8h r8hVar = aVar.a;
        boolean z = aVar.b;
        xrh xrhVar = communityProfileState.i;
        CommunityProfileState.b bVar = communityProfileState.p;
        if (bVar.equals(CommunityProfileState.b.a.a)) {
            k9hVar = k9h.a.a;
        } else if (bVar instanceof CommunityProfileState.b.C1623b) {
            cVar = k9h.b.a;
        } else if (bVar instanceof CommunityProfileState.b.d) {
            cVar = new k9h.c(((CommunityProfileState.b.d) bVar).a);
            k9hVar = cVar;
        } else {
            if (!bVar.equals(CommunityProfileState.b.c.a)) {
                throw new NoWhenBranchMatchedException();
            }
            k9hVar = null;
        }
        int i = communityProfileState.q;
        List<String> list = communityProfileState.v;
        ed0 ed0Var = communityProfileState.s;
        kdh kdhVar = communityProfileState.x;
        spg spgVar = communityProfileState.y;
        boolean z2 = communityProfileState.z;
        if (!z) {
            r8hVar = null;
        }
        boolean z3 = this.b;
        List<String> list2 = z3 ? list : null;
        if (list2 == null) {
            list2 = EmptyList.b;
        }
        return this.a.h(izsVar.invoke(new kn00(extendedCommunityProfile, r8hVar, xrhVar, k9hVar, i, z3, list2, ed0Var, kdhVar, spgVar, z2)));
    }
}
