package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import java.util.List;

/* compiled from: ReducerCoauthorsDelegate.kt */
/* loaded from: classes4.dex */
public final class nmf0 {
    public static PostingState a(PostingState postingState) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268431359), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }

    public static PostingState b(PostingState postingState, gic0 gic0Var) {
        if (!(postingState instanceof PostingState.Editing)) {
            return postingState;
        }
        List<CoauthorDto> list = gic0Var.b;
        if (list.isEmpty()) {
            list = null;
        }
        PostingState.Editing editing = (PostingState.Editing) postingState;
        return PostingState.Editing.a(editing, null, null, null, null, null, PostEditableData.a(editing.i, null, null, null, null, null, null, null, null, null, null, null, list, null, null, null, null, null, null, null, null, null, false, null, 268431359), null, null, null, null, false, null, false, null, null, null, null, null, 1048447);
    }
}
