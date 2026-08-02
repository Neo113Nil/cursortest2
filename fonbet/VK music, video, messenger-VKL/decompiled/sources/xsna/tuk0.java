package xsna;

import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoVideoAttachmentsCropData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditableData;
import com.vk.newsfeed.posting.impl.domain.model.PostEditingReason;
import com.vk.newsfeed.posting.impl.domain.model.PostingContext;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.presentation.model.GroupAdminLevel;
import com.vk.newsfeed.posting.impl.presentation.model.GroupPrivacyType;
import com.vk.newsfeed.posting.impl.presentation.model.GroupWallPostingSettings;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: StateUtils.kt */
/* loaded from: classes4.dex */
public final class tuk0 {
    public static final boolean a(PostingState postingState) {
        GroupWallPostingSettings groupWallPostingSettings = postingState.x().h;
        return groupWallPostingSettings != null ? groupWallPostingSettings.b && groupWallPostingSettings.e != GroupAdminLevel.MODERATOR : postingState.getContext().d || postingState.getContext().i;
    }

    public static final boolean b(PostingState.Editing editing, boolean z) {
        boolean z2;
        PostEditableData postEditableData = editing.j;
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData = PhotoVideoAttachmentsCropData.f;
        PostEditableData a = PostEditableData.a(postEditableData, null, null, null, null, null, null, null, photoVideoAttachmentsCropData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199);
        PostEditableData a2 = PostEditableData.a(editing.i, null, null, null, null, null, null, null, photoVideoAttachmentsCropData, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268435199);
        if (z) {
            a = PostEditableData.a(a, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268402687);
            a2 = PostEditableData.a(a2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 268402687);
        }
        PhotoVideoAttachmentsCropData photoVideoAttachmentsCropData2 = editing.i.j;
        List<ImageCropArea> d = com.vk.newsfeed.posting.impl.domain.model.c.d(photoVideoAttachmentsCropData2, photoVideoAttachmentsCropData2.e);
        if (!(d instanceof Collection) || !d.isEmpty()) {
            Iterator<T> it = d.iterator();
            while (it.hasNext()) {
                if (!((ImageCropArea) it.next()).i.a) {
                    z2 = false;
                    break;
                }
            }
        }
        z2 = true;
        return (a.equals(a2) && z2) ? false : true;
    }

    public static final boolean c(PostingState.Editing editing) {
        boolean z;
        boolean G = x19.G(editing.i.i);
        PostingContext postingContext = editing.c;
        boolean z2 = postingContext.c;
        PostEditingReason postEditingReason = editing.h;
        boolean Ja = postEditingReason.Ja();
        if (fkq0.b(postingContext.b.b)) {
            PostingSettings postingSettings = editing.d;
            if (postingSettings.f) {
                GroupWallPostingSettings groupWallPostingSettings = postingSettings.h;
                if ((groupWallPostingSettings != null ? groupWallPostingSettings.c : null) == GroupPrivacyType.OPEN) {
                    z = true;
                    return G && !(postEditingReason instanceof PostEditingReason.EditExistingPost) && (z2 || (z && !Ja));
                }
            }
        }
        z = false;
        if (G) {
        }
    }
}
