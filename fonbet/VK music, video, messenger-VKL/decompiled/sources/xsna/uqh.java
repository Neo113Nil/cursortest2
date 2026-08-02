package xsna;

import com.vk.music.screens.about.entity.CommunityProfileLinksState;
import com.vk.profile.community.details.api.di.links.data.LinkItemModel;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: CommunityProfileLinksMapper.kt */
/* loaded from: classes3.dex */
public final class uqh implements izs<CommunityProfileLinksState, wqh> {
    @Override // xsna.izs
    public final wqh invoke(CommunityProfileLinksState communityProfileLinksState) {
        List<LinkItemModel> list = communityProfileLinksState.b;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (LinkItemModel linkItemModel : list) {
            UUID uuid = linkItemModel.b;
            arrayList.add(new j9z(linkItemModel.d, linkItemModel.e, linkItemModel.f, uuid));
        }
        return new wqh(arrayList);
    }
}
