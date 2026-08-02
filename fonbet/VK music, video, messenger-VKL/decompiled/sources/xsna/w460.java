package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.e;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: NetworkReducerDelegate.kt */
/* loaded from: classes4.dex */
public final class w460 {
    public static PostingState a(PostingState postingState, e.d dVar) {
        if (postingState instanceof PostingState.Loading) {
            return PostingState.Loading.a((PostingState.Loading) postingState, null, null, null, null, null, null, dVar.b, null, null, null, null, null, 32255);
        }
        if (postingState instanceof PostingState.Editing) {
            return PostingState.Editing.a((PostingState.Editing) postingState, null, null, null, null, null, null, null, null, null, null, false, null, dVar.b, null, null, null, null, null, 1032191);
        }
        throw new NoWhenBranchMatchedException();
    }
}
