package xsna;

import com.vk.dto.common.AttachmentWithMedia;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.PostingAttachment;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PostingAttachmentUtils.kt */
/* loaded from: classes4.dex */
public final class icc0 {
    public static boolean a(PostingState.Editing editing, AttachmentWithMedia attachmentWithMedia) {
        boolean z;
        List<PostingAttachment> list = editing.i.p;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (epx.f(((PostingAttachment) it.next()).nb(), attachmentWithMedia)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return (b(editing) || z) ? false : true;
    }

    public static boolean b(PostingState.Editing editing) {
        List<PostingAttachment> list = editing.i.p;
        int size = editing.f.e.size();
        PostingSettings postingSettings = editing.d;
        return size >= postingSettings.c || list.size() >= postingSettings.c;
    }
}
