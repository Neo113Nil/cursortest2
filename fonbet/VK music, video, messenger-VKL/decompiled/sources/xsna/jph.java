package xsna;

import com.vk.dto.profile.CommunityInternalMenu$Companion$MenuItemType;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.z4h;

/* compiled from: CommunityProfileInternalMenuReducerDelegate.kt */
/* loaded from: classes5.dex */
public final class jph {
    public final cph a;

    public jph(cph cphVar) {
        this.a = cphVar;
    }

    public final CommunityProfileState a(CommunityProfileState communityProfileState, d.j jVar) {
        z4h z4hVar;
        z4h z4hVar2;
        z4h z4hVar3;
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        z4h z4hVar4 = null;
        if (jVar instanceof d.j.C1612d) {
            return b(communityProfileState, null);
        }
        if (jVar instanceof d.j.c) {
            d.j.c cVar = (d.j.c) jVar;
            if (extendedCommunityProfile == null || (z4hVar3 = extendedCommunityProfile.g2) == null) {
                return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435455);
            }
            List<z4h.a> list = z4hVar3.a;
            ArrayList arrayList = new ArrayList(c5g.u(list, 10));
            for (z4h.a aVar : list) {
                int i = aVar.a;
                if (i == cVar.b) {
                    aVar = new z4h.a(i, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, cVar.c, aVar.i);
                }
                arrayList.add(aVar);
            }
            return b(communityProfileState, z4h.a(z4hVar3, arrayList, 14));
        }
        if (!(jVar instanceof d.j.b)) {
            if (!(jVar instanceof d.j.a)) {
                throw new NoWhenBranchMatchedException();
            }
            if (extendedCommunityProfile != null && (z4hVar = extendedCommunityProfile.g2) != null) {
                z4hVar4 = z4h.a(z4hVar, null, 13);
            }
            return b(communityProfileState, z4hVar4);
        }
        d.j.b bVar = (d.j.b) jVar;
        if (extendedCommunityProfile == null || (z4hVar2 = extendedCommunityProfile.g2) == null) {
            return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435455);
        }
        List<z4h.a> list2 = z4hVar2.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list2) {
            if (((z4h.a) obj).a != bVar.b) {
                arrayList2.add(obj);
            }
        }
        int size = arrayList2.size();
        List list3 = arrayList2;
        if (size == 1) {
            CommunityInternalMenu$Companion$MenuItemType communityInternalMenu$Companion$MenuItemType = ((z4h.a) j5g.Y(arrayList2)).g;
            list3 = arrayList2;
            if (communityInternalMenu$Companion$MenuItemType == CommunityInternalMenu$Companion$MenuItemType.ADMIN_GEAR) {
                list3 = EmptyList.b;
            }
        }
        return b(communityProfileState, z4h.a(z4hVar2, list3, 14));
    }

    public final CommunityProfileState b(CommunityProfileState communityProfileState, z4h z4hVar) {
        ExtendedCommunityProfile extendedCommunityProfile = communityProfileState.b;
        if (extendedCommunityProfile == null) {
            return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, null, null, null, 0, false, null, null, null, 0, null, null, null, false, 268435455);
        }
        extendedCommunityProfile.g2 = z4hVar;
        return CommunityProfileState.a(communityProfileState, null, 0, null, null, false, false, false, null, null, null, null, this.a.a(communityProfileState, extendedCommunityProfile, new com.vk.movika.sdk.base.observable.u(17)), null, null, 0, false, null, null, null, 0, null, null, null, false, 268427263);
    }
}
