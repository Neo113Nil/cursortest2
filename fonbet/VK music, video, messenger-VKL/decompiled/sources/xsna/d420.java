package xsna;

import com.vk.mentions.MentionProfileVO;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.mentions.PostingMentionLoadingState;
import com.vk.newsfeed.posting.mentions.PostingMentionState;
import java.util.List;

/* compiled from: MentionReducerDelegate.kt */
/* loaded from: classes4.dex */
public final class d420 {
    public static PostingState a(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, PostingMentionState.a(editing.k, PostingMentionLoadingState.ERROR), null, null, false, null, false, null, null, null, null, null, 1048063);
    }

    public static PostingState b(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, PostingMentionState.a(editing.k, PostingMentionLoadingState.EMPTY), null, null, false, null, false, null, null, null, null, null, 1048063);
    }

    public static PostingState c(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, PostingMentionState.a(editing.k, PostingMentionLoadingState.LOADING), null, null, false, null, false, null, null, null, null, null, 1048063);
    }

    public static PostingState d(PostingState postingState, xjc0 xjc0Var, boolean z) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostingMentionState postingMentionState = editing.k;
        PostingMentionLoadingState postingMentionLoadingState = z ? PostingMentionLoadingState.LOADED_BY_QUERY : PostingMentionLoadingState.LOADED_BY_ID;
        List<MentionProfileVO> list = xjc0Var.b;
        postingMentionState.getClass();
        return PostingState.Editing.a(editing, null, null, null, null, null, null, null, new PostingMentionState(postingMentionLoadingState, list), null, null, false, null, false, null, null, null, null, null, 1048063);
    }
}
