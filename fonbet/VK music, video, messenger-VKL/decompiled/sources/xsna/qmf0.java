package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.e;

/* compiled from: ReducerPublishDelegate.kt */
/* loaded from: classes4.dex */
public final class qmf0 {
    public static PostingState a(PostingState postingState, e.g gVar) {
        return !(postingState instanceof PostingState.Editing) ? postingState : PostingState.Editing.a((PostingState.Editing) postingState, null, null, null, null, null, null, null, null, null, gVar.b, false, null, false, null, null, null, null, null, 1046527);
    }
}
