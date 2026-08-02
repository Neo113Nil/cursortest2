package xsna;

import android.net.Uri;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.api.analytics.PostingAttachmentInfo;
import com.vk.newsfeed.posting.impl.domain.model.ImageCropArea;
import com.vk.newsfeed.posting.impl.domain.model.PhotoTag;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.PostingState;
import com.vk.newsfeed.posting.impl.domain.model.WaitingActionTrigger;
import com.vk.newsfeed.posting.impl.domain.model.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.efc0;

/* compiled from: StatsFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class xyk0 {
    public final efc0.a a;
    public final ibc0 b;

    public xyk0(efc0.a aVar, ibc0 ibc0Var) {
        this.a = aVar;
        this.b = ibc0Var;
    }

    public final void a(PostingState postingState, PostingAction.Stats stats) {
        Object obj;
        Object obj2;
        boolean z = stats instanceof PostingAction.Stats.SendRemoveTag;
        ibc0 ibc0Var = this.b;
        if (z) {
            PostingAction.Stats.SendRemoveTag sendRemoveTag = (PostingAction.Stats.SendRemoveTag) stats;
            PhotoTag photoTag = sendRemoveTag.c;
            Integer num = photoTag.d;
            if (num != null) {
                Photo photo = sendRemoveTag.b;
                UserId userId = photoTag.c;
                int intValue = num.intValue();
                ibc0Var.u().J(new PostingAttachmentInfo(photo.e.b, photo.c, "market_" + userId + '_' + intValue, null, null, 24, null));
                return;
            }
            return;
        }
        boolean z2 = stats instanceof PostingAction.Stats.SendAttachPhoto;
        efc0.a aVar = this.a;
        if (z2) {
            aVar.a(new e.j.a((PostingAction.Stats.SendAttachPhoto) stats, WaitingActionTrigger.APPLY_CROP));
            return;
        }
        if (stats instanceof PostingAction.Stats.SendAttachPhotoVk) {
            aVar.a(new e.j.a((PostingAction.Stats.SendAttachPhotoVk) stats, WaitingActionTrigger.APPLY_CROP));
            return;
        }
        if (!(stats instanceof PostingAction.Stats.SendWaitingAnalytics)) {
            throw new NoWhenBranchMatchedException();
        }
        PostingState.Editing editing = postingState instanceof PostingState.Editing ? (PostingState.Editing) postingState : null;
        if (editing == null) {
            return;
        }
        Iterable iterable = editing.i.j.b;
        if (iterable == null) {
            iterable = EmptyList.b;
        }
        List<Pair<PostingAction, WaitingActionTrigger>> list = editing.s;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((Pair) obj3).j() == WaitingActionTrigger.APPLY_CROP) {
                arrayList.add(obj3);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PostingAction postingAction = (PostingAction) ((Pair) it.next()).d();
            if (postingAction instanceof PostingAction.Stats.SendAttachPhoto) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    Uri uri = ((PostingAction.Stats.SendAttachPhoto) postingAction).e;
                    Uri uri2 = ((ImageCropArea) obj).c;
                    if (uri2 != null && uri2.equals(uri)) {
                        break;
                    }
                }
                ImageCropArea imageCropArea = (ImageCropArea) obj;
                PostingAction.Stats.SendAttachPhoto sendAttachPhoto = (PostingAction.Stats.SendAttachPhoto) postingAction;
                ibc0Var.u().o(sendAttachPhoto.b, new o5a0(sendAttachPhoto.c, sendAttachPhoto.d, imageCropArea != null ? Integer.valueOf(imageCropArea.f) : null, imageCropArea != null ? Integer.valueOf(imageCropArea.g) : null));
            } else if (postingAction instanceof PostingAction.Stats.SendAttachPhotoVk) {
                PostingAction.Stats.SendAttachPhotoVk sendAttachPhotoVk = (PostingAction.Stats.SendAttachPhotoVk) postingAction;
                Integer num2 = sendAttachPhotoVk.c;
                PostingAttachmentInfo postingAttachmentInfo = sendAttachPhotoVk.b;
                Integer num3 = sendAttachPhotoVk.d;
                if (num2 == null || num3 == null) {
                    ibc0Var.u().A(postingAttachmentInfo, null);
                } else {
                    Iterator it3 = iterable.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj2 = it3.next();
                            if (agc0.b((ImageCropArea) obj2, sendAttachPhotoVk.e)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    ImageCropArea imageCropArea2 = (ImageCropArea) obj2;
                    ibc0Var.u().A(postingAttachmentInfo, new o5a0(sendAttachPhotoVk.c.intValue(), num3.intValue(), imageCropArea2 != null ? Integer.valueOf(imageCropArea2.f) : null, imageCropArea2 != null ? Integer.valueOf(imageCropArea2.g) : null));
                }
            }
        }
        aVar.a(new e.j.b(WaitingActionTrigger.APPLY_CROP));
    }
}
