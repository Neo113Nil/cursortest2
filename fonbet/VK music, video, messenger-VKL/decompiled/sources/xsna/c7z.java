package xsna;

import com.vk.api.generated.likes.dto.LikesGetListFilterDto;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;

/* compiled from: LikesGetListUseCase.kt */
/* loaded from: classes4.dex */
public final class c7z {
    public final UserId a;
    public final long b;
    public final LikesGetList.Type c;
    public final LikesGetListFilterDto d;
    public final ReactionMeta e;

    public c7z(UserId userId, long j, LikesGetList.Type type, LikesGetListFilterDto likesGetListFilterDto, ReactionMeta reactionMeta) {
        this.a = userId;
        this.b = j;
        this.c = type;
        this.d = likesGetListFilterDto;
        this.e = reactionMeta;
    }
}
