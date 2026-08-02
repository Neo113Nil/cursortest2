package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;

/* compiled from: PostingStep1View.kt */
/* loaded from: classes4.dex */
public final class mnc0 implements l420 {
    public final /* synthetic */ enc0 b;

    public mnc0(enc0 enc0Var) {
        this.b = enc0Var;
    }

    @Override // xsna.l420
    public final void N3(UserId userId) {
        if (fkq0.c(userId)) {
            this.b.U.invoke(new PostingAction.Mentions.LoadMentionById(userId));
        }
    }

    @Override // xsna.l420
    public final void Y0() {
        this.b.U.invoke(PostingAction.Mentions.CloseMentionBottomSheet.b);
    }

    @Override // xsna.l420
    public final void x0(String str) {
        this.b.U.invoke(new PostingAction.Mentions.LoadMentions(str));
    }
}
