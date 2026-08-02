package xsna;

import com.vk.api.generated.groups.dto.GroupsGetChatsResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.lists.c;
import com.vk.profile.community.chats.impl.presentation.CommunityChatsFragment;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: CommunityChatsContract.kt */
/* loaded from: classes5.dex */
public final class dvg implements hvg, c.l<GroupsGetChatsResponseDto> {
    public final CommunityChatsFragment b;
    public final UserId c;

    public dvg(CommunityChatsFragment communityChatsFragment, UserId userId) {
        this.b = communityChatsFragment;
        this.c = userId;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    @Override // xsna.hvg
    public final void h5() {
        this.b.jo();
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<GroupsGetChatsResponseDto> hj(com.vk.lists.c cVar, boolean z) {
        tfx tfxVar = new tfx("groups.getChats", new xq(18), new yq(18));
        tfx.n(tfxVar, "group_id", this.c, 1L, 0L, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, 0, 0, 0, 8);
        tfx.l(tfxVar, "count", 15, 0, 0, 8);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<GroupsGetChatsResponseDto> ui(int i, com.vk.lists.c cVar) {
        tfx tfxVar = new tfx("groups.getChats", new xq(18), new yq(18));
        tfx.n(tfxVar, "group_id", this.c, 1L, 0L, 8);
        tfx.l(tfxVar, SignalingProtocol.KEY_OFFSET, i, 0, 0, 8);
        tfx.l(tfxVar, "count", 15, 0, 0, 8);
        return rsg0.y0(yfb.x(tfxVar), null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<GroupsGetChatsResponseDto> qVar, boolean z, com.vk.lists.c cVar) {
        this.b.ko(qVar.subscribe(new vl0(new cvg(cVar, this, z, 0), 14), new mp0(new wl0(this, 24), 13)));
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
