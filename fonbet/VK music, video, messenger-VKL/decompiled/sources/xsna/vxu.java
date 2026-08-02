package xsna;

import com.vk.api.generated.groups.dto.GroupsFieldsDto;
import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.dto.common.data.VKList;
import com.vk.dto.group.Group;
import com.vk.lists.c;
import com.vk.toggle.features.ComFeatures;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Collections;

/* compiled from: HeaderPostingPresenter.kt */
/* loaded from: classes4.dex */
public final class vxu implements c.l<VKList<Group>> {
    public final /* synthetic */ wxu b;

    public vxu(wxu wxuVar) {
        this.b = wxuVar;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<Group>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VKList<Group>> ui(int i, com.vk.lists.c cVar) {
        wxu wxuVar = this.b;
        com.vk.newsfeed.impl.posting.a aVar = wxuVar.d;
        int max = Math.max(0, i - 1);
        int k = cVar.k();
        GroupsFilterDto groupsFilterDto = wxuVar.e;
        aVar.getClass();
        ComFeatures comFeatures = ComFeatures.COM_MIGRATE_GROUPS_GET_EXTENDED;
        comFeatures.getClass();
        if (!com.vk.toggle.b.A.a(comFeatures)) {
            return rsg0.y0(new fo(max, k, groupsFilterDto.i(), j5g.g0(e43.l("wall", "is_nft_photo"), StringUtils.COMMA, null, null, 0, null, 62)), null, null, 3).U(new oq80(new zl20(aVar, 20), 1));
        }
        return rsg0.y0(yfb.x(xqu.h(new zqu(), null, Collections.singletonList(groupsFilterDto), Collections.singletonList(GroupsFieldsDto.WALL), Integer.valueOf(max), Integer.valueOf(k), 33)), null, null, 3).U(new v34(new bgy(new dqu(), aVar), 25));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<Group>> qVar, boolean z, com.vk.lists.c cVar) {
        qdc0 qdc0Var;
        wxu wxuVar = this.b;
        io.reactivex.rxjava3.disposables.c subscribe = qVar.subscribe(new bf2(new uxu(wxuVar, z, 0), 20), new tz(new vd1(wxuVar), 20));
        if (subscribe == null || (qdc0Var = wxuVar.b) == null) {
            return;
        }
        qdc0Var.a(subscribe);
    }
}
