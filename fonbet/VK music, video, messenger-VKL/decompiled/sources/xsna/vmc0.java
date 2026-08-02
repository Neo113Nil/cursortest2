package xsna;

import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;

/* compiled from: PostingStateExt.kt */
/* loaded from: classes4.dex */
public final class vmc0 {
    public static final boolean a(PostingState.Editing editing) {
        PostEditableData postEditableData = editing.i;
        PostingSettings postingSettings = editing.d;
        return postingSettings.h != null ? !editing.h.Ja() && postingSettings.d() && postEditableData.b == 0 : postingSettings.g != null && postEditableData.b == 0;
    }

    public static final boolean b(PostingState.Editing editing) {
        PostEditingReason postEditingReason = editing.h;
        return (postEditingReason instanceof PostEditingReason.EditExistingPost) && !((PostEditingReason.EditExistingPost) postEditingReason).b && editing.i.o == null;
    }
}
