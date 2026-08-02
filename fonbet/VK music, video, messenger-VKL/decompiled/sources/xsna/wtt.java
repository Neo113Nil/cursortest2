package xsna;

import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ReactionUserProfile;
import com.vk.lists.c;
import java.util.Collections;

/* compiled from: GetReactionsPagedDataProvider.kt */
/* loaded from: classes4.dex */
public final class wtt implements c.l<VKList<ReactionUserProfile>> {
    public final p00 b;
    public final p1 c;
    public final c7z d;
    public final io.reactivex.rxjava3.disposables.b e;

    public wtt(p00 p00Var, p1 p1Var, c7z c7zVar, io.reactivex.rxjava3.disposables.b bVar) {
        this.b = p00Var;
        this.c = p1Var;
        this.d = c7zVar;
        this.e = bVar;
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<VKList<ReactionUserProfile>> hj(com.vk.lists.c cVar, boolean z) {
        return ui(0, cVar);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VKList<ReactionUserProfile>> ui(int i, com.vk.lists.c cVar) {
        int k = cVar.k();
        c7z c7zVar = this.d;
        UserId userId = c7zVar.a;
        long j = c7zVar.b;
        LikesGetList.Type type = c7zVar.c;
        LikesGetList.Type type2 = LikesGetList.Type.POST;
        LikesGetList.LikesOrder likesOrder = LikesGetList.LikesOrder.ALL_USERS_FRIENDS_FIRST;
        String i2 = c7zVar.d.i();
        ReactionMeta reactionMeta = c7zVar.e;
        return rsg0.T(new LikesGetList(type, type2, userId, j, i, k, likesOrder, i2, reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null, Collections.singletonList("is_friend"), reactionMeta));
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<VKList<ReactionUserProfile>> qVar, boolean z, com.vk.lists.c cVar) {
        this.e.b(qVar.subscribe(new bn3(new vtt(cVar, this, z || cVar.i() == 0, 0), 27), new tts(this.c, 1)));
    }
}
