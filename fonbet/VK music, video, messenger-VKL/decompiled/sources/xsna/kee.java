package xsna;

import com.vk.api.generated.groups.dto.GroupsFilterDto;
import com.vk.api.generated.likes.dto.LikesTypeDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetOwnerVideosPlaylistDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.id.UserId;
import java.util.Collections;
import java.util.List;
import xsna.lgj0;
import xsna.r1r0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kee implements io.reactivex.rxjava3.functions.n {
    public final /* synthetic */ lee b;

    @Override // io.reactivex.rxjava3.functions.n
    public final Object get() {
        dz2 dz2Var;
        dz2 dz2Var2;
        dz2 dz2Var3;
        lee leeVar = this.b;
        if (leeVar.f.d0()) {
            return rsg0.w0(new mee(leeVar.a, leeVar.b, leeVar.c, leeVar.d, leeVar.e));
        }
        UserId userId = leeVar.a;
        PaginationKey paginationKey = leeVar.b;
        int i = leeVar.c;
        boolean z = leeVar.d;
        boolean z2 = leeVar.e;
        boolean b = o25.a().b();
        ngj0 ngj0Var = new ngj0();
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        dz2 x = yfb.x(lgj0.a.g(ngj0Var, userId, Integer.valueOf(i), next != null ? next.b : null, aoe.c, Boolean.TRUE, ShortVideoGetOwnerVideosPlaylistDto.PUBLISHED, null, null, null, null, 65472));
        if (!b) {
            x.c = true;
        }
        if (b) {
            List<UsersFieldsDto> list = aoe.a;
            if ((59 & 4) != 0) {
                list = null;
            }
            dz2Var = yfb.x(r1r0.a.a(null, null, list, null, null));
        } else {
            dz2Var = null;
        }
        dz2 x2 = b ? yfb.x(xqu.h(new zqu(), null, e43.l(GroupsFilterDto.EDITOR, GroupsFilterDto.CAN_POST_CLIPS), aoe.b, null, 999, 41)) : null;
        if (b && z2) {
            dz2Var2 = x;
            dz2Var3 = yfb.x(lgj0.a.g(new ngj0(), userId, null, null, null, Boolean.FALSE, ShortVideoGetOwnerVideosPlaylistDto.SCHEDULED, null, null, null, null, 65486));
        } else {
            dz2Var2 = x;
            dz2Var3 = null;
        }
        return rsg0.w0(new zne(dz2Var2, dz2Var, x2, dz2Var3, (b && z) ? yfb.x(cz60.g(new dz60(), null, aoe.d, Collections.singletonList(LikesTypeDto.CLIP), 37)) : null, userId)).l(new g7(new e89(leeVar.g, 1), 12));
    }
}
