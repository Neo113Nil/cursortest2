package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingTextRestriction;

/* compiled from: PostTextRestrictionDelegate.kt */
/* loaded from: classes4.dex */
public final class h8c0 {
    public static PostingState a(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        PostEditableData postEditableData = editing.i;
        int length = postEditableData.c.length();
        int i = editing.d.l;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(postEditableData, null, length + 50 >= i ? length > i ? new PostingTextRestriction.Visible.Restricted(length, i) : new PostingTextRestriction.Visible.NotRestricted(length, i) : PostingTextRestriction.Invisible.b, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435451), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }
}
