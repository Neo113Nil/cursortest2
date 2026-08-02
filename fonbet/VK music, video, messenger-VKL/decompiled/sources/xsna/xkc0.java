package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;

/* compiled from: PostingReducer.kt */
/* loaded from: classes4.dex */
public final class xkc0 implements izs<PostingState.Editing, wow<PostingAttachment>> {
    public static final xkc0 b = new xkc0();

    @Override // xsna.izs
    public final wow<PostingAttachment> invoke(PostingState.Editing editing) {
        return new wow<>(editing.i.p);
    }
}
