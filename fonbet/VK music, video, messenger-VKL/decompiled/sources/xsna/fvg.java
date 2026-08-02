package xsna;

import com.vk.api.generated.groups.dto.GroupsContentTabsDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsContentDto;
import com.vk.api.generated.groups.dto.GroupsGetContentForTabsResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import java.util.Collections;

/* compiled from: CommunityChatsContract.kt */
/* loaded from: classes5.dex */
public final class fvg implements hvg, c.m<GroupsGetContentForTabsResponseDto> {
    public final CommunityChatsFragment b;
    public final UserId c;

    public fvg(CommunityChatsFragment communityChatsFragment, UserId userId) {
        this.b = communityChatsFragment;
        this.c = userId;
    }

    @Override // com.vk.lists.c.m
    public final io.reactivex.rxjava3.core.q<GroupsGetContentForTabsResponseDto> O9(String str, com.vk.lists.c cVar) {
        return b(str);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final io.reactivex.rxjava3.internal.operators.observable.m1 b(String str) {
        zqu zquVar = new zqu();
        GroupsGetContentForTabsContentDto groupsGetContentForTabsContentDto = GroupsGetContentForTabsContentDto.CHATS;
        return rsg0.y0(yfb.x(xqu.i(zquVar, this.c, Collections.singletonList(GroupsContentTabsDto.CHATS), null, str, groupsGetContentForTabsContentDto, 15, 60)), null, null, 3);
    }

    @Override // xsna.hvg
    public final void h5() {
        this.b.jo();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<GroupsGetContentForTabsResponseDto> hj(com.vk.lists.c cVar, boolean z) {
        return b(null);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<GroupsGetContentForTabsResponseDto> qVar, boolean z, com.vk.lists.c cVar) {
        this.b.ko(qVar.subscribe(new ga(new evg(cVar, this, z, 0), 19), new ia(new ha(this, 21), 17)));
    }

    @Override // xsna.gm6
    public final void d() {
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
