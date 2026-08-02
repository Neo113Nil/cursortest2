package xsna;

import android.os.Bundle;
import com.vk.api.likes.LikesGetList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.user.ReactionUserProfile;

/* compiled from: ReactionsTabPresenter.kt */
/* loaded from: classes5.dex */
public final class s6f0 extends bm6 {
    public ReactionMeta u;

    @Override // xsna.bm6, xsna.u6f0
    public final void F(Bundle bundle) {
        super.F(bundle);
        if (bundle == null) {
            return;
        }
        this.u = bundle.containsKey("reaction") ? (ReactionMeta) bundle.getParcelable("reaction") : null;
    }

    @Override // xsna.bm6, xsna.u6f0
    public final void F0(Integer num, Integer num2) {
        if (num2 != null) {
            return;
        }
        ReactionMeta reactionMeta = this.u;
        if (epx.f(num, reactionMeta != null ? Integer.valueOf(reactionMeta.getId()) : null)) {
            this.c.z(new pt(8));
        }
    }

    @Override // xsna.bm6, com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<VKList<ReactionUserProfile>> ui(int i, com.vk.lists.c cVar) {
        return rsg0.T(new LikesGetList(this.f, this.l, this.h, this.i, i, cVar.k(), this.m, this.g, this.u, 256));
    }
}
